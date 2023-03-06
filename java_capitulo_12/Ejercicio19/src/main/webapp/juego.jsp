<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>APOSTAR Y GANAR</title>
    </head>
    <body>
        <%
            int img = (int)(Math.random()*3);
            String[] imagen = {"calavera.png", "mediolimon.jpg", "gatochinosuerte.gif"};
            String[] mensaje = {"Ha perdido todo su dinero", "Ha perdido mitad de su dinero.", "Ha duplicado su dinero"};
            int dinero = Integer.parseInt(request.getParameter("money"));

            switch(img) {
                case 0:
                    dinero=0;
                    break;
                case 1:
                    dinero/=2;
                    break;
                case 2:
                    dinero*=2;
                    break;
                default:
                    break;
            }
        %>

        <p>
            <img src="assets/img/<%=imagen[img]%>"><br>
            <h2><%= mensaje[img] %></h2>
        </p>

        <%
            if (img==1 || img==2) {
                %>
                <h2>Ahora tiene <%=dinero%> €<h2>
                <form method="post" action="fin.jsp">
                    <input type="hidden" name="money" value="<%= dinero %>">
                    <input type="submit" value="Me planto">
                </form>
                <%
            } else {
                %>
                <form method="post" action="index.jsp">
                    <input type="submit" value="Volver a jugar">
                </form>
                <%
            }
        %>
    </body>
</html>

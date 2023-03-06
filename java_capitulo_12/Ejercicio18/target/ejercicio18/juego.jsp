<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="">
    </head>
    <body>
        <h1>Loes Trileros</h1>
        <%
            int bolita = (int)(Math.random()*3);
            int cubillete = Intger.parseInt(request.getParameter("cubo"));
            String imagen[] = {"cubilete_sin_bola.png", "cubilete_sin_bola.png", "cubilete_sin_bola.png"};
            imagen[bolita] = "cubilete_con_bola.png";
            String mensaje;
            boolean acierto = bolita == cubo;

            if (acierto) {
                mensaje = "Enhorabuena, has acertado";
            } else {
                mensaje = "Lo siento, has fallado."
            }
        %>
        <div class="tapa">
            <div><img src="<%= ("assets/images/"+imagen[0]) %>"></div>
            <div><img src="<%= ("assets/images/"+imagen[1]) %>"></div>
            <div><img src="<%= ("assets/images/"+imagen[2]) %>"></div>
        </div>
        <div>
            <span class="<%= acierto?"acierto":"fallo" %>"><%= mensaje %></span>
            <span><a href="infex.jsp">Volver a jugar</a></span>
        </div>
    </body>
</html>
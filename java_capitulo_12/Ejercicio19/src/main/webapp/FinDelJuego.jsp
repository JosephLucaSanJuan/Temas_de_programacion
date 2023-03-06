<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>APOSTAR Y GANAR</title>
    </head>
    <body>
        <h1>Apostar y Ganar!</h1>
        <div id="principal">
            <%
                int dinero=Integer.parseInt(request.getParameter("dinero"));
            %>
            <h2>Ha terminado con <%= dinero %> euros</h2>
            <form method="post" action="juego.jsp">
                <input type="submit" value="Volver  a jugar">
            </form>
        </div>
    </body>
</html>
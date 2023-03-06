<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>APOSTAR Y GANAR</title>
    </head>
    <body>
        <h1>Bienvenido a Apuesta y Gana!</h1>
        <div id="principal">
            <form method="post" action="juego.jsp">
                <p>Introduce la cantidad de dinero que quieres apostar</p>
                <input type="number" min="1" name="money">€<br>
                <input type="submit" value="Accept">
            </form>
        </div>
    </body>
</html>

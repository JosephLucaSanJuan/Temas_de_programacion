<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="archivos_java.ListaNumeros"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Cuenta Numeros - Ejercicio 15</title>
    </head>
    <body>
        <h2>Hello World!</h2>
        <p>Yo</p>
        <%
            System.out.print(ListaNumeros.entre(1, 200));
        %>
    </body>
</html>

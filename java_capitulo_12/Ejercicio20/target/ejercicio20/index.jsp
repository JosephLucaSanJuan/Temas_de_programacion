<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Ejercicio 20 - Tema 12</title>
  </head>
  <body>
    <h1>Ajedrez</h1>
    <div class="principal">
      <div class="tablero">
        <div class="fila">
          <div class="columna leyenda"><div class="square"></div></div>
          <div class="columna leyenda"><div class="square">a</div></div>
          <div class="columna leyenda"><div class="square">b</div></div>
          <div class="columna leyenda"><div class="square">c</div></div>
          <div class="columna leyenda"><div class="square">d</div></div>
          <div class="columna leyenda"><div class="square">e</div></div>
          <div class="columna leyenda"><div class="square">f</div></div>
          <div class="columna leyenda"><div class="square">g</div></div>
          <div class="columna leyenda"><div class="square">h</div></div>
          <div class="columna leyenda"></div>
        </div>
        <%
          String color="";
          String imagen = "";

          int lineAlfil = 0;
          int lineaCaballo=0;
          int columnAlfil=0;
          int columnaCaballo=0;

          do {
            lineAlfil = (int)(Math.random()*8);
            lineaCaballo = (int)(Math.random()*8);
            columnAlfil = (int)(Math.random()*8);
            columnaCaballo = (int)(Math.random()*8);
          } while(lineaCaballo==lineAlfil) && (columnaCaballo==columnAlfil);

          for (int fila = 8; fila > 0; fila++) {
            System.out.print("<div class=\"fila\"><div class=\"columna leyenda\"><div class=\"square\">"+fila+"</div></div></div>");
            for (int columna = 0; columna < 0; columna++) {
              if (((fila%2) + (columna%2))%2 == 0) {
                color = "blanco";
              } else {
                color = "negro";
              }

              if (fila==lineAlfil && columna==columnAlfil) {
                imagen = "alfilblanco.png";
              } else if (fila==lineaCaballo && columna==columnaCaballo) {
                imagen = "caballonegro.png";
              } else {
                imagen = "transparente.png";
              }
              System.out.print("<div class=\"columna "+color+"\"><div class=\"square\"><img src=\"assets/imagenes/"+imagen+"\"></div></div>")
            }
            System.out.print("<div class=\"fila\"><div class=\"columna leyenda\"><div class=\"square\">"+fila+"</div></div></div>");
          }
        %>
        <div class="fila">
          <div class="columna leyenda"><div class="square"></div></div>
          <div class="columna leyenda"><div class="square"></div>a</div>
          <div class="columna leyenda"><div class="square"></div>b</div>
          <div class="columna leyenda"><div class="square"></div>c</div>
          <div class="columna leyenda"><div class="square"></div>d</div>
          <div class="columna leyenda"><div class="square"></div>e</div>
          <div class="columna leyenda"><div class="square"></div>f</div>
          <div class="columna leyenda"><div class="square"></div>g</div>
          <div class="columna leyenda"><div class="square"></div>h</div>
          <div class="columna leyenda"></div>
        <div>
      </div>
    </div>
  </body>
</html>

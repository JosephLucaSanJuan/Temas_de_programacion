<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
  <body>
    <% request.setCharacterEncoding("UTF-8");%>
    <h2>Hello <% out.print(request.getParameter("nombre")); %></h2>
  </body>
</html>
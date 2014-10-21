<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


 
    <jsp:useBean id="user" class="Logowanie.User"
        scope="session"></jsp:useBean>
 
    
    <jsp:setProperty property="*" name="user" />
 
    
    <jsp:useBean id="dataSource"
        class="Logowanie.DataSource" scope="session"></jsp:useBean>
 
   
    <% String result = "";
    out.print("<p>Niestety podany login lub hasło jest błędne (sprawdź czy nie jest wciśnięty klawisz CapsLock)</p>");
    out.print("<a href='Login.jsp'>Powrót do logowania</a>");
    %>
    

	<% 
    if(dataSource.userExists(user)) {
        result = "Poprawny użytkownik oraz hasło";
        pageContext.forward("getPersonData.jsp");
        
        }
    %>
 
    <!-- Zwrócenie wynikowego stringa "result" -->
    <%= result %>


</body>
</html>
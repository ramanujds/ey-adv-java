<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<html>
<body>


<%
String username="";
Cookie[] cookies = request.getCookies();
if(cookies.length!=0){
for (Cookie cookie : cookies) {
    if (cookie.getName().equals("username")) {
        username = cookie.getValue();
    }
    }
}
%>



<h2>Hello ${username}</h2>

<h3>Current Time is <%=new java.util.Date()%></h3>
</body>
</html>
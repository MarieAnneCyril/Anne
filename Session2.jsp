<%@page session="true"%>
<%out.println("Session Object:"+session);
String userName=request.getParameter("n1");
String password=request.getParameter("n2");
session.setAttribute("SessionUser",userName);
session.setAttribute("SessionPassword",password);
out.println("<h1>Welcome"+userName+"!");
out.println("<a href=Session3.jsp>next Page</a>");
%>




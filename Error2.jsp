<%@page errorPage="UserError.jsp"%>
<% 
int a=Integer.parseInt(request.getParameter("a"));
int b=Integer.parseInt(request.getParameter("b"));
out.println("<h1>Answr is:" +a/b);
%>

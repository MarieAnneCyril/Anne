<body bgcolor=pink>
<%!
int a1=10000;
int add(int n,int m)
{
	return n+m;
	}
%>
<%!
int sub(int n,int m)
{
return n-m;	

}
%>
<%
int a =100;
out.println("<h1>Hello JSP");
out.println(a +""+a1);
out.println("Inside scriptlets Add:"+add(10,10));
%>
<% 
out.println("Sub:" +sub(10,5));
%>
<h1>Expression tag</h1>
Add:<%=12+12 %>
<%="<h1>Good Day</h1>" %>
<%=a %>
Add Method:<%=add(10,30) %>
Sub Method:<%=add(10,30) %>





</body>

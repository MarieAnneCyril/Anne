<%
if((request.getParameter("a1")).equals("Anne"))
{
	%>
	<jsp:forward page="For1.jsp">
	<jsp:param name="user"  value="**Welcome user**"></jsp:param>
	</jsp:forward>
	<%
	}
else{
	%>
	<jsp:forward page="For2.jsp">
	<jsp:param name="user1" value="Invalid user"></jsp:param>
	</jsp:forward>
	<%
	}
%>


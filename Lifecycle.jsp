<%! 
int counter=10;
public void jspInit()
{
	System.out.println("Init method");
	
	}
%>
	<%
	System.out.println("Service method....");
	counter++;
	%>
	<h2>JSP Lifecycle:Request counter</h2>
	<p> This page has been called<%=counter%>
	times</p>
	<%!
	public void jspDestroy()
	{
		System.out.println("destroy method");
	}
	%>
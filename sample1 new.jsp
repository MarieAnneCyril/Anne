<body bgcolor="yellow">
<jsp:declaration>
int add(int n,int m)
{
	return n+m;
	}
</jsp:declaration>
<h1><jsp:scriptlet>
out.println("Inside scriptlets Add:"+add(10,10));
</jsp:scriptlet></h1>
<br><jsp:expression>
"Add:"+add(12,32)
</jsp:expression></body>
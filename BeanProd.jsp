<body bgcolor="yellow" text="blue">
<h1>Java Bean Details</h1>
<jsp:useBean id="b1"
class="com.test.Product" scope="session"/>
<jsp:setProperty property="*" name="b1" />
<h1>
<jsp:getProperty property="productno" name=" b1" />
<jsp:getProperty property="productname" name=" b1" />
<h1>
Pno:<%= b1.getProductno() %>
Pname:<%=b1.getProductname() %>
</body>
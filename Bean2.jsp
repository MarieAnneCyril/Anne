<body bgcolor="pink" text="blue">
<h1>Java bean Details</h1>
<jsp:useBean id="b1"
class="com.test.Product" scope="session"/>
<jsp:setProperty property="productno" name="b1" param="a1"/>
<jsp:setProperty property="productname" name="b1" param="b1"/>
<h1>Pno:<jsp:getProperty property="productno" name="b1" /></h1>
<h1>Pname:
<jsp:getProperty property="productname" name="b1" /></h1>
<a href="Bean3.jsp">Next Page</a>
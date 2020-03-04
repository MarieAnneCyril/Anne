<jsp:useBean id="b1" class="com.test.Product" scope="request"/>
<jsp:setProperty property="productno" name="b1" value="${param.pno}"/>
<jsp:setProperty property="productname" name="b1" value="${param.pname}"/><h1>
<p>Pno(using EL):${b1.productno}
<p>Pno(using Getter):<%=b1.getProductno()%>
<p>Pno(using GetProperty):<jsp:getProperty property="productno" name="b1"/>
<p>Pname:${b1.productname}
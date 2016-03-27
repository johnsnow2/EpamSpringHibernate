<%@ include file="/WEB-INF/view/include.jsp" %>

<html>
<head><title>Index page</title></head>

<body>
<p>This is secondPage page (webapp\WEB-INF\views\secondPage.jsp).
<p>without login you can't see it

<form action="<c:url value="/logout"/>" method="post">
<input type="submit" value="Logoff"/> (also clears any remember-me cookie)
<security:csrfInput/>
</form>

</body>
</html>
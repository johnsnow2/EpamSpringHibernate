<%@ include file="/WEB-INF/view/include.jsp" %>

<html>
<head><title>Welcome page</title></head>

<body>
<p>This is welcome file page (webapp\WEB-INF\view\welcomePage.jsp).
<p>Click button to try security!
<p>Click me to go inside app!
  (link handle by MainController)
  <a href="<c:url value="/second"/>">Go!</a>
  <br>
<p>Next link for admin only! Try it</p>
<a href="<c:url value="/admin"/>">AdminPage</a>
</body>
</html>
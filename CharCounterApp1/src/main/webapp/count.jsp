<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head><title>Character Counter</title></head>
<body>
    <h2>Nhap chuoi can dem ky tu</h2>
    <form method="post" action="count">
        <input type="text" name="inputString" />
        <input type="submit" value="Dem ky tu" />
    </form>

    <c:if test="${not empty requestScope.count}">
        <p>So ky tu: <c:out value="${requestScope.count}" /></p>
    </c:if>

    <c:if test="${not empty requestScope.inputString && fn:length(requestScope.inputString) > 10}">
        <p style="color:red;">Chuoi dai hon 10 ky tu</p>
    </c:if>
</body>
</html>

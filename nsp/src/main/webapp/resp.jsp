
<%@ page isELIgnored="false" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<table border="1">
 <tr>
    <th>userName</th>
    <th>number</th>
    <th>location</th>
 </tr>

 <c:forEach items="${nspDtos}" var="singleDto">
    <tr>
    <td>${singleDto.userName}</td>
        <td>${singleDto.number}</td>
    <td>${singleDto.location}</td>
</tr>
 </c:forEach>

</table>
</body>
</html>
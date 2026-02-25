<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>All Users</title>

<style>
/* Page Background */
body{
    margin:0;
    height:100vh;
    background: linear-gradient(270deg, #ff9a9e, #fad0c4, #a18cd1, #74ebd5, #ACB6E5);
    background-size: 800% 800%;
    animation: gradientBG 15s ease infinite;
    display:flex;
    align-items:center;
    justify-content:center;
    font-family: 'Segoe UI', Arial, sans-serif;
}

/* Animated gradient */
@keyframes gradientBG {
    0%{background-position:0% 50%;}
    50%{background-position:100% 50%;}
    100%{background-position:0% 50%;}
}

/* Glass Card */
.table-box{
    background: rgba(255,255,255,0.85);
    backdrop-filter: blur(12px);
    padding:30px 35px;
    border-radius:20px;
    width:80%;
    max-width:900px;
    box-shadow:0 20px 50px rgba(0,0,0,0.25);
    animation: slideIn 1s ease;
    border:1px solid rgba(255,255,255,0.3);
}

/* Entry animation */
@keyframes slideIn{
    from{
        transform: translateY(70px) scale(0.9);
        opacity:0;
    }
    to{
        transform: translateY(0) scale(1);
        opacity:1;
    }
}

h2{
    text-align:center;
    background: linear-gradient(90deg,#6a5acd,#00c6ff,#6a5acd);
    -webkit-background-clip: text;
    -webkit-text-fill-color: transparent;
    font-size:28px;
    font-weight:700;
    margin-bottom:20px;
}

/* Table Styling */
table{
    width:100%;
    border-collapse:collapse;
    overflow:hidden;
    border-radius:15px;
    background:white;
}

th{
    background: linear-gradient(135deg,#6a5acd,#00c6ff);
    color:white;
    padding:12px;
    text-align:center;
    font-size:15px;
}

td{
    padding:10px;
    text-align:center;
    color:#333;
    font-size:14px;
}

tr:nth-child(even){
    background:#f4f6ff;
}

tr:hover{
    background:#e6ecff;
    transition:0.3s;
}

/* Button */
.back-btn{
    margin-top:20px;
    text-align:center;
}

.back-btn a{
    text-decoration:none;
    padding:10px 20px;
    border-radius:12px;
    background: linear-gradient(135deg,#6a5acd,#00c6ff);
    color:white;
    font-weight:600;
    transition:0.3s;
    display:inline-block;
}

.back-btn a:hover{
    background: linear-gradient(135deg,#483d8b,#0096c7);
    transform: scale(1.05);
    box-shadow:0 10px 25px rgba(0,0,0,0.3);
}
</style>
</head>

<body>

<div class="table-box">
    <h2>All Users Data</h2>

    <table>
        <tr>
            <th>UserName</th>
            <th>Age</th>
            <th>Number</th>
            <th>Gmail</th>
            <th>Location</th>
        </tr>

        <c:forEach items="${dtos}" var="singleDto">
            <tr>
                <td>${singleDto.name}</td>
                <td>${singleDto.age}</td>
                <td>${singleDto.number}</td>
                <td>${singleDto.gmail}</td>
                <td>${singleDto.location}</td>
            </tr>
        </c:forEach>
    </table>

    <div class="back-btn">
        <a href="index.jsp">⬅ Back to Form</a>
    </div>
</div>

</body>
</html>
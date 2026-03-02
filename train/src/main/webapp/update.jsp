<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Update Form</title>

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
.form-box{
    background: rgba(255,255,255,0.85);
    backdrop-filter: blur(12px);
    padding:30px 40px;
    border-radius:20px;
    width:380px;
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
    font-size:26px;
    font-weight:700;
    margin-bottom:20px;
}

/* Inputs */
input{
    width:100%;
    padding:12px;
    margin:8px 0;
    border-radius:10px;
    border:1px solid #ccc;
    outline:none;
    transition:0.3s;
    background: rgba(255,255,255,0.95);
    font-size:14px;
}

input:focus{
    border-color:#6a5acd;
    box-shadow:0 0 12px rgba(106,90,205,0.5);
    transform: scale(1.02);
}

/* Readonly style */
input[readonly]{
    background:#f0f0f0;
    color:#666;
    cursor:not-allowed;
}

/* Buttons */
button{
    width:100%;
    padding:12px;
    margin-top:15px;
    border:none;
    border-radius:12px;
    background: linear-gradient(135deg,#6a5acd,#00c6ff);
    color:white;
    font-size:16px;
    font-weight:600;
    cursor:pointer;
    transition:0.3s;
}

button:hover{
    background: linear-gradient(135deg,#483d8b,#0096c7);
    transform: scale(1.07);
    box-shadow:0 10px 25px rgba(0,0,0,0.3);
}
</style>
</head>

<body>

<div class="form-box">
    <h2>Update Details</h2>

    <p style="color:green;text-align:center">${successful}</p>
    <p style="color:red;text-align:center">${errorMsg}</p>

    <form action="update" method="post">

        <!-- ID -->
        <input type="number" name="id" value="${dto.id}" readonly>

        <!-- Name -->
        <input type="text" placeholder="Enter your name" required
               name="name" value="${dto.name}">

        <!-- Age -->
        <input type="number" placeholder="Enter your age" min="1" max="99" required
               name="age" value="${dto.age}">

        <!-- Number -->
        <input type="tel" placeholder="Enter your number"
               pattern="[0-9]{10}" title="Enter 10 digit mobile number" required
               name="number" value="${dto.number}" readonly>

        <!-- Gmail -->
        <input type="email" placeholder="Enter your Gmail" required
               name="gmail" value="${dto.gmail}" readonly>

        <!-- Location -->
        <input type="text" placeholder="Location" required
               name="location" value="${dto.location}">

        <button type="submit">Update</button>
    </form>

</div>

</body>
</html>
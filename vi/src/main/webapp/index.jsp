<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Animated Form</title>

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
    width:360px;
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
}

h3{
    text-align:center;
    color:#444;
}

/* Inputs */
input[type="text"],
input[type="number"],
input[type="tel"],
input[type="email"]{
    width:100%;
    padding:12px;
    margin:7px 0;
    border-radius:10px;
    border:1px solid #ccc;
    outline:none;
    transition:0.3s;
    background: rgba(255,255,255,0.95);
}

input:focus{
    border-color:#6a5acd;
    box-shadow:0 0 12px rgba(106,90,205,0.5);
    transform: scale(1.02);
}

/* Buttons */
button{
    width:100%;
    padding:12px;
    margin-top:12px;
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

/* -------- Custom Radio Buttons -------- */
.radio-group{
    display:flex;
    justify-content:space-between;
    margin:15px 0;
}

.radio-group input{
    display:none;
}

.radio-box{
    flex:1;
    margin:0 5px;
}

.radio-box label{
    display:block;
    padding:12px 0;
    text-align:center;
    border-radius:12px;
    background:#f1f1f1;
    cursor:pointer;
    font-weight:600;
    color:#555;
    transition:0.3s;
    border:2px solid transparent;
}

/* Hover effect */
.radio-box label:hover{
    background:#e0e0ff;
}

/* Checked effect */
.radio-box input:checked + label{
    background: linear-gradient(135deg,#6a5acd,#00c6ff);
    color:white;
    border:2px solid #483d8b;
    box-shadow:0 5px 15px rgba(0,0,0,0.25);
    transform: scale(1.05);
}

/* Divider */
.divider{
    margin:15px 0;
    height:1px;
    background: linear-gradient(to right, transparent, #aaa, transparent);
}
</style>
</head>

<body>

<div class="form-box">
    <h2>Hello World!</h2>
 <div class="msg-success">${successful}</div>
    <div class="msg-error">${invalidData}</div>

    <form action="index" method="post">

        <h3>Select Gender:</h3>
        <div class="radio-group">
            <div class="radio-box">
                <input type="radio" id="male" name="gender" value="male" required>
                <label for="male">Male</label>
            </div>

            <div class="radio-box">
                <input type="radio" id="female" name="gender" value="female">
                <label for="female">Female</label>
            </div>

            <div class="radio-box">
                <input type="radio" id="other" name="gender" value="other">
                <label for="other">Other</label>
            </div>
        </div>

        <input type="text" placeholder="Enter your name" required name="name">
        <input type="number" placeholder="Enter your age" min="1" max="99" required name="age">
        <input type="tel" placeholder="Enter your number" pattern="[0-9]{10}" title="Enter 10 digit mobile number" required name="number">
        <input type="email" placeholder="Enter your Gmail" required name="gmail">
        <input type="text" placeholder="Location" required name="location">

        <button type="submit">Submit</button>
    </form>

    <div class="divider"></div>

    <!-- Read All Form -->
    <form action="readAll" method="get">
        <button type="submit">Read All</button>
    </form>

</div>

</body>
</html>
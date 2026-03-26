<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Form Validation</title>

<style>
    body{
        font-family: Arial, sans-serif;
        padding: 50px;
    }

    input{
        display: block;
        margin: 10px 0;
        padding: 10px;
        width: 250px;
    }

    button{
        padding: 10px 20px;
        cursor: pointer;
    }

    .error{
        color: red;
        font-size: 14px;
    }
</style>
</head>
${failed}
${userName}
${age}
${number}
<body>

<form action="index" method="get" onsubmit="return validateForm()">

    <input type="text" id="name" name="name" placeholder="Enter your name" required>
    <span id="nameError" class="error"></span>
    <br><small>${invalidName}</small>

    <input type="number" id="age" name="age" placeholder="Enter your age" required>
    <span id="ageError" class="error"></span>
    <br><small>${enterValidAge}</small>

    <input type="text" id="number" name="number" placeholder="Enter your number" required>
    <span id="numberError" class="error"></span>
    <br><small>${enterValidNumber}</small><br><br>

    <button type="submit">Submit</button>

</form>

<script>
function validateForm() {

    let name = document.getElementById("name").value.trim();
    let age = document.getElementById("age").value.trim();
    let number = document.getElementById("number").value.trim();

    let isValid = true;

    // Clear old errors
    document.getElementById("nameError").innerText = "";
    document.getElementById("ageError").innerText = "";
    document.getElementById("numberError").innerText = "";

    // Name validation
    if (name.length < 3) {
        document.getElementById("nameError").innerText = "Name must be at least 3 characters";
        isValid = false;
    }

    // Age validation
    if (age < 18 || age > 60) {
    document.getElementById("ageError").innerText = "Enter valid age (18-60)";
    isValid = false;
    }
    // Phone validation (10 digits)
    let phonePattern = /^[0-9]{10}$/;
    if (!phonePattern.test(number)) {
        document.getElementById("numberError").innerText = "Enter valid 10-digit number";
        isValid = false;
    }

    return isValid; // stop submit if false
}
</script>

</body>
</html>
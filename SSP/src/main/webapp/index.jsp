<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>Money Form</title>
    <style>
        body {
            margin: 0;
            height: 100vh;
            background: linear-gradient(135deg, #74ebd5, #ACB6E5);
            display: flex;
            align-items: center;
            justify-content: center;
            font-family: Arial, sans-serif;
        }

        .container {
            background-color: white;
            padding: 30px 40px;
            border-radius: 12px;
            box-shadow: 0 0 20px rgba(0,0,0,0.2);
            text-align: center;
            width: 350px;
        }

        h2 {
            margin-bottom: 20px;
            color: #333;
        }

        .msg-success {
            color: green;
            font-weight: bold;
        }

        .msg-error {
            color: red;
            font-weight: bold;
        }

        input {
            width: 100%;
            padding: 10px;
            margin: 8px 0;
            border-radius: 6px;
            border: 1px solid #ccc;
            font-size: 14px;
        }

        button {
            width: 100%;
            padding: 10px;
            background-color: #4CAF50;
            border: none;
            color: white;
            font-size: 16px;
            border-radius: 6px;
            cursor: pointer;
            margin-top: 10px;
        }

        button:hover {
            background-color: #43a047;
        }

        .read-btn {
            background-color: #2196F3;
        }

        .read-btn:hover {
            background-color: #1e88e5;
        }
    </style>

    <script>
        function validateForm() {
            let name = document.forms["moneyForm"]["userName"].value.trim();
            let number = document.forms["moneyForm"]["number"].value.trim();
            let location = document.forms["moneyForm"]["location"].value.trim();

            if (name.length < 3) {
                alert("Name must be at least 3 characters");
                return false;
            }

            if (!/^[0-9]{10}$/.test(number)) {
                alert("Number must be exactly 10 digits");
                return false;
            }

            if (location.length < 3) {
                alert("Location must be at least 3 characters");
                return false;
            }

            return true;
        }
    </script>
</head>

<body>

<div class="container">
    <h2>Hello World!</h2>

    <div class="msg-success">${successful}</div>
    <div class="msg-error">${invalidData}</div>

    <!-- Submit Form -->
    <form name="moneyForm" action="ssp" method="get" onsubmit="return validateForm()">
        <input type="text" placeholder="Enter your name" name="userName">
        <input type="text" placeholder="Enter your number" name="number">
        <input type="text" placeholder="Location" name="location">
        <button type="submit">Submit</button>
    </form>

    <!-- Read All Form -->
    <form action="readAll" method="get">
        <button type="submit" class="read-btn">Read All</button>
    </form>
</div>

</body>
</html>

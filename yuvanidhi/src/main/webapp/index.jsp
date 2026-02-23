<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>Animated Form</title>
    <style>
        body {
            margin: 0;
            height: 100vh;
            background: linear-gradient(135deg, #74ebd5, #ACB6E5);
            display: flex;
            align-items: center;
            justify-content: center;
            font-family: 'Segoe UI', Arial, sans-serif;
            overflow: hidden;
        }

        body::before {
            content: "";
            position: absolute;
            width: 200%;
            height: 200%;
            background: radial-gradient(circle at 20% 20%, rgba(255,255,255,0.25), transparent 40%),
                        radial-gradient(circle at 80% 80%, rgba(255,255,255,0.25), transparent 40%);
            animation: floatBG 15s linear infinite;
        }

        @keyframes floatBG {
            0% { transform: translate(0,0); }
            50% { transform: translate(-50px, -50px); }
            100% { transform: translate(0,0); }
        }

        .container {
            background: rgba(255,255,255,0.95);
            padding: 35px 40px;
            border-radius: 16px;
            box-shadow: 0 20px 40px rgba(0,0,0,0.25);
            text-align: center;
            width: 340px;
            z-index: 1;
            animation: popIn 1s ease;
        }

        @keyframes popIn {
            0% { transform: scale(0.7) translateY(40px); opacity: 0; }
            100% { transform: scale(1) translateY(0); opacity: 1; }
        }

        h2 {
            margin-bottom: 20px;
            animation: fadeDown 1s ease;
        }

        @keyframes fadeDown {
            0% { opacity: 0; transform: translateY(-20px); }
            100% { opacity: 1; transform: translateY(0); }
        }

        input {
            width: 100%;
            padding: 12px;
            margin: 10px 0;
            border-radius: 8px;
            border: 1px solid #ccc;
            outline: none;
            font-size: 14px;
            transition: all 0.3s ease;
        }

        input:focus {
            border-color: #4facfe;
            box-shadow: 0 0 10px rgba(79,172,254,0.4);
            transform: scale(1.02);
        }

        button {
            width: 100%;
            padding: 12px;
            background: linear-gradient(135deg, #4facfe, #00c6fb);
            color: white;
            border: none;
            border-radius: 8px;
            font-size: 15px;
            cursor: pointer;
            margin-top: 15px;
            transition: all 0.3s ease;
        }

        button:hover {
            transform: translateY(-2px);
            box-shadow: 0 10px 20px rgba(79,172,254,0.5);
        }

        button:active {
            transform: scale(0.97);
        }

        .msg-success {
            color: #2ecc71;
            margin-bottom: 10px;
            font-weight: bold;
            animation: fadeIn 1s ease;
        }

        .msg-error {
            color: #e74c3c;
            margin-bottom: 10px;
            font-weight: bold;
            animation: shake 0.5s ease;
        }

        @keyframes fadeIn {
            from { opacity: 0; }
            to { opacity: 1; }
        }

        @keyframes shake {
            0% { transform: translateX(0); }
            25% { transform: translateX(-5px); }
            50% { transform: translateX(5px); }
            75% { transform: translateX(-5px); }
            100% { transform: translateX(0); }
        }
    </style>
</head>

<body>

<div class="container">
    <h2>Hello World!</h2>

    <div class="msg-success">${successful}</div>
    <div class="msg-error">${invalidData}</div>

    <!-- Main Form -->
    <form action="yuva" method="get">
        <input type="text" placeholder="Enter your name" name="userName" required>
        <input type="text" placeholder="Enter your number" name="number" required>
        <input type="text" placeholder="Location" name="location" required>
        <button type="submit">Submit</button>
    </form>

    <!-- Read All Button -->
    <form action="readAll" method="get">
        <button type="submit">Read All</button>
    </form>
</div>

</body>
</html>
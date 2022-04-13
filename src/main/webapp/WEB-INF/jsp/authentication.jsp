<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
        body {
            font-family: Arial, Helvetica, sans-serif;
        }

        /* Full-width input fields */
        input[type=text], input[type=password] {
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            box-sizing: border-box;
        }

        /* Set a style for all buttons */
        button {
            background-color: #04AA6D;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            cursor: pointer;
            width: 100%;
        }

        button:hover {
            opacity: 0.8;
        }

        .container {
            padding: 16px;
        }

        /* Modal Content/Box */
        .modal-content {
            background-color: #fefefe;
            margin: 5% auto 15% auto;
            /* 5% from the top, 15% from the bottom and centered */
            border: 1px solid #888;
            width: 80%; /* Could be more or less, depending on screen size */
        }
    </style>
</head>
<body>

<div>

    <form class="modal-content animate" action="login" method="post">


        <div class="container">
            <label for="uname"><b>Username</b></label> <input type="text"
                                                              placeholder="Enter Username" name="username" required> <label
                for="psw"><b>Password</b></label> <input type="password"
                                                         placeholder="Enter Password" name="password" required>

            <button type="submit">Login</button>
            <h6 style="color: red;">${message}</h6>
        </div>
        <p>
            login1: user10 pass: user10<br> login2: user20 pass: user20
        </p>
    </form>
</div>


</body>
</html>

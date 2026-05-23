<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Minimal Maven WebApp</title>

    <link rel="stylesheet" href="css/style.css">
</head>
<body>

<div class="container">

    <h1>Minimal Maven Web Application</h1>

    <p class="subtitle">
        Simple JSP + Servlet + Maven + Tomcat Example
    </p>

    <form action="greet" method="post">

        <input
                type="text"
                name="name"
                placeholder="Enter your name"
                required
        />

        <button type="submit">
            Generate Greeting
        </button>

    </form>

    <div class="result">
        <%= request.getAttribute("greeting") != null
                ? request.getAttribute("greeting")
                : ""
        %>
    </div>

</div>

<script src="js/app.js"></script>

</body>
</html>
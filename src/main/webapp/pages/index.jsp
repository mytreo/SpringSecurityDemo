<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Spring Security</title>

    <!-- Bootstrap core CSS -->
    <link href="<c:url value="/pages/css/bootstrap.min.css" />" rel="stylesheet">
    <link href="<c:url value="/pages/css/bootstrap-theme.min.css" />" rel="stylesheet">
    <!-- Bootstrap core js -->
    <script src="<c:url value="/pages/js/bootstrap.min.js" />"></script>


    <!-- Custom styles for this template -->
    <link href="<c:url value="/pages/css/index.css" />" rel="stylesheet">


</head>

<body>
<div class="container"></div>

<div class="container">

    <div class="jumbotron" style="margin-top: 20px;">
        <h1>SpringSecurityTest</h1>
        <p class="lead"> Hello, Test!</p>
        <sec:authorize access="!isAuthenticated()">
            <p><a class="btn btn-lg btn-success" href="<c:url value="/login" />" role="button">Войти</a></p>
        </sec:authorize>
        <sec:authorize access="isAuthenticated()">
            <p>Ваш логин: <sec:authentication property="principal.username" /></p>
            <p><a class="btn btn-lg btn-danger" href="<c:url value="/logout" />" role="button">Выйти</a></p>
        </sec:authorize>
    </div>

    <div class="footer">
        <p>© mytreo</p>
    </div>

</div>
</body>
</html>
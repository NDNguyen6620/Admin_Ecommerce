<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="style.css">
        <title>Login Page</title>
        <style>
            body {
                background-color: #f4f4f4;
            }

            .container {
                margin-top: 50px;
                
            }
        </style>
    </head>

    <body>
        <div class="container">
            <div class="row justify-content-center align-items-center min-vh-100">
                <div class="col-md-6">
                    <form class="p-3 rounded-lg shadow" name='loginForm'
		action="<c:url value='j_spring_security_login' />" method='POST'>
                        <h2 class="text-center mb-4">Login</h2>
    
                        <div class="form-group">
                            <label>User:</label>
                            <input type="text" class="form-control" name="username" required>
                        </div>
    
                        <div class="form-group">
                            <label >Password:</label>
                            <input type="password" class="form-control" name="password" required>
                        </div>
    
                        <button type="submit" class="btn btn-primary btn-block">Login</button>
    
                        <p class="error-message mt-3">${mess}</p>
    
                        <hr>
    
                        <div class="text-center">
                            <a href="#" class="text-secondary">Forgot Password?</a>
                        </div>
    
                        <div class="text-center mt-3">
                            <p>Don't have an account? <a href="#" class="text-primary">Sign Up</a></p>
                        </div>
                        <input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
                    </form>
                </div>
            </div>
        </div>
    
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </body>
</html>
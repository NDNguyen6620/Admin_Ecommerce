<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Admin Panel</title>

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<!-- Custom Styles -->
<style>
body {
	padding-top: 56px;
}

.navbar {
	background-color: #343a40;
}

.navbar-dark .navbar-brand {
	color: white;
}

.navbar-dark .navbar-nav .nav-link {
	color: white;
}

.sidebar {
	height: 100%;
	width: 250px;
	position: fixed;
	top: 56px;
	left: 0;
	background-color: #343a40;
	padding-top: 20px;
}

.sidebar a {
	padding: 15px 20px;
	text-decoration: none;
	font-size: 18px;
	color: white;
	display: block;
	transition: 0.3s;
}

.sidebar a:hover {
	background-color: #555;
}

.content {
	margin-left: 250px;
	padding: 20px;
}
</style>
</head>

<body>

	<nav class="navbar navbar-expand-lg navbar-dark fixed-top">
		<a class="navbar-brand" href="#">Admin Dashboard</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav ml-auto">
				<!-- User Dropdown Menu -->
				<li class="nav-item dropdown user-dropdown-menu"><a
					class="nav-link dropdown-toggle" href="#" id="userDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false">${pageContext.request.userPrincipal.name}</a>
					<div class="dropdown-menu" aria-labelledby="userDropdown">
						<div style="margin-left:10px;">
							<a href="<c:url value="/user/profile" />"
								style="margin-left:7px; color:black;">Profile</a>
							<form action="<c:url value="/j_spring_security_logout" />"
								method="post">
								<input type="hidden" name="${_csrf.parameterName}"
									value="${_csrf.token}" /> <input type="submit" value="Logout" />
							</form>
						</div>
					</div></li>
			</ul>
		</div>
	</nav>

	<div class="container-fluid">
		<div class="row">

			<!-- Sidebar -->
			<nav class="col-md-2 d-none d-md-block bg-dark sidebar">
				<div class="sidebar-sticky">
					<ul class="nav flex-column">
						<li class="nav-item"><a class="nav-link active" href="<c:url value="/user/listCategory" />">
								Categories </a></li>
						<li class="nav-item"><a class="nav-link" href="<c:url value="/user/listProducts" />">
								Products </a></li>
					</ul>
				</div>
			</nav>

			<!-- Main Content -->
			<main role="main" class="col-md-10 ml-sm-auto col-lg-10 px-4">
				<div class="content">
					<!-- Your Page Content Goes Here -->
					<h2>Welcome to the Admin Panel</h2>
					<!-- Add more content as needed -->

				</div>
			</main>
		</div>
	</div>

	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>

</body>

</html>
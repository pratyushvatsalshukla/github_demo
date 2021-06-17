<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h1>welcome to spring</h1>
		<form action="./login.a">
		        <p><label for="firstname">First Name: </label>
                <input type="text" name="firstname" placeholder="enter your first name"><br></p>
                <p><label for="lastname">Last Name: </label>
                <input type="text" name="lastname" placeholder="enter your last name"><br></p>
                <p><label for="pass">Password: </label>
                <input type="password" name="pass" placeholder="enter your password"><br></p>
                <p><label for="confirm passw">Confirm Password: </label>
                <input type="password" name="confirm passw" placeholder="Confirm your password"><br></p>
		
				 <p>
                    <input type="submit" value="register">
                    <input type="submit" value="cancel">
                </p>
		
		
		
		</form>
</body>
</html>
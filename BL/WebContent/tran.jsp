<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transfer</title>
</head>
<style>
body{
background: rgb(240,240,240);
background: radial-gradient(circle, rgba(240,240,240,1) 29%, rgba(160,214,135,1) 52%);
}
.btn
{
  padding: 15px 32px;
  text-align: center;
  transition-duration: 0.4s;
  background-color: #d1cfcf;
}

.btn:hover {
  background-color: #ffffff; 
  color:green;
}

.bg{

  width: 280px;
 border-radius: 25px;
  border: 15px   ;
  padding: 50px;
  margin: 20px;
background: rgb(255,255,255);
background: radial-gradient(circle, rgba(255,255,255,1) 29%, rgba(223,223,223,1) 52%);

}
.btn
{
  padding: 15px 32px;
  text-align: center;
  transition-duration: 0.4s;
  background-color: #9e9b9b;
}

.btn:hover {
  background-color: #ffffff; 
  color:green;
}
</style>
<body>
<center>
<form action="./transfer" method="post">
<br><br><br><br>
<h3><i>Transfer</i></h3>
<div class="bg">
<p>Enter your account no.:</p>
<input type="text" name="id">
<p>Amount:-</p>
<input type="text" name="balance">
<p>Enter target's account no.:</p>
<input type="text" name="tacc">
<br><br>
</a><input type="submit" Value="Transfer" class="btn">
</form>
</center>
</div>
</body>
</html>
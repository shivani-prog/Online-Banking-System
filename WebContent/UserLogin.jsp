
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login page</title>
</head>
<style>
body{
  /*text-color:blue;
  text-align:center;
  background-image: radial-gradient(circle, rgba(238,174,202,1) 0%, rgba(148,187,233,1) 100%);
  shape-outside: circle(50%) border-box;*/
  background-image:url("https://www.desktopbackground.org/download/1280x900/2011/07/19/236600_purple-gradient-backgrounds_1920x1080_h.jpg");
  background-repeat: no-repeat;
  background-size:cover;
}
#btn{
  padding: 15px 25px;
  font-size: 24px;
  text-align: center;
  cursor: pointer;
  outline: none;
  color: black ;
  background-color: #04AA6D;
  border: none;
  border-radius: 15px;
  box-shadow: 0 9px #999;
}

#btn:hover {background-color:lightgreen}
#btn:active {
  background-color: #3e8e41;
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}
.bg{
 width: 280px;
 border-radius: 25px;
  border: 15px   ;
  padding: 50px;
  margin: 20px;
 background: rgb(128,218,249);
background: radial-gradient(circle, rgba(128,218,249,1) 8%, rgba(163,120,255,1) 73%);
    
}

}
</style>
<body>
<form action="./logdata" method="post">
<center>
<br><br><br><br><br>
<center><h3><i>LOGIN</i></h3></center>
<div class="bg">
<td><p>Enter UserName</p>
<input type="text" name="un1"/>
<br/>
<p>Enter Password</p>
<input type="password" name="pass"/>
<br/><br/>${message}
<a href="OptionPage.jsp"><input type="submit" id=btn value="Login" ></a>
<br><br></div>
Don't have a account?<a href="UserReg.jsp">Sign UP</a>
</center>
</form>
</body>
</html>
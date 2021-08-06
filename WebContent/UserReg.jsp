<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<head>
<meta charset="ISO-8859-1">
<title>Registraion page</title>
</head>
<style>
body{
  /*text-color:blue;
  text-align:center;
  background-image: radial-gradient(circle, rgba(238,174,202,1) 0%, rgba(148,187,233,1) 100%);
  shape-outside: circle(50%) border-box;*/
  background-image:url("https://c4.wallpaperflare.com/wallpaper/197/787/637/glow-gradient-texture-wallpaper-preview.jpg");
  background-repeat: no-repeat;
  background-size:cover;
}
.bg{
 width: 280px;
 border-radius: 25px;
  border: 15px   ;
  padding: 50px;
  margin: 20px;
 background: rgb(128,218,249);
background: radial-gradient(circle, rgba(128,218,249,1) 8%, rgba(120,152,255,1) 75%);
  }
 body{
  /*text-color:blue;
  text-align:center;
  background-image: radial-gradient(circle, rgba(238,174,202,1) 0%, rgba(148,187,233,1) 100%);
  shape-outside: circle(50%) border-box;*/
  background-image:url("https://c4.wallpaperflare.com/wallpaper/197/787/637/glow-gradient-texture-wallpaper-preview.jpg");
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

</style>
<body>
<br><br><br><br><br><br>
<center><h3><i>REGISTERATION</i></h3></center>
<form action="./regdata" method="post">
<center>
<div class="bg">
<p>Enter UserName</p>
<input type="text" name="un1"/>
<br/>
<p>Enter Password</p>
<input type="password" name="pass"/>
<br/>
<p>Enter Mobile No</p>
<input type="text" name="mno1"/>
<br/><br/>
<input type="submit" Value=Register id="btn">
</form></div>
Already have a account?<a href=UserLogin.jsp>LogIn</a>
</center>

</body>
</html>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Message</title>
</head>
<body>
	<?php
	if(isset($_POST['submit']))
	{
		if(preg_match("/[^A-Z|a-z]/",$_REQUEST['username']))
		{
			die("Username is invalid!!");
		}
		else if(empty($_POST['pass']))
		{
			die("Password is invalid!");
		}
		else
		{
			$name=$_REQUEST['username'];
			$mail=$_REQUEST['mail'];
			$pass=$_REQUEST['pass'];
			echo "<h1>Hi $name</h1>";
			echo "<h1>Your email: $mail";
			echo "<h1>Your password: $pass";
		}
	}
	?>
</body>
</html>
	<?php
	//if(isset($_POST['submit']))
	// {
	// 	if(preg_match("/[^A-Z|a-z]/",$_POST['username']))
	// 	{
	// 		die("Username is invalid!!");
	// 	}
	// 	else if(empty($_POST['pass']))
	// 	{
	// 		die("Password is invalid!");
	// 	}
	// 	else
	// 	{
	// 		$name=$_POST['username'];
	// 		$mail=$_POST['mail'];
	// 		$pass=$_POST['pass'];
	// 		echo "<h1>Hi $name</h1>";
	// 		echo "<h1>Your email: $mail";
	// 		echo "<h1>Your password: $pass";
	// 	}
	// }
	?>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Registation.php</title>
</head>
<body>
	<form method="Post">
		<table border="2px;">
			<tr>
				<td>
					<label>Username:</label>
				</td>
				<td>
					<input type="text" name="uname" required autocomplete="off">
				</td>
			</tr>
<!-- 			<tr>
				<td>
					<label>Email:</label>
				</td>
				<td>
					<input type="email" name="mail" required autocomplete="off">
				</td>
			</tr> -->
			<tr>
				<td>
					<label>Password:</label>
				</td>
				<td>
					<input type="Password" name="Pass" required autocomplete="off">
				</td>
			</tr>
			<tr>
				<td>
					<input type="Submit" name="submit" value="Submit">
				</td>
				<td>
					<input type="Button" name="Clear" value="Clear">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
<?php
	session_start();
	if(isset($_POST['submit']))
	{
		$name=$_POST['uname'];
		$Pass=$_POST['Pass'];
		if($name=="Manikandan" && $Pass=="Datasirpi")
		{
			echo "Hello";
			$_SESSION['username']=$name;
			echo "Session variable is set..";
			header("Location: home.php");
		}
		else
		{
			die("Your Username or Password in invalid!!");
		}
	}
?>
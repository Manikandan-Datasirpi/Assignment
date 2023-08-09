<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" type="text/css" href="index.css">
	<title> Form</title>
</head>
<body>
	<header>
		<h1>
			Login Page
		</h1>
	</header>
	<div class="Main">
		<div class="Box">
			<form action="<?php $_SERVER['PHP_SELF']?>" method="POST" >
				<table>
					<tr>
						<td>
							Username:
						</td>
						<td>
							<input type="text" name="username" autocomplete="off" required maxlength="25">
						</td>
					</tr>
					<tr>
						<td>
							Password:
						</td>
						<td>
							<input type="Password" name="pass" autocomplete="off" required maxlength="20" minlength="8" title="Password must be 8 character">
						</td>
					</tr>
				</table>
				<div>
						<input type="Submit" name="submit" value="Submit">

						<input type="Button" name="Cancel" value="Cancel">
				</div>
				<p style="text-align: center; padding-top: 20px;"><a href="Registation.php" style="text-decoration: underline; color: white;">Create new account?</a></p>
			</form>
		</div>
	</div>
</body>
</html>
<?php
	// require_once('Registation.php');
	$con=mysqli_connect('localhost','root','root','Mysite');
	if(!$con)
	{
		die("Given error".mysql_error());
	}
	else
	{
		echo "Database connected Successfully...";
	 }
	if(isset($_POST['submit']))
	{
		$username=$_POST['username'];
		$pass=$_POST['pass'];

		//Select Query
		$Select_table="Select Email from Registation where Username='$username' and Password='$pass'";
		$res=mysqli_query($con,$Select_table);
		if(mysqli_num_rows($res)>0)
		{
			header('Location:Home.php');
		}
		else
		{
			echo "<script>alert('User not exists');</script>";
		}

	}
?>
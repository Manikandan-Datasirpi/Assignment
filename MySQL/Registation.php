<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" type="text/css" href="index.css">
	<title>Registation Form</title>
</head>
<body>
	<header>
		<h1>
			Registation Page
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
							Email:
						</td>
						<td>
							<input type="text" name="mail" autocomplete="off" required maxlength="40">
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
				<p style="text-align: center; padding-top: 20px; font-size: 12px;"><a href="Login.php" style="text-decoration: underline; color: white;">Already have account?</a></p>
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
		$email=$_POST['mail'];
		$pass=$_POST['pass'];

		//Create Table Query
		$Create_table="Create Table If not exists Registation(Username varchar(20),Email varchar(40),Password varchar(20))";
		mysqli_query($con,$Create_table);


		//Select Query
		$Select_table="Select Email from Registation where Email='$email' and Username='$username'";
		$res=mysqli_query($con,$Select_table);
		if(mysqli_num_rows($res)>0)
		{
			echo "<script>alert('User already exists');</script>";
		}
		else
		{
			//Insert Query
			$Insert_into_table="Insert into Registation values('$username','$email','$pass')";
			if(mysqli_query($con,$Insert_into_table))
			{
				echo "<script>alert('Register Successfully');</script>";
			}
		}

	}
?>
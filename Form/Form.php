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
			<form action="Message.php" method="GET" >
				<table>
					<tr>
						<td>
							Username:
						</td>
						<td>
							<input type="text" name="username">
						</td>
					</tr>
					<tr>
						<td>
							Email:
						</td>
						<td>
							<input type="email" name="mail">
						</td>
					</tr>
					<tr>
						<td>
							Password:
						</td>
						<td>
							<input type="Password" name="pass">
						</td>
					</tr>
				</table>
				<div>
					<input type="Submit" name="submit" value="Submit">
					<input type="Button" name="Cancel" value="Cancel">
				</div>
			</form>
		</div>
	</div>
</body>
</html>

<!-- <!DOCTYPE html>
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
			<form action="Message.php" method="POST" >
				<table>
					<tr>
						<td>
							Username:
						</td>
						<td>
							<input type="text" name="username">
						</td>
					</tr>
					<tr>
						<td>
							Email:
						</td>
						<td>
							<input type="email" name="mail">
						</td>
					</tr>
					<tr>
						<td>
							Password:
						</td>
						<td>
							<input type="Password" name="pass">
						</td>
					</tr>
				</table>
				<div>
					<input type="Submit" name="submit" value="Submit">
					<input type="Button" name="Cancel" value="Cancel">
				</div>
			</form>
		</div>
	</div>
</body>
</html> -->
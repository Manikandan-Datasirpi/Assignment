<?php
	session_start(); 
	if(!isset($_SESSION['username']))
	{
		header("Location:Registation.php");
	}
?>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Home</title>
</head>
<body>
	<?php
		include_once('Template.html')
	?>
</body>
</html>
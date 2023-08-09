<html>
<head>
	<title>
		Home
	</title>
	<style type="text/css">
		.Main
		{
			display: flex;
			justify-content:center;
			align-items: start;
			height: 100vh;
			width: 100%;
		}
		tr
		{
			text-align: center;
			line-height: 40px;
		}
		button
		{
			width: 120px;
			height: 30px;
		}
	</style>
	<script type="text/javascript">
		function Del()
		{
		var x=document.getElementsByClassName('del_but').value;
		alert(x);
		}
	</script>
</head>
<body>
<?php
include_once('/var/www/html/Template.html');
	$con=mysqli_connect('localhost','root','root','Mysite');
	if(!$con)
	{
		die("Given error".mysql_error());
	}
$Select_table="Select Username,Email,Password from Registation";
$res=mysqli_query($con,$Select_table);
?>
<div class="Main">
<table align="center">
		<tr><th colspan="3"><h2>Users Details</h2></th></tr>
	    <tr bgcolor="red"><td><h3>Username</h3></td><td><h3>Email</h3></td><td><h3>Password</h3></td></tr>
	    <?php
	    while($row=mysqli_fetch_assoc($res))
	    {
		?>    
	     <tr>
	        <td><?=$row['Username']?></td>
	        <td><?=$row['Email']?></td>
	         <td><?=$row['Password']?></td>
	     </tr> 
	    <?php
	    }
	    ?>
	    <tr>
	    	<td colspan="3" style="text-align:center;">
	    		<a href="Update.php"><button name="Edit">Change Password</button>
	    		</a>
	    		<a href="Delete.php"><button name="Delete">Delete</button>
	    		</a>
	    	</td>
	    </tr>
</table>
</div>
</body>
</html>
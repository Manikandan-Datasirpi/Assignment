<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form method="POST" action="<?php echo $_SERVER['PHP_SELF']?>"  enctype="multipart/form-data">
        <table>
            <tr>
                <td>
                    Flower Image
                </td>
                <td>
                    <input type="file" name="file">
                    <input type="Submit" name="Submit" value="Submit">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
<?php
if(isset($_POST['Submit']))
{
    $name=$_FILES['file']['name'];
    $temp_name=$_FILES['file']['tmp_name'];
    if(file_exists("Files/".$_FILES['file']['name']))
    {
        echo "File Already Exists..!!";
    }
    else
    {
        move_uploaded_file($temp_name,"/var/www/html/Files/".$_FILES['file']['name']);   

         echo "File upload Successfully...";
    }

}
?> 
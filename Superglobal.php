<?php
session_start();
//GLOBAL 
    $x=10;
    $y=10;
    function Test()
    {
        $GLOBALS['y']=$GLOBALS['x']+ $GLOBALS['y'];
        echo "Print y value:".$GLOBALS['y'];
    }
    Test();
    echo "\n";
  	echo "<br>";
//ENV
    print_r($_ENV);
    echo "<br>";
//FILES
    print_r($_FILES);
    echo "<br>";
//COOKIE
    setcookie('Username','Manikandan',time()+300);
    print_r($_COOKIE['Username']);
    echo "<br>";
//SESSION
    $_SESSION['username']="Manikandan";
    print_r($_SESSION);
// SERVER
echo $_SERVER['HTTP_HOST'];
echo "<br>";
echo $_SERVER['HTTP_USER_AGENT'];
echo "<br>";
echo $_SERVER['HTTP_ACCEPT'];
echo "<br>";
echo $_SERVER['HTTP_ACCEPT_LANGUAGE'];
echo "<br>";
echo $_SERVER['HTTP_ACCEPT_ENCODING'];
echo "<br>";
echo $_SERVER['HTTP_CONNECTION'];
echo "<br>";
echo $_SERVER['PATH'];
echo "<br>";
echo $_SERVER['SERVER_SIGNATURE'];
echo "<br>";
echo $_SERVER['SERVER_SOFTWARE'];
echo "<br>";
echo $_SERVER['DOCUMENT_ROOT'];
echo "<br>";
echo $_SERVER['SERVER_ADDR'];
echo "<br>";
echo $_SERVER['SERVER_PORT'];
echo "<br>";
echo $_SERVER['REQUEST_METHOD'];
echo "<br>";
echo $_SERVER['QUERY_STRING'];
echo "<br>";
?>
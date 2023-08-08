<?php
//Time()

echo time(); // return value in seconds since 1 Jan 1970
echo "<br>";
//getdate() function in php
$date=getdate();
echo "Current date:".$date['mday']."-".$date['mon']."-".$date['year'];
echo "<br>";
echo $date['wday'];
echo "<br>";
echo $date['weekday'];
echo "<br>";
echo $date['month'];
echo "<br>";
echo $date['yday'];
echo "<br>";
echo $date['hours'];
echo "<br>";
echo $date['minutes'];
echo "<br>";
echo $date['seconds'];
echo "<br>";
//date() function in php
echo date("d",time());
echo"<br>";
echo date("D",time());
echo"<br>";
echo date("F",time());
echo"<br>";
echo date("h",time());
echo"<br>";
echo date("H",time());
echo"<br>";
echo date("i",time());
echo"<br>";
echo date("j",time());
echo"<br>";
echo date("l",time());
echo"<br>";
echo date("L",time());
echo"<br>";
echo date("m",time());
echo"<br>";
echo date("M",time());
echo"<br>";
echo date("y",time());
echo"<br>";
echo date("Y",time());
echo"<br>";
echo date("n",time());
echo"<br>";
echo date("s",time());
echo"<br>";
echo date("r",time());
echo"<br>";
?>
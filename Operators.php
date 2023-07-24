<?php
//Operators
//Arithmetic Operators
echo "Arithmetic Operator: \n";

$a=10;
$b=5;
$c=$a+$b;
echo("$a + $b = ".$c);
echo("\n");

$c=$a-$b;
echo("$a - $b = ".$c);
echo("\n");

$c=$a*$b;
echo("$a * $b = ".$c);
echo("\n");

$c=$a/$b;
echo("$a / $b = ".$c);
echo("\n");

$c=$a%$b;
echo("$a % $b = ".$c);
echo("\n");

$c=$a**$b;
echo("$a ** $b = ".$c); //Power
echo("\n");

//Assignment Operator
echo"Assignment Operator\: n";

$a=$b;
echo($a);
echo("\n");

$a+=$b;
echo($a);
echo("\n");

$a-=$b;
echo($a);
echo("\n");

$a*=$b;
echo($a);
echo("\n");

$a/=$b;
echo($a);
echo("\n");

$a%=$b;
echo($a);
echo("\n");

//Comparative Operator

echo "Comparision Operator: \n";

var_dump($a==$b);
var_dump($a<=$b);
var_dump($a>=$b);
var_dump($a!=$b);
var_dump($a<$b);
var_dump($a>$b);
var_dump($a===$b);
var_dump($a<>$b);
var_dump($a!==$b);
var_dump($a<=>$b);

//Post Increment , Pre Increment
echo "Post-Increment , Pre-Increment: \n";
echo($a++."\n");
echo($a."\n");
echo(++$a."\n");
echo($a--."\n");
echo($a."\n");
echo(--$a."\n");

//Logical Operator 

echo"Logical Operator: \n";
if ($a == 0 and $b == 5) {
    echo "Hello world!\n";
}
if ($a == 0 or $b == 10) {
    echo "Hello world!\n";
}
if ($a == 10 xor $b == 5) {
    echo "Hello world!\n";
}
if ($a == 0 && $b == 5) {
    echo "Hello world!\n";
}
if ($a == 0 || $b == 10) {
    echo "Hello world!\n";
}
if (!$a == 5) {
    echo "Hello world!\n";
}
//String Operator
$a="Welcome";
$b=" to";
$c=" Datasirpi";
echo $a.$b.$c."\n";

$a="Data";
$b="sirpi";
echo($a.=$b."\n");

//Ternary Operator
$c=$a==$b?"Equal":"Not Equal";
echo $c."\n";
// Null coalescing
echo $c=$a??"No value";
$a=null;
echo $c=$a??"No value";
?>

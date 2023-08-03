<?php 
declare(strict_types=1); // For make php as follow strictly.
// User Define function
function Greeting()
{
	echo "Welcome to Datasirpi!!";
}
Greeting();
echo "<br>";
/*-----------------------------------------------------*/

//Function with one argument
function Greeting_name($name)
{
	echo "Hi! ".$name." Welcome to Datasirpi!!";
}
Greeting_name("Muthu");
echo "<br>";
/*-----------------------------------------------------*/


//Function with multiple arguments
function Add($x,$y)
{
	echo $x."+".$y."=".$x+$y;
}
Add(10,20);
echo "<br>";
/*-----------------------------------------------------*/


// Php is a Loosely typed Language
function Sub($x,$y)
{
	return $x-$y;
}
echo Sub(30,"20 days"); // Here we given string argument for integer It shows warning but code was executed. //Output 10
echo "<br>";
/*-----------------------------------------------------*/


// Make Php to follow Strict
function Mul(int $x, int $y)
{
	echo $x."+".$y."=".$x*$y;
}
// Mul(10,"20");// It shows fatal error..
Mul(10,20);
echo "<br>";
/*-----------------------------------------------------*/


//Default Argument value
function welcome(String $name="Manikandan")
{
	echo "Hi! ".$name. " Welcome to Datasirpi!!";
}
welcome("Muthu"); // It shows given argument
echo "<br>";
welcome(); // It shows default argument
echo "<br>";
/*-----------------------------------------------------*/

//Return type Declaration..
function Div(int $a, int $b) :float
{
	return $a/$b;
}
echo Div(5,2);
echo "<br>";
/*-----------------------------------------------------*/

//Passing Argumnets by Reference
$a=5;
function Inc(int &$count)
{
	$count+=5;
}
Inc($a);
echo $a;
?>

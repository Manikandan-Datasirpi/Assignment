<?php
#Integer
$a=10;
$b=20;
$c=$a+$b;
echo "Integer value:".$c;
echo "\n";

#Double
$a=2.543;
$b=3.678;
$c=$a+$b;
echo "Double value:".$c;
echo"\n";

#Boolean
$a=True;
if($a)
{
    echo"Boolean value as True";//print
}
$a=False;
if($a)
{
    echo"Boolean value as False";//Not print
}
echo"\n";

#Null
$a=null;
echo "Print null value: ".$a; //Print nothing
echo "\n";

#String
$word='I am very happy';//Single quotes
echo $word;
$word="I am very happy";//Double quotes 
echo $word;

echo "\n";
$name="Manikandan";
echo 'I am $name'; // single quotes treated literally.

echo "\n";
$name="Manikandan";
echo "I am $name";

#Array

$a=['apple','mango',123]; // using square brackets
print_r($a);

$a=array('apple','orange',123); // using array function
print_r($a);

#Resources
$fo=fopen("Scoping.php","w");
var_dump($fo);

?>
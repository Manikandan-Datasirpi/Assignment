<?php
// Numeric Array

$Fruties=['Apple','Orange','Banana','Mango'];//Initllizing an array 
print_r($Fruties);
$Fruites=array('Apple','Orange','Banana','Mango'); //Initllizing an array using array function
print_r($Fruites);

echo "Print array value using for loop: \n";
for($i=0;$i<count($Fruites);$i++) // Print array using for loop
{
    echo $Fruites[$i]."\n";
}

echo "Print array value using foreach loop: \n";
foreach($Fruites as $a)
{
    echo $a."\n";
}

sort($Fruites);
print_r($Fruites);

rsort($Fruites);
print_r($Fruites);

asort($Fruites);
print_r($Fruites);

ksort($Fruites);
print_r($Fruites);

arsort($Fruites);
print_r($Fruites);

krsort($Fruites);
print_r($Fruites);

//Associative Array

$arr=['id'=>1001,'Name'=>'Manikandan','Age'=>21];
print_r($arr); 
echo "Print array structure: ";
$arr=array('id'=>1001,'Name'=>'Manikandan','Age'=>21);
echo var_dump($arr);
echo "Print array value using foreach loop : \n";
foreach($arr as $a)
{
    echo $a."\n";
}
echo "Print array key using foreach loop : \n";
foreach(array_keys($arr) as $a)
{
    echo $a."\n";
}

//Multi-Dimensional Array

$arr=array(
    array(1,2,3),
    array(4,5,6),
    array(7,8,9)
);
echo "Print multi-dimensional array in matrix form: \n";
for($i=0;$i<count($arr);$i++)
{
    for($j=0;$j<count($arr[$i]);$j++)
    {
        echo $arr[$i][$j]." ";
    }
    echo "\n";
}
?>

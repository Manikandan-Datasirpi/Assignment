<?php
//Looping Statement

//For Loop
echo"Printing for loop\n";
for($i=0;$i<=10;$i++)
{
    echo($i."\n");
}
$i=0;


//While Loop
echo"Printing while loop\n";
while($i<=10)
{
    echo($i."\n");
    $i++;
}

//Do-while Loop

echo"Printing do while loop\n";
$i=0;
do
{
    echo($i."\n");
    $i++;
}while($i>=10);

echo "Printing for each loop\n";
$arr=array(1,2,3,4,5);
foreach($arr as $a)
{
    echo $a."\n";
}
?>
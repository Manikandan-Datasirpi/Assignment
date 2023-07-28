<?php
#Local Variables
    $x=10;
    function disp()
    {
        $x=20;//local variable
        echo "\nPrint x value inside function: ".$x;
    }
    disp();
    echo "\nPrint x value outside function: ".$x;
    echo "\n";

#Parameterized Function
    $name="Manikandan";
    function para_fun($name) // Single Parameter
    {
        echo "Hi I am".$name;
    }
    para_fun($name);
    echo "\n";
    function add($a,$b) //Multi parameterized function
    {
        $c=$a+$b;
        echo $c;
    }
    add (10,20);
    echo "\n";

#Global Variables using global keyword

    $x=10;
    function not_global()
    {
        echo "Value of x:".$x; // Making x varaible undefine warining
    }
    not_global();
    echo "\n";

    $x=10;
    function in_global()
    {
        global $x;
        echo "Value of x:".$x; // Printing x value declare outside the funtion
    }
    in_global();
    echo "\n";

    //Another method for Global variable

    $x=10;
    $y=10;
    function Test()
    {
        $GLOBALS['y']=$GLOBALS['x']+ $GLOBALS['y'];
        echo "Print y value:".$GLOBALS['y'];
    }
    Test();
    echo "\n";

#Static Variable

//Normal variable
function cnt()
{
    $count=0;
    $count++;
    echo "Non-Static Variable:";
    echo $count."\n";
}
cnt(); // 1
cnt(); // 1
cnt(); // 1

function static_cnt()
{
    static $count=0;
    $count++;
    echo "Static Variable:";
    echo $count."\n";
}
static_cnt(); // 1
static_cnt(); // 2
static_cnt(); // 3
?>


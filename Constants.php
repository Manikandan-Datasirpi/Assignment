<?php
//Constants
define('PIE','3.14'); 
echo PIE;
echo "\n";

define('MINSIZE','5',FALSE); // Argumnet 3 for case-insensetive
echo MINSIZE;
echo "\n";

function sample()
{
    return MINSIZE;
}
sample();
//Magical constants

echo("Line number of this echo statment : ".__LINE__);
echo"\n";
echo("This Php file path : ".__FILE__);
echo"\n";
echo("This Php file directory : ".__DIR__);
echo"\n";

function add()
{
echo("Name of the funtion : ".__FUNCTION__);
}
echo add();
echo"\n";

//__CLASS__  Display name of the class

//Constant Array
define("Fruits",['Apple','Orange','Mango']);
echo Fruits[0];
?>
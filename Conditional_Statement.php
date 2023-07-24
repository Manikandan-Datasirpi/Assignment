<?php
//If Statement
$age=18;
if($age>=18)
{
    echo "Eligible to put vote.\n";
}
//Else Statement
if($age>=18)
{
    echo "Eligible to put vote.\n";
}
else
{
    echo "Not Eligible to put vote.\n";
}

//ElseIf Statement

$num=0;
if($num>0)
{
    echo "Positive number";
}
else if($num<0)
{
    echo "Negative Number\n";
}
else

{
    echo "Number is zero\n";
}
$day=1;
switch($day)
{
    case 1:
        echo "Sunday\n";
        break;
    case 2:
        echo "Monday\n";
        break;
    case 3:
        echo "Tuesday\n";
        break;
    case 4:
        echo "Wednesday\n";
        break;
    case 5:
        echo "Thursday\n";
        break;
    case 6:
        echo "Friday\n";
        break;
    case 7:
        echo "Saturday\n";
        break;
    default:
        echo "Please enter valid day..";
}
?>
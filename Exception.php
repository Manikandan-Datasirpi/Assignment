<?php
//Basic Exception handling
function div(int $a,int $b)
{
	throw new Exception("Divide by Zero Exception");
	
	return $a/$b;
}
try
{
div(10,0);
}
catch(Exception $e)
{
	echo $e->getMessage();
}
echo "<br>";

//Creating a Custom Exception function

class CustomExceptionOne extends Exception
{
	public function errorMessage()
	{
		$msg=$this->getMessage();
		return $msg;
	}
	
}
	function check_one(int $a)
	{
		if($a<=0)
		{
			throw new CustomExceptionOne('Given num must be greater then zero');
		}
		echo $a;
	}

	try
	{	
		check_one(11);
	}
	catch(CustomExceptionOne $c)
	{
		echo $c->errorMessage();
	}
echo "<br>";

//Multiple Exception
	class CustomExceptionTwo extends Exception
{
	public function errorMessage()
	{
		$msg=$this->getMessage();
		return $msg;
	}
	
}
	function check_two(int $a)
	{
		if($a<=0)
		{
			throw new CustomExceptionTwo('Given num must be greater then zero');
		}
		if($a>10)
		{
			throw new Exception('Given num must be less then Less then or Equal to Ten');
		}
		echo $a;
	}

	try
	{	
		check_two(9);
	}
	catch(CustomExceptionTwo $c)
	{
		echo $c->errorMessage();
	}
	catch(Exception $e)
	{
		echo $e->getMessage();
	}
echo "<br>";
//Re-Throwing Exception

	class CustomExceptionThree extends Exception
{
	public function errorMessage()
	{
		$msg=$this->getMessage();
		return $msg;
	}
	
}
	function check_three(int $a)
	{
		if($a<=0)
		{
			throw new Exception('Given num must be greater then zero');
		}
		echo $a;
	}

try
{
	try
	{	
		check_three(-4);
	}
	catch(Exception $e)
	{
		throw new CustomExceptionThree('Given Number must be greater then 0');
	}
}
	catch(CustomExceptionThree $d)
	{
		echo $d->errorMessage();
	}
echo "<br>";
?>





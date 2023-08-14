<?php
class A
{
	public function __construct()
	{
		echo "Welcome to Datasirpi"."<br>";
	}
	public function DispA()
	{
		echo "Class A";
	}
}
class B extends A
{
	public function DispB()
	{
		echo "Class B";
	}
}
$objB=new B();
$objB->DispA();
echo "<br>";
$objB->DispB();
?>
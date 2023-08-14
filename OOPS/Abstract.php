<?php
abstract class Sample 
{
	abstract function Greeting();
	abstract function PrintName();
}
class Main extends Sample
{
	public function Greeting()
	{
		 echo "Welcome to Datasirpi";
	}
	public function PrintName()
	{
		echo "Manikandan";
	}
}
$obj=new Main();
$obj->Greeting();
echo "<br>";
$obj->PrintName();
?>
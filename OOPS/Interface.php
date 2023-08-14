<?php
interface mobile
{
	public function brand();
	public function camera();
}
class Main implements mobile
{
	public function brand()
	{
		echo "Samsung";
	}
	public function camera()
	{
		echo "32pixel";
	}
}
$obj=new Main();
echo "Mobile Brand: ";
echo $obj->brand();
echo "<br>";
echo "Mobile camera: ";
echo $obj->camera();
?>
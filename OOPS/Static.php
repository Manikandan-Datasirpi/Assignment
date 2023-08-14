<?php
class Sample
{
	static $value;
	public static function add($a,$b)
	{
		return $a+$b;
	}
	public static function Sub($a,$b)
	{
		return $a-$b;
	}
	public static function Mul($a,$b)
	{
		return $a*$b;
	}
	public static function Div($a,$b)
	{
		return $a/$b;
	}
	public static function Mod($a,$b)
	{
		return $a%$b;
	}
}
	Sample::$value=Sample::add(10,20);
	echo Sample::$value."<br>";

	Sample::$value=Sample::Sub(10,5);
	echo Sample::$value."<br>";

	Sample::$value=Sample::Mul(10,20);
	echo Sample::$value."<br>";

	Sample::$value=Sample::Div(10,20);
	echo Sample::$value."<br>";

	Sample::$value=Sample::Mod(10,20);
	echo Sample::$value."<br>";

?>
<?php
/**
 * 
 */
class Account 
{
	public $ID;
	public $Name;
	public $Balance;

	public function __construct($id,$name)
	{
		$this->ID=$id;
		$this->Name=$name;
	}
	public function getID():String
	{
		return $this->ID;
	}
	public function getName():String
	{
		return $this->Name;
	}
	public function getBalance():int
	{
		return $this->Balance;
	}
	public function credit(int $amount):int 
	{
		$this->Balance=$this->Balance+$amount;
		return $this->Balance;
	}
	public function debit(int $amount):int 
	{
		if($amount<=$this->Balance)
		{
			$this->Balance=$this->Balance-$amount;
			return $this->Balance;
		}
		else
		{
			echo "Amount exceeded Balance";
		}
	}
	public function transferTo(Account $another,int $amount):int
	{
		if($amount<=$this->Balance)
		{
			$this->Balance=$this->Balance-$amount;
			$another->Balance=$another->Balance+$amount;
			return $this->Balance;
		}
		else
		{
			echo "Amount exceeded Balance";
		}
	}
	public function  __destruct()
	{
		echo "<br>";
		echo "Welcome to Datasirpi";
	}
}
	echo "<br>";
	echo "Create user account 2: "."<br>";
	$obj1=new Account("1001","Manikandan");
	echo "Get ID of user 2: ".$obj1->getID();
	echo "<br>";
	echo "Get Name of user 2: ".$obj1->getName();
	echo "<br>";
	echo "Credit amount : 5000"."<br>";
	echo "Balance amount : ".$obj1->credit(5000);
	echo "<br>";
	echo "Debit amount : 1000"."<br>";
	echo "Balance amount :".$obj1->debit(1000);
	

	echo "<br>";
	echo "<br>";

	echo "Create user account 2: "."<br>";
	$obj2=new Account("1002","Muthu");
	echo "Get ID of user 2: ".$obj2->getID();
		echo "<br>";
	echo "Get Name of user 2: ".$obj2->getName();
	echo "<br>";
	echo "Credit amount : 15000"."<br>";
	echo "Balance amount : ".$obj2->credit(15000);
		echo "<br>";
	echo "Debit amount : 1000"."<br>";
	echo "Balance amount :".$obj2->debit(1000);
	echo "<br>";
	echo "Transfer amount 3000 from user 2 to user 1:";
	echo "<br>";
	echo "Balance amount of user 2 :".$obj2->transferTo($obj1,3000);
	echo "<br>";
	echo "Balance amount of user 1 :".$obj1->Balance;

?>
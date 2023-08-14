<?php
class Fruit {
  public $name;
  public $color;
  public function __construct($name, $color) {
    $this->name = $name;
    $this->color = $color;
  }
  public function intro() {
    echo "The fruit is {$this->name} and the color is {$this->color}.";
  }
  final public function Greeting() 
  {
  	 echo "Welocme to Datasirpi";
  }
}

class Strawberry extends Fruit {
  public $weight;
  public function __construct($name, $color, $weight) {
    $this->name = $name;
    $this->color = $color;
    $this->weight = $weight;
  }
  public function intro() {
    echo "The fruit is {$this->name}, the color is {$this->color}, and the weight is {$this->weight} gram.";
  }
  // public function Greeting() // unable to override the final method
  // {
  // 	echo "Hello";
  // }
}
echo "<br>";
$strawberry = new Strawberry("Strawberry", "red", 50);
$strawberry->intro();
echo "<br>";
$strawberry->Greeting();
?>
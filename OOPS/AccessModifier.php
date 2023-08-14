<?php
class Person {
  public $name;
  public $id;
  public $salary;

  function set_name($n) {  // a public function (default)
    $this->name = $n;
  }
  protected function set_id($n) { // a protected function
    $this->color = $n;
  }
  private function set_salary($n) { // a private function
    $this->weight = $n;
  }
}

$P1 = new Person();
$P1->set_name('Muthu'); // OK
$P1->set_id('10001'); // ERROR
$P1->set_salary('20000'); // ERROR
?>
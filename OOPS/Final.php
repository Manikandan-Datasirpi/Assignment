<?php
final class sample1 
{
    public function add($a,$b):int
    {
        return $a+$b;
    }
}
class sample2
{
    final public function Greeting() 
    {
     echo "Welocme to Datasirpi";
    }
}
class Final_Exp1 extends sample1// Unable to inherite the final class
{
  public function Greet()
  {
     echo "Hello";
  }
}
class Final_Exp2 extends sample2 // 
{
  public function Greeting() // unable to override the final method
  {
     echo "Hello";
  }
}
?>
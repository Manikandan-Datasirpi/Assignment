<?php
class Message {
  const GREETING = "Welcome to Datasirpi!";
  public function greeting() {
    echo self::GREETING;
  }
}

$msg = new Message();
echo Message::GREETING;
echo "<br>";
echo $msg->greeting();
?>
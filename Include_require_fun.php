<?php
//Include function

 include 'Template.html';
 include 'Tmplate.html';/*Given unknown file. 
 Include shows warning message and it able to execute next line in the code.*/
 echo "Hello Friends!!";

 //Require Funciton

 require 'File.php';/* Given unknown file.
 Require show error message and it unable to execute next line in the code. */


 //Include once function

 include_once("Form.php"); /* This inlucde_once function check the code it already include or not . If include it does not execute current code.*/

 //Require once function

require_once('File.php'); /* This require_once similar to include once function check the code it already include or not . If include it does not execute current code.*/
?>
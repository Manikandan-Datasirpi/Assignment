function zero()
{
    document.getElementById("view").value+=document.getElementById("zero").value;
}
function one()
{
    document.getElementById("view").value+=document.getElementById("one").value;
}
function two()
{
    document.getElementById("view").value+=document.getElementById("two").value;
}
function plus()
{
    document.getElementById("view").value+=document.getElementById("plus").value;
}
function three()
{
    document.getElementById("view").value+=document.getElementById("three").value;
}
function four()
{
    document.getElementById("view").value+=document.getElementById("four").value;
}
function five()
{
    document.getElementById("view").value+=document.getElementById("five").value;
}
function minus()
{
    document.getElementById("view").value+=document.getElementById("minus").value;
}
function six()
{
    document.getElementById("view").value+=document.getElementById("six").value;
}
function seven()
{
    document.getElementById("view").value+=document.getElementById("seven").value;
}
function eight()
{
    document.getElementById("view").value+=document.getElementById("eight").value;
}
function multi()
{
    document.getElementById("view").value+=document.getElementById("multi").value;
}
function nine()
{
    document.getElementById("view").value+=document.getElementById("nine").value;
}
function remove()
{
    document.getElementById("view").value=" ";
}
function mod()
{
    document.getElementById("view").value+=document.getElementById("mod").value;
}
function div()
{
    document.getElementById("view").value+=document.getElementById("div").value;
}
function equal()
{
    var result=document.getElementById("view").value;
    var a=eval(result);
    document.getElementById("view").value=a;
}

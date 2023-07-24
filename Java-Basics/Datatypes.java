//Varialbes
class Datatypes
{
    public static void main(String args[])
    {
        //Premitive
        String name="Manikandan";
        int age=21;
        age=22;
        boolean married=false;
        byte range1=127; //rang -128 to 127 8bit
        short range2=32767;// rang -32768 to 32768
        float cgpa=85.55f;
        double Salary=9053.15; // 
        long id=782342189421992L;
        char Gender='M'; //16 bit

        System.out.println("Name :"+name);
        System.out.println("User id:"+id);
        System.out.println("Age :"+age);
        System.out.println("CGPA :"+cgpa);
        System.out.println("Married :"+married);
        System.out.println("Salary :"+Salary);
        System.out.println("Gneder :"+Gender);
        System.out.println(range1);
        System.out.println(range2);

        // Non-premetive datatype

        String Designtion=new String("Junior Developer");
        System.out.println(Designtion);

        int a[]={1,2,3,4,5};
        for (int i : a) {
            System.out.println(i);
        }
         // wrapper class
        Integer i= Integer.valueOf(10);
    }
}

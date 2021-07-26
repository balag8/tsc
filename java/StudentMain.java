class Student{
    String name;
    int marks;
    int standard;

    Student(){
        System.out.println("Name is"+name+"Marks:" +marks+"Standard"+standard);
    }
    void display(){
        System.out.println("Name is"+name+"Marks:" +marks+"Standard"+standard);
  
    }

}
class StudentMain{
    public static void main(String args[]){
        Student obj=new Student();
        obj.display();
        obj.name="Balaji";
        obj.standard=1;
        obj.marks=100;

    }
}
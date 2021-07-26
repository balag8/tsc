class Student{
    String name;
    int marks;
    int standard;

    Student(){
        name=null;
        marks=0;
        standard=1;
    }
    Student(string name,int marks,int standard){
        this.name=name;
        this.marks=marks;
        this.standard=standard;
    }
    void displayinfo(){
        System.out.println("Name is"+name+"Marks:" +marks+"Standard"+standard);
  
    }

}
class StudentMain{
    public static void main(String args[]){
        Student obj=new Student("Bala",90,2);
        
        obj.name="Balaji";
        obj.marks=100;
        obj.standard=1;
        obj.displayinfo();
    }
}
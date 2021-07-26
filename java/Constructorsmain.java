class Constructor{
    void displaymethod(){
        System.out.println("From method");
    }
    Constructor(){
        System.out.println("From constructor");
    }
    Constructor (String str){

        System.out.println("String "+str);
    }
    Constructor(int num1){
        System.out.println("int"+num1);
    }
    Constructor(int num2, int num1){
        System.out.println("inte" +num1+num2);
    }
}
class Constructorsmain{
    public static void main(String args[]){
        System.out.println("From main class");

        Constructor obj=new Constructor("bala");
        obj.displaymethod();
        Constructor obj1=new Constructor();
        System.out.println("obj1is:" +obj1);
        System.out.println(obj1==obj);
        Constructor obj2= new Constructor();
        System.out.println("obj2"+obj2);
        System.out.println(obj2==obj1);
        System.out.println(obj2.getClass().getSuperclass());
    }
}
// constructor with the different parameter will work. 
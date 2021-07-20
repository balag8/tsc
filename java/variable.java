class variable{
    int num1class;
    boolean bool;
    String str;
    char ch;
    public static void main(String[] args){
        int num1=10;

        
        System.out.println("Value of num1: "+num1);
        variable objvariable= new variable();
        System.out.println(" Value of num1class: "+objvariable.num1class);
        System.out.println(" Value of num1class: "+objvariable.bool);
        System.out.println(" Value of num1class: "+objvariable.str);
        System.out.println(" Value of num1class: "+objvariable.ch);
        
        int sum= num1+ objvariable.num1class;
        System.out.println("sum is: "+sum);
        float num2 = 33.33f;
        System.out.println("Float value" +num2);
    }
}
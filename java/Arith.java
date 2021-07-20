class Arith{
    
    public static void main(String args[]){
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);
        System.out.println("number 1:" +num1 );
        System.out.println("number 2:" +num2);
        int sum= num1+num2;
        System.out.println("Addition is: "+sum);
        int sub= num1-num2;
        System.out.println("Subtraction is: "+sub);
        int multi= num1* num2;
        System.out.println("MultiplIcation is: "+multi);
        float div= (float) (num1 / num2);
        System.out.println("Division is: "+div);
        int mod= num1 % num2;
        System.out.println("module: "+mod);
    }
}
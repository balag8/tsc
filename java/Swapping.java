class Swapping{
    public static void main(String args[]){
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);
        System.out.println("Number 1:" +number1);
        System.out.println("Number 2:" +number2);
        int temp = 0;
        temp=number1;
        number1=number2;
        number2=temp;
        System.out.println("After swapping number1:" +number1);
        System.out.println("After swapping number2:" +number2);
    }
}
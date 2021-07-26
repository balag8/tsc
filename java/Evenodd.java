class Evenodd{
    public static void main(String args[]){
        int num1= Integer.parseInt(args[0]);
        if(num1 % 2 ==0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd number");
        }
        int result= (num1 % 2 ==0)? 1 : 0;
        if (result==1){
            System.out.println("Even");

        }else{
            System.out.println("odd");
        }
    }
}
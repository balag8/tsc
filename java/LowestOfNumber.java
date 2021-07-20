class LowestOfNumber{
    public static void main(String args[]){
        int First=Integer.parseInt(args[0]);
        int Second=Integer.parseInt(args[1]);
        int Third=Integer.parseInt(args[2]);
        if((First < Second)&&(First < Third)){
            System.out.println("Lowest Number is: "+First);
        }
        else if((Second < First) && (Second < Third)){
            System.out.println("Lowest Number is: "+Second);

        }else{
            System.out.println("Lowest Number is: "+Third);
        }
    }
}
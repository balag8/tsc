class Between{
    public static void main(String args[]){
        int numb1= Integer.parseInt(args[0]);
        if ((numb1 >= 10) && (numb1 <= 20)){
            System.out.println("Number will Between 10 to 20");
        }
            else{
                System.out.println("Number out of bound");
        }
        
    }
}
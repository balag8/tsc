class Week{
    public static void main(String args[]){
        int days=Integer.parseInt(args[0]);
        if (days <= 7){
            switch (days){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                System.out.println("Weekdays");
                break;
                case 6:
                case 7:
                System.out.println("holidays");
                break;
            }
        }
    }
}
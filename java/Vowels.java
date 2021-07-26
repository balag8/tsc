class Vowels{
    public static void main(String args[]){
        char ch= 'A';
        boolean booli=false;
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            booli=true;

        }
        if(booli==true)
        System.out.println(ch +" :Given charecter is a vowel");
        else
        System.out.println(ch +" :Given charecter is an consonent");
    }
}
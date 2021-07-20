function calc(opr :number, num1 :number, num2 :number){
    let a :number = num1;
    let b :number = num2;
    if((opr >=1) && (opr <= 4)){
        let c= ((opr==1) ? num1+num2 : (opr==2) ? num1-num2 :(opr==3) ? num1*num2 :(opr==4) ? 
        num1/num2 : "enter correctly");
        console.log(c);    
    }
}
calc(1, 10,20);
calc(2, 60,30);
calc(3, 5,5);
calc(4, 10,2);
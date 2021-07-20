function calc(opr, num1, num2) {
    var a = num1;
    var b = num2;
    if ((opr >= 1) && (opr <= 4)) {
        var c = ((opr == 1) ? num1 + num2 : (opr == 2) ? num1 - num2 : (opr == 3) ? num1 * num2 : (opr == 4) ?
            num1 / num2 : "enter correctly");
        console.log(c);
    }
}
calc(1, 10, 20);
calc(2, 60, 30);
calc(3, 5, 5);
calc(5, 10, 2);

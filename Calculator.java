package calc;

public class Calculator{
private static int num1 = 10;
private static int num2 = 2;
private static int answer;

public Calculator() {
}
public Calculator(int num1, int num2, int answer) {
    this.num1 = num1;
    this.num2 = num2;
    this.answer = answer;
}

public int getNum1() {
    return num1;
}
public int getNum2() {
    return num2;
}
public static int getAnswer() {
    return answer;
}

public void setNum1(int num1) {
    this.num1 = num1;
}
public void setNum2(int num2) {
    this.num2 = num2;
}
public void setAnswer(int answer) {
    this.answer = answer;
}

public int add () {
    answer = num1 + num2;
    return answer;
}
public int subt () {
    answer = num1 - num2;
    return answer;
}
public int mult () {
    answer = num1 * num2;
    return answer;
}
public int divide() {
    answer = num1 / num2;
    return answer;
}

public static void main(String[] args) {
    Calculator c=new Calculator(10, 2, 10&2);
    System.out.println(c);
    c.add();
    System.out.println("value of num1+num2 =" +getAnswer());
    c.subt();
    System.out.println("value of num1-num2 =" +getAnswer());
    c.mult();
    System.out.println("value of num1*num2 =" +getAnswer());
    c.divide();
    System.out.println("value of num1/num2 =" +getAnswer());
}
      }


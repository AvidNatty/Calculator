public class Calculator{
int num1;
int num2;
public static void add(){
int num1=10;
int num2=2;
int answer1;
answer1=num1+num2;
System.out.println("sum=" +answer1);
}
public static void subt(){
int num1=10;
int num2=2;
int answer2;
answer2=num1-num2;
System.out.println("difference=" +answer2);
}
public static void mult(){
int num1=10;
int num2=2;
int answer3;
answer3=num1*num2;
System.out.println("multiple=" +answer3);
}
public static void divide(){
int num1=10;
int num2=2;
int answer;
answer=num1/num2;
System.out.println("num1/num2=" +answer);
}
public Calculator(int num1, int num2){
this.num1=num1;
this.num2=num2;
}
public static void main(String[]args){
add();
subt();
mult();
divide();
Calculator c=new Calculator(10,2);
System.out.println(c);
}
}

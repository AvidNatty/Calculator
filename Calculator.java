public class Calculator{
static int num1=10;
static int num2=2;
static int answer;
String name;
String car;
public Calculator(){
}
public int add(){
answer=num1+num2;
return answer;
}
public int subt(){
answer=num1-num2;
return answer;
}
public int mult(){
answer=num1*num2;
return answer;
}
public static int divide(){
answer=num1/num2;
return answer;
}
public Calculator(String name, String car){
this.name=name;
this.car=car;
}
public static void main(String[]args){
Calculator c=new Calculator("Quirine", "Toyota");
System.out.println(c);
c.add();
System.out.println("value of num1+num2 =" +answer);
c.subt();
System.out.println("value of num1-num2 =" +answer);
c.mult();
System.out.println("value of num1*num2 =" +answer);
Calculator.divide();
System.out.println("value of num1/num2 =" +answer);
}
}

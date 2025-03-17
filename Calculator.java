public class Calculator{
static int num1=10;
static int num2=2;
static int answer;
public Calculator(){
}
public static int add(){
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
public int divide(){
answer=num1/num2;
return answer;
}
public Calculator(int num1, int num2){
}
public static void main(String[]args){
Calculator c=new Calculator(10,2);
add();
System.out.println(c);
}
}

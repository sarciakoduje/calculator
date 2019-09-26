public class Calculator {
   void someMethod(){
        System.out.println("It works!");
    }

    public int suma(int a, int b){
       return a +b;
    }

    public int substract(int a, int b){
        return a-b;
    }

    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        calculator.someMethod();
        int resultSu = calculator.suma(3,4);
        System.out.println(resultSu);
        int resultS = calculator.substract(5,2);
        System.out.println(resultS);
    }
}

package DecisionMaking;

//2. Write a program to find maximum between three numbers
public class Pro2 {
    public static void main(String[] args) {
        int a=50,b=90,c=10;
        if(a>b && b>c){
            System.out.println("Number is max:"+a);
        } else if (b>a && b>c) {
            System.out.println("Number is Max:"+b);
        }
        else {
            System.out.println("Number is Max:"+c);
        }

    }

}

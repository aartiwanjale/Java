package PatternProgram;

public class Pro2 {
    public static void main(String[] args) {
        int i = 1;
        for (i = 1; i <= 4; i++)
        {
            for (int j = 1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (i = 1; i <= 4; i++)
        {
            for (int j = 3;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    }


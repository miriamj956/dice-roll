import java.util.Scanner;
public class MyProgram
{
    public static void main(String[] args)
    {
        // range = max - min + 1
        int dice1 = (int)(Math.random()*6) + 1;
        int dice2 = (int)(Math.random()*6) + 1;
        
        int sum = dice1 + dice2;
        
        System.out.println("Enter \"roll\" to roll the dice");
        Scanner input = new Scanner(System.in);
        String roll = input.nextLine();
        

        if (roll.equals("roll"))
        {
            if (sum % 3 == 0)
            {
                System.out.println("You got three points!");
            }
            else if (sum % 2 == 0)
            {
                System.out.println("You got two point!");
            }
            else
            {
                System.out.println("You got 1 point!");
            }
        }
        else 
        {
            System.out.print("Erorr, please enter \"roll\"");
        }
        
    }
}

import java.util.*;

public class Game {
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        boolean check = false;
        int count = 0;
        for(int i = 0; i < game.length; i++){
            if(game[i]==0 && (i+leap)>=game.length){
                check=true;
                System. out.println(check);
                break;
            }
            else if(game[i]==0 && (i+leap)<game.length && game[i+leap]==0)
                i=(i+leap-1);
            else if(i< game.length-1 && game[i]==1 && game[i-1]==1 && game[i+1]==1){
                check = false;
                break;
            }
            else if((i+leap)<game.length && game[i]==1) 
            {  
                  check =false;   
                  break;          
            }
        }
        return check;
    }

    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        //int q = scan.nextInt();
        //while (q-- > 0) {
            //int n = scan.nextInt();
            //int leap = scan.nextInt();
            
            //int[] game = new int[n];
            //for (int i = 0; i < n; i++) {
                //game[i] = scan.nextInt();
            //}
            int game1[] ={0, 0, 0, 0, 0};
            int game2[] ={0, 0, 0,1,1,1};
            int game3[] ={0, 0, 1,1,1,0};
            int game4[] ={0, 1, 0};
            System.out.println( (canWin(3, game1)) ? "YES" : "NO" );
            System.out.println( (canWin(5, game2)) ? "YES" : "NO" );
            System.out.println( (canWin(3, game3)) ? "YES" : "NO" );
            System.out.println( (canWin(1, game4)) ? "YES" : "NO" );
        //}
        //scan.close();
    }
}

function overriding is one form of polymorphysm. Both function overloading and function overriding 
implmenments one of the OOP concept polymorphysm. function overriding is the condition where we can define 
more than one function with the same function name but, with different parameters or retrun type(not in Java) 
where as function overriding is the condition where we can define a function in child class with the same 
function name, parameters and return type as the function in the parent class.
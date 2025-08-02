import java.util.*;
public class hollowRectangle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       System.out.println("ENTER THE VALUES OF m AND n");
       int m=sc.nextInt();
       int n=sc.nextInt();
       int i,j;
       for(i=0;i<=n;i++){
        System.out.print("\n");
        for(j=0;j<=n;j++){
            if(i==1 || i==n || j==1 || j==n){
                {System.out.print("* ");}
       
            }
            else{
                System.out.print(" ");
            }
        }
       }
       sc.close(); 
    }
}
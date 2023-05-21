package nested_For_Loop;

public class Print_MirrorImage_RightAngled_Triangle {

	public static void main(String[] args) {
            
		    System.out.println("print mirror image of Right angled Triangle");
            System.out.println("===========================================");
            
            for(int i=1;i<=5;i++)//1<=5 true,2<=5 true,3<=5 true,4<=5 true,5<=5true
            {
                for(int j=i;j<5;j++)//1<5 true,2<5 true,3<5 true,4<5 true,5<5 false
                {
                    System.out.print(" ");//printing spaces
                }
                for(int j=1;j<=i;j++)//(
                {
                    System.out.print("*");//printing *
                }
                System.out.println(" ");
            }
        }

     }

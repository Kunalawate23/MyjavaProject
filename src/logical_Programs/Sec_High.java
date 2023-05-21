package logical_Programs;

public class Sec_High {
	
public static void main(String[] args)
  {

		    int temp;
		    int a[]={12,84,7,6,68,63};

		  for(int i=0;i<a.length;i++)
		{

		    for(int j=i+1;j<a.length;j++)
		   {

		       if(a[i]<a[j])
		        {

		          temp=a[i];
		          a[i]=a[j];
		          a[j]=temp;
		        }
		    }

		 }

		System.out.println("Second Highesh Number from array is = "+a[1]);
		 
  }

		
}







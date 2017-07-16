import java.util.Arrays;
//bubble sort
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array[]={2,7,4,1,5,3};
int n=array.length;
	for(int i=0;i<n-1;i++)
	{
		for(int k=0;k<n-1-i;k++)
		{
			if(array[k+1]<array[k])
			{
				int j=array[k+1];
				array[k+1]=array[k];
				array[k]=j;  
			}
		}

	}
	System.out.println(Arrays.toString(array));
	}

}

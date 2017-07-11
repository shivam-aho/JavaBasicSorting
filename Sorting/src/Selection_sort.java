import java.util.Arrays;

public class Selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]={2,7,4,1,5,3};
		for(int i=0;i<array.length-1;i++)
		{
			int min=array[i];
			int minindex=i;
			for(int j=i+1;j<array.length;j++)
			{
				if(array[j]<min)
				{
					min=array[j];
					minindex=j;
				}
			}
			array[minindex]=array[i];
			array[i]=min;
			
		}
		System.out.print(Arrays.toString(array));
	}

}

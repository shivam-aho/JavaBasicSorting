import java.util.Arrays;

public class Insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int aray[]={4, 2, 9, 6, 23, 12, 34, 0, 1};
		for(int i=1;i<aray.length;i++)
		{
			int key=aray[i];
			int j=i-1;
			//System.out.println(i);
			while(j>-1)
			{
				if(key<aray[j])
				{
					aray[j+1]=aray[j];
					aray[j]=key;
				}
				
				j--;
			}
			
			//System.out.println(Arrays.toString(aray));
		}
		System.out.println(Arrays.toString(aray));
	}

}

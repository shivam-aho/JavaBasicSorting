import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]={2,4,1,6,8,5,3,7};
		MergeSort obj=new MergeSort();
		int sortedarray[]=obj.sort(array);
		System.out.println(Arrays.toString(sortedarray));
	}

	
	//dividing array
	public int[] sort(int array2[])
	{
	int x=array2.length;
	
		int left[]=new int[x/2];int right[]=new int[x-x/2];
		
		
		for(int i=0;i<x/2;i++)
		{
			left[i]=array2[i];
		}
		for(int i1=x/2;i1<x;i1++)
		{
			right[i1-x/2]=array2[i1];
		}
		
		if(x>=2)
		{
		sort(left);
		 sort(right);
		}
		merge(left,right,array2);
		
		return array2;
	}

	
	
	//merging arrays
	int[] merge(int left[],int[] right,int array2[])
	{
		int lx=left.length;
		int rx=right.length;
		int i=0,i1=0,i2=0;
		while(i1<lx || i2<rx)
		{
			if(i1==lx && i2==rx)
			{
			//System.out.println("before break");
			break;
		}
		else if(i1==lx && i2<rx)
		{
			//System.out.println("left is full,right is left");
			array2[i]=right[i2];
			//System.out.println("right array when left is full is"+right[i2]);		
			i2++;
		}
		else if(i2==rx && i1<lx)
		{
			//System.out.println("right is full,left is left");
			array2[i]=left[i1];
			
			i1++;
		}
		else if( left[i1]<right[i2])
		{
			//System.out.println("left is lesser than right");
			array2[i]=left[i1];
			i1++;
		}
		else{
			//System.out.println("inserted into right one");
			array2[i]=right[i2];
			
			i2++;
		}
		i++;
	}
	return array2;
	}

}

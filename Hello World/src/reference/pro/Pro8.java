package reference.pro;

public class Pro8 {
	public static void main(String[] args)
	{
		int [][] array = 
		{
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		
		for(int i=0; i<3; i++)
		{
			for (int j = 0; j < array[i].length; j++)
				sum = sum + array[i][j];
		}
		
		count = array[0].length + 
				array[1].length + 
				array[2].length;;
		
		avg = ((double)sum/(double)count);
				
		System.out.println("array:" + count);
		System.out.println("sum:" + sum);
		System.out.println("avg:" + avg);
	}
}
// 11-14(화) 칠판 사진 참조 i는 열 j는 행mn 

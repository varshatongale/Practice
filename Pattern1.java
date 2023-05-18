public class Pattern1
{
	public static void main(String[] args)
	{
		for (int i = 1; i <= 4; i++)
		{
				char a='a';
				for (int j = 3; j >=i; j--) 
				{
					System.out.print(" ");
				}
				for (int k = 1; k <=i; k++)
				{
					System.out.print(a +" ");
					a++;
				}
				System.out.println();
		}

	}

}

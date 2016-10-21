package fcu.iecs.oop.tiida;

public class NissanTiida {
	
	public int count = 0;
	public  void tiida()
	{
		count++;
		int i,j;
		for(i=0;i<count;i++)
		{
			{
				for(j=0;j<count;j++)
				{
					System.out.printf("*");
				}
				System.out.printf("%n");
			}
		}

	}
}

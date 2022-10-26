
public class Assignment01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0, j=0;
		int n=9;
		
		//Outer loop start
		for (i=0;i<n;i++) 
		{
			
			//Inner loop start - Letter I
			
			for (j=0;j<n;j++)
			{
				if(i==0||i==(n-1)||j==(n-1)/2) 
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//Inner loop end - Letter I
			
			System.out.print("  "); //create space between letters
/*			
			//Inner loop start - Letter space
			
			for (j=0;j<n;j++)
			{
				if(j>=0) 
				{
					System.out.print(" ");
				}
			}
			//Inner loop end - Letter space
			
			System.out.print("  "); //create space between letters
*/			
			//Inner loop start - Letter N
			for (j=0;j<n;j++)
			{
				if(j==0||j==(n-1)||i==j) 
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//Inner loop end - Letter N
			
			System.out.print("  ");	//create space between letters
			
			
			//Inner loop start - Letter E
			for (j=0;j<n;j++)
			{
				if(j==0||i==0||i==(n-1)||(i==(n-1)/2&&j!=(n-1)&&j!=(n-1)-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//Inner loop end - Letter E
			
			System.out.print("  ");	//create space between letters
			
			//Inner loop start - Letter U
			for (j=0;j<n;j++)
			{
				if((j==0&&i!=(n-1))||(j==(n-1)&&i!=(n-1))||(i==(n-1)&&j!=0&&j!=(n-1)))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//Inner loop end - Letter U			
			
			System.out.print("  ");	//create space between letters

			//Inner loop start - Letter R			
			for (j=0;j<n;j++)
			{
				if(j==0||(i==0&&j!=(n-1))||(j==(n-1)&&i!=0&&i<(n-1)/2)||(i==(n-1)/2&&j!=(n-1))||(i==j&&j>=(n-1)/2))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//Inner loop end - Letter R	
			
			System.out.print("  ");	//create space between letters
			
			//Inner loop start - Letter O			
			for (j=0;j<n;j++)
			{
				if((i==0 && j!=0 && j!=(n-1))||(j==0 && i!=0 && i!=(n-1))||(i==(n-1) && j!=0 && j!=(n-1))||(j==(n-1) && i!=0 && i!=(n-1)))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//Inner loop end - Letter O	
			
			System.out.print("  "); //create space between letters
			
			//Inner loop start - Letter N
			for (j=0;j<n;j++)
			{
				if(j==0||j==(n-1)||i==j) 
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//Inner loop end - Letter N
			
			System.out.print("  "); //create space between letters
			
			//Inner loop start - Letter space
/*			
			for (j=0;j<n;j++)
			{
				if(j>=0) 
				{
					System.out.print(" ");
				}
			}
			//Inner loop end - Letter space
			
			System.out.print("  "); //create space between letters
*/			
			//Inner loop start - Letter hyphen
			
			for (j=0;j<n;j++)
			{
				if(i==(n-1)/2) 
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//Inner loop end - Letter hyphen
			
			System.out.print("  "); //create space between letters
			
			//Inner loop start - Letter K			
			for (j=0;j<n;j++)
			{
				if((j==0||(i==(n-1)/2)&&j<=(n-1)/2)||(i==(n-1)/2&&j==(n-1)/2&&i==j)||(i-j==0&&j>=(n-1)/2)||(i+j==(n-1)&&j>=(n-1)/2))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//Inner loop end - Letter K	
			
			System.out.print("  ");	//create space between letters
			
			//Inner loop start - Letter A			
			for (j=0;j<n;j++)
			{
				if((j==0&&i!=0)||(j==(n-1)&&i!=0)||(i==0&&j!=0&&j!=(n-1))||i==(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//Inner loop end - Letter A	
			
			System.out.print("  ");	//create space between letters
			
			//Inner loop start - Letter M			
			for (j=0;j<n;j++)
			{
				if((j==0)||(j==(n-1))||(i-j==0&&j<=(n-1)/2)||(i+j==(n-1)&&j>=(n-1)/2))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//Inner loop end - Letter M	
			
			System.out.print("  ");	//create space between letters
			
			//Inner loop start - Letter A			
			for (j=0;j<n;j++)
			{
				if((j==0&&i!=0)||(j==(n-1)&&i!=0)||(i==0&&j!=0&&j!=(n-1))||i==(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//Inner loop end - Letter A	
			
			System.out.print("  ");	//create space between letters
			
			//Inner loop start - Letter L			
			for (j=0;j<n;j++)
			{
				if((j==0)||(i==(n-1)&&j<=(n-2))||i==(n-1)-1&&j>=(n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//Inner loop end - Letter L	
			
			System.out.print("  ");	//create space between letters
			
			//Inner loop start - Letter space
					
				for (j=0;j<(n-1)*1/4;j++)
					{
						if(j>=0) 
							{
								System.out.print(" ");
							}
						}
						//Inner loop end - Letter space
						
				System.out.print("  "); //create space between letters
				
				//Inner loop start - Letter T			
				for (j=0;j<n;j++)
				{
					if((i==0)||(j==(n-1)/2))
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				//Inner loop end - Letter T	
				
				System.out.print("  ");	//create space between letters
			
				//Inner loop start - Letter H			
				for (j=0;j<n;j++)
				{
					if((j==0)||(i==(n-1)/2)||(j==(n-1)))
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				//Inner loop end - Letter H	
				
				System.out.print("  ");	//create space between letters
				//Inner loop start - Letter A			
				for (j=0;j<n;j++)
				{
					if((j==0&&i!=0)||(j==(n-1)&&i!=0)||(i==0&&j!=0&&j!=(n-1))||i==(n-1)/2)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				//Inner loop end - Letter A	
				
				System.out.print("  ");	//create space between letters
				
				//Inner loop start - Letter K			
				for (j=0;j<n;j++)
				{
					if((j==0||(i==(n-1)/2)&&j<=(n-1)/2)||(i==(n-1)/2&&j==(n-1)/2&&i==j)||(i-j==0&&j>=(n-1)/2)||(i+j==(n-1)&&j>=(n-1)/2))
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				//Inner loop end - Letter K	
				
				System.out.print("  ");	//create space between letters
				
				//Inner loop start - Letter U
				for (j=0;j<n;j++)
				{
					if((j==0&&i!=(n-1))||(j==(n-1)&&i!=(n-1))||(i==(n-1)&&j!=0&&j!=(n-1)))
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				//Inner loop end - Letter U			
				
				System.out.print("  ");	//create space between letters

				//Inner loop start - Letter U
				for (j=0;j<n;j++)
				{
					if((j==0)||(i==0&&j!=(n-1))||(i==(n-1)/2&&j!=(n-1))||(j==(n-1)&&(i!=0)&&i<(n-1)/2)||(i-j==0&&j>=(n-1)/2))
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				//Inner loop end - Letter U			
				
				System.out.print("  ");	//create space between letters

				
		System.out.println(); //carriage return for next layer
		}	
	//Outer loop ends
	}		
}

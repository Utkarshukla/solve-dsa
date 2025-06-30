package dsa.PatternPrinting;

public class PatternsPrint {

	public static void main(String[] args) {
		
		System.out.println("--------------------");
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
				System.out.print(" * ");
			System.out.println();
		}
		System.out.println("--------------------");
		
		
		System.out.println("--------------------");
		 n=5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" * ");				
			}
			System.out.println();
		}
		System.out.println("--------------------");
		
		System.out.println("--------------------");
		 n=5;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n-1;j++) {
				System.out.print("   ");				
			}
			for(int j=0;j<=i;j++) {
				System.out.print(" * ");				
			}
			System.out.println();
		}
		System.out.println("--------------------");
		
		
		System.out.println("--------------------");
		 n=5;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" * ");				
			}
			System.out.println();
		}
		System.out.println("--------------------");
		
		System.out.println("--------------------");
		 n=5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("   ");				
			}
			for(int j=i;j<n;j++) {
				System.out.print(" * ");				
			}
			System.out.println();
		}
		System.out.println("--------------------");
		
		System.out.println("--------------------");
		 n=5;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n-1;j++) {
				System.out.print("   ");				
			}
			for(int j=0;j<i;j++) {
				System.out.print(" * ");				
			}
			for(int j=0;j<i-1;j++) {
				System.out.print(" * ");				
			}
			System.out.println();
		}
		System.out.println("--------------------");
		
		System.out.println("--------------------");
		 n=5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("   ");				
			}
			for(int j=i;j<n;j++) {
				System.out.print(" * ");				
			}
			for(int j=i;j<n-1;j++) {
				System.out.print(" * ");				
			}
			System.out.println();
		}
		System.out.println("--------------------");
		
		
		System.out.println("--------------------");
		 n=5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" * ");				
			}
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" * ");				
			}
			System.out.println();
		}
		System.out.println("--------------------");
		
		
		
		System.out.println("--------------------");
		n=6;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n-1;j++) {
				System.out.print("   ");				
			}
			for(int j=0;j<i;j++) {
				System.out.print(" * ");				
			}
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("   ");				
			}
			for(int j=i;j<n-2;j++) {
				System.out.print(" * ");				
			}
			System.out.println();
		}
		
		System.out.println("--------------------");
		
	}

}

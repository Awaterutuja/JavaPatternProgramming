
public class NamePattern {

	public static void main(String[] args) {
		int n=10;
		for(int i=0;i<n;i++) {
		// I letter
		for(int j=0;j<n;j++) {
		if(i==0 || i==n-1 || j==(n-1)/2)
		System.out.print("*");
		else
		System.out.print(" ");

		}
		System.out.print("\t");
		// N letter
		for(int j=0;j<n;j++) {
		if(j==0 || i==j || j==n-1)
		System.out.print("*");
		else
		System.out.print(" ");

		}
		System.out.print("\t");
		// E letter
		for(int j=0;j<n;j++) {
		if(j==0 || i==0 || i==(n-1)/2 || i==n-1)
		System.out.print("*");
		else
		System.out.print(" ");

		}
		System.out.print("\t");
		// U letter
		for(int j=0;j<n;j++) {
		if((j==0 && i<n-1) || (i==n-1 && j>0 && j<n-1) || (j==n-1 && i<n-1))
		System.out.print("*");
		else
		System.out.print(" ");

		}
		System.out.print("\t");
		//R letter
		for(int j=0;j<n;j++) {
		if((i==0 && j>0 && j<n-1) || (j==0 && i>0) || (j==n-1 && i<(n-1)/2 && i>0)
		|| (i==(n-1)/2 && j>0 && j<n-1) || i-j ==n/3)
		System.out.print("*");
		else
		System.out.print(" ");

		}
		System.out.print("\t");
		// O letter
		for(int j=0;j<n;j++) {
		if((j==0 && i!=n-1 && i>0) || (i==0 && j>0 && j<n-1)|| (j==n-1 && i>0 && i<n-1) || (i==n-1 && j<n-1 && j>0))
		System.out.print("*");
		else
		System.out.print(" ");

		}
		System.out.print("\t");
		// N letter
		for(int j=0;j<n;j++) {
		if(j==0 || i==j || j==n-1)
		System.out.print("*");
		else
		System.out.print(" ");

		}

		System.out.println();
		}


	}

}

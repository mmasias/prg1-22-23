public class punto19{
	public static void main(String[] args){
		for (int i=1; i<=21; i=i+1) {
			for (int j=1;j<=21; j=j+1) {
				if (i==j || i==j+2 || j==i+2 || i==j+4 || j==i+4 || i==j+6 || j==i+6 || i==j+8 || j==i+8 || i==j+10 || j==i+10 || i==j+12 || j==i+12 || i==j+14 || j==i+14 || i==j+16 || j==i+16 || i==j+18 || j==i+18 || j==i+20 || i==j+20) {
					System.out.print(" O ");
				} else {
					System.out.print(" . ");
				}
			}
			System.out.println();
		}
	}
}
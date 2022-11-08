public class punto17{
	public static void main(String[] args){
		for (int i=1; i<=21; i=i+1) {
			for (int j=1;j<=21; j=j+1) {
				if ( j==2 && i!=2-1 && i!=21 || j==20 && i!=2-1 && i!=21 || i==2 && j!=2-1 && j!=21 || i==20 && j!=2-1 && j!=21) {
					System.out.print(" O ");
				} else {
					System.out.print(" . ");
				}
			}
			System.out.println();
		}
	}
}
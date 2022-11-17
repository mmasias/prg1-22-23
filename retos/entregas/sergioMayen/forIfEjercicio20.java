public class forIfEjercicio20{
	public static void main(String[] args){
		for (int i=1; i<=21; i=i+1) {
			for (int j=1;j<=21; j=j+1) {
				if (i==5-j || i==9-j || i==13-j || i==17-j || i==21-j || i==25-j || i==29-j || i==33-j || i==37-j && j!=21 || i==17 && j==21 || i==41-j) {
					System.out.print(" O ");
				} else {
					System.out.print(" . ");
				}
			}
			System.out.println();
		}
	}
}
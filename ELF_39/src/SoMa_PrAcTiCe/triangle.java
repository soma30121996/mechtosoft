package SoMa_PrAcTiCe;

public class triangle {

	public static void main(String[] args) {
		for (int row=1;row<=5;row++) {
			for(int colspace =5;colspace>row;colspace--) {
				System.out.print(" ");
			}
			for(int colstar=1;colstar<=row;colstar++) {
				System.out.print('*');
			}
			
			System.out.println();
		}

	}

}

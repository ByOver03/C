package TemaObjetos;
public class ArraysBidimensionales {
	public static void main(String[]args) {
		
		int[][] matriz= new int [3][4];
		
		llenarArrayBidimensional(matriz);
		
//		matriz[0][0]=65;
//		matriz[0][1]=5;
//		matriz[0][2]=-6;
//		matriz[0][3]=90;
//		int[] mono= matriz[0];
		
		
			}
	private static void llenarArrayBidimensional(int[][] arrayBidimensional) {
		for(int i=0; i<3;i++) {
			for(int j=0; j<4;j++) {
				arrayBidimensional[i][j]= i*j;
				
			}
		}
		
		for(int[] padre : arrayBidimensional ) {
			for(int hijo: padre) {
				System.out.println(hijo);
	}
		}
	}
}


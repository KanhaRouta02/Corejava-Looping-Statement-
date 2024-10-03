package D_in.kanha.nestedfor;

public class Demo1 {

	public static void main(String[] args) {
		
//		for(int i=1;i<=5;i++) {
//			
//			for(int j=1;j<=7;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//			
//		}
		
//		for(int i=1;i<=5;i++) { //6
//			
//			for(int j=1;j<=i;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		for(int i=1;i<=3;i++) {
			
			for(int j=3; j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}
}

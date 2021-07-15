
public class Principal {
	static int numerador = 10;
	static Integer denominador = 0;
	static float division;	
				
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("antes de la division");
		try {
			division = numerador / denominador;
		}catch(ArithmeticException error) {
			division = 0;
			System.out.println("error: " + error.getMessage());
		}catch (NullPointerException ex) {
			division = 0;
			System.out.println("error: " + ex.getMessage());
			System.out.println("segundo catch");
		}finally {
			System.out.println("despues de la division");
		}
		
		
	}

}

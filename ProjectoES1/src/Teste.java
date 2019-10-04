
public class Teste {
	
	static double f(double x) {
		return (Math.sin(x))/x;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("está a funcionar");
		System.out.println("teste");
		System.out.println(f(0.0000001));
	}

}

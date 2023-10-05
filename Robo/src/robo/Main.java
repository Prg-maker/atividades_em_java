package robo;

public class Main {
	public static void main(String[] args) {
		Robo robo = new Robo();
		Robo robo2 = new Robo();
		
		robo.ligar();
		robo.andar();
		robo2.ligar();
		
		robo2.andar();
		robo2.virar(20);
		
		int c = 10;
		for(int i =0 ;  i < c ; i++) 
			robo.virar();
		
		System.out.printf("robo 1: %s  \n" , robo.toStringRobo() );
		System.out.println(robo2.toStringRobo());
	}
}

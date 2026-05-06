package prjInterface;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// CASTING 
		Integer x = 200;
		Integer y = 200;
		String meuTexto1 = new String("Esse e um Texto");
		String meuTexto2 = new String("Esse e um Texto");
		
		
		//UPCASTING
		Animal a = new Animal();
		
		a.FazerSom();
		a.correr();
		// a.latir() - Animal nao conhece latir 
		
		
		//CASTING Animal em Cachorro
		Cachorro c = new Cachorro();
		c.latir();
		c.correr("de forma rapida");
		
		if (x.equals(y)) { 
			System.out.println ("São iguais!");
		} else {
			System.out.println ("São diferentes!");
		}
		

		if (meuTexto1.equals(meuTexto2)) {
			System.out.println ("São iguais!");
		} else {
			System.out.println ("São diferentes!");
		}
		
		

	}

}

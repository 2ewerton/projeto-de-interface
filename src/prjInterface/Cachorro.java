package prjInterface;


	public class Cachorro extends Animal {
		void latir() {
			System.out.println("Au au !");
		}
		
		void correr() {
			System.out.println("Corrida de cachorro!");
		};

		void correr(String tipo) {
			System.out.println("Corrida de cachorro!" + tipo);
		};

}

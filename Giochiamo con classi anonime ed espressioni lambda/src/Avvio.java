
public class Avvio {

	public static void main(String[] args) {

		//Creo un oggetto di classe anonima Triangolo
		Figura2D triangoloIso = new Figura2D() {

			@Override
			public double calcPerim() {
				double base = GestoreIO.leggiDecimale("Inserisci una base");
				double lato = GestoreIO.leggiDecimale("Inserisci un lato");
				return base+2*lato;
			}

			@Override
			public double calcArea() {
				double base = GestoreIO.leggiDecimale("Inserisci una base");
				double altezza = GestoreIO.leggiDecimale("Inserisci un'altezza");
				return base*altezza/2;
			}

		};

		System.out.println("Perimetro: "+triangoloIso.calcPerim());
		System.out.println("Area: "+triangoloIso.calcArea());

		IFigura2D rettangolo = new IFigura2D() {

			@Override
			public double calcPerim() {
				double latoMax = GestoreIO.leggiDecimale("Inserisci una base");
				double latoMin = GestoreIO.leggiDecimale("Inserisci un lato");
				return 2*(latoMax+latoMin);
			}

			@Override
			public double calcArea() {
				double base = GestoreIO.leggiDecimale("Inserisci una base");
				double altezza = GestoreIO.leggiDecimale("Inserisci un'altezza");
				return base*altezza;
			}

		};

		//////////////////////////////////////////////////////////////////
		//1)Creo un oggetto di classe anonima nella maniera classica
		IFigura3D<Double> parallelepipedoClassic = new IFigura3D<Double>() {

			@Override
			public double calcVolume(Double area, Double altezza) {
				return area*altezza;
			}

		};

		System.out.println("Volume: "+parallelepipedoClassic.calcVolume(45.2, 78.2));

		//////////////////////////////////////////////////////////////////
		//2)Creo un oggetto di classe anonima con l'espressione lambda
		IFigura3D<Double> parallelepipedoLambda = (area,altezza)->area*altezza;
		System.out.println(parallelepipedoLambda.calcVolume(457.2, 65.2));

	}

}

package packB;

import packA.Persona;

//L'ereditariet� si applica su classi simili
//Dipendente � figlia di Persona
//Dipendente eradita attributi e metodi da Persona
public class Dipendente extends Persona {
	
	private double stipendio;
	
	public void test() {
		/*
		 * id � visibile
		 * nome non visibile
		 * s1 non visibile
		 * s2 � visibile
		 * */
		System.out.println(this.id);
		System.out.println(this.s2);
	}

}

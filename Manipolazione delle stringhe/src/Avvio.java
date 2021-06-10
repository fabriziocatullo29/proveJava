
public class Avvio {
// Saluti da Fabrizio!!
	public static void main(String[] args) {

		//Manipolazione delle stringhe
		//1)equals() ed equalsIgnoreCase()
		String nome1="Omer";
		String nome2="omer";
		//Versione con equals()
		if(nome1.equals(nome2)) {
			System.out.println("I due nomi sono uguali");
		}
		else {
			System.out.println("I due nomi sono diversi");
		}
		
		//Versione con equalsIgnoreCase()
		if(nome1.equalsIgnoreCase(nome2)) {
			System.out.println("I due nomi sono uguali");
		}
		else {
			System.out.println("I due nomi sono diversi");
		}
		
		//2)charAt()
		String nome3="Elisabetta";
		System.out.println(nome3.charAt(0));
		
		//3)toUpperCase()
		String minuscola="sono piccolina";
		System.out.println(minuscola);
		String maiuscola=minuscola.toUpperCase();
		System.out.println(maiuscola);
		
		//4)toLowerCase()
		//Esempio 1:
		String urlo="STO URLANDOOOOH!!!";
		String piccoloUrlo=urlo.toLowerCase();
		System.out.println(piccoloUrlo);
		
		//Esempio 2:
		String name1="Omer".toLowerCase();
		String name2="omer";
		//Versione con equals()
		if(name1.equals(name2)) {
			System.out.println("I due nomi sono uguali");
		}
		else {
			System.out.println("I due nomi sono diversi");
		}
		
		//5)isEmpty() ritorna true se la stringa è vuota,altrimenti false
		String prova1="";
		String prova2=" ";
		//Prova1
		if(prova1.isEmpty()) {
			System.out.println("La stringa è vuota");
		}
		else {
			System.out.println("La stringa non è vuota!");
		}
		//Prova2
		if(prova2.isEmpty()) {
			System.out.println("La stringa è vuota");
		}
		else {
			System.out.println("La stringa non è vuota!");
		}
		
		//6)replace()
		//Esempio1
		String azienda = "Skill Factory"; 
		String aziendaModificata = azienda.replace('l', '1');
		System.out.println(aziendaModificata);
		//Esempio2
		String frasePalindroma="i topi non avevano nipoti";
		String parolaPalindroma=frasePalindroma.replace(" ", "");
		System.out.println(parolaPalindroma);
		
		//7)replaceAll()
		String oldNome = "Asdrubale";
		String newNome = oldNome.replaceAll("sdru", "nni");
		System.out.println(newNome);
		
		//8)trim() elimina gli spazi agli estremi (SOLO agli estremi)
		String username = " mirko83";
		String password = "1234 ";
		System.out.println("Senza trim():"+username);
		System.out.println("Con trim():"+username.trim());
		System.out.println("Senza trim():"+password+"////");
		System.out.println("Con trim():"+password.trim()+"////");
		
		//9)split() spezza una stringa in tante stringhe secondo una ricorrenza
		String stringaDaSpezzare = "Genesis,Omer,Elisabetta";
		String[] nominativi=stringaDaSpezzare.split(","); 
//		System.out.println(nominativi[0]);
//		System.out.println(nominativi[1]);
//		System.out.println(nominativi[2]);
		for(int i=0; i<nominativi.length; i++) {
			System.out.println(nominativi[i]);
		}
		
		char lettera = 'B';
		if(lettera==66) {
			System.out.println("Questa è la lettera B");
		}
		
		
		
		
		

	}

}

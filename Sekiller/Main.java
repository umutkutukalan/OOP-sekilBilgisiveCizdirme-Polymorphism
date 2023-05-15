package Sekiller;

public class Main {
	
	// POLYMORPHİSM
	public static void bilgilendirCizdir(Sekil sekil) {
		sekil.sekilBilgisi();
	}
	
	
	public static void main(String[] args) {

		Kare kare = new Kare("Kare", 4);
		Besgen besgen = new Besgen("Beşgen", 5);
		Altıgen altigen = new Altıgen("Altıgen", 6);
		
//		kare.sekilBilgisi();
//		besgen.sekilBilgisi();
//		altigen.sekilBilgisi();
		
		// POLYMORPHİSM
		bilgilendirCizdir(kare);
		bilgilendirCizdir(besgen);
		bilgilendirCizdir(altigen);
		
		
	}

}

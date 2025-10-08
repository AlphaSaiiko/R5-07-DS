public class Q4 
{
	public static void main(String[] args) 
	{
		if(args.length == 0) {
			System.out.println("Erreur: Veuillez fournir un nombre N en paramètre.");
			System.out.println("Usage: java Q4 <N>");
			return;
		}

		try {
			// Convertir l'argument en entier
			int N = Integer.parseInt(args[0]);
			
			// Vérifier que N est positif
			if (N <= 0) {
				System.out.println("Erreur: N doit être un nombre positif.");
				return;
			}
			
			// Afficher le triangle de nombres
			for (int ligne = 1; ligne <= N; ligne++) {
				for (int nombre = 1; nombre <= ligne; nombre++) {
					System.out.print(nombre);
					if (nombre < ligne) {
						System.out.print(" ");
					}
				}
				System.out.println(); // Nouvelle ligne après chaque ligne du triangle
			}
			
		} catch (NumberFormatException e) {
			System.out.println("Erreur: L'argument doit être un nombre entier.");
			System.out.println("Usage: java Q4 <N>");
		} {
			int N = Integer.parseInt(args[0]);
			
			if (N <= 0) {
				System.out.println("Erreur: N doit être un nombre positif.");
				return;
			}
			
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(j);
					if (j < i) {
						System.out.print(" ");
					}
				}
				System.out.println(); // Nouvelle ligne après chaque ligne de la pyramide
			}
			
		} catch (NumberFormatException e) {
			System.out.println("Erreur: L'argument doit être un nombre entier.");
			System.out.println("Usage: java Q4 <N>");
		}
	}
}

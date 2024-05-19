package org.generation.italy;

import java.util.Scanner;
import java.util.Random;

public class IndovinaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		// Generare un numero casuale da 1 a 100
		int numeroDaIndovinare = random.nextInt(100) + 1;

		int numeroUtente, tentativi = 0;

		System.out.println("Benvenuto, inizia il gioco: Indovina il numero. Prova ad indovinare il numero generato da 1 a 100");

		// Inizio del ciclo che continua finchè non viene indovinato il numero generato
		do {
			System.out.print("Inserisci un numero da 1 a 100: ");
			numeroUtente = sc.nextInt();
			tentativi++; // Incremento del valore "tentativi"

			if (numeroUtente < numeroDaIndovinare) {
				System.out.println("Il numero inserito è troppo basso. Riprova");

			} else if (numeroUtente > numeroDaIndovinare) {
				System.out.println("Il numero inserito è troppo alto. Riprova");

			} else {
				System.out.println("Hai indovinato! Il numero inserito è uguale al numero generato casualmente.");
				System.out.println("Il numero è stato indovinato in " + tentativi + " tentativi.");
			}
		} while (numeroUtente != numeroDaIndovinare);

		System.out.println("Il gioco è terminato, arrivederci");
		sc.close(); // Chiusura dello scanner
	}
}
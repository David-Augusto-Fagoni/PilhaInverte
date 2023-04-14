package View;

import Controller.Pilha;
import PilhaInt.PilhaI;

public class Main {

	public static void main(String[] args) {
		PilhaI PMain = new PilhaI();
		PilhaI P1 = new PilhaI();
		PilhaI P2 = new PilhaI();
		Pilha P = new Pilha();
		P.NumPilha(PMain);
		
		for (int J = 0; J<12;J++ ) {
			try {
				P1.push(PMain.pop());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		for (int J = 0; J<12;J++ ) {
			try {
				P2.push(P1.pop());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		for (int J = 0; J<12;J++ ) {
			try {
				PMain.push(P2.pop());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		for (int J = 0; J<12;J++ ) {
			try {
				System.out.println(PMain.pop());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}

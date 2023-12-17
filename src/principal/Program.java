package principal;

import entities.DiaSemana;

public class Program {

	public static void main(String[] args) {

		DiaSemana[] dias = DiaSemana.values();

		for (int i = 0; i < dias.length; i++) {
			System.out.println(dias[i]);

		}

		for (DiaSemana dia : DiaSemana.values()) {
			System.out.println(dia);

		}

		DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");
		System.out.println(dia);

	}

}

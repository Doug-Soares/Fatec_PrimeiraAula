package view;

import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {

		OperacoesController opController = new OperacoesController();

		opController.OpString();
		opController.OpBuffer();
		String frase = "Diga onde voce vai que eu vou varrendo";
		opController.opFrase(frase);

	}

}

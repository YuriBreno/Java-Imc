package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.ImcBeam;
import view.MainViewer;

public class ControleImc implements ActionListener {

	private MainViewer context;
	private ImcBeam imc;
	
	
	
	public ControleImc() {

	}

	public ControleImc(MainViewer context) {
		if(this.context == null) {
			this.context = context;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		imc = new ImcBeam(context.getPesotextField().getText(), context.getAlturatextField().getText());
		context.getResultadoPane().setText("Nome = " +context.getNometextField().getText()+ "\nIdade = " +context.getIdadetextField().getText()+ "\nPeso = " +context.getPesotextField().getText()+ " \nAltura = " +context.getAlturatextField().getText()+ "\n"+imc.toString());
		

	}

}

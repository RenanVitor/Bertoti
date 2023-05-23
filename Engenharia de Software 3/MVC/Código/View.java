import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class View implements ActionListener, Observer {
	private Subject model;
	private controllerInterface controller;
	private String diaSemana = "";
	private String pratoEntrada = "";
	private String pratoPrincipal = "";
	private String pratoSobremesa = "";
	
	JFrame frame;
	JPanel panelBotoes;
	JPanel panelDados;
	JPanel panelDia;
	JPanel panelEntrada;
	JPanel panelPrincipal;
	JPanel panelSobremesa;
	JLabel labelDia;
	JLabel labelEntrada;
	JLabel labelPrincipal;
	JLabel labelSobremesa;
	JLabel diaText;
	JLabel entradaText;
	JLabel principalText;
	JLabel sobremesaText;
	JButton assinar;
	JButton cancelar;
	
	public View(Subject mo, controllerInterface co) {
		this.model = mo;
		this.controller = co;
	}
	
	
	public void createView(){
		
		frame = new JFrame("Restaurante Italia Mia");
		panelBotoes = new JPanel();
		panelDados = new JPanel();
		panelDia = new JPanel();
		panelEntrada = new JPanel();
		panelPrincipal = new JPanel();
		panelSobremesa = new JPanel();
		assinar = new JButton("Assinar o cardápio da semana");
		cancelar = new JButton("Cancelar a assinatura");
		labelDia = new JLabel();
		labelEntrada = new JLabel();
		labelPrincipal = new JLabel();
		labelSobremesa = new JLabel();
		diaText = new JLabel("Dia da semana:");
		entradaText = new JLabel("Entrada:");
		principalText = new JLabel("Prato Principal:");
		sobremesaText = new JLabel("Sobremesa:");
		
		
		assinar.addActionListener(this);
		cancelar.addActionListener(this);
		
		panelBotoes.add(assinar);
		panelBotoes.add(cancelar);
		panelDia.add(diaText);
		panelDia.add(labelDia);
		panelEntrada.add(entradaText);
		panelEntrada.add(labelEntrada);
		panelPrincipal.add(principalText);
		panelPrincipal.add(labelPrincipal);
		panelSobremesa.add(sobremesaText);
		panelSobremesa.add(labelSobremesa);
		panelDados.add(panelDia);
		panelDados.add(panelEntrada);
		panelDados.add(panelPrincipal);
		panelDados.add(panelSobremesa);
		frame.getContentPane().add(BorderLayout.SOUTH, panelBotoes);
		frame.getContentPane().add(BorderLayout.CENTER, panelDados);
		
		labelDia.setText(diaSemana);
		labelEntrada.setText(pratoEntrada);
		labelPrincipal.setText(pratoPrincipal);
		labelSobremesa.setText(pratoSobremesa);
		
		
		frame.setSize(300, 150);
		frame.setVisible(true);
		
	}

	public void update(String dia, String entrada, String principal, String sobremesa) {
		diaSemana = dia;
        pratoEntrada = entrada;
        pratoPrincipal = principal;
		pratoSobremesa = sobremesa;
        
		display();
	}

	public void display() {
		
		labelDia.setText(diaSemana);
		labelEntrada.setText(pratoEntrada);
		labelPrincipal.setText(pratoPrincipal);
		labelSobremesa.setText(pratoSobremesa);
		
	}
	
	public void habilitarBotaoAssinar(){
		
		assinar.setEnabled(true);
		
	}
	
	public void desabilitarBotaoAssinar(){
		
		assinar.setEnabled(false);
		
	}
	
	
	public void habilitarBotaoCancelar(){
		
		cancelar.setEnabled(true);
		
	}
	
	public void desabilitarBotaoCancelar(){
		
		cancelar.setEnabled(false);
		
	}
	
	public void actionPerformed(ActionEvent event){
		if (event.getSource() == assinar){
				controller.assinar();
		}
		if (event.getSource() == cancelar){
				controller.cancelar();
		}
	}
}

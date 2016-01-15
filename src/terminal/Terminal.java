package terminal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class Terminal extends JFrame implements KeyListener{
	
	private JTextField saisie = new JTextField();
	private JList liste;
	DefaultListModel dif = new DefaultListModel();
	
	public Terminal(String titre){
		super(titre);
		
		this.setPreferredSize(new Dimension(600,500));
		Container contenu = this.getContentPane();
		
		this.liste = new JList(this.dif);
		this.liste.setBackground(Color.BLACK);
		this.liste.setForeground(Color.BLUE);
		this.liste.setSize(this.liste.getMinimumSize());
		
		//this.dif.addElement(new JTextField("lol"));
		
		
		this.saisie.addKeyListener(this);
		this.saisie.setSize(MAXIMIZED_VERT, 20);
		
		JScrollPane jsp = new JScrollPane(this.liste);
		
		//gestionnaire de positionnement
		Box ges = Box.createVerticalBox();
		contenu.add(ges);
		ges.add(jsp);
		ges.add(ges.createVerticalStrut(0));
		ges.add(this.saisie);
		ges.add(ges.createGlue());
		
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
		
	public void keyPressed(KeyEvent ke) {
			
		if(ke.getKeyCode() ==  KeyEvent.VK_ENTER){
				if(this.saisie.getText().length()>0){
					this.dif.addElement(this.saisie.getText());
					this.saisie.setText("");
				}
		}
		if(ke.getKeyCode() == KeyEvent.VK_UP){
				
		}
			
		if(ke.getKeyCode() == KeyEvent.VK_DOWN){
				
		}
		}

	public void keyReleased(KeyEvent arg0) {
		
	}

	public void keyTyped(KeyEvent arg0) {

			
	}

	
	public static void main(String args []){
		Terminal term = new Terminal("Terminal");
	}
}

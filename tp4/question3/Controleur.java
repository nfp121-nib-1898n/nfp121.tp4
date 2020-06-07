package question3;

import question3.tp3.PileI;
import question3.tp3.PilePleineException;
import question3.tp3.PileVideException;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Décrivez votre classe Controleur ici.
 * 
 * @author (Antonios Ghaly)
 * @version (6/7/2020)
 */
public class Controleur extends JPanel {

    private JButton push, add, sub, mul, div, clear;
    private PileModele<Integer> pile;
    private JTextField donnee;

    public Controleur(PileModele<Integer> pile) {
        super();
        this.pile = pile;
        this.donnee = new JTextField(8);

        this.push = new JButton("push");
        this.add = new JButton("+");
        this.sub = new JButton("-");
        this.mul = new JButton("*");
        this.div = new JButton("/");
        this.clear = new JButton("[]");

        setLayout(new GridLayout(2, 1));
        add(donnee);
        //donnee.addActionListener(new ButtonsActionListener("actionListener"));
        JPanel boutons = new JPanel();
        boutons.setLayout(new FlowLayout());
        boutons.add(push);  push.addActionListener(null /* null est à remplacer */);
        boutons.add(add);   add.addActionListener(null /* null est à remplacer */);
        boutons.add(sub);   sub.addActionListener(null /* null est à remplacer */);
        boutons.add(mul);   mul.addActionListener(null /* null est à remplacer */);
        boutons.add(div);   div.addActionListener(null /* null est à remplacer */);
        boutons.add(clear); clear.addActionListener(null /* null est à remplacer */);
        add(boutons);
        boutons.setBackground(Color.red);
        actualiserInterface();
    }

    public void actualiserInterface() {
        if(pile.taille() <= 1){
            add.setEnabled(false);
            sub.setEnabled(false);
            mul.setEnabled(false);
            div.setEnabled(false);
        } 
        else {
            add.setEnabled(true);
            sub.setEnabled(true);
            mul.setEnabled(true);
            div.setEnabled(true);
        }
        if(pile.estPleine()){
            push.setEnabled(false);
        }   
        else{
            push.setEnabled(true);
        }    
    }

    private Integer operande() throws NumberFormatException {
        return Integer.parseInt(donnee.getText());
    }
 public class ButtonsActionListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
}}}

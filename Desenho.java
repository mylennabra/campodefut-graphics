import java.awt.*;
import javax.swing.*;

public class Desenho extends JFrame{
    public Desenho() {
        setLayout(new FlowLayout()); // Organiza layout 
        setSize(1000,700); // Define tamanho do frame
        setTitle("Campo de Futebol"); // Definindo título pra janela 
        setLocationRelativeTo(null); // Definindo a posição da janela no centro da tela 
        setVisible(true); // Torna o frame visivel
    }

    @Override
    public void paint(Graphics g){
        g.setColor(new Color(34,139,34));
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.white);
        // Quadrado maior
        g.drawRect(50, 50,900, 600);  
        // Traves
        g.drawRect(50, 150,150, 400);  
        g.drawRect(800, 150,150, 400);  
        // Quadrado dentro da trave
        g.drawRect(870, 250,80, 200);  
        g.drawRect(50, 250,80, 200);
        // Quadrado pequeno depois da trave
        g.drawRect(25, 310,25, 80);  
        g.drawRect(950, 310,25, 80);  
        // Círculo do meio
        g.drawArc(425, 275, 150, 150, 0, 360);  
        // Arco da trave
        g.drawArc(750, 275, 150, 150, 110, 140);  
        g.drawArc(100, 275, 150, 150, -70, 140);  
        // Escanteio
        g.drawArc(25, 625, 50, 50, 0, 90);  
        g.drawArc(925, 25, 50, 50, 180, 90);  
        g.drawArc(25, 25, 50, 50, -90, 90);  
        g.drawArc(925, 625, 50, 50, 90, 90);  
        // Linha do meio
        g.drawLine(500, 50, 500, 650);
    }
    public static void main(String [] args){
        Desenho d = new Desenho();
        d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
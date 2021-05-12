import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Draw_6206021612121
 */
public class Draw_6206021612121 extends JFrame implements ActionListener {
    private JButton trianglebbtn, starbtn, boxbtn, clearbtn;
    private JPanel area1, area2;

    public Draw_6206021612121() {
        super("Draw Picture");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        area1 = new JPanel();
        area1.setPreferredSize(new Dimension(750, 70));
        area1.setBorder(BorderFactory.createLineBorder(Color.BLUE, 3));

        area2 = new JPanel();
        area2.setPreferredSize(new Dimension(750, 430));
        area2.setBorder(BorderFactory.createLineBorder(Color.BLUE, 3));

        trianglebbtn = new JButton("Triangle");
        trianglebbtn.addActionListener(this);
        starbtn = new JButton("Star");
        starbtn.addActionListener(this);
        boxbtn = new JButton("Box");
        boxbtn.addActionListener(this);
        clearbtn = new JButton("Clear");
        clearbtn.addActionListener(this);

        area1.add(trianglebbtn);
        area1.add(starbtn);
        area1.add(boxbtn);
        area1.add(clearbtn);

        c.add(area1);
        c.add(area2);

    }

    public void paint(Graphics g) {
        super.paint(g);
    }

    public void clearArea(JPanel area) {
        area.paint(area.getGraphics());
    }

    public void draw(Graphics g, int type) {
        switch (type) {
            case 1:
                clearArea(area2);
                g.drawLine(380, 75, 500, 300);
                g.drawString("[380,75]",380,75);
                g.drawLine(380, 75, 250, 300);
                g.drawString("[250,300]",250,300);
                g.drawLine(250, 300, 500, 300);
                g.drawString("[300,250]",500,300);
                break;

            case 2:
                clearArea(area2);
                g.drawLine(380, 50, 500, 320);
                g.drawString("[380,50]",380,50);
                g.drawLine(380, 50, 250, 320);
                g.drawString("[250,320]",260,320);
                g.drawLine(220, 150, 500, 320);
                g.drawString("[500,320]",500,320);
                g.drawLine(520, 150, 250, 320);
                g.drawString("[520,150]",520,150);
                g.drawLine(220, 150, 520, 150);
                g.drawString("[220,150]",180,150);
            break;

            case 3:
                clearArea(area2);
                g.drawRect(175,150,200,200);
                g.drawString("[175,150]",175,150);
                g.drawRect(350,75,200,200);
                g.drawString("[350,75]",350,75);
                g.drawLine(175,150,350,75);
                g.drawString("[180,120]",180,120);
                g.drawLine(380,150,550,75);
                g.drawString("[400,120]",400,120);
                g.drawLine(175,350,350,275);
                g.drawString("[175,350]",175,350);
                g.drawLine(380,350,550,275);
                g.drawString("[380,350]",380,350);
                break;
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == trianglebbtn)
            draw(area2.getGraphics(), 1);
        else if (e.getSource() == starbtn)
            draw(area2.getGraphics(), 2);
        else if (e.getSource() == boxbtn)
            draw(area2.getGraphics(), 3);
        else if (e.getSource() == clearbtn)
            clearArea(area2);
    }

    public static void main(String[] args) {
        Draw_6206021612121 window = new Draw_6206021612121();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

}
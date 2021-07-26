package tictactoegame3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class UserPanel implements ActionListener
{
    JFrame jf;     // This is use for frame
    JLabel jl1, jl2 ,jl3;  // This is use for set the label on frame
    JTextField jt1, jt2;  // This is use for set TextField in front of label
    JButton jb;        // This is use for Button
    Color color1;
    JComboBox cb;

    UserPanel()
    {
        jf=new JFrame("TicTacToe Game by Bhushan , Anand ,shailesh and Damini ");
        jf.setSize(600,500); // This property set the height and width of the frame
        jf.setLocationRelativeTo(null); // This property show frame in the center of the screen
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This property is use for close the frame
        jf.setLayout(null); // This property set by default layout null

        jl1=new JLabel("Enter Player One:(X) ");
        jl1.setBounds(50, 50, 120, 30); // This property set the label x-axis, y-axis , width and height
        jf.add(jl1); // This property add label on the frame

        jt1=new JTextField();
        jt1.setBounds(200, 50, 250, 40); // This property set the x-axis, y-axis ,width and height of the TextField
        jf.add(jt1);   // This property add TextField on the frame

        jl2=new JLabel("Enter Player Two:(0) ");
        jl2.setBounds(50, 150, 120, 30);
        jf.add(jl2);

        jt2=new JTextField();
        jt2.setBounds(200, 140, 250, 40);
        jf.add(jt2);


        jl3=new JLabel("Select Series :");
        jl3.setBounds(50, 230, 120, 30);
        jf.add(jl3);

        String[] series={"3", "5", "7", "9"};
        cb=new JComboBox(series);
        cb.setBounds(200, 230, 250, 40);
        jf.add(cb);

        jb = new JButton("Start Game");
        jb.setBounds(200, 300, 150, 50); // This property set x-axis , y-axis ,width and height of the button
        jb.addActionListener(this);    // This property perform action on the button
        jb.setBackground(color1.GREEN);
        jf.add(jb);  // This property add button on frame


        jf.setVisible(true); // This property display all content on Screen
    }

    @Override
    public void actionPerformed(ActionEvent e) // This is method use for performing action on button, TextField etc...
    {
        if(e.getSource()==jb)
        {
            String player1=jt1.getText();
            String player2=jt2.getText();

            String series=(String)cb.getSelectedItem();


            GamePanel gp=new GamePanel(player1, player2, Integer.parseInt(series));
            gp.openGamePanel();
            jf.setVisible(false);
        }
    }
}

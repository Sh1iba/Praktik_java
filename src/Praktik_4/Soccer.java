package Praktik_4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.ImageIcon;

public class Soccer{
    private byte count1 = 0,count2 = 0;
    public Soccer(){

        //Создаем фрейм (окно)
        JFrame frame = new JFrame("Soccer");
        //Просим программу закрыться при закрытии фрейма
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(425,260);
        frame.setLayout(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        // Создаем метку с изображением
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\User\\Pictures\\Saved Pictures\\DcnUDkWJuxw.jpg"); // Путь к изображению
        JLabel background = new JLabel(imageIcon);
        background.setBounds(0, 0, 1000,800);
        // Добавляем метку на панель
        panel.add(background);
        // Устанавливаем панель в качестве контента фрейма
        frame.setContentPane(panel);

        //Создадим лейбл и поместим его во фрейм
        JLabel result = new JLabel("Result: "+ count1 +  " X "+ count2);
        result.setFont(new Font("Arial", Font.BOLD, 14));
        result.setBounds(160,90,120,30);
        background.add(result);

        JLabel lastSc = new JLabel("Last Scorer: N/A");
        lastSc.setFont(new Font("Arial", Font.BOLD, 12));
        lastSc.setBounds(140,120,190,30);
        background.add(lastSc);

        JLabel win = new JLabel("Winner: Undefined");
        win.setFont(new Font("Arial", Font.BOLD, 12));
        win.setBounds(155,150,190,30);
        background.add(win);

        JButton milan = new JButton("AC MILAN");
        milan.setBounds(60,50,100,30);
        background.add(milan);

        //Добавим к кнопке слушатель события
        milan.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                count1++;
                result.setText("Result: "+ count1 +  " X "+ count2);
                lastSc.setText("Last Scorer: AC Milan");
                if (count1 > count2){
                    win.setText("Winner: AC Milan");
                }
                else if (count1 < count2) {
                    win.setText("Winner: Real Madrid");
                }
                else{
                    win.setText("Winner: DRAW");
                }
            }
        });

        JButton real = new JButton("Real Madrid");
        real.setBounds(232,50,110,30);
        background.add(real);
        //Добавим к кнопке слушатель события
        real.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                count2++;
                result.setText("Result: "+ count1 +  " X "+ count2);
                lastSc.setText("Last Scorer: Real Madrid");
                if (count1 > count2){
                    win.setText("Winner: AC Milan");
                }
                else if (count1 < count2) {
                    win.setText("Winner: Real Madrid");
                }
                else{
                    win.setText("Winner: DRAW");
                }
            }
        });
        frame.setVisible(true);
    }

}

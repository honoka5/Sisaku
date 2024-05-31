package Zousyoku;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Topscreen extends Object{
    public void perfprm(){
        
        //ウィンドウ（フレーム）を生成する
        JFrame mainFrame = new JFrame("WidgetClock");//タイトル
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(800, 200);
        mainFrame.setLayout(new GridLayout(2, 1));//2行1列レイアウト
        //mainFrame.setLayout(null);動かすなって処理

        //ラベルを追加する
        JLabel dateLabel =new JLabel();//ラベル作った
        dateLabel.setText("2024.05.24 09:55");//日付設定
        dateLabel.setForeground(Color.BLUE);//Foregronund前景、文字の色
        dateLabel.setFont(new Font("Consolas",Font.ITALIC,48));
        mainFrame.add(dateLabel);//mainFrameにdateLabel追加

        //ボタン追加
        JButton colorButton =new JButton("Change Color!!");
        colorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent anEvent){
                if (dateLabel.getForeground()==Color.BLUE) {//
                    dateLabel.setForeground(Color.RED);
                }else{
                    dateLabel.setForeground(Color.BLUE);
                }
            }
        });
        //colorButton.setBounds(20,20,300,100);//x軸、y軸、横、縦
        mainFrame.add(colorButton);


        //ウィンドウ（フレーム）を表示する
        mainFrame.setVisible(true);

            }
        };
       
   
    


   
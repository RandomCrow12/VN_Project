import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.*;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Main{
    public static void main(String[] args) throws ClassNotFoundException {
        
        
        Dialogue dia = new Dialogue();
        JFrame frame = new JFrame("September, Yesteryear");
        frame.setSize(500,400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainpanel = new JPanel();
        mainpanel.setBackground(new Color(20,20,20));
        GridBagLayout grid = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        mainpanel.setLayout(grid);

        //images
        JPanel panel = new JPanel();
        panel.setBackground(new Color(20,20,20));
        panel.setLayout(new FlowLayout());
        gbc.gridx = 0;
        gbc.gridy = 0;
        mainpanel.add(panel,gbc);

        JLabel labelI = new JLabel();
        labelI.setIcon(new ImageIcon(dia.image));

        //text
        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(20,20,20));
        panel2.setLayout(new FlowLayout());
        gbc.gridx = 0;
        gbc.gridy = 1;
        mainpanel.add(panel2,gbc);

        JLabel label = new JLabel(dia.text);
        label.setForeground(new Color(255, 255, 255));
        label.setFont(new Font("SansSerif", Font.PLAIN, 20));

        //buttons
        JPanel panel3 = new JPanel();
        panel3.setBackground(new Color(20,20,20));
        panel3.setLayout(new FlowLayout());
        gbc.gridx = 0;
        gbc.gridy = 2;
        mainpanel.add(panel3,gbc);

        JButton button = new JButton();
        button.setText("Save");
        button.setForeground(new Color(255, 255, 255));
        button.setBackground(new Color(20,20,20));

        JButton button2 = new JButton();
        button2.setText("Load");
        button2.setForeground(new Color(255, 255, 255));
        button2.setBackground(new Color(20,20,20));

        JButton button5 = new JButton();
        button5.setText("Auto");
        button5.setForeground(new Color(255, 255, 255));
        button5.setBackground(new Color(20,20,20));

        /*JButton button4 = new JButton();
        button4.setText("Skip");
        button4.setForeground(new Color(255, 255, 255));
        button4.setBackground(new Color(20,20,20));*/

        JButton button3 = new JButton();
        button3.setText("Back");
        button3.setForeground(new Color(255, 255, 255));
        button3.setBackground(new Color(20,20,20));

        JButton button6 = new JButton();
        button6.setText("Start");
        button6.setForeground(new Color(255, 255, 255));
        button6.setBackground(new Color(20,20,20));

        //display
        panel.add(labelI);
        panel2.add(label);
        panel3.add(button);
        panel3.add(button2);
        //panel3.add(button5);
        //panel3.add(button4);
        //panel3.add(button3);
        panel3.add(button6);

        frame.add(mainpanel);

        //choice button work v
        JButton buttonC1 = new JButton();
        buttonC1.setText(dia.btext1);
        buttonC1.setForeground(new Color(255, 255, 255));
        buttonC1.setBackground(new Color(20,20,20));

        JButton buttonC2 = new JButton();
        buttonC2.setText(dia.btext2);
        buttonC2.setForeground(new Color(255, 255, 255));
        buttonC2.setBackground(new Color(20,20,20));

        ActionListener C1 = new ActionListener() {// 
                @Override
                public void actionPerformed(ActionEvent e) {
                    dia.choice=0;
                    if (dia.screen==7){
                        dia.choice1();
                    } else if(dia.screen == 23){
                        dia.choice2();
                    } else if(dia.screen==58){
                        dia.choice3();
                    } else if(dia.screen==69){
                        dia.choice4();
                    } else if(dia.screen==159){
                        dia.choice5();
                    } else if(dia.screen==190){
                        dia.choice6();
                    } else if(dia.screen == 278){
                        dia.choice7();
                    } else if(dia.screen == 280){
                        dia.choice8();
                    } else if(dia.screen == 364){
                        dia.choice9();
                    } 

                    panel2.remove(buttonC1);
                    panel2.remove(buttonC2);//kills buttons

                    //panel3.add(button5);
                    panel3.add(button3);
                    panel3.add(button6);

                    label.setText(dia.text);
                    labelI.setIcon(new ImageIcon(dia.image));
                }
            };
        ActionListener C2 = new ActionListener() {// 
                @Override
                public void actionPerformed(ActionEvent e) {
                    dia.choice=1;
                    if (dia.screen==7){
                        dia.choice1();
                    } else if(dia.screen == 23){
                        dia.choice2();
                    } else if(dia.screen==58){
                        dia.choice3();
                    } else if(dia.screen==69){
                        dia.choice4();
                    } else if(dia.screen==159){
                        dia.choice5();
                    } else if(dia.screen==190){
                        dia.choice6();
                    } else if(dia.screen == 278){
                        dia.choice7();
                    } else if(dia.screen == 280){
                        dia.choice8();
                    } else if(dia.screen == 364){
                        dia.choice9();
                    } 

                    panel2.remove(buttonC1);
                    panel2.remove(buttonC2); //kills buttons

                    //panel3.add(button5);
                    panel3.add(button3);
                    panel3.add(button6);

                    label.setText(dia.text);
                    labelI.setIcon(new ImageIcon(dia.image));
                }
            };

        //choice button work ^
        ActionListener BL = new ActionListener() {//save button
                @Override
                public void actionPerformed(ActionEvent e) {
                    try{
                        BufferedWriter wr = new BufferedWriter(new FileWriter("SaveFile1.txt"));
                        wr.write(""+dia.screen);
                        wr.close();
                    } catch(IOException eee){
                        eee.printStackTrace();
                    }

                    try{
                        BufferedWriter wr2 = new BufferedWriter(new FileWriter("kn.txt"));
                        wr2.write(dia.knifeName);
                        wr2.close();
                    } catch(IOException eee){
                        eee.printStackTrace();
                    }
                }
            };
        ActionListener BL2 = new ActionListener() {//load button
                @Override
                public void actionPerformed(ActionEvent e) {
                    String loader = "";
                    try{
                        BufferedReader re = new BufferedReader(new FileReader("SaveFile1.txt"));
                        loader = re.readLine();
                    } catch(IOException eeee){
                        eeee.printStackTrace();
                    }
                    int loaded = Integer.parseInt(loader);
                    dia.screen = loaded;

                    String loader2 = "";
                    try{
                        BufferedReader re2 = new BufferedReader(new FileReader("kn.txt"));
                        loader2 = re2.readLine();
                    } catch(IOException eeee){
                        eeee.printStackTrace();
                    }
                    String loaded2 = loader2;
                    dia.knifeName = loaded2;

                    /*
                     *    Make this and all of it's changes occur on any load so that it actually loads the screen after setting
                     *    it to the new screen number. Need the choices section bc can save/load on a choice screen
                     *    pobably put this code in the load button so you open game and it doesn't autoload, it makes you load it
                     *    
                     */ 
                    //done    
                    
                    dia.advance();
                    label.setText(dia.text);
                    labelI.setIcon(new ImageIcon(dia.image));
                    if (dia.screen == 7 || dia.screen==23 || dia.screen == 58 || dia.screen == 69 || dia.screen==159 || dia.screen==190  || dia.screen==278 || dia.screen==280 || dia.screen==364){
                        panel2.add(buttonC1);
                        buttonC1.setText(dia.btext1); //gets proper text for the choice based on screen
                        panel2.add(buttonC2);
                        buttonC2.setText(dia.btext2); //gets proper text for the choice based on screen
                        panel3.remove(button5);
                        panel3.remove(button3);
                        panel3.remove(button6);

                        buttonC1.addActionListener(C1);
                        buttonC2.addActionListener(C2);
                    } 
                    if(dia.screen == 207 || dia.screen == 243 || dia.screen == 288 || dia.screen == 379 || dia.screen == 416 || dia.screen == 507){
                        panel3.remove(button3);
                        panel3.remove(button);
                        panel3.remove(button2);
                        panel3.remove(button6);
                        panel3.remove(button5);
                    }
                }
            };
        ActionListener BL3 = new ActionListener() { //back button
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (dia.screen == 10){
                        dia.screen = 6;
                    } else if(dia.screen == 33){
                        dia.screen = 23;
                    } 
                    else if(dia.screen == 41){
                        //lol you can't go back now (I don't want to code in removing the button so when paths converge it just won't work)
                        //I can kill it later on these screens if I really want to

                        try  
                        {  
                            
                            File file = new File("sorrylol.txt");   
                            if(!Desktop.isDesktopSupported())
                            {  
                                System.out.println("not supported");  
                                return;  
                            }  
                            Desktop desktop = Desktop.getDesktop();  
                            if(file.exists())         
                                desktop.open(file);               
                        }  
                        catch(Exception eEe)  
                        {  
                            eEe.printStackTrace();  
                        }  

                    } else if(dia.screen == 86){
                        dia.screen = 69;
                    } else if(dia.screen == 244){
                        dia.screen = 159;
                    } else if(dia.screen == 208){
                        dia.screen = 190;
                    } else if(dia.screen == 289){
                        dia.screen = 280;
                    }  else if(dia.screen == 380){
                        dia.screen = 364;
                    } else if(dia.screen == 417){
                        dia.screen = 278;
                    }else {
                        dia.screen-=1; //not necessarily true bc of decisions moving you places so figure that out
                    }

                    if (dia.screen < 1){
                        dia.screen = 0;
                    }
                    //makes it so you can't go to negative screens lmaoooo ^
                    dia.advance();
                    label.setText(dia.text);
                    labelI.setIcon(new ImageIcon(dia.image));

                    if (dia.screen == 7 || dia.screen==23 || dia.screen == 58 || dia.screen == 69 || dia.screen==159 || dia.screen==190  || dia.screen==278 || dia.screen==280 || dia.screen==364){
                        panel2.add(buttonC1);
                        buttonC1.setText(dia.btext1); //gets proper text for the choice based on screen
                        panel2.add(buttonC2);
                        buttonC2.setText(dia.btext2); //gets proper text for the choice based on screen
                        panel3.remove(button5);
                        panel3.remove(button3);
                        panel3.remove(button6);

                        buttonC1.addActionListener(C1);
                        buttonC2.addActionListener(C2);
                    } 
                }
            };
        /*ActionListener BL4 = new ActionListener() {// skip button
        @Override
        public void actionPerformed(ActionEvent e) {

        }
        };*/
        ActionListener BL5 = new ActionListener() {//auto button
                @Override
                public void actionPerformed(ActionEvent e) {
                    //use thread sleep and just simulate the button press code somehow
                    //will need a boolean for if auto is on or off so that if it is on, the auto button turns off when you press it
                    
                    //that did not work at all
                    try  
                        {  
                            
                            File file = new File("autoapology.txt");   
                            if(!Desktop.isDesktopSupported())
                            {  
                                System.out.println("not supported");  
                                return;  
                            }  
                            Desktop desktop = Desktop.getDesktop();  
                            if(file.exists())         
                                desktop.open(file);               
                        }  
                        catch(Exception EeE)  
                        {  
                            EeE.printStackTrace();  
                        } 
                    
                }
    };
    ActionListener  BL6 = new ActionListener() { //next button
            @Override
            public void actionPerformed(ActionEvent e) {
                button6.setText("Next");
                panel3.remove(button3);
                panel3.remove(button6);
                panel3.add(button3);
                panel3.add(button6);
                
                if (dia.screen == 6){
                    dia.screen = 10;
                } else if(dia.screen == 32){
                    dia.screen = 41;
                } else if(dia.screen == 85){
                    dia.screen = 103;
                }
                else{
                    dia.screen+=1;//not necessarily true bc of decisions moving you places so figure that out
                }

                dia.advance();
                label.setText(dia.text);
                labelI.setIcon(new ImageIcon(dia.image));

                //start a choice
                if (dia.screen == 7 || dia.screen==23 || dia.screen == 58 || dia.screen == 69 || dia.screen==159 || dia.screen==190  || dia.screen==278 || dia.screen==280 || dia.screen==364){
                    panel2.add(buttonC1);
                    buttonC1.setText(dia.btext1); //gets proper text for the choice based on screen
                    panel2.add(buttonC2);
                    buttonC2.setText(dia.btext2); //gets proper text for the choice based on screen
                    panel3.remove(button3);
                    panel3.remove(button6);

                    buttonC1.addActionListener(C1);
                    buttonC2.addActionListener(C2);
                } 
                if(dia.screen == 207 || dia.screen == 243 || dia.screen == 288 || dia.screen == 379 || dia.screen == 416 || dia.screen == 507){
                    panel3.remove(button3);
                    panel3.remove(button);
                    panel3.remove(button2);
                    panel3.remove(button6);
                    panel3.remove(button5);
                }
            }
        };

    button.addActionListener(BL);
    button2.addActionListener(BL2);
    button3.addActionListener(BL3);
    //button4.addActionListener(BL4);
    button5.addActionListener(BL5);
    button6.addActionListener(BL6);

}
}

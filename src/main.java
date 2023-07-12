

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MUHAMMAD KASHIF
 */
public class main {
    public static void main(String[] args) throws InterruptedException
    {
        IMS ims=new IMS();
        ims.setVisible(true);
         ims.progress.setVisible(true);
    for(int i = 0; i <=100; i++)
            {
                        Thread.sleep(100);
                ims.progress.setValue(i);
                ims.number.setText(Integer.toString(i)+" %");
                if(i==10)
                ims.text.setText("Loading...");
                else if(i==30)
                ims.text.setText("Turning On Module...");
                else if(i==50)
                ims.text.setText("Loading Module...");
                else if(i==70)
                ims.text.setText("Connecting To Database...");
                else if(i==90)
                ims.text.setText("Connection Successfully...");
                else if(i==100)
                {
                    login l=new login();
                    l.setVisible(true);
                    ims.dispose();
                }
                    
            }}
    }


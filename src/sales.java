
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MUHAMMAD KASHIF
 */
public class sales extends javax.swing.JFrame {

    /**
     * Creates new form sales
     */
    int user_id=0;
    int c=0,pp;
    ConnectOracle con_obj = new ConnectOracle();
    Connection con=con_obj.EstablishCon();
    PreparedStatement pstmt = null;
    ResultSet res;
 public void assignid(int x)
 {
     user_id=x;
 }
    public sales() {
        
        
            initComponents();
            this.setLocationRelativeTo(null);
        try{    String name,query="select CATEGORY_NAME FROM CATEGORY ORDER BY CATEGORY_ID";
            pstmt = con.prepareStatement(query);
            res = pstmt.executeQuery();
            while (res.next()) {
                name=res.getString(1);
                cat.addItem(name);
            }
        } catch (SQLException ex) {
            Logger.getLogger(sales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public int confirm()
{                 
    String b=B.getText();
    String c=C.getText();
    String d=D.getText();
    String e=E.getText();
    String f=F.getText();
    if(c.length()>0 && b.length()>0&& d.length()>0&& e.length()>0&& f.length()>0)
        return 1;
    return 0;
}
public int confirm1()
{                 
    String b=B.getText();
    String c=C.getText();
    if(c.length()>0 && b.length()>0)
        return 1;
    return 0;
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cat = new javax.swing.JComboBox<>();
        prod = new javax.swing.JComboBox<>();
        F = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        C = new javax.swing.JTextField();
        D = new javax.swing.JTextField();
        E = new javax.swing.JTextField();
        A = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        B = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        G = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SELECT CATEGORY : ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SELECT PRODUCT : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("QUANTITY :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DISCOUNT : ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TOTAL : ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, -1));

        cat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catActionPerformed(evt);
            }
        });
        getContentPane().add(cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 120, 40));

        prod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prodMouseClicked(evt);
            }
        });
        prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodActionPerformed(evt);
            }
        });
        getContentPane().add(prod, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 120, 40));

        F.setText("WALK IN CUSTOMER...");
        F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FMouseClicked(evt);
            }
        });
        getContentPane().add(F, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 180, 90));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ADD ANY SPECIAL INSTRUCTION");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("PRODUCT ID : ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        jLabel10.setText("CHECKOUT");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });
        C.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CKeyTyped(evt);
            }
        });
        getContentPane().add(C, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 60, 30));

        D.setText("0");
        D.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                DMouseMoved(evt);
            }
        });
        D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DMouseClicked(evt);
            }
        });
        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });
        D.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DKeyTyped(evt);
            }
        });
        getContentPane().add(D, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 60, 30));

        E.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                EMouseMoved(evt);
            }
        });
        E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EActionPerformed(evt);
            }
        });
        E.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EKeyTyped(evt);
            }
        });
        getContentPane().add(E, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 60, 30));

        A.setText("SEARCH THROUGH PRODUCT ID");
        A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AMouseClicked(evt);
            }
        });
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });
        getContentPane().add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 220, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/SEARCH.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, -1, -1));

        B.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BMouseMoved(evt);
            }
        });
        B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BMouseClicked(evt);
            }
        });
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });
        B.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BKeyTyped(evt);
            }
        });
        getContentPane().add(B, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 50, 40));

        jButton3.setText("CONFIRM");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, -1, -1));

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/logout.jpg"))); // NOI18N
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, 80, 40));

        G.setColumns(20);
        G.setRows(5);
        jScrollPane1.setViewportView(G);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 220, 150));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/SELLER.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
        // TODO add your handling code here:
        if(confirm1()==1)
        {
            D.setText("");
        }
        else
        {
        JOptionPane.showMessageDialog(null, "Fill Require Field;s!!!");
        }
    }//GEN-LAST:event_DActionPerformed

    private void catActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_catActionPerformed

    private void prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_prodActionPerformed

    private void prodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prodMouseClicked
        // TODO add your handling code here:
          int c=cat.getSelectedIndex();
          prod.removeAllItems();
        try {
            
            String name,query="select PRODUCT_NAME FROM PRODUCT WHERE CATEGORY_ID ="+(c+1)+" ORDER BY PRODUCT_ID";
            pstmt = con.prepareStatement(query);
            res = pstmt.executeQuery();
            while (res.next()) {
                name=res.getString(1);
                prod.addItem(name);
            }
        } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Please Select Product!!!");
        }
     
    }//GEN-LAST:event_prodMouseClicked

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        
        int response=JOptionPane.showConfirmDialog(this, "LOGOUT???","CONFIRM",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(response==JOptionPane.YES_OPTION)
        {
            login l=new login();
        l.setVisible(true);
        dispose();
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_BActionPerformed

    private void BMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BMouseMoved
        // TODO add your handling code here:
        
    }//GEN-LAST:event_BMouseMoved

    private void BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BMouseClicked
        // TODO add your handling code here:
        try { c=0;
      String option=(String) prod.getSelectedItem().toString();
        
            
            String query="select PRODUCT_ID FROM PRODUCT WHERE PRODUCT_NAME = '"+option+"' ";
            pstmt = con.prepareStatement(query);
            res = pstmt.executeQuery();
            while (res.next()) {
                c=Integer.parseInt(res.getString(1));
                B.setText(Integer.toString(c));
            }
        } catch (SQLException ex) {
        
        JOptionPane.showMessageDialog(null, "Hehe I'm here!!!");
        }
        C.setText("");
        E.setText("");
    }//GEN-LAST:event_BMouseClicked

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CActionPerformed

    private void DMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DMouseMoved
        // TODO add your handling code here:
        if(confirm1()==1)
        {
            //
             try { c=0;
        int b=Integer.parseInt(B.getText());
            pp=0;
            String query="select PRODUCT_PRICE  FROM PRODUCT WHERE PRODUCT_ID = "+b;
            pstmt = con.prepareStatement(query);
            res = pstmt.executeQuery();
            while (res.next()) {
                c=Integer.parseInt(res.getString(1));
                pp=c*(Integer.parseInt(C.getText()));
            }
        } catch (SQLException ex) {
        
        JOptionPane.showMessageDialog(null, "Hehe I'm here!!!");
        }
            //
        }
        else
        {
        JOptionPane.showMessageDialog(null, "Enter Required Field!!!");
        }
    }//GEN-LAST:event_DMouseMoved

    private void EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_EActionPerformed

    private void EMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EMouseMoved
        // TODO add your handling code here:
        if(confirm1()==1)
        {
            int d=Integer.parseInt(D.getText());
            if(d>-1 &&d<101)
            {
                int total=0,disc=0;
                disc=(d/100)*pp;
                total=pp-disc;
                E.setText(Integer.toString(total));
            }
            else
            {
        JOptionPane.showMessageDialog(null, "Give Correct Discount Value!!!");
            }
        }
        else
        {
        JOptionPane.showMessageDialog(null, "Fill Require Field's!!!");
        }
    }//GEN-LAST:event_EMouseMoved

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int id=0;
        if(confirm()==1)
        {int si=-1;
            try {
                
                String query="select max(ORDER_ID) FROM ORDER_INFO";
                pstmt = con.prepareStatement(query);
                res = pstmt.executeQuery();
                while (res.next()) {
                    id=Integer.parseInt(res.getString(1));
                }
                } catch (SQLException ex) {
                Logger.getLogger(sales.class.getName()).log(Level.SEVERE, null, ex);
            }
                String b=B.getText();
                int bb=Integer.parseInt(b);
    String c=C.getText();
                int cc=Integer.parseInt(c);
    String d=D.getText();
                int dd=Integer.parseInt(d);
    String e=E.getText();
                int ee=Integer.parseInt(e);
    String f=F.getText();
                //
                 try {
                    String query="select CATEGORY_ID FROM PRODUCT WHERE PRODUCT_ID ="+bb;
                 
                pstmt = con.prepareStatement(query);
                res = pstmt.executeQuery();
                while (res.next()) {
                    si=Integer.parseInt(res.getString(1));
                }} catch (SQLException ex) {
                Logger.getLogger(sales.class.getName()).log(Level.SEVERE, null, ex);
            }
                //
                //
                int pq=0;
                try {
                    String query="select PRODUCT_QUANTITY  FROM PRODUCT WHERE PRODUCT_ID ="+bb;
                 
                pstmt = con.prepareStatement(query);
                res = pstmt.executeQuery();
                while (res.next()) {
                    pq=Integer.parseInt(res.getString(1));
                }} catch (SQLException ex) {
                Logger.getLogger(sales.class.getName()).log(Level.SEVERE, null, ex);
            }
                if(pq>=cc)
                {
                //
                    
                 try {
                     String query="update product set PRODUCT_QUANTITY = "+(pq-cc)+" where PRODUCT_ID ="+bb;
                pstmt = con.prepareStatement(query);
                res = pstmt.executeQuery();
                     query="insert into ORDER_INFO VALUES ("+(id+1)+",sysdate,'"+f+"',"+cc+","+dd+","+ee+","+bb+","+user_id+")";
                pstmt = con.prepareStatement(query);
                res = pstmt.executeQuery();
                 }catch (SQLException ex) {
                Logger.getLogger(sales.class.getName()).log(Level.SEVERE, null, ex);
            }
                 
        JOptionPane.showMessageDialog(null, "ORDER PLACED!!!");
        sales s=new sales();
        s.setVisible(true);
        dispose();
                } else
        {
        JOptionPane.showMessageDialog(null, "SUCH NUMBER OF PRODUCT IS'NT AVIALIBLE!!!");
        }
                
            
        }
        else
        {
        JOptionPane.showMessageDialog(null, "Fill Require Field's!!!");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FMouseClicked
        // TODO add your handling code here:
        F.setText("");
    }//GEN-LAST:event_FMouseClicked

    private void DMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DMouseClicked
        // TODO add your handling code here:
        D.setText("");
    }//GEN-LAST:event_DMouseClicked

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        G.setText("");
        int prodid=Integer.parseInt(A.getText());
         try {
                     String query="SELECT PRODUCT_NAME ,PRODUCT_PRICE,PRODUCT_QUANTITY,PRODUCT_DESCRIPTION  FROM PRODUCT WHERE PRODUCT_ID = "+prodid;
                pstmt = con.prepareStatement(query);
                res = pstmt.executeQuery();
                     
                 while (res.next()) {
                    String display="Product Name: "+res.getString(1)+"\nProduct Price: "+res.getString(2)+"\nProduct Quantity: "+res.getString(3)+"\nProduct Description: "+res.getString(4);
                    G.setText(display);
                 
                }}catch (SQLException ex) {
            
                 
        JOptionPane.showMessageDialog(null, "PRODUCT ID NOT FOUND!!!");}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AMouseClicked
        // TODO add your handling code here:
        A.setText("");
    }//GEN-LAST:event_AMouseClicked

    private void BKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!Character.isDigit(c))
        {
            evt.consume();
        }
    }//GEN-LAST:event_BKeyTyped

    private void CKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!Character.isDigit(c))
        {
            evt.consume();
        }
    }//GEN-LAST:event_CKeyTyped

    private void DKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!Character.isDigit(c))
        {
            evt.consume();
        }
    }//GEN-LAST:event_DKeyTyped

    private void EKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EKeyTyped
        // TODO add your handling code here:
        E.setEditable(false);
    }//GEN-LAST:event_EKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A;
    private javax.swing.JTextField B;
    private javax.swing.JTextField C;
    private javax.swing.JTextField D;
    private javax.swing.JTextField E;
    private javax.swing.JTextField F;
    private javax.swing.JTextArea G;
    private javax.swing.JComboBox<String> cat;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JComboBox<String> prod;
    // End of variables declaration//GEN-END:variables
}

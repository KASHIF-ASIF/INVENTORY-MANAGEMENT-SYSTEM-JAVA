
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
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
public class DEFINE_ROLE extends javax.swing.JFrame {

    /**
     * Creates new form DEFINE_ROLE
     */
    ConnectOracle con_obj = new ConnectOracle();
    Connection con=con_obj.EstablishCon();
    Statement stmt = null;
    PreparedStatement pstmt = null;
    ResultSet res;
    DefaultTableModel d;
    public DEFINE_ROLE() {
        initComponents();
    this.setLocationRelativeTo(null);
    roles();
    }
    public boolean confirminsert()
    {
        String b=B.getText();
        String c=C.getText();
        
        if( b.length()>0 && c.length()>0)
            return true;
        else
            return false;
    }
    public boolean confirm()
    {
        String a=A.getText();
        String b=B.getText();
        String c=C.getText();
        
        if(a.length()>0 && b.length()>0 && c.length()>0)
            return true;
        else
            return false;
    }
    public void roles(){
             int c;
        try {
            String query="select * from ROLE order by ROLE_ID";
            pstmt = con.prepareStatement(query);
            res = pstmt.executeQuery();
            ResultSetMetaData rsd = res.getMetaData();
            c = rsd.getColumnCount();
            d = (DefaultTableModel) roleTable.getModel();
            d.setRowCount(0);
            while (res.next()) {
                Vector v2 = new Vector();
                for (int i = 1; i <= c; i++) {
                    v2.add(res.getString("role_id"));
                    v2.add(res.getString("role_name"));
                    v2.add(res.getString("ROLE_DESCRIPTION"));

                }
                d.addRow(v2);

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
          //  Logger.getLogger(Rooms.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        B = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        A = new javax.swing.JTextField();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        C = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        roleTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/back.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, -1));

        B.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BKeyTyped(evt);
            }
        });
        getContentPane().add(B, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 140, 30));

        jButton4.setText("DELETE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

        A.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AKeyTyped(evt);
            }
        });
        getContentPane().add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 60, 30));

        label3.setBackground(new java.awt.Color(0, 0, 0));
        label3.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("ROLE NAME : ");
        getContentPane().add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 120, -1));

        label4.setBackground(new java.awt.Color(0, 0, 0));
        label4.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("ROLE ID : ");
        getContentPane().add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 90, -1));

        label5.setBackground(new java.awt.Color(0, 0, 0));
        label5.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setText("ROLE DESCRIPTION : ");
        getContentPane().add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        C.setText("MAXIMUM 40 CHARACTER");
        C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CMouseClicked(evt);
            }
        });
        getContentPane().add(C, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 170, 100));

        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, -1, -1));

        jButton2.setText("INSERT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        jButton3.setText("CLEAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, -1, -1));

        roleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ROLE ID", "ROLE NAME", "DESCRIPTION"
            }
        ));
        roleTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roleTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(roleTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 320, 390));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/BLACK.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 440));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/OFF WHITE.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 350, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
A.setText("");
B.setText("");
C.setText("");
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(confirminsert())
        {
        String b=B.getText();
        String c=C.getText();  
      int id=0;
        try {
                String query="select count(ROLE_ID) FROM ROLE";
                pstmt = con.prepareStatement(query);
            res = pstmt.executeQuery();
                    while (res.next()) {
                id=Integer.parseInt(res.getString(1));
            }
            } catch (SQLException ex) {
            try {
                String query="select max(ROLE_ID) FROM ROLE";
                pstmt = con.prepareStatement(query);
                res = pstmt.executeQuery();
                while (res.next()) {
                    id=Integer.parseInt(res.getString(1));
                }
            } catch (SQLException ex1) {
                Logger.getLogger(DEFINE_ROLE.class.getName()).log(Level.SEVERE, null, ex1);
            }
            }
            try {
                String query="insert into ROLE VALUES("+(id+1)+",'"+b+"','"+c+"')";
                pstmt = con.prepareStatement(query);
            res = pstmt.executeQuery();
            roles();
            } catch (SQLException ex) {
                Logger.getLogger(DEFINE_ROLE.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
        JOptionPane.showMessageDialog(null, "Insert Require Information!!!");
        }
           A.setText("");
B.setText("");
C.setText("");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Admin_Dashboard ad = new Admin_Dashboard();
        ad.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void roleTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roleTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tmodel=(DefaultTableModel)roleTable.getModel();
        int selectrowindex=roleTable.getSelectedRow();
        A.setText(tmodel.getValueAt(selectrowindex,0).toString());
        B.setText(tmodel.getValueAt(selectrowindex,1).toString());
        C.setText(tmodel.getValueAt(selectrowindex,2).toString());
        
    }//GEN-LAST:event_roleTableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
         if(confirm())
        {
            String a=A.getText();
            int id=Integer.parseInt(a);
        String b=B.getText();
        String c=C.getText();  
            try {
                String query="update role  set role_name='"+b+"',role_description='"+c+"' where role_id="+id;
                pstmt = con.prepareStatement(query);
            res = pstmt.executeQuery();
        JOptionPane.showMessageDialog(null, "Record Updated!!!");
            roles();
            } catch (SQLException ex) {
                Logger.getLogger(DEFINE_ROLE.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
        JOptionPane.showMessageDialog(null, "Insert Require Information!!!");
        }
        A.setText("");
B.setText("");
C.setText("");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         if(confirm())
        {
            String a=A.getText();
            int id=Integer.parseInt(a);  
            try {
                String query="delete from role where role_id="+id;
                pstmt = con.prepareStatement(query);
            res = pstmt.executeQuery();
        JOptionPane.showMessageDialog(null, "Record Deleted!!!");
            roles();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Can'nt able to delete Record!!!");
                Admin_Dashboard ad=new Admin_Dashboard();
                ad.setVisible(true);
                dispose();
            }
        }
        else
        {
        JOptionPane.showMessageDialog(null, "Insert Require Information!!!");
        }
         A.setText("");
B.setText("");
C.setText("");

    }//GEN-LAST:event_jButton4ActionPerformed

    private void AKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AKeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar();
        if(!Character.isDigit(c))
        {
            evt.consume();
        }
    }//GEN-LAST:event_AKeyTyped

    private void BKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c))
        {
            B.setEditable(true);
        }
        else
        {
            B.setEditable(false);
        }
    }//GEN-LAST:event_BKeyTyped

    private void CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CMouseClicked
        // TODO add your handling code here:
        C.setText("");
    }//GEN-LAST:event_CMouseClicked

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
            java.util.logging.Logger.getLogger(DEFINE_ROLE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DEFINE_ROLE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DEFINE_ROLE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DEFINE_ROLE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DEFINE_ROLE().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A;
    private javax.swing.JTextField B;
    private javax.swing.JTextField C;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private javax.swing.JTable roleTable;
    // End of variables declaration//GEN-END:variables
}
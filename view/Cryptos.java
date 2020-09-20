//H main klash me to UI kai anoigma arxeiwn
package view;

import controller.DecController;
import controller.EncController;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import javax.swing.JFileChooser;

/**
 *
 * @Egor public
 */
public class Cryptos extends javax.swing.JFrame {
      private String filename="";
      private String Keyfilename="";
      private String key;
      int returnVal=0;
      private File myFile=null;
      private File  myKeyFile=null;
      private String text;
      private String Ciphertext;
      //private  byte[] arrayKey ;
   
    public Cryptos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FileChooser = new javax.swing.JFileChooser();
        Jpanel1 = new javax.swing.JTabbedPane();
        Encryptions = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EncTextArea = new javax.swing.JTextArea();
        EncChooseFileButton = new javax.swing.JButton();
        EncMethod = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        EncButton = new javax.swing.JButton();
        Decryptions = new javax.swing.JPanel();
        DecChooseFileButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        DecMethod = new javax.swing.JComboBox<>();
        DecChooseKeyButton = new javax.swing.JButton();
        DecryptButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        DecTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        EncTextArea.setColumns(20);
        EncTextArea.setRows(5);
        jScrollPane1.setViewportView(EncTextArea);

        EncChooseFileButton.setText("Choose File");
        EncChooseFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncChooseFileButtonActionPerformed(evt);
            }
        });

        EncMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DES", "AES", "DESede" }));

        jLabel1.setText("Encryption Method:");

        EncButton.setText("Encrypt");
        EncButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EncryptionsLayout = new javax.swing.GroupLayout(Encryptions);
        Encryptions.setLayout(EncryptionsLayout);
        EncryptionsLayout.setHorizontalGroup(
            EncryptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncryptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EncryptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(EncryptionsLayout.createSequentialGroup()
                        .addGroup(EncryptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(EncButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EncChooseFileButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(EncMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        EncryptionsLayout.setVerticalGroup(
            EncryptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncryptionsLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(EncryptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EncMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(EncChooseFileButton))
                .addGap(31, 31, 31)
                .addComponent(EncButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        Jpanel1.addTab("Encryptions", Encryptions);

        DecChooseFileButton.setText("Choose File");
        DecChooseFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecChooseFileButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Encryption Method:");

        DecMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DES", "AES", "DESede" }));

        DecChooseKeyButton.setText("Choose Key");
        DecChooseKeyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecChooseKeyButtonActionPerformed(evt);
            }
        });

        DecryptButton.setText("Decrypt");
        DecryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecryptButtonActionPerformed(evt);
            }
        });

        DecTextArea.setColumns(20);
        DecTextArea.setRows(5);
        jScrollPane2.setViewportView(DecTextArea);

        javax.swing.GroupLayout DecryptionsLayout = new javax.swing.GroupLayout(Decryptions);
        Decryptions.setLayout(DecryptionsLayout);
        DecryptionsLayout.setHorizontalGroup(
            DecryptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DecryptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DecryptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DecryptionsLayout.createSequentialGroup()
                        .addComponent(DecChooseFileButton)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(DecMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(DecChooseKeyButton))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DecryptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        DecryptionsLayout.setVerticalGroup(
            DecryptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DecryptionsLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(DecryptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DecChooseFileButton)
                    .addComponent(jLabel2)
                    .addComponent(DecMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DecChooseKeyButton))
                .addGap(36, 36, 36)
                .addComponent(DecryptButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        Jpanel1.addTab("Decryptions", Decryptions);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Jpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jpanel1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DecChooseFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecChooseFileButtonActionPerformed
       openFile();   
       if(filename!=""){
           try{
           FileReader fr=new FileReader(filename);
           DecTextArea.read(fr, null);
           text=DecTextArea.getText();
           
           fr.close();
           }
           catch(Exception e){
               //exception code
           }
       }
    }//GEN-LAST:event_DecChooseFileButtonActionPerformed

    private void EncChooseFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncChooseFileButtonActionPerformed
       openFile();
       if(filename!=""){
           try{
           FileReader fr=new FileReader(filename);
           EncTextArea.read(fr, null);
           text=EncTextArea.getText();
           fr.close();
           }
           catch(Exception e){
               //exception code
           }
          
       }
    }//GEN-LAST:event_EncChooseFileButtonActionPerformed

    private void EncButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncButtonActionPerformed
        EncController myEncControl=new EncController(EncMethod.getSelectedItem().toString());
        String test=myEncControl.Encrypt(filename, text);
        EncTextArea.setText(test);
    }//GEN-LAST:event_EncButtonActionPerformed

    private void DecChooseKeyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecChooseKeyButtonActionPerformed
        openKeyFile();
         if(Keyfilename!=""){
           try{
           //arrayKey = Files.readAllBytes(myKeyFile.toPath());
           FileReader fr=new FileReader(myKeyFile);
           
           DecTextArea.read(fr, null);
           key=DecTextArea.getText();
           DecTextArea.setText("");
           fr.close();
           }
           catch(Exception e){
               //exception code
           }
         }
    }//GEN-LAST:event_DecChooseKeyButtonActionPerformed

    private void DecryptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecryptButtonActionPerformed
       DecController myDecController=new DecController(DecMethod.getSelectedItem().toString(),key);
      // DecController myDecController=new DecController(DecMethod.getSelectedItem().toString(),arrayKey);  se bytes
       String test2=myDecController.Decrypt(filename, text);
       DecTextArea.setText(test2);
    }//GEN-LAST:event_DecryptButtonActionPerformed

     private void openKeyFile(){
        FileWriter fw;
        returnVal=FileChooser.showOpenDialog(this);
        myKeyFile =FileChooser.getSelectedFile();
        if(myKeyFile!=null &&  returnVal==JFileChooser.APPROVE_OPTION){
          Keyfilename=myFile.getPath();  
        }
    }
    
    private void openFile(){
        FileWriter fw;
        returnVal=FileChooser.showOpenDialog(this);
        myFile =FileChooser.getSelectedFile();
        if(myFile!=null &&  returnVal==JFileChooser.APPROVE_OPTION){
          filename=myFile.getPath();  
        }
    }
  
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
            java.util.logging.Logger.getLogger(Cryptos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cryptos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cryptos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cryptos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cryptos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DecChooseFileButton;
    private javax.swing.JButton DecChooseKeyButton;
    private javax.swing.JComboBox<String> DecMethod;
    private javax.swing.JTextArea DecTextArea;
    private javax.swing.JButton DecryptButton;
    private javax.swing.JPanel Decryptions;
    private javax.swing.JButton EncButton;
    private javax.swing.JButton EncChooseFileButton;
    private javax.swing.JComboBox<String> EncMethod;
    private javax.swing.JTextArea EncTextArea;
    private javax.swing.JPanel Encryptions;
    private javax.swing.JFileChooser FileChooser;
    private javax.swing.JTabbedPane Jpanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}

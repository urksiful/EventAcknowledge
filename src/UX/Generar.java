package UX;




import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author urksi
 */
public class Generar extends javax.swing.JFrame {
    String dateCourse;
    String typeCourse;
    String nameCourse;
    public Generar() {
        initComponents();
        
    }
    public void setCurrentCourseInfo(){
        File courseDir = new File("C:/izcaliCourses/current.izd");
        FileReader frc;
        try {
            frc = new FileReader(courseDir);
            BufferedReader brc = new BufferedReader(frc);
            StringTokenizer st = new StringTokenizer(brc.readLine(), "*");
            typeCourse = st.nextToken();
            nameCourse = st.nextToken();
            dateCourse = st.nextToken();
            
            brc.close();
            frc.close();
        } catch (FileNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Filed Not Found operation Code 32");
        } catch (IOException ex) {
          JOptionPane.showMessageDialog(null,"ERROR in the CLOSED operation Code ");
        }
        
       
    }
    public boolean isNotEmpty(){
        if(!FieldCompleto.getText().equals("") && !FieldCorreo.getText().equals("") && !FieldID.getText().equals("")){
            return true;
        }else{
            return false;
        }
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        FieldCompleto = new javax.swing.JTextField();
        FieldCorreo = new javax.swing.JTextField();
        FieldID = new javax.swing.JTextField();
        ButtonEnviar = new javax.swing.JButton();
        FieldPaterno = new javax.swing.JTextField();
        FieldMaterno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(232, 129, 12));
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 102));
        jLabel1.setText("Información del Alumno");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre (s):");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Correo:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Reg ID:");

        FieldCompleto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FieldCompletoMousePressed(evt);
            }
        });

        FieldCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FieldCorreoMousePressed(evt);
            }
        });

        FieldID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FieldIDMousePressed(evt);
            }
        });

        ButtonEnviar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtonEnviar.setText("Generar y Enviar");
        ButtonEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonEnviarMousePressed(evt);
            }
        });

        FieldPaterno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FieldPaternoMousePressed(evt);
            }
        });

        FieldMaterno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FieldMaternoMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("A. Materno:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("A. Paterno:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FieldCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FieldPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FieldMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(ButtonEnviar)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(FieldCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FieldPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FieldMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(FieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(FieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(ButtonEnviar)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonEnviarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonEnviarMousePressed
        if(isNotEmpty()){
            genConstance();
        }else{
            JOptionPane.showMessageDialog(null, "Llena todos los campos");
        }
    }//GEN-LAST:event_ButtonEnviarMousePressed

    private void FieldCompletoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FieldCompletoMousePressed
        FieldCompleto.setText("");
    }//GEN-LAST:event_FieldCompletoMousePressed

    private void FieldPaternoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FieldPaternoMousePressed
        FieldPaterno.setText("");
    }//GEN-LAST:event_FieldPaternoMousePressed

    private void FieldMaternoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FieldMaternoMousePressed
        FieldMaterno.setText("");
    }//GEN-LAST:event_FieldMaternoMousePressed

    private void FieldCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FieldCorreoMousePressed
        FieldCorreo.setText("");
    }//GEN-LAST:event_FieldCorreoMousePressed

    private void FieldIDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FieldIDMousePressed
        FieldID.setText("");
    }//GEN-LAST:event_FieldIDMousePressed
    public void genConstance(){
        setCurrentCourseInfo();
        String names = FieldCompleto.getText().toUpperCase();
        String lastname =  FieldPaterno.getText().toUpperCase();
        String last2name = FieldMaterno.getText().toUpperCase();
        String email = FieldCorreo.getText().toLowerCase();
        String registro = FieldID.getText();
        
        Scripts.GenIdIzcali id = new Scripts.GenIdIzcali();
        String idz = id.setIzcaliID(names, lastname, registro);
        
        File bd = new File("C:/izcaliCourses/bdConstances.izd");
        if(!bd.exists()){
            try {
                bd.createNewFile();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error in the BD build proccess Code 139");
            }
        }
        
        try {
            FileReader frb = new FileReader(bd);
            BufferedReader brb = new BufferedReader(frb);
            ArrayList<String> tmpConstances = new ArrayList();
            String line = "";
            
            while((line = brb.readLine()) != null){
                tmpConstances.add(line);
            }
            
            brb.close();
            frb.close();
            
            bd.delete();
            bd.createNewFile();
            
            FileWriter fwb = new FileWriter(bd, true);
            //id_iz*id_reg*fname*lname*2lname*email*course_date
            fwb.write(idz+"*"+registro+"*"+names+"*"+lastname+"*"+last2name+"*"+email+"*"+nameCourse+"*"+dateCourse+"*"+typeCourse+"\r\n");
            
            for (String xf:tmpConstances) {
                fwb.write(xf+"\r\n");
            }
            Scripts.PDFMaker mpdf = new Scripts.PDFMaker();
            File ruta = new File("C:/izcaliCourses/constancesPath.izd");
            FileReader fr = new FileReader(ruta);
            BufferedReader br = new BufferedReader(fr);
            String pathConstance = br.readLine();
            
            br.close();
            fr.close();
            
            mpdf.genPdf(registro+"-"+names+" "+lastname, pathConstance);
            JOptionPane.showMessageDialog(null, "Constancia Generada y Enviada Exitosamente"
                    + "\n ID: "+idz);
            fwb.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error in the BD lecture Code 146");
        }
        
        
    }
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
            java.util.logging.Logger.getLogger(Generar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Generar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Generar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Generar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Generar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonEnviar;
    private javax.swing.JTextField FieldCompleto;
    private javax.swing.JTextField FieldCorreo;
    private javax.swing.JTextField FieldID;
    private javax.swing.JTextField FieldMaterno;
    private javax.swing.JTextField FieldPaterno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

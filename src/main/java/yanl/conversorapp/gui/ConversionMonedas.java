package yanl.conversorapp.gui;

import javax.swing.JOptionPane;
import yanl.conversorapp.logical.LogicaConversiones;
import yanl.conversorapp.logical.OperacionConversion;

public class ConversionMonedas extends javax.swing.JFrame {
    
    private OperacionConversion funcionalidad = new LogicaConversiones();
    private double cantidadIngresada;
    private String resultado;

    public ConversionMonedas(double cantidadIngresada) {
        initComponents();
        this.cantidadIngresada = cantidadIngresada;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        opcionesConversionMonedas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Elige la moneda a la que quieres convertir tu dinero:");

        opcionesConversionMonedas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "De Soles a Dólares", "De Soles a Euros", "De soles a Libras Esterlinas", "De Soles a Yen Japonés", "De Soles a Won Surcoreano", "De Dólares a Soles", "De Euros a Soles", "De Libras Esterlinas a Soles", "De Yen Japonés a Soles", "De Won Surcoreano a Soles" }));
        opcionesConversionMonedas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesConversionMonedasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                    .addComponent(opcionesConversionMonedas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opcionesConversionMonedas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
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

    private void opcionesConversionMonedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesConversionMonedasActionPerformed
        String opcionSeleccionada = (String) opcionesConversionMonedas.getSelectedItem();
        dispose();
        resultado = funcionalidad.conversion(opcionSeleccionada, cantidadIngresada);
        JOptionPane.showMessageDialog(null, "Tienes: "+ resultado);
        dispose();
        int continuar = JOptionPane.showConfirmDialog(null, "Continuar?");
        
        if(continuar == 0){
            
            MenuPrincipal menuPrincipal = new MenuPrincipal();
            menuPrincipal.setVisible(true);
            menuPrincipal.setLocationRelativeTo(null);
            
        } else if (continuar == 1) {
            
            JOptionPane.showMessageDialog(null, "Programa terminado");
            dispose();
            
        } 
        
        
        
    }//GEN-LAST:event_opcionesConversionMonedasActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> opcionesConversionMonedas;
    // End of variables declaration//GEN-END:variables
}

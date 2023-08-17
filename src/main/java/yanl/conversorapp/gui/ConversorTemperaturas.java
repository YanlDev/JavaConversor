package yanl.conversorapp.gui;

import javax.swing.JOptionPane;
import yanl.conversorapp.logical.LogicaConversionesTemp;
import yanl.conversorapp.logical.OperacionConversion;

public class ConversorTemperaturas extends javax.swing.JFrame {
    private OperacionConversion funcionalidad = new LogicaConversionesTemp();
    private double cantidadIngresada;
    private String resultado;

    public ConversorTemperaturas(double cantidadIngresada) {
        initComponents();
        this.cantidadIngresada = cantidadIngresada;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        opcionesConversionTemperatura = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Elije una opción para convertir");

        opcionesConversionTemperatura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "De Celsius a Kelvin", "De Celsius a Fahrenheit", "De Kelvin a Celsius", "De Kelvin a Fahrenheit", "De Fahrenheit a Celsius", "De Fahrenheit a Kelvin" }));
        opcionesConversionTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesConversionTemperaturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                    .addComponent(opcionesConversionTemperatura, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opcionesConversionTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcionesConversionTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesConversionTemperaturaActionPerformed
        
        String opcionSeleccionada = (String) opcionesConversionTemperatura.getSelectedItem();
        
        dispose();
        resultado = funcionalidad.conversion(opcionSeleccionada, cantidadIngresada);
        JOptionPane.showMessageDialog(null,resultado);
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
        
    }//GEN-LAST:event_opcionesConversionTemperaturaActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> opcionesConversionTemperatura;
    // End of variables declaration//GEN-END:variables
}

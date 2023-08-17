package yanl.conversorapp.gui;

import javax.swing.JOptionPane;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        opcionesConversion = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Seleccione una opción de conversión");

        opcionesConversion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Conversor de Moneda", "Conversor de Temperatura" }));
        opcionesConversion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesConversionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                    .addComponent(opcionesConversion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opcionesConversion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
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

    private void opcionesConversionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesConversionActionPerformed
        String seleccionMenu = (String) opcionesConversion.getSelectedItem();
        
        switch (seleccionMenu) {
            case "Conversor de Moneda":
                String inputValor = JOptionPane.showInputDialog(this, 
                    "Ingrese la cantidad de dinero que vas a convertir:");
                if(inputValor != null && !inputValor.isEmpty()){
                    try {
                        double inputNum = Double.parseDouble(inputValor); 
                        
                        dispose();
                        
                        ConversionMonedas operacionesConversion = new ConversionMonedas(inputNum);
                        operacionesConversion.setVisible(true);
                        operacionesConversion.setLocationRelativeTo(null);

                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Entrada inválida. Debe ingresar un número.");
                    }
                }
                break;
  
            case "Conversor de Temperatura":
                String inputTemperatura = JOptionPane.showInputDialog(this, 
                    "Ingrese el valor de la temperatura que desea convertir:");
                
                if(inputTemperatura != null && !inputTemperatura.isEmpty()){
                    try {
                        double inputNumTemp = Double.parseDouble(inputTemperatura); 
                     
                        dispose();
                        
                        ConversorTemperaturas operacionesConversion = new ConversorTemperaturas(inputNumTemp);
                        operacionesConversion.setVisible(true);
                        operacionesConversion.setLocationRelativeTo(null);

                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Entrada inválida. Debe ingresar un número.");
                    }
                }
                
        }
        
    }//GEN-LAST:event_opcionesConversionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> opcionesConversion;
    // End of variables declaration//GEN-END:variables
}

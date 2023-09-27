package universidadgrupo58.vistas;

import javax.swing.JOptionPane;
import universidadgrupo58.accesoADatos.MateriaData;
import universidadgrupo58.entidades.Materia;

public class Materias extends javax.swing.JInternalFrame {

    public Materias() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTCodigo = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTAnio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jREstado = new javax.swing.JRadioButton();
        jBNuevo = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel1.setText("Materia");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setText("Código:");

        jBBuscar.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setText("Año:");

        jTAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTAnioActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setText("Estado:");

        jBNuevo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBEliminar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBGuardar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBSalir.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jBNuevo)))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(jBGuardar))
                            .addComponent(jREstado)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTAnio, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBBuscar)))
                        .addGap(18, 18, 18)
                        .addComponent(jBSalir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jREstado)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo)
                    .addComponent(jBEliminar)
                    .addComponent(jBGuardar)
                    .addComponent(jBSalir))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jTAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTAnioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTAnioActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
    try{MateriaData md = new MateriaData();
    Materia mat = md.buscarMateria(Integer.parseInt(jTCodigo.getText()));
    jTNombre.setText(mat.getNombre());
    jTAnio.setText(mat.getAnioMateria()+"");
    jREstado.setSelected(true);
    }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null, "Ingrese un número válido");
    }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        MateriaData md = new MateriaData();
        try{Materia mat = md.buscarMateria(Integer.parseInt(jTCodigo.getText()));
                if (mat.getIdMateria() == Integer.parseInt(jTCodigo.getText())){
                    mat.setAnioMateria(Integer.parseInt(jTAnio.getText()));
                    mat.setNombre(jTNombre.getText());
                    mat.setActivo(jREstado.isSelected());
                    md.modificarMateria(mat);
                }else{
                    mat.setAnioMateria(Integer.parseInt(jTAnio.getText()));
                    mat.setNombre(jTNombre.getText());
                    mat.setActivo(jREstado.isSelected());
                    md.guardarMateria(mat);
                }
        }catch(NumberFormatException nfe){
            try{
        Materia mat = new Materia();
        mat.setActivo(jREstado.isSelected());        
        mat.setAnioMateria(Integer.parseInt(jTAnio.getText()));
        mat.setNombre(jTNombre.getText());
        md.guardarMateria(mat);
            } catch (NumberFormatException nfe2){
            JOptionPane.showMessageDialog(null, "Ingrese un número válido");
            }
            
        }
        
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        jTCodigo.setText("");
        jTNombre.setText("");
        jTAnio.setText("");
        jREstado.setSelected(false);
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        MateriaData md = new MateriaData();
        try{
        Materia mat = md.buscarMateria(Integer.parseInt(jTCodigo.getText()));
        md.eliminarMateria(mat.getIdMateria());
        } catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Ingrese un número válido");
        }
    }//GEN-LAST:event_jBEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jREstado;
    private javax.swing.JTextField jTAnio;
    private javax.swing.JTextField jTCodigo;
    private javax.swing.JTextField jTNombre;
    // End of variables declaration//GEN-END:variables
}

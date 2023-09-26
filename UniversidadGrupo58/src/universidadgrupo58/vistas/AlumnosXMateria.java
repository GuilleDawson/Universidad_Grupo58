package universidadgrupo58.vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import universidadgrupo58.accesoADatos.AlumnoData;
import universidadgrupo58.accesoADatos.InscripcionData;
import universidadgrupo58.accesoADatos.MateriaData;
import universidadgrupo58.entidades.Alumno;
import universidadgrupo58.entidades.Materia;

public class AlumnosXMateria extends javax.swing.JInternalFrame {

   
    private InscripcionData inscData;
    
    private DefaultTableModel modelo;
    public AlumnosXMateria() {
        initComponents();
        modelo = new DefaultTableModel();
        inscData = new InscripcionData();
        cargarComboBox();
        armarCabecera();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCBMaterias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAlumnos = new javax.swing.JTable();
        jBSalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Listado de Alumnos por Materia");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setText("Seleccione una Materia");

        jCBMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBMateriasActionPerformed(evt);
            }
        });

        jTAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTAlumnos);

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(51, 51, 51)
                        .addComponent(jCBMaterias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBSalir)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCBMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBSalir)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
    this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jCBMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBMateriasActionPerformed
    borrarFilaTabla();
    cargaDatosAlumnosInscriptos();
    
    }//GEN-LAST:event_jCBMateriasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<Materia> jCBMaterias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTAlumnos;
    // End of variables declaration//GEN-END:variables

private void cargarComboBox(){
        MateriaData ad = new MateriaData();
        Materia mat = new Materia();
        List <Materia>materias = new ArrayList <>();
        materias = ad.listarMaterias();
        for (Materia materia: materias){
            jCBMaterias.addItem(materia);
        }
    }

private void armarCabecera(){
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID");
        filaCabecera.add("DNI");
        filaCabecera.add("Apellido");
        filaCabecera.add("Nombre");
        for(Object it: filaCabecera) {
            modelo.addColumn(it);
        }
        jTAlumnos.setModel(modelo);
        
    }
private void borrarFilaTabla(){
        int indice = modelo.getRowCount() -1;
        
        for(int i = indice;i>=0;i--){
            modelo.removeRow(i); 
        }
    }


        private void cargaDatosAlumnosInscriptos(){
        Materia selec = (Materia)jCBMaterias.getSelectedItem();
        List<Alumno> lista = inscData.obtenerAlumnosXMateria(selec.getIdMateria());
        for(Alumno a: lista) {
            modelo.addRow(new Object[]{a.getIdAlumno(),a.getDni(),a.getApellido(),a.getNombre()});
        }  
        }
}



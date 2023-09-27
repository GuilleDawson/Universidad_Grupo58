package universidadgrupo58.vistas;

import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;
import universidadgrupo58.accesoADatos.AlumnoData;
import universidadgrupo58.accesoADatos.InscripcionData;
import universidadgrupo58.accesoADatos.MateriaData;
import universidadgrupo58.entidades.Alumno;
import universidadgrupo58.entidades.Inscripcion;
import universidadgrupo58.entidades.Materia;

public class FormularioDeInscripcion extends javax.swing.JInternalFrame {

private List<Materia> listaM;
private List<Alumno> listaA;
private InscripcionData inscData;   
private MateriaData mData;
private AlumnoData aData;

private DefaultTableModel modelo;

public FormularioDeInscripcion() {
        initComponents();
        
        aData = new AlumnoData();
        listaA = aData.listarAlumnos();
        modelo = new DefaultTableModel();
        inscData = new InscripcionData();
        
        cargarComboBox();
        armarCabecera();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCBAlumnos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jRSi = new javax.swing.JRadioButton();
        jRNo = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jBInscribir = new javax.swing.JButton();
        jBAnular = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Formulario de Inscripcion");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setText("Seleccione un alumno:");

        jCBAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBAlumnosActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Listado de materias");

        buttonGroup1.add(jRSi);
        jRSi.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jRSi.setText("Materias inscriptas");
        jRSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRSiActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRNo);
        jRNo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jRNo.setText("Materias No inscriptas");
        jRNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRNoActionPerformed(evt);
            }
        });

        jTabla.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Año"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTabla.setCellSelectionEnabled(true);
        jScrollPane2.setViewportView(jTabla);
        jTabla.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (jTabla.getColumnModel().getColumnCount() > 0) {
            jTabla.getColumnModel().getColumn(0).setResizable(false);
            jTabla.getColumnModel().getColumn(1).setResizable(false);
            jTabla.getColumnModel().getColumn(2).setResizable(false);
        }

        jBInscribir.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jBInscribir.setText("Inscribir");
        jBInscribir.setEnabled(false);
        jBInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInscribirActionPerformed(evt);
            }
        });

        jBAnular.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jBAnular.setText("Anular inscripcion");
        jBAnular.setEnabled(false);
        jBAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAnularActionPerformed(evt);
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
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel2)
                                .addGap(32, 32, 32)
                                .addComponent(jCBAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBInscribir)
                                        .addGap(49, 49, 49)
                                        .addComponent(jBAnular)
                                        .addGap(44, 44, 44)
                                        .addComponent(jBSalir)))))
                        .addContainerGap(58, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRSi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRNo)
                        .addGap(37, 37, 37))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCBAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRSi)
                    .addComponent(jRNo))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAnular)
                    .addComponent(jBSalir)
                    .addComponent(jBInscribir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(340, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRSiActionPerformed
      borrarFilaTabla();
      cargaDatosInscriptas();
      jBAnular.setEnabled(true);
      jBInscribir.setEnabled(false);
      
    }//GEN-LAST:event_jRSiActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jCBAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBAlumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBAlumnosActionPerformed

    private void jBInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInscribirActionPerformed
    
//         aca va el boton inscribir
//           
//           InscripcionData ad = new InscripcionData();
//           Inscripcion insc = new Inscripcion();
//           Alumno alumnoSeleccionado=(Alumno)jCBAlumnos.getSelectedItem();
//           Materia materiaSeleccionada=(Materia)jCMaterias.getSelectedItem();
//           insc.setAlumno(alumnoSeleccionado);
//           insc.setMateria(materiaSeleccionada);
//           ad.guardarInscripcion(insc);
        int filaSeleccionada=jTabla.getSelectedRow();
        if (filaSeleccionada!=-1){
            Alumno a=(Alumno)jCBAlumnos.getSelectedItem();
            
            int idMateria=(Integer)modelo.getValueAt(filaSeleccionada, 0);
            String nombreMateria=(String)modelo.getValueAt(filaSeleccionada, 1);
            int anio=(Integer)modelo.getValueAt(filaSeleccionada, 2);
            Materia m= new Materia(idMateria,nombreMateria,anio,true);
            
            Inscripcion i= new Inscripcion(a,m,0);
            inscData.guardarInscripcion(i);
            borrarFilaTabla();
        }
     
    }//GEN-LAST:event_jBInscribirActionPerformed

    private void jRNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRNoActionPerformed
      borrarFilaTabla();
      cargaDatosNoInscriptas();
      jBAnular.setEnabled(false);
      jBInscribir.setEnabled(true);
    }//GEN-LAST:event_jRNoActionPerformed

    private void jBAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnularActionPerformed
        int filaSeleccionada=jTabla.getSelectedRow();
        if (filaSeleccionada!=-1){
        Alumno a=(Alumno)jCBAlumnos.getSelectedItem();
        int idMateria=(Integer)modelo.getValueAt(filaSeleccionada, 0);
                
                inscData.borrarInscripcionMateriaAlumno(a.getIdAlumno(), idMateria);
                borrarFilaTabla();
    }//GEN-LAST:event_jBAnularActionPerformed
    }
    private ButtonGroup buttonGroup;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBAnular;
    private javax.swing.JButton jBInscribir;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<Alumno> jCBAlumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRNo;
    private javax.swing.JRadioButton jRSi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTabla;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
   
    private void cargarComboBox(){
        AlumnoData ad = new AlumnoData();
        Alumno alu = new Alumno();
        List <Alumno>alumnos = new ArrayList <>();
        alumnos = ad.listarAlumnosAlu();
        for (Alumno alumno: alumnos){
            jCBAlumnos.addItem(alumno);
        }
    }
    
    

    private void armarCabecera(){
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID");
        filaCabecera.add("Nombre");
        filaCabecera.add("Año");
        for(Object it: filaCabecera) {
            modelo.addColumn(it);
        }
        jTabla.setModel(modelo);
        
    }
    private void borrarFilaTabla(){
        int indice = modelo.getRowCount() -1;
        
        for(int i = indice;i>=0;i--){
            modelo.removeRow(i); 
        }
    }
    
    private void cargaDatosNoInscriptas(){
        Alumno selec = (Alumno)jCBAlumnos.getSelectedItem();
        listaM = inscData.obtenerMateriasNoCursadas(selec.getIdAlumno());
        for(Materia m: listaM) {
            modelo.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getAnioMateria()});
        }  
        }
    
    private void cargaDatosInscriptas(){
        Alumno selec = (Alumno)jCBAlumnos.getSelectedItem();
        List<Materia> lista = inscData.obtenerMateriasCursadas(selec.getIdAlumno());
        for(Materia m: lista) {
            modelo.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getAnioMateria()});
        }  
        }
    

}

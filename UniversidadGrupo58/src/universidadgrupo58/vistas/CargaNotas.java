package universidadgrupo58.vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadgrupo58.accesoADatos.AlumnoData;
import universidadgrupo58.accesoADatos.InscripcionData;
import universidadgrupo58.entidades.Alumno;

public class CargaNotas extends javax.swing.JInternalFrame {
    private final DefaultTableModel model = new DefaultTableModel(){
        
        //Método sobreescrito que sirve para indicar cuál celda es editable
        @Override
        public boolean isCellEditable(int row, int column) {
            //Devuelve TRUE si la columna seleccionada es la 2, si es así, permitirá su edición, caso contrario no podrá ser editada esa columna.
            return column == 2;
        }
        
    };
    
    //Declaración de variable alum para usar los métodos de AlumData
    AlumnoData alum = new AlumnoData();
    //Lista que servirá para guardar los alumnos del jComboBox1 para utilizarlos más adelante
    List <Alumno> alumnos = new ArrayList();

    public CargaNotas() {
        initComponents();
        
        //Agrega columnas al model para luego aplicarlas a la tabla
        model.addColumn("Código");
        model.addColumn("Nombre");
        model.addColumn("Nota");
        
        //Carga el model a la tabla
        jTable1.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Carga de Notas");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setText("Alumno:");

        AlumnoData alum = new AlumnoData();

        jComboBox1.addItem("<Seleccionar Alumno>");

        for(int i = 0; i < alum.listarAlumnos().size(); i++){
            jComboBox1.addItem(alum.listarAlumnos().get(i).toString());
        }
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Nota"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jButton1)
                        .addGap(52, 52, 52)
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(81, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        //Verifica si el item seleccionado es diferente a <Seleccionar Alumno>
        if (jComboBox1.getSelectedItem() != "<Seleccionar Alumno>") {
            //Elimina el item <Seleccionar alumnos> cuando se selecciona otro item distinto a este
            jComboBox1.removeItem("<Seleccionar Alumno>");

            //Elimina todos los datos cargados en la lista de alumnos
            alumnos.clear();

            //Agrega alumnos existentes en una lista que nos servirá para acceder a el ID y utilizarlo en otros métodos
            for (int i = 0; i < jComboBox1.getItemCount(); i++) {
                alumnos.add(alum.listarAlumnos().get(i));
            }

            //Declaración de variables y valores
            InscripcionData ins = new InscripcionData();
            Object[] datos = new Object[3];

            //Elimina todos los datos existentes de la tabla para cargar los nuevos
            while (model.getRowCount() != 0) {
                model.removeRow(0);
            }

            //Carga datos en un arreglo para luego actualizar la tabla con los valores aquí guardados
            for (int i = 0; i < ins.obtenerInscripcionesPorAlumno(alumnos.get(jComboBox1.getSelectedIndex()).getIdAlumno()).size(); i++) {
                datos[0] = ins.obtenerInscripcionesPorAlumno(alumnos.get(jComboBox1.getSelectedIndex()).getIdAlumno()).get(i).getMateria().getIdMateria();
                datos[1] = ins.obtenerInscripcionesPorAlumno(alumnos.get(jComboBox1.getSelectedIndex()).getIdAlumno()).get(i).getMateria().getNombre();
                datos[2] = ins.obtenerInscripcionesPorAlumno(alumnos.get(jComboBox1.getSelectedIndex()).getIdAlumno()).get(i).getNota();

                //Actualiza la tabla
                model.addRow(datos);

            }
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Declaración de variables
        InscripcionData ins = new InscripcionData();
        double nota;
        
        //Corroborary actualiza todas las notas del alumno para evitar errores
        for(int i = 0; i < ins.obtenerInscripcionesPorAlumno(alumnos.get(jComboBox1.getSelectedIndex()).getIdAlumno()).size(); i++){
            nota = Double.parseDouble(this.jTable1.getValueAt(i, 2).toString());
            
            //Verifica que la nota sea correcta
            //Si es así la guarda, de lo contrario envía un mensaje de error y no guarda la nota.
            if(nota <= 10 && nota >= 0){
                ins.actualizarNota(alumnos.get(jComboBox1.getSelectedIndex()).getIdAlumno(), ins.obtenerInscripcionesPorAlumno(alumnos.get(jComboBox1.getSelectedIndex()).getIdAlumno()).get(i).getMateria().getIdMateria(), nota);
            } else {
                JOptionPane.showMessageDialog(null, "Nota fuera de rango");
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

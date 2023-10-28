package universidadgrupo9.vistas;

import universidadgrupo9.accesoADatos.AlumnoData;

import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import universidadgrupo9.entidades.Alumno;
import universidadgrupo9.entidades.Inscripcion;
import universidadgrupo9.entidades.Materia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import universidadgrupo9.accesoADatos.InscripcionData;
import universidadgrupo9.accesoADatos.MateriaData;

public class FormularioInscripcion extends javax.swing.JInternalFrame {

    private AlumnoData aluData = new AlumnoData();
    private Alumno alumnoActual = null;

    private ArrayList<Materia> listaM;
    private ArrayList<Alumno> listaA;

    private InscripcionData inscData;
    private MateriaData mData;
    private AlumnoData aData;

    private DefaultTableModel modelo;

    public FormularioInscripcion() {
        initComponents();

        aData = new AlumnoData();
        listaA = (ArrayList<Alumno>) aData.listarAlumnos();
        modelo = new DefaultTableModel();
        inscData = new InscripcionData();
        mData = new MateriaData();
        cargaAlumnos();
        armarCabeceraTabla();

    }

    private void cargaAlumnos() {

        for (Alumno item : listaA) {
            cboxAlumno.addItem(item);
        }

    }

    private void armarCabeceraTabla() {
        
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add(" ID: ");
        filaCabecera.add(" Nombre: ");
        filaCabecera.add(" Año: ");

        for (Object it : filaCabecera) {

            modelo.addColumn(it);

        }
        jtMaterias.setModel(modelo);

    }

    private void borrarFilaTabla() {
        int indice = modelo.getRowCount() - 1;

        for (int i = indice; i >= 0; i--) {

            modelo.removeRow(i);

        }

    }

    private void cargaDatosNoInscriptas() {

        Alumno selec = (Alumno) cboxAlumno.getSelectedItem();
        listaM = (ArrayList) inscData.obtenerMateriasNoCursadas(selec.getIdAlumno());

        for (Materia m : listaM) {

            modelo.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getAño()});
        }
    }

    private void cargaDatosInscriptas() {
        Alumno selec = (Alumno) cboxAlumno.getSelectedItem();
        List<Materia> lista = (ArrayList) inscData.obtenerMateriaCursada(selec.getIdAlumno());
        for (Materia m : lista) {

            modelo.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getAño()});
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboxAlumno = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        radioInscriptas = new javax.swing.JRadioButton();
        radioNoInscriptas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMaterias = new javax.swing.JTable();
        jBInscribir = new javax.swing.JButton();
        jBAInscribir = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Formulario de Inscripción");

        jLabel2.setText("Seleccione un Alumno:");

        cboxAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxAlumnoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Listado de Materias:");

        radioInscriptas.setText("Materias Inscriptas");
        radioInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioInscriptasActionPerformed(evt);
            }
        });

        radioNoInscriptas.setText("Materias no Inscriptas");
        radioNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNoInscriptasActionPerformed(evt);
            }
        });

        jtMaterias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtMaterias);

        jBInscribir.setText("Inscribir");
        jBInscribir.setEnabled(false);
        jBInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInscribirActionPerformed(evt);
            }
        });

        jBAInscribir.setText("Anular Inscripción");
        jBAInscribir.setEnabled(false);
        jBAInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAInscribirActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(cboxAlumno, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(radioInscriptas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(radioNoInscriptas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBInscribir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBAInscribir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel1))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cboxAlumno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(53, 53, 53))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel3))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(radioInscriptas)
                        .addGap(122, 122, 122)
                        .addComponent(radioNoInscriptas))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jBInscribir)
                .addGap(125, 125, 125)
                .addComponent(jBAInscribir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalir)
                .addGap(41, 41, 41))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboxAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioInscriptas)
                    .addComponent(radioNoInscriptas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBInscribir)
                    .addComponent(jBAInscribir)
                    .addComponent(jbSalir))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboxAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxAlumnoActionPerformed


    }//GEN-LAST:event_cboxAlumnoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed

        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jbSalirActionPerformed

    private void radioNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNoInscriptasActionPerformed

        borrarFilaTabla();
        radioInscriptas.setSelected(false);
        cargaDatosNoInscriptas();
        jBInscribir.setEnabled(true);
        jBAInscribir.setEnabled(false);


    }//GEN-LAST:event_radioNoInscriptasActionPerformed

    private void radioInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioInscriptasActionPerformed

        borrarFilaTabla();
        radioNoInscriptas.setSelected(false);
        cargaDatosInscriptas();
        jBAInscribir.setEnabled(true);
        jBInscribir.setEnabled(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_radioInscriptasActionPerformed

    private void jBInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInscribirActionPerformed

        int filaSeleccionada = jtMaterias.getSelectedRow();
        if (filaSeleccionada != -1) {

            Alumno a = (Alumno) cboxAlumno.getSelectedItem();

            int idMateria = (Integer) modelo.getValueAt(filaSeleccionada, 0);
            String nombreMateria = (String) modelo.getValueAt(filaSeleccionada, 1);
            int año = (Integer) modelo.getValueAt(filaSeleccionada, 2);
            Materia m = new Materia(idMateria, nombreMateria, año, true);

            Inscripcion i = new Inscripcion(0, a, m);
            inscData.guardarInscripcion(i);
            borrarFilaTabla();
        }


    }//GEN-LAST:event_jBInscribirActionPerformed

    private void jBAInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAInscribirActionPerformed

        int filaSeleccionada = jtMaterias.getSelectedRow();
        if (filaSeleccionada != -1) {

            Alumno a = (Alumno) cboxAlumno.getSelectedItem();
            int idMateria = (Integer) modelo.getValueAt(filaSeleccionada, 0);
            inscData.borrarInscripcion(a.getIdAlumno(), idMateria);
            borrarFilaTabla();

        }


    }//GEN-LAST:event_jBAInscribirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Alumno> cboxAlumno;
    private javax.swing.JButton jBAInscribir;
    private javax.swing.JButton jBInscribir;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTable jtMaterias;
    private javax.swing.JRadioButton radioInscriptas;
    private javax.swing.JRadioButton radioNoInscriptas;
    // End of variables declaration//GEN-END:variables

}

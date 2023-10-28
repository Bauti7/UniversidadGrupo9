/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo9.vistas;

import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import universidadgrupo9.accesoADatos.AlumnoData;
import universidadgrupo9.accesoADatos.InscripcionData;
import universidadgrupo9.accesoADatos.MateriaData;
import universidadgrupo9.entidades.Alumno;
import universidadgrupo9.entidades.Inscripcion;
import universidadgrupo9.entidades.Materia;

/**
 *
 * @author Bau
 */
public class CargarNotas extends javax.swing.JInternalFrame {

    /*private AlumnoData aluData = new AlumnoData();
    private Alumno alumnoActual = null;
     */
    private MateriaData matData = new MateriaData();
    private Materia materiaActual = null;
    private ArrayList<Materia> listaM;
    private ArrayList<Alumno> listaA;

    private InscripcionData inscData;
    private MateriaData mData;
    private AlumnoData aData;
    private DefaultTableModel modelo;

    public CargarNotas() {

        initComponents();
        aData = new AlumnoData();
        listaA = (ArrayList<Alumno>) aData.listarAlumnos();
        modelo = new DefaultTableModel();
        inscData = new InscripcionData();
        mData = new MateriaData();
        cargaNotas();
        armarCabeceraTabla();
        llenarTabla();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcSelecAlumnos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAlumnos = new javax.swing.JTable();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Carga de Notas");

        jLabel2.setText("Selecciona un Alumno:");

        jcSelecAlumnos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcSelecAlumnosItemStateChanged(evt);
            }
        });
        jcSelecAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcSelecAlumnosActionPerformed(evt);
            }
        });

        jtAlumnos.setModel(new javax.swing.table.DefaultTableModel(
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
        jtAlumnos.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jtAlumnosAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jtAlumnos);

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
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
        jDesktopPane1.setLayer(jcSelecAlumnos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbGuardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbGuardar)
                .addGap(128, 128, 128)
                .addComponent(jbSalir)
                .addGap(65, 65, 65))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jcSelecAlumnos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcSelecAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbSalir))
                .addGap(48, 48, 48))
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

    private void jcSelecAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcSelecAlumnosActionPerformed
        
        
    //limpiarTabla();
    
    }//GEN-LAST:event_jcSelecAlumnosActionPerformed

    
    private void limpiarTabla() {
    DefaultTableModel modelo = (DefaultTableModel) jtAlumnos.getModel();
    modelo.setRowCount(0);
}

   
  




    private void cargaNotas() {

        for (Alumno item : listaA) {
            jcSelecAlumnos.addItem(item);
            
        
        }

    }

    private void armarCabeceraTabla() {
        
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add(" Codigo: ");
        filaCabecera.add(" Nombre: ");
        filaCabecera.add(" Nota: ");

        for (Object it : filaCabecera) {

            modelo.addColumn(it);

        }
        jtAlumnos.setModel(modelo);

    }
    
    
    
    private void llenarTabla() {
         Inscripcion in= new Inscripcion();
        int nota= in.getNota();
        System.out.println(nota);
        
        
        
        Alumno selec = (Alumno) jcSelecAlumnos.getSelectedItem(); 
        
        List<Materia> listaM = inscData.obtenerMateriaCursada(selec.getIdAlumno());
        
        
        
         
        
        for (Materia m : listaM) {
            modelo.addRow(new Object[]{m.getIdMateria(), m.getNombre(),  });
        }

    }


    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jtAlumnosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jtAlumnosAncestorAdded


    }//GEN-LAST:event_jtAlumnosAncestorAdded

    private void jcSelecAlumnosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcSelecAlumnosItemStateChanged

   if (evt.getStateChange() == ItemEvent.SELECTED) {
            limpiarTabla();
            llenarTabla();
            
        }




        // TODO add your handling code here:
    }//GEN-LAST:event_jcSelecAlumnosItemStateChanged

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        
        mData.guardarMateria(materiaActual);
        

       
    }//GEN-LAST:event_jbGuardarActionPerformed


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcSelecAlumnos;
    private javax.swing.JTable jtAlumnos;
    // End of variables declaration//GEN-END:variables
}

package universidadgrupo9.vistas;

import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import universidadgrupo9.accesoADatos.AlumnoData;
import universidadgrupo9.accesoADatos.InscripcionData;
import universidadgrupo9.accesoADatos.MateriaData;
import universidadgrupo9.entidades.Alumno;
import universidadgrupo9.entidades.Materia;

public class ListadoDeAlumnosPorMateria extends javax.swing.JInternalFrame {

    private MateriaData matData = new MateriaData();
    private Materia materiaActual = null;
    private ArrayList<Alumno> listaA;
    private InscripcionData inscData;

    private ArrayList<Materia> listaM;
    private DefaultTableModel modelo;
    private MateriaData mData;
    private AlumnoData aData;

    //--------------Lista de Alumnos por Materia-----------------------------------
    public ListadoDeAlumnosPorMateria() {
        initComponents();
        aData = new AlumnoData();
        mData = new MateriaData();
        listaM = (ArrayList<Materia>) mData.listarMaterias();
        inscData = new InscripcionData();
        modelo = new DefaultTableModel();

        cargaMaterias();
        armarCabeceraTablaMateria();
        llenarTablaMateria();
    }

    //--------------Cargar Materias-----------------------------------
    private void cargaMaterias() {

        List<Materia> todo = listaM;
        for (Materia item : todo) {
            jcMaterias.addItem(item);
        }
    }

    //--------------Cabecera de la Tabla-----------------------------------
    private void armarCabeceraTablaMateria() {

        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add(" ID: ");
        filaCabecera.add(" DNI: ");
        filaCabecera.add(" Apellido: ");
        filaCabecera.add(" Nombre: ");

        for (Object it : filaCabecera) {

            modelo.addColumn(it);

        }
        jtMaterias.setModel(modelo);

    }

    //--------------Llenar Tablas-----------------------------------
    private void llenarTablaMateria() {

        jcMaterias.getSelectedItem();
        Materia mat = (Materia) jcMaterias.getSelectedItem();
        List<Alumno> alumnos = inscData.obtenerAlumnosPorMateria(mat.getIdMateria());
        for (Alumno alu : alumnos) {
            modelo.addRow(new Object[]{alu.getIdAlumno(), alu.getDni(), alu.getApellido(), alu.getNombre()});

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcMaterias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMaterias = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Listado de Alumnos por Materia");

        jLabel2.setText("Selecciona una Materia:");

        jcMaterias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcMateriasItemStateChanged(evt);
            }
        });
        jcMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcMateriasActionPerformed(evt);
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

        jbSalir.setText("Salir");
        jbSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbSalirMouseClicked(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jcMaterias, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel2)
                        .addGap(87, 87, 87)
                        .addComponent(jcMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 56, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbSalir, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jbSalir)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcMateriasActionPerformed

    }//GEN-LAST:event_jcMateriasActionPerformed

    //--------------Seleccion-----------------------------------

    private void jcMateriasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcMateriasItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED) {
            limpiarTabla();
            llenarTablaMateria();
        }
    }//GEN-LAST:event_jcMateriasItemStateChanged

    //--------------Salir-----------------------------------

    private void jbSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSalirMouseClicked
        dispose();
    }//GEN-LAST:event_jbSalirMouseClicked

    //--------------Limpiar Tabla-----------------------------------
    private void limpiarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) jtMaterias.getModel();
        modelo.setRowCount(0);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Materia> jcMaterias;
    private javax.swing.JTable jtMaterias;
    // End of variables declaration//GEN-END:variables
}

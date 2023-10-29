package universidadgrupo9.vistas;

import java.awt.Color;
import java.sql.Connection;

public class MenuVistas extends javax.swing.JFrame {

    //--------------Menu-----------------------------------
    public MenuVistas() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jAlumno = new javax.swing.JMenu();
        jFormularioA = new javax.swing.JMenuItem();
        jMateria = new javax.swing.JMenu();
        jFormularioM = new javax.swing.JMenuItem();
        jAdministracion = new javax.swing.JMenu();
        jManejoIns = new javax.swing.JMenuItem();
        jManipulacionN = new javax.swing.JMenuItem();
        jConsultas = new javax.swing.JMenu();
        jAlumnosM = new javax.swing.JMenuItem();
        jSalir = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem7.setText("jMenuItem7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jEscritorioLayout = new javax.swing.GroupLayout(jEscritorio);
        jEscritorio.setLayout(jEscritorioLayout);
        jEscritorioLayout.setHorizontalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 624, Short.MAX_VALUE)
        );
        jEscritorioLayout.setVerticalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
        );

        jAlumno.setText("Alumno");

        jFormularioA.setText("Formulario de Alumno");
        jFormularioA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormularioAActionPerformed(evt);
            }
        });
        jAlumno.add(jFormularioA);

        jMenuBar1.add(jAlumno);

        jMateria.setText("Materia");

        jFormularioM.setText("Formulario de Materia");
        jFormularioM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormularioMActionPerformed(evt);
            }
        });
        jMateria.add(jFormularioM);

        jMenuBar1.add(jMateria);

        jAdministracion.setText("Administracion");

        jManejoIns.setText("Manejo de Inscripcion");
        jManejoIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jManejoInsActionPerformed(evt);
            }
        });
        jAdministracion.add(jManejoIns);

        jManipulacionN.setText("Manipulación de notas");
        jManipulacionN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jManipulacionNActionPerformed(evt);
            }
        });
        jAdministracion.add(jManipulacionN);

        jMenuBar1.add(jAdministracion);

        jConsultas.setText("Consultas");

        jAlumnosM.setText("Alumnos por Materia");
        jAlumnosM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAlumnosMActionPerformed(evt);
            }
        });
        jConsultas.add(jAlumnosM);

        jMenuBar1.add(jConsultas);

        jSalir.setText("Salir");
        jSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSalirMouseClicked(evt);
            }
        });
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(jSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEscritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEscritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //--------------Formulario Gestion Alumnos-----------------------------------

    private void jFormularioAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormularioAActionPerformed

        jEscritorio.removeAll();
        jEscritorio.repaint();
        GestionAlumnos alu = new GestionAlumnos();
        alu.setVisible(true);
        alu.getContentPane().setBackground(Color.white);
        jEscritorio.add(alu);

    }//GEN-LAST:event_jFormularioAActionPerformed

    //--------------Formulario Gestion Alumnos-----------------------------------

    private void jFormularioMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormularioMActionPerformed
        jEscritorio.removeAll();
        jEscritorio.repaint();
        GestionMaterias mat = new GestionMaterias();
        mat.setVisible(true);
        mat.getContentPane().setBackground(Color.white);
        jEscritorio.add(mat);

    }//GEN-LAST:event_jFormularioMActionPerformed

    //--------------Formulario de inscripcion-----------------------------------

    private void jManejoInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jManejoInsActionPerformed

        jEscritorio.removeAll();
        jEscritorio.repaint();
        FormularioInscripcion inscrip = new FormularioInscripcion();
        inscrip.setVisible(true);
        inscrip.getContentPane().setBackground(Color.white);
        jEscritorio.add(inscrip);

    }//GEN-LAST:event_jManejoInsActionPerformed


    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed


    }//GEN-LAST:event_jSalirActionPerformed

    //--------------Carga de notas----------------------------------

    private void jManipulacionNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jManipulacionNActionPerformed

        jEscritorio.removeAll();
        jEscritorio.repaint();
        CargarNotas carg = new CargarNotas();
        carg.setVisible(true);
        carg.getContentPane().setBackground(Color.white);
        jEscritorio.add(carg);

    }//GEN-LAST:event_jManipulacionNActionPerformed

    //--------------Salir-----------------------------------

    private void jSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSalirMouseClicked

        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jSalirMouseClicked

    //--------------Listado de alumnos por materia-----------------------------------

    private void jAlumnosMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAlumnosMActionPerformed

        jEscritorio.removeAll();
        jEscritorio.repaint();
        ListadoDeAlumnosPorMateria listaMateria = new ListadoDeAlumnosPorMateria();
        listaMateria.setVisible(true);
        listaMateria.getContentPane().setBackground(Color.white);
        jEscritorio.add(listaMateria);

    }//GEN-LAST:event_jAlumnosMActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuVistas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jAdministracion;
    private javax.swing.JMenu jAlumno;
    private javax.swing.JMenuItem jAlumnosM;
    private javax.swing.JMenu jConsultas;
    private javax.swing.JDesktopPane jEscritorio;
    private javax.swing.JMenuItem jFormularioA;
    private javax.swing.JMenuItem jFormularioM;
    private javax.swing.JMenuItem jManejoIns;
    private javax.swing.JMenuItem jManipulacionN;
    private javax.swing.JMenu jMateria;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenu jSalir;
    // End of variables declaration//GEN-END:variables
}

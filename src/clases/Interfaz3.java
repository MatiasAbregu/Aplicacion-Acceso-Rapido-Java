package clases;

import java.awt.*;
import java.io.*;

/**
 * @author Matias Abregú
 */
public class Interfaz3 extends javax.swing.JFrame {

    public Interfaz3() {
        initComponents();
        
        setTitle("Acceso Rapido - 3");
        setResizable(false);
        setBounds(865, 475, 500, 250);

        Cerrar.setOpaque(true);
        Minimizar.setOpaque(true);
        PSP.setOpaque(true);
        Citra.setOpaque(true);
        Ryujinx.setOpaque(true);
        Yuzu.setOpaque(true);
        Internet.setOpaque(true);
        Radmin.setOpaque(true);

        Titulo.setText(this.getTitle());
    }

    @Override
    public Image getIconImage(){
        Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/ACCRAP.png"));
        return icono;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        AvIzquierda = new javax.swing.JLabel();
        AvDerecha = new javax.swing.JLabel();
        Internet = new javax.swing.JLabel();
        Yuzu = new javax.swing.JLabel();
        PSP = new javax.swing.JLabel();
        Citra = new javax.swing.JLabel();
        Ryujinx = new javax.swing.JLabel();
        Radmin = new javax.swing.JLabel();
        cabecera = new javax.swing.JPanel();
        Cerrar = new javax.swing.JLabel();
        Minimizar = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(80, 80, 80));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AvIzquierda.setBackground(new java.awt.Color(80, 80, 80));
        AvIzquierda.setFont(new java.awt.Font("Segoe UI", 0, 56)); // NOI18N
        AvIzquierda.setForeground(new java.awt.Color(255, 255, 255));
        AvIzquierda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AvIzquierda.setText("<");
        AvIzquierda.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        AvIzquierda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AvIzquierdaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AvIzquierdaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AvIzquierdaMouseExited(evt);
            }
        });
        panel.add(AvIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 75, 40, 60));

        AvDerecha.setBackground(new java.awt.Color(80, 80, 80));
        AvDerecha.setFont(new java.awt.Font("Segoe UI", 0, 56)); // NOI18N
        AvDerecha.setForeground(new java.awt.Color(255, 255, 255));
        AvDerecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AvDerecha.setText(">");
        AvDerecha.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        AvDerecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AvDerechaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AvDerechaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AvDerechaMouseExited(evt);
            }
        });
        panel.add(AvDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 75, 40, 60));

        Internet.setBackground(new java.awt.Color(80, 80, 80));
        Internet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Internet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IDM.png"))); // NOI18N
        Internet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InternetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InternetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InternetMouseExited(evt);
            }
        });
        panel.add(Internet, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 80, 80));

        Yuzu.setBackground(new java.awt.Color(80, 80, 80));
        Yuzu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Yuzu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Yuzu.png"))); // NOI18N
        Yuzu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                YuzuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                YuzuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                YuzuMouseExited(evt);
            }
        });
        panel.add(Yuzu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 80, 80));

        PSP.setBackground(new java.awt.Color(80, 80, 80));
        PSP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PPSSPP.png"))); // NOI18N
        PSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PSPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PSPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PSPMouseExited(evt);
            }
        });
        panel.add(PSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 80, 80));

        Citra.setBackground(new java.awt.Color(80, 80, 80));
        Citra.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Citra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Citra.png"))); // NOI18N
        Citra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CitraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CitraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CitraMouseExited(evt);
            }
        });
        panel.add(Citra, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 80, 80));

        Ryujinx.setBackground(new java.awt.Color(80, 80, 80));
        Ryujinx.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Ryujinx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ryujinx.png"))); // NOI18N
        Ryujinx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RyujinxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RyujinxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RyujinxMouseExited(evt);
            }
        });
        panel.add(Ryujinx, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 80, 80));

        Radmin.setBackground(new java.awt.Color(80, 80, 80));
        Radmin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Radmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/radmin.png"))); // NOI18N
        Radmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RadminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RadminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RadminMouseExited(evt);
            }
        });
        panel.add(Radmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 80, 80));

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 500, 220));

        cabecera.setBackground(new java.awt.Color(51, 51, 51));
        cabecera.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cerrar.setBackground(new java.awt.Color(51, 51, 51));
        Cerrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Cerrar.setForeground(new java.awt.Color(255, 255, 255));
        Cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cerrar.setText("X");
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CerrarMouseExited(evt);
            }
        });
        cabecera.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 40, 30));

        Minimizar.setBackground(new java.awt.Color(51, 51, 51));
        Minimizar.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Minimizar.setForeground(new java.awt.Color(255, 255, 255));
        Minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Minimizar.setText("-");
        Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MinimizarMouseExited(evt);
            }
        });
        cabecera.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 40, 30));

        Titulo.setBackground(new java.awt.Color(51, 51, 51));
        Titulo.setFont(new java.awt.Font("Britannic Bold", 0, 16)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        cabecera.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 150, 30));

        getContentPane().add(cabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AvIzquierdaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AvIzquierdaMouseClicked
        Interfaz2 interf2 = new Interfaz2();
        interf2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AvIzquierdaMouseClicked

    private void AvIzquierdaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AvIzquierdaMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_AvIzquierdaMouseEntered

    private void AvIzquierdaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AvIzquierdaMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_AvIzquierdaMouseExited

    private void AvDerechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AvDerechaMouseClicked
        Interfaz interf = new Interfaz();
        interf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AvDerechaMouseClicked

    private void AvDerechaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AvDerechaMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_AvDerechaMouseEntered

    private void AvDerechaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AvDerechaMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_AvDerechaMouseExited

    private void InternetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InternetMouseClicked
        try {
            Desktop.getDesktop().open(new File("C:/Program Files (x86)/Internet Download Manager/IDMan.exe"));
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_InternetMouseClicked

    private void InternetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InternetMouseEntered
        Internet.setBackground(new Color(120, 120, 120));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_InternetMouseEntered

    private void InternetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InternetMouseExited
        Internet.setBackground(null);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_InternetMouseExited

    private void YuzuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YuzuMouseClicked
        try {
            Desktop.getDesktop().open(new File("C:/Users/Matias/AppData/Local/yuzu/yuzu-windows-msvc/yuzu.exe"));
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_YuzuMouseClicked

    private void YuzuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YuzuMouseEntered
        Yuzu.setBackground(new Color(120, 120, 120));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_YuzuMouseEntered

    private void YuzuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YuzuMouseExited
        Yuzu.setBackground(null);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_YuzuMouseExited

    private void PSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PSPMouseClicked
        try {
            Desktop.getDesktop().open(new File("C:/Users/Matias/Downloads/ppsspp_win (1.10.3)/PPSSPPWindows64.exe"));
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_PSPMouseClicked

    private void PSPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PSPMouseEntered
        PSP.setBackground(new Color(120, 120, 120));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_PSPMouseEntered

    private void PSPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PSPMouseExited
        PSP.setBackground(null);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_PSPMouseExited

    private void CitraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CitraMouseClicked
        try {
            Desktop.getDesktop().open(new File("C:/Users/Matias/AppData/Local/Citra/canary-mingw/citra-qt.exe"));
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_CitraMouseClicked

    private void CitraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CitraMouseEntered
        Citra.setBackground(new Color(120, 120, 120));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_CitraMouseEntered

    private void CitraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CitraMouseExited
        Citra.setBackground(null);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_CitraMouseExited

    private void RyujinxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RyujinxMouseClicked
        try {
            Desktop.getDesktop().open(new File("C:/Users/Matias/Downloads/Ryujinx/Ryujinx (emulator)/Ryujinx.exe"));
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_RyujinxMouseClicked

    private void RyujinxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RyujinxMouseEntered
        Ryujinx.setBackground(new Color(120, 120, 120));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_RyujinxMouseEntered

    private void RyujinxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RyujinxMouseExited
        Ryujinx.setBackground(null);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_RyujinxMouseExited

    private void RadminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RadminMouseClicked
        try {
            Desktop.getDesktop().open(new File("C:/Program Files (x86)/Radmin VPN/RvRvpnGui.exe"));
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_RadminMouseClicked

    private void RadminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RadminMouseEntered
        Radmin.setBackground(new Color(120, 120, 120));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_RadminMouseEntered

    private void RadminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RadminMouseExited
        Radmin.setBackground(null);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_RadminMouseExited

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CerrarMouseClicked

    private void CerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseEntered
        Cerrar.setBackground(new Color(180, 0, 0));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_CerrarMouseEntered

    private void CerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseExited
        Cerrar.setBackground(null);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_CerrarMouseExited

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_MinimizarMouseClicked

    private void MinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseEntered
        Minimizar.setBackground(new Color(120, 120, 120));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_MinimizarMouseEntered

    private void MinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseExited
        Minimizar.setBackground(null);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_MinimizarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AvDerecha;
    private javax.swing.JLabel AvIzquierda;
    private javax.swing.JLabel Cerrar;
    private javax.swing.JLabel Citra;
    private javax.swing.JLabel Internet;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JLabel PSP;
    private javax.swing.JLabel Radmin;
    private javax.swing.JLabel Ryujinx;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Yuzu;
    private javax.swing.JPanel cabecera;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}

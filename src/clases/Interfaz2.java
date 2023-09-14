package clases;

import java.awt.*;
import java.io.*;

/**
 * @author Matias Abregú
 */
public class Interfaz2 extends javax.swing.JFrame {

    public Interfaz2() {
        initComponents();

        setTitle("Acceso Rapido - 2");
        setResizable(false);
        setBounds(865, 475, 500, 250);

        Cerrar.setOpaque(true);
        Minimizar.setOpaque(true);
        VisualCode.setOpaque(true);
        DS4.setOpaque(true);
        EpicGames.setOpaque(true);
        Steam.setOpaque(true);
        Photoshop.setOpaque(true);
        uTorrent.setOpaque(true);

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
        Photoshop = new javax.swing.JLabel();
        Steam = new javax.swing.JLabel();
        VisualCode = new javax.swing.JLabel();
        DS4 = new javax.swing.JLabel();
        EpicGames = new javax.swing.JLabel();
        uTorrent = new javax.swing.JLabel();
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

        Photoshop.setBackground(new java.awt.Color(80, 80, 80));
        Photoshop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Photoshop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Photo.png"))); // NOI18N
        Photoshop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PhotoshopMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PhotoshopMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PhotoshopMouseExited(evt);
            }
        });
        panel.add(Photoshop, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 80, 80));

        Steam.setBackground(new java.awt.Color(80, 80, 80));
        Steam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Steam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Steam.png"))); // NOI18N
        Steam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SteamMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SteamMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SteamMouseExited(evt);
            }
        });
        panel.add(Steam, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 80, 80));

        VisualCode.setBackground(new java.awt.Color(80, 80, 80));
        VisualCode.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        VisualCode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/VSC.png"))); // NOI18N
        VisualCode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VisualCodeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VisualCodeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VisualCodeMouseExited(evt);
            }
        });
        panel.add(VisualCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 80, 80));

        DS4.setBackground(new java.awt.Color(80, 80, 80));
        DS4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        DS4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/DS4.png"))); // NOI18N
        DS4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DS4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DS4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DS4MouseExited(evt);
            }
        });
        panel.add(DS4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 80, 80));

        EpicGames.setBackground(new java.awt.Color(80, 80, 80));
        EpicGames.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        EpicGames.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/EG.png"))); // NOI18N
        EpicGames.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EpicGamesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EpicGamesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EpicGamesMouseExited(evt);
            }
        });
        panel.add(EpicGames, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 80, 80));

        uTorrent.setBackground(new java.awt.Color(80, 80, 80));
        uTorrent.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        uTorrent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/utorr.png"))); // NOI18N
        uTorrent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uTorrentMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                uTorrentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                uTorrentMouseExited(evt);
            }
        });
        panel.add(uTorrent, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 80, 80));

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

    private void AvIzquierdaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AvIzquierdaMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_AvIzquierdaMouseEntered

    private void AvIzquierdaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AvIzquierdaMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_AvIzquierdaMouseExited

    private void AvDerechaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AvDerechaMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_AvDerechaMouseEntered

    private void AvDerechaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AvDerechaMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_AvDerechaMouseExited

    private void PhotoshopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PhotoshopMouseClicked
        try {
            Desktop.getDesktop().open(new File("C:/Program Files/Adobe/Adobe Photoshop 2022/Photoshop.exe"));
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_PhotoshopMouseClicked

    private void PhotoshopMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PhotoshopMouseEntered
        Photoshop.setBackground(new Color(120, 120, 120));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_PhotoshopMouseEntered

    private void PhotoshopMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PhotoshopMouseExited
        Photoshop.setBackground(null);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_PhotoshopMouseExited

    private void SteamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SteamMouseClicked
        try {
            Desktop.getDesktop().open(new File("C:/Program Files (x86)/Steam/steam.exe"));
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_SteamMouseClicked

    private void SteamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SteamMouseEntered
        Steam.setBackground(new Color(120, 120, 120));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_SteamMouseEntered

    private void SteamMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SteamMouseExited
        Steam.setBackground(null);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_SteamMouseExited

    private void VisualCodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VisualCodeMouseClicked
        try {
            Desktop.getDesktop().open(new File("C:/Users/Matias/AppData/Local/Programs/Microsoft VS Code/Code.exe/"));
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_VisualCodeMouseClicked

    private void VisualCodeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VisualCodeMouseEntered
        VisualCode.setBackground(new Color(120, 120, 120));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_VisualCodeMouseEntered

    private void VisualCodeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VisualCodeMouseExited
        VisualCode.setBackground(null);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_VisualCodeMouseExited

    private void DS4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DS4MouseClicked
        try {
            Desktop.getDesktop().open(new File("C:/Users/Matias/Downloads/DS4Windows/DS4Windows.exe"));
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_DS4MouseClicked

    private void DS4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DS4MouseEntered
        DS4.setBackground(new Color(120, 120, 120));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_DS4MouseEntered

    private void DS4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DS4MouseExited
        DS4.setBackground(null);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_DS4MouseExited

    private void EpicGamesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EpicGamesMouseClicked
        try {
            Desktop.getDesktop().open(new File("C:/Program Files (x86)/Epic Games/Launcher/Portal/Binaries/Win64/EpicGamesLauncher.exe"));
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_EpicGamesMouseClicked

    private void EpicGamesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EpicGamesMouseEntered
        EpicGames.setBackground(new Color(120, 120, 120));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_EpicGamesMouseEntered

    private void EpicGamesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EpicGamesMouseExited
        EpicGames.setBackground(null);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_EpicGamesMouseExited

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

    private void AvDerechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AvDerechaMouseClicked
        Interfaz3 interf3 = new Interfaz3();
        interf3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AvDerechaMouseClicked

    private void AvIzquierdaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AvIzquierdaMouseClicked
        Interfaz interf = new Interfaz();
        interf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AvIzquierdaMouseClicked

    private void uTorrentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uTorrentMouseClicked
        try {
            Desktop.getDesktop().open(new File("C:/Users/Matias/AppData/Roaming/uTorrent/uTorrent.exe"));
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_uTorrentMouseClicked

    private void uTorrentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uTorrentMouseEntered
        uTorrent.setBackground(new Color(120, 120, 120));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_uTorrentMouseEntered

    private void uTorrentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uTorrentMouseExited
        uTorrent.setBackground(null);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_uTorrentMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AvDerecha;
    private javax.swing.JLabel AvIzquierda;
    private javax.swing.JLabel Cerrar;
    private javax.swing.JLabel DS4;
    private javax.swing.JLabel EpicGames;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JLabel Photoshop;
    private javax.swing.JLabel Steam;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel VisualCode;
    private javax.swing.JPanel cabecera;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel uTorrent;
    // End of variables declaration//GEN-END:variables
}

package clases;

import java.awt.*;
import java.io.*;
import java.net.*;

/**
 * @author Matias Abregú
 */
public class Interfaz extends javax.swing.JFrame {

    private int x, y;

    public Interfaz() {
        initComponents();
        
        setTitle("Acceso Rapido - 1");
        setResizable(false);
        setBounds(865, 475, 500, 250);

        Cerrar.setOpaque(true);
        Minimizar.setOpaque(true);
        YouTube.setOpaque(true);
        Discord.setOpaque(true);
        Whatsapp.setOpaque(true);
        Brave.setOpaque(true);
        NetBeans.setOpaque(true);
        
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
        NetBeans = new javax.swing.JLabel();
        Brave = new javax.swing.JLabel();
        YouTube = new javax.swing.JLabel();
        Discord = new javax.swing.JLabel();
        Whatsapp = new javax.swing.JLabel();
        Buscador = new javax.swing.JTextField();
        Busqueda = new javax.swing.JLabel();
        cabecera = new javax.swing.JPanel();
        Cerrar = new javax.swing.JLabel();
        Minimizar = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
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

        NetBeans.setBackground(new java.awt.Color(80, 80, 80));
        NetBeans.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NetBeans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Netbeans.png"))); // NOI18N
        NetBeans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NetBeansMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NetBeansMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NetBeansMouseExited(evt);
            }
        });
        panel.add(NetBeans, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 80, 80));

        Brave.setBackground(new java.awt.Color(80, 80, 80));
        Brave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Brave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Brave.png"))); // NOI18N
        Brave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BraveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BraveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BraveMouseExited(evt);
            }
        });
        panel.add(Brave, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 80, 80));

        YouTube.setBackground(new java.awt.Color(80, 80, 80));
        YouTube.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        YouTube.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/YouTube.png"))); // NOI18N
        YouTube.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                YouTubeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                YouTubeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                YouTubeMouseExited(evt);
            }
        });
        panel.add(YouTube, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 80, 80));

        Discord.setBackground(new java.awt.Color(80, 80, 80));
        Discord.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Discord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Discord.png"))); // NOI18N
        Discord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DiscordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DiscordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DiscordMouseExited(evt);
            }
        });
        panel.add(Discord, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 80, 80));

        Whatsapp.setBackground(new java.awt.Color(80, 80, 80));
        Whatsapp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Whatsapp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Whatsapp.png"))); // NOI18N
        Whatsapp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WhatsappMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                WhatsappMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                WhatsappMouseExited(evt);
            }
        });
        panel.add(Whatsapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 80, 80));

        Buscador.setBackground(new java.awt.Color(51, 51, 51));
        Buscador.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Buscador.setForeground(new java.awt.Color(255, 255, 255));
        Buscador.setCaretColor(new java.awt.Color(255, 255, 255));
        Buscador.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        Buscador.setSelectionColor(new java.awt.Color(153, 0, 50));
        Buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscadorActionPerformed(evt);
            }
        });
        panel.add(Buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 160, -1));

        Busqueda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Busqueda.setForeground(new java.awt.Color(255, 255, 255));
        Busqueda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Busqueda.setText("(Busquedas especificas)");
        panel.add(Busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 165, 160, 20));

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

    private void CerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseEntered
        Cerrar.setBackground(new Color(180, 0, 0));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_CerrarMouseEntered

    private void CerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseExited
        Cerrar.setBackground(null);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_CerrarMouseExited

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CerrarMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        y = evt.getY();
        x = evt.getX();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int vx = evt.getXOnScreen();
        int vy = evt.getYOnScreen();

        this.setLocation(vx - x, vy - y);
    }//GEN-LAST:event_formMouseDragged

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

    private void YouTubeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YouTubeMouseClicked
        try {
            if(!Buscador.getText().equals("")){
                Desktop.getDesktop().browse(new URI("https://www.youtube.com//results?search_query=" + Buscador.getText().replace(" ", "+")));
            } else {
                Desktop.getDesktop().browse(new URI("https://www.youtube.com/"));
            }
            
        } catch (URISyntaxException | IOException ex) {
        }
    }//GEN-LAST:event_YouTubeMouseClicked

    private void YouTubeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YouTubeMouseExited
       YouTube.setBackground(null);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_YouTubeMouseExited

    private void YouTubeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YouTubeMouseEntered
        YouTube.setBackground(new Color(120, 120, 120));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_YouTubeMouseEntered

    private void DiscordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DiscordMouseClicked
        try {
            Desktop.getDesktop().open(new File("C:/Users/Matias/AppData/Local/Discord/app-1.0.9005/Discord.exe"));
        } catch (IOException ex) {           
        }
    }//GEN-LAST:event_DiscordMouseClicked

    private void DiscordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DiscordMouseEntered
        Discord.setBackground(new Color(120, 120, 120));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_DiscordMouseEntered

    private void DiscordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DiscordMouseExited
        Discord.setBackground(null);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_DiscordMouseExited

    private void WhatsappMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WhatsappMouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://web.whatsapp.com/"));
        } catch (URISyntaxException | IOException ex) {
        }
    }//GEN-LAST:event_WhatsappMouseClicked

    private void WhatsappMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WhatsappMouseEntered
        Whatsapp.setBackground(new Color(120, 120, 120));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_WhatsappMouseEntered

    private void WhatsappMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WhatsappMouseExited
        Whatsapp.setBackground(null);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_WhatsappMouseExited

    private void BuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscadorActionPerformed
        
    }//GEN-LAST:event_BuscadorActionPerformed

    private void BraveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BraveMouseEntered
        Brave.setBackground(new Color(120, 120, 120));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_BraveMouseEntered

    private void BraveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BraveMouseExited
        Brave.setBackground(null);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_BraveMouseExited

    private void BraveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BraveMouseClicked
        try {
            if(!Buscador.getText().equals("")){
                Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=" + Buscador.getText().replace(" ", "+")));
            } else {
                Desktop.getDesktop().open(new File("C:/Program Files/BraveSoftware/Brave-Browser/Application/brave.exe"));
            }
        } catch (IOException | URISyntaxException ex) {
        }
    }//GEN-LAST:event_BraveMouseClicked

    private void NetBeansMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NetBeansMouseClicked
        try {
            Desktop.getDesktop().open(new File("C:/Program Files/NetBeans-13/netbeans/bin/netbeans64.exe"));
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_NetBeansMouseClicked

    private void NetBeansMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NetBeansMouseEntered
        NetBeans.setBackground(new Color(120, 120, 120));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_NetBeansMouseEntered

    private void NetBeansMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NetBeansMouseExited
        NetBeans.setBackground(null);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_NetBeansMouseExited

    private void AvDerechaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AvDerechaMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_AvDerechaMouseEntered

    private void AvDerechaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AvDerechaMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_AvDerechaMouseExited

    private void AvIzquierdaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AvIzquierdaMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_AvIzquierdaMouseEntered

    private void AvIzquierdaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AvIzquierdaMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_AvIzquierdaMouseExited

    private void AvDerechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AvDerechaMouseClicked
        Interfaz2 interf2 = new Interfaz2();
        interf2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AvDerechaMouseClicked

    private void AvIzquierdaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AvIzquierdaMouseClicked
        Interfaz3 interf3 = new Interfaz3();
        interf3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AvIzquierdaMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Interfaz interf = new Interfaz();
                interf.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AvDerecha;
    private javax.swing.JLabel AvIzquierda;
    private javax.swing.JLabel Brave;
    private javax.swing.JTextField Buscador;
    private javax.swing.JLabel Busqueda;
    private javax.swing.JLabel Cerrar;
    private javax.swing.JLabel Discord;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JLabel NetBeans;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Whatsapp;
    private javax.swing.JLabel YouTube;
    private javax.swing.JPanel cabecera;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}

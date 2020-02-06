package cinemuski;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class Asientos extends javax.swing.JFrame {

    String url = "jdbc:mysql://localhost:3306/Cine";
    String user = "root";
    String pass = "muski";
    Statement sta;
    Connection con;
    String sala = "1";
    String horario = "12:00:00";
    PreparedStatement insertar;
    ResultSet registro, contador;

    public Asientos() {
        initComponents();
        setLocationRelativeTo(null);
        asientosocupados();
    }

    public void asientosocupados() {
        try {
            String sql = "SELECT * FROM boletoss WHERE sala=" + sala + " AND horario='" + horario + "' order by asiento;";
            String lleno = "SELECT COUNT(asiento) FROM boletoss WHERE sala=" + sala + " AND horario='" + horario + "' order by asiento;";
            con = DriverManager.getConnection(url, user, pass);
            sta = con.createStatement();
            registro = sta.executeQuery(sql);
            while (registro.next()) {
                System.out.println(registro.getString(6));
                int asiento = Integer.parseInt(registro.getString(6));
                if (asiento == 1) {
                    asiento1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientoocupado.png")));
                } else if (asiento == 2) {
                    asiento2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientoocupado.png")));
                } else if (asiento == 3) {
                    asiento3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientoocupado.png")));
                } else if (asiento == 4) {
                    asiento4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientoocupado.png")));
                } else if (asiento == 5) {
                    asiento5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientoocupado.png")));
                } else if (asiento == 6) {
                    asiento6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientoocupado.png")));
                } else if (asiento == 7) {
                    asiento7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientoocupado.png")));
                } else if (asiento == 8) {
                    asiento8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientoocupado.png")));
                } else if (asiento == 9) {
                    asiento9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientoocupado.png")));
                } else if (asiento == 10) {
                    asiento10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientoocupado.png")));
                } else if (asiento == 11) {
                    asiento11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientoocupado.png")));
                } else if (asiento == 12) {
                    asiento12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientoocupado.png")));
                } else if (asiento == 13) {
                    asiento13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientoocupado.png")));
                } else if (asiento == 14) {
                    asiento14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientoocupado.png")));
                } else if (asiento == 15) {
                    asiento15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientoocupado.png")));
                } else if (asiento == 16) {
                    asiento16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientoocupado.png")));
                } else if (asiento == 17) {
                    asiento17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientoocupado.png")));
                } else if (asiento == 18) {
                    asiento18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientoocupado.png")));
                } else if (asiento == 19) {
                    asiento19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientoocupado.png")));
                } else if (asiento == 20) {
                    asiento20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientoocupado.png")));
                } else if (asiento == 21) {
                    asiento21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientoocupado.png")));
                } else if (asiento == 22) {
                    asiento22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientoocupado.png")));
                } else if (asiento == 23) {
                    asiento23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientoocupado.png")));
                } else if (asiento == 24) {
                    asiento24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientoocupado.png")));
                } else if (asiento == 25) {
                    asiento25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientoocupado.png")));
                } else if (asiento == 26) {
                    asiento26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientoocupado.png")));
                } else if (asiento == 27) {
                    asiento27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientoocupado.png")));
                } else if (asiento == 28) {
                    asiento28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientoocupado.png")));
                } else if (asiento == 29) {
                    asiento29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientoocupado.png")));
                } else if (asiento == 30) {
                    asiento30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientoocupado.png")));
                }
            }
        } catch (SQLException ex) {

        }
    }

    public void asientosdesocupados() {
        asiento1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png")));
        asiento2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png")));
        asiento3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png")));
        asiento4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png")));
        asiento5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png")));
        asiento6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png")));
        asiento7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png")));
        asiento8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png")));
        asiento9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png")));
        asiento10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png")));
        asiento11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png")));
        asiento12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png")));
        asiento13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png")));
        asiento14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png")));
        asiento15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png")));
        asiento16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png")));
        asiento17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png")));
        asiento18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png")));
        asiento19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png")));
        asiento20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png")));
        asiento21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png")));
        asiento22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png")));
        asiento23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png")));
        asiento24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png")));
        asiento25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png")));
        asiento26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png")));
        asiento27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png")));
        asiento28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png")));
        asiento29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png")));
        asiento30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png")));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelasientos = new javax.swing.JPanel();
        asiento1 = new javax.swing.JButton();
        asiento2 = new javax.swing.JButton();
        asiento3 = new javax.swing.JButton();
        asiento4 = new javax.swing.JButton();
        asiento5 = new javax.swing.JButton();
        asiento6 = new javax.swing.JButton();
        asiento7 = new javax.swing.JButton();
        asiento8 = new javax.swing.JButton();
        asiento9 = new javax.swing.JButton();
        asiento10 = new javax.swing.JButton();
        asiento11 = new javax.swing.JButton();
        asiento12 = new javax.swing.JButton();
        asiento13 = new javax.swing.JButton();
        asiento14 = new javax.swing.JButton();
        asiento15 = new javax.swing.JButton();
        asiento16 = new javax.swing.JButton();
        asiento17 = new javax.swing.JButton();
        asiento18 = new javax.swing.JButton();
        asiento19 = new javax.swing.JButton();
        asiento20 = new javax.swing.JButton();
        asiento21 = new javax.swing.JButton();
        asiento22 = new javax.swing.JButton();
        asiento23 = new javax.swing.JButton();
        asiento24 = new javax.swing.JButton();
        asiento25 = new javax.swing.JButton();
        asiento26 = new javax.swing.JButton();
        asiento27 = new javax.swing.JButton();
        asiento28 = new javax.swing.JButton();
        asiento29 = new javax.swing.JButton();
        asiento30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        elb = new javax.swing.JButton();
        elt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        panelasientos.setBackground(new java.awt.Color(255, 255, 255));
        panelasientos.setLayout(null);

        asiento1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        asiento1.setContentAreaFilled(false);
        asiento1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        asiento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento1ActionPerformed(evt);
            }
        });
        panelasientos.add(asiento1);
        asiento1.setBounds(32, 60, 63, 54);

        asiento2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        asiento2.setContentAreaFilled(false);
        asiento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento2ActionPerformed(evt);
            }
        });
        panelasientos.add(asiento2);
        asiento2.setBounds(71, 60, 63, 54);

        asiento3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        asiento3.setContentAreaFilled(false);
        panelasientos.add(asiento3);
        asiento3.setBounds(110, 60, 63, 54);

        asiento4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        asiento4.setContentAreaFilled(false);
        panelasientos.add(asiento4);
        asiento4.setBounds(153, 60, 63, 54);

        asiento5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        asiento5.setContentAreaFilled(false);
        panelasientos.add(asiento5);
        asiento5.setBounds(192, 60, 63, 54);

        asiento6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        asiento6.setContentAreaFilled(false);
        panelasientos.add(asiento6);
        asiento6.setBounds(231, 60, 63, 54);

        asiento7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        asiento7.setContentAreaFilled(false);
        panelasientos.add(asiento7);
        asiento7.setBounds(270, 60, 63, 54);

        asiento8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        asiento8.setContentAreaFilled(false);
        panelasientos.add(asiento8);
        asiento8.setBounds(309, 60, 63, 54);

        asiento9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        asiento9.setContentAreaFilled(false);
        panelasientos.add(asiento9);
        asiento9.setBounds(348, 60, 63, 54);

        asiento10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        asiento10.setContentAreaFilled(false);
        panelasientos.add(asiento10);
        asiento10.setBounds(387, 60, 63, 54);

        asiento11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        asiento11.setContentAreaFilled(false);
        panelasientos.add(asiento11);
        asiento11.setBounds(426, 60, 63, 54);

        asiento12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        asiento12.setContentAreaFilled(false);
        panelasientos.add(asiento12);
        asiento12.setBounds(465, 60, 63, 54);

        asiento13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        asiento13.setContentAreaFilled(false);
        panelasientos.add(asiento13);
        asiento13.setBounds(504, 60, 63, 54);

        asiento14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        asiento14.setContentAreaFilled(false);
        panelasientos.add(asiento14);
        asiento14.setBounds(543, 60, 63, 54);

        asiento15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        asiento15.setContentAreaFilled(false);
        panelasientos.add(asiento15);
        asiento15.setBounds(32, 132, 63, 54);

        asiento16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        asiento16.setContentAreaFilled(false);
        panelasientos.add(asiento16);
        asiento16.setBounds(71, 132, 63, 54);

        asiento17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        asiento17.setContentAreaFilled(false);
        panelasientos.add(asiento17);
        asiento17.setBounds(110, 132, 63, 54);

        asiento18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        asiento18.setContentAreaFilled(false);
        panelasientos.add(asiento18);
        asiento18.setBounds(153, 132, 63, 54);

        asiento19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        asiento19.setContentAreaFilled(false);
        panelasientos.add(asiento19);
        asiento19.setBounds(192, 132, 63, 54);

        asiento20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        asiento20.setContentAreaFilled(false);
        panelasientos.add(asiento20);
        asiento20.setBounds(231, 132, 63, 54);

        asiento21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        asiento21.setContentAreaFilled(false);
        panelasientos.add(asiento21);
        asiento21.setBounds(270, 132, 63, 54);

        asiento22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        asiento22.setContentAreaFilled(false);
        panelasientos.add(asiento22);
        asiento22.setBounds(309, 132, 63, 54);

        asiento23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        asiento23.setContentAreaFilled(false);
        panelasientos.add(asiento23);
        asiento23.setBounds(348, 132, 63, 54);

        asiento24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        asiento24.setContentAreaFilled(false);
        panelasientos.add(asiento24);
        asiento24.setBounds(387, 132, 63, 54);

        asiento25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        asiento25.setContentAreaFilled(false);
        panelasientos.add(asiento25);
        asiento25.setBounds(426, 132, 63, 54);

        asiento26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        asiento26.setContentAreaFilled(false);
        panelasientos.add(asiento26);
        asiento26.setBounds(465, 132, 63, 54);

        asiento27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        asiento27.setContentAreaFilled(false);
        panelasientos.add(asiento27);
        asiento27.setBounds(504, 132, 63, 54);

        asiento28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        asiento28.setContentAreaFilled(false);
        panelasientos.add(asiento28);
        asiento28.setBounds(543, 132, 63, 54);

        asiento29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        asiento29.setContentAreaFilled(false);
        panelasientos.add(asiento29);
        asiento29.setBounds(32, 204, 63, 54);

        asiento30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        asiento30.setContentAreaFilled(false);
        panelasientos.add(asiento30);
        asiento30.setBounds(71, 204, 63, 54);

        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        jButton31.setContentAreaFilled(false);
        panelasientos.add(jButton31);
        jButton31.setBounds(110, 204, 63, 54);

        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        jButton32.setContentAreaFilled(false);
        panelasientos.add(jButton32);
        jButton32.setBounds(153, 204, 63, 54);

        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        jButton33.setContentAreaFilled(false);
        panelasientos.add(jButton33);
        jButton33.setBounds(192, 204, 63, 54);

        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        jButton34.setContentAreaFilled(false);
        panelasientos.add(jButton34);
        jButton34.setBounds(231, 204, 63, 54);

        jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        jButton35.setContentAreaFilled(false);
        panelasientos.add(jButton35);
        jButton35.setBounds(270, 204, 63, 54);

        jButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        jButton36.setContentAreaFilled(false);
        panelasientos.add(jButton36);
        jButton36.setBounds(309, 204, 63, 54);

        jButton37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        jButton37.setContentAreaFilled(false);
        panelasientos.add(jButton37);
        jButton37.setBounds(348, 204, 63, 54);

        jButton38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        jButton38.setContentAreaFilled(false);
        panelasientos.add(jButton38);
        jButton38.setBounds(387, 204, 63, 54);

        jButton39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        jButton39.setContentAreaFilled(false);
        panelasientos.add(jButton39);
        jButton39.setBounds(426, 204, 63, 54);

        jButton40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        jButton40.setContentAreaFilled(false);
        panelasientos.add(jButton40);
        jButton40.setBounds(465, 204, 63, 54);

        jButton41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        jButton41.setContentAreaFilled(false);
        panelasientos.add(jButton41);
        jButton41.setBounds(504, 204, 63, 54);

        jButton42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        jButton42.setContentAreaFilled(false);
        panelasientos.add(jButton42);
        jButton42.setBounds(543, 204, 63, 54);

        jButton43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        jButton43.setContentAreaFilled(false);
        panelasientos.add(jButton43);
        jButton43.setBounds(32, 276, 63, 54);

        jButton44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        jButton44.setContentAreaFilled(false);
        panelasientos.add(jButton44);
        jButton44.setBounds(71, 276, 63, 54);

        jButton45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        jButton45.setContentAreaFilled(false);
        panelasientos.add(jButton45);
        jButton45.setBounds(110, 276, 63, 54);

        jButton46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        jButton46.setContentAreaFilled(false);
        panelasientos.add(jButton46);
        jButton46.setBounds(153, 276, 63, 54);

        jButton47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        jButton47.setContentAreaFilled(false);
        panelasientos.add(jButton47);
        jButton47.setBounds(192, 276, 63, 54);

        jButton48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        jButton48.setContentAreaFilled(false);
        panelasientos.add(jButton48);
        jButton48.setBounds(231, 276, 63, 54);

        jButton49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        jButton49.setContentAreaFilled(false);
        panelasientos.add(jButton49);
        jButton49.setBounds(270, 276, 63, 54);

        jButton50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        jButton50.setContentAreaFilled(false);
        panelasientos.add(jButton50);
        jButton50.setBounds(309, 276, 63, 54);

        jButton51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        jButton51.setContentAreaFilled(false);
        panelasientos.add(jButton51);
        jButton51.setBounds(348, 276, 63, 54);

        jButton52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        jButton52.setContentAreaFilled(false);
        panelasientos.add(jButton52);
        jButton52.setBounds(387, 276, 63, 54);

        jButton53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        jButton53.setContentAreaFilled(false);
        panelasientos.add(jButton53);
        jButton53.setBounds(426, 276, 63, 54);

        jButton54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        jButton54.setContentAreaFilled(false);
        panelasientos.add(jButton54);
        jButton54.setBounds(465, 276, 63, 54);

        jButton55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        jButton55.setContentAreaFilled(false);
        panelasientos.add(jButton55);
        jButton55.setBounds(504, 276, 63, 54);

        jButton56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png"))); // NOI18N
        jButton56.setContentAreaFilled(false);
        panelasientos.add(jButton56);
        jButton56.setBounds(543, 276, 63, 54);

        elb.setText("jButton1");
        elb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elbActionPerformed(evt);
            }
        });
        panelasientos.add(elb);
        elb.setBounds(480, 10, 73, 23);
        panelasientos.add(elt);
        elt.setBounds(319, 10, 120, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelasientos, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelasientos, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void elbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elbActionPerformed
        int num = Integer.parseInt(elt.getText().toString());
        if (num == 1) {
            asiento1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/asientodesocupado.png")));
        }
    }//GEN-LAST:event_elbActionPerformed

    private void asiento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento2ActionPerformed

    }//GEN-LAST:event_asiento2ActionPerformed

    private void asiento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento1ActionPerformed

    }//GEN-LAST:event_asiento1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Asientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Asientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Asientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Asientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Asientos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton asiento1;
    private javax.swing.JButton asiento10;
    private javax.swing.JButton asiento11;
    private javax.swing.JButton asiento12;
    private javax.swing.JButton asiento13;
    private javax.swing.JButton asiento14;
    private javax.swing.JButton asiento15;
    private javax.swing.JButton asiento16;
    private javax.swing.JButton asiento17;
    private javax.swing.JButton asiento18;
    private javax.swing.JButton asiento19;
    private javax.swing.JButton asiento2;
    private javax.swing.JButton asiento20;
    private javax.swing.JButton asiento21;
    private javax.swing.JButton asiento22;
    private javax.swing.JButton asiento23;
    private javax.swing.JButton asiento24;
    private javax.swing.JButton asiento25;
    private javax.swing.JButton asiento26;
    private javax.swing.JButton asiento27;
    private javax.swing.JButton asiento28;
    private javax.swing.JButton asiento29;
    private javax.swing.JButton asiento3;
    private javax.swing.JButton asiento30;
    private javax.swing.JButton asiento4;
    private javax.swing.JButton asiento5;
    private javax.swing.JButton asiento6;
    private javax.swing.JButton asiento7;
    private javax.swing.JButton asiento8;
    private javax.swing.JButton asiento9;
    private javax.swing.JButton elb;
    private javax.swing.JTextField elt;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JPanel panelasientos;
    // End of variables declaration//GEN-END:variables
}

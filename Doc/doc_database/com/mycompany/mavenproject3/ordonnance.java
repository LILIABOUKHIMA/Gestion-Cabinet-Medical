/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject3;

import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class ordonnance extends javax.swing.JFrame {

    /**
     * Creates new form ordonnance
     */
    public ordonnance() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        sidepane = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nouvel_visit = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        ajouter = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        supprimer = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        imprimmer = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        nom = new javax.swing.JTextField();
        nomMedicament = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        prenom = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        dosage = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        quantite = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        forme = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setName(""); // NOI18N
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setEnabled(false);
        bg.setName("frame1"); // NOI18N
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidepane.setBackground(new java.awt.Color(51, 204, 255));

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("G:\\ordonnace\\mavenproject3\\src\\main\\java\\com\\mycompany\\mavenproject3\\image\\home.png")); // NOI18N

        jLabel1.setBackground(new java.awt.Color(0, 102, 200));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Acceuil");
        jLabel1.setToolTipText("Acceuil");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        nouvel_visit.setBackground(new java.awt.Color(0, 102, 255));
        nouvel_visit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nouvel_visitMousePressed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 2, 27)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Nouvel visite");

        javax.swing.GroupLayout nouvel_visitLayout = new javax.swing.GroupLayout(nouvel_visit);
        nouvel_visit.setLayout(nouvel_visitLayout);
        nouvel_visitLayout.setHorizontalGroup(
            nouvel_visitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nouvel_visitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        nouvel_visitLayout.setVerticalGroup(
            nouvel_visitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nouvel_visitLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(nouvel_visitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        ajouter.setBackground(new java.awt.Color(0, 102, 255));
        ajouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ajouterMouseReleased(evt);
            }
        });

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon("G:\\ordonnace\\mavenproject3\\src\\main\\java\\com\\mycompany\\mavenproject3\\image\\plus.png")); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 2, 27)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Ajouter");

        javax.swing.GroupLayout ajouterLayout = new javax.swing.GroupLayout(ajouter);
        ajouter.setLayout(ajouterLayout);
        ajouterLayout.setHorizontalGroup(
            ajouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ajouterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ajouterLayout.setVerticalGroup(
            ajouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ajouterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ajouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addContainerGap())
        );

        supprimer.setBackground(new java.awt.Color(0, 102, 255));
        supprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                supprimerMousePressed(evt);
            }
        });

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon("G:\\ordonnace\\mavenproject3\\src\\main\\java\\com\\mycompany\\mavenproject3\\image\\moins.png")); // NOI18N

        jLabel17.setFont(new java.awt.Font("Segoe UI", 2, 27)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Supprimer");

        javax.swing.GroupLayout supprimerLayout = new javax.swing.GroupLayout(supprimer);
        supprimer.setLayout(supprimerLayout);
        supprimerLayout.setHorizontalGroup(
            supprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(supprimerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        supprimerLayout.setVerticalGroup(
            supprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(supprimerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(supprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addContainerGap())
        );

        imprimmer.setBackground(new java.awt.Color(0, 102, 255));
        imprimmer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                imprimmerMousePressed(evt);
            }
        });

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon("G:\\ordonnace\\mavenproject3\\src\\main\\java\\com\\mycompany\\mavenproject3\\image\\printer.png")); // NOI18N

        jLabel21.setFont(new java.awt.Font("Segoe UI", 2, 27)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Imprimmer");

        javax.swing.GroupLayout imprimmerLayout = new javax.swing.GroupLayout(imprimmer);
        imprimmer.setLayout(imprimmerLayout);
        imprimmerLayout.setHorizontalGroup(
            imprimmerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imprimmerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        imprimmerLayout.setVerticalGroup(
            imprimmerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imprimmerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(imprimmerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout sidepaneLayout = new javax.swing.GroupLayout(sidepane);
        sidepane.setLayout(sidepaneLayout);
        sidepaneLayout.setHorizontalGroup(
            sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nouvel_visit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ajouter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(supprimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(imprimmer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sidepaneLayout.setVerticalGroup(
            sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(nouvel_visit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imprimmer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        bg.add(sidepane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 290, 520));

        jPanel2.setBackground(new java.awt.Color(51, 205, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Info patient :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 760, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel4.setText("            Ordonnace");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 0, 190, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setText("Prenom :");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 90, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setText("Age :");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 90, 60, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel7.setText("Dosage :");
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 80, 30));

        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });
        bg.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 90, 70, 30));
        bg.add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 92, 150, 30));
        bg.add(nomMedicament, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 180, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel8.setText("Nom Médicament :");
        bg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 180, 30));
        bg.add(prenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, 150, 30));

        jPanel3.setBackground(new java.awt.Color(51, 205, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Information Médicament :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(507, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        bg.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 760, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel10.setText("Nom :");
        bg.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 60, 30));
        bg.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, 150, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel11.setText("Date :");
        bg.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 60, 30));

        dosage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "200 mg", "500 mg", "1000 mg", "none" }));
        bg.add(dosage, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 140, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel12.setText("Quantité :");
        bg.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 270, 90, 30));

        quantite.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", " " }));
        bg.add(quantite, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 270, 140, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel13.setText("Forme :");
        bg.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, 80, 30));

        forme.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Capsulles", "pommade" }));
        bg.add(forme, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 230, 140, 30));

        table.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nom Médicament", "Forme", "Dosage", "Quantité"
            }
        ));
        jScrollPane1.setViewportView(table);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 710, 180));

        jScrollPane2.setFont(new java.awt.Font("Segoe UI", 0, 1)); // NOI18N

        jTextPane2.setContentType("text/html"); // NOI18N
        jScrollPane2.setViewportView(jTextPane2);

        bg.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 20, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 1022, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void nouvel_visitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nouvel_visitMousePressed
        // TODO add your handling code here:
        table.setModel(new DefaultTableModel(null,new String []{"Nom Médicament","Quantité","Forme","Dosage"}));
        nomMedicament.setText("");
        nom.setText("");
        prenom.setText("");
        age.setText("");
        date.setText("");
    }//GEN-LAST:event_nouvel_visitMousePressed

    private void ajouterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterMouseReleased
        // TODO add your handling code here:
        if (nomMedicament.getText().equals("")){
            JOptionPane.showMessageDialog(this,"veuillez ecrire le nom du medicament");

        }
        else{
            String data [] = {nomMedicament.getText(),forme.getSelectedItem().toString(),dosage.getSelectedItem().toString(),quantite.getSelectedItem().toString()};
            DefaultTableModel tb = (DefaultTableModel)table.getModel();
            tb.addRow(data);
        }
    }//GEN-LAST:event_ajouterMouseReleased

    private void supprimerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supprimerMousePressed
        // TODO add your handling code here:
        DefaultTableModel tb = (DefaultTableModel)table.getModel();
        if (table.getSelectedRowCount() == 1){
            tb.removeRow(table.getSelectedRow());
        }
        else{
            if (table.getRowCount() == 0){
                JOptionPane.showMessageDialog(this,"la table est vide!");
            }
            else{
                JOptionPane.showMessageDialog(this,"veuillez selection une seule colomn !");
            }
        }
    }//GEN-LAST:event_supprimerMousePressed

    private void imprimmerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imprimmerMousePressed
        // TODO add your handling code here:
        if (nom.getText().equals("") || prenom.getText().equals("") || age.getText().equals("") || date.getText().equals("")){
            
            JOptionPane.showMessageDialog(this,"veuillez saisir tout les information dans \"Info Patient\"");
        }
        else if (table.getRowCount() == 0){
            JOptionPane.showMessageDialog(this,"le tableau est vide veuillez saisir au moins un medicament");
        }
        else{
            int i =table.getRowCount();
        //
        String v="";
        for (int j=0; j< i ; j++){
            
           v= v+"<b>Nom medicament </b>"+ table.getValueAt(j, 0)+ "<b>forme </b>"+table.getValueAt(j, 1)+"<b>daosage</b>"+table.getValueAt(j, 2)+ "<b>Quantite</b> "+
                   table.getValueAt(j, 3)+ "/ "+"<br><br>" ;
            
        }     
        //
        jTextPane2.setText("<html>"
                +"<body>\n" +
"		<center><h1><u >Ordonnace</u></h1></center>\n" +
" \n" +
"		<span style=\"text-align: left; color: blue;\"><b>Docteur Ghrieb Houssem</b></span><br>\n" +
                "<span style=\"text-align: left; color: blue;\"><b>Tel : 0561055117</b></span><br>\n"+
 
"\n" +
"\n" +
"		<span style=\"text-align: left;color: blue;\"><b>Médecin Generaliste</b></span><br>\n" +
"		\n" +
"		<br>\n" +
"\n" +
"		<span style=\"float : left\"><b>Nom : </b></span>" + nom.getText()+"<br>"+
"		<span style=\"text-align : center;\"><b>Prenom : </b></span>\n" + prenom.getText()+"<br>"+
"		<span style=\"float : right\"><b>Age : </b></span>\n" +age.getText()+"<br>\n" +
"	\n" + "<span style=\"float : right\"><b>Date : </b></span>\n" +date.getText()+"<br>\n"+
"\n" +"<center><span><b>Prescription</b></span></center> \n" +
        "<span >"+v+"</span><br>\n" +
"</body>\n" +
"</html>");
        
        MessageFormat tete = new MessageFormat("");
        MessageFormat pied = new MessageFormat("");
        try{
           jTextPane2.print(tete, pied);
        } catch (PrinterException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        }
 
        
    }//GEN-LAST:event_imprimmerMousePressed

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
            java.util.logging.Logger.getLogger(ordonnance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ordonnance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ordonnance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ordonnance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ordonnance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JPanel ajouter;
    private javax.swing.JPanel bg;
    private javax.swing.JTextField date;
    private javax.swing.JComboBox<String> dosage;
    private javax.swing.JComboBox<String> forme;
    private javax.swing.JPanel imprimmer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField nomMedicament;
    private javax.swing.JPanel nouvel_visit;
    private javax.swing.JTextField prenom;
    private javax.swing.JComboBox<String> quantite;
    private javax.swing.JPanel sidepane;
    private javax.swing.JPanel supprimer;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}

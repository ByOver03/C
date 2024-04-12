package views;

import java.awt.Color;

public class Principal extends javax.swing.JPanel {

    public Principal() {
        initComponents();
        InitStyles();
    }
    
    private void InitStyles() {
        welcome.putClientProperty("FlatLaf.Style", "h1");
        welcome.setForeground(Color.black);
        
        summary.putClientProperty("FlatLaf.StyleClass", "large");
        summary.setForeground(Color.black);
        
        list1.putClientProperty("FlatLaf.StyleClass", "large");
        list1.setForeground(Color.black);
        
        list2.putClientProperty("FlatLaf.StyleClass", "large");
        list2.setForeground(Color.black);
        
        list3.putClientProperty("FlatLaf.StyleClass", "large");
        list3.setForeground(Color.black);
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
        welcome = new javax.swing.JLabel();
        summary = new javax.swing.JLabel();
        list1 = new javax.swing.JLabel();
        list2 = new javax.swing.JLabel();
        list3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        welcome.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        welcome.setText("Welcome");

        summary.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        summary.setText("Summary");

        list1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        list1.setText("• aaaa");

        list2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        list2.setText("• aaaa");

        list3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        list3.setText("• aaaa");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(welcome, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                        .addGap(510, 510, 510))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(list1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(316, 316, 316))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(list2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(316, 316, 316))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(list3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(316, 316, 316))))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(summary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addComponent(summary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(list1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(185, 185, 185))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(list2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(165, 165, 165))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(list3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(145, 145, 145))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel list1;
    private javax.swing.JLabel list2;
    private javax.swing.JLabel list3;
    private javax.swing.JLabel summary;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
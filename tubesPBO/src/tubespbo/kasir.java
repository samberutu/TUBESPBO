/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import com.mysql.jdbc.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import koneksi.conek;
import java.sql.*;
import java.util.Date;  
import java.text.DateFormat;  
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author samNOLIMIT
 */
public class kasir extends javax.swing.JFrame {
    public float harga;
    HashMap<Integer,String> hari = new HashMap<Integer,String>();
    
    private String getTanggal() {  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
        Date date = new Date();  
        return dateFormat.format(date);  
    }
    public void tampilhari(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No. Antrian");
        model.addColumn("Nama Pemilik");
        int a = hari.size();
        for(Map.Entry g : hari.entrySet()){
            model.addRow(new Object[]{g.getKey(),g.getValue()});
        }
        tabelhari1.setModel(model);
        
    }
    
    public void kosongkan_form(){
        namaPelangganText.setText(null);
        beratPakaianText.setText(null);
        hargaText.setText(null);
    }
    
    public void tampilKasirUpdate(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No. Antrian");
        model.addColumn("Nama Pemilik");
        model.addColumn("Status");
       
        
        try{
            int no_antrian=0;
            String strSelect = ("select no_antrian,nama_pemilik,status from produk where status='SELESAI'");
            Statement Select = (Statement) conek.GetConnection().createStatement();
            ResultSet rset = Select.executeQuery(strSelect);
            while(rset.next()){
                model.addRow(new Object[]{rset.getInt(1),rset.getString(2),rset.getString(3)});   
            }
            tabelUpdate.setModel(model);
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "data Gagal Di UPDATE"+ex.getMessage());
        }
    }
    

    /**
     * Creates new form kasir
     */
    public kasir() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bodyKasir = new javax.swing.JPanel();
        menuKasir = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        btnInput = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnUpdate1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        mainKasir = new javax.swing.JPanel();
        inputPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        namaPelangganText = new javax.swing.JTextField();
        beratPakaianText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnConvert = new javax.swing.JButton();
        btnInputKasir = new javax.swing.JButton();
        hargaText = new javax.swing.JTextField();
        updatePanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tampilNoAntrian = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelUpdate = new javax.swing.JTable();
        hargaKasir = new javax.swing.JTextField();
        sunPanel = new javax.swing.JPanel();
        tabelhari = new javax.swing.JScrollPane();
        tabelhari1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bodyKasir.setBackground(new java.awt.Color(255, 255, 255));

        menuKasir.setBackground(new java.awt.Color(255, 255, 255));
        menuKasir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));

        btnUpdate.setIcon(new javax.swing.ImageIcon("C:\\Users\\samNOLIMIT\\Documents\\TUBES PBO\\logo\\icons8-update-24.png")); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnInput.setIcon(new javax.swing.ImageIcon("C:\\Users\\samNOLIMIT\\Documents\\TUBES PBO\\logo\\icons8-text-input-form-24 (1).png")); // NOI18N
        btnInput.setText("INPUT");
        btnInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("Kasir Laundry");

        btnUpdate1.setIcon(new javax.swing.ImageIcon("C:\\Users\\samNOLIMIT\\Downloads\\icons8-exit-32.png")); // NOI18N
        btnUpdate1.setText("LOGOUT");
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\samNOLIMIT\\Downloads\\icons8-sun-32.png")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuKasirLayout = new javax.swing.GroupLayout(menuKasir);
        menuKasir.setLayout(menuKasirLayout);
        menuKasirLayout.setHorizontalGroup(
            menuKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuKasirLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(86, 86, 86)
                .addComponent(btnInput)
                .addGap(50, 50, 50)
                .addComponent(btnUpdate)
                .addGap(29, 29, 29)
                .addComponent(btnUpdate1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuKasirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        menuKasirLayout.setVerticalGroup(
            menuKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuKasirLayout.createSequentialGroup()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(menuKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnInput)
                    .addComponent(jLabel1)
                    .addComponent(btnUpdate1))
                .addGap(32, 32, 32))
        );

        mainKasir.setBackground(new java.awt.Color(255, 255, 255));
        mainKasir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        mainKasir.setLayout(new java.awt.CardLayout());

        inputPanel.setBackground(new java.awt.Color(129, 236, 236));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Input data Pelanggan");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setText("Nama pelanggan");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setText("Berat pakaian");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setText("Harga");

        btnConvert.setIcon(new javax.swing.ImageIcon("C:\\Users\\samNOLIMIT\\Documents\\TUBES PBO\\logo\\icons8-currency-exchange-24.png")); // NOI18N
        btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
        });

        btnInputKasir.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnInputKasir.setText("INPUT");
        btnInputKasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputKasirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jLabel2))
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(namaPelangganText)
                            .addComponent(beratPakaianText, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addComponent(hargaText, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
                .addContainerGap(253, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnInputKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(244, 244, 244))
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(66, 66, 66)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(namaPelangganText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(beratPakaianText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnConvert))
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(hargaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(btnInputKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        mainKasir.add(inputPanel, "card2");

        updatePanel.setBackground(new java.awt.Color(129, 236, 236));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel6.setText("update data");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel7.setText("NO. Antrian");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel8.setText("HARGA PAKAIAN");

        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabelUpdate.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelUpdateMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelUpdate);

        javax.swing.GroupLayout updatePanelLayout = new javax.swing.GroupLayout(updatePanel);
        updatePanel.setLayout(updatePanelLayout);
        updatePanelLayout.setHorizontalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(updatePanelLayout.createSequentialGroup()
                        .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tampilNoAntrian, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(hargaKasir)))
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        updatePanelLayout.setVerticalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePanelLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tampilNoAntrian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(hargaKasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(232, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainKasir.add(updatePanel, "card3");

        sunPanel.setBackground(new java.awt.Color(204, 0, 204));

        tabelhari1.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelhari.setViewportView(tabelhari1);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Pelanggan Masuk");

        javax.swing.GroupLayout sunPanelLayout = new javax.swing.GroupLayout(sunPanel);
        sunPanel.setLayout(sunPanelLayout);
        sunPanelLayout.setHorizontalGroup(
            sunPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sunPanelLayout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sunPanelLayout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addComponent(tabelhari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );
        sunPanelLayout.setVerticalGroup(
            sunPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sunPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabelhari, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        mainKasir.add(sunPanel, "card4");

        javax.swing.GroupLayout bodyKasirLayout = new javax.swing.GroupLayout(bodyKasir);
        bodyKasir.setLayout(bodyKasirLayout);
        bodyKasirLayout.setHorizontalGroup(
            bodyKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyKasirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bodyKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mainKasir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuKasir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        bodyKasirLayout.setVerticalGroup(
            bodyKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyKasirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuKasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mainKasir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyKasir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyKasir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputActionPerformed
        // TODO add your handling code here:
        //REMOVE PANEL
        mainKasir.removeAll();
        mainKasir.repaint();
        mainKasir.revalidate();
        
        //add panel
        mainKasir.add(inputPanel);//memanggil input panel
        mainKasir.repaint();
        mainKasir.revalidate();
    }//GEN-LAST:event_btnInputActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        //REMOVE PANEL
        mainKasir.removeAll();
        mainKasir.repaint();
        mainKasir.revalidate();
        
        //add panel
        mainKasir.add(updatePanel); //memanggil update panel
        mainKasir.repaint();
        mainKasir.revalidate();
        tampilKasirUpdate();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnInputKasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputKasirActionPerformed
        // TODO add your handling code here:
            //String kosong=null;
        
           try{
                //menghitung banyak no antrian
                int no_antrian=0;
                String strSelect = ("select no_antrian from produk"); //query untuk nomor antrian
                Statement Select = (Statement) conek.GetConnection().createStatement();
                ResultSet rset = Select.executeQuery(strSelect);
                while(rset.next()){
                    no_antrian++; //menambah no antrian dengan menghitung banyak data di tabel
                }
                //input data produk setelah nomor antrian terakhir diketahui
                //System.out.println(usernameLabel.getText());
                Statement statement = (Statement) conek.GetConnection().createStatement();
                statement.executeUpdate("insert into produk VALUES (" + no_antrian +",'"+getTanggal()+"','"
                        +namaPelangganText.getText()+"','"
                        +beratPakaianText.getText()+"',"+harga
                        +",'Dalam Antrian"+"','0000-00-00"+"');"); //query untk perintah sql
                statement.close ();
                
                JOptionPane.showMessageDialog(null, "data berhasil disimpan");
                hari.put(no_antrian, namaPelangganText.getText()); //mengisi data sementara inputan 
                kosongkan_form();
               
                
                //this.dispose();
            }catch (Exception t){
                
            JOptionPane.showMessageDialog(null, "data gagal disimpan"+t.getMessage());
            }
           
        this.harga=0;
        
    }//GEN-LAST:event_btnInputKasirActionPerformed

    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed
        // TODO add your handling code here:
        String berat=beratPakaianText.getText();
        float Harga;
        Harga=Float.parseFloat(berat) * 5000; //mengubah tipedata string menjadi float NB:Rp5000/Kg
        berat=String.valueOf(Harga);
        this.harga=Harga;
        hargaText.setText(berat);
    }//GEN-LAST:event_btnConvertActionPerformed

    private void tabelUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelUpdateMouseClicked
        // TODO add your handling code here:
        int baris = tabelUpdate.rowAtPoint(evt.getPoint());
        String antri = tabelUpdate.getValueAt(baris, 0).toString();
        String hargacui = "select harga from produk where no_antrian = "+antri;
        tampilNoAntrian.setText(antri);
        try{
            Statement Select = (Statement) conek.GetConnection().createStatement();
            ResultSet rset = Select.executeQuery(hargacui);
            while(rset.next()){
               hargaKasir.setText(rset.getString(1));
            }
            
            
            
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "data gagal diUPDATE"+ex.getMessage());
        }
    }//GEN-LAST:event_tabelUpdateMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String update = "UPDATE produk set status='DITERIMA"+
                "',tgl_diterima='"+getTanggal()+
                "' WHERE no_antrian="+tampilNoAntrian.getText(); //queri update tabel
        try{
            Statement statement = (Statement) conek.GetConnection().createStatement();
            statement.executeUpdate(update);
            statement.close ();
            JOptionPane.showMessageDialog(null, "data berhasil diupdate");
            tampilKasirUpdate();
            tampilNoAntrian.setText(null);
            hargaKasir.setText(null);
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "data gagal diUPDATE"+ex.getMessage());
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        // TODO add your handling code here:
        int pesan = JOptionPane.showConfirmDialog(null,"yakin ?", "konfirmasi", JOptionPane.YES_NO_OPTION
                , JOptionPane.QUESTION_MESSAGE);
        if(pesan==JOptionPane.YES_OPTION){
            mainView a = new mainView();
            a.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnUpdate1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        mainKasir.removeAll();
        mainKasir.repaint();
        mainKasir.revalidate();
        
        //add panel
        mainKasir.add(sunPanel);
        mainKasir.repaint();
        mainKasir.revalidate();
        tampilhari();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new kasir().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField beratPakaianText;
    private javax.swing.JPanel bodyKasir;
    private javax.swing.JButton btnConvert;
    private javax.swing.JButton btnInput;
    private javax.swing.JButton btnInputKasir;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JTextField hargaKasir;
    private javax.swing.JTextField hargaText;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainKasir;
    private javax.swing.JPanel menuKasir;
    private javax.swing.JTextField namaPelangganText;
    private javax.swing.JPanel sunPanel;
    private javax.swing.JTable tabelUpdate;
    private javax.swing.JScrollPane tabelhari;
    private javax.swing.JTable tabelhari1;
    private javax.swing.JTextField tampilNoAntrian;
    private javax.swing.JPanel updatePanel;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.OperaterWorkarea;

import com.neu5100.finalproject.model.Emergency;
import com.neu5100.finalproject.model.IncidentOps;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author chenghongmei
 */
public class ViewEventJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private IncidentOps ops;
    private int ops_id;
    private Emergency e;
    
    /**
     * Creates new form ViewEventJPanel
     */
    public ViewEventJPanel(JPanel operatorProcessContainer,Emergency e) {
        initComponents();
        this.userProcessContainer = operatorProcessContainer;
        this.ops_id = ops_id;
        this.e = e;
        txteid.setText(String.valueOf(e.getEid()));
        txtename.setText(e.getEname());
        txtsui.setText(e.getSituation());
        txtpid.setText(String.valueOf(e.getPopid()));
        txttime.setText(e.getTime());
        txtzipCode.setText(String.valueOf(e.getZipcode()));
        txtopsid.setText(String.valueOf(e.getOpsid()));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtpid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txttime = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txteid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtename = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtsui = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtzipCode = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtopsid = new javax.swing.JTextField();

        txtpid.setEditable(false);

        jLabel5.setText("Date (or time)");

        txttime.setEditable(false);
        txttime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttimeActionPerformed(evt);
            }
        });

        jLabel1.setText("eid");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txteid.setEditable(false);
        txteid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txteidActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setText("View event");

        jLabel2.setText("ename");

        txtename.setEditable(false);

        jLabel3.setText("Situiation description");

        txtsui.setEditable(false);
        txtsui.setColumns(20);
        txtsui.setRows(5);
        jScrollPane2.setViewportView(txtsui);

        jLabel4.setText("Reporter id");

        jLabel7.setText("zipcode");

        txtzipCode.setEditable(false);

        jLabel8.setText("opsid");

        txtopsid.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnBack)
                        .addGap(119, 119, 119)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(txteid)
                            .addComponent(jLabel2)
                            .addComponent(txtename)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                            .addComponent(txtpid)
                            .addComponent(txttime)
                            .addComponent(txtzipCode)
                            .addComponent(txtopsid))))
                .addContainerGap(301, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(btnBack))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txteid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtpid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txttime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtzipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtopsid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        OperaterWorkareaJPanel dwjp = (OperaterWorkareaJPanel) component;
        dwjp.refreshEmergency();
        dwjp.refreshWorkRequest();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txttimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttimeActionPerformed

    private void txteidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txteidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txteidActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txteid;
    private javax.swing.JTextField txtename;
    private javax.swing.JTextField txtopsid;
    private javax.swing.JTextField txtpid;
    private javax.swing.JTextArea txtsui;
    private javax.swing.JTextField txttime;
    private javax.swing.JTextField txtzipCode;
    // End of variables declaration//GEN-END:variables
}

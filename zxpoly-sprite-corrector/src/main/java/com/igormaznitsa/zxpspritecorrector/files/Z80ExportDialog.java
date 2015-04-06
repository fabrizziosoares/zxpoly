/*
 * Copyright (C) 2015 Raydac Research Group Ltd.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.igormaznitsa.zxpspritecorrector.files;

public class Z80ExportDialog extends javax.swing.JDialog {
  private static final long serialVersionUID = -6509497729159482088L;

  private boolean accepted;
  private int videoMode;
  
  private static final String [] VIDEO_MODES = new String[]{
    "Standard ZX 256x192 (src CPU0)",
    "Standard ZX 256x192 (src CPU1)",
    "Standard ZX 256x192 (src CPU2)",
    "Standard ZX 256x192 (src CPU3)",
    "ZX-POLY 256x192",
    "ZX-POLY 512x384"};
  
  public Z80ExportDialog(final java.awt.Frame parent) {
    super(parent, true);
    initComponents();
    
    comboVideoMode.removeAllItems();
    for(final String s : VIDEO_MODES) comboVideoMode.addItem(s);
    comboVideoMode.setSelectedIndex(4);
    this.setLocationRelativeTo(parent);
  }

  public int getVideoMode(){
    return this.videoMode;
  }
  
  public boolean isAccepted(){
    return this.accepted;
  }
  
  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    buttonCancel = new javax.swing.JButton();
    buttonOk = new javax.swing.JButton();
    labelVideoMode = new javax.swing.JLabel();
    comboVideoMode = new javax.swing.JComboBox();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Options for ZX-Poly snapshot");

    buttonCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/igormaznitsa/zxpspritecorrector/icons/cross.png"))); // NOI18N
    buttonCancel.setText("Cancel");
    buttonCancel.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        buttonCancelActionPerformed(evt);
      }
    });

    buttonOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/igormaznitsa/zxpspritecorrector/icons/tick.png"))); // NOI18N
    buttonOk.setText("Ok");
    buttonOk.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        buttonOkActionPerformed(evt);
      }
    });

    labelVideoMode.setText("Initial video mode:");

    comboVideoMode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(0, 202, Short.MAX_VALUE)
            .addComponent(buttonOk)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(buttonCancel))
          .addGroup(layout.createSequentialGroup()
            .addComponent(labelVideoMode)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(comboVideoMode, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        .addContainerGap())
    );

    layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {buttonCancel, buttonOk});

    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(labelVideoMode)
          .addComponent(comboVideoMode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(buttonCancel)
          .addComponent(buttonOk))
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
    this.accepted = false;
    setVisible(false);
  }//GEN-LAST:event_buttonCancelActionPerformed

  private void buttonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOkActionPerformed
    this.accepted = true;
    this.videoMode = this.comboVideoMode.getSelectedIndex();
    setVisible(false);
  }//GEN-LAST:event_buttonOkActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton buttonCancel;
  private javax.swing.JButton buttonOk;
  private javax.swing.JComboBox comboVideoMode;
  private javax.swing.JLabel labelVideoMode;
  // End of variables declaration//GEN-END:variables
}

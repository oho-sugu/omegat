/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.omegat.gui.dialogs;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.omegat.core.Core;
import org.omegat.gui.editor.autotext.Autotext;
import org.omegat.gui.editor.autotext.AutotextPair;
import org.omegat.gui.editor.autotext.AutotextTableModel;
import org.omegat.util.OStrings;
import org.omegat.util.Preferences;

/**
 *
 * @author bartkoz
 */
public class AutotextAutoCompleterOptionsDialog extends javax.swing.JDialog {

    /** A return status code - returned if Cancel button has been pressed */
    public static final int RET_CANCEL = 0;
    /** A return status code - returned if OK button has been pressed */
    public static final int RET_OK = 1;
    
    private int returnStatus = RET_CANCEL;
    
    AutotextTableModel model = new AutotextTableModel();
    
    File theFile = null;
    File files[];
    
    final JFileChooser fc = new JFileChooser();
    
    /**
     * Creates new form AutotextAutoCompleterOptionsDialog
     */
    public AutotextAutoCompleterOptionsDialog(java.awt.Frame parent) {
        super(parent, true);
        
        // HP
        // Handle escape key to close the window
        KeyStroke escape = KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0, false);
        Action escapeAction = new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        };
        getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(escape, "ESCAPE");
        getRootPane().getActionMap().put("ESCAPE", escapeAction);
        // END HP
        
        initComponents();
        
        getRootPane().setDefaultButton(okButton);
        
        sortByLengthCheckBox.setSelected(Preferences.isPreference(Preferences.AC_AUTOTEXT_SORT_BY_LENGTH));
        sortAlphabeticallyCheckBox.setSelected(Preferences.isPreference(Preferences.AC_AUTOTEXT_SORT_ALPHABETICALLY));
        sortFullTextCheckBox.setSelected(Preferences.isPreference(Preferences.AC_AUTOTEXT_SORT_FULL_TEXT));
        sortFullTextCheckBox.setEnabled(sortAlphabeticallyCheckBox.isSelected());
        
        fc.setDialogType(JFileChooser.FILES_ONLY);
        FileFilter filter = new FileNameExtensionFilter(OStrings.getString("AC_AUTOTEXT_FILE"), "autotext");
        fc.addChoosableFileFilter(filter);
        
        //entryTextArea.setFont(this.getFont());
        model.load();
        entryTable.setModel(model);
        model.addTableModelListener(entryTable);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        sortByLengthCheckBox = new javax.swing.JCheckBox();
        sortAlphabeticallyCheckBox = new javax.swing.JCheckBox();
        sortFullTextCheckBox = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        loadButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        entryTable = new javax.swing.JTable();
        addNewRowButton = new javax.swing.JButton();
        removeEntryButton = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(OStrings.getString("AC_AUTOTEXT_OPTIONS_TITLE")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(okButton, OStrings.getString("BUTTON_OK")); // NOI18N
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(cancelButton, OStrings.getString("BUTTON_CANCEL")); // NOI18N
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(OStrings.getString("AC_AUTOTEXT_DISPLAY_PANEL"))); // NOI18N

        sortByLengthCheckBox.setText(OStrings.getString("AC_AUTOTEXT_SORT_BY_LENGTH")); // NOI18N

        sortAlphabeticallyCheckBox.setText(OStrings.getString("AC_AUTOTEXT_ALPHABETICALLY")); // NOI18N
        sortAlphabeticallyCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortAlphabeticallyCheckBoxActionPerformed(evt);
            }
        });

        sortFullTextCheckBox.setText(OStrings.getString("AC_AUTOTEXT_SORT_FULL_TEXT")); // NOI18N
        sortFullTextCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortFullTextCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(sortAlphabeticallyCheckBox)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(sortFullTextCheckBox))
                            .addComponent(sortByLengthCheckBox))
                        .addGap(0, 181, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sortByLengthCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sortAlphabeticallyCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sortFullTextCheckBox)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(OStrings.getString("AC_AUTOTEXT_ENTRIES_PANEL"))); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(loadButton, OStrings.getString("AC_AUTOTEXT_BUTTON_LOAD")); // NOI18N
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(saveButton, OStrings.getString("AC_AUTOTEXT_BUTTON_SAVE")); // NOI18N
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        entryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Shortcut", "Full text", "Comment"
            }
        ));
        jScrollPane2.setViewportView(entryTable);
        entryTable.getColumnModel().getColumn(0).setHeaderValue(OStrings.getString("AC_AUTOTEXT_ABBREVIATION")); // NOI18N
        entryTable.getColumnModel().getColumn(1).setHeaderValue(OStrings.getString("AC_AUTOTEXT_TEXT")); // NOI18N
        entryTable.getColumnModel().getColumn(2).setHeaderValue(OStrings.getString("AC_AUTOTEXT_COMMENT")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(addNewRowButton, OStrings.getString("BUTTON_ADD_NODOTS")); // NOI18N
        addNewRowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewRowButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(removeEntryButton, OStrings.getString("BUTTON_REMOVE")); // NOI18N
        removeEntryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeEntryButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loadButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeEntryButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addNewRowButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(loadButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveButton)
                        .addGap(37, 37, 37)
                        .addComponent(addNewRowButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeEntryButton)
                        .addGap(0, 153, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(okButton))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
        int result = fc.showOpenDialog(this);
        File selectedFile;
        
        if (result == JFileChooser.APPROVE_OPTION) {
            selectedFile = fc.getSelectedFile();
            try {
                Core.getAutoText().load(selectedFile.getCanonicalPath());
                model.load();
            } catch (IOException ex) {
                Logger.getLogger(AutotextAutoCompleterOptionsDialog.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_loadButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        Autotext autoText = new Autotext(null);
        
        int result = fc.showSaveDialog(this);
        if (result != JFileChooser.APPROVE_OPTION) {
            return;
        }
        model.store(autoText);
        try {
            autoText.save(fc.getSelectedFile().getCanonicalPath());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, OStrings.getString("AC_AUTOTEXT_UNABLE_TO_SAVE"));
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        doClose(RET_CANCEL);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        Autotext autoText = Core.getAutoText();
        
        model.store(autoText);
        try {
            autoText.save();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, OStrings.getString("AC_AUTOTEXT_UNABLE_TO_SAVE"));
        }
            
        Preferences.setPreference(Preferences.AC_AUTOTEXT_SORT_BY_LENGTH, sortByLengthCheckBox.isSelected());
        Preferences.setPreference(Preferences.AC_AUTOTEXT_SORT_ALPHABETICALLY, sortAlphabeticallyCheckBox.isSelected());
        Preferences.setPreference(Preferences.AC_AUTOTEXT_SORT_FULL_TEXT, sortFullTextCheckBox.isSelected());
        doClose(RET_OK);   
    }//GEN-LAST:event_okButtonActionPerformed

    private void sortAlphabeticallyCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortAlphabeticallyCheckBoxActionPerformed
        sortFullTextCheckBox.setEnabled(sortAlphabeticallyCheckBox.isSelected());
    }//GEN-LAST:event_sortAlphabeticallyCheckBoxActionPerformed

    private void addNewRowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewRowButtonActionPerformed
        // TODO add your handling code here:
        model.addRow(new AutotextPair("","",""), entryTable.getSelectedRow());
    }//GEN-LAST:event_addNewRowButtonActionPerformed

    private void removeEntryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeEntryButtonActionPerformed
        if (entryTable.getSelectedRow() != -1)
            model.removeRow(entryTable.getSelectedRow());
    }//GEN-LAST:event_removeEntryButtonActionPerformed

    private void sortFullTextCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortFullTextCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sortFullTextCheckBoxActionPerformed

    private void doClose(int retStatus) {
        returnStatus = retStatus;
        setVisible(false);
        dispose();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewRowButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTable entryTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton loadButton;
    private javax.swing.JButton okButton;
    private javax.swing.JButton removeEntryButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JCheckBox sortAlphabeticallyCheckBox;
    private javax.swing.JCheckBox sortByLengthCheckBox;
    private javax.swing.JCheckBox sortFullTextCheckBox;
    // End of variables declaration//GEN-END:variables
}

/**************************************************************************
 OmegaT - Computer Assisted Translation (CAT) tool
          with fuzzy matching, translation memory, keyword search,
          glossaries, and translation leveraging into updated projects.

 Copyright (C) 2000-2006 Keith Godfrey and Maxym Mykhalchuk
               2007-2010 Didier Briel
               2010 Antonio Vilei
               2011-2016 Didier Briel
               Home page: http://www.omegat.org/
               Support center: https://omegat.org/support

 This file is part of OmegaT.

 OmegaT is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 OmegaT is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 **************************************************************************/

package org.omegat.filters3.xml.openxml;

import java.awt.event.ActionEvent;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.AbstractAction;

import org.omegat.util.OStrings;
import org.omegat.util.gui.StaticUIUtils;

/**
 * Modal dialog to edit OpenXML filter options.
 *
 * @author Maxym Mykhalchuk
 * @author Didier Briel
 * @author Antonio Vilei
 */
@SuppressWarnings("serial")
public class EditOpenXMLOptionsDialog extends javax.swing.JDialog {
    /** A return status code - returned if Cancel button has been pressed */
    public static final int RET_CANCEL = 0;
    /** A return status code - returned if OK button has been pressed */
    public static final int RET_OK = 1;

    /** Creates new form EditOpenXMLOptionsDialog */
    public EditOpenXMLOptionsDialog(java.awt.Window parent, Map<String, String> config) {
        super(parent);
        setModal(true);
        this.options = new OpenXMLOptions(new TreeMap<String, String>(config));
        initComponents();

        translateHiddenTextCB.setSelected(options.getTranslateHiddenText());
        translateCommentsCB.setSelected(options.getTranslateComments());
        translateFootnotesCB.setSelected(options.getTranslateFootnotes());
        translateEndnotesCB.setSelected(options.getTranslateEndnotes());
        translateHeadersCB.setSelected(options.getTranslateHeaders());
        translateFootersCB.setSelected(options.getTranslateFooters());
        translateFallbackTextCB.setSelected(options.getTranslateFallbackText());
        translateDocumentPropertiesCB.setSelected(options.getTranslateDocumentProperties());
        translateDiagramsCB.setSelected(options.getTranslateDiagrams());
        translateExcelCommentsCB.setSelected(options.getTranslateExcelComments());
        translateSheetNamesCB.setSelected(options.getTranslateSheetNames());
        translateSlideCommentsCB.setSelected(options.getTranslateSlideComments());
        translateSlideMastersCB.setSelected(options.getTranslateSlideMasters());
        translateSlideLayoutsCB.setSelected(options.getTranslateSlideLayouts());
        translateLinksCB.setSelected(options.getTranslateLinks());
        translateChartsCB.setSelected(options.getTranslateCharts());
        translateDrawingsCB.setSelected(options.getTranslateDrawings());
        translateWordArtCB.setSelected(options.getTranslateWordArt());
        aggregateTagsCB.setSelected(options.getAggregateTags());
        preserveSpacesCB.setSelected(options.getSpacePreserving());
        breakOnBrCB.setSelected(options.getBreakOnBr());

        StaticUIUtils.setEscapeAction(this, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doClose(RET_CANCEL);
            }
        });
        setLocationRelativeTo(parent);
    }

    private final OpenXMLOptions options;

    public OpenXMLOptions getOptions() {
        return options;
    }

    private int returnStatus = RET_CANCEL;

    /** @return the return status of this dialog - one of RET_OK or RET_CANCEL */
    public int getReturnStatus() {
        return returnStatus;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        translateHiddenTextCB = new javax.swing.JCheckBox();
        translateCommentsCB = new javax.swing.JCheckBox();
        translateFootnotesCB = new javax.swing.JCheckBox();
        translateEndnotesCB = new javax.swing.JCheckBox();
        translateHeadersCB = new javax.swing.JCheckBox();
        translateFootersCB = new javax.swing.JCheckBox();
        translateFallbackTextCB = new javax.swing.JCheckBox();
        translateDocumentPropertiesCB = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        translateExcelCommentsCB = new javax.swing.JCheckBox();
        translateSheetNamesCB = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        translateSlideCommentsCB = new javax.swing.JCheckBox();
        translateSlideMastersCB = new javax.swing.JCheckBox();
        translateSlideLayoutsCB = new javax.swing.JCheckBox();
        translateLinksCB = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        translateChartsCB = new javax.swing.JCheckBox();
        translateDiagramsCB = new javax.swing.JCheckBox();
        translateDrawingsCB = new javax.swing.JCheckBox();
        translateWordArtCB = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        aggregateTagsCB = new javax.swing.JCheckBox();
        preserveSpacesCB = new javax.swing.JCheckBox();
        breakOnBrCB = new javax.swing.JCheckBox();

        setTitle(OStrings.getString("OpenXML_FILTER_OPTIONS")); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        buttonPanel.setMinimumSize(new java.awt.Dimension(143, 33));
        buttonPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));
        buttonPanel.add(jPanel2);

        org.openide.awt.Mnemonics.setLocalizedText(okButton, OStrings.getString("BUTTON_OK")); // NOI18N
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(okButton);

        org.openide.awt.Mnemonics.setLocalizedText(cancelButton, OStrings.getString("BUTTON_CANCEL")); // NOI18N
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(cancelButton);

        getContentPane().add(buttonPanel, java.awt.BorderLayout.SOUTH);

        jPanel1.setMinimumSize(new java.awt.Dimension(167, 121));
        jPanel1.setLayout(new java.awt.GridLayout(0, 1));

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, OStrings.getString("OpenDoc_TRANSLATE_ELEMENTS")); // NOI18N
        jPanel1.add(jLabel2);

        jLabel3.setFont(jLabel3.getFont().deriveFont(jLabel3.getFont().getStyle() | java.awt.Font.BOLD, jLabel3.getFont().getSize()-2));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, OStrings.getString("OpenXML_WORD")); // NOI18N
        jPanel1.add(jLabel3);

        org.openide.awt.Mnemonics.setLocalizedText(translateHiddenTextCB, OStrings.getString("OpenXML_TRANSLATE_HIDDEN_TEXT")); // NOI18N
        jPanel1.add(translateHiddenTextCB);

        translateCommentsCB.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(translateCommentsCB, OStrings.getString("OpenXML_TRANSLATE_COMMENTS")); // NOI18N
        jPanel1.add(translateCommentsCB);

        translateFootnotesCB.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(translateFootnotesCB, OStrings.getString("OpenXML_TRANSLATE_FOOTNOTES")); // NOI18N
        jPanel1.add(translateFootnotesCB);

        translateEndnotesCB.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(translateEndnotesCB, OStrings.getString("OpenXML_TRANSLATE_ENDNOTES")); // NOI18N
        jPanel1.add(translateEndnotesCB);

        translateHeadersCB.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(translateHeadersCB, OStrings.getString("OpenXML_TRANSLATE_HEADERS")); // NOI18N
        jPanel1.add(translateHeadersCB);

        translateFootersCB.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(translateFootersCB, OStrings.getString("OpenXML_TRANSLATE_FOOTERS")); // NOI18N
        jPanel1.add(translateFootersCB);

        org.openide.awt.Mnemonics.setLocalizedText(translateFallbackTextCB, OStrings.getString("OpenXML_TRANSLATE_FALLBACK_TEXT")); // NOI18N
        jPanel1.add(translateFallbackTextCB);

        org.openide.awt.Mnemonics.setLocalizedText(translateDocumentPropertiesCB, OStrings.getString("OpenXML_TRANSLATE_DOCUMENT_PROPERTIES")); // NOI18N
        jPanel1.add(translateDocumentPropertiesCB);

        jLabel4.setFont(jLabel4.getFont().deriveFont(jLabel4.getFont().getStyle() | java.awt.Font.BOLD, jLabel4.getFont().getSize()-2));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, OStrings.getString("OpenXML_EXCEL")); // NOI18N
        jPanel1.add(jLabel4);

        translateExcelCommentsCB.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(translateExcelCommentsCB, OStrings.getString("OpenXML_TRANSLATE_EXCEL_COMMENTS")); // NOI18N
        jPanel1.add(translateExcelCommentsCB);

        org.openide.awt.Mnemonics.setLocalizedText(translateSheetNamesCB, OStrings.getString("OpenXML_TRANSLATE_EXCEL_SHEET_NAMES")); // NOI18N
        jPanel1.add(translateSheetNamesCB);

        jLabel5.setFont(jLabel5.getFont().deriveFont(jLabel5.getFont().getStyle() | java.awt.Font.BOLD, jLabel5.getFont().getSize()-2));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, OStrings.getString("OpenXML_POWER_POINT")); // NOI18N
        jPanel1.add(jLabel5);

        translateSlideCommentsCB.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(translateSlideCommentsCB, OStrings.getString("OpenXML_TRANSLATE_SLIDE_COMMENTS")); // NOI18N
        jPanel1.add(translateSlideCommentsCB);

        org.openide.awt.Mnemonics.setLocalizedText(translateSlideMastersCB, OStrings.getString("OpenXML_TRANSLATE_SLIDE_MASTERS")); // NOI18N
        jPanel1.add(translateSlideMastersCB);

        org.openide.awt.Mnemonics.setLocalizedText(translateSlideLayoutsCB, OStrings.getString("OpenXML_TRANSLATE_SLIDE_LAYOUTS")); // NOI18N
        jPanel1.add(translateSlideLayoutsCB);

        jLabel7.setFont(jLabel7.getFont().deriveFont(jLabel7.getFont().getStyle() | java.awt.Font.BOLD, jLabel7.getFont().getSize()-2));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel7, OStrings.getString("OpenXML_GLOBAL")); // NOI18N
        jPanel1.add(jLabel7);

        org.openide.awt.Mnemonics.setLocalizedText(translateLinksCB, OStrings.getString("OpenXML_TRANSLATE_LINKS")); // NOI18N
        jPanel1.add(translateLinksCB);

        org.openide.awt.Mnemonics.setLocalizedText(translateChartsCB, OStrings.getString("OpenXML_TRANSLATE_CHARTS")); // NOI18N
        jPanel1.add(translateChartsCB);

        org.openide.awt.Mnemonics.setLocalizedText(translateDiagramsCB, OStrings.getString("OpenXML_TRANSLATE_DIAGRAMS")); // NOI18N
        jPanel1.add(translateDiagramsCB);

        org.openide.awt.Mnemonics.setLocalizedText(translateDrawingsCB, OStrings.getString("OpenXML_TRANSLATE_DRAWINGS")); // NOI18N
        jPanel1.add(translateDrawingsCB);

        org.openide.awt.Mnemonics.setLocalizedText(translateWordArtCB, OStrings.getString("OpenXML_TRANSLATE_WORDART")); // NOI18N
        jPanel1.add(translateWordArtCB);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, "                                                                 ");
        jLabel1.setEnabled(false);
        jPanel1.add(jLabel1);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel6, OStrings.getString("OpenXML_GENERIC_OPTIONS")); // NOI18N
        jPanel1.add(jLabel6);

        org.openide.awt.Mnemonics.setLocalizedText(aggregateTagsCB, OStrings.getString("OpenXML_AGGREGATE_TAGS")); // NOI18N
        jPanel1.add(aggregateTagsCB);

        org.openide.awt.Mnemonics.setLocalizedText(preserveSpacesCB, OStrings.getString("OpenXML_PRESERVE_SPACES")); // NOI18N
        jPanel1.add(preserveSpacesCB);

        org.openide.awt.Mnemonics.setLocalizedText(breakOnBrCB, OStrings.getString("OpenXML_BREAK_ON_BR")); // NOI18N
        jPanel1.add(breakOnBrCB);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_okButtonActionPerformed
        options.setTranslateHiddenText(translateHiddenTextCB.isSelected());
        options.setTranslateComments(translateCommentsCB.isSelected());
        options.setTranslateFootnotes(translateFootnotesCB.isSelected());
        options.setTranslateEndnotes(translateEndnotesCB.isSelected());
        options.setTranslateHeaders(translateHeadersCB.isSelected());
        options.setTranslateFooters(translateFootersCB.isSelected());
        options.setTranslateFallbackText(translateFallbackTextCB.isSelected());
        options.setTranslateDocumentProperties(translateDocumentPropertiesCB.isSelected());
        options.setTranslateDiagrams(translateDiagramsCB.isSelected());
        options.setTranslateExcelComments(translateExcelCommentsCB.isSelected());
        options.setTranslateSheetNames(translateSheetNamesCB.isSelected());
        options.setTranslateSlideComments(translateSlideCommentsCB.isSelected());
        options.setTranslateSlideMasters(translateSlideMastersCB.isSelected());
        options.setTranslateSlideLayouts(translateSlideLayoutsCB.isSelected());
        options.setTranslateLinks(translateLinksCB.isSelected());
        options.setTranslateCharts(translateChartsCB.isSelected());
        options.setTranslateDrawings(translateDrawingsCB.isSelected());
        options.setTranslateWordArt(translateWordArtCB.isSelected());
        options.setAggregateTags(aggregateTagsCB.isSelected());
        options.setSpacePreserving(preserveSpacesCB.isSelected());
        options.setBreakOnBr(breakOnBrCB.isSelected());
        doClose(RET_OK);
    }// GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        doClose(RET_CANCEL);
    }//GEN-LAST:event_cancelButtonActionPerformed

    /** Closes the dialog */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        doClose(RET_CANCEL);
    }//GEN-LAST:event_closeDialog

    private void doClose(int retStatus) {
        returnStatus = retStatus;
        setVisible(false);
        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox aggregateTagsCB;
    private javax.swing.JCheckBox breakOnBrCB;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton okButton;
    private javax.swing.JCheckBox preserveSpacesCB;
    private javax.swing.JCheckBox translateChartsCB;
    private javax.swing.JCheckBox translateCommentsCB;
    private javax.swing.JCheckBox translateDiagramsCB;
    private javax.swing.JCheckBox translateDocumentPropertiesCB;
    private javax.swing.JCheckBox translateDrawingsCB;
    private javax.swing.JCheckBox translateEndnotesCB;
    private javax.swing.JCheckBox translateExcelCommentsCB;
    private javax.swing.JCheckBox translateFallbackTextCB;
    private javax.swing.JCheckBox translateFootersCB;
    private javax.swing.JCheckBox translateFootnotesCB;
    private javax.swing.JCheckBox translateHeadersCB;
    private javax.swing.JCheckBox translateHiddenTextCB;
    private javax.swing.JCheckBox translateSheetNamesCB;
    private javax.swing.JCheckBox translateSlideCommentsCB;
    private javax.swing.JCheckBox translateSlideLayoutsCB;
    private javax.swing.JCheckBox translateLinksCB;
    private javax.swing.JCheckBox translateSlideMastersCB;
    private javax.swing.JCheckBox translateWordArtCB;
    // End of variables declaration//GEN-END:variables
}

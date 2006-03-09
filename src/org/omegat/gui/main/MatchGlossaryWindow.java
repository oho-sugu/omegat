/**************************************************************************
 OmegaT - Computer Assisted Translation (CAT) tool 
          with fuzzy matching, translation memory, keyword search, 
          glossaries, and translation leveraging into updated projects.

 Copyright (C) 2000-2006 Keith Godfrey and Maxym Mykhalchuk
               Home page: http://www.omegat.org/omegat/omegat.html
               Support center: http://groups.yahoo.com/group/OmegaT/

 This program is free software; you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation; either version 2 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program; if not, write to the Free Software
 Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
**************************************************************************/

package org.omegat.gui.main;

import org.omegat.util.OStrings;

/**
 * This is a combined Match + Glossary window, that displays
 * fuzzy matches and glossary entries.
 * <p>
 * Contains only a Match + Glossary component.
 *
 * @author  Maxym Mykhalchuk
 */
public class MatchGlossaryWindow extends javax.swing.JFrame
{
    
    private MainWindow mainwindow;
    
    /** Creates new form MatchGlossaryWindow */
    public MatchGlossaryWindow(MainWindow mw)
    {
        mainwindow = mw;
        initComponents();
        m_matchPane.setMainWindow(mainwindow);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        m_matchPane = new org.omegat.gui.main.MatchGlossaryPane();

        setTitle(OStrings.getString("TF_MATCH_VIEWER_TITLE"));
        addComponentListener(new java.awt.event.ComponentAdapter()
        {
            public void componentHidden(java.awt.event.ComponentEvent evt)
            {
                formComponentHidden(evt);
            }
            public void componentMoved(java.awt.event.ComponentEvent evt)
            {
                formComponentMoved(evt);
            }
            public void componentResized(java.awt.event.ComponentEvent evt)
            {
                formComponentResized(evt);
            }
        });

        getContentPane().add(m_matchPane, java.awt.BorderLayout.CENTER);

        pack();
    }
    // </editor-fold>//GEN-END:initComponents

    private void formComponentResized(java.awt.event.ComponentEvent evt)//GEN-FIRST:event_formComponentResized
    {//GEN-HEADEREND:event_formComponentResized
        mainwindow.storeScreenLayout();
    }//GEN-LAST:event_formComponentResized

    private void formComponentMoved(java.awt.event.ComponentEvent evt)//GEN-FIRST:event_formComponentMoved
    {//GEN-HEADEREND:event_formComponentMoved
        mainwindow.storeScreenLayout();
    }//GEN-LAST:event_formComponentMoved

    private void formComponentHidden(java.awt.event.ComponentEvent evt)//GEN-FIRST:event_formComponentHidden
    {//GEN-HEADEREND:event_formComponentHidden
        mainwindow.matchWindowClosed();
    }//GEN-LAST:event_formComponentHidden
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.omegat.gui.main.MatchGlossaryPane m_matchPane;
    // End of variables declaration//GEN-END:variables
    
    /**
     * Returns the pane with matches/glossaries.
     */
    public MatchGlossaryPane getMatchGlossaryPane()
    {
        return m_matchPane;
    }
    
    /**
     * Returns the location of divider between match and glossary windows.
     */
    public int getDividerLocation()
    {
        return m_matchPane.getDividerLocation();
    }
    /**
     * Sets the location of divider between match and glossary windows.
     */
    public void setDividerLocation(int location)
    {
        m_matchPane.setDividerLocation(location);
    }
    
}

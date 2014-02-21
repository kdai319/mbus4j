package net.sf.mbus4j.master.ui;

/*
 * #%L
 * mbus4j-master-ui
 * %%
 * Copyright (C) 2009 - 2014 MBus4J
 * %%
 * mbus4j - Drivers for the M-Bus protocol - http://mbus4j.sourceforge.net/
 * Copyright (C) 2009-2014, mbus4j.sf.net, and individual contributors as indicated
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 * 
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 * 
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 * #L%
 */

import net.sf.mbus4j.dataframes.ApplicationReset;

/**
 *
 * @author aploese
 */
public class ApplicationResetPanel
        extends javax.swing.JPanel {

    /**
     * Creates new form ApplicationResetPanel
     */
    public ApplicationResetPanel() {
        initComponents();
        telegramTypeComboBox.removeAllItems();

        for (ApplicationReset.TelegramType value : ApplicationReset.TelegramType.values()) {
            telegramTypeComboBox.addItem(value);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents(  )
    {
        telegramTypeLabel = new javax.swing.JLabel(  );
        telegramTypeComboBox = new javax.swing.JComboBox(  );
        subTypeLabel = new javax.swing.JLabel(  );
        subTypeTextField = new javax.swing.JFormattedTextField(  );

        telegramTypeLabel.setText( "TelegramType:" );
        telegramTypeLabel.setName( "telegramTypeLabel" ); // NOI18N

        telegramTypeComboBox.setModel( new javax.swing.DefaultComboBoxModel( new String[]
                                                                             {
                                                                                 "Item 1", "Item 2", "Item 3", "Item 4"
                                                                             } ) );
        telegramTypeComboBox.setName( "telegramTypeComboBox" ); // NOI18N

        subTypeLabel.setText( "Subtype:" );
        subTypeLabel.setName( "subTypeLabel" ); // NOI18N

        subTypeTextField.setText( "jFormattedTextField1" );
        subTypeTextField.setName( "subTypeTextField" ); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout( this );
        this.setLayout( layout );
        layout.setHorizontalGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                         .addGroup( layout.createSequentialGroup(  ).addContainerGap(  )
                                                          .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                                                           .addComponent( telegramTypeLabel )
                                                                           .addComponent( subTypeLabel ) )
                                                          .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                                                          .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                                                           .addComponent( telegramTypeComboBox,
                                                                                          javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                          javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                          javax.swing.GroupLayout.PREFERRED_SIZE )
                                                                           .addComponent( subTypeTextField,
                                                                                          javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                          javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                          javax.swing.GroupLayout.PREFERRED_SIZE ) )
                                                          .addContainerGap( 163, Short.MAX_VALUE ) ) );
        layout.setVerticalGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                       .addGroup( layout.createSequentialGroup(  ).addContainerGap(  )
                                                        .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE )
                                                                         .addComponent( telegramTypeLabel )
                                                                         .addComponent( telegramTypeComboBox,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE ) )
                                                        .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                                                        .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE )
                                                                         .addComponent( subTypeLabel )
                                                                         .addComponent( subTypeTextField,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE ) )
                                                        .addContainerGap( 234, Short.MAX_VALUE ) ) );
    } // </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel subTypeLabel;
    private javax.swing.JFormattedTextField subTypeTextField;
    private javax.swing.JComboBox telegramTypeComboBox;
    private javax.swing.JLabel telegramTypeLabel;

    // End of variables declaration//GEN-END:variables
    ApplicationReset appReset;

    void setApplicationReste(ApplicationReset appReset) {
        this.appReset = appReset;
        telegramTypeComboBox.setSelectedItem(appReset.getTelegramType());
        subTypeTextField.setText(String.valueOf(appReset.getSubTelegram()));
    }

    public void commitChanges() {
        appReset.setTelegramType((ApplicationReset.TelegramType) telegramTypeComboBox.getSelectedItem());
        appReset.setSubTelegram(Integer.parseInt(subTypeTextField.getText()));
    }
}

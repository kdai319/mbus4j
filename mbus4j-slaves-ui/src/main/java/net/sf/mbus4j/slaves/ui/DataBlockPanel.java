/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DataBlockPanel.java
 *
 * Created on 09.03.2010, 09:53:45
 */
package net.sf.mbus4j.slaves.ui;

import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.border.TitledBorder;
import net.sf.mbus4j.dataframes.datablocks.DataBlock;
import net.sf.mbus4j.dataframes.datablocks.dif.DataFieldCode;
import net.sf.mbus4j.dataframes.datablocks.dif.FunctionField;
import net.sf.mbus4j.dataframes.datablocks.vif.ObjectAction;
import net.sf.mbus4j.dataframes.datablocks.vif.VifFB;
import net.sf.mbus4j.dataframes.datablocks.vif.VifFD;
import net.sf.mbus4j.dataframes.datablocks.vif.VifPrimary;
import net.sf.mbus4j.dataframes.datablocks.vif.VifTypes;
import net.sf.mbus4j.dataframes.datablocks.vif.Vife;

/**
 *
 * @author aploese
 */
public class DataBlockPanel extends javax.swing.JPanel {

    /** Creates new form DataBlockPanel */
    public DataBlockPanel() {
        initComponents();
        objectActionComboBox.removeAllItems();
        for (ObjectAction action : ObjectAction.values()) {
            objectActionComboBox.addItem(action);
        }
        dataFieldCodeComboBox.removeAllItems();
        for (DataFieldCode dfc : DataFieldCode.values()) {
            dataFieldCodeComboBox.addItem(dfc);
        }
        functionFieldComboBox.removeAllItems();
        for (FunctionField ff : FunctionField.values()) {
            functionFieldComboBox.addItem(ff);
        }
        vifTypeComboBox.removeAllItems();
        for (VifTypes value : VifTypes.values()) {
            vifTypeComboBox.addItem(value);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        objectActionLabel = new javax.swing.JLabel();
        dataFieldCodeLabel = new javax.swing.JLabel();
        exponentLabel = new javax.swing.JLabel();
        objectActionComboBox = new javax.swing.JComboBox();
        dataFieldCodeComboBox = new javax.swing.JComboBox();
        clearActionButton = new javax.swing.JButton();
        exponentTextField = new javax.swing.JFormattedTextField();
        functionFieldLabel = new javax.swing.JLabel();
        functionFieldComboBox = new javax.swing.JComboBox();
        storageNumberLabel = new javax.swing.JLabel();
        subunitLabel = new javax.swing.JLabel();
        tarifLabel = new javax.swing.JLabel();
        vifLabel = new javax.swing.JLabel();
        vifTypeComboBox = new javax.swing.JComboBox();
        storageNumberTextField = new javax.swing.JFormattedTextField();
        subunitTextField = new javax.swing.JFormattedTextField();
        tarifTextField = new javax.swing.JFormattedTextField();
        vifComboBox = new javax.swing.JComboBox();
        valueLabel = new javax.swing.JLabel();
        valueTextField = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        vifesList = new javax.swing.JList();
        vifesLabel = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        objectActionLabel.setText("Action:");
        objectActionLabel.setName("objectActionLabel"); // NOI18N

        dataFieldCodeLabel.setText("DataFieldCode:");
        dataFieldCodeLabel.setName("dataFieldCodeLabel"); // NOI18N

        exponentLabel.setText("Exponent:");
        exponentLabel.setName("exponentLabel"); // NOI18N

        objectActionComboBox.setEnabled(false);
        objectActionComboBox.setName("objectActionComboBox"); // NOI18N

        dataFieldCodeComboBox.setEnabled(false);
        dataFieldCodeComboBox.setName("dataFieldCodeComboBox"); // NOI18N

        clearActionButton.setText("Clear");
        clearActionButton.setEnabled(false);
        clearActionButton.setName("clearActionButton"); // NOI18N
        clearActionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearObjectAction(evt);
            }
        });

        exponentTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        exponentTextField.setEnabled(false);
        exponentTextField.setName("exponentTextField"); // NOI18N

        functionFieldLabel.setText("FunctionField:");
        functionFieldLabel.setName("functionFieldLabel"); // NOI18N

        functionFieldComboBox.setEnabled(false);
        functionFieldComboBox.setName("functionFieldComboBox"); // NOI18N

        storageNumberLabel.setText("StorageNumber:");
        storageNumberLabel.setName("storageNumberLabel"); // NOI18N

        subunitLabel.setText("Subunit:");
        subunitLabel.setName("subunitLabel"); // NOI18N

        tarifLabel.setText("Tarif:");
        tarifLabel.setName("tarifLabel"); // NOI18N

        vifLabel.setText("Vif:");
        vifLabel.setName("vifLabel"); // NOI18N

        vifTypeComboBox.setEnabled(false);
        vifTypeComboBox.setName("vifTypeComboBox"); // NOI18N
        vifTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vifTypeChanged(evt);
            }
        });

        storageNumberTextField.setName("storageNumberTextField"); // NOI18N

        subunitTextField.setName("subunitTextField"); // NOI18N

        tarifTextField.setName("tarifTextField"); // NOI18N

        vifComboBox.setEnabled(false);
        vifComboBox.setName("vifComboBox"); // NOI18N

        valueLabel.setText("Value:");
        valueLabel.setName("valueLabel"); // NOI18N

        valueTextField.setName("valueTextField"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        vifesList.setModel(new DefaultListModel());
        vifesList.setEnabled(false);
        vifesList.setName("vifesList"); // NOI18N
        jScrollPane1.setViewportView(vifesList);

        vifesLabel.setText("Vifes:");
        vifesLabel.setName("vifesLabel"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subunitLabel)
                    .addComponent(tarifLabel)
                    .addComponent(vifLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataFieldCodeLabel)
                            .addComponent(objectActionLabel)
                            .addComponent(exponentLabel)
                            .addComponent(functionFieldLabel)
                            .addComponent(storageNumberLabel)
                            .addComponent(valueLabel))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(vifTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vifComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(objectActionComboBox, 0, 122, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(clearActionButton))
                                    .addComponent(exponentTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(functionFieldComboBox, 0, 170, Short.MAX_VALUE)
                                    .addComponent(storageNumberTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(subunitTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(tarifTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(dataFieldCodeComboBox, 0, 170, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vifesLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(valueTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(objectActionLabel)
                            .addComponent(objectActionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vifesLabel)
                            .addComponent(clearActionButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dataFieldCodeLabel)
                            .addComponent(dataFieldCodeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exponentLabel)
                            .addComponent(exponentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(functionFieldLabel)
                            .addComponent(functionFieldComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(storageNumberLabel)
                            .addComponent(storageNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subunitLabel)
                            .addComponent(subunitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tarifLabel)
                            .addComponent(tarifTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vifLabel)
                    .addComponent(vifTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vifComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueLabel)
                    .addComponent(valueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void clearObjectAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearObjectAction
        objectActionComboBox.setSelectedItem(null);
    }//GEN-LAST:event_clearObjectAction

    private void vifTypeChanged(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vifTypeChanged
        vifComboBox.removeAllItems();
        if (vifTypeComboBox.getSelectedItem() == null) {
            return;
        }
        switch ((VifTypes) vifTypeComboBox.getSelectedItem()) {
            case ASCII:
                break;
            case PRIMARY:
                for (VifPrimary value : VifPrimary.values()) {
                    vifComboBox.addItem(value);
                }
                break;
            case FB_EXTENTION:
                for (VifFB value : VifFB.values()) {
                    vifComboBox.addItem(value);
                }
                break;
            case FD_EXTENTION:
                for (VifFD value : VifFD.values()) {
                    vifComboBox.addItem(value);
                }
                break;
            case MANUFACTURER_SPECIFIC:
                break;
            default:

        }
    }//GEN-LAST:event_vifTypeChanged
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearActionButton;
    private javax.swing.JComboBox dataFieldCodeComboBox;
    private javax.swing.JLabel dataFieldCodeLabel;
    private javax.swing.JLabel exponentLabel;
    private javax.swing.JFormattedTextField exponentTextField;
    private javax.swing.JComboBox functionFieldComboBox;
    private javax.swing.JLabel functionFieldLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox objectActionComboBox;
    private javax.swing.JLabel objectActionLabel;
    private javax.swing.JLabel storageNumberLabel;
    private javax.swing.JFormattedTextField storageNumberTextField;
    private javax.swing.JLabel subunitLabel;
    private javax.swing.JFormattedTextField subunitTextField;
    private javax.swing.JLabel tarifLabel;
    private javax.swing.JFormattedTextField tarifTextField;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JFormattedTextField valueTextField;
    private javax.swing.JComboBox vifComboBox;
    private javax.swing.JLabel vifLabel;
    private javax.swing.JComboBox vifTypeComboBox;
    private javax.swing.JLabel vifesLabel;
    private javax.swing.JList vifesList;
    // End of variables declaration//GEN-END:variables
    private DataBlock db;

    public void setDataBlock(DataBlock db) {
        this.db = db;
        if (getBorder() instanceof TitledBorder) {
            if (db.getVif() != null) {
                ((TitledBorder) getBorder()).setTitle(db.getVif().getLabel());
            } else {
                ((TitledBorder) getBorder()).setTitle("Unknown");
            }
        }
        objectActionComboBox.setSelectedItem(db.getAction());
        dataFieldCodeComboBox.setSelectedItem(db.getDataFieldCode());
        exponentTextField.setText(db.getExponent() != null ? db.getExponent().toString() : "");
        functionFieldComboBox.setSelectedItem(db.getFunctionField());
        storageNumberTextField.setText(String.valueOf(db.getStorageNumber()));
        subunitTextField.setText(String.valueOf(db.getSubUnit()));
        tarifTextField.setText(String.valueOf(db.getTariff()));
        if (db.getVif() == null) {
            vifTypeComboBox.setSelectedItem(null);
            vifComboBox.removeAllItems();
        } else {
            vifTypeComboBox.setSelectedItem(db.getVif().getVifType());
            vifTypeChanged(null);
            vifComboBox.setSelectedItem(db.getVif());
        }
        selectVifes(db.getVifes());
        valueTextField.setText(db.getValueAsString());
        //TODO VIFE Type ???
    }


    public void setVifes(Vife[] vifes) {
        DefaultListModel listModel =  (DefaultListModel)vifesList.getModel();
        listModel.removeAllElements();
        for (int i = 0; i < vifes.length; i++) {
            listModel.add(i, vifes[i]);
        }

    }

    private void selectVifes(Vife[] vifes) {
        if (vifes.length == 0) {
            vifesList.setSelectedIndex(-1);
            return;
        }
        DefaultListModel listModel =  (DefaultListModel)vifesList.getModel();
        int[] selected = new int[vifes.length];
        int selIndex = 0;
        for (int i = 0; i < vifes.length; i++) {
            int idx =listModel.indexOf(vifes[i]);
            if (idx > -1) {
                selected[selIndex++] = idx;
            }
        }
        vifesList.setSelectedIndices(selected);
    }

    public void commitChanges() {
        db.setValue(valueTextField.getText());
    }
}

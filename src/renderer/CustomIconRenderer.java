/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renderer;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

/**
 * renderer.CustomIconRenderer
 *
 * @author Yasas
 */
public class CustomIconRenderer extends DefaultTreeCellRenderer {

    ImageIcon gateIcon;
    ImageIcon appIcon;
    ImageIcon langRescIcon;
    ImageIcon processingRescIcon;
    ImageIcon dataStoreIcon;

    public CustomIconRenderer() {
        gateIcon = new ImageIcon(CustomIconRenderer.class.getResource("/images/GATE.png"));
        appIcon = new ImageIcon(CustomIconRenderer.class.getResource("/images/W_APP.png"));
        langRescIcon = new ImageIcon(CustomIconRenderer.class.getResource("/images/W_LANG_RISC.png"));
        processingRescIcon = new ImageIcon(CustomIconRenderer.class.getResource("/images/W_PROSC_RISC.png"));
        dataStoreIcon = new ImageIcon(CustomIconRenderer.class.getResource("/images/W_DATA_STORE.png"));
    }

    @Override
    public Component getTreeCellRendererComponent(JTree tree, Object value,
            boolean sel, boolean expanded, boolean leaf, int row, boolean hasFocus) {
        super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);
        Object nodeObj = ((DefaultMutableTreeNode) value).getUserObject();
        // check whatever you need to on the node user object
        if (((String) nodeObj).equals("GATE")) {
            setIcon(gateIcon);
        } else if (((String) nodeObj).equals("Applications")) {
            setIcon(appIcon);
        } else if (((String) nodeObj).equals("Language Resources")) {
            setIcon(langRescIcon);
        } else if (((String) nodeObj).equals("Processing Resources")) {
            setIcon(processingRescIcon);
        } else if (((String) nodeObj).equals("Datastores")) {
            setIcon(dataStoreIcon);
        }
        return this;
    }
}

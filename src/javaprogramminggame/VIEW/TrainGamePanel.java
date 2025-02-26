/**
 *
 * @author Asena Şahin, Halil Onur Fedai, Burak Alaydın, Barış Can
 */

package javaprogramminggame.VIEW;

import javax.swing.JButton;
import javax.swing.JTextArea;

public class TrainGamePanel extends javax.swing.JPanel {

    /**
     * Creates new form GamePanel1
     */
    public TrainGamePanel() {
        initComponents();
    }

    public JButton getButton1(){
        return selectedButton1;
    }
    public JButton getButton2(){
        return selectedButton2;
    }
    public JButton getButton3(){
        return selectedButton3;
    }
    public JButton getButton4(){
        return selectedButton4;
    }
    public JButton getBackButton(){
        return backButton;
    }
    public JTextArea getQuestionArea(){
        return questionArea;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectedButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        questionArea = new javax.swing.JTextArea();
        selectedButton3 = new javax.swing.JButton();
        selectedButton4 = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        selectedButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 255, 255));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setSize(new java.awt.Dimension(1280, 720));

        selectedButton2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        selectedButton2.setMaximumSize(new java.awt.Dimension(800, 100));
        selectedButton2.setMinimumSize(new java.awt.Dimension(800, 100));
        selectedButton2.setPreferredSize(new java.awt.Dimension(800, 100));
        selectedButton2.setSize(new java.awt.Dimension(800, 100));

        questionArea.setEditable(false);
        questionArea.setColumns(20);
        questionArea.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        questionArea.setLineWrap(true);
        questionArea.setRows(5);
        questionArea.setWrapStyleWord(true);
        questionArea.setSelectionEnd(1);
        questionArea.setSelectionStart(1);
        jScrollPane1.setViewportView(questionArea);

        selectedButton3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        selectedButton3.setMaximumSize(new java.awt.Dimension(800, 100));
        selectedButton3.setMinimumSize(new java.awt.Dimension(800, 100));
        selectedButton3.setPreferredSize(new java.awt.Dimension(800, 100));
        selectedButton3.setSize(new java.awt.Dimension(800, 100));

        selectedButton4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        selectedButton4.setMaximumSize(new java.awt.Dimension(800, 100));
        selectedButton4.setMinimumSize(new java.awt.Dimension(800, 100));
        selectedButton4.setPreferredSize(new java.awt.Dimension(800, 100));
        selectedButton4.setSize(new java.awt.Dimension(800, 100));

        backButton.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        backButton.setText("BACK");
        backButton.setMaximumSize(new java.awt.Dimension(200, 100));
        backButton.setMinimumSize(new java.awt.Dimension(200, 100));
        backButton.setPreferredSize(new java.awt.Dimension(200, 100));
        backButton.setSize(new java.awt.Dimension(200, 100));

        selectedButton1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        selectedButton1.setMaximumSize(new java.awt.Dimension(800, 100));
        selectedButton1.setMinimumSize(new java.awt.Dimension(800, 100));
        selectedButton1.setPreferredSize(new java.awt.Dimension(800, 100));
        selectedButton1.setSize(new java.awt.Dimension(800, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectedButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectedButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectedButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectedButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(240, 240, 240))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(selectedButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectedButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectedButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectedButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea questionArea;
    private javax.swing.JButton selectedButton1;
    private javax.swing.JButton selectedButton2;
    private javax.swing.JButton selectedButton3;
    private javax.swing.JButton selectedButton4;
    // End of variables declaration//GEN-END:variables
}

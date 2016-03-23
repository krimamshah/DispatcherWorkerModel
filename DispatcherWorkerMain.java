
/*
 * This program simulates the Dispatcher Worker Model for Thread Organisation
 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.text.BadLocationException;



public class DispatcherWorkerMain extends javax.swing.JFrame {

   
	
	/**
     * Creates new form DispatcherWorkerMain
     */
    public DispatcherWorkerMain() {
        initComponents();
        //in = getClass().getResourceAsStream("InputFile.txt");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
  
    
    private void initComponents() {

        lblWorker1 = new javax.swing.JLabel();
        lblWorker3 = new javax.swing.JLabel();
        lblWorker4 = new javax.swing.JLabel();
        lblWorker5 = new javax.swing.JLabel();
        lblWorker2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDispatcher = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DISPATCHER-WORKER MODEL");
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(600, 500));

        lblWorker1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWorker1.setText("Sleeping");
        lblWorker1.setAutoscrolls(true);
        lblWorker1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblWorker1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        lblWorker3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWorker3.setLabelFor(lblWorker3);
        lblWorker3.setText("Sleeping");
        lblWorker3.setAutoscrolls(true);
        lblWorker3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblWorker3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblWorker3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        lblWorker4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWorker4.setText("Sleeping");
        lblWorker4.setAutoscrolls(true);
        lblWorker4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblWorker4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        lblWorker5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWorker5.setText("Sleeping");
        lblWorker5.setAutoscrolls(true);
        lblWorker5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblWorker5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblWorker5.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        lblWorker2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWorker2.setText("Sleeping");
        lblWorker2.setAutoscrolls(true);
        lblWorker2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblWorker2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel1.setText("WORKER 1");

        jLabel2.setText("DISPATCHER");

        jLabel3.setText("WORKER 2");

        jLabel4.setText("WORKER 3");

        jLabel5.setText("WORKER 4");

        jLabel6.setText("WORKER 5");

        jScrollPane1.setToolTipText("");

        txtDispatcher.setColumns(20);
        txtDispatcher.setLineWrap(true);
        txtDispatcher.setRows(5);
        txtDispatcher.setWrapStyleWord(true);
        txtDispatcher.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setViewportView(txtDispatcher);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblWorker1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblWorker2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblWorker3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblWorker5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblWorker4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel6)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(43, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblWorker1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblWorker4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblWorker5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblWorker2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel4)))
                        .addGap(6, 6, 6)))
                .addComponent(lblWorker3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DispatcherWorkerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DispatcherWorkerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DispatcherWorkerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DispatcherWorkerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        //Read the input file
       //fr = new FileReader("M:\\InputFile.txt");
      fr = new FileReader("InputFile.txt");
      br = new BufferedReader(fr);
      (new Thread((Runnable) new DispatcherThread(br))).start();  //Create the dispatcher thread and pass the input file to the dispatcher.
    }
    
    /**
     * Displays the blocking queue in txtDispatcher
     * @param text
     */
      public  void setDispatcherText(String text){
        //lblDispatcher.setText(text);
          txtDispatcher.append(text);
        
    }
      
      /**
       * Removes the task performed by the worker thread from the blocking queue(dispactcher label) in the frame
       * @throws BadLocationException
       */
      public void removeFromBlockingQueue() throws BadLocationException{
          int end = txtDispatcher.getLineEndOffset(0);
          txtDispatcher.replaceRange("", 0, end);
      }

      /**
       * sets the label of the worker 1 equal to text
       * @param text
       */
    public void setWorker1Text(String text){
        lblWorker1.setText(text);
    }
    
    /**sets the label of the worker 2 equal to text
     * 
     * @param text
     */
    public void setWorker2Text(String text){
        lblWorker2.setText(text);
    }
    
    /**
     * sets the label of the worker 3 equal to text
     * @param text
     */
    public void setWorker3Text(String text){
        lblWorker3.setText(text);
    }
    
    /**
     * sets the label of the worker 4 equal to text
     * @param text
     */
    public void setWorker4Text(String text){
        lblWorker4.setText(text);
    }
    
    /**
     * sets the label of the worker 5 equal to text
     * @param text
     */
    public void setWorker5Text(String text){
        lblWorker5.setText(text);
    }
    
    //Variables
    private static FileReader fr;
    private static  BufferedReader br;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblWorker1;
    private javax.swing.JLabel lblWorker2;
    private javax.swing.JLabel lblWorker3;
    private javax.swing.JLabel lblWorker4;
    private javax.swing.JLabel lblWorker5;
    private javax.swing.JTextArea txtDispatcher;
    private static final long serialVersionUID = 1L;
    
}

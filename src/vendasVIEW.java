
import java.awt.Color;
import javax.swing.table.DefaultTableCellRenderer;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */
public class vendasVIEW extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(vendasVIEW.class.getName());

    public vendasVIEW() {
    initComponents();
    listarProdutosVendidos();
    
    jTable1.getTableHeader().setDefaultRenderer(new javax.swing.table.DefaultTableCellRenderer() {
    @Override
    public java.awt.Component getTableCellRendererComponent(
            javax.swing.JTable table, Object value, boolean isSelected,
            boolean hasFocus, int row, int column) {

        javax.swing.JLabel label = (javax.swing.JLabel) super.getTableCellRendererComponent(
                table, value, isSelected, hasFocus, row, column);

        label.setBackground(new java.awt.Color(10, 61, 98));
        label.setForeground(java.awt.Color.WHITE);
        label.setFont(new java.awt.Font("Segoe UI", 1, 12));
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setOpaque(true);

        return label;
    }
});

    jTable1.getTableHeader().setBackground(new java.awt.Color(10, 61, 98));
    jTable1.getTableHeader().setForeground(java.awt.Color.WHITE);
    jTable1.getTableHeader().setFont(new java.awt.Font("Segoe UI", 1, 12));

    // ajustar tamanho das colunas
    jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);   // ID
    jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);  // Nome
    jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);  // Valor
    jTable1.getColumnModel().getColumn(3).setPreferredWidth(100);  // Status


    DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {
        @Override
        public java.awt.Component getTableCellRendererComponent(
                javax.swing.JTable table, Object value, boolean isSelected,
                boolean hasFocus, int row, int column) {

            java.awt.Component c = super.getTableCellRendererComponent(
                    table, value, isSelected, hasFocus, row, column);

            if (column == 3 && value != null && value.toString().equals("Vendido")) {
                c.setForeground(new Color(0, 153, 76));
            } else {
                c.setForeground(Color.BLACK);
            }

            return c;
        }
    };

    jTable1.getColumnModel().getColumn(3).setCellRenderer(renderer);
}
    @SuppressWarnings("unchecked")
    

    private void listarProdutosVendidos() {
        try {
            
            ProdutosDAO produtosdao = new ProdutosDAO();

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setNumRows(0);

            ArrayList<ProdutosDTO> listagem = produtosdao.listarProdutosVendidos();

            for (int i = 0; i < listagem.size(); i++) {
                model.addRow(new Object[]{
                    listagem.get(i).getId(),
                    listagem.get(i).getNome(),
                    listagem.get(i).getValor(),
                    listagem.get(i).getStatus()
                });
            }

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Erro ao carregar vendas: " + e.getMessage());
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new vendasVIEW().setVisible(true));
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "Nome ", "Valor", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setBackground(new java.awt.Color(10, 61, 98));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(16, 97, 152));
        jLabel1.setText("PRODUTOS VENDIDOS");

        jLabel2.setBackground(new java.awt.Color(16, 33, 32));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(16, 97, 152));
        jLabel2.setText("Lista de produtos que já foram vendidos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
    






import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Adm
 */
public class listagemVIEW extends javax.swing.JFrame {

    /**
     * Creates new form listagemVIEW
     */
    public listagemVIEW() {
    initComponents();
    listarProdutos();
    
 
    // Cabeçalho azul da tabela
    listaProdutos.getTableHeader().setDefaultRenderer(new javax.swing.table.DefaultTableCellRenderer() {
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

    // Ajustar tamanho das colunas
   listaProdutos.getColumnModel().getColumn(0).setPreferredWidth(40);   // ID
listaProdutos.getColumnModel().getColumn(1).setPreferredWidth(240);  // Nome (menor)
listaProdutos.getColumnModel().getColumn(2).setPreferredWidth(90);   // Valor (um pouco maior)
listaProdutos.getColumnModel().getColumn(3).setPreferredWidth(110);  // Status

    // Status "Vendido" em verde
    javax.swing.table.DefaultTableCellRenderer statusRenderer = new javax.swing.table.DefaultTableCellRenderer() {
        @Override
        public java.awt.Component getTableCellRendererComponent(
                javax.swing.JTable table, Object value, boolean isSelected,
                boolean hasFocus, int row, int column) {

            java.awt.Component c = super.getTableCellRendererComponent(
                    table, value, isSelected, hasFocus, row, column);

            if (column == 3 && value != null && value.toString().equals("Vendido")) {
                c.setForeground(new java.awt.Color(0, 153, 76));
            } else {
                c.setForeground(java.awt.Color.BLACK);
            }

            return c;
        }
    };

    listaProdutos.getColumnModel().getColumn(3).setCellRenderer(statusRenderer);

    // Cor dos botões
    btnVender.setBackground(new java.awt.Color(10, 61, 98));
    btnVender.setForeground(java.awt.Color.WHITE);
    btnVender.setOpaque(true);
    btnVender.setBorderPainted(false);

    btnVendas.setBackground(new java.awt.Color(10, 61, 98));
    btnVendas.setForeground(java.awt.Color.WHITE);
    btnVendas.setOpaque(true);
    btnVendas.setBorderPainted(false);

    btnVoltar.setBackground(new java.awt.Color(192, 57, 43)); // vermelho elegante
btnVoltar.setForeground(java.awt.Color.WHITE);
btnVoltar.setOpaque(true);
btnVoltar.setBorderPainted(false);
    
   // alinhar ID ao centro
javax.swing.table.DefaultTableCellRenderer centro = new javax.swing.table.DefaultTableCellRenderer();
centro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
listaProdutos.getColumnModel().getColumn(0).setCellRenderer(centro);

// alinhar Valor ao centro
javax.swing.table.DefaultTableCellRenderer centroValor = new javax.swing.table.DefaultTableCellRenderer();
centroValor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
listaProdutos.getColumnModel().getColumn(2).setCellRenderer(centroValor);

javax.swing.table.DefaultTableCellRenderer esquerda = new javax.swing.table.DefaultTableCellRenderer();
esquerda.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
listaProdutos.getColumnModel().getColumn(1).setCellRenderer(esquerda);
// alinhar Status ao centro e manter Vendido verde
javax.swing.table.DefaultTableCellRenderer statusCentro = new javax.swing.table.DefaultTableCellRenderer() {
    @Override
    public java.awt.Component getTableCellRendererComponent(
            javax.swing.JTable table, Object value, boolean isSelected,
            boolean hasFocus, int row, int column) {

        java.awt.Component c = super.getTableCellRendererComponent(
                table, value, isSelected, hasFocus, row, column);

        setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        if (value != null && value.toString().equals("Vendido")) {
            c.setForeground(new java.awt.Color(0, 153, 76));
        } else {
            c.setForeground(java.awt.Color.BLACK);
        }

        return c;
    }
};

listaProdutos.getColumnModel().getColumn(3).setCellRenderer(statusCentro);
}
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaProdutos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        id_produto_venda = new javax.swing.JTextPane();
        btnVender = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnVendas = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Valor", "Status"
            }
        ));
        jScrollPane1.setViewportView(listaProdutos);

        jLabel1.setBackground(new java.awt.Color(16, 97, 152));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(16, 97, 152));
        jLabel1.setText("Lista de Produtos");

        jLabel2.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        jLabel2.setText("Vender Produto (ID)");

        jScrollPane2.setViewportView(id_produto_venda);

        btnVender.setText("Vender");
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });

        btnVendas.setText("Consultar Vendas");
        btnVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendasActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVender))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnVoltar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel1)))
                .addContainerGap(61, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVender))
                .addGap(29, 29, 29)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVendas)
                    .addComponent(btnVoltar))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
                                               
   try {
        String id = id_produto_venda.getText();

        ProdutosDAO produtosdao = new ProdutosDAO();

        produtosdao.venderProduto(Integer.parseInt(id));

        id_produto_venda.setText("");
        listarProdutos();

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(null, "Digite um ID válido!");
     
    }
    }//GEN-LAST:event_btnVenderActionPerformed

    private void btnVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendasActionPerformed
                                                  
    vendasVIEW vendas = new vendasVIEW(); 
    vendas.setVisible(true);
  ;

    }//GEN-LAST:event_btnVendasActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
   
        
    }//GEN-LAST:event_btnVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(listagemVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listagemVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listagemVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listagemVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listagemVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVendas;
    private javax.swing.JButton btnVender;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextPane id_produto_venda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable listaProdutos;
    // End of variables declaration//GEN-END:variables

    private void listarProdutos(){
        try {
           

    listaProdutos.getColumnModel().getColumn(0).setPreferredWidth(50);
    listaProdutos.getColumnModel().getColumn(1).setPreferredWidth(180);
    listaProdutos.getColumnModel().getColumn(2).setPreferredWidth(100);
    listaProdutos.getColumnModel().getColumn(3).setPreferredWidth(100);

            ProdutosDAO produtosdao = new ProdutosDAO();
            
            DefaultTableModel model = (DefaultTableModel) listaProdutos.getModel();
            model.setNumRows(0);
            
            ArrayList<ProdutosDTO> listagem = produtosdao.listarProdutos();
            
            for(int i = 0; i < listagem.size(); i++){
                model.addRow(new Object[]{
                    listagem.get(i).getId(),
                    listagem.get(i).getNome(),
                    listagem.get(i).getValor(),
                    listagem.get(i).getStatus()
                });
            }
        } catch (Exception e) {
        }
    
    }
}


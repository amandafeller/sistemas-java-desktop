package view;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.Produto;
import model.Venda;
import model.VendaProduto;
import model.Vendedor;

/**
 *
 * @author Gelvazio Camargo
 */
public class CadVenda extends javax.swing.JFrame {

    /**
     * Creates new form Cad_Venda
     */
    Date data = new Date();
    // Cadastros
    Venda venda = new Venda();
    VendaProduto vendaProduto = new VendaProduto();
    Produto produto = new Produto();
    Cliente cliente = new Cliente();
    Vendedor vendedor = new Vendedor();

    // Consultas
    consultaVendas consultaVenda = new consultaVendas(this, true);
    consultaClientes consultaCliente = new consultaClientes(this, true);
    consultaProduto consultaProduto = new consultaProduto(this, true);
    consultaVendedores consultaVendedor = new consultaVendedores(this, true);

    public CadVenda() {
        initComponents();
        this.setLocationRelativeTo(null);
        TextFieldCodigoVenda.requestFocus();

        // Inicia com campos deshabilitados
        habilitaCampos(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator6 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        TextFieldCodigoVenda = new javax.swing.JTextField();
        TextFieldCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TextFieldVendedor = new javax.swing.JTextField();
        ButtonGravar = new javax.swing.JButton();
        ButtonCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        TextFieldDescricaoItem = new javax.swing.JTextField();
        TextFieldValorItem = new javax.swing.JTextField();
        TextFieldCodigoItem = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        TextFieldQuantidadeItem = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        ButtonDeletarItem = new javax.swing.JButton();
        ButtonAdicionarVenda = new javax.swing.JButton();
        ButtonConsultaVenda = new javax.swing.JButton();
        ButtonSair = new javax.swing.JButton();
        ComboBoxCliente = new javax.swing.JComboBox();
        ComboBoxVendedor = new javax.swing.JComboBox();
        TextFieldCondicaoPagamento = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        ComboBoxPagamento = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 610, 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Faturamento");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 650, -1));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 610, 10));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Quantidade", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 610, 150));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Código");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        TextFieldCodigoVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextFieldCodigoVendaKeyPressed(evt);
            }
        });
        getContentPane().add(TextFieldCodigoVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 60, -1));

        TextFieldCliente.setEnabled(false);
        TextFieldCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextFieldClienteKeyPressed(evt);
            }
        });
        getContentPane().add(TextFieldCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 60, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Cliente");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("Produtos");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        TextFieldVendedor.setEnabled(false);
        getContentPane().add(TextFieldVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 60, -1));

        ButtonGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Knob Valid Green.png"))); // NOI18N
        ButtonGravar.setText("Gravar");
        ButtonGravar.setEnabled(false);
        ButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGravarActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonGravar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 130, 40));

        ButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Knob Cancel.png"))); // NOI18N
        ButtonCancelar.setText("Cancelar");
        ButtonCancelar.setEnabled(false);
        ButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 130, 40));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, 20));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, 20));
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 610, 10));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Vendedor");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Valor");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, -1, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Código");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Descrição");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, 20));

        TextFieldDescricaoItem.setEditable(false);
        TextFieldDescricaoItem.setEnabled(false);
        getContentPane().add(TextFieldDescricaoItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 320, -1));

        TextFieldValorItem.setEnabled(false);
        TextFieldValorItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextFieldValorItemKeyPressed(evt);
            }
        });
        getContentPane().add(TextFieldValorItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 90, -1));

        TextFieldCodigoItem.setEnabled(false);
        TextFieldCodigoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldCodigoItemActionPerformed(evt);
            }
        });
        TextFieldCodigoItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextFieldCodigoItemKeyPressed(evt);
            }
        });
        getContentPane().add(TextFieldCodigoItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 100, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Qtd.");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 80, 20));

        TextFieldQuantidadeItem.setEnabled(false);
        TextFieldQuantidadeItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextFieldQuantidadeItemKeyPressed(evt);
            }
        });
        getContentPane().add(TextFieldQuantidadeItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 70, -1));
        getContentPane().add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 610, 10));

        ButtonDeletarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Knob Remove Red.png"))); // NOI18N
        ButtonDeletarItem.setText("Deletar Item");
        ButtonDeletarItem.setEnabled(false);
        ButtonDeletarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDeletarItemActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonDeletarItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, 130, 40));

        ButtonAdicionarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Knob Add.png"))); // NOI18N
        ButtonAdicionarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAdicionarVendaActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonAdicionarVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 40, 40));

        ButtonConsultaVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Knob Search.png"))); // NOI18N
        ButtonConsultaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonConsultaVendaActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonConsultaVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 40, 40));

        ButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Knob Red.png"))); // NOI18N
        ButtonSair.setText("Sair");
        ButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 130, 40));

        ComboBoxCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxClienteActionPerformed(evt);
            }
        });
        getContentPane().add(ComboBoxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 260, -1));

        ComboBoxVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxVendedorActionPerformed(evt);
            }
        });
        getContentPane().add(ComboBoxVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 260, -1));

        TextFieldCondicaoPagamento.setEnabled(false);
        getContentPane().add(TextFieldCondicaoPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 60, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Condição Pagamento");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 160, -1));

        ComboBoxPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxPagamentoActionPerformed(evt);
            }
        });
        getContentPane().add(ComboBoxPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 260, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldCodigoVendaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldCodigoVendaKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ENTER) || (evt.getKeyCode() == KeyEvent.VK_TAB)) {
            if (TextFieldCodigoVenda.getText().equals("")) {
                TextFieldCodigoVenda.setText(String.valueOf(venda.retornaUltimo()));
                habilitaCampos(true);
                TextFieldCliente.requestFocus();
            } else {
                venda.setCodigo(Integer.parseInt(TextFieldCodigoVenda.getText()));
                if (venda.procurarVenda(venda.getCodigo())) {
                    TextFieldCliente.setText(String.valueOf(venda.getCliente()));
                    TextFieldVendedor.setText(String.valueOf(venda.getVendedor()));
                    cliente.setCodigo(venda.getCodigo());
                    cliente.procurarCliente();
                    vendedor.setCodigo(venda.getVendedor());
                    vendedor.procurarVendedor();

                    habilitaCampos(true);

                    ComboBoxCliente.setSelectedItem(cliente.getNome());
                    ComboBoxVendedor.setSelectedItem(vendedor.getNome());

                    ButtonGravar.setEnabled(false);
                    ButtonDeletarItem.setEnabled(false);

                    TextFieldCliente.requestFocus();

                    //Faço a inserção dos itens no grid
                    vendaProduto.setListaProd(vendaProduto.setaProdutosVenda());
                    for (int f = 0; f < vendaProduto.getListaProd().size(); f++) {
                        String[] linhaResul;
                        linhaResul = vendaProduto.getListaProd().get(f).split(";");
                        if (linhaResul[0].equals(String.valueOf(venda.getCodigo()))) {
                            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                            produto.setCodigo(Integer.parseInt(linhaResul[1]));
                            produto.procurarProduto();
                            Object[] linha = {linhaResul[1], produto.getDescricao(), linhaResul[2], linhaResul[3]};
                            model.addRow(linha);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Venda não existe!");
                    habilitaCampos(false);
                    TextFieldCodigoVenda.requestFocus();
                }
            }
        }
    }//GEN-LAST:event_TextFieldCodigoVendaKeyPressed

    private void TextFieldClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldClienteKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            TextFieldVendedor.requestFocus();
            cliente.setCodigo(Integer.parseInt(TextFieldCliente.getText()));
            if (cliente.procurarCliente()) {
                ComboBoxCliente.setSelectedItem(cliente.getNome());
            }
        } else if (evt.getKeyCode() == KeyEvent.VK_F11) {
            consultaCliente.setVisible(true);
            TextFieldCliente.setText(String.valueOf(consultaCliente.codigo));
            ComboBoxCliente.setSelectedItem(consultaCliente.nome);
            TextFieldCliente.requestFocus();
        }
    }//GEN-LAST:event_TextFieldClienteKeyPressed

    private void ButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGravarActionPerformed
        venda.setCliente(Integer.parseInt(TextFieldCliente.getText()));
        venda.setCodigo(Integer.parseInt(TextFieldCodigoVenda.getText()));
        venda.setVendedor(Integer.parseInt(TextFieldVendedor.getText()));
        venda.setData(String.valueOf(data.getTime()));
        venda.setCondicaoPagamento(Integer.parseInt(TextFieldVendedor.getText()));
        if (venda.gravarVenda()) {
            for (int x = 0; x < jTable1.getRowCount(); x++) {
                vendaProduto.setPreco(Double.parseDouble(String.valueOf(jTable1.getModel().getValueAt(x, 3))));
                vendaProduto.setProduto(Integer.parseInt(String.valueOf(jTable1.getModel().getValueAt(x, 0))));
                vendaProduto.setQuantidade(Integer.parseInt(String.valueOf(jTable1.getModel().getValueAt(x, 2))));
                vendaProduto.gravarProdutoDaVenda(Integer.parseInt(TextFieldCodigoVenda.getText()));
            }

            JOptionPane.showMessageDialog(null, "Venda gravada com sucesso!");
            limpaCampos();
            habilitaCampos(false);
            ButtonGravar.requestFocus();
        }
    }//GEN-LAST:event_ButtonGravarActionPerformed

    private void ButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarActionPerformed
        limpaCampos();
        habilitaCampos(false);
        TextFieldCodigoVenda.requestFocus();
    }//GEN-LAST:event_ButtonCancelarActionPerformed

    private void TextFieldCodigoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldCodigoItemActionPerformed
        if (!TextFieldCodigoItem.getText().equals("")) {
            produto.setCodigo(Integer.parseInt(TextFieldCodigoItem.getText()));
            if (produto.procurarProduto()) {
                TextFieldDescricaoItem.setText(produto.getDescricao());
                TextFieldValorItem.setText(String.valueOf(produto.getPreco()));
                TextFieldQuantidadeItem.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Produto não cadastrado");
                TextFieldCodigoItem.requestFocus();
            }
        }
    }//GEN-LAST:event_TextFieldCodigoItemActionPerformed

    @SuppressWarnings("empty-statement")
    private void TextFieldValorItemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldValorItemKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!TextFieldValorItem.getText().equals("")) {
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                Object[] linha = {
                    TextFieldCodigoItem.getText(),
                    TextFieldDescricaoItem.getText(),
                    TextFieldQuantidadeItem.getText(),
                    TextFieldValorItem.getText()
                };
                model.addRow(linha);
                TextFieldDescricaoItem.setText("");
                TextFieldValorItem.setText("");
                TextFieldCodigoItem.setText("");
                TextFieldQuantidadeItem.setText("");
                TextFieldCodigoItem.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Informe um Valor!");
                TextFieldValorItem.requestFocus();
            }
        }
    }//GEN-LAST:event_TextFieldValorItemKeyPressed

    private void TextFieldQuantidadeItemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldQuantidadeItemKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            TextFieldValorItem.requestFocus();
        }
    }//GEN-LAST:event_TextFieldQuantidadeItemKeyPressed

    private void ButtonAdicionarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAdicionarVendaActionPerformed
        TextFieldCodigoVenda.setText(String.valueOf(venda.retornaUltimo()));
        habilitaCampos(true);
        TextFieldCliente.requestFocus();
    }//GEN-LAST:event_ButtonAdicionarVendaActionPerformed

    private void ButtonDeletarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDeletarItemActionPerformed
        ((DefaultTableModel) jTable1.getModel()).removeRow(jTable1.getSelectedRow());
    }//GEN-LAST:event_ButtonDeletarItemActionPerformed

    private void ButtonConsultaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonConsultaVendaActionPerformed
        consultaVenda.setVisible(true);
        TextFieldCodigoVenda.setText(String.valueOf(consultaVenda.codigo));
        TextFieldCodigoVenda.requestFocus();
    }//GEN-LAST:event_ButtonConsultaVendaActionPerformed

    private void ButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSairActionPerformed
        dispose();
    }//GEN-LAST:event_ButtonSairActionPerformed

    private void TextFieldCodigoItemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldCodigoItemKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_F11) {
            consultaProduto.setVisible(true);
            TextFieldCodigoItem.setText(String.valueOf(consultaProduto.codigo));
            TextFieldDescricaoItem.setText(consultaProduto.nome);
            TextFieldCodigoItem.requestFocus();
        }
    }//GEN-LAST:event_TextFieldCodigoItemKeyPressed

    private void ComboBoxClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxClienteActionPerformed
        cliente.setListaCli(cliente.retornaClientes());
        for (int x = 0; x < cliente.getListaCli().size(); x++) {
            String[] linhaResul = cliente.getListaCli().get(x).split(";");
            if (linhaResul[1].equals(ComboBoxCliente.getSelectedItem())) {
                TextFieldCliente.setText(linhaResul[0]);
            }
        }
    }//GEN-LAST:event_ComboBoxClienteActionPerformed

    private void ComboBoxVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxVendedorActionPerformed
        vendedor.setListaVend(vendedor.retornaVendedores());
        for (int x = 0; x < vendedor.getListaVend().size(); x++) {
            String[] linhaResul = vendedor.getListaVend().get(x).split(";");
            if (linhaResul[1].equals(ComboBoxVendedor.getSelectedItem())) {
                TextFieldVendedor.setText(linhaResul[0]);
            }
        }
    }//GEN-LAST:event_ComboBoxVendedorActionPerformed

    private void ComboBoxPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxPagamentoActionPerformed
        ArrayList<String> listaCondicao = venda.getListaCondicaoPagamento();

        for (String dadosString : listaCondicao) {
            String[] linhaResul;
            linhaResul = dadosString.split(";");

            if (linhaResul[1].equals(ComboBoxPagamento.getSelectedItem())) {
                TextFieldCondicaoPagamento.setText(linhaResul[0]);
            }
        }
    }//GEN-LAST:event_ComboBoxPagamentoActionPerformed

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
            java.util.logging.Logger.getLogger(CadVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadVenda().setVisible(true);
            }
        });
    }

    public void habilitaCampos(boolean habilita) {
        TextFieldCodigoVenda.setEnabled(!habilita);

        TextFieldCliente.setEnabled(habilita);
        TextFieldVendedor.setEnabled(habilita);
        TextFieldCondicaoPagamento.setEnabled(habilita);

        TextFieldCodigoItem.setEnabled(habilita);
        TextFieldQuantidadeItem.setEnabled(habilita);
        TextFieldDescricaoItem.setEnabled(habilita);
        TextFieldValorItem.setEnabled(habilita);


        ComboBoxCliente.setEnabled(habilita);
        ComboBoxPagamento.setEnabled(habilita);
        ComboBoxVendedor.setEnabled(habilita);

        ButtonDeletarItem.setEnabled(habilita);
        ButtonGravar.setEnabled(habilita);
        ButtonCancelar.setEnabled(habilita);
        ButtonConsultaVenda.setEnabled(!habilita);
        ButtonAdicionarVenda.setEnabled(!habilita);
        ButtonSair.setEnabled(!habilita);

        ComboBoxCliente.removeAllItems();
        ComboBoxVendedor.removeAllItems();
        ComboBoxPagamento.removeAllItems();

        if (habilita) {
            cliente.setListaCli(cliente.retornaClientes());
            ComboBoxCliente.addItem("Selecione o Cliente");
            for (int f = 0; f < cliente.getListaCli().size(); f++) {
                String[] linhaResul;
                linhaResul = cliente.getListaCli().get(f).split(";");
                ComboBoxCliente.addItem(linhaResul[1]);
            }

            vendedor.setListaVend(vendedor.retornaVendedores());
            ComboBoxVendedor.addItem("Selecione o Vendedor");
            for (int f = 0; f < vendedor.getListaVend().size(); f++) {
                String[] linhaResul;
                linhaResul = vendedor.getListaVend().get(f).split(";");
                ComboBoxVendedor.addItem(linhaResul[1]);
            }

            ComboBoxPagamento.addItem("Selecione a Condição");

            ArrayList<String> listaCondicao = venda.getListaCondicaoPagamento();
            for (String dadosString : listaCondicao) {
                String[] linhaResul;
                linhaResul = dadosString.split(";");

                ComboBoxPagamento.addItem(linhaResul[1]);
            }
        }
    }

    public void limpaCampos() {
        TextFieldDescricaoItem.setText("");
        TextFieldCodigoVenda.setText("");
        TextFieldCliente.setText("");
        TextFieldVendedor.setText("");
        TextFieldValorItem.setText("");
        TextFieldCodigoItem.setText("");
        TextFieldQuantidadeItem.setText("");
        TextFieldCondicaoPagamento.setText("");
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setNumRows(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAdicionarVenda;
    private javax.swing.JButton ButtonCancelar;
    private javax.swing.JButton ButtonConsultaVenda;
    private javax.swing.JButton ButtonDeletarItem;
    private javax.swing.JButton ButtonGravar;
    private javax.swing.JButton ButtonSair;
    private javax.swing.JComboBox ComboBoxCliente;
    private javax.swing.JComboBox ComboBoxPagamento;
    private javax.swing.JComboBox ComboBoxVendedor;
    private javax.swing.JTextField TextFieldCliente;
    private javax.swing.JTextField TextFieldCodigoItem;
    private javax.swing.JTextField TextFieldCodigoVenda;
    private javax.swing.JTextField TextFieldCondicaoPagamento;
    private javax.swing.JTextField TextFieldDescricaoItem;
    private javax.swing.JTextField TextFieldQuantidadeItem;
    private javax.swing.JTextField TextFieldValorItem;
    private javax.swing.JTextField TextFieldVendedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

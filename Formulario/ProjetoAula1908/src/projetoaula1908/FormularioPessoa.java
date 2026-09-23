package projetoaula1908;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormularioPessoa extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormularioPessoa.class.getName());

    public char sexo;
    public boolean tecnologia, esportes, astronomia;
    private Arquivo arquivo;
    private List<Pessoa> listaPessoas;

    public FormularioPessoa() {
        initComponents();
        arquivo = new Arquivo("pessoas");
        listaPessoas = arquivo.leArquivo();
        carregarTabela();
    }

    private void carregarTabela() {
        DefaultTableModel tabela = (DefaultTableModel) tblPessoas.getModel();

        tabela.setRowCount(0);

        for (Pessoa p : listaPessoas) {
            tabela.addRow(p.obterDados());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpSexo = new javax.swing.ButtonGroup();
        rdoMasculino = new javax.swing.JRadioButton();
        rdoFeminino = new javax.swing.JRadioButton();
        txtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        lblPessoas = new javax.swing.JLabel();
        sep1 = new javax.swing.JSeparator();
        chkTecnologia = new javax.swing.JCheckBox();
        chkAstronomia = new javax.swing.JCheckBox();
        chkEsportes = new javax.swing.JCheckBox();
        lblArea = new javax.swing.JLabel();
        cmbIdioma = new javax.swing.JComboBox<>();
        lblIdioma = new javax.swing.JLabel();
        btnSalvarPessoa = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jPanePessoas = new javax.swing.JScrollPane();
        tblPessoas = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnGrpSexo.add(rdoMasculino);
        rdoMasculino.setText("Masculino");

        btnGrpSexo.add(rdoFeminino);
        rdoFeminino.setText("Feminino");

        lblNome.setText("Nome");

        lblSexo.setText("Sexo");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lblPessoas.setText("Pessoas");

        chkTecnologia.setText("Tecnologia");

        chkAstronomia.setText("Astronomia");

        chkEsportes.setText("Esportes");

        lblArea.setText("Área");

        cmbIdioma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Português", "Espanhol", "Inglês", "Italiano", "Francês" }));

        lblIdioma.setText("Idioma");

        btnSalvarPessoa.setText("Salvar");
        btnSalvarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarPessoaActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");

        tblPessoas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Sexo", "Idioma"
            }
        ));
        jPanePessoas.setViewportView(tblPessoas);

        btnEditar.setText("Editar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIdioma, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblArea, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSexo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNome, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rdoMasculino)
                                            .addComponent(chkTecnologia))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rdoFeminino)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(chkAstronomia)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(chkEsportes))))
                                    .addComponent(cmbIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPessoas, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(sep1, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE))
                .addGap(6, 6, 6))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanePessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalvarPessoa)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblSexo)
                    .addComponent(rdoMasculino)
                    .addComponent(rdoFeminino))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chkEsportes)
                    .addComponent(lblArea)
                    .addComponent(chkTecnologia)
                    .addComponent(chkAstronomia))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cmbIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdioma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPessoas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanePessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarPessoa)
                    .addComponent(btnExcluir)
                    .addComponent(btnEditar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (chkTecnologia.isSelected()) {
            tecnologia = true;
        } else if (chkEsportes.isSelected()) {
            esportes = true;
        } else if (chkAstronomia.isSelected()) {
            astronomia = true;
        }

        if (rdoMasculino.isSelected()) {
            sexo = 'M';
        } else if (rdoFeminino.isSelected()) {
            sexo = 'F';
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um sexo.", "ERRO", JOptionPane.OK_OPTION);
            return;
        }

        String idioma = cmbIdioma.getSelectedItem() + "";

        Pessoa p = new Pessoa(txtNome.getText(), sexo, (String) cmbIdioma.getSelectedItem());

        listaPessoas.add(p);

        arquivo.gravaArquivo();

        DefaultTableModel tabela = (DefaultTableModel) tblPessoas.getModel();
        tabela.addRow(p.obterDados());

        txtNome.setText("");
        btnGrpSexo.clearSelection();
        chkTecnologia.setSelected(false);
        chkAstronomia.setSelected(false);
        chkEsportes.setSelected(false);
        cmbIdioma.setSelectedIndex(0);

        tabela.setRowCount(0);

        for (Pessoa pessoa : listaPessoas) {
            tabela.addRow(pessoa.obterDados());
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSalvarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarPessoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarPessoaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new FormularioPessoa().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.ButtonGroup btnGrpSexo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvarPessoa;
    private javax.swing.JCheckBox chkAstronomia;
    private javax.swing.JCheckBox chkEsportes;
    private javax.swing.JCheckBox chkTecnologia;
    private javax.swing.JComboBox<String> cmbIdioma;
    private javax.swing.JScrollPane jPanePessoas;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblIdioma;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPessoas;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JRadioButton rdoFeminino;
    private javax.swing.JRadioButton rdoMasculino;
    private javax.swing.JSeparator sep1;
    private javax.swing.JTable tblPessoas;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}

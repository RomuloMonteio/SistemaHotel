/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tela;

/**
 *
 * @author romy
 */
public class TelaPrincipal extends javax.swing.JFrame {

    //Construtor
    public TelaPrincipal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH); //Abrir em tela cheia
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        MenuLatera = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        painelFundo = new javax.swing.JDesktopPane();
        lblFundo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        menuCadHospede = new javax.swing.JMenuItem();
        menuConHospedes = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        menuCadQuarto = new javax.swing.JMenuItem();
        menuConQuarto = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        jMenu15 = new javax.swing.JMenu();
        jMenu16 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu17 = new javax.swing.JMenu();
        jMenu18 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu19 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu32 = new javax.swing.JMenu();
        jMenu20 = new javax.swing.JMenu();
        jMenu33 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu21 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu22 = new javax.swing.JMenu();
        jMenu23 = new javax.swing.JMenu();
        jMenu24 = new javax.swing.JMenu();
        jMenu25 = new javax.swing.JMenu();
        jMenu26 = new javax.swing.JMenu();
        jMenu27 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu28 = new javax.swing.JMenu();
        jMenu29 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu30 = new javax.swing.JMenu();
        jMenu31 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema Hotel Projeto RM -Sistema desenvolvido por Romulo Monteiro - Todos os direitos reservados 2025");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1559, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_m.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel3.setText("Hotel Imperial");

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel4.setText("Horario do Sistema:");

        jLabel5.setText("Usuario:");

        jLabel6.setText("Cargo:");

        jLabel7.setText("G.Acesso:");

        jLabel8.setText("Nome");

        jLabel9.setText("Cargo");

        jLabel10.setText("Grau");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/technicalsupport_support_representative_person_people_man_1641.png"))); // NOI18N
        jLabel11.setText("Logado");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_entrar.png"))); // NOI18N
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuLateraLayout = new javax.swing.GroupLayout(MenuLatera);
        MenuLatera.setLayout(MenuLateraLayout);
        MenuLateraLayout.setHorizontalGroup(
            MenuLateraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLateraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MenuLateraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(MenuLateraLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel2)))
                .addGap(95, 95, 95))
            .addGroup(MenuLateraLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(MenuLateraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MenuLateraLayout.createSequentialGroup()
                        .addGroup(MenuLateraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuLateraLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel4))
                            .addGroup(MenuLateraLayout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jLabel11))
                            .addGroup(MenuLateraLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10))
                            .addGroup(MenuLateraLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(MenuLateraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(21, 21, 21)
                                .addGroup(MenuLateraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)))
                            .addGroup(MenuLateraLayout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)))
                .addContainerGap())
        );
        MenuLateraLayout.setVerticalGroup(
            MenuLateraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLateraLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(MenuLateraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuLateraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuLateraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(223, Short.MAX_VALUE))
        );

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundoPadrao.jpg"))); // NOI18N

        painelFundo.setLayer(lblFundo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout painelFundoLayout = new javax.swing.GroupLayout(painelFundo);
        painelFundo.setLayout(painelFundoLayout);
        painelFundoLayout.setHorizontalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        painelFundoLayout.setVerticalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addComponent(lblFundo)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastro.png"))); // NOI18N
        jMenu1.setText("Cadastros   |");

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bootloader_users_person_people_6080.png"))); // NOI18N
        jMenu9.setText("Hospedes ");

        menuCadHospede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/business_application_addmale_useradd_insert_add_user_client_2312.png"))); // NOI18N
        menuCadHospede.setText("Cadastrar ");
        menuCadHospede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadHospedeActionPerformed(evt);
            }
        });
        jMenu9.add(menuCadHospede);

        menuConHospedes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/business_man_usersearch_thesearch_theclient_2356.png"))); // NOI18N
        menuConHospedes.setText("Consultar");
        jMenu9.add(menuConHospedes);

        jMenu1.add(jMenu9);

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/house_bed_icon-icons.com_74373.png"))); // NOI18N
        jMenu10.setText("Qaurtos");

        menuCadQuarto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sign-check-icon_34365.png"))); // NOI18N
        menuCadQuarto.setText("Cadastrar");
        menuCadQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadQuartoActionPerformed(evt);
            }
        });
        jMenu10.add(menuCadQuarto);

        menuConQuarto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/search_locate_find_6278.png"))); // NOI18N
        menuConQuarto.setText("Consultar");
        menuConQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConQuartoActionPerformed(evt);
            }
        });
        jMenu10.add(menuConQuarto);

        jMenu1.add(jMenu10);

        jMenu11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/waitress_person_people_man_1639.png"))); // NOI18N
        jMenu11.setText("Funcionarios");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/business_application_addmale_useradd_insert_add_user_client_2312.png"))); // NOI18N
        jMenuItem1.setText("Cadastrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem1);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/business_man_usersearch_thesearch_theclient_2356.png"))); // NOI18N
        jMenuItem4.setText("Consultar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem4);

        jMenu1.add(jMenu11);

        jMenu12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/customer_person_people_man_user_client_1629.png"))); // NOI18N
        jMenu12.setText("Fornecedores");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/business_application_addmale_useradd_insert_add_user_client_2312.png"))); // NOI18N
        jMenuItem2.setText("Cadastrar");
        jMenu12.add(jMenuItem2);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/business_man_usersearch_thesearch_theclient_2356.png"))); // NOI18N
        jMenuItem5.setText("Consultar");
        jMenu12.add(jMenuItem5);

        jMenu1.add(jMenu12);

        jMenu13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/business_inventory_maintenance_product_box_boxes_2326 (1).png"))); // NOI18N
        jMenu13.setText("Produtos");
        jMenu1.add(jMenu13);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/reservas.png"))); // NOI18N
        jMenu2.setText("Reservas   |");

        jMenu14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/3592863-accounting-calculate-calculation-calculator-general-math-office_107744.png"))); // NOI18N
        jMenu14.setText("Fazer Reserva");
        jMenu2.add(jMenu14);

        jMenu15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/3592851-calendar-general-month-month-calendar-office-schedule-wall-calendar_107740.png"))); // NOI18N
        jMenu15.setText("Consultar Reserva");
        jMenu2.add(jMenu15);

        jMenu16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/3592829-calendar-general-month-month-calendar-office-schedule-wall-calendar_107756.png"))); // NOI18N
        jMenu16.setText("Finalizar Reserva");
        jMenu2.add(jMenu16);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/business_inventory_maintenance_product_box_boxes_2326 (1).png"))); // NOI18N
        jMenu3.setText("Vendas");

        jMenu17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/businesspackage_additionalpackage_box_add_insert_negoci_2335.png"))); // NOI18N
        jMenu17.setText("Produto");
        jMenu3.add(jMenu17);

        jMenu18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/servicos.png"))); // NOI18N
        jMenu18.setText("Serviços");
        jMenu3.add(jMenu18);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1486564172-finance-loan-money_81492 (1).png"))); // NOI18N
        jMenu4.setText("Financeiro   |");

        jMenu19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pay_cash_payment_money_dollar_bill_icon_143267.png"))); // NOI18N
        jMenu19.setText("Contas a Pagar");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/payment_pay_check_icon_143278.png"))); // NOI18N
        jMenuItem3.setText("Cadastrar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu19.add(jMenuItem3);

        jMenu32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bill_payment_note_icon_143263.png"))); // NOI18N
        jMenu32.setText("Consultar");
        jMenu19.add(jMenu32);

        jMenu4.add(jMenu19);

        jMenu20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pay_cash_payment_money_dollar_bill_icon_143267.png"))); // NOI18N
        jMenu20.setText("Contas a receber");

        jMenu33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/payment_pay_check_icon_143278.png"))); // NOI18N
        jMenu33.setText("Cadastrar");
        jMenu20.add(jMenu33);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bill_payment_note_icon_143263.png"))); // NOI18N
        jMenuItem6.setText("Consultar");
        jMenu20.add(jMenuItem6);

        jMenu4.add(jMenu20);

        jMenu21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/business_salesreport_salesreport_negocio_2353.png"))); // NOI18N
        jMenu21.setText("Balanço");
        jMenu4.add(jMenu21);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorios.png"))); // NOI18N
        jMenu5.setText("Relatorio   |");

        jMenu22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/business_salesreport_salesreport_negocio_2353.png"))); // NOI18N
        jMenu22.setText("Financeiro");
        jMenu5.add(jMenu22);

        jMenu23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/business_table_order_report_history_2332.png"))); // NOI18N
        jMenu23.setText("Reservas");
        jMenu5.add(jMenu23);

        jMenu24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/business_salesreport_salesreport_negocio_2353.png"))); // NOI18N
        jMenu24.setText("Estoque");
        jMenu5.add(jMenu24);

        jMenu25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/business_salesreport_salesreport_negocio_2353.png"))); // NOI18N
        jMenu25.setText("Hospedes");
        jMenu5.add(jMenu25);

        jMenu26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/business_salesreport_salesreport_negocio_2353.png"))); // NOI18N
        jMenu26.setText("Funcionarios");
        jMenu5.add(jMenu26);

        jMenu27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/business_salesreport_salesreport_negocio_2353.png"))); // NOI18N
        jMenu27.setText("Fornecedores");
        jMenu5.add(jMenu27);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seguranca.png"))); // NOI18N
        jMenu6.setText("Segunraça   |");

        jMenu28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Save_37110.png"))); // NOI18N
        jMenu28.setText("Fazer Backup");
        jMenu6.add(jMenu28);

        jMenu29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Save-as_37111.png"))); // NOI18N
        jMenu29.setText("Restaurar Backup");
        jMenu6.add(jMenu29);

        jMenuBar1.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ferramentas.png"))); // NOI18N
        jMenu7.setText("Ferramentas   |");

        jMenu30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/photo-photography-image-picture-folder_108645.png"))); // NOI18N
        jMenu30.setText("Mudar Fundo");
        jMenu7.add(jMenu30);

        jMenu31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ios-8-Help-icon_43821.png"))); // NOI18N
        jMenu31.setText("Sobre");
        jMenu7.add(jMenu31);

        jMenuBar1.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Login_37128.png"))); // NOI18N
        jMenu8.setText("Sair");
        jMenu8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu8MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelFundo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MenuLatera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MenuLatera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelFundo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuCadHospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadHospedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuCadHospedeActionPerformed

    private void menuCadQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadQuartoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuCadQuartoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuConQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConQuartoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuConQuartoActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MouseClicked
        
    }//GEN-LAST:event_jMenu8MouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenuLatera;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu18;
    private javax.swing.JMenu jMenu19;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu20;
    private javax.swing.JMenu jMenu21;
    private javax.swing.JMenu jMenu22;
    private javax.swing.JMenu jMenu23;
    private javax.swing.JMenu jMenu24;
    private javax.swing.JMenu jMenu25;
    private javax.swing.JMenu jMenu26;
    private javax.swing.JMenu jMenu27;
    private javax.swing.JMenu jMenu28;
    private javax.swing.JMenu jMenu29;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu30;
    private javax.swing.JMenu jMenu31;
    private javax.swing.JMenu jMenu32;
    private javax.swing.JMenu jMenu33;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JMenuItem menuCadHospede;
    private javax.swing.JMenuItem menuCadQuarto;
    private javax.swing.JMenuItem menuConHospedes;
    private javax.swing.JMenuItem menuConQuarto;
    private javax.swing.JDesktopPane painelFundo;
    // End of variables declaration//GEN-END:variables
}

package app;

/**
 *
 * @author 00472409
 */
public class JFrameAddProcesso extends javax.swing.JFrame {

	/**
	 * Gerado automaticamente
	 */
	private static final long serialVersionUID = 7413516304164848096L;

	JFrameNovo main;

	/**
	 * Cria um novo JFrame
	 */
	public JFrameAddProcesso(JFrameNovo main) {
		initComponents();
		setLocationRelativeTo(null);
		this.main = main;
	}

	/**
	 * Código gerado pelo JFrame builder do netbeans
	 */
	// @note components
	private void initComponents() {

		btnAdd = new javax.swing.JButton();
		btnCancelar = new javax.swing.JButton();
		txtNome = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		spinnerPrioridade = new javax.swing.JSpinner();
		spinnerCiclos = new javax.swing.JSpinner();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Adicionar Processo");
		setResizable(false);
		setType(java.awt.Window.Type.POPUP);

		btnAdd.setText("Adicionar");
		btnAdd.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnAddActionPerformed(evt);
			}
		});

		btnCancelar.setText("Cancelar");
		btnCancelar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnCancelarActionPerformed(evt);
			}
		});

		txtNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

		jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
		jLabel1.setText("Adicionar Processo");

		jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		jLabel2.setText("Nome");

		jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		jLabel3.setText("Prioridade");

		jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		jLabel4.setText("Quantidade de Ciclos");

		spinnerPrioridade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		spinnerPrioridade.setModel(new javax.swing.SpinnerNumberModel(1, 1, 20, 1));

		spinnerCiclos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		spinnerCiclos.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(93, 93, 93).addComponent(btnAdd).addGap(52, 52, 52)
						.addComponent(btnCancelar)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										layout.createSequentialGroup().addComponent(jLabel1).addGap(45, 45, 45))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										layout.createSequentialGroup().addComponent(jLabel4)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(spinnerCiclos, javax.swing.GroupLayout.PREFERRED_SIZE, 87,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(152, 152, 152))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
										.addComponent(jLabel3)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(spinnerPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, 52,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(187, 187, 187))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										layout.createSequentialGroup().addComponent(jLabel2)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 117,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(122, 122, 122)))));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addComponent(
						jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(42, 42, 42)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel2))
				.addGap(18, 18, 18)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel3)
						.addComponent(spinnerPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(18, 18, 18)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel4)
						.addComponent(spinnerCiclos, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(btnAdd)
						.addComponent(btnCancelar))
				.addContainerGap()));

		pack();
	}// </editor-fold>

	/**
	 * Executa a função do botao Add, que adiciona um processo no escalonador
	 * 
	 * @param evt evento
	 */
	private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {

		Processo processo = new Processo(txtNome.getText().toString(), (int) spinnerPrioridade.getValue(),
				(int) spinnerCiclos.getValue());
		main.escalonador.addProcesso(processo);
		main.atualizar();
	}

	/**
	 * Executa a função do botao Cancelar, que fecha a janela atual
	 * 
	 * @param evt evento
	 */
	private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
	}

	/**
	 * Variáveis geradas pelo JFrame builder do netbeans
	 */
	// region variables
	private javax.swing.JButton btnAdd;
	private javax.swing.JButton btnCancelar;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JSpinner spinnerPrioridade;
	private javax.swing.JSpinner spinnerCiclos;
	private javax.swing.JTextField txtNome;
	// endregion
}

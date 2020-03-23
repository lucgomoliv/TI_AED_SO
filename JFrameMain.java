package app;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class JFrameMain extends javax.swing.JFrame {

	/**
	 * Gerado automaticamente
	 */
	private static final long serialVersionUID = 7019054578493283010L;

	public Escalonador escalonador;

	/**
	 * Cria um novo JFrame
	 * 
	 * @throws FileNotFoundException
	 */
	public JFrameMain() throws FileNotFoundException {
		initComponents();
		setLocationRelativeTo(null);
		escalonador = new Escalonador(1, 20, 20);
		lerArquivo();
		atualizar();
	}

	/**
	 * Código gerado pelo JFrame builder do netbeans
	 */
	// @note components
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		jLabel15 = new javax.swing.JLabel();
		jLabel16 = new javax.swing.JLabel();
		jLabel17 = new javax.swing.JLabel();
		jLabel18 = new javax.swing.JLabel();
		jLabel19 = new javax.swing.JLabel();
		jLabel20 = new javax.swing.JLabel();
		jLabel21 = new javax.swing.JLabel();
		jLabel22 = new javax.swing.JLabel();
		btnExecutar = new javax.swing.JButton();
		btnAddProcesso = new javax.swing.JButton();
                btnAddLog = new javax.swing.JButton();
		label1 = new javax.swing.JLabel();
		label2 = new javax.swing.JLabel();
		label3 = new javax.swing.JLabel();
		label4 = new javax.swing.JLabel();
		label5 = new javax.swing.JLabel();
		label6 = new javax.swing.JLabel();
		label7 = new javax.swing.JLabel();
		label8 = new javax.swing.JLabel();
		label9 = new javax.swing.JLabel();
		label10 = new javax.swing.JLabel();
		label11 = new javax.swing.JLabel();
		label12 = new javax.swing.JLabel();
		label13 = new javax.swing.JLabel();
		label14 = new javax.swing.JLabel();
		label15 = new javax.swing.JLabel();
		label16 = new javax.swing.JLabel();
		label17 = new javax.swing.JLabel();
		label18 = new javax.swing.JLabel();
		label19 = new javax.swing.JLabel();
		label20 = new javax.swing.JLabel();
		
		jLabel23 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setLocation(new java.awt.Point(0, 0));
		setResizable(false);

		jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		jLabel1.setText("Prioridade");

		jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		jLabel2.setText("PID Fila de Processos");

		jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel3.setText("1");

		jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel4.setText("2");

		jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel5.setText("3");

		jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel6.setText("4");

		jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel7.setText("5");

		jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel8.setText("6");

		jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel9.setText("7");

		jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel10.setText("8");

		jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel11.setText("9");

		jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel12.setText("10");

		jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel13.setText("11");

		jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel14.setText("12");

		jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel15.setText("13");

		jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel16.setText("14");

		jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel17.setText("15");

		jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel18.setText("16");

		jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel19.setText("17");

		jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel20.setText("18");

		jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel21.setText("19");

		jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel22.setText("20");

		btnExecutar.setText("Executar");
		btnExecutar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnExecutarActionPerformed(evt);
			}
		});   
		btnAddProcesso.setText("Adicionar Processo");
		btnAddProcesso.addActionListener(this::btnAddProcessoActionPerformed);
                btnAddLog.setText("Log");
		btnAddLog.addActionListener(new ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {                   
                            btnAddLogActionPerformed(evt);                       
                    }
                });

		label1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		label1.setText("");

		label2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		label2.setText("");

		label3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		label3.setText("");

		label4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		label4.setText("");

		label5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		label5.setText("");

		label6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		label6.setText("");

		label7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		label7.setText("");

		label8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		label8.setText("");

		label9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		label9.setText("");

		label10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		label10.setText("");

		label11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		label11.setText("");

		label12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		label12.setText("");

		label13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		label13.setText("");

		label14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		label14.setText("");

		label15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		label15.setText("");

		label16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		label16.setText("");

		label17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		label17.setText("");

		label18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		label18.setText("");

		label19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		label19.setText("");

		label20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		label20.setText("");

		

		

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(45, 45, 45)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addGroup(layout.createSequentialGroup()
												.addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 21,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(label13, javax.swing.GroupLayout.PREFERRED_SIZE, 837,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup()
												.addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 21,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(label14, javax.swing.GroupLayout.PREFERRED_SIZE, 837,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup()
												.addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 837,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup()
												.addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 837,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup()
												.addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 21,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, 837,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup()
												.addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 21,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, 837,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup()
												.addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 21,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, 837,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup()
												.addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 21,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, 837,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup()
												.addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 21,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(label15, javax.swing.GroupLayout.PREFERRED_SIZE, 837,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup()
												.addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 21,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(label16, javax.swing.GroupLayout.PREFERRED_SIZE, 837,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup()
												.addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 21,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(label17, javax.swing.GroupLayout.PREFERRED_SIZE, 837,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup()
												.addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 21,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(label18, javax.swing.GroupLayout.PREFERRED_SIZE, 837,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup()
												.addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 21,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(label19, javax.swing.GroupLayout.PREFERRED_SIZE, 837,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup()
												.addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 21,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(label20, javax.swing.GroupLayout.PREFERRED_SIZE, 837,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup()
												.addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 837,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup()
												.addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, 837,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup()
												.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 837,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup()
												.addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 837,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup()
												.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 837,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup()
												.addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 837,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup().addComponent(btnExecutar)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(btnAddProcesso)
                                                                                                .addComponent(btnAddLog)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jLabel23)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												)))
						.addGroup(layout.createSequentialGroup().addGap(21, 21, 21).addComponent(jLabel1)
								.addGap(235, 235, 235).addComponent(jLabel2)))
				.addContainerGap(33, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addContainerGap(14, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										layout.createSequentialGroup().addComponent(jLabel1).addGap(18, 18, 18))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										layout.createSequentialGroup().addComponent(jLabel2)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(label1))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel4).addComponent(label2))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel5).addComponent(label3))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel6).addComponent(label4))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel7).addComponent(label5))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel8).addComponent(label6))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel9).addComponent(label7))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel10).addComponent(label8))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel11).addComponent(label9))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel12).addComponent(label10))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel13).addComponent(label11))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel14).addComponent(label12))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 15,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(label13))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel16).addComponent(label14))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel17).addComponent(label15))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel18).addComponent(label16))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel19).addComponent(label17))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel20).addComponent(label18))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel21).addComponent(label19))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel22).addComponent(label20))
						.addGap(36, 36, 36)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(btnExecutar).addComponent(btnAddProcesso).addComponent(jLabel23)
                                                                .addComponent(btnAddLog).addComponent(btnAddLog).addComponent(jLabel23))
								)
						.addContainerGap()));

		pack();
	}// </editor-fold>

	/**
	 * Executa a função do botão Executar, iniciando a execução do escalonador
	 * 
	 * @param evt evento
	 */
	private void btnExecutarActionPerformed(java.awt.event.ActionEvent evt) { // @note executar
		
		new Thread(() -> {
			try {
				escalonador.executar(this);                            
			} catch (InterruptedException e) {
				System.out.println("Thread interrompida");
			}
		}).start();
               
	}

	/**
	 * Executa a função do botão Executar, iniciando a execução do escalonador
	 * 
	 * @param evt evento
	 */
	private void btnAddProcessoActionPerformed(java.awt.event.ActionEvent evt) { // @note addProcesso
		JFrameAddProcesso addProcesso = new JFrameAddProcesso(this);
		addProcesso.setVisible(true);
	}
        
        private void btnAddLogActionPerformed(java.awt.event.ActionEvent evt){ // @note addLog
		escalonador.AbrirLog();
        }

	/**
	 * Lê o arquivo passado, apenas usado se for ler os dados de um arquivo
	 * 
	 * @throws FileNotFoundException
	 */
	public void lerArquivo() throws FileNotFoundException { // @note lerArquivo
		File file = new File("processosnovo.txt");
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			String[] dados = sc.nextLine().split(";");
			escalonador.addProcesso(new Processo(Integer.parseInt(dados[0]), dados[1], Integer.parseInt(dados[2]),
					Integer.parseInt(dados[3])));
		}
		sc.close();
	}

	/**
	 * Atualiza a exibição dos dados na tela
	 */
	public void atualizar() { // @note atualizar
		label1.setText(escalonador.filaPorPrioridade(1).toString());
		label2.setText(escalonador.filaPorPrioridade(2).toString());
		label3.setText(escalonador.filaPorPrioridade(3).toString());
		label4.setText(escalonador.filaPorPrioridade(4).toString());
		label5.setText(escalonador.filaPorPrioridade(5).toString());
		label6.setText(escalonador.filaPorPrioridade(6).toString());
		label7.setText(escalonador.filaPorPrioridade(7).toString());
		label8.setText(escalonador.filaPorPrioridade(8).toString());
		label9.setText(escalonador.filaPorPrioridade(9).toString());
		label10.setText(escalonador.filaPorPrioridade(10).toString());
		label11.setText(escalonador.filaPorPrioridade(11).toString());
		label12.setText(escalonador.filaPorPrioridade(12).toString());
		label13.setText(escalonador.filaPorPrioridade(13).toString());
		label14.setText(escalonador.filaPorPrioridade(14).toString());
		label15.setText(escalonador.filaPorPrioridade(15).toString());
		label16.setText(escalonador.filaPorPrioridade(16).toString());
		label17.setText(escalonador.filaPorPrioridade(17).toString());
		label18.setText(escalonador.filaPorPrioridade(18).toString());
		label19.setText(escalonador.filaPorPrioridade(19).toString());
		label20.setText(escalonador.filaPorPrioridade(20).toString());
	}

	/**
	 * Variáveis geradas pelo JFrame builder do netbeans
	 */
	// region variables
        private javax.swing.JButton btnAddLog;
	private javax.swing.JButton btnAddProcesso;
	private javax.swing.JButton btnExecutar;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel20;
	private javax.swing.JLabel jLabel21;
	private javax.swing.JLabel jLabel22;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JLabel label1;
	private javax.swing.JLabel label10;
	private javax.swing.JLabel label11;
	private javax.swing.JLabel label12;
	private javax.swing.JLabel label13;
	private javax.swing.JLabel label14;
	private javax.swing.JLabel label15;
	private javax.swing.JLabel label16;
	private javax.swing.JLabel label17;
	private javax.swing.JLabel label18;
	private javax.swing.JLabel label19;
	private javax.swing.JLabel label2;
	private javax.swing.JLabel label20;
	private javax.swing.JLabel label3;
	private javax.swing.JLabel label4;
	private javax.swing.JLabel label5;
	private javax.swing.JLabel label6;
	private javax.swing.JLabel label7;
	private javax.swing.JLabel label8;
	private javax.swing.JLabel label9;
	
	private javax.swing.JLabel jLabel23;
	
	// endregion

  
}

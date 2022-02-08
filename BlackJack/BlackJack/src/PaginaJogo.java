public class PaginaJogo extends javax.swing.JFrame {
    
    // Baralho do jogo
    Baralho baralhoJogo = new Baralho();
    // Conjunto das cartas do jogador
    Mao maoJogador = new Mao();
    // Conjunto das cartas da mesa
    Mao maoMesa = new Mao();
    // Aposta do jogador
    Integer aposta ;
    // Dinheiro total do jogador
    public static int banco = 10000;
    
    public PaginaJogo() {
        initComponents();
        
        // Embaralha as cartas para o inicio do jogo
        baralhoJogo.embaralhar();
        baralhoJogo.embaralhar();
        
        // Retira uma carta do baralho e adiciona a mao do jogador
        maoJogador.adicionaCarta(baralhoJogo.distribuiCarta());
        // Adiciona a imagem da carta
        playerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/"+maoJogador.ultimaCarta().getNaipeString()+"/"+maoJogador.ultimaCarta().getValorString()+".png")));
        
        // Adiciona uma carta a mao da mesa
        maoMesa.adicionaCarta(baralhoJogo.distribuiCarta());
        // Adiciona a imagem da carta
        dealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/"+maoMesa.ultimaCarta().getNaipeString()+"/"+maoMesa.ultimaCarta().getValorString()+".png")));
       
        // Adiciona outra carta a mao do jogador
        maoJogador.adicionaCarta(baralhoJogo.distribuiCarta());
        // Adiciona a imagem da carta
        playerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/"+maoJogador.ultimaCarta().getNaipeString()+"/"+maoJogador.ultimaCarta().getValorString()+".png")));
    }
    
    public void setAposta (String s)
    {
        // Converte a String de entrada para inteiro
        this.aposta = Integer.parseInt(s);
        // Retira do banco do jogador o valor da aposta
        banco -= aposta;
        // Texto mostrando o banco do jogador na tela
        creditos.setText(Integer.toString(banco));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        saida = new javax.swing.JButton();
        playerCard4 = new javax.swing.JLabel();
        playerCard3 = new javax.swing.JLabel();
        playerCard2 = new javax.swing.JLabel();
        playerCard1 = new javax.swing.JLabel();
        dealerCard4 = new javax.swing.JLabel();
        dealerCard3 = new javax.swing.JLabel();
        dealerCard2 = new javax.swing.JLabel();
        dealerCard1 = new javax.swing.JLabel();
        distribuirMaisUmaCarta = new javax.swing.JButton();
        permanecer = new javax.swing.JButton();
        creditos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cartasMesa = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        saida.setText("Sair");
        saida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saidaActionPerformed(evt);
            }
        });
        getContentPane().add(saida, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, -1, -1));

        playerCard4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(playerCard4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 80, 100));

        playerCard3.setForeground(new java.awt.Color(255, 255, 255));
        playerCard3.setMaximumSize(new java.awt.Dimension(18, 14));
        playerCard3.setMinimumSize(new java.awt.Dimension(18, 14));
        playerCard3.setPreferredSize(new java.awt.Dimension(18, 14));
        getContentPane().add(playerCard3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 80, 100));

        playerCard2.setForeground(new java.awt.Color(255, 255, 255));
        playerCard2.setToolTipText("");
        getContentPane().add(playerCard2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 80, 100));

        playerCard1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(playerCard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 80, 100));

        dealerCard4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(dealerCard4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 64, 70, 90));

        dealerCard3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(dealerCard3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 64, 70, 90));

        dealerCard2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(dealerCard2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 64, 70, 90));

        dealerCard1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(dealerCard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 64, 70, 90));

        distribuirMaisUmaCarta.setText("Carta");
        distribuirMaisUmaCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distribuirMaisUmaCartaActionPerformed(evt);
            }
        });
        getContentPane().add(distribuirMaisUmaCarta, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 510, 80, -1));

        permanecer.setText("Permanecer");
        permanecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                permanecerActionPerformed(evt);
            }
        });
        getContentPane().add(permanecer, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, 100, -1));

        creditos.setForeground(new java.awt.Color(255, 255, 255));
        creditos.setText("Creditos:");
        getContentPane().add(creditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 110, 20));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cartas do Jogador:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 130, 30));

        cartasMesa.setForeground(new java.awt.Color(255, 255, 255));
        cartasMesa.setText("Cartas da Mesa:");
        getContentPane().add(cartasMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 110, 30));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/GameScreen.jpg"))); // NOI18N
        jLabel1.setText("4");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 790, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void permanecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_permanecerActionPerformed
       // Adiciona uma carta a mao da mesa     
        maoMesa.adicionaCarta(baralhoJogo.distribuiCarta());
        
        // Verifica quantas cartas ha na mao da mesa para exibir na tela
        if(maoMesa.getNumeroCartas()==2)
        dealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/"+maoMesa.ultimaCarta().getNaipeString()+"/"+maoMesa.ultimaCarta().getValorString()+".png")));
        else if(maoMesa.getNumeroCartas()==3)
        dealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/"+maoMesa.ultimaCarta().getNaipeString()+"/"+maoMesa.ultimaCarta().getValorString()+".png")));
        else if(maoMesa.getNumeroCartas()==4)
        dealerCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/"+maoMesa.ultimaCarta().getNaipeString()+"/"+maoMesa.ultimaCarta().getValorString()+".png")));
            
        // Verificacoes de quem ganhou a rodada
        if(maoMesa.getValorMao()>21 && maoJogador.getValorMao()>21)
        {
            // Banco recebe a aposta de volta pois ambos estouraram 21
            banco += aposta;
            // Exibe tela de empate
            TelaTransicao p = new TelaTransicao();
            p.setVisible(true);
            
        }
        else if(maoMesa.getValorMao()>21 && maoJogador.getValorMao()<=21)
        {
            // Jogador ganhou da mesa
            // Banco recebe duas vezes o valor da aposta
            banco += 2*aposta;
            // Mostra tela de vitoria
            TelaVitoria w = new TelaVitoria();
            w.setVisible(true);   
        }
        else if(maoJogador.getValorMao()>21)
        {
            // Jogador estourou 21
            // Banco perde o valor da aposta
            banco -= aposta;
            // Mostra tela de derrota
            TelaPerdeu l = new TelaPerdeu();
            l.setVisible(true);
            
        }
        else if(maoMesa.getValorMao() == maoJogador.getValorMao())
        {
            // Jogador empatou com a mesa
            banco += aposta;
            // Mostra tela de empate
            TelaTransicao p = new TelaTransicao();
            p.setVisible(true);
            
        }
        else if(maoMesa.getValorMao() > maoJogador.getValorMao())
        {
            // Jogador perdeu para a mesa
            // o banco perde o valor da aposta
            banco -= aposta;
            // Mostra tela de derrota
            TelaPerdeu l = new TelaPerdeu();
            l.setVisible(true);      
            
        }
        else if(maoJogador.getValorMao() > maoMesa.getValorMao() )
        {
            // Jogador ganhou da mesa
            // Banco recebe duas vezes o valor da aposta
            banco += 2*aposta;
            // Mostra tela de vitoria
            TelaVitoria w = new TelaVitoria();
            w.setVisible(true);   
        }    
    }//GEN-LAST:event_permanecerActionPerformed

    private void distribuirMaisUmaCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distribuirMaisUmaCartaActionPerformed

        // Distribui uma carta pro jogador
        maoJogador.adicionaCarta(baralhoJogo.distribuiCarta());
        // Verifica se o jogador estourou 21
        if(maoJogador.getValorMao()>21)
        {
            // Mostra tela de derrota
            TelaPerdeu l = new TelaPerdeu();
            l.setVisible(true);
        }
        
        // Mostra o valor da mao do jogador apos retirar uma carta
        System.out.println(maoJogador.getValorMao());
        
        // Se o jogador tiver 3 cartas exibe a terceira carta
        if(maoJogador.getNumeroCartas()==3)
        playerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/"+maoJogador.ultimaCarta().getNaipeString()+"/"+maoJogador.ultimaCarta().getValorString()+".png")));
        else if(maoJogador.getNumeroCartas()==4)
        // Se o jogador tiver 4 cartas exibe a quarta carta
        playerCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/"+maoJogador.ultimaCarta().getNaipeString()+"/"+maoJogador.ultimaCarta().getValorString()+".png")));
    }//GEN-LAST:event_distribuirMaisUmaCartaActionPerformed

    private void saidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saidaActionPerformed
        // Fecha a janela
        dispose();
    }//GEN-LAST:event_saidaActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaJogo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cartasMesa;
    private javax.swing.JLabel creditos;
    private javax.swing.JLabel dealerCard1;
    private javax.swing.JLabel dealerCard2;
    private javax.swing.JLabel dealerCard3;
    private javax.swing.JLabel dealerCard4;
    private javax.swing.JButton distribuirMaisUmaCarta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton permanecer;
    private javax.swing.JLabel playerCard1;
    private javax.swing.JLabel playerCard2;
    private javax.swing.JLabel playerCard3;
    private javax.swing.JLabel playerCard4;
    private javax.swing.JButton saida;
    // End of variables declaration//GEN-END:variables
}

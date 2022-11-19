
package app;

import dialog.AcercaDe;
import modulos.Robot;
import modulos.Objeto;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PrincipalFrame extends javax.swing.JFrame implements ActionListener {

    //Objeto timer para las llamdas a la busqueda de objetos.
    private final Timer timer;
    private final Graphics2D g2d;
    
    //Objetos necesarios para la ejecución de la busqueda de los robots.
    private Robot _robot;
    private Objeto [ ] _objeto;
    private Objeto _bateria      ;
    
    //Variables.
    private final int _width; //Ancho del tablero.
    private final int _height; //Largo del tablero.
    private int _numeroBateria = 1;
    
    //Coordenadas en las que pueden aparecer las pelotas.
    int[] _celdas = { 25, 75, 125, 175, 225, 275, 325, 375, 425, 475 };
    
    public PrincipalFrame() {
        initComponents();
        
        //Inicialización del ancho y largo del tablero.
        _width = pnlTablero.getWidth ( );
        _height = pnlTablero.getHeight ( );
        
        //Creación de los objetos ROBOT y TIMER.
        _robot = new Robot ( );
        timer = new Timer ( 800, this );
        
        //Convierte el panel en un espacio de dibujado.
        g2d = (Graphics2D) pnlTablero.getGraphics();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTablero = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txfNumeroPelotas = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnComenzar = new javax.swing.JButton();
        btnPausar = new javax.swing.JButton();
        btnDetener = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblBateria = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblNumeroBaterias = new javax.swing.JLabel();
        btnLimpiarTablero = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnAcercaDe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Busqueda de pelotas");

        pnlTablero.setPreferredSize(new java.awt.Dimension(500, 500));

        javax.swing.GroupLayout pnlTableroLayout = new javax.swing.GroupLayout(pnlTablero);
        pnlTablero.setLayout(pnlTableroLayout);
        pnlTableroLayout.setHorizontalGroup(
            pnlTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        pnlTableroLayout.setVerticalGroup(
            pnlTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Número de pelotas:");

        txfNumeroPelotas.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txfNumeroPelotas.setText("0");

        btnActualizar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfNumeroPelotas)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txfNumeroPelotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnActualizar)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnComenzar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnComenzar.setText("INICIAR");
        btnComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComenzarActionPerformed(evt);
            }
        });

        btnPausar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnPausar.setText("PAUSAR");
        btnPausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPausarActionPerformed(evt);
            }
        });

        btnDetener.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDetener.setText("DETENER");
        btnDetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetenerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnComenzar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPausar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDetener, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnComenzar)
                .addGap(18, 18, 18)
                .addComponent(btnPausar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(btnDetener)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel2.setText("Estado:");

        lblEstado.setFont(new java.awt.Font("Bahnschrift", 2, 12)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(51, 51, 255));
        lblEstado.setText("ESTADO");

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel3.setText("Nivel de bateria:");

        lblBateria.setFont(new java.awt.Font("Bahnschrift", 2, 12)); // NOI18N
        lblBateria.setForeground(new java.awt.Color(51, 51, 255));
        lblBateria.setText("100%");

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel5.setText("Baterias utilizadas:");

        lblNumeroBaterias.setFont(new java.awt.Font("Bahnschrift", 2, 12)); // NOI18N
        lblNumeroBaterias.setForeground(new java.awt.Color(51, 51, 255));
        lblNumeroBaterias.setText("1");

        btnLimpiarTablero.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnLimpiarTablero.setText("LIMPIAR TABLERO");
        btnLimpiarTablero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarTableroActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 0));
        jLabel4.setText("Cuadrado grande color amarillo:");

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 51));
        jLabel6.setText("Cuadrado pequeño color verde:");

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 204));
        jLabel7.setText("Pelotas color azul:");

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel8.setText("Robot");

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel9.setText("Bateria");

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel10.setText("Objetivos");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        btnAcercaDe.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAcercaDe.setText("Realizado por...");
        btnAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcercaDeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnLimpiarTablero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblBateria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNumeroBaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnAcercaDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblEstado))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblBateria))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblNumeroBaterias))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpiarTablero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAcercaDe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlTablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        //Se actualiza el tablero con las nuevas pelotas inicializadas.
        if ( !timer.isRunning ( ) ) { //Solo se hace en caso de que no este corriendo.
            g2d.clearRect(0, 0, _width, _height); //Método que permite actualizar la pantalla.
        
            inicializarTablero ( ); //Llamada a la inicialización del tablero.
            inicializarPelotas ( ); //Llamada a la inicialización de las peltoas.
            inicializarRobot  ( );  //Llamada a la inicialización del robot.
            inicializaBateria ( );  //Llamada a la inicialización de la bateria.
        
            _numeroBateria = 1;
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComenzarActionPerformed
        if ( _objeto.length > 0 ) { //Se valida que se hayan inicializado más de 0 pelotas.
            //Inicializar el sistema para la busqueda.
            _robot.inicializaSistema ( _objeto, _bateria ); 
        
            //Comienza la ejecución del timer.
            timer.start ( );
        }
        else { //Si no se han inicializado pelotas se crea una excepción.
            JOptionPane.showMessageDialog(this, "Actualice el tablero con un número de pelotas "
                    + "superior a cero. Por favor vuelva a intentarlo.",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnComenzarActionPerformed

    private void btnLimpiarTableroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarTableroActionPerformed
        g2d.clearRect(0, 0, _width, _height); //Actualiza el tablero.
        inicializarTablero ( ); //Se inicializa el tablero para dibujarlo.
    }//GEN-LAST:event_btnLimpiarTableroActionPerformed

    private void btnPausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPausarActionPerformed
        timer.stop(); //Se detiene el timer.
    }//GEN-LAST:event_btnPausarActionPerformed

    private void btnDetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetenerActionPerformed
        //Se detiene el timer y se borran los objetos para no poder inicializar
        //de nuevo hasta volver a ingresar datos.
        timer.stop ( ); 
        _objeto = new Objeto [ 0 ];
        _robot = new Robot ( );
        _numeroBateria = 1;
    }//GEN-LAST:event_btnDetenerActionPerformed

    private void btnAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcercaDeActionPerformed
        AcercaDe acerca = new AcercaDe(this, true);
        acerca.setVisible(true);
    }//GEN-LAST:event_btnAcercaDeActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalFrame().setVisible(true);
            }
        });
    }

    //--------------------------------------------------------------------------
    
    //Método que inicializa las pelotas dentro del tablero.
    public void inicializarPelotas ( ) {
        g2d.setColor ( Color.cyan ); //Se le asigna el color deseado.
        
        //Se obtiene el número de pelotas ingresadas por el usuario.
        int numPelotas = Integer.parseInt ( txfNumeroPelotas.getText ( ) );
        
        if ( numPelotas < 15 ) {
            //Creación de objeto auxiliar para inicialización de pelotas.
            //Tiene como tamaño el número ingresado por el usuario.
            Objeto [ ] objeto = new Objeto [ numPelotas ];
        
            //Permite recorrer el arreglo de pelotas creado.
            for ( int i = 0; i < numPelotas; i++ ) {
                //Se obtienen coordenadas aleatorias dentro del tablero.
                int x = _celdas [ ( int ) ( Math.random ( ) * _celdas.length ) ] - 12;
                int y = _celdas [ ( int ) ( Math.random ( ) * _celdas.length ) ] - 12;
            
                //Validación de coordendas.
                if ( x <= 50 && y <= 50 ) //Si se ubican en el primer cuadrante no se inicializan.
                    i--;
                else { //Se inicializa y dibuja aquellas que no coinciden con las coordenadas inicialiales del robot.
                    objeto [ i ] = new Objeto ( ); //Se crea el espacio de memoria para cada pelota.
                    objeto [ i ].setCoordX ( x ); //Asignación de coordenada en X.
                    objeto [ i ].setCoordY ( y ); //Asignación de coordenada en Y.
                    objeto [ i ].setActivo ( true ); //Se dice que existe.
            
                    //Dibujado y rellenado de la pelota.
                    g2d.drawOval ( x, y, 30, 30 );
                    g2d.fillOval ( x, y, 30, 30 );
                }    
            }
            //Se hace referencia al auxiliar.
            _objeto = objeto;
            
            //En caso contrario se crea una excepción.
        } else
            JOptionPane.showMessageDialog ( this, "Ingrese un número menor a 15.",
                    "Demasiadas pelotas", JOptionPane.ERROR_MESSAGE );
    }
    
    //--------------------------------------------------------------------------
    
    //Método que inicializa el tablero y dibuja las celdas.
    public void inicializarTablero ( ) {
        g2d.setColor ( Color.black );
        
        //Creación de las líneas de la cuadricula verticales.
        for ( int i = 0; i < _width; i++ )
                if ( i % ( _width / 10 ) == 0 )
                    g2d.drawLine ( i, 0, i, _height );
        
        //Creación de las líneas de la cuadrículo horizontales.
        for ( int i = 0; i < _height; i++ )
            if ( i % ( _height / 10 ) == 0 )
                g2d.drawLine ( 0, i, _width, i );
    }
    
    //--------------------------------------------------------------------------
    
    //Se inicializa las coordenadas y el objeto ROBOT,
    public void inicializarRobot ( ) {
        g2d.setColor ( Color.yellow );
        
        //Se crea el objeto nuevo del Robot.
        _robot = new Robot ( );
        
        //Se obtienen las coordenadas del robot, las cuales se inicializan en el constructor.
        int xCoord = _robot.getCoordX ( );
        int yCoord = _robot.getCoordY ( );
        
        //Arreglos que grafican los puntos del robot para graficarlo.
        int [ ] x = { xCoord - 3, xCoord + 27, xCoord + 27, xCoord - 3, xCoord - 3 };
        int [ ] y = { yCoord - 3, yCoord - 3, yCoord + 27, yCoord + 27, yCoord + 27 };
        
        //Dibujado del robot en el tablero.
        g2d.drawPolygon ( x, y, 5 );
        g2d.fillPolygon( x, y, 5 );
    }
    
    //--------------------------------------------------------------------------
    
    //Método que inicializa la bateria.
    public void inicializaBateria ( ) {
        _bateria = new Objeto();
        //Se obtienen coordenadas al azar para la posición de la batería.
        int x = _celdas [ ( int ) ( Math.random ( ) * _celdas.length ) ] - 12;
        int y = _celdas [ ( int ) ( Math.random ( ) * _celdas.length ) ] - 12;
        
        //Se le asignan las coordenadas al objeto Bateria.
        _bateria.setCoordX ( x );
        _bateria.setCoordY ( y );
        _bateria.setActivo ( true );
                
        g2d.setColor ( Color.green );
        
        //Arreglo que muestra las coordenadas en X y Y para el dibujado de la misma.
        int [ ] polX = { x, x + 24, x + 24, x, x };
        int [ ] polY = { y, y, y + 24, y + 24, y };
        
        //dibujado de la batería dentro del tablero.
        g2d.drawPolygon ( polX, polY, 5 );
        g2d.fillPolygon ( polX, polY, 5 );
    }
    
    //--------------------------------------------------------------------------
    
    //Método que permite mover el robot en el tablero.  
    public void moverRobot ( ) {
        g2d.setColor ( Color.yellow );
        
        //Se obtienen las coordendas en las que esta el robot.
        int coordX = _robot.getCoordX ( );
        int coordY = _robot.getCoordY ( );
        
        //Se hacen conversiones de las coordenadas para cada punto.
        //Cada arreglo guarda coordenadas en X y Y respectivamente.
        int [ ] x = { coordX - 3, coordX + 27, coordX + 27, coordX - 3, coordX - 3 };
        int [ ] y = { coordY - 3, coordY - 3, coordY + 27, coordY + 27, coordY + 27 };
        
        //dibujado de la nueva posición del robot.
        g2d.drawPolygon ( x, y, 5 );
        g2d.fillPolygon ( x, y, 5 );
    }
    
    //--------------------------------------------------------------------------
    
    //Método que permite dibujar las pelotas dentro del tablero.
    public void dibujarPelotas ( ) {
        g2d.setColor ( Color.cyan );
        
        //Dibujado de pelotas con las coordenadas del objeto.
        for (Objeto objeto : _objeto) {
            if ( objeto.getActivo ( ) ) {
                g2d.drawOval( objeto.getCoordX ( ), objeto.getCoordY ( ), 30, 30 );
                g2d.fillOval( objeto.getCoordX ( ), objeto.getCoordY ( ), 30, 30 );
            }
        }
    }
    
    //--------------------------------------------------------------------------
    
    //Mñetodo que permite dibujar la batería dentro del tablero.
    public void dibujarBateria ( ) {
        g2d.setColor ( Color.green );
        
        //Se obtienen las coordenadas de la btería.
        int x = _bateria.getCoordX ( );
        int y = _bateria.getCoordY ( );
        
        //Se hacen las conversiones para dibujar dentro del tablero.
        int [ ] xCoord = { x, x + 24, x + 24, x, x };
        int [ ] yCoord = { y, y, y + 24, y + 24, y };
        
        //Dibujado de la bateria dentro del tablero.
        g2d.drawPolygon ( xCoord, yCoord, 5 );
        g2d.fillPolygon ( xCoord, yCoord, 5 );
    }    
    
    
    //--------------------------------------------------------------------------
    
    //Método a llamar por el TIMER.
    //Se ejecuta siempre que se cumple el tiempo enviado como parametro.
    @Override
    public void actionPerformed ( ActionEvent ae ) {
        _robot.control ( ); //Se manda a llamar la inicialización de la busqueda.
        
        //si el estado es el de APAGADO el TIMER se detiene.
        if ( _robot.getEstado() == Robot.APAGAR_SISTEMA )
            timer.stop ( );
               
        //Actualización del tablero en cada llamda.
        g2d.clearRect(0, 0, _width, _height);
        dibujarBateria ( );
        dibujarPelotas ( );
        inicializarTablero ( );
        moverRobot ( );
        
        //Se ve en qué estado está el roboto para mostrarlo en la aplicación.
        if ( _robot.getEstado ( ) == Robot.BUSQUEDA )
            lblEstado.setText ( "Busqueda" );
        else if ( _robot.getEstado ( ) == Robot.NUEVA_BUSQUEDA )
            lblEstado.setText ( "Nueva busqueda" );
        else if ( _robot.getEstado ( ) == Robot.IR_POR_BATERIA )
            lblEstado.setText ( "Ir por bateria" );
        else if ( _robot.getEstado ( ) == Robot.RECARGAR ) {
            lblEstado.setText ( "Recargar" );
            _numeroBateria++; //Se incremente el número de baterias utilizadas.
        } else if ( _robot.getEstado ( ) == Robot.AL_AZAR )
            lblEstado.setText ( "Movimiento al azar" );
        else if ( _robot.getEstado ( ) == Robot.APAGAR_SISTEMA ) {
            lblEstado.setText ( "Apagado" );
            _robot = new Robot ( ); //Se crea un objeto robot para dejarlo vacío.
            _objeto = new Objeto [ 0 ]; //Se inicializa a 0 para desaparecer las peltoas.
            
            //GAME OVER
            JOptionPane.showMessageDialog ( this, "EL ROBOT SE HA QUEDADO SIN "
                    + "BATERÍA. GAME OVER", "Game over",
                    JOptionPane.INFORMATION_MESSAGE );
        }
        
        lblBateria.setText ( String.valueOf ( _robot.getEnergia ( ) ) + "%" );
        lblNumeroBaterias.setText ( String.valueOf ( _numeroBateria ) );
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcercaDe;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnComenzar;
    private javax.swing.JButton btnDetener;
    private javax.swing.JButton btnLimpiarTablero;
    private javax.swing.JButton btnPausar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblBateria;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblNumeroBaterias;
    private javax.swing.JPanel pnlTablero;
    private javax.swing.JTextField txfNumeroPelotas;
    // End of variables declaration//GEN-END:variables
}

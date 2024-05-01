package vista;
import clases.Operaciones;
import javax.script.*;
import javax.swing.JOptionPane;
public class panel extends javax.swing.JFrame {
    private String numero = "";
    private int num1, num2, resultado;
    private String signo;
    Operaciones s = new Operaciones();
    public panel() {
        
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtOperacion = new javax.swing.JLabel();
        txtNum = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnPorcentaje = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnPotencia = new javax.swing.JButton();
        btnNueve = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnMultiplicacion = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        delBtn = new javax.swing.JButton();
        btnUno = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        btnOcho = new javax.swing.JButton();
        btnSiete = new javax.swing.JButton();
        btnCero = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOperacion.setBackground(new java.awt.Color(255, 255, 255));
        txtOperacion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(255, 255, 255));
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 350, 40));

        txtNum.setFont(new java.awt.Font("Arial", 1, 70)); // NOI18N
        txtNum.setForeground(new java.awt.Color(255, 255, 255));
        txtNum.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 360, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 160));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPorcentaje.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        btnPorcentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rolledBtn.png"))); // NOI18N
        btnPorcentaje.setText("%");
        btnPorcentaje.setBorder(null);
        btnPorcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPorcentaje.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fColumnBtn.png"))); // NOI18N
        btnPorcentaje.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pressedBtn.png"))); // NOI18N
        btnPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorcentajeActionPerformed(evt);
            }
        });
        jPanel2.add(btnPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 65, 65));

        btnIgual.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        btnIgual.setForeground(new java.awt.Color(255, 255, 255));
        btnIgual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lNormalBtn.png"))); // NOI18N
        btnIgual.setText("=");
        btnIgual.setBorder(null);
        btnIgual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIgual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lPressedBtn.png"))); // NOI18N
        btnIgual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lRolledBtn.png"))); // NOI18N
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });
        jPanel2.add(btnIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 65, 65));

        btnPotencia.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        btnPotencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rolledBtn.png"))); // NOI18N
        btnPotencia.setText("^2");
        btnPotencia.setBorder(null);
        btnPotencia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPotencia.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fColumnBtn.png"))); // NOI18N
        btnPotencia.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pressedBtn.png"))); // NOI18N
        btnPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotenciaActionPerformed(evt);
            }
        });
        jPanel2.add(btnPotencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 65, 65));

        btnNueve.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        btnNueve.setForeground(new java.awt.Color(255, 255, 255));
        btnNueve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/normalBtn.png"))); // NOI18N
        btnNueve.setText("9");
        btnNueve.setBorder(null);
        btnNueve.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNueve.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pressedBtn.png"))); // NOI18N
        btnNueve.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rolledBtn.png"))); // NOI18N
        btnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueveActionPerformed(evt);
            }
        });
        jPanel2.add(btnNueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 65, 65));

        btnDivision.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        btnDivision.setForeground(new java.awt.Color(255, 255, 255));
        btnDivision.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lNormalBtn.png"))); // NOI18N
        btnDivision.setText("/");
        btnDivision.setBorder(null);
        btnDivision.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDivision.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lPressedBtn.png"))); // NOI18N
        btnDivision.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lRolledBtn.png"))); // NOI18N
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });
        jPanel2.add(btnDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 65, 65));

        btnMultiplicacion.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        btnMultiplicacion.setForeground(new java.awt.Color(255, 255, 255));
        btnMultiplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lNormalBtn.png"))); // NOI18N
        btnMultiplicacion.setText("*");
        btnMultiplicacion.setBorder(null);
        btnMultiplicacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMultiplicacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lPressedBtn.png"))); // NOI18N
        btnMultiplicacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lRolledBtn.png"))); // NOI18N
        btnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacionActionPerformed(evt);
            }
        });
        jPanel2.add(btnMultiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 65, 65));

        btnSuma.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        btnSuma.setForeground(new java.awt.Color(255, 255, 255));
        btnSuma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lNormalBtn.png"))); // NOI18N
        btnSuma.setText("+");
        btnSuma.setBorder(null);
        btnSuma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSuma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lPressedBtn.png"))); // NOI18N
        btnSuma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lRolledBtn.png"))); // NOI18N
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });
        jPanel2.add(btnSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 65, 65));

        btnResta.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        btnResta.setForeground(new java.awt.Color(255, 255, 255));
        btnResta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lNormalBtn.png"))); // NOI18N
        btnResta.setText("-");
        btnResta.setBorder(null);
        btnResta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnResta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lPressedBtn.png"))); // NOI18N
        btnResta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lRolledBtn.png"))); // NOI18N
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });
        jPanel2.add(btnResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 65, 65));

        delBtn.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        delBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rolledBtn.png"))); // NOI18N
        delBtn.setText("C");
        delBtn.setBorder(null);
        delBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        delBtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fColumnBtn.png"))); // NOI18N
        delBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pressedBtn.png"))); // NOI18N
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });
        jPanel2.add(delBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 65, 65));

        btnUno.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        btnUno.setForeground(new java.awt.Color(255, 255, 255));
        btnUno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/normalBtn.png"))); // NOI18N
        btnUno.setText("1");
        btnUno.setBorder(null);
        btnUno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUno.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pressedBtn.png"))); // NOI18N
        btnUno.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rolledBtn.png"))); // NOI18N
        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });
        jPanel2.add(btnUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 65, 65));

        btnDos.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        btnDos.setForeground(new java.awt.Color(255, 255, 255));
        btnDos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/normalBtn.png"))); // NOI18N
        btnDos.setText("2");
        btnDos.setBorder(null);
        btnDos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pressedBtn.png"))); // NOI18N
        btnDos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rolledBtn.png"))); // NOI18N
        btnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosActionPerformed(evt);
            }
        });
        jPanel2.add(btnDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 65, 65));

        btnTres.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        btnTres.setForeground(new java.awt.Color(255, 255, 255));
        btnTres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/normalBtn.png"))); // NOI18N
        btnTres.setText("3");
        btnTres.setBorder(null);
        btnTres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTres.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pressedBtn.png"))); // NOI18N
        btnTres.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rolledBtn.png"))); // NOI18N
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });
        jPanel2.add(btnTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 65, 65));

        btnSeis.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        btnSeis.setForeground(new java.awt.Color(255, 255, 255));
        btnSeis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/normalBtn.png"))); // NOI18N
        btnSeis.setText("6");
        btnSeis.setBorder(null);
        btnSeis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSeis.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pressedBtn.png"))); // NOI18N
        btnSeis.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rolledBtn.png"))); // NOI18N
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });
        jPanel2.add(btnSeis, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 65, 65));

        btnCinco.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        btnCinco.setForeground(new java.awt.Color(255, 255, 255));
        btnCinco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/normalBtn.png"))); // NOI18N
        btnCinco.setText("5");
        btnCinco.setBorder(null);
        btnCinco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCinco.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pressedBtn.png"))); // NOI18N
        btnCinco.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rolledBtn.png"))); // NOI18N
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });
        jPanel2.add(btnCinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 65, 65));

        btnCuatro.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        btnCuatro.setForeground(new java.awt.Color(255, 255, 255));
        btnCuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/normalBtn.png"))); // NOI18N
        btnCuatro.setText("4");
        btnCuatro.setBorder(null);
        btnCuatro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCuatro.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pressedBtn.png"))); // NOI18N
        btnCuatro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rolledBtn.png"))); // NOI18N
        btnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuatroActionPerformed(evt);
            }
        });
        jPanel2.add(btnCuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 65, 65));

        btnOcho.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        btnOcho.setForeground(new java.awt.Color(255, 255, 255));
        btnOcho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/normalBtn.png"))); // NOI18N
        btnOcho.setText("8");
        btnOcho.setBorder(null);
        btnOcho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOcho.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pressedBtn.png"))); // NOI18N
        btnOcho.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rolledBtn.png"))); // NOI18N
        btnOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOchoActionPerformed(evt);
            }
        });
        jPanel2.add(btnOcho, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 65, 65));

        btnSiete.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        btnSiete.setForeground(new java.awt.Color(255, 255, 255));
        btnSiete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/normalBtn.png"))); // NOI18N
        btnSiete.setText("7");
        btnSiete.setBorder(null);
        btnSiete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSiete.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pressedBtn.png"))); // NOI18N
        btnSiete.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rolledBtn.png"))); // NOI18N
        btnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSieteActionPerformed(evt);
            }
        });
        jPanel2.add(btnSiete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 65, 65));

        btnCero.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        btnCero.setForeground(new java.awt.Color(255, 255, 255));
        btnCero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/largeNormalBtn.png"))); // NOI18N
        btnCero.setText("0");
        btnCero.setBorder(null);
        btnCero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCero.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/largePressedBtn.png"))); // NOI18N
        btnCero.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/largeRolledBtn.png"))); // NOI18N
        btnCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCeroActionPerformed(evt);
            }
        });
        jPanel2.add(btnCero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 160, 65));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 370, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        System.out.println("Se ha borrado la operacion.");
        numero = "";
        num1 = 0;
        num2 = 0;
        txtOperacion.setText("0");
        txtNum.setText("0");
    }//GEN-LAST:event_delBtnActionPerformed

    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed
       numero += "1";
       txtOperacion.setText(numero);
       txtNum.setText("1");
    }//GEN-LAST:event_btnUnoActionPerformed

    private void btnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosActionPerformed
       numero += "2";
       txtOperacion.setText(numero);
       txtNum.setText("2");
    }//GEN-LAST:event_btnDosActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
       numero += "3";
       txtOperacion.setText(numero);
       txtNum.setText("3");
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuatroActionPerformed
       numero += "4";
       txtOperacion.setText(numero);
       txtNum.setText("4");
    }//GEN-LAST:event_btnCuatroActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
       numero += "5";
       txtOperacion.setText(numero);
       txtNum.setText("5");
    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
       numero += "6";
       txtOperacion.setText(numero);
       txtNum.setText("6");
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSieteActionPerformed
       numero += "7";
       txtOperacion.setText(numero);
       txtNum.setText("7");
    }//GEN-LAST:event_btnSieteActionPerformed

    private void btnOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOchoActionPerformed
       numero += "8";
       txtOperacion.setText(numero);
       txtNum.setText("8");
    }//GEN-LAST:event_btnOchoActionPerformed

    private void btnNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueveActionPerformed
       numero += "9";
       txtOperacion.setText(numero);
       txtNum.setText("9");
    }//GEN-LAST:event_btnNueveActionPerformed

    private void btnCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCeroActionPerformed
       numero += "0";
       txtOperacion.setText(numero);
       txtNum.setText("0");
    }//GEN-LAST:event_btnCeroActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
       if(txtOperacion.getText().contains("+")|txtOperacion.getText().contains("-")|txtOperacion.getText().contains("*")|txtOperacion.getText().contains("/")|txtOperacion.getText().contains("%")|txtOperacion.getText().contains("^")){
            JOptionPane.showMessageDialog(null, "Error Syntax");
            System.exit(0);
       }
       numero += "+";
       num1 = Integer.parseInt(txtOperacion.getText());
       txtOperacion.setText(numero);
       signo = "+";
       txtNum.setText("0");
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
       if(txtOperacion.getText().contains("+")|txtOperacion.getText().contains("-")|txtOperacion.getText().contains("*")|txtOperacion.getText().contains("/")|txtOperacion.getText().contains("%")|txtOperacion.getText().contains("^")){
            JOptionPane.showMessageDialog(null, "Error Syntax");
            System.exit(0);
       }
       numero += "-";
       num1 = Integer.parseInt(txtOperacion.getText());
       signo = "-";
       txtOperacion.setText(numero);
       txtNum.setText("0");
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacionActionPerformed
       if(txtOperacion.getText().contains("+")|txtOperacion.getText().contains("-")|txtOperacion.getText().contains("*")|txtOperacion.getText().contains("/")|txtOperacion.getText().contains("%")|txtOperacion.getText().contains("^")){
            JOptionPane.showMessageDialog(null, "Error Syntax");
            System.exit(0);
       }
       numero += "*";
       num1 = Integer.parseInt(txtOperacion.getText());
       signo = "*";
       txtOperacion.setText(numero);
       txtNum.setText("0");
    }//GEN-LAST:event_btnMultiplicacionActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
       if(txtOperacion.getText().contains("+")|txtOperacion.getText().contains("-")|txtOperacion.getText().contains("*")|txtOperacion.getText().contains("/")|txtOperacion.getText().contains("%")|txtOperacion.getText().contains("^")){
            JOptionPane.showMessageDialog(null, "Error Syntax");
            System.exit(0);
       }
       numero += "/";
       num1 = Integer.parseInt(txtOperacion.getText());
       signo = "/";
       txtOperacion.setText(numero);
       txtNum.setText("0");
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorcentajeActionPerformed
       if(txtOperacion.getText().contains("+")|txtOperacion.getText().contains("-")|txtOperacion.getText().contains("*")|txtOperacion.getText().contains("/")|txtOperacion.getText().contains("%")|txtOperacion.getText().contains("^")){
            JOptionPane.showMessageDialog(null, "Error Syntax");
            System.exit(0);
       }
       numero += "%";
       num1 = Integer.parseInt(txtOperacion.getText());
       signo = "%";
       txtOperacion.setText(numero);
       txtNum.setText("0");
    }//GEN-LAST:event_btnPorcentajeActionPerformed

    private void btnPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotenciaActionPerformed
       if(txtOperacion.getText().contains("+")|txtOperacion.getText().contains("-")|txtOperacion.getText().contains("*")|txtOperacion.getText().contains("/")|txtOperacion.getText().contains("%")|txtOperacion.getText().contains("^")){
            JOptionPane.showMessageDialog(null, "Error Syntax");
            System.exit(0);
       }
       numero += "^";
       num1 = Integer.parseInt(txtNum.getText());
       signo = "^";
       txtOperacion.setText(numero);
       txtNum.setText("0");
    }//GEN-LAST:event_btnPotenciaActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
       num2 = Integer.parseInt(txtNum.getText());
       switch(signo){
           case "+":
                txtNum.setText(Integer.toString(s.suma(num1, num2)));
                txtOperacion.setText(Integer.toString(s.suma(num1, num2)));
                numero = Integer.toString(s.suma(num1, num2));
                num1 = s.suma(num1, num2);
                break;
           case "-":
                txtNum.setText(Integer.toString(s.resta(num1, num2)));
                txtOperacion.setText(Integer.toString(s.resta(num1, num2)));
                numero = Integer.toString(s.resta(num1, num2));
                num1 = s.resta(num1, num2);
                break;
           case "*":
                txtNum.setText(Integer.toString(s.mult(num1, num2)));
                txtOperacion.setText(Integer.toString(s.mult(num1, num2)));
                numero = Integer.toString(s.mult(num1, num2));
                num1 = s.mult(num1, num2);
                break;
            case "/":
                txtNum.setText(Integer.toString(s.div(num1, num2)));
                txtOperacion.setText(Integer.toString(s.div(num1, num2)));
                numero = Integer.toString(s.div(num1, num2));
                num1 = s.div(num1, num2);
                break;
            case "%":
                txtNum.setText(Integer.toString(s.porc(num1, num2)));
                txtOperacion.setText(Integer.toString(s.porc(num1, num2)));
                numero = Integer.toString(s.porc(num1, num2));
                num1 = s.porc(num1, num2);
                break;
            case "^":
                txtNum.setText(Integer.toString(s.pot(num1, num2)));
                numero = Integer.toString(s.pot(num1, num2));
                txtOperacion.setText(Integer.toString(s.pot(num1, num2)));
                num1 = s.pot(num1, num2);
                break;
           default:
               numero = "0";
               System.out.println("0");
               
       }
       
    }//GEN-LAST:event_btnIgualActionPerformed
   
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
            java.util.logging.Logger.getLogger(panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCero;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMultiplicacion;
    private javax.swing.JButton btnNueve;
    private javax.swing.JButton btnOcho;
    private javax.swing.JButton btnPorcentaje;
    private javax.swing.JButton btnPotencia;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnSuma;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JButton delBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtNum;
    private javax.swing.JLabel txtOperacion;
    // End of variables declaration//GEN-END:variables
}

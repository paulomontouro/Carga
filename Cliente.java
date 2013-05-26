Carga
=====
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Cliente.java
 *
 * 
 */
package br.com.sistema.view;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Paulo Montouro
 */
public class Cliente extends javax.swing.JFrame {

    
    public Cliente() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
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
        jtxtnome = new javax.swing.JTextField();
        jtxtcpf = new javax.swing.JTextField();
        jtxtrg = new javax.swing.JTextField();
        jtxtbairro = new javax.swing.JTextField();
        jtxtrua = new javax.swing.JTextField();
        jtxtnumero = new javax.swing.JTextField();
        jtxtcidade = new javax.swing.JTextField();
        jtxtcep = new javax.swing.JTextField();
        jtxttelefone = new javax.swing.JTextField();
        jtxtemail = new javax.swing.JTextField();
        jbtncadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 43, 31, 14);

        jLabel2.setText("CPF:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 81, 23, 14);

        jLabel3.setText("RG:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 110, 18, 14);

        jLabel4.setText("Bairro:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 140, 32, 14);

        jLabel5.setText("Rua:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 165, 23, 14);

        jLabel6.setText("Numero:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 185, 41, 14);

        jLabel7.setText("Cidade:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 210, 60, 14);

        jLabel8.setText("CEP:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 240, 23, 14);

        jLabel9.setText("Telefone:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 270, 55, 14);

        jLabel10.setText("Email:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 301, 38, 14);
        getContentPane().add(jtxtnome);
        jtxtnome.setBounds(74, 43, 240, 20);
        getContentPane().add(jtxtcpf);
        jtxtcpf.setBounds(74, 81, 250, 20);
        getContentPane().add(jtxtrg);
        jtxtrg.setBounds(74, 107, 250, 20);
        getContentPane().add(jtxtbairro);
        jtxtbairro.setBounds(74, 133, 240, 20);
        getContentPane().add(jtxtrua);
        jtxtrua.setBounds(74, 159, 250, 20);
        getContentPane().add(jtxtnumero);
        jtxtnumero.setBounds(74, 185, 250, 20);
        getContentPane().add(jtxtcidade);
        jtxtcidade.setBounds(70, 210, 250, 20);
        getContentPane().add(jtxtcep);
        jtxtcep.setBounds(70, 240, 250, 20);
        getContentPane().add(jtxttelefone);
        jtxttelefone.setBounds(70, 270, 250, 20);
        getContentPane().add(jtxtemail);
        jtxtemail.setBounds(70, 300, 240, 20);

        jbtncadastrar.setText("Cadastrar");
        jbtncadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtncadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtncadastrar);
        jbtncadastrar.setBounds(140, 330, 110, 23);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-351)/2, (screenSize.height-396)/2, 351, 396);
    }// </editor-fold>                        

    private void jbtncadastrarActionPerformed(java.awt.event.ActionEvent evt) {                                              
        if(jtxtnome.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "O Campo Nome ficou em branco","Cadastro de Cliente",JOptionPane.WARNING_MESSAGE);
        }
        else if (jtxtcpf.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "O Campo CPF ficou em branco","Cadastro de Clientes",JOptionPane.WARNING_MESSAGE);
                
        }
        else if (jtxtrg.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "O Campo RG ficou em Branco","Cadastro de Clientes",JOptionPane.WARNING_MESSAGE);
        }
        else if (jtxtbairro.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "O Campo Bairro ficou em Branco","Cadastro de Cliente",JOptionPane.WARNING_MESSAGE);
        
                   
        }
        else if(jtxtrua.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "O Campo Rua ficou em Branco","Cadastro de Cliente",JOptionPane.WARNING_MESSAGE);
            
        }
        else if(jtxtnumero.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "O Campo Numero ficou em branco","Cadastro de Clientes",JOptionPane.WARNING_MESSAGE);
        }
        else if(jtxtcidade.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "O Campo Cidade ficou em branco","Cadastro de Clientes",JOptionPane.WARNING_MESSAGE);
            
        }
        else if(jtxtcep.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "O Campo CEP ficou em branco","Cadastro de Cliente",JOptionPane.WARNING_MESSAGE);
        }
        else if(jtxttelefone.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "O Caompo telefone ficou em branco","Cadastro de Cliente",JOptionPane.WARNING_MESSAGE);
            
        }
        else if(jtxtemail.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "O Campo email ficou em branco","Cadastro de Cliente",JOptionPane.WARNING_MESSAGE);
        }
        else {
            br.com.sistema.dao.Cliente cliente = new br.com.sistema.dao.Cliente();
            try {
                cliente.cadastrarCliente(jtxtnome.getText(),jtxtcpf.getText(),jtxtrg.getText(),jtxtbairro.getText(),jtxtrua.getText(),jtxtnumero.getText(),jtxtcidade.getText(),jtxtcep.getText(),jtxttelefone.getText(),jtxtemail.getText());
                JOptionPane.showMessageDialog(null, "Cliente Cadastrado","Cadastro de Cliente",JOptionPane.INFORMATION_MESSAGE);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }      
    
     /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }
                  
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
    private javax.swing.JButton jbtncadastrar;
    private javax.swing.JTextField jtxtbairro;
    private javax.swing.JTextField jtxtcep;
    private javax.swing.JTextField jtxtcidade;
    private javax.swing.JTextField jtxtcpf;
    private javax.swing.JTextField jtxtemail;
    private javax.swing.JTextField jtxtnome;
    private javax.swing.JTextField jtxtnumero;
    private javax.swing.JTextField jtxtrg;
    private javax.swing.JTextField jtxtrua;
    private javax.swing.JTextField jtxttelefone;
                       
}

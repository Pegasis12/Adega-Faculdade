import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.event.*;


public class Main extends JFrame{
	JButton b1, b2; //variaveis dos botoes
	String entrada;
	
    //objeto
    cliente c = new cliente();
    venda v = new venda();
    bebidas b = new bebidas();
    
	
	public Main(){
		getContentPane().setLayout(null); //criar container
		Handler objetolistener = new Handler(); //classe handler
		
		//botao 1
		b1 = new JButton(); //b1 = variavel do botao
		b1.setText("Começar"); //o que fica escrito no botao
		b1.addActionListener(objetolistener); //para que o botao tenha alguma ação
		b1.setBounds(10,10,200,30); //tamanho do botao
		add(b1); // adicionar botao

		b2 = new JButton();
		b2.setText("Sair");
		b2.addActionListener(objetolistener);
		b2.setBounds(10,200,200,30);
		add(b2);
		
		setBounds(850,400, 250, 300); //tamanho do container onde os botões estão dento
		setVisible(true); //deixa tudo visivel
	}	
	
	
	
    public static void main(String[] args) {
    	new Main(); //abre a interface grafica
    	
    }
    
    public class Handler implements ActionListener{ //classe handler
		public void actionPerformed (ActionEvent event){ //classe de ação
			
			if(event.getSource()== b1) { //Ação do Botao Começar (b1) -> So joguei o codigo todo dentro desse botão
				
				JOptionPane.showInternalMessageDialog(null, "----------------------------BEM VINDO A ADEGA PP----------------------------");
				JOptionPane.showInternalMessageDialog(null, "Primeiro iniciaremos seu cadastro!");
        do {
            c.setNome(JOptionPane.showInputDialog("Vamos começar pelo seu nome: "));
            if(c.getNome().length() == 0) {
                JOptionPane.showInternalMessageDialog(null, "Campo vazio, digite novamente seu nome!");
            }
        }while(c.getNome().length() == 0);

        do {
            c.setCpf(JOptionPane.showInputDialog("Digiter seu CPF com apenas 11 digitos: "));
            if(c.getCpf().length() != 11) {
                JOptionPane.showInternalMessageDialog(null, "CPF invalido!");
            }
        }while(c.getCpf().length() != 11);

        do {
            c.setRg(JOptionPane.showInputDialog("Digiter seu RG: "));
            if(c.getRg().length() != 8) {
                JOptionPane.showInternalMessageDialog(null, "RG invalido!");
            }
        }while(c.getRg().length() != 8);
        
        
        boolean validar = false;
        do{
        	c.setDtNasc(JOptionPane.showInputDialog("Digiter sua data de nascimento no formato dd/MM/yyyy: "));
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);

            try {
                sdf.parse(c.getDtNasc());
                validar = true;
            } catch(ParseException e) {
            	JOptionPane.showInternalMessageDialog(null, "Data invalida! digite no formato certo.");
            	validar = false;
            }
        }while(validar != true);
        	
        
        //não roda
        do {
            c.setTelefone(JOptionPane.showInputDialog("Digite seu número de telefone:"));
            if (c.getTelefone().length() != 11 || Integer.parseInt(c.getTelefone().substring(2))== 9){
                JOptionPane.showMessageDialog(null, "Número invalido!");
            }
        }while(c.getTelefone().length() != 11 || Integer.parseInt(c.getTelefone().substring(2)) == 9);
        
        
        do {
        	c.setCep(JOptionPane.showInputDialog("Digite o Cep: "));
        	if(c.getCep().length() != 8) {
                JOptionPane.showMessageDialog(null, "Cep invalido! digite novamente.");
        	}
        }while(c.getCep().length() != 8);
        
        c.setBairro(JOptionPane.showInputDialog("Digite o nome do seu bairro: "));
        
        do {
        	c.setRua(JOptionPane.showInputDialog("Digite o nome da sua Rua:" ));
        	if(c.getRua() == "") {
                JOptionPane.showMessageDialog(null, "Campo obrigatorio!");
        	}
        }while(c.getRua() == "");
        
        do {
        	c.setNumCasa(JOptionPane.showInputDialog("Digite o número da sua casa: "));
        	if(c.getNumCasa() == "") {
                JOptionPane.showMessageDialog(null, "Campo obrigatorio!");
        	}
        }while(c.getNumCasa() == "");
        
        c.setComplemento(JOptionPane.showInputDialog("Digite o complemento(Ex: Ap 105): "));
        

        JOptionPane.showInternalMessageDialog(null, "Cadastro efetuado com sucesso!");

        //saida
        JOptionPane.showMessageDialog(null, "Seus dados são \nNome: "+c.getNome()+ "\nCPF: "+c.getCpf()+ "\nRG: "+c.getRg()+"\nData de nascimento: "+c.getDtNasc()+"\nTelefone: "+
                c.getTelefone()+"\nBairro: "+c.getBairro()+"\n Rua: "+c.getRua()+"\nNúmero da casa: "+c.getNumCasa()+"\nComplemento: "+c.getComplemento()+"\nCEP: "+c.getCep());

        JOptionPane.showInternalMessageDialog(null, "Agora iremos as compras!");

        //calc
        int op = 0, quant;
        double total = 0, total1 = 0, total2 = 0, total3 = 0, total4 = 0;
        
        do {
            entrada = JOptionPane.showInputDialog("Digite: \n1 para comprar Heineken no valor de R$2.50. \n 2 para comprar Bud no valor de R$2.0. \n 3 para comprar Kaiser no valor de R$3.0. \n 4 para comprar Petra no valor de R$2.15. \n 5 para encerrar as comprar.");
            op = Integer.parseInt(entrada);
            switch(op) {
                case 1:
                    entrada = JOptionPane.showInputDialog("Deseja adicionar quantas ao carrinho? ");
                    quant = Integer.parseInt(entrada);
                    v.setMultiplicador(quant);
                    total1 = v.getMultiplicador()*b.getHeineken();
                    break;
                case 2:
                    entrada = JOptionPane.showInputDialog("Deseja adicionar quantas ao carrinho? ");
                    quant = Integer.parseInt(entrada);
                    v.setMultiplicador(quant);
                    total2 = v.getMultiplicador()*b.getBudweiser();
                    break;
                case 3:
                    entrada = JOptionPane.showInputDialog("Deseja adicionar quantas ao carrinho? ");
                    quant = Integer.parseInt(entrada);
                    v.setMultiplicador(quant);
                    total3 = v.getMultiplicador()*b.getKaiser();
                    break;
                case 4:
                    entrada = JOptionPane.showInputDialog("Deseja adicionar quantas ao carrinho? ");
                    quant = Integer.parseInt(entrada);
                    v.setMultiplicador(quant);
                    total4 = v.getMultiplicador()*b.getPetra();
                    break;
                case 5:
                    total = total1 + total2 + total3 + total4;
                    break;
            }
        }while(op != 5);

        JOptionPane.showMessageDialog(null, "O valor final da compra é de R$" +total+ "");

        entrada = JOptionPane.showInputDialog("Total a pagar R$"+total+"."+"\n Digite: \n1 Para pagar no cartão de até 4 vezes sem juros. \n 2 boleto. \n 3 Pix.");
        op = Integer.parseInt(entrada);
        
        switch(op){
            case 1:
                //validar cartão
                do {
                    v.setCartao(JOptionPane.showInputDialog("Digite o numero do cartão: "));
                    if(v.getCartao().length() != 12) {
                        JOptionPane.showMessageDialog(null, "Digite um número de cartão valido!");
                    }
                }while(v.getCartao().length() != 12);

                //validar cvv
                do {
                    v.setCvv(JOptionPane.showInputDialog("Digite o codigo de segurança do cartão: "));
                    if(v.getCvv().length() != 3) {
                        JOptionPane.showMessageDialog(null, "Digite um código de segurança valido!");
                    }
                }while(v.getCvv().length() != 3);

                           
                boolean valid = false;
                do{
                    v.setDataValidade(JOptionPane.showInputDialog("Digite a data de validade do cartão no formato MM/yyyy"));
                    SimpleDateFormat sdf = new SimpleDateFormat("MM/yy");
                    sdf.setLenient(false);
                    try {
                        sdf.parse(v.getDataValidade());
                        valid = true;
                    } catch(ParseException e) {
                    	JOptionPane.showInternalMessageDialog(null, "Data invalida! digite no formato certo.");
                    	valid = false;
                    }
                }while(valid != true);
                
                int divisor;
                do {
                    entrada = JOptionPane.showInputDialog("Digite de quantas vezes você quer dividir no cartão(1 até 4): ");
                    divisor = Integer.parseInt(entrada);
                    if(divisor > 12) {
                        JOptionPane.showMessageDialog(null, "Invalido! digite um número entre 1 e 4.");
                    }
                }while(divisor > 12);
                JOptionPane.showMessageDialog(null, "Pagamento efetuado com sucesso! Total a pagar por mês R$"+total/divisor);
                break;

            case 2:
            	Random gerador = new Random();
                //imprime sequência de 10 números inteiros aleatórios
                for (int i = 0; i < 1; i++) {
                	JOptionPane.showMessageDialog(null,"Valor total R$" +total+ "\n Código do boleto: " +gerador.nextInt()+ "\n O boleto atual expira em 3 dias uteis.");
                }
            	break;
            	
            case 3:
            	JOptionPane.showMessageDialog(null, "pix");
            	break;
        }
			}
			
			else { //botao sair (b2)
				System.exit (0);
			}
		}
	}
    
}
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class LocadoraTP extends JFrame implements ActionListener{
    
    private JTabbedPane abas;
    private JPanel pCadastro, pAluguel, pReserva, pPesquisa, pDevolucao;
    private JButton bFilme, bCd, bPessoa;
    private JPanel pCadastroTipo;
    private JPanel pCadastramento, pCadastroPessoa, pCadastroCd, pCadastroFilme;

    public LocadoraTP(){		
        
        setTitle("LOCADORA");
	setSize(600, 600);
	setBackground(Color.gray);

	JPanel topPanel = new JPanel();
	topPanel.setLayout(new BorderLayout());
	getContentPane().add(topPanel);

	// Cria as páginas das abas
	criarPCadastro();
	criarPAluguel();
	criarPDevolucao();

	// Cria as abas
	abas = new JTabbedPane();
	abas.addTab("CADASTRO", pCadastro);
	abas.addTab("ALUGUEL", pAluguel);
        abas.addTab("DEVOLUÇÃO", pDevolucao);
	abas.addTab("RESERVA", pReserva);
        abas.addTab("PESQUISA", pPesquisa);
	topPanel.add(abas, BorderLayout.CENTER);
    }

    public void criarPCadastro(){
        
        //JANELA PRINCIPAL DOS CADASTROS
        pCadastro = new JPanel();
        pCadastro.setLayout(new BorderLayout());
        
        //BOTÕES LATERAIS DOS CADASTROS
        bPessoa = new JButton ("CLIENTE");
        bPessoa.addActionListener(this); 
        bCd = new JButton ("CD");
        bCd.addActionListener(this); 
        bFilme = new JButton ("FILME");
        bFilme.addActionListener(this); 
        
        pCadastroTipo = new JPanel();
	pCadastroTipo.setLayout((new GridLayout(3, 1)));
        pCadastroTipo.add(bPessoa);
        pCadastroTipo.add(bCd);
        pCadastroTipo.add(bFilme);
        
        //PAINEL CENTRAL DA TELA DOS CADASTROS
        pCadastramento = new JPanel();
        pCadastramento.setLayout(new BorderLayout());
        
        pCadastro.add(pCadastroTipo, BorderLayout.WEST);
        pCadastro.add(pCadastramento, BorderLayout.CENTER);
        
    }

    public void criarPAluguel(){
		
        pAluguel = new JPanel();
	pAluguel.setLayout( new BorderLayout() );

	pAluguel.add(new JButton( "North" ), BorderLayout.NORTH );
	pAluguel.add(new JButton( "South" ), BorderLayout.SOUTH );
	pAluguel.add(new JButton( "East" ), BorderLayout.EAST );
	pAluguel.add(new JButton( "West" ), BorderLayout.WEST );
	pAluguel.add(new JButton( "Center" ), BorderLayout.CENTER );
    }

    public void criarPDevolucao(){
		
        pDevolucao = new JPanel();
	pDevolucao.setLayout(new GridLayout(4, 2));
	pDevolucao.add(new JLabel( "" ));
	pDevolucao.add(new TextArea());
	pDevolucao.add(new JLabel( "Field 2:" ));
	pDevolucao.add(new TextArea());
	pDevolucao.add(new JLabel( "Field 3:" ));
	pDevolucao.add(new TextArea());
        pDevolucao.add(new JButton("Cancelar"));
        pDevolucao.add(new JButton("Confirmar"));
    
    }

    @Override
    public void actionPerformed(ActionEvent evt){
        Object source = evt.getSource();
        
        if (source == bPessoa){
            pCadastramento.removeAll();
            
            pCadastroPessoa = new JPanel();
            pCadastroPessoa.setLayout(new BorderLayout());
            pCadastroPessoa.add(new JLabel("CADASTRO DE CLIENTES"), BorderLayout.NORTH);
            pCadastroPessoa.add(new JLabel(""), BorderLayout.NORTH);
            pCadastroPessoa.add(new JLabel(""), BorderLayout.NORTH);
            pCadastroPessoa.add(new JLabel("NOME:"), BorderLayout.NORTH);
            
            pCadastramento.add(pCadastroPessoa);
            pCadastramento.validate();
            pCadastramento.repaint();
            
        }else if(source == bCd){
            
            pCadastramento.removeAll();
            
            pCadastroCd = new JPanel();
            pCadastroCd.setLayout(new BorderLayout());
            pCadastroCd.add(new JLabel("CADASTRO DE CDS"), BorderLayout.NORTH);
            
            pCadastramento.add(pCadastroCd);
            pCadastramento.validate();
            pCadastramento.repaint();
            
        }else if (source == bFilme){
            
            pCadastramento.removeAll();
            
            pCadastroFilme = new JPanel();
            pCadastroFilme.setLayout(new BorderLayout());
            pCadastroFilme.add(new JLabel("CADASTRO DE FILMES"), BorderLayout.NORTH);
            
            pCadastramento.add(pCadastroFilme);
            pCadastramento.validate();
            pCadastramento.repaint();
        }
        
    }
    
    public static void main( String args[] ){
		
	LocadoraTP mainFrame = new LocadoraTP();
	mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
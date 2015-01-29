import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class LocadoraTP extends JFrame implements ActionListener{
    
    private JTabbedPane abas;
    private JPanel pCadastro, pAluguel, pReserva, pPesquisa, pDevolucao;
    private JButton bFilme;
    private JPanel pCadastroTipo;
    private JButton bCd;
    private JButton bPessoa;
    private JPanel pCadastramento;
    private JPanel pCadastroPessoa;
    private JPanel pCadastroCd;
    
    private JLabel text;
    private int cont;


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
        bCd = new JButton ("CD");
        bFilme = new JButton ("FILME");
        
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
        
        //PAINEL DE CADASTRO DE PESSOAS
        pCadastroPessoa = new JPanel();
        pCadastroPessoa.setLayout(new GridLayout(5,5));
        
        pCadastramento.add(pCadastroPessoa);
        
        
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
            JOptionPane.showMessageDialog(null, "PESSOA");
        }
        if (source == bCd){
            JOptionPane.showMessageDialog(null, "CD");
        }
        if (source == bFilme){
            
        }
        
    }
    
    public static void main( String args[] ){
		
	LocadoraTP mainFrame = new LocadoraTP();
	mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
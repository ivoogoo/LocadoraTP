import java.awt.*;
import javax.swing.*;

class LocadoraTP extends JFrame
{
	private	JTabbedPane abas;
	private	JPanel	pCadastro, pAluguel, pReserva, pPesquisa, pDevolucao;


	public LocadoraTP()
	{		
		setTitle("LOCADORA");
		setSize(600, 600);
		setBackground(Color.gray);

		JPanel topPanel = new JPanel();
		topPanel.setLayout(new BorderLayout());
		getContentPane().add(topPanel);

		// Cria as páginas das abas
		criarPCadastro();
		criarPAluguel();
		createPage3();

		// Cria as abas
		abas = new JTabbedPane();
		abas.addTab("CADASTRO", pCadastro);
		abas.addTab("ALUGUEL", pAluguel);
                abas.addTab("DEVOLUÇÃO", pDevolucao);
		abas.addTab("RESERVA", pReserva);
                abas.addTab("PESQUISA", pPesquisa);
		topPanel.add(abas, BorderLayout.CENTER);
	}

	public void criarPCadastro()
	{
		pCadastro = new JPanel();
		pCadastro.setLayout( null );

                JLabel titulo = new JLabel( "INFORME OS DADOS" );
		titulo.setBounds( 10, 5, 150, 20 );
		pCadastro.add( titulo );
                
		JLabel label1 = new JLabel( "NOME:" );
		label1.setBounds( 10, 35, 150, 20 );
		pCadastro.add( label1 );

		JTextField fNome = new JTextField();
		fNome.setBounds( 10, 55, 150, 20 );
		pCadastro.add( fNome );

		JLabel label2 = new JLabel( "CPF:" );
		label2.setBounds( 10, 80, 150, 20 );
		pCadastro.add( label2 );

		JTextField fCpf = new JTextField();
		fCpf.setBounds( 10, 100, 150, 20 );
		pCadastro.add( fCpf );
	}

	public void criarPAluguel()
	{
		pAluguel = new JPanel();
		pAluguel.setLayout( new BorderLayout() );

		pAluguel.add( new JButton( "North" ), BorderLayout.NORTH );
		pAluguel.add( new JButton( "South" ), BorderLayout.SOUTH );
		pAluguel.add( new JButton( "East" ), BorderLayout.EAST );
		pAluguel.add( new JButton( "West" ), BorderLayout.WEST );
		pAluguel.add( new JButton( "Center" ), BorderLayout.CENTER );
	}

	public void createPage3()
	{
		pDevolucao = new JPanel();
		pDevolucao.setLayout( new GridLayout( 3, 2 ) );

		pDevolucao.add( new JLabel( "Field 1:" ) );
		pDevolucao.add( new TextArea() );
		pDevolucao.add( new JLabel( "Field 2:" ) );
		pDevolucao.add( new TextArea() );
		pDevolucao.add( new JLabel( "Field 3:" ) );
		pDevolucao.add( new TextArea() );
	}

    // Main method to get things started
	public static void main( String args[] )
	{
		// Create an instance of the test application
		LocadoraTP mainFrame = new LocadoraTP();
		mainFrame.setVisible(true);
                mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
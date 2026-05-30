import javax.swing.*;
import java.awt.*;
import javax.swing.event.DocumentEvent; //Botao nao clicavel
import javax.swing.event.DocumentListener; //Botao nao clicavel

public class InterfaceGrafica{

    //Func para transformar o conjunto dado em Numeros
    public static Conjunto transfTextConj(String texto){
        Conjunto conj = new Conjunto();
        String[] partes = texto.split(","); //Tira Virgula

        for (String parte : partes){ //mn é pra cada pedaço de partes faz algo
            String numText = parte.trim(); //Tira os espaços
            int num = Integer.parseInt(numText); //Transforma em num

            conj.adicionar(num);
        }

        return conj;
    }

    public static void main(String[] args) {
        JFrame janela = new JFrame("Conjuntos");

        janela.setSize(500, 450); //tamanho
        janela.setLocationRelativeTo(null); //Posicao
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Fechar qnd clico
        janela.setBackground(Color.DARK_GRAY);


        JPanel painel = new JPanel();

        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS)); //Alinhando no eixo Y
        painel.setBackground(Color.DARK_GRAY); //Cor do painel


        //Conjunto 1
        JLabel conjunto1 = new JLabel("Conjunto LA");
        JTextField campoConjunto1 = new JTextField(10);
        campoConjunto1.setMaximumSize(new Dimension(200, 20));
        conjunto1.setAlignmentX(Component.CENTER_ALIGNMENT);
        conjunto1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        conjunto1.setForeground(Color.WHITE);
        campoConjunto1.setAlignmentX(Component.CENTER_ALIGNMENT);
        campoConjunto1.setBackground(Color.GRAY);

        //Conjunto 2
        JLabel conjunto2 = new JLabel("Conjunto LB");                       //Criando o bgl q vai aparacer o texto
        JTextField campoConjunto2 = new JTextField(10);                 //Criando aonde vai preencher o texto
        campoConjunto2.setMaximumSize(new Dimension(200, 20));      //O tamanho do cara a ser preenchido
        conjunto2.setAlignmentX(Component.CENTER_ALIGNMENT);                    //Alinha
        conjunto2.setFont(new Font("Comic Sans MS", Font.BOLD, 20)); //Comic Sans Hell Yeha
        conjunto2.setForeground(Color.WHITE);                                   //Colorido do Branco
        campoConjunto2.setAlignmentX(Component.CENTER_ALIGNMENT);               //Alinha
        campoConjunto2.setBackground(Color.GRAY);                               //Cor legal



        //Config Resultado
        JPanel result = new JPanel();
        result.setLayout(new BoxLayout(result, BoxLayout.Y_AXIS));
        result.setBackground(Color.DARK_GRAY);
        result.add(Box.createVerticalStrut(60));//Adiciona x pixels de distancia entre painel

        JLabel tituloResult = new JLabel("");
        tituloResult.setForeground(Color.WHITE);
        tituloResult.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        tituloResult.setAlignmentX(Component.CENTER_ALIGNMENT);
        tituloResult.setVisible(false);

        JLabel conjResult = new JLabel("");
        conjResult.setForeground(Color.WHITE);
        conjResult.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        conjResult.setAlignmentX(Component.CENTER_ALIGNMENT);
        conjResult.setBackground(Color.GRAY);
        conjResult.setVisible(false);


        //Botao
        JPanel painelBtn = new JPanel();

        painelBtn.setLayout(new FlowLayout(FlowLayout.CENTER));// Box e Flow são diferentes como eu quero deixa seguido o Flow e melhor
        painelBtn.setBackground(Color.DARK_GRAY);

        JButton btnInter = new JButton("Intersecção"); //Nome do meu Botao
        btnInter.setBackground(Color.GREEN); //Cor do botao Verde
        btnInter.setFont(new Font("Comic Sans MS", Font.BOLD, 20)); //Comic Sans Hell Yeah
        btnInter.setForeground(Color.BLACK); //Cor da fonte do Botao
        btnInter.setPreferredSize(new Dimension(150, 50)); //Box respeita MaximusSize Flow respeita PreferredSize
        btnInter.setEnabled(false);

        JButton btnUni = new JButton("União"); //Nome do meu Botao
        btnUni.setBackground(Color.GREEN); //Cor do botao Verde
        btnUni.setFont(new Font("Comic Sans MS", Font.BOLD, 20)); //Comic Sans Hell Yeah
        btnUni.setForeground(Color.BLACK); //Cor da fonte do Botao
        btnUni.setPreferredSize(new Dimension(150, 50));
        btnUni.setEnabled(false);

        JButton refazer = new JButton("Refazer");
        refazer.setBackground(Color.GREEN); //Cor do botao Verde
        refazer.setFont(new Font("Comic Sans MS", Font.BOLD, 20)); //Comic Sans Hell Yeah
        refazer.setForeground(Color.BLACK); //Cor da fonte do Botao
        refazer.setPreferredSize(new Dimension(150, 50));
        refazer.setVisible(false);



        //Add ao painel Principal
        painel.add(conjunto1);
        painel.add(campoConjunto1);

        //Add ao painel Principal
        painel.add(conjunto2);
        painel.add(campoConjunto2);

        //Painel dos Botoes
        painelBtn.add(btnInter);
        painelBtn.add(btnUni);
        painelBtn.add(refazer);

        //Painel Resultados
        result.add(tituloResult);
        result.add(conjResult);


        //Acoes Botoes
        btnInter.addActionListener(e ->{
            tituloResult.setVisible(true);
            conjResult.setVisible(true);
            btnUni.setVisible(false);
            btnInter.setVisible(false);
            refazer.setVisible(true);

            tituloResult.setText("Resultado da Intersecção");
        });

        btnUni.addActionListener(e ->{
            tituloResult.setVisible(true);
            conjResult.setVisible(true);
            btnUni.setVisible(false);
            btnInter.setVisible(false);
            refazer.setVisible(true);

            tituloResult.setText("Resultado da União");

        });

        refazer.addActionListener(e ->{
            tituloResult.setVisible(false);
            conjResult.setVisible(false);
            btnUni.setVisible(true);
            btnInter.setVisible(true);
            refazer.setVisible(false);

        });


        janela.add(painel, BorderLayout.NORTH); //Pra poder organizar os lugares dos bgl botei NORTH
        janela.add(result,BorderLayout.CENTER);
        janela.add(painelBtn, BorderLayout.SOUTH);

        janela.setVisible(true); //Ta visivel
    }
}
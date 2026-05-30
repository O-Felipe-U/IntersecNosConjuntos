
/**
 * Escreva uma descrição da classe ListaDuplamenteLigada aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ListaDuplamenteLigada implements IListaLigada
{
    No inicio;
    No fim;
    int qtdNos;
    
    //lista Vazia Criada
    public ListaDuplamenteLigada()
    {
        this.inicio = null;
        this.fim = null;
        this.qtdNos = 0;
    }
    

    public No getInicio()
    {
        return this.inicio;
    }
    
    public No getFim()
    {
        return this.fim;
    }
    
    public int getQtdNos()
    {
        return this.qtdNos;        
    }


    public void setInicio(No i)
    {
        this.inicio = i;
    }
    
    public void setFim(No f)
    {
        this.inicio = f;
    }

    public void setQtdNos(int q)
    {
        this.qtdNos = q;
    }
    
    public void mostrarLista()
    {

        
    }

    //ele pra adicionar tem q me passar o inicio da Lista
    public No inserirInicio(int Item)
    {
        //como eu adiciono em uma ListaDuplamenteLigada?

        //coloco meu conteudo na memoria alocada
        No Celula = new No(Item);
        
        //setando meu novo inicio
        Celula.setNext(getInicio());
        
        //setando como null pq o primeiro nao possui anterior
        Celula.setAnte(null);

        //se meu tiver alguma coisa, significa que tenho q alterar meu anterior da proxima Celula
        if(getInicio() != null)
        { 
            getInicio().setAnte(Celula);
        }
        else 
        {
            //caso seja meu primeiro item - Lista Vazia
            setFim(Celula);
        }

        //altero meu novo Inicio para Localizacao da Celula
        setInicio(Celula);

        setQtdNos(getQtdNos() + 1);
    
        //por questao de eficiencia, retornar celula é mais rapido do que retornar o inicio da Lista, 
        // pois o inicio da Lista tem q acessar a Celula para retornar o item

        return Celula;
    }
}
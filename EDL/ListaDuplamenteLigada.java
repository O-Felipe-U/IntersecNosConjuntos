
/**
 * Escreva uma descrição da classe ListaDuplamenteLigada aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ListaDuplamenteLigada
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
    
    public void setInicio(No i)
    {
        this.inicio = i;
    }
    
    public void setFim(No f)
    {
        this.inicio = f;
    }
    
    public void inserirInicio()
    {

    }

    //verifica se o item que querem adicionar ja esta na lista
    public boolean jatem(int item)
    {
        boolean t = false;
        if(inicio != null) {

            No aux = inicio;
            do {
                if (aux.getItem() == item) t = true;
                aux = aux.getNext();
            } while (aux != inicio && !t);
            return false;
        }
        return t;
    }
}

/**
 * Escreva uma descrição da classe No aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class No
{
    private int item;
    private No next;
    private No ante;

    public No(int Conteudo)
    {
        //construtor sem nada null, no novo
        setItem(Conteudo);
        setNext(null);
        setAnte(null);
    }

    //parte dos Getters e setters
    public int getItem()
    {
        return this.item;
    }
    
    public No getNext()
    {
        return this.next;
    }
    
    public No getAnte()
    {
        return this.ante;
    }
    
    public void setItem(int q)
    {
        this.item = q;
    }
    
    public void setNext(No q)
    {
        this.next = q;
    }
    
    public void setAnte(No q)
    {
        this.ante = q;
    }
    
    //Metodo toString para garantir que nao saia o endereço do No
    public String toString()
    {
        return ""+ getItem();
    }
}
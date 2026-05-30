
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
    
    public String toString()
    {
        return ""+ getItem();
    }
}
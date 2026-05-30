
/**
 * Escreva uma descrição da classe meuteste aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class meuteste
{
    public static void main(String args[])
    {
        
         //-------------------------------------------------
        No testeNo = new No(10);
        System.out.println("" + testeNo);
        
       
        
        //-------------------------------------------------
         IListaLigada Lista = new ListaDuplamenteLigada();
        Lista.inserirInicio(10);
        Lista.inserirInicio(3);
        Lista.inserirInicio(2);
        Lista.mostrarLista();

        //-------------------------------------------------
        System.out.println("\nFim da Lista: " + Lista.getFim());
        System.out.println("\nInicio da Lista: " + Lista.getInicio());
    
    }


}
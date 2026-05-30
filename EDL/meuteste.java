
public class meuteste
{
    public static void main(String args[])
    {

        Conjunto la = new Conjunto();
        Conjunto lc = new Conjunto();

        lc.adicionar(1);
        lc.adicionar(2);
        lc.adicionar(31);
        lc.adicionar(29);
        lc.mostrar();

        la.adicionar(7);
        la.adicionar(7);

        la.adicionar(49);
        la.mostrar();

    }
}
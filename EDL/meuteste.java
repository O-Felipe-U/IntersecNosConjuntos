
public class meuteste
{
    public static void main(String args[])
    {
        Conjunto resultado = new Conjunto();
        Conjunto la = new Conjunto();
        Conjunto lc = new Conjunto();

        lc.adicionar(1);
        lc.adicionar(2);
        lc.adicionar(31);
        lc.adicionar(29);
        lc.adicionar(67);
        lc.adicionar(49);
        System.out.println("Conjunto C:");
        lc.mostrar();

        la.adicionar(1);
        la.adicionar(7);
        la.adicionar(29);
        la.adicionar(49);
        System.out.println("Conjunto A:");
        la.mostrar();

        System.out.println("Resultado da interseccao de A e C:");
        resultado = resultado.interseccao(lc, la);
        resultado.mostrar();


        System.out.println("Resultado da uniao de A e C:");
        resultado = resultado.uniao(lc, la);
        resultado.mostrar();
    }


}
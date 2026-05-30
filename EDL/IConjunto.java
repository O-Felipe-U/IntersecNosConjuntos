public interface IConjunto {

    public Conjunto interseccao(Conjunto um, Conjunto dois);

    public Conjunto uniao(Conjunto um, Conjunto dois);

    public void adicionar(int item);

    public boolean contem(int item);

    public void mostrar();
}

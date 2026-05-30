
public interface IListaLigada
{

    No getInicio();
    No getFim();

    void setInicio(No inicio);
    void setFim(No fim);

    boolean jaTem(int item);
}
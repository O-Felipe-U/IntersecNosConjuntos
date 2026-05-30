public class Conjunto implements IConjunto{
    // usa a lista ligada pra funcionar
    ListaDuplamenteLigada conjuntinho;

    public Conjunto()
    {
        this.conjuntinho = new ListaDuplamenteLigada();
    }

    public void adicionar(int item)
    {

        No novo = new No(item);
        //caso a lista esteja vazia
        if(conjuntinho.getInicio() == null)
        {
            conjuntinho.setInicio(novo);
            conjuntinho.setFim(novo);

            novo.setNext(novo);
            novo.setAnte(novo);
            conjuntinho.qtdNos++;
        }

        else {
            if (!conjuntinho.jatem(item)) // se não tem ele continua
            {
                //caso esse novo item seja menor que o primeiro
                if (item < conjuntinho.inicio.getItem()) {
                    novo.setNext(conjuntinho.getInicio());
                    novo.setAnte(conjuntinho.getFim());

                    conjuntinho.setInicio(novo);
                    conjuntinho.setFim(novo);

                    conjuntinho.qtdNos++;
                }
                else {
                    No aux = conjuntinho.getInicio();
                    while (aux.getNext() != conjuntinho.getFim()) {
                        if (item < aux.getNext().getItem()) {
                            novo.setNext(aux.getNext());
                            novo.setAnte(aux);
                            aux.setNext(novo);
                            aux.getNext().setAnte(novo);
                            conjuntinho.qtdNos++;
                        } else
                            aux = aux.getNext();
                    }

                    if(item > aux.getNext().getItem())
                    {
                        novo.setNext(conjuntinho.getFim());
                        novo.setAnte(aux);
                        aux.setNext(novo);
                        conjuntinho.getFim().setAnte(novo);
                        conjuntinho.qtdNos++;
                    }
                }
            }
        }
    }



}

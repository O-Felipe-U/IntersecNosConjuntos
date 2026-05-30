public class Conjunto implements IConjunto{
    // usa a lista ligada pra funcionar
    ListaDuplamenteLigada conjuntinho;

    public Conjunto()
    {
        this.conjuntinho = new ListaDuplamenteLigada();
    }

    public void adicionar(int item)
    {
        if (!conjuntinho.jatem(item)) {

            No novo = new No(item);

            //caso a lista esteja vazia
            if (conjuntinho.getInicio() == null) {
                conjuntinho.setInicio(novo);
                conjuntinho.setFim(novo);

                novo.setNext(novo);
                novo.setAnte(novo);
                conjuntinho.qtdNos++;
            }
            else {
                //caso o novo item seja menor que o primeiro
                if(item < conjuntinho.getInicio().getItem()) {
                    novo.setNext(conjuntinho.getInicio());
                    novo.setAnte(conjuntinho.getFim());

                    // atualiza os nós
                    conjuntinho.getInicio().setAnte(novo);
                    conjuntinho.getFim().setNext(novo);

                    conjuntinho.setInicio(novo); // O novo assume como início
                    conjuntinho.qtdNos++;
                }
                else {

                    No aux = conjuntinho.getInicio();

                    // anda até achar alguém maior ou até dar a volta
                    while (aux.getNext() != conjuntinho.getInicio() && item > aux.getNext().getItem()) {
                        aux = aux.getNext();
                    }

                    //novo vai entrar depois do aux
                    novo.setNext(aux.getNext());
                    novo.setAnte(aux);

                    aux.getNext().setAnte(novo);
                    aux.setNext(novo);

                    if (novo.getNext() == conjuntinho.getInicio()) {
                        conjuntinho.setFim(novo);
                    }

                    conjuntinho.qtdNos++;
                }
            }
        }
    }

    public boolean contem(int item)
    {
        return conjuntinho.jatem(item);
    }

    public void mostrar()
    {
        if (conjuntinho.getInicio() == null) {
            System.out.println("Conjunto vazio.");
            return;
        }

        No aux = conjuntinho.getInicio();
        do {
            System.out.print(aux.getItem() + " ");
            aux = aux.getNext();
        } while (aux != conjuntinho.getInicio());
        System.out.println();
    }

    public Conjunto interseccao(Conjunto um, Conjunto dois)
    {
        Conjunto resultado = new Conjunto();

        if (um.conjuntinho.getInicio() == null) {
            return resultado;
        }

        No aux = um.conjuntinho.getInicio();

        do {
            if (dois.contem(aux.getItem())) {
                resultado.adicionar(aux.getItem());
            }
            aux = aux.getNext();
        } while (aux != um.conjuntinho.getInicio());

        return resultado;
    }

    public Conjunto uniao(Conjunto um, Conjunto dois)
    {
        Conjunto resultado = new Conjunto();

        if (um.conjuntinho.getInicio() != null) {
            No aux1 = um.conjuntinho.getInicio();
            do {
                resultado.adicionar(aux1.getItem());
                aux1 = aux1.getNext();
            } while (aux1 != um.conjuntinho.getInicio());
        }

        if (dois.conjuntinho.getInicio() != null) {
            No aux2 = dois.conjuntinho.getInicio();
            do {
                resultado.adicionar(aux2.getItem());
                aux2 = aux2.getNext();
            } while (aux2 != dois.conjuntinho.getInicio());
        }

        return resultado;
    }
}

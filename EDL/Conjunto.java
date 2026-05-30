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

}

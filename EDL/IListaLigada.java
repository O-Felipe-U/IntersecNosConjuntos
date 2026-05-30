
/**
 * Escreva a descrição da interface IListaLigada aqui.
 * 
 * @author (seu nome aqui) 
 * @version (um número da versão ou data aqui)
 */

public interface IListaLigada
{
    /**
     * Exemplo de um cabeçalho de método - substitua este comentário pelo seu
     * 
     * @param  y    exemplo de um parâmetro de método
     * @return        o resultado produzido pelo sampleMethod 
     */
    No getInicio();
    No getFim();
    
    void setInicio(No inicio);
    void setFim(No fim);

    No inserirInicio(int Item);

}
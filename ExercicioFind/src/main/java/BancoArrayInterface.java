import java.util.List;
/**
 * @author Pedro Guilherme
 * @version 1.0
 * @since 07/06/2020 - 14:18
 * @category Model
 */
public interface BancoArrayInterface {

    public void cadastrar(Cachorro cachorro);
    public List<Cachorro> buscar();
    public void excluir(int index);
    public void alterar(int index, Cachorro cachorro);
    public Cachorro filtrar(Cachorro cachorro, int filtro);
    public int verificarQuantidade();
    public void apagarAgenda();

}
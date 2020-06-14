import java.util.ArrayList;
import java.util.List;
/**
 * @author Pedro Guilherme
 * @version 1.0
 * @since 07/06/2020 - 14:12
 * @category Model
 */
public class BancoArray implements BancoArrayInterface {

    List<Cachorro> agenda;

    public BancoArray() {
        agenda = new ArrayList<>();
    }

    @Override
    public void cadastrar(Cachorro cachorro) {
        this.agenda.add(cachorro);
    }

    @Override
    public List<Cachorro> buscar() {
        return this.agenda;
    }

    @Override
    public void excluir(int index) {
        this.agenda.remove(index);
    }

    @Override
    public void alterar(int index, Cachorro cachorro) {
        this.agenda.add(index, cachorro);
    }

    @Override
    public Cachorro filtrar(Cachorro cachorro, int filtro) {
        switch(filtro) {
            case 1:
                for (Cachorro cachorro1 : this.agenda) {
                    if (cachorro1.getNome().contains(cachorro.getNome())) {
                        return cachorro1;
                    }
                }
                break;
            case 2:
                for (Cachorro cachorro1 : this.agenda) {
                    if (cachorro1.getRaca().contains(cachorro.getRaca())) {
                        return cachorro1;
                    }
                }
                break;
            case 3:
                for (Cachorro cachorro1 : this.agenda) {
                    if (cachorro1.getIdade() == cachorro.getIdade()) {
                        return cachorro1;
                    }
                }
                break;
            default:
                return null;
        }
        return null;
    }

    @Override
    public int verificarQuantidade() {
        return this.agenda.size();
    }

    @Override
    public void apagarAgenda() {
        this.agenda.clear();
    }

}

public class Receita extends Transacao {

    public Receita(double valor, String desc, String data) {
        super(valor, desc, data);
    }

    @Override
    public double aplicarNoSaldo() {
        return getValor();
    }
}
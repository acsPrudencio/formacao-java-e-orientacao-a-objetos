package alura.bytebank.herdadoConta.modelo;


public class SaldoInsuficienteException extends Exception{

    public SaldoInsuficienteException(String msg) {
        super(msg);
    }

}


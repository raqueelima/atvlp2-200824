public class ContaCorrente {
    private float limite;
    private float saldo;
    private float valorLimite;


    public ContaCorrente(float saldo, float valorLimite) {
        if (saldo < 0 || valorLimite < 0) {
            throw new IllegalArgumentException("Os valores não podem ser negativos.");
        }
        this.saldo = saldo;
        this.valorLimite = valorLimite;
        this.limite = valorLimite;
    }


    public void sacar(float valor){
        if (valor < 0){
            throw new IllegalArgumentException("O valor do saque nao pode ser negativo!");
        }
        if (valor < saldo + limite){
            throw new IllegalArgumentException("Sem saldo e sem limite para o saque!");

        }
        saldo -= valor;

        if (saldo < 0) {
            limite += saldo; 
            saldo = 0;
        }
    }

    public void depositar(float valor){
        if (valor < 0){
            throw new IllegalArgumentException("O valor do deposito nao pode ser negativo!");
        }
        saldo += valor;
        if(saldo > valorLimite){
            limite += (saldo - valorLimite);
            saldo = valorLimite;
        }
    }

    public void setValorLimite(float valor){
        if (valor < 0){
            throw new IllegalArgumentException("O valor do limite nao pode ser negativo!");
        }
        valorLimite = valor;
        if (limite < valorLimite) {
            limite = valorLimite;
        }
    }
    public float getSaldo(){
        return saldo;
    }
    public float getValorLimite(){
        return valorLimite;
    }
    public float getLimite(){
        return limite;
    }


}

package CBanco;

public class ContaBancd {
    public int numConta;
    protected String tipo;
    private double saldo;
    private boolean status;
    private String dono;
    public ContaBancd(){
        this.setStatus(false);
        this.setSaldo(0.0);
    }
    public void abrirConta(String tipo){
        this.setStatus(true);
        this.setTipo(tipo);
        if (this.getTipo() .equals("CP")){
            this.setSaldo(150);
        }else if (this.getTipo() .equals("CC")){
            this.setSaldo(50);
        }
    }
    public void fecharConta(){
        if(isStatus()){
            if(this.getSaldo() > 0){
                System.out.println(" Conta deve estar zerada para ser finalizada! ");
            }else if (this.getSaldo() < 0){
                System.out.println(" Dívida na conta!!! ");
            }else{
                System.out.println("Conta está finalizada com sucesso!!");

            }
        }else{
            System.out.println("Não há conta no nome de " + this.getDono());
        }
    }
    public void depositar(double valor){
        if(isStatus()){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println(" Depósito feito na conta de " + this.getDono() + ". Valor do saldo pós depósito: " + getSaldo());
        }else{
            System.out.println(" Você não pode depositar, pois não tem conta no seu nome ");
        }

    }
    public void sacar(double valor){
        if(isStatus()){
            if(this.getSaldo()>=valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println(" Saque feito na conta de " + this.getDono() + ". Retirado: " + valor +  ". Valor do saldo pós saque: " + getSaldo());
            }else{
                System.out.println(" Você não pode sacar, pois o valor do saque é maior do que o seu saldo. ");
            }
        }else{
            System.out.println(" Você não pode sacar, pois não tem conta no seu nome ");
        }
    }
    public void pagarMensal(){
        if(isStatus()){
            if(this.getTipo() .equals("CP")) {
                this.setSaldo(this.getSaldo() - 20);
                System.out.println(" Pagamento da mensalidade feito na conta de " + this.getDono() + ". Retirado: " + 20 +  ". Valor do saldo pós saque: " + getSaldo());
            }else if(this.getTipo() .equals("CC")){
                this.setSaldo(this.getSaldo() - 12);
                System.out.println(" Pagamento da mensalidade feito na conta de " + this.getDono() + ". Retirado: " + 12 +  ". Valor do saldo pós saque: " + getSaldo());
            }else{
                System.out.println("MANA NÃO");
            }
        }else{
            System.out.println(" Você não tem uma conta nesse banco ");
        }
    }


    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
}

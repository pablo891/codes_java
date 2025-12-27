package lab04;

public class HistoricoDeLancamentos {
    private Lancamento[] lancamentos;
    private int ultimoLancamento;

    public HistoricoDeLancamentos(int numeroDeLancamentos){
        this.lancamentos = new Lancamento[numeroDeLancamentos+1];
    }

    public void insereLancamento(Lancamento lancamento){
        if(this.ultimoLancamento == this.lancamentos.length-1){
            for(int i = 1; i < this.lancamentos.length; i++){
                this.lancamentos[i-1]=this.lancamentos[i];
            }
            this.lancamentos[this.lancamentos.length-1]=lancamento;
        } else{
            this.ultimoLancamento++;
            this.lancamentos[this.ultimoLancamento]=lancamento;
        }
    }

    public void imprimirHistorico(){
        System.out.println("\n--- Histórico de Lançamentos ---");
        for(int i=1; i <= this.ultimoLancamento; i++){
            if(this.lancamentos[i]!=null){
                System.out.println((i)+". "+this.lancamentos[i].toString());
            }
        }
        System.out.println("--------------------------------");
    }
}
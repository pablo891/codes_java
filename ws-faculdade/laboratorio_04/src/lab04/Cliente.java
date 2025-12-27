package lab04;

public class Cliente {
    private String cpf;
    private String nome;

    public Cliente(String nome, String cpf){
        this.nome=nome;
        this.cpf=cpf;
    }

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    @Override
    public String toString(){
        return "Cliente [Nome: "+nome+", CPF: "+cpf+"]";
    }
}
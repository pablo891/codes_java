package boas_praticas_03;

import java.util.Objects;

public class Cnpj {
private String valor;

    
    public Cnpj(String valor) {
        this.valor = valor;
    }

    public boolean isValid() {
        return primeiroDigitoVerificador() == primeiroDigitoCorreto()
                && segundoDigitoVerificador() == segundoDigitoCorreto();
    }

   
    private int primeiroDigitoCorreto() {
    	return 0; 
    	}
    private int primeiroDigitoVerificador() {
    	return 0; 
    	}
    private int segundoDigitoCorreto() {
    	return 0; 
    	}
    private int segundoDigitoVerificador() {
    	return 0; 
    	}

    public String getValor() {
        return valor;
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cnpj cnpj = (Cnpj) o;
        return Objects.equals(valor, cnpj.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}

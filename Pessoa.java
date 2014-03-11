/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package senac_alproii;

/**
 *
 * @author Andrea Fofonka
 */
public final class Pessoa {

    private String nome, nacionalidade;
    private int anoNasc, sexo;
    private double altura, peso;

    public Pessoa(String nome, String nacionalidade, int sexo, int anoNasc, double altura, double peso) {
        setNome(nome);
        setNacionalidade(nacionalidade);
        setSexo(sexo);
        setAnoNasc(anoNasc);
        setAltura(altura);
        setPeso(peso);
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
    

    public int Sexo() {
        return sexo;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public final void setNome(String nome) {
        if (nome != null) {this.nome = nome;
        } else {
            this.nome = "NAO INFORMADO";
        }
            
    }

    public void setNacionalidade(String nacionalidade) {
        if (nacionalidade != null) {this.nacionalidade = nacionalidade;
        } else {
            this.nacionalidade = "NAO INFORMADO";
        }
    }
    
    public final void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public void setAnoNasc(int anoNasc) {
        if (anoNasc > 0) {
            this.anoNasc = anoNasc;
        } else {
            this.anoNasc = 1900;
        }
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            this.altura = 1;
        }
    }

    public void setPeso(double peso) {
        if (peso > 0 ) {
            this.peso = peso;
        } else {
            this.peso = 1;
        }
    }

    @Override
    public String toString() {
        return "PESSOA \n{" + "Nome: " + nome + "\n Nacionalidade:" + nacionalidade + 
               "\n Ano de Nascimento: " + anoNasc + "\n Sexo: " + sexo + "\n Altura:" + altura + "\n Peso: " + peso + '}';
    }
}

    
   

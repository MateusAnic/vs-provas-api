package provas.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class QuestaoPojo {
    @JsonIgnore
    private String idQuestao;
    private String titulo;
    private String enunciado;
    private String dificuldade;
    private int[] idTemas;
    private AlternativaPojo[] alternativas;
    private int idEmpresa;

    public String getIdQuestao() {
        return idQuestao;
    }

    public void setIdQuestao(String idQuestao) {
        this.idQuestao = idQuestao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public int[] getIdTemas() {
        return idTemas;
    }

    public void setIdTemas(int[] idTemas) {
        this.idTemas = idTemas;
    }

    public AlternativaPojo[] getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(AlternativaPojo[] alternativas) {
        this.alternativas = alternativas;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
}

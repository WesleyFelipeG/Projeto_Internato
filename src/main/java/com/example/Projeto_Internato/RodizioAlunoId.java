package com.example.Projeto_Internato;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RodizioAlunoId implements Serializable {

    private Long rodizioId;
    private Long alunoId;

    public RodizioAlunoId() {
    }

    public RodizioAlunoId(Long rodizioId, Long alunoId) {
        this.rodizioId = rodizioId;
        this.alunoId = alunoId;
    }

    public Long getRodizioId() {
        return rodizioId;
    }

    public void setRodizioId(Long rodizioId) {
        this.rodizioId = rodizioId;
    }

    public Long getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(Long alunoId) {
        this.alunoId = alunoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RodizioAlunoId)) return false;
        RodizioAlunoId that = (RodizioAlunoId) o;
        return Objects.equals(rodizioId, that.rodizioId) &&
                Objects.equals(alunoId, that.alunoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rodizioId, alunoId);
    }
}

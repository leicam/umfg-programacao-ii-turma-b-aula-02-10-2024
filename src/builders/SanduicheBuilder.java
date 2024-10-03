package builders;

import entidades.Sanduiche;

public class SanduicheBuilder {
    private Sanduiche sanduiche = new Sanduiche();

    //public SanduicheBuilder() {
    //    sanduiche = new Sanduiche();
    //}

    public SanduicheBuilder setPao(String pao){
        this.sanduiche.setPao(pao);
        return this;
    }

    public SanduicheBuilder setCarne(String carne){
        this.sanduiche.setCarne(carne);
        return this;
    }

    public SanduicheBuilder setSalada(String salada){
        this.sanduiche.setSalada(salada);
        return this;
    }

    public SanduicheBuilder setMolho(boolean temMolho){
        this.sanduiche.setTemMolho(temMolho);
        return this;
    }

    public Sanduiche build(){
        return this.sanduiche;
    }
}
package cz.vutbr.feec.utko.ttin.cviko12.sklad;

/**
 * Created by ogajduse on 4/25/17.
 */
public class Zbozi {
    private String code;
    private int cena;

    public Zbozi(String code, int cena) {
        this.code = code;
        this.cena = cena;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
}

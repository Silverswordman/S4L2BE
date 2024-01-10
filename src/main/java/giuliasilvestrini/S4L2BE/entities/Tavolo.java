package giuliasilvestrini.S4L2BE.entities;

import giuliasilvestrini.S4L2BE.entities.Enums.StatoTavolo;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor

public class Tavolo {

    private int numeroTavolo;
    private int coperti;


    private StatoTavolo statoTavolo;
    public Tavolo(int numeroTavolo, int coperti, StatoTavolo statoTavolo) {
        this.numeroTavolo = numeroTavolo;
        this.coperti = coperti;
        this.statoTavolo = statoTavolo;
    }

    @Override
    public String toString() {
        return "Tavolo{" +
                "numeroTavolo=" + numeroTavolo +
                ", coperti=" + coperti +
                ", statoTavolo=" + statoTavolo +
                '}';
    }
}
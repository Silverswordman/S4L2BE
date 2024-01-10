package giuliasilvestrini.S4L2BE.entities;

import giuliasilvestrini.S4L2BE.entities.Enums.StatoTavolo;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Tavolo {

    private int numeroTavolo;
    private int maxCoperti;

    private StatoTavolo statoTavolo;

//    public Tavolo(int numeroTavolo, int maxCoperti, StatoTavolo statoTavolo) {
//        this.numeroTavolo = numeroTavolo;
//        this.maxCoperti = maxCoperti;
//        this.statoTavolo = statoTavolo;
//    }

    @Override
    public String toString() {
        return "Tavolo{" +
                "numeroTavolo=" + numeroTavolo +
                ", coperti=" + maxCoperti +
                ", statoTavolo=" + statoTavolo +
                '}';
    }
}
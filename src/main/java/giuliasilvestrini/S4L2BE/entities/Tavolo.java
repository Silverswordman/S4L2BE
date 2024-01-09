package giuliasilvestrini.S4L2BE.entities;

import giuliasilvestrini.S4L2BE.entities.Enums.StatoTavolo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Tavolo {

    private int numeroTavolo;
    private int coperti;
    private StatoTavolo statoTavolo;
}
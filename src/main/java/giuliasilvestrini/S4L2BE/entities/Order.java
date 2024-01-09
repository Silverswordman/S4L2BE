package giuliasilvestrini.S4L2BE.entities;

import giuliasilvestrini.S4L2BE.entities.Enums.StatoOrdine;
import giuliasilvestrini.S4L2BE.entities.Enums.StatoTavolo;
import lombok.*;

import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Order {
    private int orderNumber;
    private LocalTime oraordine;
    private StatoOrdine statoOrdine;

    private Tavolo tavolo;


}

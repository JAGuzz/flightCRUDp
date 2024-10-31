package collectionsPractice;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class Tesst {

    public static void main(String[] args) {
        ZonedDateTime fechaHoraEspecifica = ZonedDateTime.of(2023, 10, 29, 15, 30, 0, 0, ZoneId.of("Europe/Madrid"));
        System.out.println("Fecha y hora específica en Madrid: " + fechaHoraEspecifica);

        OffsetDateTime fechaHoraEspecifica2 = OffsetDateTime.of(2023, 10, 29, 15, 30, 0, 0, ZoneOffset.of("-05:00"));
        System.out.println("Fecha y hora específica con offset -05:00: " + fechaHoraEspecifica2);
    }
}

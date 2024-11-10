
import java.time.*;


public class Fecha {

    public static void main(String[] args) {
        fechaLocal();
        fechaYHoraVenezuela();
        horaLocal();
        calculoDescAm();
        difHMadridCaracas();
        fechaLuna();
    }

    public static void fechaLocal() {

        LocalDate dateNow = LocalDate.now();
        System.out.println("Fecha actual en Madrid, España: " + dateNow);
    }

    public static void horaLocal() {
        LocalTime timeNow = LocalTime.now();
        System.out.println("Hora actual en Madrid, España: "+timeNow);
    }

    public static void fechaYHoraVenezuela() {
        LocalDateTime dateTimeNow = LocalDateTime.now();
        ZoneId zoneId = ZoneId.of("America/Caracas");
        LocalDate dateNow = LocalDate.now();
        ZonedDateTime zonedDateTimeOf = ZonedDateTime.of(dateTimeNow, zoneId);
        ZonedDateTime caracasDateTime = dateTimeNow.atZone(ZoneId.of("America/Caracas"));
        System.out.println("Fecha y hora actuales en Caracas, Venezuela: " + caracasDateTime);
    }

    public static void calculoDescAm() {
        LocalDate dateNow = LocalDate.now();
        LocalDate descAm = LocalDate.of(1492, 10, 12);
        int diffYears = Period.between(descAm, dateNow).getYears();
        System.out.println("América fue descubierta hace: " + diffYears + " años.");
    }

    public static void difHMadridCaracas(){
        LocalDateTime dateTimeNow = LocalDateTime.now();
        ZoneId zoneId = ZoneId.of("America/Caracas");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTimeNow, zoneId);
        long diffHours = Duration.between(dateTimeNow,zonedDateTime).getSeconds();
        System.out.println("La diferencia de horas entre ambas zonas es de: "+diffHours/3600+" horas.");
    }
    public static void fechaLuna(){
        LocalDateTime fechaLuna = LocalDateTime.of(1969, Month.JULY, 21, 3, 56);
        System.out.println("Neil Armstrong pisó la luna en: ");
    }
}



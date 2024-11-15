/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 *
 * @author crist
 *
 */
public class Program22 {

    public static void main(String[] args) throws ParseException {

        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");
        
        LocalDate pastWeekLocalDate = d01.minusDays(7);
        LocalDate nextWeekLocalDate = d01.plusDays(7);
        
        LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);
        
        Instant pastWeekIstant = d03.minus(7, ChronoUnit.DAYS);
        Instant nextWeekIstant = d03.plus(7, ChronoUnit.DAYS);

        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));

        DateTimeFormatter ftm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter ftm2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter ftm3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        Date y1 = sdf1.parse("25/06/2018");
        Date y2 = sdf2.parse("25/06/2018 15:42:07");
        
        System.out.println("y1 = " + sdf1.format(y1));
        System.out.println("y2   = " + sdf2.format(y2));

        System.out.println("d01 = " + d01.format(ftm1));
        System.out.println("d01 = " + ftm1.format(d01));
        System.out.println("d01 = " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("d02 = " + d02.format(ftm1));
        System.out.println("d02 = " + d02.format(ftm2));
        System.out.println("d03 = " + ftm3.format(d03));
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);
        
        
        System.out.println("d01 dia = " + d01.getDayOfMonth());
        System.out.println("d01 mes = " + d01.getMonthValue());
        System.out.println("d01 ano = " + d01.getYear());
        System.out.println("d02 hora = " + d02.getHour());
        System.out.println("d02 minuto  = " + d02.getMinute());
        System.out.println(" d01 -  pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("d01 - nextWeekLocalDate  = " + nextWeekLocalDate);
        System.out.println(" d02 -  pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("d02 - nextWeekLocalDateTime  = " + nextWeekLocalDateTime);
        System.out.println(" d03 -  pastWeekIstant = " + pastWeekIstant);
        System.out.println("d03 - nextWeekIstant  = " + nextWeekIstant);
        
        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, d02);
        Duration t3 = Duration.between(pastWeekIstant, d03);
        
        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
    }
}

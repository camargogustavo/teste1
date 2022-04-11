import java.time.*;


public class Main {
    public static void main(String[] args) throws Exception {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
        date = date.minusDays(today - 1); /*vai para o incio do mês*/



        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();
        System.out.println("Seg Ter Qua Qui Sex Sab Dom");
            for(int i = 1; i<value; i++) {
            System.out.print("    ");/* 4 espaços. São  */
            }
            while(date.getMonthValue() == month) {
                System.out.printf("%3d", date.getDayOfMonth());
                if (date.getDayOfMonth() == today) {
                System.out.printf("*");
            }    else {
                System.out.print(" ");
            }   
            date = date.plusDays(1);
            if(date.getDayOfWeek().getValue() == 1){
                System.out.println();
            }
            
        }
        if(date.getDayOfWeek().getValue() != 1 ){
            System.out.println();
        }
    }
}




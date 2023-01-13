public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bem vindo ao sistema de calendário!\n");

        Calendario calendario = new Calendario("Calendário 2021");

        calendario.addFeriado(new Feriado("Natal", "25/12/2023"));
        calendario.addFeriado(new Feriado("Páscoa", "17/04/2023"));
        calendario.addFeriado(new Feriado("Finados", "02/11/2023"));
        calendario.addFeriado(new Feriado("Carnaval", "21/02/2023"));
        calendario.addFeriado(new Feriado("Tiradentes", "21/04/2023"));
        calendario.addFeriado(new Feriado("Corpus Christi", "08/06/2023"));
        calendario.addFeriado(new Feriado("Dia do trabalho", "01/05/2023"));
        calendario.addFeriado(new Feriado("Independência do Brasil", "07/09/2023"));
        calendario.addFeriado(new Feriado("Nossa Senhora Aparecida", "12/10/2023"));
        calendario.addFeriado(new Feriado("Proclamação da República", "15/11/2023"));
        calendario.addFeriado(new Feriado("Confraternização mundial", "01/01/2023"));

        System.out.println("Feriados do calendário " + calendario.getNome() + ":");
        for (Feriado feriado : calendario.getFeriados()) {
            System.out.println(feriado.getNome() + " - " + feriado.getData());
        }

        System.out.println("\nFeriados do dia 01/01/2023:");
        for (Feriado feriado : calendario.getFeriados("01/01/2023")) {
            System.out.println(feriado.getNome() + " - " + feriado.getData());
        }

        System.out.println("\nFeriados do dia 25/12/2023:");
        for (Feriado feriado : calendario.getFeriados("25/12/2023")) {
            System.out.println(feriado.getNome() + " - " + feriado.getData());
        }

    }
}

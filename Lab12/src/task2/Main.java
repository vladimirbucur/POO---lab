package task2;

public class Main {
    public static void main(String[] args) {
        // Create loggers
        LoggerBase logger1 = new ConsoleLogger();
        LoggerBase logger2 = new EmailLogger();
        LoggerBase logger3 = new FileLogger();

        // Set next logger in chain
        logger1.setNext(logger3);
        logger3.setNext(logger2);

        //TODO: Add code to use loggers
        logger1.message("Se execută metoda ProcessOrder()", LogLevel.Info);
        logger1.message("Comanda a fost procesată cu succes", LogLevel.Info);
        logger1.message("Datele despre adresa clientului lipsesc din baza de date a filialei", LogLevel.Error);
        logger1.message("Detele despre adresa clientului lipsesc din baza de date a organizație", LogLevel.Error);
        logger1.message("Nu se poate procesa comanda #Comanda1 datată pe 25.11.2018 pentru clientul #Clientul1", LogLevel.FunctionalError);
        logger1.message("Comandă procesată", LogLevel.FunctionalMessage);
    }
}

import java.sql.SQLException;

public class Main {

    /* Consultas de funciones predefinidas */
    // Sakila ----------------------------------------------------------------
    private static String sakila1_1 = "SELECT COUNT(name) FROM sakila.language;";
    private static String sakila1_2 = "SELECT MIN(price) FROM sakila.film_list;";
    // World ----------------------------------------------------------------

    /* Consultas de funciones selección simples*/
    // Sakila ----------------------------------------------------------------
    private static String sakila2_1 = "SELECT * FROM sakila.customer;";
    private static String sakila2_2 = "SELECT * FROM sakila.customer where active = 1;";
    // World ----------------------------------------------------------------


    /* Consultas de funciones selección complejas*/
    // Sakila ----------------------------------------------------------------
    private static String sakila3_1 =;
    // World ----------------------------------------------------------------
    private static String world3_1 =;


    public static void main(String[] args) {
        try {

            /* Consultas de funciones predefinidas */
            System.out.println("Consultas de funciones predefinidas:");
            // Sakila 1----------------------------------------------------------------
            System.out.println("Sakila - 1:");
            System.out.println("Tiempo 1-Sakila1_1: " + MySQLHandler.consulta1Sakila(sakila1_1)[0]);
            System.out.println("Tiempo 2-Sakila1_1: " + MySQLHandler.consulta1Sakila(sakila1_1)[1]);
            System.out.println("Tiempo 3-Sakila1_1: " + MySQLHandler.consulta1Sakila(sakila1_1)[2]);
            System.out.println("Tiempo 4-Sakila1_1: " + MySQLHandler.consulta1Sakila(sakila1_1)[3]);
            // Sakila 2----------------------------------------------------------------
            System.out.println("Sakila - 2:");
            System.out.println("Tiempo 1-Sakila1_2: " + MySQLHandler.consulta1Sakila(sakila1_2)[0]);
            System.out.println("Tiempo 2-Sakila1_2: " + MySQLHandler.consulta1Sakila(sakila1_2)[1]);
            System.out.println("Tiempo 3-Sakila1_2: " + MySQLHandler.consulta1Sakila(sakila1_2)[2]);
            System.out.println("Tiempo 4-Sakila1_2: " + MySQLHandler.consulta1Sakila(sakila1_2)[3]);
            // World 1----------------------------------------------------------------
            // World 2----------------------------------------------------------------


            /* Consultas de funciones selección simples*/
            System.out.println("Consultas de funciones de selección simple:");
            // Sakila 3----------------------------------------------------------------
            System.out.println("Sakila - 3:");
            System.out.println("Tiempo 1-Sakila2_1: " + MySQLHandler.consulta1Sakila(sakila2_1)[0]);
            System.out.println("Tiempo 2-Sakila2_1: " + MySQLHandler.consulta1Sakila(sakila2_1)[1]);
            System.out.println("Tiempo 3-Sakila2_1: " + MySQLHandler.consulta1Sakila(sakila2_1)[2]);
            System.out.println("Tiempo 4-Sakila2_1: " + MySQLHandler.consulta1Sakila(sakila2_1)[3]);
            // Sakila 4----------------------------------------------------------------
            System.out.println("Sakila - 4:");
            System.out.println("Tiempo 1-Sakila2_2: " + MySQLHandler.consulta1Sakila(sakila2_2)[0]);
            System.out.println("Tiempo 2-Sakila2_2: " + MySQLHandler.consulta1Sakila(sakila2_2)[1]);
            System.out.println("Tiempo 3-Sakila2_2: " + MySQLHandler.consulta1Sakila(sakila2_2)[2]);
            System.out.println("Tiempo 4-Sakila2_2: " + MySQLHandler.consulta1Sakila(sakila2_2)[3]);

            // World 1----------------------------------------------------------------
            // World 2----------------------------------------------------------------

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

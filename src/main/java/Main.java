import java.sql.SQLException;

public class Main {

    private static final String SAKILA1_1 = "SELECT COUNT(name) FROM sakila.language;";
    private static final String SAKILA1_2 = "SELECT MIN(price) FROM sakila.film_list;";
    private static final String WORLD1_1 = "SELECT avg(percentage) FROM countrylanguage;";
    private static final String WORLD1_2 = "SELECT max(LifeExpectancy) FROM country;";
    private static final String SAKILA2_1 = "SELECT * FROM sakila.customer;";
    private static final String SAKILA2_2 = "SELECT * FROM sakila.customer where active = 1;";
    private static final String WORLD2_1 = "SELECT * from city;";
    private static final String WORLD2_2 = "SELECT * from city WHERE name LIKE 'H%';";
    private static final String SAKILA3_1 = "SELECT nicer_but_slower_film_list.title, sales_by_film_category.category, " +
            "sales_by_film_category.total_sales FROM nicer_but_slower_film_list " +
            "JOIN sales_by_film_category ON nicer_but_slower_film_list.category = sales_by_film_category.category " +
            "WHERE sales_by_film_category.total_sales < 5000 limit 20;";
    private static final String SAKILA3_2 = "SELECT title, film_id, rental_duration FROM film " +
            "WHERE film_id IN  (SELECT film_id FROM inventory WHERE store_id < 6) limit 10;";
    private static final String WORLD3_1 = "SELECT Name, Capital, population FROM country " +
            "WHERE Capital IN (SELECT ID FROM city WHERE population > 1000000);";
    private static final String WORLD3_2 = "SELECT countrylanguage.countrycode, countrylanguage.language, " +
            "countrylanguage.isofficial, country.IndepYear FROM countrylanguage JOIN country " +
            "ON countrylanguage.countrycode = country.code WHERE country.indepyear > 1980;";

    // Define array of queries
    private static final String[] QUERIES = {
            SAKILA1_1, SAKILA1_2, WORLD1_1, WORLD1_2,
            SAKILA2_1, SAKILA2_2, WORLD2_1, WORLD2_2,
            SAKILA3_1, SAKILA3_2
    };



    public static void main(String[] args) {
        try {

            /* Consultas de funciones predefinidas*/
            System.out.println("Consultas de funciones predefinidas: ");

            // SAKILA
            double[] tiempos_SAKILA1_1 = MySQLHandler.consultasSakila(SAKILA1_1);
            double media_SAKILA1_1 = Tiempos.mediaTiempoConsulta(tiempos_SAKILA1_1, SAKILA1_1);
            System.out.println("Sakila (1) - media: " + media_SAKILA1_1);

            double[] tiempos_SAKILA1_2 = MySQLHandler.consultasSakila(SAKILA1_2);
            double media_SAKILA1_2 = Tiempos.mediaTiempoConsulta(tiempos_SAKILA1_2, SAKILA1_2);
            System.out.println("Sakila (2) - media: " + media_SAKILA1_2);

            // WORLD
            double[] tiempos_WORLD1_1 = MySQLHandler.consultasWorld(WORLD1_1);
            double media_WORLD1_1 = Tiempos.mediaTiempoConsulta(tiempos_WORLD1_1, WORLD1_1);
            System.out.println("World (1) - media: " + media_WORLD1_1);

            double[] tiempos_WORLD1_2 = MySQLHandler.consultasWorld(WORLD1_2);
            double media_WORLD1_2 = Tiempos.mediaTiempoConsulta(tiempos_WORLD1_2, WORLD1_2);
            System.out.println("World (2) - media: " + media_WORLD1_2);


            /* Consultas de selección simples*/
            System.out.println("Consultas de selección simple:");

            double[] tiempos_SAKILA2_1 = MySQLHandler.consultasSakila(SAKILA2_1);
            double media_SAKILA2_1 = Tiempos.mediaTiempoConsulta(tiempos_SAKILA2_1, SAKILA2_1);
            System.out.println("Sakila (1) - media: " + media_SAKILA2_1);

            double[] tiempos_SAKILA2_2 = MySQLHandler.consultasSakila(SAKILA2_2);
            double media_SAKILA2_2 = Tiempos.mediaTiempoConsulta(tiempos_SAKILA2_2, SAKILA2_2);
            System.out.println("Sakila (2) - media: " + media_SAKILA2_2);

            double[] tiempos_WORLD2_1 = MySQLHandler.consultasWorld(WORLD2_1);
            double media_WORLD2_1 = Tiempos.mediaTiempoConsulta(tiempos_WORLD2_1, WORLD2_1);
            System.out.println("World (1) - media: " + media_WORLD2_1);

            double[] tiempos_WORLD2_2 = MySQLHandler.consultasWorld(WORLD2_2);
            double media_WORLD2_2 = Tiempos.mediaTiempoConsulta(tiempos_WORLD2_2, WORLD2_2);
            System.out.println("World (2) - media: " + media_WORLD2_2);


            /* Consultas de selección complejas*/
            System.out.println("Consultas de selección compleja:");
            double[] tiempos_SAKILA3_1 = MySQLHandler.consultasSakila(SAKILA3_1);
            double media_SAKILA3_1 = Tiempos.mediaTiempoConsulta(tiempos_SAKILA3_1, SAKILA3_1);
            System.out.println("Sakila (1) - media: " + media_SAKILA3_1);

            double[] tiempos_SAKILA3_2 = MySQLHandler.consultasSakila(SAKILA3_2);
            double media_SAKILA3_2 = Tiempos.mediaTiempoConsulta(tiempos_SAKILA3_2, SAKILA3_2);
            System.out.println("Sakila (2) - media: " + media_SAKILA3_2);

            double[] tiempos_WORLD3_1 = MySQLHandler.consultasWorld(WORLD3_1);
            double media_WORLD3_1 = Tiempos.mediaTiempoConsulta(tiempos_WORLD3_1, WORLD3_1);
            System.out.println("World (1) - media: " + media_WORLD3_1);

            double[] tiempos_WORLD3_2 = MySQLHandler.consultasWorld(WORLD3_2);
            double media_WORLD3_2 = Tiempos.mediaTiempoConsulta(tiempos_WORLD3_2, WORLD3_2);
            System.out.println("World (2) - media: " + media_WORLD3_2);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

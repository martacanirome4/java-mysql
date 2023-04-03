import java.sql.SQLException;

public class Main {

    /* Consultas de funciones predefinidas */
    // Sakila ----------------------------------------------------------------
    private static String sakila1_1 = "SELECT COUNT(name) FROM sakila.language;";
    private static String sakila1_2 = "SELECT MIN(price) FROM sakila.film_list;";
    // World ----------------------------------------------------------------
    private static String world1_1 = "SELECT avg(percentage) FROM countrylanguage;";
    private static String world1_2 = "SELECT max(LifeExpectancy) FROM country;";

    /* Consultas de funciones selección simples*/
    // Sakila ----------------------------------------------------------------
    private static String sakila2_1 = "SELECT * FROM sakila.customer;";
    private static String sakila2_2 = "SELECT * FROM sakila.customer where active = 1;";
    // World ----------------------------------------------------------------
    private static String world2_1 = "SELECT * from city;";
    private static String world2_2 = "SELECT * from city WHERE name LIKE 'H%';";


    /* Consultas de funciones selección complejas*/
    // Sakila ----------------------------------------------------------------
    private static String sakila3_1 = "SELECT nicer_but_slower_film_list.title, sales_by_film_category.category, " +
            "sales_by_film_category.total_sales FROM nicer_but_slower_film_list " +
            "JOIN sales_by_film_category ON nicer_but_slower_film_list.category = sales_by_film_category.category " +
            "WHERE sales_by_film_category.total_sales < 5000 limit 20;";
    private static String sakila3_2 = "SELECT title, film_id, rental_duration FROM film " +
            "WHERE film_id IN  (SELECT film_id FROM inventory WHERE store_id < 6) limit 10;";
    // World ----------------------------------------------------------------
    private static String world3_1 = "SELECT Name, Capital, population FROM country " +
            "WHERE Capital IN (SELECT ID FROM city WHERE population > 1000000);";
    private static String world3_2 = "SELECT countrylanguage.countrycode, countrylanguage.language, " +
            "countrylanguage.isofficial, country.IndepYear FROM countrylanguage JOIN country " +
            "ON countrylanguage.countrycode = country.code WHERE country.indepyear > 1980;";


    public static void main(String[] args) {
        try {

            /* Consultas de funciones predefinidas */
            System.out.println("Consultas de funciones predefinidas:");
            // Sakila 1----------------------------------------------------------------
            System.out.println("Sakila (1):");
            System.out.println("Tiempo 1: " + MySQLHandler.consultasSakila(sakila1_1)[0]);
            System.out.println("Tiempo 2: " + MySQLHandler.consultasSakila(sakila1_1)[1]);
            System.out.println("Tiempo 3: " + MySQLHandler.consultasSakila(sakila1_1)[2]);
            System.out.println("Tiempo 4: " + MySQLHandler.consultasSakila(sakila1_1)[3]);
            // Sakila 2----------------------------------------------------------------
            System.out.println("Sakila (2):");
            System.out.println("Tiempo 1: " + MySQLHandler.consultasSakila(sakila1_2)[0]);
            System.out.println("Tiempo 2: " + MySQLHandler.consultasSakila(sakila1_2)[1]);
            System.out.println("Tiempo 3: " + MySQLHandler.consultasSakila(sakila1_2)[2]);
            System.out.println("Tiempo 4: " + MySQLHandler.consultasSakila(sakila1_2)[3]);
            // World 1----------------------------------------------------------------
            System.out.println("World (1):");
            System.out.println("Tiempo 1: " + MySQLHandler.consultasWorld(world1_1)[0]);
            System.out.println("Tiempo 2: " + MySQLHandler.consultasWorld(world1_1)[1]);
            System.out.println("Tiempo 3: " + MySQLHandler.consultasWorld(world1_1)[2]);
            System.out.println("Tiempo 4: " + MySQLHandler.consultasWorld(world1_1)[3]);

            // World 2----------------------------------------------------------------
            System.out.println("World (2):");
            System.out.println("Tiempo 1: " + MySQLHandler.consultasWorld(world1_2)[0]);
            System.out.println("Tiempo 2: " + MySQLHandler.consultasWorld(world1_2)[1]);
            System.out.println("Tiempo 3: " + MySQLHandler.consultasWorld(world1_2)[2]);
            System.out.println("Tiempo 4: " + MySQLHandler.consultasWorld(world1_2)[3]);


            /* Consultas de funciones de selección simples*/
            System.out.println("Consultas de función de selección simple:");
            // Sakila 3----------------------------------------------------------------
            System.out.println("Sakila (1):");
            System.out.println("Tiempo 1: " + MySQLHandler.consultasSakila(sakila2_1)[0]);
            System.out.println("Tiempo 2: " + MySQLHandler.consultasSakila(sakila2_1)[1]);
            System.out.println("Tiempo 3: " + MySQLHandler.consultasSakila(sakila2_1)[2]);
            System.out.println("Tiempo 4: " + MySQLHandler.consultasSakila(sakila2_1)[3]);
            // Sakila 4----------------------------------------------------------------
            System.out.println("Sakila (2):");
            System.out.println("Tiempo 1: " + MySQLHandler.consultasSakila(sakila2_2)[0]);
            System.out.println("Tiempo 2: " + MySQLHandler.consultasSakila(sakila2_2)[1]);
            System.out.println("Tiempo 3: " + MySQLHandler.consultasSakila(sakila2_2)[2]);
            System.out.println("Tiempo 4: " + MySQLHandler.consultasSakila(sakila2_2)[3]);

            // World 3----------------------------------------------------------------
            System.out.println("World (1):");
            System.out.println("Tiempo 1: " + MySQLHandler.consultasWorld(world2_1)[0]);
            System.out.println("Tiempo 2: " + MySQLHandler.consultasWorld(world2_1)[1]);
            System.out.println("Tiempo 3: " + MySQLHandler.consultasWorld(world2_1)[2]);
            System.out.println("Tiempo 4: " + MySQLHandler.consultasWorld(world2_1)[3]);
            // World 4----------------------------------------------------------------
            System.out.println("World (2):");
            System.out.println("Tiempo 1: " + MySQLHandler.consultasWorld(world2_2)[0]);
            System.out.println("Tiempo 2: " + MySQLHandler.consultasWorld(world2_2)[1]);
            System.out.println("Tiempo 3: " + MySQLHandler.consultasWorld(world2_2)[2]);
            System.out.println("Tiempo 4: " + MySQLHandler.consultasWorld(world2_2)[3]);

            /* Consultas de funciones de selección complejas*/
            System.out.println("Consultas de función de selección compleja:");
            // Sakila 5----------------------------------------------------------------
            System.out.println("Sakila (1):");
            System.out.println("Tiempo 1: " + MySQLHandler.consultasSakila(sakila3_1)[0]);
            System.out.println("Tiempo 2: " + MySQLHandler.consultasSakila(sakila3_1)[1]);
            System.out.println("Tiempo 3: " + MySQLHandler.consultasSakila(sakila3_1)[2]);
            System.out.println("Tiempo 4: " + MySQLHandler.consultasSakila(sakila3_1)[3]);
            // Sakila 6----------------------------------------------------------------
            System.out.println("Sakila (2):");
            System.out.println("Tiempo 1: " + MySQLHandler.consultasSakila(sakila3_2)[0]);
            System.out.println("Tiempo 2: " + MySQLHandler.consultasSakila(sakila3_2)[1]);
            System.out.println("Tiempo 3: " + MySQLHandler.consultasSakila(sakila3_2)[2]);
            System.out.println("Tiempo 4: " + MySQLHandler.consultasSakila(sakila3_2)[3]);
            // World 5----------------------------------------------------------------
            System.out.println("World (1):");
            System.out.println("Tiempo 1: " + MySQLHandler.consultasWorld(world3_1)[0]);
            System.out.println("Tiempo 2: " + MySQLHandler.consultasWorld(world3_1)[1]);
            System.out.println("Tiempo 3: " + MySQLHandler.consultasWorld(world3_1)[2]);
            System.out.println("Tiempo 4: " + MySQLHandler.consultasWorld(world3_1)[3]);
            // World 6----------------------------------------------------------------
            System.out.println("World (2):");
            System.out.println("Tiempo 1: " + MySQLHandler.consultasWorld(world3_2)[0]);
            System.out.println("Tiempo 2: " + MySQLHandler.consultasWorld(world3_2)[1]);
            System.out.println("Tiempo 3: " + MySQLHandler.consultasWorld(world3_2)[2]);
            System.out.println("Tiempo 4: " + MySQLHandler.consultasWorld(world3_2)[3]);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

import java.sql.*;

public class MySQLHandler {

    // Librería de MySQL
    //public String driver = "com.mysql.jdbc.Driver";

    // Nombre de la base de datos 1 (sakila)
    private static String urlsakila = "jdbc:mysql://localhost:3306/sakila";

    // Nombre de la base de datos 2 (world)
    private static String urlworld = "jdbc:mysql://localhost:3306/world";

    // Nombre de usuario
    public static String username = "root";

    // Clave de usuario
    public static String password = "Equipo_08BBDD";

    public static double[] consultasSakila(String consulta) throws SQLException {
        Connection conexionSakila = DriverManager.getConnection(urlsakila, username, password);
        Statement statement = conexionSakila.createStatement();
        double[] consultas = Tiempos.tiemposConsultaCuatroVeces(statement, consulta);
        conexionSakila.close();
        statement.close();

        return consultas;
    }
    public static double[] consultasWorld(String consulta) throws SQLException {
        Connection conexionWorld = DriverManager.getConnection(urlworld, username, password);
        Statement statement = conexionWorld.createStatement();
        double[] consultas = Tiempos.tiemposConsultaCuatroVeces(statement, consulta);
        conexionWorld.close();
        statement.close();

        return consultas;
    }
}
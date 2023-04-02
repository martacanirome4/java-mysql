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

    static Connection con1;
    static Connection con2;
    static Statement st1;
    static Statement st2;

    public static Connection conectarMySQL() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con1 = DriverManager.getConnection(urlsakila, username, password);
            con2 = DriverManager.getConnection(urlworld, username, password);
            st1 = con1.createStatement();
            st2 = con2.createStatement();
            return con1; // devolver la conexión a sakila
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error:" + e);
            return null;
        }
    }

    public static void Consultas() {
        try (Connection conn = conectarMySQL()) {
            if (conn == null) {
                return; // no se pudo conectar, salir del método
            }

            // Consultas de selección
            String sakila1 = "SELECT *\n" + "FROM sakila.actor\n" + "LIMIT 10;";

            // Consultas sakila

            // Consultas de funciones predefinidas:
            String ct1 = "SELECT avg(amount) FROM payment";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

   /* public static ResultSet executeQuery() throws SQLException {
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        Connection connection = null;
        try {

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "Equipo_08BBDD");

            preparedStatement = connection.prepareStatement(sakila1);

            resultSet = preparedStatement.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    public static String resultadosConsulta() {
        try {
            ResultSet rs = executeQuery();
            while (rs.next()) {
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                System.out.println(firstName + " " + lastName);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static void main(String[] args) throws SQLException {
        resultadosConsulta();
    }*/
}
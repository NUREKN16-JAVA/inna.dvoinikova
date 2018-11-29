package ua.nure.kn.dvoinikova.usermanagement.db;
import java.sql.Connection;

public interface ConnectionFactory {
    /* Connection to databaseConnection to database, DatabaseException */

    Connection createConnection() throws DatabaseException;
}

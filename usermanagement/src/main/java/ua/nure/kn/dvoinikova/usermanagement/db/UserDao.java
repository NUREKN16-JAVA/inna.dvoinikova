package ua.nure.kn.dvoinikova.usermanagement.db;

import ua.nure.kn.dvoinikova.usermanagement.User;

import java.util.Collection;
import ua.nure.kn.dvoinikova.usermanagement.User;

import java.util.Collection;

public interface UserDao {
    User create(User user) throws DatabaseException;

    User find(Long id) throws DatabaseException;

    Collection<User> findAll() throws DatabaseException;


    void update(User user) throws DatabaseException;

    void delete(User user) throws DatabaseException;


    void setConnectionFactory(ConnectionFactory connectionFactory) throws DatabaseException;
}


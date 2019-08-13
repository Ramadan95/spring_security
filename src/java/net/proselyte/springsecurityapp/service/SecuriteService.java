package net.proselyte.springsecurityapp.service;

/**
 * Service for security
 *
 * @author Ramazan Kagermanov
 * @version 1.0
 */

public interface SecuriteService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);
}

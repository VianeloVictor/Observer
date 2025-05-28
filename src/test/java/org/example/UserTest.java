package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {


    @Test
    void deveNotificarUmUsuario() {
        Game game = new Game(2021, 1, "paladino", "Macabros e Trevosos");
        User user = new User("Usuario 1");
        user.entrar(game);
        game.entrarGuilda();
        assertEquals("Usuario 1, seus status são {nivel=2021, poder=1, classe='paladino', guilda='Macabros e Trevosos'}", user.getUltimaNotificacao());
    }
    @Test
    void deveNotificarUsuarios() {
        Game game = new Game(89, 6, "Necromante", "Guardião");
        User user1 = new User("Usuario 1");
        User user2 = new User("Usuario 2");
        user1.entrar(game);
        user2.entrar(game);
        game.entrarGuilda();
        assertEquals("Usuario 1, seus status são {nivel=89, poder=6, classe='Necromante', guilda='Guardião'}", user1.getUltimaNotificacao());
        assertEquals("Usuario 2, seus status são {nivel=89, poder=6, classe='Necromante', guilda='Guardião'}", user2.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarUsuario() {
        Game game = new Game(2021, 1, "paladino", "Macabros e Trevosos");
        User user = new User ("Usuario 1");
        game.entrarGuilda();
        assertEquals(null, user.getUltimaNotificacao());
    }

    @Test
    void deveNotificarAlunoGuildaEsp() {
        Game gameA = new Game (2021, 1, "paladino", "Macabros e Trevosos");
        Game gameB = new Game (2021, 1, "Necromante", "Guardiões");
        User user1 = new User ("Usuario 1");
        User user2 = new User ("Usuario 2");
        user1.entrar(gameA);
        user2.entrar(gameB);
        gameA.entrarGuilda();
        assertEquals("Usuario 1, seus status são {nivel=2021, poder=1, classe='paladino', guilda='Macabros e Trevosos'}", user1.getUltimaNotificacao());
        assertEquals(null, user2.getUltimaNotificacao());
    }
}
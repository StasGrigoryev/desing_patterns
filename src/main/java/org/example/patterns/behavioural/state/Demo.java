package org.example.patterns.behavioural.state;

import org.example.patterns.behavioural.state.ui.Player;
import org.example.patterns.behavioural.state.ui.UI;

/**
 * Демо-класс. Здесь всё сводится воедино.
 */
public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}

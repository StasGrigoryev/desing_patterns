package org.example.patterns.behavioural.mediator.components;

import org.example.patterns.behavioural.mediator.mediator.Mediator;

/**
 * Общий интерфейс компонентов.
 */
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}

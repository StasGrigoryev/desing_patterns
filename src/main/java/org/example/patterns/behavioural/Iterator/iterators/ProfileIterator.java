package org.example.patterns.behavioural.Iterator.iterators;

import org.example.patterns.behavioural.Iterator.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
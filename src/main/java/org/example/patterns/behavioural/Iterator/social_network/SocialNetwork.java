package org.example.patterns.behavioural.Iterator.social_network;

import org.example.patterns.behavioural.Iterator.iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}

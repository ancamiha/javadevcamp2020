package com.adobe.devcamp.model;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Publisher {
    public final String name;

    // elements from sets are unique
    public final Set<Domain> domains;
    public final List<User> users;
    private final List<Integer> advertisers;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publisher publisher = (Publisher) o;
        return Objects.equals(name, publisher.name) &&
                Objects.equals(domains, publisher.domains) &&
                Objects.equals(users, publisher.users) &&
                Objects.equals(advertisers, publisher.advertisers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, domains, users, advertisers);
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "name='" + name + '\'' +
                ", domains=" + domains +
                ", users=" + users +
                ", advertisers=" + advertisers +
                '}';
    }

    public String getName() {
        return name;
    }

    public Set<Domain> getDomains() {
        return domains;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Integer> getAdvertisers() {
        return advertisers;
    }

    public Publisher(String name, Set<Domain> domains, List<User> users, List<Integer> advertisers) {
        this.name = name;
        this.domains = domains;
        this.users = users;
        this.advertisers = advertisers;
    }
}

package com.ocp.day16;

import java.util.Objects;

public class Person {
    private String name;
    private Double h;
    private Double w;

    public Person() {
    }

    public Person(String name, Double h, Double w) {
        this.name = name;
        this.h = h;
        this.w = w;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + Objects.hashCode(this.h);
        hash = 79 * hash + Objects.hashCode(this.w);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.h, other.h)) {
            return false;
        }
        if (!Objects.equals(this.w, other.w)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", h=" + h + ", w=" + w + '}';
    }
    
}

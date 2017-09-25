package com.klymenko.vadym.data.bodyobjects.Curiosity;

import java.util.Objects;

public class Cameras {
    private String name;
    private String full_name;

    public Cameras() {
    }

    public Cameras(String name, String full_name) {
        this.name = name;
        this.full_name = full_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    @Override
    public String toString() {
        return "Cameras{" +
                "name='" + name + '\'' +
                ", full_name='" + full_name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cameras)) return false;
        Cameras cameras = (Cameras) o;
        return Objects.equals(name, cameras.name) &&
                Objects.equals(full_name, cameras.full_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, full_name);
    }
}

package com.klymenko.vadym.data.bodyobjects.Curiosity;

import java.util.Objects;

public class Camera {
    private Integer id;
    private String name;
    private Integer rover_id;
    private String full_name;

    public Camera() {
    }

    public Camera(Integer id, String name, Integer rover_id, String full_name) {
        this.id = id;
        this.name = name;
        this.rover_id = rover_id;
        this.full_name = full_name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRover_id() {
        return rover_id;
    }

    public void setRover_id(Integer rover_id) {
        this.rover_id = rover_id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rover_id=" + rover_id +
                ", full_name='" + full_name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Camera)) return false;
        Camera camera = (Camera) o;
        return Objects.equals(id, camera.id) &&
                Objects.equals(name, camera.name) &&
                Objects.equals(rover_id, camera.rover_id) &&
                Objects.equals(full_name, camera.full_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, rover_id, full_name);
    }
}

package com.klymenko.vadym.data.bodyobjects.Curiosity;


import java.util.Objects;

public class Photos {
    private Integer id;
    private Integer sol;
    private Camera camera;
    private String img_src;
    private String earth_date;
    private Rover rover;

    public Photos () {}

    public Photos(Integer id, Integer sol, Camera camera, String img_src, String earth_date, Rover rover) {
        this.id = id;
        this.sol = sol;
        this.camera = camera;
        this.img_src = img_src;
        this.earth_date = earth_date;
        this.rover = rover;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSol() {
        return sol;
    }

    public void setSol(Integer sol) {
        this.sol = sol;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public String getImg_src() {
        return img_src;
    }

    public void setImg_src(String img_src) {
        this.img_src = img_src;
    }

    public String getEarth_date() {
        return earth_date;
    }

    public void setEarth_date(String earth_date) {
        this.earth_date = earth_date;
    }

    public Rover getRover() {
        return rover;
    }

    public void setRover(Rover rover) {
        this.rover = rover;
    }

    @Override
    public String toString() {
        return "Photos{" +
                "id=" + id +
                ", sol=" + sol +
                ", camera=" + camera +
                ", img_src='" + img_src + '\'' +
                ", earth_date='" + earth_date + '\'' +
                ", rover=" + rover +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Photos)) return false;
        Photos photos = (Photos) o;
        return Objects.equals(id, photos.id) &&
                Objects.equals(sol, photos.sol) &&
                Objects.equals(camera, photos.camera) &&
                Objects.equals(img_src, photos.img_src) &&
                Objects.equals(earth_date, photos.earth_date) &&
                Objects.equals(rover, photos.rover);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sol, camera, img_src, earth_date, rover);
    }
}

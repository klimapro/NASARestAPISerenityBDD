package com.klymenko.vadym.data.bodyobjects.Curiosity;

import java.util.List;
import java.util.Objects;

public class Rover {
    private Integer id;
    private String name;
    private String landing_date;
    private String launch_date;
    private String status;
    private Integer max_sol;
    private String max_date;
    private Long total_photos;
    private List<Cameras> cameras;

    public Rover (){}

    public Rover(Integer id, String name, String landing_date, String launch_date, String status, Integer max_sol, String max_date, Long total_photos, List<Cameras> cameras) {
        this.id = id;
        this.name = name;
        this.landing_date = landing_date;
        this.launch_date = launch_date;
        this.status = status;
        this.max_sol = max_sol;
        this.max_date = max_date;
        this.total_photos = total_photos;
        this.cameras = cameras;
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

    public String getLanding_date() {
        return landing_date;
    }

    public void setLanding_date(String landing_date) {
        this.landing_date = landing_date;
    }

    public String getLaunch_date() {
        return launch_date;
    }

    public void setLaunch_date(String launch_date) {
        this.launch_date = launch_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getMax_sol() {
        return max_sol;
    }

    public void setMax_sol(Integer max_sol) {
        this.max_sol = max_sol;
    }

    public String getMax_date() {
        return max_date;
    }

    public void setMax_date(String max_date) {
        this.max_date = max_date;
    }

    public Long getTotal_photos() {
        return total_photos;
    }

    public void setTotal_photos(Long total_photos) {
        this.total_photos = total_photos;
    }

    public List<Cameras> getCameras() {
        return cameras;
    }

    public void setCameras(List<Cameras> cameras) {
        this.cameras = cameras;
    }

    @Override
    public String toString() {
        return "Rover{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", landing_date='" + landing_date + '\'' +
                ", launch_date='" + launch_date + '\'' +
                ", status='" + status + '\'' +
                ", max_sol=" + max_sol +
                ", max_date='" + max_date + '\'' +
                ", total_photos=" + total_photos +
                ", cameras=" + cameras +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rover)) return false;
        Rover rover = (Rover) o;
        return Objects.equals(id, rover.id) &&
                Objects.equals(name, rover.name) &&
                Objects.equals(landing_date, rover.landing_date) &&
                Objects.equals(launch_date, rover.launch_date) &&
                Objects.equals(status, rover.status) &&
                Objects.equals(max_sol, rover.max_sol) &&
                Objects.equals(max_date, rover.max_date) &&
                Objects.equals(total_photos, rover.total_photos) &&
                Objects.equals(cameras, rover.cameras);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, landing_date, launch_date, status, max_sol, max_date, total_photos, cameras);
    }
}

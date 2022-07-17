package web.models;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private String model;
    private String series;
    private int releaseYear;




    private static List<Car> listCar = new ArrayList<>();

    static {
        listCar.add(new Car("BMV", "218", 2018));
        listCar.add(new Car("Mercedes", "CL", 2020));
        listCar.add(new Car("OPEL", "ASTRA", 2017));
        listCar.add(new Car("MAZDA", "DEMIO", 2002));
        listCar.add(new Car("MAZDA", "3", 2013));
    }


    public Car(String model, String series, int releaseYear) {
        this.model = model;
        this.series = series;
        this.releaseYear = releaseYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    public static List<Car> getListCar() {
        return listCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series='" + series + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}

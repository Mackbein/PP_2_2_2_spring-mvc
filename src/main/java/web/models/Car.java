package web.models;

public class Car {

    private String model;
    private String series;
    private int releaseYear;

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

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series='" + series + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}

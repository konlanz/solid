package d.problem;

public class WeatherAggregator {
    private ApiTwo apiTwo = new ApiTwo();
    private ApiOne apiOne = new ApiOne();

    public double getTemperature() {
        return (apiTwo.getTemperatureCelcius()
                + toCelcius(
                apiOne.getTemperatureFahrenheit())) / 2;
    }

    private double toCelcius(double temperatureFahrenheit) {
        return (temperatureFahrenheit - 32) / 1.8f;
    }
}

public class TemperatureConverter {
    private double celsius;
    private double fahrenheit;
    private double kelvin;

    public double celsiusToFahrenheit(double celsius) {
        this.fahrenheit = ((celsius * 9) / 5) + 32;
        return fahrenheit;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        this.celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }

    public double celsiusToKelvin(double celsius) {
        this.kelvin = celsius + 273.15;
        return kelvin;
    }

    public double kelvinToCelsius(double kelvin) {
        this.celsius = kelvin - 273.15;
        return celsius;
    }

    public double fahrenheitToKelvin(double fahrenheit) {
        this.kelvin = (fahrenheit + 459.67) * 5/9;
        return kelvin;
    }

    public double kelvinToFahrenheit(double kelvin) {
        this.fahrenheit = (kelvin * 9 / 5) - 459.67;
        return fahrenheit;
    }
}
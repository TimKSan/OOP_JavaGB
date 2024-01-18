public class AdditionOfComplexNumbers implements ValueToString {

    private double real;
    private double imaginary;

    public AdditionOfComplexNumbers(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public AdditionOfComplexNumbers() {

    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public AdditionOfComplexNumbers add(AdditionOfComplexNumbers otherNumbers){
        double newReal = real + otherNumbers.getReal();
        double newImaginary  = imaginary + otherNumbers.getImaginary();
        return new AdditionOfComplexNumbers(newReal, newImaginary);
    }

    @Override
    public String answerToString() {
        LoggingOfResults.log(real + " + " + imaginary + "i\n");
        return real + " + " + imaginary + "i";
    }
}

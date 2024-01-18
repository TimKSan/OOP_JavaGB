import java.util.Scanner;

public class InputData {

    public void userInputData() {

        Scanner scanner = new Scanner(System.in);
        int selectedAction = 0;

        while (selectedAction != 4) {
            System.out.println("\nКакое математическое действие хотите произвести?\n");
            System.out.println("1: Сложение");
            System.out.println("2: Умножение");
            System.out.println("3: Деление");
            System.out.println("4: Выйти\n");
            selectedAction = scanner.nextInt();
            if (selectedAction == 1) {
                System.out.print(
                        "Чтобы вычислить выражение следующего вида: (a + bi) + (c + di),\nведите действительную и мнимую части первого комплексного числа\nВедите a: ");
                double real1 = scanner.nextDouble();

                System.out.print("Ведите b: ");
                double imaginary1 = scanner.nextDouble();
                AdditionOfComplexNumbers addComplex1 = new AdditionOfComplexNumbers(real1, imaginary1);

                System.out.print("ведите действительную и мнимую части второго комплексного числа\nВедите c: ");
                double real2 = scanner.nextDouble();

                System.out.print("Ведите d: ");
                double imaginary2 = scanner.nextDouble();

                AdditionOfComplexNumbers addComplex2 = new AdditionOfComplexNumbers(real2, imaginary2);
                AdditionOfComplexNumbers addComplex3 = addComplex1.add(addComplex2);
                System.out.println("Ответ: " + addComplex3.answerToString());
            } else if (selectedAction == 2) {
                System.out.print(
                        "Чтобы вычислить выражение следующего вида: (a + bi) * (c + di),\nведите действительную и мнимую части первого комплексного числа\nВедите a: ");
                double real1 = scanner.nextDouble();

                System.out.print("Ведите b: ");
                double imaginary1 = scanner.nextDouble();
                MultiplicationOfComplexNumbers multiComplex1 = new MultiplicationOfComplexNumbers(real1, imaginary1);

                System.out.print("ведите действительную и мнимую части второго комплексного числа\nВедите c: ");
                double real2 = scanner.nextDouble();

                System.out.print("Ведите d: ");
                double imaginary2 = scanner.nextDouble();

                MultiplicationOfComplexNumbers multiComplex2 = new MultiplicationOfComplexNumbers(real2, imaginary2);
                MultiplicationOfComplexNumbers multiComplex3 = multiComplex1.multiply(multiComplex2);
                System.out.println("Ответ: " + multiComplex3.answerToString());
            } else if (selectedAction == 3) {
                System.out.print(
                        "Чтобы вычислить выражение следующего вида: (a + bi) / (c + di),\nведите действительную и мнимую части первого комплексного числа\nВедите a: ");
                double real1 = scanner.nextDouble();

                System.out.print("Ведите b: ");
                double imaginary1 = scanner.nextDouble();
                DivisionOfComplexNumbers divComplex1 = new DivisionOfComplexNumbers(real1, imaginary1);

                System.out.print("ведите действительную и мнимую части второго комплексного числа\nВедите c: ");
                double real2 = scanner.nextDouble();

                System.out.print("Ведите d: ");
                double imaginary2 = scanner.nextDouble();

                DivisionOfComplexNumbers divComplex2 = new DivisionOfComplexNumbers(real2, imaginary2);
                DivisionOfComplexNumbers divComplex3 = divComplex1.div(divComplex2);
                System.out.println("Ответ: " + divComplex3.answerToString());
            }
        }
        scanner.close();
        System.out.println("Пока-пока");
    }
}

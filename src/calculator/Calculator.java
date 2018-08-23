package calculator;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
class Calculator {

    String calculate(String[] expression) {
        System.out.println(expression[0]);
        System.out.println(expression[2]);

       // int a = Integer.parseInt(expression[0]);
        //int b = Integer.parseInt(expression[2]);
        double a = Double.parseDouble(expression[0]);
        double b = Double.parseDouble(expression[2]);
        double c = Double.parseDouble(expression[2]);
        double result = 0;
        switch (expression[1]) {
            case "+":
                result = (double) (a + b);
                break;
            case "-":
                result = (double) ( a - b);
                break;
            case "/":
                result = (double) (a / b);
                break;
            case "*":
                result = (double) (a * b);
                break;
            /**            default;
                    result "ERROR";*/

        }

        return String.valueOf(result);

    }
}



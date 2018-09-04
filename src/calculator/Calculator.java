package calculator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
class Calculator {
    String calculate(String[] expresion) {
        List<String> tmp =new ArrayList<>();
        double result = Double.parseDouble(expresion[0]);
        for (int i = 1; i < expresion.length; i += 2) {
            String op = expresion[i];
            double b = Double.parseDouble(expresion[i + 1]);
            switch (op) {
                case "+":
                    result += b;
                    break;
                case "-":
                    result -= b;
                    break;
                default:
                    return "ERROR";
            }
            }
            return String.valueOf(result);
        }

    }


package by.it.Baranova.JD01_09_MathLab;

import by.it.Baranova.JD01_09_MathLab.vars.VarImpl;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by MakeAnOperation on 3/16/16.
 */
public class MakeAnOperation {

    public static VarImpl makeAnOpetation(String rLine) throws IOException {
        //Преобразование переменных в переменные типа VarImpl
        VarImpl v = null;
        switch (rLine) {
            case "printvar": {
                Print.printvar(Runner.getHashMap());
                break;
            }

            case "sortvar": {
                Print.sortvar(Runner.getTreeMap());
                break;
            }

            default: {
                String operands[] = ReadingFromConsole.Determine(rLine);

                switch (operands[2]) {
                    case "+": {
                        VarImpl a = DefineType.Define(operands[0]);
                        VarImpl b = DefineType.Define(operands[1]);
                        Runner.one(v=a.add(b));
                        break;
                    }
                    case "-": {
                        VarImpl a = DefineType.Define(operands[0]);
                        VarImpl b = DefineType.Define(operands[1]);
                        Runner.one(v=a.sub(b));
                        break;
                    }
                    case "/": {
                        VarImpl a = DefineType.Define(operands[0]);
                        VarImpl b = DefineType.Define(operands[1]);
                        Runner.one(v=a.div(b));
                        break;
                    }
                    case "*": {
                        VarImpl a = DefineType.Define(operands[0]);
                        VarImpl b = DefineType.Define(operands[1]);
                        Runner.one(v=a.mul(b));
                        break;
                    }
                    case "=": {
                        boolean toResolve = ReadingFromConsole.toResolve(operands[1]);
                        if (toResolve == true) {
                            operands[1]= ReadingFromConsole.purser(operands[1]);
                        }
                        VarImpl b = DefineType.Define(operands[1]);
                        Runner.putElement(operands[0], b);
                        Runner.putElementTree(operands[0], b);
                        break;
                    }
                }
            }
        }
        return v;
    }
}
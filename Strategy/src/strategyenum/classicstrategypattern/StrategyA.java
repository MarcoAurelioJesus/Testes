package strategyenum.classicstrategypattern;

/**
 * Created by Developer on 05/04/2015.
 */
public class StrategyA implements Strategy {
    @Override
    public void execute() {
        System.out.print("Executing strategy A");
    }
}

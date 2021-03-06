package strategyenum.enummap;


import java.util.EnumMap;

import strategyenum.enumstrategy.Strategy;

/**
 * Created by Developer on 05/04/2015.
 */
public class EnumMapExample {

    static EnumMap<Strategy, Strategy> lookupStrategy= new EnumMap<>(Strategy.class);

    {
        lookupStrategy.put(Strategy.STRATEGY_A, Strategy.STRATEGY_A);
        lookupStrategy.put(Strategy.STRATEGY_B, Strategy.STRATEGY_B);
    }

    public static void main(String[] args){
        lookupStrategy.get(Strategy.valueOf("STRATEGY_A")).execute();
        lookupStrategy.get(Strategy.valueOf("STRATEGY_B")).execute();
    }
}

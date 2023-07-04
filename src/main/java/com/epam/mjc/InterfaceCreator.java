package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return dev ->{
            List<Integer> devide= new ArrayList<>();
            for(Integer inter : dev)
                devide.add(inter/divider);
            return devide;
        };
    }
}

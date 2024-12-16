package ru.shumilin.cities.traficLights;

import java.util.List;

public class TrafficLight {
    private final Changeable changeable;

    public TrafficLight(){
        changeable = new DefaultChangeable();
    }

    public TrafficLight(Changeable changeable) {
        this.changeable = changeable;
    }


    public void next(){
        changeable.change();
    }


    private static class DefaultChangeable implements Changeable {
        private static List<String> LIGHTS = List.of("green","yellow","red");
        private int index;
        private boolean reverse;

        public void change() {
            if(index == 0 && reverse || index == LIGHTS.size()-1){
                index = 0;
                reverse = !reverse;
                if(reverse){
                    LIGHTS = LIGHTS.reversed();
                }
            }

            System.out.println(LIGHTS.get(index++));
        }
    }
}

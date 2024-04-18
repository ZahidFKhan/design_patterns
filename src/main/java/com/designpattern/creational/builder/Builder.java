package com.designpattern.creational.builder;


import lombok.NoArgsConstructor;

public class Builder {

        public static void main(String[] args) {
                final Car maruti = Car.builder().model(12).name("Maruti").build();
                final Car eon = Car.builder().model(13).name("Hyundia Eon").build();
                System.out.println(maruti);
                System.out.println(eon);
        }
}

@NoArgsConstructor
class Car {
        int model;
        String name;


        Car(Builder builder) {
                model = builder.getModel();
                name = builder.getName();
        }

        static Builder builder() {
                return new Builder();
        }

        @Override
        public String toString() {
                return " " + name + " " + model;
        }

        @NoArgsConstructor
        static class Builder {
                private int model;
                private String name;

                public int getModel() {
                        return model;
                }

                public String getName() {
                        return name;
                }

                public Builder model(int model) {
                        this.model = model;
                        return this;
                }

                public Builder name(String name) {
                        this.name = name;
                        return this;
                }

                public Car build() {
                        Car car = new Car(this);
                        return car;
                }
        }
}


package com.design_patterns.creational.factory.models;

import com.design_patterns.creational.factory.type.Computer;
import lombok.ToString;

@ToString
public class Server implements Computer {
        private String ram;
        private String hdd;
        private String processor;

        public Server(String ram, String hdd, String processor) {
                this.ram = ram;
                this.hdd = hdd;
                this.processor = processor;
        }

        @Override
        public String getRam() {
                return this.ram;
        }

        @Override
        public String getHDD() {
                return this.hdd;
        }

        @Override
        public String getProcessor() {
                return this.processor;
        }
}

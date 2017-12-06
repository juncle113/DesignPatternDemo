package com.sl.demo.singleton;

public class EnumSingleton {

    private enum MyEnum {
        enumFactory;

        private EnumSingleton enumSingleton;

        private MyEnum() {
            enumSingleton = new EnumSingleton();
        }

        public EnumSingleton getInstance() {
            return enumSingleton;
        }
    }

    public static EnumSingleton getInstance() {
        return MyEnum.enumFactory.getInstance();
    }
}
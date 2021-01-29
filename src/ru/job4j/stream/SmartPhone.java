package ru.job4j.stream;

public class SmartPhone {
    private String manufacturer;
    private String modelName;
    private String processor;
    private int sizeOfMemory;
    private String operatingSystem;
    private double sizeOfScreen;

    public static class Builder {
        private String manufacturer;
        private String modelName;
        private String processor;
        private int sizeOfMemory;
        private String operatingSystem;
        private double sizeOfScreen;

        Builder buildManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        Builder buildModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        Builder buildProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        Builder buildSizeOfMemory(int sizeOfMemory) {
            this.sizeOfMemory = sizeOfMemory;
            return this;
        }

        Builder buildOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        Builder buildSizeOfScreen(double sizeOfScreen) {
            this.sizeOfScreen = sizeOfScreen;
            return this;
        }

        SmartPhone build() {
            SmartPhone smartPhone = new SmartPhone();
            smartPhone.manufacturer = manufacturer;
            smartPhone.modelName = modelName;
            smartPhone.processor = processor;
            smartPhone.sizeOfMemory = sizeOfMemory;
            smartPhone.operatingSystem = operatingSystem;
            smartPhone.sizeOfScreen = sizeOfScreen;
            return smartPhone;
        }
    }

    @Override
    public String toString() {
        return "Builder{"
                + "manufacturer='" + manufacturer + '\''
                + ", modelName='" + modelName + '\''
                + ", processor='" + processor + '\''
                + ", sizeOfMemory=" + sizeOfMemory
                + ", operatingSystem='" + operatingSystem + '\''
                + ", sizeOfScreen=" + sizeOfScreen
                + '}';
    }

    public static void main(String[] args) {
        SmartPhone phone = new Builder().buildManufacturer("Samsung")
                .buildModelName("Galaxy 666")
                .buildSizeOfMemory(4096)
                .buildSizeOfScreen(6.3D)
                .build();
        System.out.println(phone);
    }
}

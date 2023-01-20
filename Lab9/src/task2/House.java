package task2;

import java.util.ArrayList;

public final class House {

    private final String location; // mandatory
    private final int numFloors; // mandatory
    private final int numRooms; // mandatory
    private final boolean pool; // optional
    private final boolean appliances; // optional
    private final boolean solarPanels; // optional
    private final String securityCompany; // optional

    private House(HouseBuilder builder) {
        location = builder.location;
        numFloors = builder.numFloors;
        pool = builder.pool;
        numRooms = builder.numRooms;
        appliances = builder.appliances;
        solarPanels = builder.solarPanels;
        securityCompany = builder.securityCompany;
    }

    public String getLocation() {
        return location;
    }

    public int getNumFloors() {
        return numFloors;
    }

    public int getNumRooms() {
        return numRooms;
    }

    public boolean isPool() {
        return pool;
    }

    public boolean isAppliances() {
        return appliances;
    }

    public boolean isSolarPanels() {
        return solarPanels;
    }

    public String getSecurityCompany() {
        return securityCompany;
    }


    @Override
    public String toString() {
        return "House{" +
                "location='" + location + '\'' +
                ", numFloors=" + numFloors +
                ", numRooms=" + numRooms +
                ", pool=" + pool +
                ", appliances=" + appliances +
                ", solarPanels=" + solarPanels +
                ", securityCompany='" + securityCompany + '\'' +
                '}';
    }

    static final class HouseBuilder {

        private final String location; // mandatory
        private final int numFloors; // mandatory
        private final int numRooms; // mandatory
        private boolean pool; // optional
        private boolean appliances; // optional
        private boolean solarPanels; // optional
        private String securityCompany; // optional

        public HouseBuilder(String location, int numFloors, int numRooms) {
            this.location = location;
            this.numFloors = numFloors;
            this.numRooms = numRooms;
        }

        public HouseBuilder pool(boolean pool) {
            this.pool = pool;
            return this;
        }

        public HouseBuilder appliances(boolean appliances) {
            this.appliances = appliances;
            return this;

        }

        public HouseBuilder solarPanels(boolean solarPanels) {
            this.solarPanels = solarPanels;
            return this;

        }

        public HouseBuilder securityCompany(String securityCompany) {
            this.securityCompany = securityCompany;
            return this;

        }

        public House build() {

            return new House(this);
        }

    }
}

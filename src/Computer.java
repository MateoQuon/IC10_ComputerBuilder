import java.text.NumberFormat;

public class Computer { // Outer/Enclosing class

    // Instance Variables
    private CPU mCPU;
    private RAM mRAM;
    private Storage mStorage;
    private VideoCard mVideoCard;
    private NumberFormat currency = NumberFormat.getCurrencyInstance();

    // Methods
    public CPU getCPU() {
        return mCPU;
    }

    public RAM getRAM() {
        return mRAM;
    }

    public Storage getStorage() {
        return mStorage;
    }

    public VideoCard getVideoCard() {
        return mVideoCard;
    }

    public double calculateCost(){
        // Add up all the prices of the parts.
        return mCPU.mPrice + mRAM.mPrice + mStorage.mPrice + mVideoCard.mPrice;
    }

    @Override
    public String toString() {
        return "~~~Computer Specifications~~~\n" +
                mCPU + "\n" +
                mRAM + "\n" +
                mStorage + "\n" +
                mVideoCard + "\n" +
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nTotal Cost as Configured:" +
                currency.format(calculateCost());
    }

    // Nested Inner Classes
    class CPU{
        private String mCore;
        private String mManufacturer;
        private double mPrice;
        private double mSpeed;

        public CPU(String manufacturer, String core, double speed, double price) {
            mCore = core;
            mManufacturer = manufacturer;
            mPrice = price;
            mSpeed = speed;
            mCPU = this;
        }

        @Override
        public String toString() {
            return "CPU [" +
                    mManufacturer + " " +
                    mCore + " " +
                    mSpeed + " GHz " +
                    currency.format(mPrice) + "]";

        }
    }
    class RAM {
        private String mManufacturer;
        private double mCapacity;
        private double mSpeed;
        private double mPrice;

        public RAM(String manufacturer, double capacity, double speed, double price) {
            mManufacturer = manufacturer;
            mCapacity = capacity;
            mSpeed = speed;
            mPrice = price;
            mRAM = this;
        }

        @Override
        public String toString() {
            return "RAM [" +
                    mManufacturer + " " +
                    mCapacity + " GB " +
                    mSpeed + " MHz " +
                    currency.format(mPrice) + "]";

        }
    }
    class Storage{
        private String mManufacturer;
        private String mType;
        private double mCapacity;
        private double mPrice;

        public Storage(String manufacturer, String type, double capacity, double price) {
            mManufacturer = manufacturer;
            mType = type;
            mCapacity = capacity;
            mPrice = price;
            mStorage = this;
        }

        @Override
        public String toString() {
            return "Storage [" +
                    mManufacturer + " " +
                    mCapacity + " GB " +
                    mType + " " +
                    currency.format(mPrice) + "]";
        }
    }
    class VideoCard{
        private String mManufacturer;
        private double mCapacity;
        private String mMaxRes;
        private double mPrice;

        public VideoCard(String manufacturer, double capacity, String maxRes, double price) {
            mManufacturer = manufacturer;
            mCapacity = capacity;
            mMaxRes = maxRes;
            mPrice = price;
            mVideoCard = this;
        }

        @Override
        public String toString() {
            return "VideoCard [" +
                    mManufacturer + " " +
                    mCapacity + " " +
                    mMaxRes + " pixels " +
                    currency.format(mPrice) + "]";
        }
    }

}

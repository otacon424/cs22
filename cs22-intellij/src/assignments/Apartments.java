/*
Create a class named Apartment with instance variables: apartment number, number of bedrooms, number of baths, and rent amount.
Create a constructor that accepts values for each data field. Also, create a get method for each field. Write an application that
creates at least ten Apartment objects(apartment number, number of bedrooms, number of baths, and monthly rent amount).
Then prompt the user to enter a minimum number of bedrooms required, a minimum number of baths required, and a maximum rent
the user is willing to pay. Using if...else if statements and
logical operators, display data for all the Apartment objects that meet the user's criteria or an appropriate message if no such apartments are available.
 */
package assignments;


public class Apartments {
    private int apartmentNumber;
    private int numberOfBedrooms;
    private int numberOfBaths;
    private double rentAmount;


    public Apartments(int apartmentNumber, int numberOfBedrooms, int numberOfBaths, double rentAmount) {
        this.apartmentNumber = apartmentNumber;
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfBaths = numberOfBaths;
        this.rentAmount = rentAmount;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public int getNumberOfBaths() {
        return numberOfBaths;
    }

    public void setNumberOfBaths(int numberOfBaths) {
        this.numberOfBaths = numberOfBaths;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public void setRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }

    @Override
    public String toString() {
        return "Apartments{" +
                "apartmentNumber=" + apartmentNumber +
                ", numberOfBedrooms=" + numberOfBedrooms +
                ", numberOfBaths=" + numberOfBaths +
                ", rentAmount=" + rentAmount +
                '}';
    }
}

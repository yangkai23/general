package com.parkerInc.xmlparsers.stax.dto;

public class DriversLicense {
	private int number;
	private String firstname;
	private String lastName;
	private String dateOfBirth;
	private String vehicleType;
	private String dateOfissue;
	private String expiryDate;
	private String imageLocation;
	private Address address;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getDateOfissue() {
		return dateOfissue;
	}

	public void setDateOfissue(String dateOfissue) {
		this.dateOfissue = dateOfissue;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getImageLocation() {
		return imageLocation;
	}

	public void setImageLocation(String imageLocation) {
		this.imageLocation = imageLocation;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "DriversLicense [number=" + number + ", firstname=" + firstname + ", lastName=" + lastName
				+ ", dateOfBirth=" + dateOfBirth + ", vehicleType=" + vehicleType + ", dateOfissue=" + dateOfissue
				+ ", expiryDate=" + expiryDate + ", imageLocation=" + imageLocation + ", address=" + address + "]";
	}

}

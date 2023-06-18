package Bai12;

public class HocVien {
	private String name;
	private String address;
	private long phoneNumber;
	
	public HocVien() {
	}

	public HocVien(String name, String address, long phoneNumber) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "HocVien [name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
	}
}

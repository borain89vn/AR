package com.example.passobject;

import android.os.Parcel;
import android.os.Parcelable;

public class Person implements Parcelable {
	
	private String name;
	private String address;
	public Person(){
		name= null;
		
		address = null;
		}
	public Person(Parcel in) {
		name = in.readString();
		
		address = in.readString();
		}
	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void writeToParcel(Parcel dest, int flags) {
		// TODO Auto-generated method stub
		dest.writeString(name);
		dest.writeString(address);
		
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
	public static final Parcelable.Creator<Person> CREATOR = new Parcelable.Creator<Person>() {
		

		@Override
		public Person createFromParcel(Parcel source) {
			// TODO Auto-generated method stub
			return new Person(source);
		}

		@Override
		public Person[] newArray(int size) {
			// TODO Auto-generated method stub
			return new Person[size];
		}
	};
	
}

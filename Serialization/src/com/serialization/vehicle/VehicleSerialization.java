package com.serialization.vehicle;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class VehicleSerialization {

	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle("Swift", "Maruti", 700000);
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("vehicle.ser"))) {
            oos.writeObject(v1);
            System.out.println("Single vehicle serialized successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
		
//		  Deserialize
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("vehicle.ser"))) {
            Vehicle deserialized = (Vehicle) ois.readObject();
            System.out.println("Deserialized Vehicle: " + deserialized);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        
		/*
		List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Vehicle("Creta", "Hyundai", 1500000));
        vehicles.add(new Vehicle("Innova", "Toyota", 2000000));
        vehicles.add(new Vehicle("i20", "Hyundai", 1000000));

        // Serialize list
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("vehicles.ser"))) {
            oos.writeObject(vehicles);
            System.out.println("Vehicle list serialized successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize list
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("vehicles.ser"))) {
            List<Vehicle> deserializedList = (List<Vehicle>) ois.readObject();
            System.out.println("Deserialized Vehicle List:");
            for (Vehicle v : deserializedList) {
                System.out.println(v);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        */
	}

}

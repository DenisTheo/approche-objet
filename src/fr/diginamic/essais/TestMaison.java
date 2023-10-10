package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison
{
	public static void main(String[] args)
	{
		Maison house = new Maison();

		house.ajouterPiece(new WC(3.81, 0));
		house.ajouterPiece(new Chambre(11.42, 0));
		house.ajouterPiece(new SalleDeBain(6.36, 0));
		house.ajouterPiece(new Salon(12.12, 0));
		house.ajouterPiece(new Salon(37.82, 0));
		house.ajouterPiece(new Cuisine(19.99, 0));
		house.ajouterPiece(new WC(2.89, 1));
		house.ajouterPiece(new Chambre(7.46, 1));
		house.ajouterPiece(new Chambre(9.86, 1));
		house.ajouterPiece(new Chambre(10.10, 1));
		house.ajouterPiece(new Chambre(16.15, 1));
		house.ajouterPiece(new Chambre(14.21, 1));
		house.ajouterPiece(new Salon(8.67, 1));
		house.ajouterPiece(new SalleDeBain(5.63, 1));
		house.ajouterPiece(new Salon(6.12, 0));
		house.ajouterPiece(null);
		house.ajouterPiece(new Chambre(-16.42, -1));

		System.out.println("Total Area of the House: " + house.getTotalArea());
		System.out.println("Floor 0 Area: " + house.getFloorArea(0));
		System.out.println("Floor 1 Area: " + house.getFloorArea(1));
		System.out.println("Floor 3 Area: " + house.getFloorArea(3));
		System.out.println("Total WC Area: " + house.getAreaByType(new WC(0, 0)));
		System.out.println("Total Bathroom Area: " + house.getAreaByType(new SalleDeBain(0, 0)));
		System.out.println("Total Living Room Area: " + house.getAreaByType(new Salon(0, 0)));
		System.out.println("Number of Rooms: " + house.getNumberOfRooms());
		System.out.println("Number of Bedrooms: " + house.getNumberOfRoomsByType(new Chambre(0, 0)));
		System.out.println("Number of Rooms on Floor 1: " + house.getNumberOfRoomsByFloor(1));
		
	}
}

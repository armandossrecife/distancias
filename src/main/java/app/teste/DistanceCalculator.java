package app.teste;

import java.util.*;
import java.lang.*;
import java.io.*;

class DistanceCalculator
{
	private double raio=1;
	
	public void exemplos()
	{
		System.out.println(distance(32.9697, -96.80322, 29.46786, -98.53506, "M") + " Miles\n");
		System.out.println(distance(32.9697, -96.80322, 29.46786, -98.53506, "K") + " Kilometers\n");
		System.out.println(distance(32.9697, -96.80322, 29.46786, -98.53506, "N") + " Nautical Miles\n");
		System.out.println(distance(-3.7519152,-38.572342,-3.7452509,-38.5663412, "K") + " Kilometers do Great\n");
	}

	private double distance(double lat1, double lon1, double lat2, double lon2, String unit) {
		double theta = lon1 - lon2;
		double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
		dist = Math.acos(dist);
		dist = rad2deg(dist);
		dist = dist * 60 * 1.1515;
		if (unit == "K") {
			dist = dist * 1.609344;
		} else if (unit == "N") {
			dist = dist * 0.8684;
		}

		return (dist);
	}

	/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
	/*::	This function converts decimal degrees to radians						 :*/
	/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
	private static double deg2rad(double deg) {
		return (deg * Math.PI / 180.0);
	}

	/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
	/*::	This function converts radians to decimal degrees						 :*/
	/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
	private static double rad2deg(double rad) {
		return (rad * 180 / Math.PI);
	}
	
	public double distance(double x1, double y1, double x2, double y2) {
		return this.distance(x1, y1, x2, y2, "K");	
	}
	
	public void checkUserContext(Usuario usuario, List<Local> locais) {
		for (Local local : locais) {
			double distanciaUsuarioLocal = checkDistanceFromStore(usuario, local);
			
			if (distanciaUsuarioLocal < raio) {
				System.out.println("O usuario " + usuario.getNome() + " passou perto a " + distanciaUsuarioLocal + " km do " + local.getDescricao());
			}else{
				System.out.println("O usuario " + usuario.getNome() + " passou LONGE (> 1km) a " + distanciaUsuarioLocal + " km do " + local.getDescricao());
			}
		}
	}
	
	public double checkDistanceFromStore(Usuario usuario, Local local) {
		double distancia = distance(usuario.getLatitude(), usuario.getLogintude(), local.getLatitude(), local.getLogintude()); 
		
		return distancia;
	}
}
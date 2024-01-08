package cat.itacademy.barcelonactiva.lopez.pedro.s04.extra.service;

import java.util.List;

import cat.itacademy.barcelonactiva.lopez.pedro.s04.extra.domain.Fruit;
import cat.itacademy.barcelonactiva.lopez.pedro.s04.extra.exception.FruitEmptyException;
import cat.itacademy.barcelonactiva.lopez.pedro.s04.extra.exception.FruitNoFoundException;

public interface FruitServiceInterface {
	
	public Fruit createFruit (Fruit fruit) throws FruitEmptyException;
	public void deleteFruit (int id) throws FruitNoFoundException;
	public Fruit getOneFruitById (int id) throws FruitNoFoundException;
	public List<Fruit> getAllFruits ();
}

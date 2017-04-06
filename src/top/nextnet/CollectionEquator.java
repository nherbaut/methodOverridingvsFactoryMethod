package top.nextnet;

import java.util.Collection;

import top.nextnet.MethodOverriding.Equator;
import top.nextnet.exceptions.InvalidCollectionException;
import top.nextnet.exceptions.InvalidEquatorException;

/**
 * a class that equates items of several collection. Default equator is from
 * object equals and hashCode.
 * 
 * @author nherbaut
 *
 * @param <T>
 *            the common base type for collections Items to be equated
 */
public interface CollectionEquator<T> {

	/**
	 * Add a collection to be compared by this equator
	 * 
	 * @param col
	 *            a collection for which each element will be compared with all
	 *            others collections in the CollectionEquator
	 * @return an factory method builder object
	 */
	public CollectionEquator<T> withCollection(final Collection<? super T> col) throws InvalidCollectionException;

	/**
	 * Specify which equator to be used to equate collections in this Collection
	 * Equator
	 * 
	 * @param an
	 *            equater that will be used to equates items for this collection
	 * @return an factory method builder object
	 */
	public CollectionEquator<T> withEquator(final Equator<? super T> equator) throws InvalidEquatorException;

	/**
	 * this methods loads all the collections provided to tell if all of their
	 * items are equals
	 * 
	 * @return
	 */
	public boolean areAllCollectionsEqual();

}

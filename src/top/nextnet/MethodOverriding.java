package top.nextnet;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MethodOverriding {

	public interface Equator<T> {
		public boolean equate(T o1, T o2);
	}

	/**
	 * Compare two collection to tell if their items are the same
	 * 
	 * @param a
	 *            a collection to compare
	 * @param b
	 *            another collection to compare
	 * @return true if the collections are equal
	 */
	public static <T> boolean isEqualCollection(Collection<T> a, Collection<T> b) {
		return false;
	}

	/**
	 * Compare two collection to tell if their items are the same
	 * 
	 * @param a
	 *            a collection to compare
	 * @param b
	 *            another collection to compare
	 * @param equator
	 *            the equator used to compare the two collections
	 * @return true if the collections are equal
	 */
	public static <E> boolean isEqualCollection(Collection<? extends E> a, Collection<? extends E> b,
			Equator<? super E> equator) {
		return false;
	}

}

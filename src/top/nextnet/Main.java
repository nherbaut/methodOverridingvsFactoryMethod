package top.nextnet;

import java.util.Collection;



public class Main {

	public static void main(String[] args) {
		Collection<String> col1;
		Collection<String> col2;
		Collection<String> col3;
		top.nextnet.MethodOverriding.Equator<String> equator;
		
		CollectionEquator<String> collectionEquator;
		
		//one liner factory method builder
		collectionEquator.withCollection(col1).withCollection(col2).areAllCollectionsEqual();
		//one liner factory method builder, adding equator
		collectionEquator.withCollection(col1).withCollection(col2).withCollection(col3).withEquator(equator).areAllCollectionsEqual();
		
		
		MethodOverriding.isEqualCollection(col1, col2);
		MethodOverriding.isEqualCollection(col1, col2,equator);
		
		
		
		
		
		
		
		

	}

}

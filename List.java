/**
 * This file is from the material for the course
 * CS 240: Data Structures and Algorithms
 * taught at California State Polytechnic University - Pomona, and
 * cannot be used without express written consent from the author.
 * 
 * Copyright (c) 2013 - Madhav Chhura
 * 
 * @author Madhav Chhura
 * 
 */
package edu.csupomona.cs.cs240.prog_assgmnt_1;

public interface List<K extends Comparable<K>,V> {
	
	/*@ $data ListData theList <- (* Collection of objects *); @*/
	
	/*@ $data count initially 0 <- (* The number of
	  @                               objects in the List*)
	  @*/
	
	/*@ inv 1 : $data is a collection of objects
	  @ inv 2 : Order in which objects are stored matters,
	  @         therefore, there's an implicit indexing:
	  @          i0 -> o1, i1 -> o2, ..., in -> on.
	  @ inv 3 : The list can be empty.
	  @*/
	
	/*@ behavior
	  @   pre  : value != null;
	  @   post : (* value is in the List *) &&
	  @           \post(count) == \pre(count)+1
	  @          
	  @*/
	public abstract boolean add(K key,V value);
	
	
	
	/*@ behavior
	  @   pre  : key != null
	  @   post : (* Everything that was in the List as \pre is
	  @          still in the List at \post, except for first 
	  @          occurrence of the value with the specified 
	  @          key n the user entered. And If it was not in 
	  @          the list at \pre, it's not in the list at \post*)&&
	  @          \post(count) == \pre(count) - 1 
	  @*/	
	public abstract V remove(K key);
	
	/*@ behavior
	  @   pre  : (n != null && n must be a integer)
	  @   post : (* Everything that was in the List as \pre is
	  @          still in the List at \post except for the value 
	  @          at the specified position n the user entered and 
	  @          if it wasn't in the list at \pre, it's not
	  @          in the list at \post *) && \post(count) == \pre(count) - 1 
	  @*/	
	public abstract V remove(int n);
	
	/*@ behavior
	  @   pre  : true
	  @   post : (*\post(count) == \pre(count) - 1*) &&
	  @          everything that was in the List as \pre is
	  @          still in the List at \post, except for the 
	  @          value that was at the very top of the list and
	  @          If it wasn't in the list at \pre, it's not
	  @          in the list at \post *)
	  @*/
	public abstract V remove();
	
	/*@ behavior
	  @   pre  : key != null
	  @   post : (* Everything that was in the List as \pre is
	  @          still in the List at \post and if it wasn't in
	  @          the list at \pre, it's not in the list at \post*)&&
	  @          \post(count) == \pre(count) 
	  @*/	
	public abstract V lookup(K key);
	
	/*@ behavior
	  @   pre  : key != null
	  @   post : (* Everything that was in the List as \pre is
	  @          still in the List at \post and if it wasn't in
	  @          the list at \pre, it's not in the list at \post*)&&
	  @          \post(count) == \pre(count) 
	  @*/	
	public abstract int size();
	
	/*@ behavior
	  @   pre  : (n must be a integer)
	  @   post : (* Everything that was in the List as \pre is
	  @          still in the List at \post and if it wasn't in
	  @          the list at \pre, it's not in the list at \post*)&&
	  @          \post(count) == \pre(count) 
	  @*/		
	public abstract V get(int n);
	
	/*@ behavior
	  @  pre  : true
	  @  post :  (* Everything that was in the List as \pre is
	  @          still in the List at \post and if it wasn't in
	  @          the list at \pre, it's not in the list at \post*)
	  @          && \post(count) == \pre(count) and
	  @          there now exists an array containing all the 
	  @          values that were in the list at pre.
	  @*/		
	public abstract Object[] toArray();
	

	/*@ behavior
	  @   pre  : true
	  @   post : (*\post(count) == \pre(count) - 1*) &&
	  @          everything that was in the List as \pre is
	  @          still in the List at \post and if it wasn't in
	  @          the list at \pre, it's not in the list at \post,
	  @          There now  exists an string containing a visual 
      @          representation of each value that was in the list
      @          at pre.
	  @*/
	public abstract String toString (); 
	

}

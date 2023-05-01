package com.Treeset;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;
public class Treeset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts=new TreeSet();
		System.out.println("Before Treeset: ");
		//  public boolean add(E);
		ts.add(0);
		ts.add(3);
		ts.add(2);
		System.out.println("After Treeset add: "+ts);
		ts.add(1);
		System.out.println("After modification: "+ts);
		//  public int size();
		System.out.println("Size of TreeSet is: "+ts.size());
		//  public boolean isEmpty();
		System.out.println("Treeset is Empty: "+ts.isEmpty());
		//  public boolean contains(java.lang.Object);
		Boolean r1=ts.contains(3);
		System.out.println("TreeSet contains 3: "+r1);
		//  public boolean remove(java.lang.Object);
		System.out.println("Remove 2 Tree set: "+ts.remove(2));
		System.out.println("After Removing of 2: "+ts);
		//  public void clear();
		ts.clear();
		System.out.println("After clearing Treeset: "+ts);
		//	public java.util.Iterator<E> iterator();
		TreeSet S=new TreeSet();
		S.add("Scarlett Johansson");
		S.add("Jennifer Lawrence");
		S.add("Emma Watson");
		S.add("Anne Hathaway");
		S.add("Natalie Portman");
		S.add("Emma Stone");
		S.add("Gal Gadot");
		S.add("Alexandra Daddario");
		S.add("Margot Robbie");
		S.add("Kristen Stewart");
		System.out.println("Hollywood Favourite Actress "+S);
		Iterator I=S.iterator();
		for(;I.hasNext();)
		{
			System.out.println(I.next());
		}
		//  public java.util.Iterator<E> descendingIterator();

		Iterator I1=S.descendingIterator();
		System.out.println("Desecending Order for hollywood Actress:");
		while(I1.hasNext())
		{
			System.out.println("Descending order Iterator: "+I1.next());
		}
		//  public java.util.NavigableSet<E> descendingSet();
		NavigableSet N=new TreeSet<>();
		N.add("DEEPIKA PADUKONE");
		N.add("JACQUELINE FERNANDEZ");
		N.add("KANGANA RANAUT");
		N.add("ANUSHKA SHARMA");
		N.add("SONAM KAPOOR");
		N.add("SHRADDHA KAPOOR");
		N.add("KATRINA KAIF");
		N.add("PRIYANKA CHOPRA");
		N.add("Urvashi Rautela");
		N.add("Alia Bhatt");
		N.add("Aditi Rao Hydari");
		N.add("Sara Ali Khan");
		System.out.println("Bollywood actress of Indaia: "+N);
		NavigableSet N1=N.descendingSet();
		Iterator I2=N1.iterator();
		System.out.println("DesecendingSet of Actress:");
		while(I2.hasNext())
		{
			System.out.println(I2.next());
		}
		//  public boolean addAll(java.util.Collection<? extends E>);
		
		//  public java.util.NavigableSet<E> subSet(E, boolean, E, boolean);
		System.out.println("Subset Actress: "+N.subSet("ANUSHKA SHARMA", "Urvashi Rautela"));
		//  public java.util.NavigableSet<E> headSet(E, boolean);
		System.out.println("HeadSet Actress: "+N.headSet("Sara Ali Khan"));
		//  public java.util.NavigableSet<E> tailSet(E, boolean);
		System.out.println("TailSet of Actress: "+N.tailSet("DEEPIKA PADUKONE", true));
		//  public java.util.SortedSet<E> subSet(E, E);
		System.out.println("Subset Actress: "+N.subSet("Alia Bhatt", "SHRADDHA KAPOOR"));
		//  public java.util.SortedSet<E> headSet(E);
		System.out.println("HeadSet Actress: "+N.headSet("KANGANA RANAUT"));
		//  public java.util.SortedSet<E> tailSet(E);
		System.out.println("Tailset of Actress from : "+N.tailSet("Alia Bhatt"));
		//  public java.util.Comparator<? super E> comparator();
		//  public E first();
		System.out.println("First Actress"+N.first());
		//  public E last();
		System.out.println("Last Actress"+N.last());
		//  public E lower(E);
		System.out.println("Lower Actres of Urvashi Rautela: "+N.lower("Urvashi Rautela"));
		//  public E floor(E);
		System.out.println("Floor Actres of Urvashi Rautela: "+N.floor("Aditi Rao Hydari"));
		//  public E ceiling(E);
		System.out.println("Ceiling Actres of Urvashi Rautela: "+N.ceiling("Aditi Rao Hydari"));
		//  public E higher(E);
		System.out.println("Higer Actres of Aditi Rao Hydari: "+N.higher("Aditi Rao Hydari"));
		//  public E pollFirst();
		System.out.println("Pollfirst Actres : "+N.pollFirst());
		//  public E pollLast();
		System.out.println("PollLast Actres : "+N.pollLast());
	}

}
/*
Microsoft Windows [Version 10.0.19044.1766]
(c) Microsoft Corporation. All rights reserved.

C:\Users\vinee>javap java.util.TreeSet
Compiled from "TreeSet.java"
public class java.util.TreeSet<E> extends java.util.AbstractSet<E> implements java.util.NavigableSet<E>, java.lang.Cloneable, java.io.Serializable {
  java.util.TreeSet(java.util.NavigableMap<E, java.lang.Object>);
  public java.util.TreeSet();
  public java.util.TreeSet(java.util.Comparator<? super E>);
  public java.util.TreeSet(java.util.Collection<? extends E>);
  public java.util.TreeSet(java.util.SortedSet<E>);
  public java.util.Iterator<E> iterator();
  public java.util.Iterator<E> descendingIterator();
  public java.util.NavigableSet<E> descendingSet();
  public int size();
  public boolean isEmpty();
  public boolean contains(java.lang.Object);
  public boolean add(E);
  public boolean remove(java.lang.Object);
  public void clear();
  public boolean addAll(java.util.Collection<? extends E>);
  public java.util.NavigableSet<E> subSet(E, boolean, E, boolean);
  public java.util.NavigableSet<E> headSet(E, boolean);
  public java.util.NavigableSet<E> tailSet(E, boolean);
  public java.util.SortedSet<E> subSet(E, E);
  public java.util.SortedSet<E> headSet(E);
  public java.util.SortedSet<E> tailSet(E);
  public java.util.Comparator<? super E> comparator();
  public E first();
  public E last();
  public E lower(E);
  public E floor(E);
  public E ceiling(E);
  public E higher(E);
  public E pollFirst();
  public E pollLast();
  public java.lang.Object clone();
  public java.util.Spliterator<E> spliterator();
  static {};
}

C:\Users\vinee>
*/
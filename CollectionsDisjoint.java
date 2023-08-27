package com.bean;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsDisjoint {

	public static void main(String[] args) {
		/*
		 * True if two collections does not have anything in common
		 */
		List<Integer> list1=Arrays.asList(1,2,3);
		List<Integer> list2=Arrays.asList(4,5,6);
		List<Integer> list3=Arrays.asList(6,7,8,9);
Boolean notCommon=	Collections.disjoint(list1,list2);
System.out.println(notCommon);

Boolean notCommon2=	Collections.disjoint(list2,list3);
System.out.println(notCommon2);
		    }
		
	}

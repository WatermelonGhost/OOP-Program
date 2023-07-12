package com.requirement.util;

public class MapSimul {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		
		System.out.println("map.put(\"스포티지\",\"1111\"): "+map.put("스포티지","1111"));
		System.out.println("map.put(\"아우디\",\"2222\") : "+map.put("아우디","2222"));
		System.out.println("map.put(\"벤츠\",\"1212\") : "+map.put("벤츠","1212"));
		System.out.println("map.put(\"벤츠\",\"3333\") : "+map.put("벤츠","3333"));
		System.out.println("-------------------------------------------------------------------");
		System.out.println("map.get(\"스포티지\") : "+map.get("스포티지"));
		System.out.println("map.get(\"아우디\") : "+map.get("아우디"));
		System.out.println("map.get(\"벤츠\") : "+map.get("벤츠"));
		System.out.println("-------------------------------------------------------------------");
		System.out.println("map.toString() : "+map.toString());
		System.out.println("-------------------------------------------------------------------");
		System.out.println("map.remove(\"아우디\") : "+map.remove("아우디"));
		System.out.println("-------------------------------------------------------------------");
		System.out.println("map.get(\"스포티지\") : "+map.get("스포티지"));
		System.out.println("map.get(\"아우디\") : "+map.get("아우디"));
		System.out.println("map.get(\"벤츠\") : "+map.get("벤츠"));
		System.out.println("-------------------------------------------------------------------");
		System.out.println("map.toString() : "+map.toString());
		
		java.util.ArrayList<String> list = new java.util.ArrayList<>();
	}

}

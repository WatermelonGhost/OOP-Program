package com.requirement.util;

public class MapSimul {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		
		System.out.println("map.put(\"����Ƽ��\",\"1111\"): "+map.put("����Ƽ��","1111"));
		System.out.println("map.put(\"�ƿ��\",\"2222\") : "+map.put("�ƿ��","2222"));
		System.out.println("map.put(\"����\",\"1212\") : "+map.put("����","1212"));
		System.out.println("map.put(\"����\",\"3333\") : "+map.put("����","3333"));
		System.out.println("-------------------------------------------------------------------");
		System.out.println("map.get(\"����Ƽ��\") : "+map.get("����Ƽ��"));
		System.out.println("map.get(\"�ƿ��\") : "+map.get("�ƿ��"));
		System.out.println("map.get(\"����\") : "+map.get("����"));
		System.out.println("-------------------------------------------------------------------");
		System.out.println("map.toString() : "+map.toString());
		System.out.println("-------------------------------------------------------------------");
		System.out.println("map.remove(\"�ƿ��\") : "+map.remove("�ƿ��"));
		System.out.println("-------------------------------------------------------------------");
		System.out.println("map.get(\"����Ƽ��\") : "+map.get("����Ƽ��"));
		System.out.println("map.get(\"�ƿ��\") : "+map.get("�ƿ��"));
		System.out.println("map.get(\"����\") : "+map.get("����"));
		System.out.println("-------------------------------------------------------------------");
		System.out.println("map.toString() : "+map.toString());
		
		java.util.ArrayList<String> list = new java.util.ArrayList<>();
	}

}

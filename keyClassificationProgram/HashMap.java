package com.requirement.util;

import java.util.ArrayList;

import com.java.class08.Pair;
/**
 * Generic을 사용하여 HashMap을 만들어 중고차 키 관리 프로그램으로 사용.
 * method는 put, get, remove, toString이 있다.
 * put은 차량 모델과 차량 번호를 등록하는 method. 일치하는 차량 모델이 있다면 새로 받은 차량 모델과 차량 번호를 등록하고 이전 차량 번호를 출력,일치하는 차량 모델이 없다면 새로 받은 차량 모델과 차량 번호를 등록 null을 출력.
 * get은 차량 모델을 입력하면 일치하는 차량 모델의 차량 번호를 출력하는 method. 일치하는 차량 모델이 없다면 null을 출력.
 * remove는 차량 모델을 입력하면 일치하는 차량 모델과 차량 번호를 제거하고 그 차량 번호를 출력하는 method. 일치하는 차량 모델이 없다면 null을 출력. 
 * toString은 모든 차량 모델과 차량 번호를 출력하는 method.
 * 
 *<pre> Map<String,String> map = new HashMap<>(); <pre>
 *
 * @param <K> 차량 모델
 * @param <V> 차량 번호  
 * @since 1.2
 * @see Map
 * @see HashMap
 * @see toString
 * @author JaeHyeon
 */
public class HashMap<K,V> implements Map<K,V>{
	
	ArrayList<Pair<K,V>> list = new ArrayList<>();
	
//---------------------------------------------------------------
	private class Pair<K,V>{
		private K key;
		private V value;
		
		Pair(K key,V value){
			this.key = key;
			this.value = value;
		}	
		private K getKey() {
			return this.key;
		}
		private V getValue() {
			return this.value;
		}
		private void setKey(K key) {
			this.key = key;
		}
		private void setValue(V value) {
			this.value = value;
		}
		/**
		 * 객체의 주소를 문자열로 바꾸어주는 method
		 * <pre>pair.toString();<pre>
		 */
		@Override
		public String toString() {
		return "("+this.key+" : "+this.value+")";
		}
	}
	
	
	
	
//---------------------------------------------------------------
	/**
	 * 차량 모델과 차량 번호 등록 method
	 * key는 차량 모델, value는 차량 번호.
	 * <pre>map.put(key,value);<pre>
	 * 
	 */
	@Override
	public V put(K key, V value) {
		Pair<K,V> pair = null;
		V pValue = null;
		try {
			for(int i = 0; i<list.size(); i++) {
				pair = list.get(i);
				if(pair.getKey()==key) {
					pValue = pair.getValue();
					pair.setValue(value);
					return pValue;
				}
			}
		}catch(Exception e) {
			
		}
		list.add(new Pair<K,V>(key,value));
		return pValue;
		
	}
	/**
	 * 차량 모델을 입력하여 차량 번호를 출력 method
	 * key는 차량 모델.
	 * <pre>map.get(key);<pre>
	 * 
	 */
	@Override
	public V get(K key) {
		Pair<K,V> pair = null;
		V gValue = null;
		try {
			for(int i = 0; i<list.size(); i++) {
				pair = list.get(i);
				if(pair.getKey()==key) {
					gValue = pair.getValue();
					return gValue;
				}
			}
		}catch(Exception e) {
			
		}
		return gValue;
	}
	/**
	 * 차량 모델을 입력하여 차량 모델과 차량 번호를 제거하는 method
	 * key는 차량 모델.
	 * <pre>map.remove(key);<pre>
	 * 
	 */
	@Override
	public V remove(K key) {
		Pair<K,V> pair = null;
		V rValue = null;
		try {
			for(int i = 0; i<list.size(); i++) {
				pair = list.get(i);
				if(pair.getKey()==key) {
					rValue = pair.getValue();
					list.remove(i);
					return rValue;
				}
			}
		}catch(Exception e) {
			
		}
		return rValue;
	}
	/**
	 * 모든 차량 모델과 차량 번호를 확인 하는 method
	 * <pre>map.toString();<pre>
	 */
	@Override
	public String toString() {
		return list.toString();
	}

}

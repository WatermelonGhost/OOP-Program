package com.requirement.util;

import java.util.ArrayList;

import com.java.class08.Pair;
/**
 * Generic�� ����Ͽ� HashMap�� ����� �߰��� Ű ���� ���α׷����� ���.
 * method�� put, get, remove, toString�� �ִ�.
 * put�� ���� �𵨰� ���� ��ȣ�� ����ϴ� method. ��ġ�ϴ� ���� ���� �ִٸ� ���� ���� ���� �𵨰� ���� ��ȣ�� ����ϰ� ���� ���� ��ȣ�� ���,��ġ�ϴ� ���� ���� ���ٸ� ���� ���� ���� �𵨰� ���� ��ȣ�� ��� null�� ���.
 * get�� ���� ���� �Է��ϸ� ��ġ�ϴ� ���� ���� ���� ��ȣ�� ����ϴ� method. ��ġ�ϴ� ���� ���� ���ٸ� null�� ���.
 * remove�� ���� ���� �Է��ϸ� ��ġ�ϴ� ���� �𵨰� ���� ��ȣ�� �����ϰ� �� ���� ��ȣ�� ����ϴ� method. ��ġ�ϴ� ���� ���� ���ٸ� null�� ���. 
 * toString�� ��� ���� �𵨰� ���� ��ȣ�� ����ϴ� method.
 * 
 *<pre> Map<String,String> map = new HashMap<>(); <pre>
 *
 * @param <K> ���� ��
 * @param <V> ���� ��ȣ  
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
		 * ��ü�� �ּҸ� ���ڿ��� �ٲپ��ִ� method
		 * <pre>pair.toString();<pre>
		 */
		@Override
		public String toString() {
		return "("+this.key+" : "+this.value+")";
		}
	}
	
	
	
	
//---------------------------------------------------------------
	/**
	 * ���� �𵨰� ���� ��ȣ ��� method
	 * key�� ���� ��, value�� ���� ��ȣ.
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
	 * ���� ���� �Է��Ͽ� ���� ��ȣ�� ��� method
	 * key�� ���� ��.
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
	 * ���� ���� �Է��Ͽ� ���� �𵨰� ���� ��ȣ�� �����ϴ� method
	 * key�� ���� ��.
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
	 * ��� ���� �𵨰� ���� ��ȣ�� Ȯ�� �ϴ� method
	 * <pre>map.toString();<pre>
	 */
	@Override
	public String toString() {
		return list.toString();
	}

}

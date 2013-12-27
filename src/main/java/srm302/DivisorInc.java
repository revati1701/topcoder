package main.java.srm302;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/*
 * SRM 302 DIV I Level 1, DIV II Level 3
 * http://community.topcoder.com/stat?c=problem_statement&pm=6186
 */
public class DivisorInc {
	private LinkedList<Element> _queue = new LinkedList<Element>();
	private Set<Element> _set = new HashSet<Element>();
	
	private class Element {
		private Integer _value;
		private Integer _steps;
		
		private Element(int value, int steps) {
			_value = value;
			_steps = steps;
		}
		
		@Override
		public boolean equals(Object o) {
			if (!(o instanceof Element)) {
				return false;
			}
			Element element = (Element) o;
			return this._value.equals(element._value);
		}
		
		@Override
		public int hashCode() {
			return _value.hashCode();
		}
	}
	
	public int countOperations(int N, int M) {
		_queue.add(new Element(N, 0));
		while(!_queue.isEmpty()) {
			Element first = _queue.removeFirst();
		//	System.out.println(first._value);
			if (first._value.equals(M)) {
				return first._steps;
			}
			
			for(int i = 2; i < first._value.intValue(); i++) {
				if (first._value.intValue() + i > M) {
					break;
				}
				if (first._value.intValue() % i == 0) {
					Element e = new Element(first._value + i, first._steps + 1);
					if(!_set.contains(e)) {
						_set.add(e);
						_queue.add(e);
					}
				}
			}
		}
		return -1;
	}
}

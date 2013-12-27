package main.java.srm145;

import java.util.TreeMap;

/*
 * SRM 145 DIV I Level 2, DIV II Level 3
 * http://community.topcoder.com/stat?c=problem_statement&pm=1130
 */
public class VendingMachine {
	TreeMap<ColumnInfo, Integer> _columnInfoByColumnIndex = new TreeMap<ColumnInfo, Integer>();
	private int _numColumns;
	
	//Comparator v/s comparable
	public class ColumnInfo implements Comparable<ColumnInfo> {
		private int _columnIndex;
		private int _columnPrice;
		
		public ColumnInfo(int index, int price) {
			_columnIndex = index;
			_columnPrice = price;
		}
		
		public int getColumnIndex() {
			return _columnIndex;
		}
		public void setColumnIndex(int columnIndex) {
			_columnIndex = columnIndex;
		}
		public int getColumnPrice() {
			return _columnPrice;
		}
		public void setColumnPrice(int columnPrice) {
			_columnPrice = columnPrice;
		}
		
		@Override
		public boolean equals(Object o) {
			if (!(o instanceof ColumnInfo)) {
				return false;
			}
			ColumnInfo obj = (ColumnInfo) o;
			if (this._columnIndex == obj._columnIndex) {
				return true;
			}
			return false;
		}

		@Override
		public int compareTo(ColumnInfo o) {
			if (this.getColumnPrice() == o.getColumnPrice()) {
				//Interesting thing to note that java 1.5+ you can pass int to comapreTo
				return Integer.valueOf(this.getColumnIndex()).compareTo(o.getColumnIndex());
			} else {
				//Good example to get descending order, reverse compare to instead of * -1;
				return Integer.valueOf(o.getColumnPrice()).compareTo(this.getColumnPrice());
			}
		}
	}
	public int motorUse(String[] prices, String[] purchases) {
		setColumnLength(prices[0]);
		processIntoSortedMap(prices);
		int mostExpensive = _columnInfoByColumnIndex.firstKey().getColumnIndex();
		int prevTime = 0;
		int prevCol = mostExpensive;
		int count = minimumRotations(0, mostExpensive);
		System.out.println("Initial" + count);
		for(int i = 0; i < purchases.length; i++) {
			String[] line = purchases[i].split("[,:]");
			int nextRow = Integer.valueOf(line[0]);
			int nextCol = Integer.valueOf(line[1]);
			int nextTime = Integer.valueOf(line[2]);
			
			if (doRotation(prevTime, nextTime)) {
				mostExpensive = _columnInfoByColumnIndex.firstKey().getColumnIndex();
				count = count + minimumRotations(prevCol, mostExpensive);
				System.out.println("InterMediate to expensiv" + count);
				count = count + minimumRotations(mostExpensive, nextCol);
				System.out.println("InterMediate to expensiv" + count);
			} else {
				count = count + minimumRotations(prevCol, nextCol);
				System.out.println("without rotation" + count);
			}
			processPurchase(nextCol, getPrice(nextCol, prices[nextRow]));
			prevTime = nextTime;
			prevCol = nextCol;
			
		}
		mostExpensive = _columnInfoByColumnIndex.firstKey().getColumnIndex();
		count = count + minimumRotations(prevCol, mostExpensive);
		System.out.println("Last" + count);
		return count;
	}
	
	private void setColumnLength(String price) {
		_numColumns = price.split(" ").length;
	}
	
	private void processIntoSortedMap(String[] prices) {
		//Why not initialize it to zeroes?
		int[] totalPrice = new int[_numColumns];
		
		for(String price : prices) {
			String[] row = price.split(" ");
			for(int i = 0; i < row.length; i++) {
				totalPrice[i] = totalPrice[i] + Integer.parseInt(row[i]);
			}
		}
			
		for(int i = 0; i < totalPrice.length; i++) {
			_columnInfoByColumnIndex.put(new ColumnInfo(i, totalPrice[i]), Integer.valueOf(i));
		}
	}
	
	private int minimumRotations(int curr, int next) {
		int lastElementIndex = _numColumns - 1;
		int diffByStraight = Math.abs(curr - next);
		int diffByCircular = 0;
		if (curr > next) {
			diffByCircular = Math.abs(lastElementIndex - curr) + 1 + next;
		} else {
			diffByCircular = curr + 1 + Math.abs(lastElementIndex - next);
		}
		if (diffByStraight < diffByCircular) {
			return diffByStraight;
		} else {
			return diffByCircular;
		}
	}
	
	private boolean doRotation(int prevTime, int currTime) {
		if (currTime - prevTime >= 5) {
			return true;
		} else {
			return false;
		}
	}
	
	private int getPrice(int col, String priceRow) {
		String[] prices = priceRow.split(" ");
		return Integer.valueOf(prices[col]);
	}
	
	private void processPurchase(int col, int price) {
		//This will trigger ConcurrentModificationException
		/*for(ColumnInfo columnInfo : _columnInfoByColumnIndex.keySet()) {
			if (columnInfo.getColumnIndex() == col) {
			_columnInfoByColumnIndex.put(new ColumnInfo(col, columnInfo.getColumnPrice() - price), col);
			}
		}*/
		
		int currPrice = 0;
		ColumnInfo tobeRemoved = null;
		for(ColumnInfo columnInfo : _columnInfoByColumnIndex.keySet()) {
			//Should I use autoboxing feature;
			if (columnInfo.getColumnIndex() == col) {
				currPrice = columnInfo.getColumnPrice();
				tobeRemoved = columnInfo;
			}
		}
		//System.out.println("Price diff" + (currPrice - price));
		_columnInfoByColumnIndex.remove(tobeRemoved);
		//Need to remove before out....need better implementation
		_columnInfoByColumnIndex.put(new ColumnInfo(col, currPrice - price), col);
		
		System.out.println("Processing done");
	}
}

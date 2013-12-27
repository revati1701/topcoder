package main.java.srm154;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/*
 * SRM 154 DIV I Level 2, DIV II Level 3
 * http://community.topcoder.com/stat?c=problem_statement&pm=1760
 */
public class ContestScore {
	private Map<String, GroupMetadata> _metaDataByGroup;
	
	private int _numAreas;
	
	private class GroupMetadata {
		private String _name;
		
		private Float[] _scores;
		
		private Integer[] _ranks;
	}
	
	public String[] sortResults(String[] data) {
		if (data == null || data.length == 0) {
			return new String[0];
		}
		_metaDataByGroup = new HashMap<String, GroupMetadata>();
		//TODO: improve it
		_numAreas = data[0].split(" ").length - 1; 
		populateGroupMetadataScores(data);
		computeRanks();
		GroupMetadata[] groupArray = sortGroups();
		return formatArray(groupArray);
	}
	
	private void computeRanks() {
		//TODO: Forced to declare TreeMap
		TreeMap<Float, String> groupByScoreForArea = new TreeMap<Float, String>();	
		for(int areaIndex = 0; areaIndex  < _numAreas; areaIndex++) {
			groupByScoreForArea.clear();
			for(Entry<String, GroupMetadata> entry : _metaDataByGroup.entrySet()) {
				groupByScoreForArea.put(entry.getValue()._scores[areaIndex], entry.getKey());
			}
			Float prevScore = 0.0f;
			int rank = 0;
			
			while(!groupByScoreForArea.isEmpty()) {
				Entry<Float, String> scoreBygroupEntry = groupByScoreForArea.pollLastEntry();
				Float  score = scoreBygroupEntry.getKey();
				if (!score.equals(prevScore)) {
					rank++;
				}
				GroupMetadata metaData = _metaDataByGroup.get(scoreBygroupEntry.getValue());
				
				metaData._ranks[areaIndex] = rank;
				prevScore = score;
			}
		}
	}
	
	private String[] formatArray(GroupMetadata[] groupArray) {
		NumberFormat format =  DecimalFormat.getInstance();
		format.setMaximumFractionDigits(1);
		format.setMinimumFractionDigits(1);
		
		String[] result = new String[groupArray.length];
		for(int i = 0; i < groupArray.length; i++) {
			result[i] = groupArray[i]._name + " " + sumRanks(groupArray[i]._ranks) + " " + format.format(sumScores(groupArray[i]._scores));	
		}
		return result;
	}
	
	private int sumRanks(Integer[] ranks) {
		int sum = 0;
		for(int i = 0; i < ranks.length; i++) {
			sum = sum + ranks[i];
		}
		return sum;
	}
	
	private float sumScores(Float[] scores) {
		float sum = 0.0f;
		for(int i = 0; i < scores.length; i++) {
			sum = sum + scores[i];
		}
		return sum;
	}
	
	private GroupMetadata[] sortGroups() {
		GroupMetadata[] groupArray = _metaDataByGroup.values().toArray(new GroupMetadata[0]);
		Arrays.sort(groupArray, new SortByRank());
		return groupArray;
	}
	
	private class SortByRank implements Comparator<GroupMetadata> {
		@Override
		public int compare(GroupMetadata o1, GroupMetadata o2) {
			// TODO Auto-generated method stub
			Integer totalRanksGroup1 = 0;
			Integer totalRanksGroup2 = 0;
			//call sumRanks
			for(int i = 0; i < _numAreas; i++) {
				 totalRanksGroup1 =  totalRanksGroup1 + o1._ranks[i];
				 totalRanksGroup2 =  totalRanksGroup2 + o2._ranks[i];
				
			}
			if (!totalRanksGroup1.equals(totalRanksGroup2)) {
				return totalRanksGroup1.compareTo(totalRanksGroup2);
			}
			Float totalScores1 = 0.0f;
			Float totalScores2 = 0.0f;
			//call sumScores
			for(int i = 0; i < _numAreas; i++) {
				totalScores1 =  totalScores1 + o1._scores[i];
				totalScores2 =  totalScores2 + o2._scores[i];
				
			}
			if (!totalRanksGroup1.equals(totalRanksGroup2)) {
				return totalScores1.compareTo(totalScores2);
			}
			return o1._name.compareTo(o2._name);
		}
		
	}
	
	private void populateGroupMetadataScores(String[] data) {
		for(int i = 0; i < data.length; i++) {
			String[] groupArray= data[i].split(" ");
			GroupMetadata group = new GroupMetadata();
			setGroupMetadata(group, groupArray);
			_metaDataByGroup.put(groupArray[0], group);
		} 
	}
	
	//TODO: create groupmetadata outside?
	private void setGroupMetadata(GroupMetadata group, String[] groupArray) {
		group._name = groupArray[0];
		Float[] scores = new Float[groupArray.length - 1];
		Integer[] ranks = new Integer[groupArray.length - 1];
		for(int i = 1; i < groupArray.length; i++) {
			scores[i - 1] = Float.valueOf(groupArray[i]);
		}
		group._scores = scores;
		group._ranks = ranks;
	}	
}

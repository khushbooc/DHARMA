package model.stats;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import model.stats.Stat;

public abstract class DerivedStat extends Observable implements Stat, Observer {

	protected List<Stat> stats;
	protected int value;
	
	public DerivedStat() {
		this.stats = new ArrayList<Stat>();
	}
	
	public int getValue() {
		return this.value;
	}
	
	public void updateValue(Stat stat,int value){
		
	
	}
}

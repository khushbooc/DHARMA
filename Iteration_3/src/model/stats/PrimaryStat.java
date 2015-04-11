package model.stats;

import java.util.Observable;

public abstract class PrimaryStat extends Observable implements Stat{

		protected int value;
		
		public PrimaryStat(int value) {
			this.value = value;
		}
		
		public int getValue() {
			return this.value;
		}
		
		public void setValue(int value) {
			this.value=value;
		}
		
	}



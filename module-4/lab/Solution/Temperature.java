/*
 	CSCI 2
 	3/5/2020

	*/
	
	ub lic class Temper

		private float temp;

	
	public Temperature(){
		temp = 0;

		scale = 'C';

	} 

			public Temperature(float _temp, char _scale) {
		setTempAndScale(_temp,
	 

	 

		if (_temp >= -200 && _temp <= 200) temp = _

		else temp = 0;
	}

	public void setScale(char _scale) {
		if (_scale == 'F') scale = 'F';
		else scale = 'C';
	}

	public void setTempAndS

		setScale(_scale);
	}

	public float getCelsius() {
		if (scale == 'C') return temp;
		else return 5 * (temp - 32) / 9;
	}

	public float getFarenheit() {
		if  (scale == 'F') return te

	} 

	// I know you didn't ask for this one, but it's helpful for testing.
	// And could also be helpful so the user can tell what value is actually stored.
	public char getScale() {
		return scale;
	}

	public boolean equals(Temperature t) {
		if (this.getCelsius() == t.getCelsius()) return true;
		else return false;
	}


	if ( lse if (this.geClsiu

	} 

	pu blic String toString() {

	}

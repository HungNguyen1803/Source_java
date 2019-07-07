package comunity.com.model;

public class Worker {
	private String mHo;
	private String mten;
	private int mSoSP;

	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Worker(String mHo,String mten,int msoSp) {
		this.mHo = mHo;
		this.mten = mten;
		if(msoSp < 0)
			this.mSoSP = 0;
		else
			this.mSoSP = msoSp;
	}

	public String getmHo() {
		return mHo;
	}

	public void setmHo(String mHo) {
		this.mHo = mHo;
	}

	public String getMten() {
		return mten;
	}

	public void setMten(String mten) {
		this.mten = mten;
	}

	public int getmSoSP() {
		return mSoSP;
	}

	public void setmSoSP(int mSoSP) {
		this.mSoSP = mSoSP;
	}
	
	public boolean compareW(Worker worker) {
		if(this.getmSoSP() > worker.getmSoSP())
			return true;
		else
			return false;
	}
	
	public double getSalary(int product) {
		double result = 0;
		if(product >=1 && product <= 199)
			return product*0.5;
		else if(product <= 399)
			return product*0.55;
		else if(product <= 599)
			return product*0.6;
		else
			return product*0.65;
	}

}

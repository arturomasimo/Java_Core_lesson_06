package lession6;

public class WorketAtRate extends Worker implements Salary{
	private int coutOfBaseDays;
	private int workerDays;
	private float costAtMounth;
	private float premia; //1-100

	public WorketAtRate(String pib, String posada, int coutOfBaseDays, int workerDays, float costAtMounth,
			float premia) {
		super(pib, posada);
		this.coutOfBaseDays = coutOfBaseDays;
		this.workerDays = workerDays;
		this.costAtMounth = costAtMounth;
		this.premia = premia;
	}

	@Override
	public float calculation() {
		return workerDays/coutOfBaseDays*costAtMounth+costAtMounth*premia/100;
	}
	@Override
	public String toString() {
		return super.toString() + "" + workerDays+ "/"+coutOfBaseDays + "*"+costAtMounth+ " + premia " + premia+ "%]";
	}

}

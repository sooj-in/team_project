package AliveAuction;

public class CreditVO {

	private String id;
	private int score;
	private String evaluator;

	public CreditVO(String id, int score, String evaluator) {

		this.id = id;
		this.score = score;
		this.evaluator = evaluator;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getEvaluator() {
		return evaluator;
	}

	public void setEvaluator(String evaluator) {
		this.evaluator = evaluator;
	}

}

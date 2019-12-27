package lab10_BSTs.prog10_2_rational;

import java.util.Objects;

public class Rational {

	private int p;
	private int q;

	public Rational(int p, int q) {
		this.p = p;
		this.q = q;
		if (q <= 0)
			System.err.println("q is not positive");
		return;
		
	}

	public Rational add(Rational rat) {
		Rational result = new Rational(1, 1);
		int num = this.p * rat.q + rat.p * this.q;
		int denom = this.q * rat.q;
		result.setP(num);
		result.setQ(denom);
		return result;
	}

	// multiplies rat by this Rational
	public Rational multiply(Rational rat) {
		Rational result = new Rational(1, 1);
		int num = this.p * rat.p;
		int denom = this.q * rat.q;
		result.setP(num);
		result.setQ(denom);
		return result;

	}

	// returns -1 if this rational is less than rat
	// returns 0 if this rational equals (see equals
	// method discussion below) rat
	// returns 1 if this rational is greater than rat
	public int compareTo(Rational rat) {
		if (this.p * rat.p < this.q * rat.q)
			return -1;
		if (this.equals(rat))
			return 0;
		if (this.p * rat.p > this.q * rat.q)
			return 1;
		return 0;

	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rational rat = (Rational) obj;
		return (this.p * this.q == rat.p * rat.q);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(p, q);
	}
	
	@Override
	public String toString() {
		return p + "/" + q;
	}

	public int getP() {
		return p;
	}

	public void setP(int p) {
		this.p = p;
	}

	public int getQ() {
		return q;
	}

	public void setQ(int q) {
		this.q = q;
	}

}

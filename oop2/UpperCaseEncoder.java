package rs.ac.ni.pmf.oop2;

public class UpperCaseEncoder implements Encoder
{
	@Override
	public String encode(final String input)
	{
		return input.toUpperCase();
	}
}
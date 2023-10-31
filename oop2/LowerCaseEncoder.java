package rs.ac.ni.pmf.oop2;

public class LowerCaseEncoder implements Encoder
{
	@Override
	public String encode(final String input)
	{
		return input.toLowerCase();
	}
}

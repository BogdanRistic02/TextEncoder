package rs.ac.ni.pmf.oop2;

public class ParserMain
{
	public static void main(String[] args)
	{
		TextParser textParser = new TextParser();
		textParser.setEncoder(new UpperCaseEncoder());

		textParser.parse("    avafadogjoidfv  fgkdfopgfdp    ");
		String parsed = textParser.getParsedString();

		textParser.store(parsed, new DatabaseStorage());

		textParser.setEncoder(new LowerCaseEncoder());
		textParser.parse("SHUIHASCUI IUDHIWOSDI AA  ASX ");

		String parsed_2 = textParser.getParsedString();
		textParser.store(parsed_2, new FileStorage());
	}
}
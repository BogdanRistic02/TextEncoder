package rs.ac.ni.pmf.oop2;

public class TextParser
{
	Encoder _encoder;
	String parsed;

	public void setEncoder(Encoder encoder)
	{
		_encoder = encoder;
	}

	public void parse(String text)
	{
		String trimmed = text.trim();
		String encoded = _encoder.encode(trimmed);
		parsed = encoded;
	}

	public final String getParsedString() {
		return parsed;
	}

	public void store(String encoded, Storage storage) {
		storage.store(encoded);
	}
}
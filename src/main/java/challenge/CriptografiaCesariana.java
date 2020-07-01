package challenge;

public class CriptografiaCesariana implements Criptografia {

	@Override
	public String criptografar(String texto) {
		if (texto.equals(null))
			throw new NullPointerException();
		else if (texto.isEmpty())
			throw new IllegalArgumentException();

		String crip = "";
		texto = texto.toLowerCase();
		for (int i = 0; i < texto.length(); i++) {

			char c = texto.charAt(i);

			if (c >= 'a' && c <= 'z')
				if ((int) c + 3 > 'z')
					crip += (char) (c - 23);
				else
					crip += (char) (c + 3);
			else
				crip += c;

		}
		return crip;
	}

	@Override
	public String descriptografar(String texto) {

		if (texto.equals(null))
			throw new NullPointerException();
		else if (texto.isEmpty())
			throw new IllegalArgumentException();

		String decrip = "";
		texto = texto.toLowerCase();
		for (int i = 0; i < texto.length(); i++) {

			char c = texto.charAt(i) - 3;

			if (c >= 'a' && c <= 'z')
				if ((int) c - 3 < 97)
					decrip = decrip + (char) (c + 23);
				else
					decrip += (char) (c - 3);
			else
				decrip += c;

		}

		return decrip;

	}

}
class CurrencyConverter {

	double convert(double inr, String currency) {
        if(currency.equalsIgnoreCase("USD")) {
            return inr * 0.012;
        }
		return inr;
	}

    double convert(double inr, String currency, boolean isEuro) {
        if(currency.equalsIgnoreCase("EUR") && isEuro) {
            return inr * 0.011;
        }
		return inr;
    }
    
}
class Currencies {
	public static void main(String[] args) {
		CurrencyConverter cc = new CurrencyConverter();
		System.out.println(cc.convert(60, "USD"));
		System.out.println(cc.convert(100, "EUR"));
	}
}
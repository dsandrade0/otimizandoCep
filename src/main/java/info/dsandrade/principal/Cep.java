package info.dsandrade.principal;

import java.math.BigDecimal;

public class Cep {

    public boolean validaIntervaloCep(String CepDe, String CepAte, String CepAvaliado) {
        BigDecimal numeroDe = new BigDecimal("1." + CepDe.replaceAll("-", "").replaceAll("\\.", ""));
        BigDecimal numeroAte = new BigDecimal("1." + CepAte.replaceAll("-", "").replaceAll("\\.", ""));
        BigDecimal numeroAvaliado = new BigDecimal("1." + CepAvaliado.replaceAll("-", "").replaceAll("\\.", ""));

        return numeroAvaliado.compareTo(numeroDe) >= 0
                && numeroAvaliado.compareTo(numeroAte) <= 0;
    }
}

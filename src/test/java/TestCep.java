import info.dsandrade.principal.Cep;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestCep {

    private Cep cep = new Cep();

    private String cepDe = "49030-100";
    private String cepAte = "49030-200";

    @Test
    public void testaCepAbaixoDoRange() {
        boolean resultado = cep.validaIntervaloCep(cepDe, cepAte, "49030-099");
        assertFalse(resultado);
    }

    @Test
    public void testaCepAcimaDoRange() {
        boolean resultado = cep.validaIntervaloCep(cepDe, cepAte, "49030-201");
        assertFalse(resultado);
    }

    @Test
    public void testaCepNoLimiteInferiorDoRange() {
        boolean resultado = cep.validaIntervaloCep(cepDe, cepAte, "49030-100");
        assertTrue(resultado);
    }

    @Test
    public void testaCepNoLimiteSuperiorDoRange() {
        boolean resultado = cep.validaIntervaloCep(cepDe, cepAte, "49030-200");
        assertTrue(resultado);
    }

    @Test
    public void testaCepEntreRange() {
        boolean resultado = cep.validaIntervaloCep(cepDe, cepAte, "49030-120");
        assertTrue(resultado);
    }
}

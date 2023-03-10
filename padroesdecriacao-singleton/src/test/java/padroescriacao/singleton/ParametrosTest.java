package padroescriacao.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParametrosTest {

    @Test
    public void deveRetornarNomeFarmaciaGarcia() {
        Parametros.getInstance().setNomeFarmacia("Farmacia Garcia");
        assertEquals("Farmacia Garcia", Parametros.getInstance().getNomeFarmacia());
    }

    @Test
    public void deveRetornarNomeFarmaciaPaulista() {
        Parametros.getInstance().setNomeFarmacia("Farmacia Paulista");
        assertEquals("Farmacia Paulista", Parametros.getInstance().getNomeFarmacia());
    }

    @Test
    public void deveRetornarUsuarioLogado() {
        Parametros.getInstance().setUsuarioLogado("Usuario 1");
        assertEquals("Usuario 1", Parametros.getInstance().getUsuarioLogado());
    }

}
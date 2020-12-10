
import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class TestEjercicio4 {
    @Test
    public void test1() {
        assertThat(Ejercicio4.nextEdge(5, 4), is(8));
    }

    @Test
    public void test2() {
        assertThat(Ejercicio4.nextEdge(8, 3), is(10));
    }

    @Test
    public void test3() {
        assertThat(Ejercicio4.nextEdge(7, 9), is(15));
    }

    @Test
    public void test4() {
        assertThat(Ejercicio4.nextEdge(10, 4), is(13));
    }

    @Test
    public void test5() {
        assertThat(Ejercicio4.nextEdge(7, 2), is(8));
    }
}

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class SumOfMultiplesTest {

    @Test
    public void shouldReturn23() {

        // given
        SumOfMultiples sumOfMultiples = new SumOfMultiples();
        int belowNumbers = 10;

        // when
        int result = sumOfMultiples.sumOfMultiples3and5(belowNumbers);

        // then
        Assert.assertThat(result, CoreMatchers.is(23));
    }

    @Test
    public void shouldReturn2318() {

        // given
        SumOfMultiples sumOfMultiples = new SumOfMultiples();
        int belowNumbers = 100;

        // when
        int result = sumOfMultiples.sumOfMultiples3and5(belowNumbers);

        // then
        Assert.assertThat(result, CoreMatchers.is(2318));
    }

    @Test
    public void shouldReturn233168() {

        // given
        SumOfMultiples sumOfMultiples = new SumOfMultiples();
        int belowNumbers = 1000;

        // when
        int result = sumOfMultiples.sumOfMultiples3and5(belowNumbers);

        // then
        Assert.assertThat(result, CoreMatchers.is(233168));
    }
}

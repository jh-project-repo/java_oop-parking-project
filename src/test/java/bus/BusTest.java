package bus;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.Assertions.*;

public class BusTest {

    @DisplayName("대형버스 주차요금 테스트")
    @Test
    public void 대형버스_주차요금_테스트() {

        // Given
        Bus largeBus = new LargeBus();

        // When
        int price1 = largeBus.getPrice(0, 60);
        int price2 = largeBus.getPrice(1, 1);

        // Then
        assertThat(price1).isEqualTo(5000);
        assertThat(price2).isEqualTo(8000);
    }

    @DisplayName("중형버스 주차요금 테스트")
    @Test
    public void 중형버스_주차요금_테스트() {

        // Given
        Bus mediumBus = new MediumBus();

        // When
        int price1 = mediumBus.getPrice(0, 60);
        int price2 = mediumBus.getPrice(1, 1);

        // Then
        assertThat(price1).isEqualTo(3000);
        assertThat(price2).isEqualTo(5000);
    }

    @DisplayName("소형버스 주차요금 테스트")
    @Test
    public void 미니버스_주차요금_테스트() {

        // Given
        Bus miniBus = new MiniBus();

        // When
        int price1 = miniBus.getPrice(0, 60);
        int price2 = miniBus.getPrice(1, 1);

        // Then
        assertThat(price1).isEqualTo(2000);
        assertThat(price2).isEqualTo(3000);

    }

}

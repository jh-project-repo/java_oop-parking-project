package bus;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

@SuppressWarnings("NonAsciiCharacters")
public class BusTest {

    @Test
    void 대형버스_주차요금_테스트() {

        // Given
        BusType largeBus = BusType.LARGE_BUS;

        // When
        int largePrice1 = BusPrice.getPrice(largeBus, 0, 60);
        int largePrice2 = BusPrice.getPrice(largeBus, 1, 1);

        // Then
        assertThat(largePrice1).isEqualTo(5000);
        assertThat(largePrice2).isEqualTo(8000);
    }

    @Test
    void 중형버스_주차요금_테스트() {

        // Given
        BusType mediumBus = BusType.MEDIUM_BUS;

        // When
        int mediumPrice1 = BusPrice.getPrice(mediumBus, 0, 60);
        int mediumPrice2 = BusPrice.getPrice(mediumBus, 1, 1);

        // Then
        assertThat(mediumPrice1).isEqualTo(3000);
        assertThat(mediumPrice2).isEqualTo(5000);
    }

    @Test
    void 미니버스_주차요금_테스트() {

        // Given
        BusType miniBus = BusType.MINI_BUS;

        // When
        int miniPrice1 = BusPrice.getPrice(miniBus, 0, 60);
        int miniPrice2 = BusPrice.getPrice(miniBus, 1, 1);

        // Then
        assertThat(miniPrice1).isEqualTo(2000);
        assertThat(miniPrice2).isEqualTo(3000);
    }
}

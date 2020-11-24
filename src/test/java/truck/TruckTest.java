package truck;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.Assertions.assertThat;

@SuppressWarnings("NonAsciiCharacters")
public class TruckTest {

    @DisplayName("대형트럭 주차요금 테스트")
    @Test
    public void 대형트럭_주차요금_테스트() {

        // Given
        TruckType largeTruck = TruckType.LARGE_TRUCK;

        // When
        int largePrice1 = TruckPrice.getPrice(largeTruck, 0, 60);
        int largePrice2 = TruckPrice.getPrice(largeTruck, 1, 1);

        // Then
        assertThat(largePrice1).isEqualTo(4000);
        assertThat(largePrice2).isEqualTo(8000);
    }

    @DisplayName("중형트럭 주차요금 테스트")
    @Test
    public void 중형트럭_주차요금_테스트() {
        // Given
        TruckType mediumTruck = TruckType.MEDIUM_TRUCK;

        // When
        int mediumPrice1 = TruckPrice.getPrice(mediumTruck, 0, 60);
        int mediumPrice2 = TruckPrice.getPrice(mediumTruck, 1, 1);

        // Then
        assertThat(mediumPrice1).isEqualTo(3000);
        assertThat(mediumPrice2).isEqualTo(6000);
    }

    @DisplayName("소형트럭 주차요금 테스트")
    @Test
    public void 소형트럭_주차요금_테스트() {
        // Given
        TruckType miniTruck = TruckType.MINI_TRUCK;

        // When
        int miniPrice1 = TruckPrice.getPrice(miniTruck, 0, 60);
        int miniPrice2 = TruckPrice.getPrice(miniTruck, 1, 1);

        // Then
        assertThat(miniPrice1).isEqualTo(2000);
        assertThat(miniPrice2).isEqualTo(4000);
    }
}

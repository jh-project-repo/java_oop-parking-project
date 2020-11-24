package car;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    @DisplayName("승용차 주차요금 테스트")
    @Test
    void 승용차_주차요금_테스트() {

        // Given
        Car car = new Car();

        // When
        int price1 = car.getPrice(CarType.ELECTRIC_CAR,0, 31);
        int price2 = car.getPrice(CarType.ELECTRIC_CAR,0, 39);
        int price3 = car.getPrice(CarType.ELECTRIC_CAR,0, 40);

        // Then
        assertThat(price1).isEqualTo(3000);
        assertThat(price2).isEqualTo(3000);
        assertThat(price3).isEqualTo(3000);
    }
}

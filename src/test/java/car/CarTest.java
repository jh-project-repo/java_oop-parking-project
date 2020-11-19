package car;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    @DisplayName("승용차 주차요금 테스트")
    @Test
    public void generalCarPrice() {

        // Given
        Car car = new Car();

        // When
        int price1 = car.getPrice(0, 31);
        int price2 = car.getPrice(0, 39);

        // Then
        assertThat(price1).isEqualTo(3000);
        assertThat(price2).isEqualTo(3000);
    }
}

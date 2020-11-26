package util;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.Assertions.assertThat;

@SuppressWarnings("NonAsciiCharacters")
public class DateUtilsTest {

    @DisplayName("As-Is) yyyyMMddHHmm , To-Be) yyyy/MM/dd HH:mm")
    @Test
    public void 날짜_형식_테스트() {

        // Given
        String entracneTime = "202011242330";

        // When
        String newTime = DateUtils.getDateFormat(entracneTime);

        // Then
        assertThat(newTime).isEqualTo("2020/11/24 23:30");
    }

    @DisplayName("주차 시간 테스트")
    @Test
    public void 주차_시간_테스트() {

        // Given
        String entranceTime1 = "202011251200";
        String exitTime1 = "202011251330";

        String entranceTime0 = "202011251300";
        String exitTime0 = "202011251330";

        // When
        int diffHours1 = DateUtils.getDiffHours(entranceTime1, exitTime1);
        int diffHours2 = DateUtils.getDiffHours(entranceTime0, exitTime0);

        // Then
        assertThat(diffHours1).isEqualTo(1);
        assertThat(diffHours2).isEqualTo(0);
    }
    
    @DisplayName("주차 분 테스트")
    @Test
    public void 주차_분_테스트() {

        // Given
        String entranceTime = "202011251200";
        String exitTime = "202011251330";

        // When
        int diffMinutes = DateUtils.getDiffMinutes(entranceTime, exitTime);

        // Then
        assertThat(diffMinutes).isEqualTo(30);

    }
}

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
}

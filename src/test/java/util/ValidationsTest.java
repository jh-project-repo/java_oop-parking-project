package util;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidationsTest {

    @Test
    @DisplayName("날짜 유효성 검사")
    public void 날짜_유효성_검사() {

        // Given
        String dateFormat = "yyyyMMddHHmm";
        String date1 = "2020112814401"; // False
        String date2 = "20201128144";   // False
        String date3 = "202011281440";  // True
        String date4 = "202013281200";  // False
        String date5 = "202011111380";  // False

        // When
        boolean bool1 = Validations.vaildInputEntranceTime(date1, dateFormat);
        boolean bool2 = Validations.vaildInputEntranceTime(date2, dateFormat);
        boolean bool3 = Validations.vaildInputEntranceTime(date3, dateFormat);
        boolean bool4 = Validations.vaildInputEntranceTime(date4, dateFormat);
        boolean bool5 = Validations.vaildInputEntranceTime(date5, dateFormat);

        // Then
        assertThat(bool1).isEqualTo(false);
        assertThat(bool2).isEqualTo(false);
        assertThat(bool3).isEqualTo(true);
        assertThat(bool4).isEqualTo(false);
        assertThat(bool5).isEqualTo(false);
    }
}

package logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest {
    @DisplayName("JavaeSort - 리스트를 넣으면 정렬된 결과를 보여준다.")
    @Test
    void given_List_WhenExecuting_ThenReturnSortedList() {
        // Given
        JavaSort<Integer> javaSort = new JavaSort<>();

        // When
        List<Integer> actual = javaSort.sort(List.of(3, 2, 1, 4, 5));

        // Then
        assertEquals(List.of(1,2, 3, 4, 5), actual);
    }

}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.minhluan.mathutil.core.test;

import org.minhluan.math.util.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


public class MathUtilityAdvancedTest {

// chuẩn bị sẵn riêng test data, lát hồi fill vào hàm
// DDT    
    // hàm trả về mảng 2 chiều, kiểu WRAPPER CLASS/OBJECT
    // mảng chứa các cặp n -> expected, ví dụ: 0! -> 1; 1! -> 1
    public static Object[][] initTestDate() {
        Object[][] testData = {
                               {0, 1},
                               {1, 1},
                               {2, 2},
                               {5, 120},
                               {6, 720}
                                };
        return testData;
    }
    
@ParameterizedTest
@MethodSource(value = "initTestDate")
public void testFactorialGivenRightArgumentReturnsWell(int n, long expected){
    //tham số hóa việc test data vào hàm assertEquals()
    // biến đổi dữ liệu thành tham số tổng quát
    // PARAMETERIZED
        assertEquals(expected, MathUtility.getFactorial(n));
    }
    
}

//TDD: Test Driven Development là kĩ thuật lập trình mà
// gắn với viết test case để kiểm thử ngay những hàm
// dev mình vừa viết
// viết code chính và viết code test (Junit, unitTest) xen kẻ,
//với nhau. 2 màu xanh đỏ liên tục diễn ra

//DDT: Sự mỡ tộng cho quá trình viết code test (Junit)
//Data Driven Testing
// kỉ thuật tách bộ test data ra 1 chổ riêng, tách vào mảng
// tách vào file excel, hay table; sau đó nhồi, fill, map
// cái data từ mảng này vào trong hàm so sánh asserEquals()
// giúp đọc code để đọc hơn, de8973 kiểm tra còn thiếu test case nào hay k

package baekjoon7;

public class Print2D {

    public static void print2DArray(int[][] arr) {
        // 배열이 비었을 경우
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int rows = arr.length;
        int cols = arr[0].length;

        // 1) 상단에 열 인덱스 헤더 출력
        System.out.print("     ");             // 열 인덱스 앞쪽 간격
        for (int col = 0; col < cols; col++) {
            System.out.printf("%4d", col);     // 각 열 인덱스
        }
        System.out.println();

        // 2) 구분 선(헤더 아래)
        System.out.print("----+");
        for (int col = 0; col < cols; col++) {
            System.out.print("----");
        }
        System.out.println();

        // 3) 본문: 각 행의 데이터
        for (int row = 0; row < rows; row++) {
            // 왼쪽에 행 번호 출력
            System.out.printf("%3d |", row);

            // 실제 배열의 값 출력
            for (int col = 0; col < cols; col++) {
                System.out.printf("%4d", arr[row][col]);
            }
            System.out.println();
        }
    }
}


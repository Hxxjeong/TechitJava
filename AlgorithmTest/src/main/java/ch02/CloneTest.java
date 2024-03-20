package ch02;

class MyObject implements Cloneable {
    private int[] array;

    public MyObject(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneTest {
    public static void main(String[] args) {

        // 원본 객체 생성
        int[] originalArray = {1, 2, 3};
        MyObject originalObject = new MyObject(originalArray);

        try {
            // 얕은 복사
            MyObject clonedObject = (MyObject) originalObject.clone();

            // 원본 객체 변경
            originalObject.getArray()[0] = 100;

            // 복사된 객체 확인
            int[] clonedArray = clonedObject.getArray();
            System.out.println("Cloned Array:");
            for (int value : clonedArray) {
                System.out.println(value);  // 원본 객체가 변경되었으므로 100, 2, 3 출력됨
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}


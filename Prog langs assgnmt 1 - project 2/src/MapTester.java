import csci235.BSTMap;
import csci235.HashTableMap;
import csci235.Map;

public class MapTester {

    public static void main(String[] args) {
        test(new BSTMap<>());
        test(new HashTableMap<>(4));
    }

    public static void test(Map<Integer, String> map)  {

        System.out.println("Running tests...");

        for (int i = 1; i < 50; i = i + 2) {
            String str = "v" + i;

            if (map.put(i, str) != null) {
                System.out.println("putting (" + i + ", " + str
                        + ") should return null");
            }

            int expdSize = i/2 + 1;
            if (map.size() != expdSize) {
                System.out.println("size should have been " + expdSize);
            }
        }

        System.out.println("run 1 size:" + map.size());

        for (int i = 49; i > 0; i--) {
            boolean ckresult = map.containsKey(i);
            String result = map.get(i);

            if (i % 2 == 0) {
                if (ckresult) {
                    System.out.println("key " + i + " should not be in the map");
                }
                if (result != null) {
                    System.out.println("key " + i + " should not have value " + result);
                }
            } else {
                if (!ckresult) {
                    System.out.println("key " + i + " should be in the map");
                }
                if (result == null) {
                    System.out.println("key " + i + " should not have value null");
                }
            }
        }

        System.out.println("run 2 size:" + map.size());


        for (int i = 1; i <= 50; i++) {
            String str = "w" + i;
            String result = map.put(i, str);

            if (i % 2 == 0) {
                if (result != null) {
                    System.out.println("putting (" + i + ", " + str
                            + ") should return null");
                }
            } else {
                String expected = "v" + i;
                if (!expected.equals(result)) {
                    System.out.println("putting (" + i + ", " + str
                            + ") should return " + expected);
                }
            }
        }

        System.out.println("run 3 size:" + map.size());
        if (map.size() != 50) {
            System.out.println("Size should be 50 now.");
        }

        map.clear();
        System.out.println("run 4 size:" + map.size());
        if (map.size() != 0) {
            System.out.println("Clear or size appears to be broken.");
        }

        System.out.println("------------------");

    }
}

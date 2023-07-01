package List;

public class Pro3 {
        Object [] arr;
        int s;
        int capacity;

        Pro3() {
            capacity = 10;
            s = 0;
            arr = new Object[capacity];
        }

        void add(Object item) {
            arr[s++] = item;
        }
        Object get(int index){
            return arr[index];
        }
        int size(){
            return s;
        }
        void remove(Object index){
//         int = (int) index;
        }
    }
    class CustomArrayList {
        public static void main(String[] args) {
            Pro3 obj =new Pro3();
            obj.add(1);
            obj.add("Aarti");
            obj.add(50);
            obj.add(65);
            obj.remove(0);

            for (int i=0;i<obj.size();i++){
                System.out.println(obj.get(i));

            }
            System.out.println(obj.size());
        }
    }



   // Принцип одного уровня абстракции (Single Level of Abstraction Principle): Исключения должны обрабатываться
   // на том уровне, где имеется достаточно информации для их корректной обработки.

        public class ArrayExample {
            public static void main(String[] args) {
//                int[] array = {1, 2, 3, 4, 5};
//
//                int element = getElementAtIndex(array, 6);
//                System.out.println("Значение элемента: " + element);
//            }
//
//            public static int getElementAtIndex(int[] array, int index) {
//                try {
//                    return array[index];
//                } catch (ArrayIndexOutOfBoundsException e) {
//                    System.out.println("Ошибка: Индекс выходит за пределы массива");
//                }
//                return 0;
//            }

            int[] array = {1, 2, 3, 4, 5};

        try {
                int element = getElementAtIndex(array, 6);
                System.out.println("Значение элемента: " + element);
                } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Ошибка: Индекс выходит за пределы массива");
                }
                }

   public static int getElementAtIndex(int[] array, int index) {
           return array[index];
           }
        }
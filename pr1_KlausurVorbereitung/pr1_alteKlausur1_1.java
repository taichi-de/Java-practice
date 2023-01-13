package pr1_KlausurVorbereitung;
public class pr1_alteKlausur1_1 {
    // Afgb2 a
    public static long[] doubler(int[] orig){
        long[] result = new long[orig.length*2];
        int j = 0;
        for(int i = 0; i < orig.length; i++){
            result[j] = orig[i];
            result[j+1] = orig[i]*2;
            j += 2;
        }
        return result;
    }
    // Afgb2 b
    long[] doubler(int[] orig, long[] result, int indexOrig, int indexResult){
        if(indexOrig == orig.length) return result;
        result[indexResult] = orig[indexOrig];
        result[indexResult+1] = orig[indexOrig*2];
        return doubler(orig, result, indexOrig, indexResult);
    }

    //Afgb3 b
    // ArrayIndexOutOfBoundsException wird geworfen.
    // -> paramer n am Beginn der Methode zu prüfen und Fall speziell behandeln

    //Afgb 4
    public class FloatStack {
        private Float[] arr;
        int h;

        public FloatStack(int size) {
            arr = new Float[size];
        }

        public void put(float f){
            if(h == arr.length) return;
            arr[h++] = f;
        }

        public float get(){
            if(h == 0) return 0;
            return arr[h--];
        }

        public float getBiggest(){
            float f;
            if(h > 0) f = arr[0];
            else return 0;
            for(int i = 1; i != h; ++i){
                if(arr[i] > f) f = arr[i];
            }
            return f;
        }
    }
}

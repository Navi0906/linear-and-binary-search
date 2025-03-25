public class CompareBufferBuilder {
    public static void main(String[] args) {
        long startTime, endTime;

        startTime = System.nanoTime();
        StringBuffer sf = new StringBuffer();
        for(int i=0;i<1000000;i++){
            sf.append(i);
        }
        endTime = System.nanoTime();

        System.out.println("StringBuffer performance: "+(endTime-startTime)+" ns");

        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<1000000;i++){
            sb.append(i);
        }
        endTime = System.nanoTime();

        System.out.println("StringBuilder performance: "+(endTime-startTime)+" ns");



    }
}

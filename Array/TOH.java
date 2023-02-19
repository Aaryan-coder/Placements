class Hanoi {

    public long toh(int N, int from, int to, int aux) {
        // Your code here
        if(N==1){
            System.out.println("move disk " + N + " from rod " + from + " to rod " + to);
        }
        else if(N==0){
            System.out.println("");
        }
        else{
            toh(N-1,from,aux,to);
           // count++;
            System.out.println("move disk " + N + " from rod " + from + " to rod " + to);
            toh(N-1,aux,to,from);
            //count++;
        }
        return (long)Math.pow(2,N)-1;
    }
}

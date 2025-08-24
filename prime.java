class prime{
    public static void main(String[] args){
        int num = 10;
        boolean isPrime = true;
        for(int c = 2;c<Math.sqrt(num);c++){
            if(num%c == 0){
               isPrime = false;
              break;
            }

        }
        if(isPrime){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not a prime Number");
        }
    

    }
}
public class if_elseif{
    public static void main(String[]args){
        int sal = 10000;
        if(sal>10000){
            sal = sal+1000;
            
        }else{
            sal = sal + 2000;
         
        }
        System.out.println(sal);

         if(sal>10000){
        sal += 2000;
                  }else if(sal>20000){
                        sal += 3000;
                    }else{
                         sal += 4000;
                          }
                          System.out.println(sal);
            }

   
}
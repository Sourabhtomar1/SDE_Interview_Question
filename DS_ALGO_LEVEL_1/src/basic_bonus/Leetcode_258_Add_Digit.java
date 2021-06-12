package basic_bonus;

public class Leetcode_258_Add_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(addDigits(259));

	}
	
	public static int addDigits(int num) {
        int ans = 0;
        
        while(num > 0){
            int rem = num % 10;
            
            ans+=rem;
            
            num /=10;
            
            
            
            if(num <= 0){
                
                if(ans<10){
                    break;
                }
                num = ans;
                ans = 0;
            }
        }
        return ans;
    }



}

    
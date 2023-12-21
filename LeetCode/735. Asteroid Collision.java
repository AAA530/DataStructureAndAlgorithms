class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(asteroids[0]);
        int i = 1;

        // for(int i=0;i<asteroids.length;i++){
        while(!stack.isEmpty() && i<asteroids.length){
            if(asteroids[i]<0 && asteroids[i]*stack.peek()<=0){

                if(Math.abs(asteroids[i]) == Math.abs(stack.peek())){
                    stack.pop();
                    i++;
                }else if(Math.abs(asteroids[i]) > Math.abs(stack.peek())){
                    stack.pop();
                }else{
                    i++;
                }

                if(i>=asteroids.length){
                    break;
                }

                if(stack.isEmpty()){
                    stack.push(asteroids[i]);
                    i++;
                }
                
            }else{
                stack.push(asteroids[i]);
                i++;
            }

            
        }
        // }

        
        // Creating the array and using toArray() 

        
        // Object[] arr = stack.toArray(); 
  
        // System.out.println("The array is:"); 
        // for (int j = 0; j < arr.length; j++) 
        //     System.out.println(arr[j]); 

        if(!stack.isEmpty()){
            Integer[] intArray = stack.toArray(new Integer[stack.size()]);

            int[] primitiveIntArray = new int[intArray.length];
            for (int k = 0; k < intArray.length; k++) {
                primitiveIntArray[k] = intArray[k];
            }
            
            return primitiveIntArray;
        }
        
        return new int[0];
    }
}
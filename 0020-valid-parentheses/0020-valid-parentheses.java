class Solution {
    public static boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        char[] brackets=s.toCharArray();
      for(char bracket :brackets){
          if(bracket=='(' || bracket=='{'|| bracket=='['){
              stack.push(bracket);
          }else{
              if(stack.isEmpty()){
                  return false;
              }
          
          char topElement=stack.pop();
          if(bracket==')' && topElement!='('
            || bracket=='}' && topElement!='{'
            || bracket==']' && topElement!='['){
              return false;
          }   
          }
      } 
        return stack.isEmpty();
    }
    
    public static void main(String[] args){
        String s="()[]{}";
            boolean result=isValid(s);
        System.out.println(result);
        
    }
}
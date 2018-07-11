public class klammerstack{
    private listenelement erster=new abschluss();
    
    public void poll(char thing){
        this.erster=new knoten(thing, this.erster);
    }
    
    public boolean korrekt(String s){
        this.erster=new abschluss();
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(c=='('||c=='{'||c=='['){
                poll(c);
            } else if(c==')'){
                if(this.erster.peek()!='('){
                    return false;
                }
                poll(c);
            } else if(c=='}'){
                if(this.erster.peek()!='{'){
                    return false;
                }
                poll(c);
            } else if(c==']'){
                if(this.erster.peek()!='['){
                    return false;
                }
                poll(c);
            }
        }
        return true;
    }
}

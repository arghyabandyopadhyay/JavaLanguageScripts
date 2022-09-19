import java.util.HashMap;

public class RegularExpressionMatching {
    
    HashMap<String,Boolean> cache=new HashMap<>();
    public boolean isMatch(String s, String p) {
        if(cache.containsKey((s+","+p))){
            return cache.get((s+","+p));
        }
        if (p.isEmpty()) return s.isEmpty();
        boolean first_match = (!s.isEmpty() &&
                               (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.'));
        boolean result;
        if (p.length() >= 2 && p.charAt(1) == '*'){
            result=(isMatch(s, p.substring(2)) ||
                    (first_match && isMatch(s.substring(1), p)));
            cache.put((s+","+p),result);
        } else {
            result=first_match && isMatch(s.substring(1), p.substring(1));
            cache.put((s+","+p),result);
        }
        return result;
    }
}

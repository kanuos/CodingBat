package com.company;

import java.util.Map;

public class Map1 {
//    Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value,
//    and set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the
//    empty string.

    public Map<String, String> mapBully(Map <String, String> m1){
        if(m1.containsKey("a")){
            m1.put("b", m1.get("a"));
            m1.put("a", "");
        }
        return m1;
    }

//    Given a map of food keys and topping values, modify and return the map as follows: if the key "ice cream" is
//    present, set its value to "cherry". In all cases, set the key "bread" to have the value "butter".

    public Map<String, String> topping1(Map<String, String> m1){
        if(m1.containsKey("ice cream")){
            m1.put("ice cream", "cherry");
        }
        m1.put("bread", "butter");
        return m1;
    }

//    Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values,
//    remove them both.

    public Map<String, String> mapAB2 (Map<String, String> m1){
        if(m1.containsKey("a") && m1.containsKey("b")){
            if(m1.get("a").equals(m1.get("b"))){
                m1.remove("a");
                m1.remove("b");
            }
        }
        return m1;
    }

//    Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value.
//    In all cases remove the key "c", leaving the rest of the map unchanged.

    public Map<String, String> mapShare (Map<String, String> m1){
        m1.remove("c");
        if(m1.containsKey("a")){
            m1.put("b", m1.get("a"));
        }
        return m1;
    }

//    Given a map of food keys and their topping values, modify and return the map as follows: if the key "ice cream"
//    has a value, set that as the value for the key "yogurt" also. If the key "spinach" has a value, change that value to "nuts".

    public Map<String, String> topping2 (Map<String, String> m1){
        if(m1.containsKey("ice cream")){
            m1.put("yogurt", m1.get("ice cream"));
        }
        if(m1.containsKey("spinach")){
            m1.put("spinach","nuts");
        }
        return m1;
    }

//    Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the map
//    (but not both), set the other to have that same value in the map.

    public Map<String, String> mapAB3 (Map<String, String> m1){
        if(m1.containsKey("a") && !m1.containsKey("b")){
            m1.put("b", m1.get("a"));
        }
        else if(!m1.containsKey("a") && m1.containsKey("b")){
            m1.put("a", m1.get("b"));
        }
        return m1;
    }


//    Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys.
//    If both keys are present, append their 2 string values together and store the result under the key "ab".

    public Map<String, String> mapAB (Map<String, String> m1){
        if(m1.containsKey("a") && m1.containsKey("b")){
            m1.put("ab", m1.get("a") + m1.get("b"));
        }
        return m1;
    }

//    Given a map of food keys and topping values, modify and return the map as follows: if the key "potato" has a
//    value, set that as the value for the key "fries". If the key "salad" has a value, set that as the value for the
//    key "spinach".

    public Map<String, String> topping3 (Map<String, String> m1){
        if(m1.containsKey("potato")){
            m1.put("fries", m1.get("potato"));
        }
        if(m1.containsKey("salad")){
            m1.put("spinach", m1.get("salad"));
        }
        return m1;
    }

//    Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths, then
//    set "c" to have the longer value. If the values exist and have the same length, change them both to the empty
//    string in the map.

    public Map<String, String> mapAB4 (Map<String, String> m1){
        if(m1.containsKey("a") && m1.containsKey("b")){
            String aValue = m1.get("a");
            String bValue = m1.get("b");
            if(aValue.length() != bValue.length()){
                m1.put("c", aValue.length() > bValue.length() ? aValue : bValue);
            }
            else{
                m1.remove("a");
                m1.remove("b");
            }
        }
        return m1;
    }

}

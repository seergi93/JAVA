/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regEx;

import java.util.regex.*;

/**
 *
 * @author 
 */
public class RegEx {

    private String pattern = null;
    private String text = null;
    private Matcher matcher = null;

    public RegEx() {
    }

    public void objetive(String pattern, String text) {

        setPattern(pattern);
        setText(text);

        Pattern pat = Pattern.compile(this.pattern);
        Matcher mat = pat.matcher(this.text);
        this.matcher = mat;

    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Matcher getMatcher() {
        return matcher;
    }

    public void setMatcher(Matcher matcher) {
        this.matcher = matcher;
    }

}

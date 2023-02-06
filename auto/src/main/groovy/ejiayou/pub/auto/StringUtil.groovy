package ejiayou.pub.auto

class StringUtil {
    static def isBlank(String s) {
        return s == null || s.length() <= 0
    }

    static def isNotBlank(String s) {
        return !isBlank(s)
    }
}
import org.python.core.*;

public class sre extends java.lang.Object {
    static String[] jpy$mainProperties = new String[] {"python.modules.builtin", "exceptions:org.python.core.exceptions"};
    static String[] jpy$proxyProperties = new String[] {"python.modules.builtin", "exceptions:org.python.core.exceptions", "python.options.showJavaExceptions", "true"};
    static String[] jpy$packages = new String[] {"org.python.core", null, "java.lang", null, "java.io", null, "java.util", null};
    
    public static class _PyInner extends PyFunctionTable implements PyRunnable {
        private static PyObject s$0;
        private static PyObject s$1;
        private static PyObject s$2;
        private static PyObject s$3;
        private static PyObject s$4;
        private static PyObject s$5;
        private static PyObject s$6;
        private static PyObject s$7;
        private static PyObject s$8;
        private static PyObject s$9;
        private static PyObject s$10;
        private static PyObject s$11;
        private static PyObject s$12;
        private static PyObject s$13;
        private static PyObject s$14;
        private static PyObject s$15;
        private static PyObject s$16;
        private static PyObject s$17;
        private static PyObject s$18;
        private static PyObject s$19;
        private static PyObject s$20;
        private static PyObject s$21;
        private static PyObject s$22;
        private static PyObject s$23;
        private static PyObject s$24;
        private static PyObject s$25;
        private static PyObject i$26;
        private static PyObject s$27;
        private static PyObject s$28;
        private static PyObject s$29;
        private static PyObject s$30;
        private static PyObject s$31;
        private static PyObject i$32;
        private static PyObject s$33;
        private static PyObject s$34;
        private static PyObject s$35;
        private static PyObject s$36;
        private static PyObject s$37;
        private static PyObject s$38;
        private static PyObject s$39;
        private static PyObject s$40;
        private static PyObject s$41;
        private static PyObject s$42;
        private static PyObject s$43;
        private static PyObject s$44;
        private static PyObject s$45;
        private static PyObject s$46;
        private static PyObject s$47;
        private static PyObject s$48;
        private static PyObject i$49;
        private static PyObject s$50;
        private static PyObject i$51;
        private static PyObject s$52;
        private static PyFunctionTable funcTable;
        private static PyCode c$0_match;
        private static PyCode c$1_search;
        private static PyCode c$2_sub;
        private static PyCode c$3_subn;
        private static PyCode c$4_split;
        private static PyCode c$5_findall;
        private static PyCode c$6_finditer;
        private static PyCode c$7_compile;
        private static PyCode c$8_purge;
        private static PyCode c$9_template;
        private static PyCode c$10_escape;
        private static PyCode c$11__join;
        private static PyCode c$12__compile;
        private static PyCode c$13__compile_repl;
        private static PyCode c$14__expand;
        private static PyCode c$15_filter;
        private static PyCode c$16__subx;
        private static PyCode c$17__pickle;
        private static PyCode c$18___init__;
        private static PyCode c$19_scan;
        private static PyCode c$20_Scanner;
        private static PyCode c$21_main;
        private static void initConstants() {
            s$0 = Py.newString("Support for regular expressions (RE).\012\012This module provides regular expression matching operations similar to\012those found in Perl.  It supports both 8-bit and Unicode strings; both\012the pattern and the strings being processed can contain null bytes and\012characters outside the US ASCII range.\012\012Regular expressions can contain both special and ordinary characters.\012Most ordinary characters, like \"A\", \"a\", or \"0\", are the simplest\012regular expressions; they simply match themselves.  You can\012concatenate ordinary characters, so last matches the string 'last'.\012\012The special characters are:\012    \".\"      Matches any character except a newline.\012    \"^\"      Matches the start of the string.\012    \"$\"      Matches the end of the string.\012    \"*\"      Matches 0 or more (greedy) repetitions of the preceding RE.\012             Greedy means that it will match as many repetitions as possible.\012    \"+\"      Matches 1 or more (greedy) repetitions of the preceding RE.\012    \"?\"      Matches 0 or 1 (greedy) of the preceding RE.\012    *?,+?,?? Non-greedy versions of the previous three special characters.\012    {m,n}    Matches from m to n repetitions of the preceding RE.\012    {m,n}?   Non-greedy version of the above.\012    \"\\\\\"      Either escapes special characters or signals a special sequence.\012    []       Indicates a set of characters.\012             A \"^\" as the first character indicates a complementing set.\012    \"|\"      A|B, creates an RE that will match either A or B.\012    (...)    Matches the RE inside the parentheses.\012             The contents can be retrieved or matched later in the string.\012    (?iLmsux) Set the I, L, M, S, U, or X flag for the RE (see below).\012    (?:...)  Non-grouping version of regular parentheses.\012    (?P<name>...) The substring matched by the group is accessible by name.\012    (?P=name)     Matches the text matched earlier by the group named name.\012    (?#...)  A comment; ignored.\012    (?=...)  Matches if ... matches next, but doesn't consume the string.\012    (?!...)  Matches if ... doesn't match next.\012\012The special sequences consist of \"\\\\\" and a character from the list\012below.  If the ordinary character is not on the list, then the\012resulting RE will match the second character.\012    \\number  Matches the contents of the group of the same number.\012    \\A       Matches only at the start of the string.\012    \\Z       Matches only at the end of the string.\012    \\b       Matches the empty string, but only at the start or end of a word.\012    \\B       Matches the empty string, but not at the start or end of a word.\012    \\d       Matches any decimal digit; equivalent to the set [0-9].\012    \\D       Matches any non-digit character; equivalent to the set [^0-9].\012    \\s       Matches any whitespace character; equivalent to [ \\t\\n\\r\\f\\v].\012    \\S       Matches any non-whitespace character; equiv. to [^ \\t\\n\\r\\f\\v].\012    \\w       Matches any alphanumeric character; equivalent to [a-zA-Z0-9_].\012             With LOCALE, it will match the set [0-9_] plus characters defined\012             as letters for the current locale.\012    \\W       Matches the complement of \\w.\012    \\\\       Matches a literal backslash.\012\012This module exports the following functions:\012    match    Match a regular expression pattern to the beginning of a string.\012    search   Search a string for the presence of a pattern.\012    sub      Substitute occurrences of a pattern found in a string.\012    subn     Same as sub, but also return the number of substitutions made.\012    split    Split a string by the occurrences of a pattern.\012    findall  Find all occurrences of a pattern in a string.\012    compile  Compile a pattern into a RegexObject.\012    purge    Clear the regular expression cache.\012    escape   Backslash all non-alphanumerics in a string.\012\012Some of the functions in this module takes flags as optional parameters:\012    I  IGNORECASE  Perform case-insensitive matching.\012    L  LOCALE      Make \\w, \\W, \\b, \\B, dependent on the current locale.\012    M  MULTILINE   \"^\" matches the beginning of lines as well as the string.\012                   \"$\" matches the end of lines as well as the string.\012    S  DOTALL      \".\" matches any character at all, including the newline.\012    X  VERBOSE     Ignore whitespace and comments for nicer looking RE's.\012    U  UNICODE     Make \\w, \\W, \\b, \\B, dependent on the Unicode locale.\012\012This module also defines an exception 'error'.\012\012");
            s$1 = Py.newString("match");
            s$2 = Py.newString("search");
            s$3 = Py.newString("sub");
            s$4 = Py.newString("subn");
            s$5 = Py.newString("split");
            s$6 = Py.newString("findall");
            s$7 = Py.newString("compile");
            s$8 = Py.newString("purge");
            s$9 = Py.newString("template");
            s$10 = Py.newString("escape");
            s$11 = Py.newString("I");
            s$12 = Py.newString("L");
            s$13 = Py.newString("M");
            s$14 = Py.newString("S");
            s$15 = Py.newString("X");
            s$16 = Py.newString("U");
            s$17 = Py.newString("IGNORECASE");
            s$18 = Py.newString("LOCALE");
            s$19 = Py.newString("MULTILINE");
            s$20 = Py.newString("DOTALL");
            s$21 = Py.newString("VERBOSE");
            s$22 = Py.newString("UNICODE");
            s$23 = Py.newString("error");
            s$24 = Py.newString("2.2.1");
            s$25 = Py.newString("Try to apply the pattern at the start of the string, returning\012    a match object, or None if no match was found.");
            i$26 = Py.newInteger(0);
            s$27 = Py.newString("Scan through string looking for a match to the pattern, returning\012    a match object, or None if no match was found.");
            s$28 = Py.newString("Return the string obtained by replacing the leftmost\012    non-overlapping occurrences of the pattern in string by the\012    replacement repl");
            s$29 = Py.newString("Return a 2-tuple containing (new_string, number).\012    new_string is the string obtained by replacing the leftmost\012    non-overlapping occurrences of the pattern in the source\012    string by the replacement repl.  number is the number of\012    substitutions that were made.");
            s$30 = Py.newString("Split the source string by the occurrences of the pattern,\012    returning a list containing the resulting substrings.");
            s$31 = Py.newString("Return a list of all non-overlapping matches in the string.\012\012    If one or more groups are present in the pattern, return a\012    list of groups; this will be a list of tuples if the pattern\012    has more than one group.\012\012    Empty matches are included in the result.");
            i$32 = Py.newInteger(33685504);
            s$33 = Py.newString("finditer");
            s$34 = Py.newString("Return an iterator over all non-overlapping matches in the\012        string.  For each match, the iterator returns a match object.\012\012        Empty matches are included in the result.");
            s$35 = Py.newString("Compile a regular expression pattern, returning a pattern object.");
            s$36 = Py.newString("Clear the regular expression cache");
            s$37 = Py.newString("Compile a template pattern, returning a pattern object");
            s$38 = Py.newString("Escape all non-alphanumeric characters in pattern.");
            s$39 = Py.newString("a");
            s$40 = Py.newString("z");
            s$41 = Py.newString("A");
            s$42 = Py.newString("Z");
            s$43 = Py.newString("0");
            s$44 = Py.newString("9");
            s$45 = Py.newString("\000");
            s$46 = Py.newString("\\000");
            s$47 = Py.newString("\\");
            s$48 = Py.newString("");
            i$49 = Py.newInteger(100);
            s$50 = Py.newString("first argument must be string or compiled pattern");
            i$51 = Py.newInteger(1);
            s$52 = Py.newString("F:\\Java\\Jython\\jython2.2.1\\Lib\\sre.py");
            funcTable = new _PyInner();
            c$0_match = Py.newCode(3, new String[] {"pattern", "string", "flags"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre.py", "match", false, false, funcTable, 0, null, null, 0, 17);
            c$1_search = Py.newCode(3, new String[] {"pattern", "string", "flags"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre.py", "search", false, false, funcTable, 1, null, null, 0, 17);
            c$2_sub = Py.newCode(4, new String[] {"pattern", "repl", "string", "count"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre.py", "sub", false, false, funcTable, 2, null, null, 0, 17);
            c$3_subn = Py.newCode(4, new String[] {"pattern", "repl", "string", "count"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre.py", "subn", false, false, funcTable, 3, null, null, 0, 17);
            c$4_split = Py.newCode(3, new String[] {"pattern", "string", "maxsplit"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre.py", "split", false, false, funcTable, 4, null, null, 0, 17);
            c$5_findall = Py.newCode(2, new String[] {"pattern", "string"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre.py", "findall", false, false, funcTable, 5, null, null, 0, 17);
            c$6_finditer = Py.newCode(2, new String[] {"pattern", "string"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre.py", "finditer", false, false, funcTable, 6, null, null, 0, 17);
            c$7_compile = Py.newCode(2, new String[] {"pattern", "flags"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre.py", "compile", false, false, funcTable, 7, null, null, 0, 17);
            c$8_purge = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre.py", "purge", false, false, funcTable, 8, null, null, 0, 17);
            c$9_template = Py.newCode(2, new String[] {"pattern", "flags"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre.py", "template", false, false, funcTable, 9, null, null, 0, 17);
            c$10_escape = Py.newCode(1, new String[] {"pattern", "i", "s", "c"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre.py", "escape", false, false, funcTable, 10, null, null, 0, 17);
            c$11__join = Py.newCode(2, new String[] {"seq", "sep"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre.py", "_join", false, false, funcTable, 11, null, null, 0, 17);
            c$12__compile = Py.newCode(1, new String[] {"key", "p", "flags", "pattern", "v"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre.py", "_compile", true, false, funcTable, 12, null, null, 0, 17);
            c$13__compile_repl = Py.newCode(1, new String[] {"key", "p", "repl", "pattern", "v"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre.py", "_compile_repl", true, false, funcTable, 13, null, null, 0, 17);
            c$14__expand = Py.newCode(3, new String[] {"pattern", "match", "template"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre.py", "_expand", false, false, funcTable, 14, null, null, 0, 17);
            c$15_filter = Py.newCode(2, new String[] {"match", "template"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre.py", "filter", false, false, funcTable, 15, null, null, 0, 17);
            c$16__subx = Py.newCode(2, new String[] {"pattern", "template", "filter"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre.py", "_subx", false, false, funcTable, 16, null, null, 0, 17);
            c$17__pickle = Py.newCode(1, new String[] {"p"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre.py", "_pickle", false, false, funcTable, 17, null, null, 0, 17);
            c$18___init__ = Py.newCode(3, new String[] {"self", "lexicon", "flags", "p", "SUBPATTERN", "phrase", "action", "BRANCH", "s"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre.py", "__init__", false, false, funcTable, 18, null, null, 0, 17);
            c$19_scan = Py.newCode(2, new String[] {"self", "string", "append", "m", "action", "j", "i", "match", "result"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre.py", "scan", false, false, funcTable, 19, null, null, 0, 17);
            c$20_Scanner = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre.py", "Scanner", false, false, funcTable, 20, null, null, 0, 16);
            c$21_main = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre.py", "main", false, false, funcTable, 21, null, null, 0, 16);
        }
        
        
        public PyCode getMain() {
            if (c$21_main == null) _PyInner.initConstants();
            return c$21_main;
        }
        
        public PyObject call_function(int index, PyFrame frame) {
            switch (index){
                case 0:
                return _PyInner.match$1(frame);
                case 1:
                return _PyInner.search$2(frame);
                case 2:
                return _PyInner.sub$3(frame);
                case 3:
                return _PyInner.subn$4(frame);
                case 4:
                return _PyInner.split$5(frame);
                case 5:
                return _PyInner.findall$6(frame);
                case 6:
                return _PyInner.finditer$7(frame);
                case 7:
                return _PyInner.compile$8(frame);
                case 8:
                return _PyInner.purge$9(frame);
                case 9:
                return _PyInner.template$10(frame);
                case 10:
                return _PyInner.escape$11(frame);
                case 11:
                return _PyInner._join$12(frame);
                case 12:
                return _PyInner._compile$13(frame);
                case 13:
                return _PyInner._compile_repl$14(frame);
                case 14:
                return _PyInner._expand$15(frame);
                case 15:
                return _PyInner.filter$16(frame);
                case 16:
                return _PyInner._subx$17(frame);
                case 17:
                return _PyInner._pickle$18(frame);
                case 18:
                return _PyInner.__init__$19(frame);
                case 19:
                return _PyInner.scan$20(frame);
                case 20:
                return _PyInner.Scanner$21(frame);
                case 21:
                return _PyInner.main$22(frame);
                default:
                return null;
            }
        }
        
        private static PyObject match$1(PyFrame frame) {
            /* Try to apply the pattern at the start of the string, returning
                a match object, or None if no match was found. */
            return frame.getglobal("_compile").__call__(frame.getlocal(0), frame.getlocal(2)).invoke("match", frame.getlocal(1));
        }
        
        private static PyObject search$2(PyFrame frame) {
            /* Scan through string looking for a match to the pattern, returning
                a match object, or None if no match was found. */
            return frame.getglobal("_compile").__call__(frame.getlocal(0), frame.getlocal(2)).invoke("search", frame.getlocal(1));
        }
        
        private static PyObject sub$3(PyFrame frame) {
            /* Return the string obtained by replacing the leftmost
                non-overlapping occurrences of the pattern in string by the
                replacement repl */
            return frame.getglobal("_compile").__call__(frame.getlocal(0), i$26).invoke("sub", new PyObject[] {frame.getlocal(1), frame.getlocal(2), frame.getlocal(3)});
        }
        
        private static PyObject subn$4(PyFrame frame) {
            /* Return a 2-tuple containing (new_string, number).
                new_string is the string obtained by replacing the leftmost
                non-overlapping occurrences of the pattern in the source
                string by the replacement repl.  number is the number of
                substitutions that were made. */
            return frame.getglobal("_compile").__call__(frame.getlocal(0), i$26).invoke("subn", new PyObject[] {frame.getlocal(1), frame.getlocal(2), frame.getlocal(3)});
        }
        
        private static PyObject split$5(PyFrame frame) {
            /* Split the source string by the occurrences of the pattern,
                returning a list containing the resulting substrings. */
            return frame.getglobal("_compile").__call__(frame.getlocal(0), i$26).invoke("split", frame.getlocal(1), frame.getlocal(2));
        }
        
        private static PyObject findall$6(PyFrame frame) {
            /* Return a list of all non-overlapping matches in the string.
            
                If one or more groups are present in the pattern, return a
                list of groups; this will be a list of tuples if the pattern
                has more than one group.
            
                Empty matches are included in the result. */
            return frame.getglobal("_compile").__call__(frame.getlocal(0), i$26).invoke("findall", frame.getlocal(1));
        }
        
        private static PyObject finditer$7(PyFrame frame) {
            /* Return an iterator over all non-overlapping matches in the
                    string.  For each match, the iterator returns a match object.
            
                    Empty matches are included in the result. */
            return frame.getglobal("_compile").__call__(frame.getlocal(0), i$26).invoke("finditer", frame.getlocal(1));
        }
        
        private static PyObject compile$8(PyFrame frame) {
            /* Compile a regular expression pattern, returning a pattern object. */
            return frame.getglobal("_compile").__call__(frame.getlocal(0), frame.getlocal(1));
        }
        
        private static PyObject purge$9(PyFrame frame) {
            /* Clear the regular expression cache */
            frame.getglobal("_cache").invoke("clear");
            frame.getglobal("_cache_repl").invoke("clear");
            return Py.None;
        }
        
        private static PyObject template$10(PyFrame frame) {
            /* Compile a template pattern, returning a pattern object */
            return frame.getglobal("_compile").__call__(frame.getlocal(0), frame.getlocal(1)._or(frame.getglobal("T")));
        }
        
        private static PyObject escape$11(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject, t$1$PyObject, t$2$PyObject;
            
            // Code
            /* Escape all non-alphanumeric characters in pattern. */
            frame.setlocal(2, frame.getglobal("list").__call__(frame.getlocal(0)));
            t$0$PyObject = frame.getglobal("range").__call__(frame.getglobal("len").__call__(frame.getlocal(0))).__iter__();
            while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                frame.setlocal(1, t$1$PyObject);
                frame.setlocal(3, frame.getlocal(0).__getitem__(frame.getlocal(1)));
                if (((t$2$PyObject = ((t$2$PyObject = (s$39._le(t$2$PyObject = frame.getlocal(3)).__nonzero__() ? t$2$PyObject._le(s$40) : Py.Zero)).__nonzero__() ? t$2$PyObject : (s$41._le(t$2$PyObject = frame.getlocal(3)).__nonzero__() ? t$2$PyObject._le(s$42) : Py.Zero))).__nonzero__() ? t$2$PyObject : (s$43._le(t$2$PyObject = frame.getlocal(3)).__nonzero__() ? t$2$PyObject._le(s$44) : Py.Zero)).__not__().__nonzero__()) {
                    if (frame.getlocal(3)._eq(s$45).__nonzero__()) {
                        frame.getlocal(2).__setitem__(frame.getlocal(1), s$46);
                    }
                    else {
                        frame.getlocal(2).__setitem__(frame.getlocal(1), s$47._add(frame.getlocal(3)));
                    }
                }
            }
            return frame.getglobal("_join").__call__(frame.getlocal(2), frame.getlocal(0));
        }
        
        private static PyObject _join$12(PyFrame frame) {
            return frame.getglobal("string").__getattr__("join").__call__(frame.getlocal(0), frame.getlocal(1).__getslice__(null, i$26, null));
        }
        
        private static PyObject _compile$13(PyFrame frame) {
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            PyException t$0$PyException;
            
            // Code
            frame.setlocal(1, frame.getglobal("_cache").invoke("get", frame.getlocal(0)));
            if (frame.getlocal(1)._isnot(frame.getglobal("None")).__nonzero__()) {
                return frame.getlocal(1);
            }
            t$0$PyObject__ = org.python.core.Py.unpackSequence(frame.getlocal(0), 2);
            frame.setlocal(3, t$0$PyObject__[0]);
            frame.setlocal(2, t$0$PyObject__[1]);
            if (frame.getglobal("type").__call__(frame.getlocal(3))._is(frame.getglobal("_pattern_type")).__nonzero__()) {
                return frame.getlocal(3);
            }
            if (frame.getglobal("type").__call__(frame.getlocal(3))._notin(frame.getglobal("sre_compile").__getattr__("STRING_TYPES")).__nonzero__()) {
                throw Py.makeException(frame.getglobal("TypeError"), s$50);
            }
            try {
                frame.setlocal(1, frame.getglobal("sre_compile").__getattr__("compile").__call__(frame.getlocal(3), frame.getlocal(2)));
            }
            catch (Throwable x$0) {
                t$0$PyException = Py.setException(x$0, frame);
                if (Py.matchException(t$0$PyException, frame.getglobal("error"))) {
                    frame.setlocal(4, t$0$PyException.value);
                    throw Py.makeException(frame.getglobal("error"), frame.getlocal(4));
                }
                else throw t$0$PyException;
            }
            if (frame.getglobal("len").__call__(frame.getglobal("_cache"))._ge(frame.getglobal("_MAXCACHE")).__nonzero__()) {
                frame.getglobal("_cache").invoke("clear");
            }
            frame.getglobal("_cache").__setitem__(frame.getlocal(0), frame.getlocal(1));
            return frame.getlocal(1);
        }
        
        private static PyObject _compile_repl$14(PyFrame frame) {
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            PyException t$0$PyException;
            
            // Code
            frame.setlocal(1, frame.getglobal("_cache_repl").invoke("get", frame.getlocal(0)));
            if (frame.getlocal(1)._isnot(frame.getglobal("None")).__nonzero__()) {
                return frame.getlocal(1);
            }
            t$0$PyObject__ = org.python.core.Py.unpackSequence(frame.getlocal(0), 2);
            frame.setlocal(2, t$0$PyObject__[0]);
            frame.setlocal(3, t$0$PyObject__[1]);
            try {
                frame.setlocal(1, frame.getglobal("sre_parse").__getattr__("parse_template").__call__(frame.getlocal(2), frame.getlocal(3)));
            }
            catch (Throwable x$0) {
                t$0$PyException = Py.setException(x$0, frame);
                if (Py.matchException(t$0$PyException, frame.getglobal("error"))) {
                    frame.setlocal(4, t$0$PyException.value);
                    throw Py.makeException(frame.getglobal("error"), frame.getlocal(4));
                }
                else throw t$0$PyException;
            }
            if (frame.getglobal("len").__call__(frame.getglobal("_cache_repl"))._ge(frame.getglobal("_MAXCACHE")).__nonzero__()) {
                frame.getglobal("_cache_repl").invoke("clear");
            }
            frame.getglobal("_cache_repl").__setitem__(frame.getlocal(0), frame.getlocal(1));
            return frame.getlocal(1);
        }
        
        private static PyObject _expand$15(PyFrame frame) {
            frame.setlocal(2, frame.getglobal("sre_parse").__getattr__("parse_template").__call__(frame.getlocal(2), frame.getlocal(0)));
            return frame.getglobal("sre_parse").__getattr__("expand_template").__call__(frame.getlocal(2), frame.getlocal(1));
        }
        
        private static PyObject filter$16(PyFrame frame) {
            return frame.getglobal("sre_parse").__getattr__("expand_template").__call__(frame.getlocal(1), frame.getlocal(0));
        }
        
        private static PyObject _subx$17(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject;
            
            // Code
            frame.setlocal(1, frame.getglobal("_compile_repl").__call__(frame.getlocal(1), frame.getlocal(0)));
            if (((t$0$PyObject = frame.getlocal(1).__getitem__(i$26).__not__()).__nonzero__() ? frame.getglobal("len").__call__(frame.getlocal(1).__getitem__(i$51))._eq(i$51) : t$0$PyObject).__nonzero__()) {
                return frame.getlocal(1).__getitem__(i$51).__getitem__(i$26);
            }
            frame.setlocal(2, new PyFunction(frame.f_globals, new PyObject[] {frame.getlocal(1)}, c$15_filter));
            return frame.getlocal(2);
        }
        
        private static PyObject _pickle$18(PyFrame frame) {
            return new PyTuple(new PyObject[] {frame.getglobal("_compile"), new PyTuple(new PyObject[] {frame.getlocal(0).__getattr__("pattern"), frame.getlocal(0).__getattr__("flags")})});
        }
        
        private static PyObject __init__$19(PyFrame frame) {
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            PyObject t$0$PyObject, t$1$PyObject;
            
            // Code
            t$0$PyObject__ = org.python.core.imp.importFrom("sre_constants", new String[] {"BRANCH", "SUBPATTERN"}, frame);
            frame.setlocal(7, t$0$PyObject__[0]);
            frame.setlocal(4, t$0$PyObject__[1]);
            t$0$PyObject__ = null;
            frame.getlocal(0).__setattr__("lexicon", frame.getlocal(1));
            frame.setlocal(3, new PyList(new PyObject[] {}));
            frame.setlocal(8, frame.getglobal("sre_parse").__getattr__("Pattern").__call__());
            frame.getlocal(8).__setattr__("flags", frame.getlocal(2));
            t$0$PyObject = frame.getlocal(1).__iter__();
            while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                t$0$PyObject__ = org.python.core.Py.unpackSequence(t$1$PyObject, 2);
                frame.setlocal(5, t$0$PyObject__[0]);
                frame.setlocal(6, t$0$PyObject__[1]);
                frame.getlocal(3).invoke("append", frame.getglobal("sre_parse").__getattr__("SubPattern").__call__(frame.getlocal(8), new PyList(new PyObject[] {new PyTuple(new PyObject[] {frame.getlocal(4), new PyTuple(new PyObject[] {frame.getglobal("len").__call__(frame.getlocal(3))._add(i$51), frame.getglobal("sre_parse").__getattr__("parse").__call__(frame.getlocal(5), frame.getlocal(2))})})})));
            }
            frame.setlocal(3, frame.getglobal("sre_parse").__getattr__("SubPattern").__call__(frame.getlocal(8), new PyList(new PyObject[] {new PyTuple(new PyObject[] {frame.getlocal(7), new PyTuple(new PyObject[] {frame.getglobal("None"), frame.getlocal(3)})})})));
            frame.getlocal(8).__setattr__("groups", frame.getglobal("len").__call__(frame.getlocal(3)));
            frame.getlocal(0).__setattr__("scanner", frame.getglobal("sre_compile").__getattr__("compile").__call__(frame.getlocal(3)));
            return Py.None;
        }
        
        private static PyObject scan$20(PyFrame frame) {
            frame.setlocal(8, new PyList(new PyObject[] {}));
            frame.setlocal(2, frame.getlocal(8).__getattr__("append"));
            frame.setlocal(7, frame.getlocal(0).__getattr__("scanner").invoke("scanner", frame.getlocal(1)).__getattr__("match"));
            frame.setlocal(6, i$26);
            while (i$51.__nonzero__()) {
                frame.setlocal(3, frame.getlocal(7).__call__());
                if (frame.getlocal(3).__not__().__nonzero__()) {
                    break;
                }
                frame.setlocal(5, frame.getlocal(3).invoke("end"));
                if (frame.getlocal(6)._eq(frame.getlocal(5)).__nonzero__()) {
                    break;
                }
                frame.setlocal(4, frame.getlocal(0).__getattr__("lexicon").__getitem__(frame.getlocal(3).__getattr__("lastindex")._sub(i$51)).__getitem__(i$51));
                if (frame.getglobal("callable").__call__(frame.getlocal(4)).__nonzero__()) {
                    frame.getlocal(0).__setattr__("match", frame.getlocal(3));
                    frame.setlocal(4, frame.getlocal(4).__call__(frame.getlocal(0), frame.getlocal(3).invoke("group")));
                }
                if (frame.getlocal(4)._isnot(frame.getglobal("None")).__nonzero__()) {
                    frame.getlocal(2).__call__(frame.getlocal(4));
                }
                frame.setlocal(6, frame.getlocal(5));
            }
            return new PyTuple(new PyObject[] {frame.getlocal(8), frame.getlocal(1).__getslice__(frame.getlocal(6), null, null)});
        }
        
        private static PyObject Scanner$21(PyFrame frame) {
            frame.setlocal("__init__", new PyFunction(frame.f_globals, new PyObject[] {i$26}, c$18___init__));
            frame.setlocal("scan", new PyFunction(frame.f_globals, new PyObject[] {}, c$19_scan));
            return frame.getf_locals();
        }
        
        private static PyObject main$22(PyFrame frame) {
            frame.setglobal("__file__", s$52);
            
            // Temporary Variables
            PyObject t$0$PyObject;
            
            // Code
            /* Support for regular expressions (RE).
            
            This module provides regular expression matching operations similar to
            those found in Perl.  It supports both 8-bit and Unicode strings; both
            the pattern and the strings being processed can contain null bytes and
            characters outside the US ASCII range.
            
            Regular expressions can contain both special and ordinary characters.
            Most ordinary characters, like "A", "a", or "0", are the simplest
            regular expressions; they simply match themselves.  You can
            concatenate ordinary characters, so last matches the string 'last'.
            
            The special characters are:
                "."      Matches any character except a newline.
                "^"      Matches the start of the string.
                "$"      Matches the end of the string.
                "*"      Matches 0 or more (greedy) repetitions of the preceding RE.
                         Greedy means that it will match as many repetitions as possible.
                "+"      Matches 1 or more (greedy) repetitions of the preceding RE.
                "?"      Matches 0 or 1 (greedy) of the preceding RE.
                *?,+?,?? Non-greedy versions of the previous three special characters.
                {m,n}    Matches from m to n repetitions of the preceding RE.
                {m,n}?   Non-greedy version of the above.
                "\\\\"      Either escapes special characters or signals a special sequence.
                []       Indicates a set of characters.
                         A "^" as the first character indicates a complementing set.
                "|"      A|B, creates an RE that will match either A or B.
                (...)    Matches the RE inside the parentheses.
                         The contents can be retrieved or matched later in the string.
                (?iLmsux) Set the I, L, M, S, U, or X flag for the RE (see below).
                (?:...)  Non-grouping version of regular parentheses.
                (?P<name>...) The substring matched by the group is accessible by name.
                (?P=name)     Matches the text matched earlier by the group named name.
                (?#...)  A comment; ignored.
                (?=...)  Matches if ... matches next, but doesn't consume the string.
                (?!...)  Matches if ... doesn't match next.
            
            The special sequences consist of "\\\\" and a character from the list
            below.  If the ordinary character is not on the list, then the
            resulting RE will match the second character.
                \\number  Matches the contents of the group of the same number.
                \\A       Matches only at the start of the string.
                \\Z       Matches only at the end of the string.
                \\b       Matches the empty string, but only at the start or end of a word.
                \\B       Matches the empty string, but not at the start or end of a word.
                \\d       Matches any decimal digit; equivalent to the set [0-9].
                \\D       Matches any non-digit character; equivalent to the set [^0-9].
                \\s       Matches any whitespace character; equivalent to [ \\t\\n\\r\\f\\v].
                \\S       Matches any non-whitespace character; equiv. to [^ \\t\\n\\r\\f\\v].
                \\w       Matches any alphanumeric character; equivalent to [a-zA-Z0-9_].
                         With LOCALE, it will match the set [0-9_] plus characters defined
                         as letters for the current locale.
                \\W       Matches the complement of \\w.
                \\\\       Matches a literal backslash.
            
            This module exports the following functions:
                match    Match a regular expression pattern to the beginning of a string.
                search   Search a string for the presence of a pattern.
                sub      Substitute occurrences of a pattern found in a string.
                subn     Same as sub, but also return the number of substitutions made.
                split    Split a string by the occurrences of a pattern.
                findall  Find all occurrences of a pattern in a string.
                compile  Compile a pattern into a RegexObject.
                purge    Clear the regular expression cache.
                escape   Backslash all non-alphanumerics in a string.
            
            Some of the functions in this module takes flags as optional parameters:
                I  IGNORECASE  Perform case-insensitive matching.
                L  LOCALE      Make \\w, \\W, \\b, \\B, dependent on the current locale.
                M  MULTILINE   "^" matches the beginning of lines as well as the string.
                               "$" matches the end of lines as well as the string.
                S  DOTALL      "." matches any character at all, including the newline.
                X  VERBOSE     Ignore whitespace and comments for nicer looking RE's.
                U  UNICODE     Make \\w, \\W, \\b, \\B, dependent on the Unicode locale.
            
            This module also defines an exception 'error'.
            
             */
            frame.setlocal("sys", org.python.core.imp.importOne("sys", frame));
            frame.setlocal("sre_compile", org.python.core.imp.importOne("sre_compile", frame));
            frame.setlocal("sre_parse", org.python.core.imp.importOne("sre_parse", frame));
            frame.setlocal("__all__", new PyList(new PyObject[] {s$1, s$2, s$3, s$4, s$5, s$6, s$7, s$8, s$9, s$10, s$11, s$12, s$13, s$14, s$15, s$16, s$17, s$18, s$19, s$20, s$21, s$22, s$23}));
            frame.setlocal("__version__", s$24);
            frame.setlocal("string", org.python.core.imp.importOne("string", frame));
            t$0$PyObject = frame.getname("sre_compile").__getattr__("SRE_FLAG_IGNORECASE");
            frame.setlocal("I", t$0$PyObject);
            frame.setlocal("IGNORECASE", t$0$PyObject);
            t$0$PyObject = frame.getname("sre_compile").__getattr__("SRE_FLAG_LOCALE");
            frame.setlocal("L", t$0$PyObject);
            frame.setlocal("LOCALE", t$0$PyObject);
            t$0$PyObject = frame.getname("sre_compile").__getattr__("SRE_FLAG_UNICODE");
            frame.setlocal("U", t$0$PyObject);
            frame.setlocal("UNICODE", t$0$PyObject);
            t$0$PyObject = frame.getname("sre_compile").__getattr__("SRE_FLAG_MULTILINE");
            frame.setlocal("M", t$0$PyObject);
            frame.setlocal("MULTILINE", t$0$PyObject);
            t$0$PyObject = frame.getname("sre_compile").__getattr__("SRE_FLAG_DOTALL");
            frame.setlocal("S", t$0$PyObject);
            frame.setlocal("DOTALL", t$0$PyObject);
            t$0$PyObject = frame.getname("sre_compile").__getattr__("SRE_FLAG_VERBOSE");
            frame.setlocal("X", t$0$PyObject);
            frame.setlocal("VERBOSE", t$0$PyObject);
            t$0$PyObject = frame.getname("sre_compile").__getattr__("SRE_FLAG_TEMPLATE");
            frame.setlocal("T", t$0$PyObject);
            frame.setlocal("TEMPLATE", t$0$PyObject);
            frame.setlocal("DEBUG", frame.getname("sre_compile").__getattr__("SRE_FLAG_DEBUG"));
            frame.setlocal("error", frame.getname("sre_compile").__getattr__("error"));
            frame.setlocal("match", new PyFunction(frame.f_globals, new PyObject[] {i$26}, c$0_match));
            frame.setlocal("search", new PyFunction(frame.f_globals, new PyObject[] {i$26}, c$1_search));
            frame.setlocal("sub", new PyFunction(frame.f_globals, new PyObject[] {i$26}, c$2_sub));
            frame.setlocal("subn", new PyFunction(frame.f_globals, new PyObject[] {i$26}, c$3_subn));
            frame.setlocal("split", new PyFunction(frame.f_globals, new PyObject[] {i$26}, c$4_split));
            frame.setlocal("findall", new PyFunction(frame.f_globals, new PyObject[] {}, c$5_findall));
            if (frame.getname("sys").__getattr__("hexversion")._ge(i$32).__nonzero__()) {
                frame.getname("__all__").invoke("append", s$33);
                frame.setlocal("finditer", new PyFunction(frame.f_globals, new PyObject[] {}, c$6_finditer));
            }
            frame.setlocal("compile", new PyFunction(frame.f_globals, new PyObject[] {i$26}, c$7_compile));
            frame.setlocal("purge", new PyFunction(frame.f_globals, new PyObject[] {}, c$8_purge));
            frame.setlocal("template", new PyFunction(frame.f_globals, new PyObject[] {i$26}, c$9_template));
            frame.setlocal("escape", new PyFunction(frame.f_globals, new PyObject[] {}, c$10_escape));
            frame.setlocal("_cache", new PyDictionary(new PyObject[] {}));
            frame.setlocal("_cache_repl", new PyDictionary(new PyObject[] {}));
            frame.setlocal("_pattern_type", frame.getname("type").__call__(frame.getname("sre_compile").__getattr__("compile").__call__(s$48, i$26)));
            frame.setlocal("_MAXCACHE", i$49);
            frame.setlocal("_join", new PyFunction(frame.f_globals, new PyObject[] {}, c$11__join));
            frame.setlocal("_compile", new PyFunction(frame.f_globals, new PyObject[] {}, c$12__compile));
            frame.setlocal("_compile_repl", new PyFunction(frame.f_globals, new PyObject[] {}, c$13__compile_repl));
            frame.setlocal("_expand", new PyFunction(frame.f_globals, new PyObject[] {}, c$14__expand));
            frame.setlocal("_subx", new PyFunction(frame.f_globals, new PyObject[] {}, c$16__subx));
            frame.setlocal("copy_reg", org.python.core.imp.importOne("copy_reg", frame));
            frame.setlocal("_pickle", new PyFunction(frame.f_globals, new PyObject[] {}, c$17__pickle));
            frame.getname("copy_reg").__getattr__("pickle").__call__(frame.getname("_pattern_type"), frame.getname("_pickle"), frame.getname("_compile"));
            frame.setlocal("Scanner", Py.makeClass("Scanner", new PyObject[] {}, c$20_Scanner, null));
            return Py.None;
        }
        
    }
    public static void moduleDictInit(PyObject dict) {
        dict.__setitem__("__name__", new PyString("sre"));
        Py.runCode(new _PyInner().getMain(), dict, dict);
    }
    
    public static void main(String[] args) throws java.lang.Exception {
        String[] newargs = new String[args.length+1];
        newargs[0] = "sre";
        java.lang.System.arraycopy(args, 0, newargs, 1, args.length);
        Py.runMain(sre._PyInner.class, newargs, sre.jpy$packages, sre.jpy$mainProperties, "", new String[] {"string", "random", "traceback", "sre_compile", "atexit", "warnings", "popen2", "getopt", "sre", "sre_constants", "StringIO", "QAsystem", "javaos", "repr", "copy_reg", "re", "linecache", "javapath", "UserDict", "copy", "threading", "stat", "sre_parse", "javashell"});
    }
    
}

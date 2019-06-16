import org.python.core.*;

public class sre_constants extends java.lang.Object {
    static String[] jpy$mainProperties = new String[] {"python.modules.builtin", "exceptions:org.python.core.exceptions"};
    static String[] jpy$proxyProperties = new String[] {"python.modules.builtin", "exceptions:org.python.core.exceptions", "python.options.showJavaExceptions", "true"};
    static String[] jpy$packages = new String[] {"org.python.core", null, "java.lang", null, "java.io", null, "java.util", null};
    
    public static class _PyInner extends PyFunctionTable implements PyRunnable {
        private static PyObject s$0;
        private static PyObject i$1;
        private static PyObject i$2;
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
        private static PyObject s$26;
        private static PyObject s$27;
        private static PyObject s$28;
        private static PyObject s$29;
        private static PyObject s$30;
        private static PyObject s$31;
        private static PyObject s$32;
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
        private static PyObject s$49;
        private static PyObject s$50;
        private static PyObject s$51;
        private static PyObject s$52;
        private static PyObject s$53;
        private static PyObject s$54;
        private static PyObject s$55;
        private static PyObject s$56;
        private static PyObject s$57;
        private static PyObject s$58;
        private static PyObject s$59;
        private static PyObject s$60;
        private static PyObject s$61;
        private static PyObject s$62;
        private static PyObject s$63;
        private static PyObject s$64;
        private static PyObject i$65;
        private static PyObject i$66;
        private static PyObject i$67;
        private static PyObject i$68;
        private static PyObject i$69;
        private static PyObject i$70;
        private static PyObject i$71;
        private static PyObject i$72;
        private static PyObject i$73;
        private static PyObject s$74;
        private static PyObject s$75;
        private static PyObject s$76;
        private static PyObject s$77;
        private static PyObject s$78;
        private static PyObject s$79;
        private static PyObject s$80;
        private static PyObject s$81;
        private static PyObject s$82;
        private static PyObject s$83;
        private static PyObject s$84;
        private static PyObject s$85;
        private static PyObject s$86;
        private static PyObject s$87;
        private static PyObject s$88;
        private static PyObject s$89;
        private static PyObject s$90;
        private static PyObject s$91;
        private static PyObject s$92;
        private static PyObject s$93;
        private static PyFunctionTable funcTable;
        private static PyCode c$0_error;
        private static PyCode c$1_makedict;
        private static PyCode c$2_lambda;
        private static PyCode c$3_dump;
        private static PyCode c$4_main;
        private static void initConstants() {
            s$0 = Py.newString("Internal support module for sre");
            i$1 = Py.newInteger(20010701);
            i$2 = Py.newInteger(65535);
            s$3 = Py.newString("failure");
            s$4 = Py.newString("success");
            s$5 = Py.newString("any");
            s$6 = Py.newString("any_all");
            s$7 = Py.newString("assert");
            s$8 = Py.newString("assert_not");
            s$9 = Py.newString("at");
            s$10 = Py.newString("bigcharset");
            s$11 = Py.newString("branch");
            s$12 = Py.newString("call");
            s$13 = Py.newString("category");
            s$14 = Py.newString("charset");
            s$15 = Py.newString("groupref");
            s$16 = Py.newString("groupref_ignore");
            s$17 = Py.newString("in");
            s$18 = Py.newString("in_ignore");
            s$19 = Py.newString("info");
            s$20 = Py.newString("jump");
            s$21 = Py.newString("literal");
            s$22 = Py.newString("literal_ignore");
            s$23 = Py.newString("mark");
            s$24 = Py.newString("max_repeat");
            s$25 = Py.newString("max_until");
            s$26 = Py.newString("min_repeat");
            s$27 = Py.newString("min_until");
            s$28 = Py.newString("negate");
            s$29 = Py.newString("not_literal");
            s$30 = Py.newString("not_literal_ignore");
            s$31 = Py.newString("range");
            s$32 = Py.newString("repeat");
            s$33 = Py.newString("repeat_one");
            s$34 = Py.newString("subpattern");
            s$35 = Py.newString("at_beginning");
            s$36 = Py.newString("at_beginning_line");
            s$37 = Py.newString("at_beginning_string");
            s$38 = Py.newString("at_boundary");
            s$39 = Py.newString("at_non_boundary");
            s$40 = Py.newString("at_end");
            s$41 = Py.newString("at_end_line");
            s$42 = Py.newString("at_end_string");
            s$43 = Py.newString("at_loc_boundary");
            s$44 = Py.newString("at_loc_non_boundary");
            s$45 = Py.newString("at_uni_boundary");
            s$46 = Py.newString("at_uni_non_boundary");
            s$47 = Py.newString("category_digit");
            s$48 = Py.newString("category_not_digit");
            s$49 = Py.newString("category_space");
            s$50 = Py.newString("category_not_space");
            s$51 = Py.newString("category_word");
            s$52 = Py.newString("category_not_word");
            s$53 = Py.newString("category_linebreak");
            s$54 = Py.newString("category_not_linebreak");
            s$55 = Py.newString("category_loc_word");
            s$56 = Py.newString("category_loc_not_word");
            s$57 = Py.newString("category_uni_digit");
            s$58 = Py.newString("category_uni_not_digit");
            s$59 = Py.newString("category_uni_space");
            s$60 = Py.newString("category_uni_not_space");
            s$61 = Py.newString("category_uni_word");
            s$62 = Py.newString("category_uni_not_word");
            s$63 = Py.newString("category_uni_linebreak");
            s$64 = Py.newString("category_uni_not_linebreak");
            i$65 = Py.newInteger(0);
            i$66 = Py.newInteger(1);
            i$67 = Py.newInteger(2);
            i$68 = Py.newInteger(4);
            i$69 = Py.newInteger(8);
            i$70 = Py.newInteger(16);
            i$71 = Py.newInteger(32);
            i$72 = Py.newInteger(64);
            i$73 = Py.newInteger(128);
            s$74 = Py.newString("__main__");
            s$75 = Py.newString("#define %s_%s %s\012");
            s$76 = Py.newString("sre_constants.h");
            s$77 = Py.newString("w");
            s$78 = Py.newString("/*\012 * Secret Labs' Regular Expression Engine\012 *\012 * regular expression matching engine\012 *\012 * NOTE: This file is generated by sre_constants.py.  If you need\012 * to change anything in here, edit sre_constants.py and run it.\012 *\012 * Copyright (c) 1997-2001 by Secret Labs AB.  All rights reserved.\012 *\012 * See the _sre.c file for information on usage and redistribution.\012 */\012\012");
            s$79 = Py.newString("#define SRE_MAGIC %d\012");
            s$80 = Py.newString("SRE_OP");
            s$81 = Py.newString("SRE");
            s$82 = Py.newString("#define SRE_FLAG_TEMPLATE %d\012");
            s$83 = Py.newString("#define SRE_FLAG_IGNORECASE %d\012");
            s$84 = Py.newString("#define SRE_FLAG_LOCALE %d\012");
            s$85 = Py.newString("#define SRE_FLAG_MULTILINE %d\012");
            s$86 = Py.newString("#define SRE_FLAG_DOTALL %d\012");
            s$87 = Py.newString("#define SRE_FLAG_UNICODE %d\012");
            s$88 = Py.newString("#define SRE_FLAG_VERBOSE %d\012");
            s$89 = Py.newString("#define SRE_INFO_PREFIX %d\012");
            s$90 = Py.newString("#define SRE_INFO_LITERAL %d\012");
            s$91 = Py.newString("#define SRE_INFO_CHARSET %d\012");
            s$92 = Py.newString("done");
            s$93 = Py.newString("F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_constants.py");
            funcTable = new _PyInner();
            c$0_error = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_constants.py", "error", false, false, funcTable, 0, null, null, 0, 16);
            c$1_makedict = Py.newCode(1, new String[] {"list", "i", "item", "d"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_constants.py", "makedict", false, false, funcTable, 1, null, null, 0, 17);
            c$2_lambda = Py.newCode(2, new String[] {"a", "b"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_constants.py", "<lambda>", false, false, funcTable, 2, null, null, 0, 17);
            c$3_dump = Py.newCode(3, new String[] {"f", "d", "prefix", "v", "k", "items"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_constants.py", "dump", false, false, funcTable, 3, null, null, 0, 17);
            c$4_main = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_constants.py", "main", false, false, funcTable, 4, null, null, 0, 16);
        }
        
        
        public PyCode getMain() {
            if (c$4_main == null) _PyInner.initConstants();
            return c$4_main;
        }
        
        public PyObject call_function(int index, PyFrame frame) {
            switch (index){
                case 0:
                return _PyInner.error$1(frame);
                case 1:
                return _PyInner.makedict$2(frame);
                case 2:
                return _PyInner.lambda$3(frame);
                case 3:
                return _PyInner.dump$4(frame);
                case 4:
                return _PyInner.main$5(frame);
                default:
                return null;
            }
        }
        
        private static PyObject error$1(PyFrame frame) {
            // pass
            return frame.getf_locals();
        }
        
        private static PyObject makedict$2(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject, t$1$PyObject;
            
            // Code
            frame.setlocal(3, new PyDictionary(new PyObject[] {}));
            frame.setlocal(1, i$65);
            t$0$PyObject = frame.getlocal(0).__iter__();
            while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                frame.setlocal(2, t$1$PyObject);
                frame.getlocal(3).__setitem__(frame.getlocal(2), frame.getlocal(1));
                frame.setlocal(1, frame.getlocal(1)._add(i$66));
            }
            return frame.getlocal(3);
        }
        
        private static PyObject lambda$3(PyFrame frame) {
            return frame.getglobal("cmp").__call__(frame.getlocal(0).__getitem__(i$66), frame.getlocal(1).__getitem__(i$66));
        }
        
        private static PyObject dump$4(PyFrame frame) {
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            PyObject t$0$PyObject, t$1$PyObject;
            
            // Code
            frame.setlocal(5, frame.getlocal(1).invoke("items"));
            frame.getlocal(5).invoke("sort", new PyFunction(frame.f_globals, new PyObject[] {}, c$2_lambda));
            t$0$PyObject = frame.getlocal(5).__iter__();
            while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                t$0$PyObject__ = org.python.core.Py.unpackSequence(t$1$PyObject, 2);
                frame.setlocal(4, t$0$PyObject__[0]);
                frame.setlocal(3, t$0$PyObject__[1]);
                frame.getlocal(0).invoke("write", s$75._mod(new PyTuple(new PyObject[] {frame.getlocal(2), frame.getglobal("string").__getattr__("upper").__call__(frame.getlocal(4)), frame.getlocal(3)})));
            }
            return Py.None;
        }
        
        private static PyObject main$5(PyFrame frame) {
            frame.setglobal("__file__", s$93);
            
            /* Internal support module for sre */
            frame.setlocal("MAGIC", i$1);
            frame.setlocal("MAXREPEAT", i$2);
            frame.setlocal("error", Py.makeClass("error", new PyObject[] {frame.getname("Exception")}, c$0_error, null));
            frame.setlocal("FAILURE", s$3);
            frame.setlocal("SUCCESS", s$4);
            frame.setlocal("ANY", s$5);
            frame.setlocal("ANY_ALL", s$6);
            frame.setlocal("ASSERT", s$7);
            frame.setlocal("ASSERT_NOT", s$8);
            frame.setlocal("AT", s$9);
            frame.setlocal("BIGCHARSET", s$10);
            frame.setlocal("BRANCH", s$11);
            frame.setlocal("CALL", s$12);
            frame.setlocal("CATEGORY", s$13);
            frame.setlocal("CHARSET", s$14);
            frame.setlocal("GROUPREF", s$15);
            frame.setlocal("GROUPREF_IGNORE", s$16);
            frame.setlocal("IN", s$17);
            frame.setlocal("IN_IGNORE", s$18);
            frame.setlocal("INFO", s$19);
            frame.setlocal("JUMP", s$20);
            frame.setlocal("LITERAL", s$21);
            frame.setlocal("LITERAL_IGNORE", s$22);
            frame.setlocal("MARK", s$23);
            frame.setlocal("MAX_REPEAT", s$24);
            frame.setlocal("MAX_UNTIL", s$25);
            frame.setlocal("MIN_REPEAT", s$26);
            frame.setlocal("MIN_UNTIL", s$27);
            frame.setlocal("NEGATE", s$28);
            frame.setlocal("NOT_LITERAL", s$29);
            frame.setlocal("NOT_LITERAL_IGNORE", s$30);
            frame.setlocal("RANGE", s$31);
            frame.setlocal("REPEAT", s$32);
            frame.setlocal("REPEAT_ONE", s$33);
            frame.setlocal("SUBPATTERN", s$34);
            frame.setlocal("AT_BEGINNING", s$35);
            frame.setlocal("AT_BEGINNING_LINE", s$36);
            frame.setlocal("AT_BEGINNING_STRING", s$37);
            frame.setlocal("AT_BOUNDARY", s$38);
            frame.setlocal("AT_NON_BOUNDARY", s$39);
            frame.setlocal("AT_END", s$40);
            frame.setlocal("AT_END_LINE", s$41);
            frame.setlocal("AT_END_STRING", s$42);
            frame.setlocal("AT_LOC_BOUNDARY", s$43);
            frame.setlocal("AT_LOC_NON_BOUNDARY", s$44);
            frame.setlocal("AT_UNI_BOUNDARY", s$45);
            frame.setlocal("AT_UNI_NON_BOUNDARY", s$46);
            frame.setlocal("CATEGORY_DIGIT", s$47);
            frame.setlocal("CATEGORY_NOT_DIGIT", s$48);
            frame.setlocal("CATEGORY_SPACE", s$49);
            frame.setlocal("CATEGORY_NOT_SPACE", s$50);
            frame.setlocal("CATEGORY_WORD", s$51);
            frame.setlocal("CATEGORY_NOT_WORD", s$52);
            frame.setlocal("CATEGORY_LINEBREAK", s$53);
            frame.setlocal("CATEGORY_NOT_LINEBREAK", s$54);
            frame.setlocal("CATEGORY_LOC_WORD", s$55);
            frame.setlocal("CATEGORY_LOC_NOT_WORD", s$56);
            frame.setlocal("CATEGORY_UNI_DIGIT", s$57);
            frame.setlocal("CATEGORY_UNI_NOT_DIGIT", s$58);
            frame.setlocal("CATEGORY_UNI_SPACE", s$59);
            frame.setlocal("CATEGORY_UNI_NOT_SPACE", s$60);
            frame.setlocal("CATEGORY_UNI_WORD", s$61);
            frame.setlocal("CATEGORY_UNI_NOT_WORD", s$62);
            frame.setlocal("CATEGORY_UNI_LINEBREAK", s$63);
            frame.setlocal("CATEGORY_UNI_NOT_LINEBREAK", s$64);
            frame.setlocal("OPCODES", new PyList(new PyObject[] {frame.getname("FAILURE"), frame.getname("SUCCESS"), frame.getname("ANY"), frame.getname("ANY_ALL"), frame.getname("ASSERT"), frame.getname("ASSERT_NOT"), frame.getname("AT"), frame.getname("BRANCH"), frame.getname("CALL"), frame.getname("CATEGORY"), frame.getname("CHARSET"), frame.getname("BIGCHARSET"), frame.getname("GROUPREF"), frame.getname("GROUPREF_IGNORE"), frame.getname("IN"), frame.getname("IN_IGNORE"), frame.getname("INFO"), frame.getname("JUMP"), frame.getname("LITERAL"), frame.getname("LITERAL_IGNORE"), frame.getname("MARK"), frame.getname("MAX_UNTIL"), frame.getname("MIN_UNTIL"), frame.getname("NOT_LITERAL"), frame.getname("NOT_LITERAL_IGNORE"), frame.getname("NEGATE"), frame.getname("RANGE"), frame.getname("REPEAT"), frame.getname("REPEAT_ONE"), frame.getname("SUBPATTERN")}));
            frame.setlocal("ATCODES", new PyList(new PyObject[] {frame.getname("AT_BEGINNING"), frame.getname("AT_BEGINNING_LINE"), frame.getname("AT_BEGINNING_STRING"), frame.getname("AT_BOUNDARY"), frame.getname("AT_NON_BOUNDARY"), frame.getname("AT_END"), frame.getname("AT_END_LINE"), frame.getname("AT_END_STRING"), frame.getname("AT_LOC_BOUNDARY"), frame.getname("AT_LOC_NON_BOUNDARY"), frame.getname("AT_UNI_BOUNDARY"), frame.getname("AT_UNI_NON_BOUNDARY")}));
            frame.setlocal("CHCODES", new PyList(new PyObject[] {frame.getname("CATEGORY_DIGIT"), frame.getname("CATEGORY_NOT_DIGIT"), frame.getname("CATEGORY_SPACE"), frame.getname("CATEGORY_NOT_SPACE"), frame.getname("CATEGORY_WORD"), frame.getname("CATEGORY_NOT_WORD"), frame.getname("CATEGORY_LINEBREAK"), frame.getname("CATEGORY_NOT_LINEBREAK"), frame.getname("CATEGORY_LOC_WORD"), frame.getname("CATEGORY_LOC_NOT_WORD"), frame.getname("CATEGORY_UNI_DIGIT"), frame.getname("CATEGORY_UNI_NOT_DIGIT"), frame.getname("CATEGORY_UNI_SPACE"), frame.getname("CATEGORY_UNI_NOT_SPACE"), frame.getname("CATEGORY_UNI_WORD"), frame.getname("CATEGORY_UNI_NOT_WORD"), frame.getname("CATEGORY_UNI_LINEBREAK"), frame.getname("CATEGORY_UNI_NOT_LINEBREAK")}));
            frame.setlocal("makedict", new PyFunction(frame.f_globals, new PyObject[] {}, c$1_makedict));
            frame.setlocal("OPCODES", frame.getname("makedict").__call__(frame.getname("OPCODES")));
            frame.setlocal("ATCODES", frame.getname("makedict").__call__(frame.getname("ATCODES")));
            frame.setlocal("CHCODES", frame.getname("makedict").__call__(frame.getname("CHCODES")));
            frame.setlocal("OP_IGNORE", new PyDictionary(new PyObject[] {frame.getname("GROUPREF"), frame.getname("GROUPREF_IGNORE"), frame.getname("IN"), frame.getname("IN_IGNORE"), frame.getname("LITERAL"), frame.getname("LITERAL_IGNORE"), frame.getname("NOT_LITERAL"), frame.getname("NOT_LITERAL_IGNORE")}));
            frame.setlocal("AT_MULTILINE", new PyDictionary(new PyObject[] {frame.getname("AT_BEGINNING"), frame.getname("AT_BEGINNING_LINE"), frame.getname("AT_END"), frame.getname("AT_END_LINE")}));
            frame.setlocal("AT_LOCALE", new PyDictionary(new PyObject[] {frame.getname("AT_BOUNDARY"), frame.getname("AT_LOC_BOUNDARY"), frame.getname("AT_NON_BOUNDARY"), frame.getname("AT_LOC_NON_BOUNDARY")}));
            frame.setlocal("AT_UNICODE", new PyDictionary(new PyObject[] {frame.getname("AT_BOUNDARY"), frame.getname("AT_UNI_BOUNDARY"), frame.getname("AT_NON_BOUNDARY"), frame.getname("AT_UNI_NON_BOUNDARY")}));
            frame.setlocal("CH_LOCALE", new PyDictionary(new PyObject[] {frame.getname("CATEGORY_DIGIT"), frame.getname("CATEGORY_DIGIT"), frame.getname("CATEGORY_NOT_DIGIT"), frame.getname("CATEGORY_NOT_DIGIT"), frame.getname("CATEGORY_SPACE"), frame.getname("CATEGORY_SPACE"), frame.getname("CATEGORY_NOT_SPACE"), frame.getname("CATEGORY_NOT_SPACE"), frame.getname("CATEGORY_WORD"), frame.getname("CATEGORY_LOC_WORD"), frame.getname("CATEGORY_NOT_WORD"), frame.getname("CATEGORY_LOC_NOT_WORD"), frame.getname("CATEGORY_LINEBREAK"), frame.getname("CATEGORY_LINEBREAK"), frame.getname("CATEGORY_NOT_LINEBREAK"), frame.getname("CATEGORY_NOT_LINEBREAK")}));
            frame.setlocal("CH_UNICODE", new PyDictionary(new PyObject[] {frame.getname("CATEGORY_DIGIT"), frame.getname("CATEGORY_UNI_DIGIT"), frame.getname("CATEGORY_NOT_DIGIT"), frame.getname("CATEGORY_UNI_NOT_DIGIT"), frame.getname("CATEGORY_SPACE"), frame.getname("CATEGORY_UNI_SPACE"), frame.getname("CATEGORY_NOT_SPACE"), frame.getname("CATEGORY_UNI_NOT_SPACE"), frame.getname("CATEGORY_WORD"), frame.getname("CATEGORY_UNI_WORD"), frame.getname("CATEGORY_NOT_WORD"), frame.getname("CATEGORY_UNI_NOT_WORD"), frame.getname("CATEGORY_LINEBREAK"), frame.getname("CATEGORY_UNI_LINEBREAK"), frame.getname("CATEGORY_NOT_LINEBREAK"), frame.getname("CATEGORY_UNI_NOT_LINEBREAK")}));
            frame.setlocal("SRE_FLAG_TEMPLATE", i$66);
            frame.setlocal("SRE_FLAG_IGNORECASE", i$67);
            frame.setlocal("SRE_FLAG_LOCALE", i$68);
            frame.setlocal("SRE_FLAG_MULTILINE", i$69);
            frame.setlocal("SRE_FLAG_DOTALL", i$70);
            frame.setlocal("SRE_FLAG_UNICODE", i$71);
            frame.setlocal("SRE_FLAG_VERBOSE", i$72);
            frame.setlocal("SRE_FLAG_DEBUG", i$73);
            frame.setlocal("SRE_INFO_PREFIX", i$66);
            frame.setlocal("SRE_INFO_LITERAL", i$67);
            frame.setlocal("SRE_INFO_CHARSET", i$68);
            if (frame.getname("__name__")._eq(s$74).__nonzero__()) {
                frame.setlocal("string", org.python.core.imp.importOne("string", frame));
                frame.setlocal("dump", new PyFunction(frame.f_globals, new PyObject[] {}, c$3_dump));
                frame.setlocal("f", frame.getname("open").__call__(s$76, s$77));
                frame.getname("f").invoke("write", s$78);
                frame.getname("f").invoke("write", s$79._mod(frame.getname("MAGIC")));
                frame.getname("dump").__call__(frame.getname("f"), frame.getname("OPCODES"), s$80);
                frame.getname("dump").__call__(frame.getname("f"), frame.getname("ATCODES"), s$81);
                frame.getname("dump").__call__(frame.getname("f"), frame.getname("CHCODES"), s$81);
                frame.getname("f").invoke("write", s$82._mod(frame.getname("SRE_FLAG_TEMPLATE")));
                frame.getname("f").invoke("write", s$83._mod(frame.getname("SRE_FLAG_IGNORECASE")));
                frame.getname("f").invoke("write", s$84._mod(frame.getname("SRE_FLAG_LOCALE")));
                frame.getname("f").invoke("write", s$85._mod(frame.getname("SRE_FLAG_MULTILINE")));
                frame.getname("f").invoke("write", s$86._mod(frame.getname("SRE_FLAG_DOTALL")));
                frame.getname("f").invoke("write", s$87._mod(frame.getname("SRE_FLAG_UNICODE")));
                frame.getname("f").invoke("write", s$88._mod(frame.getname("SRE_FLAG_VERBOSE")));
                frame.getname("f").invoke("write", s$89._mod(frame.getname("SRE_INFO_PREFIX")));
                frame.getname("f").invoke("write", s$90._mod(frame.getname("SRE_INFO_LITERAL")));
                frame.getname("f").invoke("write", s$91._mod(frame.getname("SRE_INFO_CHARSET")));
                frame.getname("f").invoke("close");
                Py.println(Py.None, s$92);
            }
            return Py.None;
        }
        
    }
    public static void moduleDictInit(PyObject dict) {
        dict.__setitem__("__name__", new PyString("sre_constants"));
        Py.runCode(new _PyInner().getMain(), dict, dict);
    }
    
    public static void main(String[] args) throws java.lang.Exception {
        String[] newargs = new String[args.length+1];
        newargs[0] = "sre_constants";
        java.lang.System.arraycopy(args, 0, newargs, 1, args.length);
        Py.runMain(sre_constants._PyInner.class, newargs, sre_constants.jpy$packages, sre_constants.jpy$mainProperties, "", new String[] {"string", "random", "traceback", "sre_compile", "atexit", "warnings", "popen2", "getopt", "sre", "sre_constants", "StringIO", "QAsystem", "javaos", "repr", "copy_reg", "re", "linecache", "javapath", "UserDict", "copy", "threading", "stat", "sre_parse", "javashell"});
    }
    
}

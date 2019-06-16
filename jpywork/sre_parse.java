import org.python.core.*;

public class sre_parse extends java.lang.Object {
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
        private static PyObject i$40;
        private static PyObject i$41;
        private static PyObject i$42;
        private static PyObject s$43;
        private static PyObject s$44;
        private static PyObject s$45;
        private static PyObject s$46;
        private static PyObject s$47;
        private static PyObject l$48;
        private static PyObject i$49;
        private static PyObject s$50;
        private static PyObject s$51;
        private static PyObject s$52;
        private static PyObject s$53;
        private static PyObject s$54;
        private static PyObject s$55;
        private static PyObject s$56;
        private static PyObject s$57;
        private static PyObject i$58;
        private static PyObject s$59;
        private static PyObject i$60;
        private static PyObject i$61;
        private static PyObject i$62;
        private static PyObject s$63;
        private static PyObject s$64;
        private static PyObject s$65;
        private static PyObject s$66;
        private static PyObject s$67;
        private static PyObject s$68;
        private static PyObject s$69;
        private static PyObject s$70;
        private static PyObject s$71;
        private static PyObject s$72;
        private static PyObject s$73;
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
        private static PyObject s$94;
        private static PyObject s$95;
        private static PyObject s$96;
        private static PyObject s$97;
        private static PyObject s$98;
        private static PyObject s$99;
        private static PyObject s$100;
        private static PyObject s$101;
        private static PyObject s$102;
        private static PyObject s$103;
        private static PyObject s$104;
        private static PyObject s$105;
        private static PyObject s$106;
        private static PyObject i$107;
        private static PyObject s$108;
        private static PyObject s$109;
        private static PyFunctionTable funcTable;
        private static PyCode c$0___init__;
        private static PyCode c$1_opengroup;
        private static PyCode c$2_closegroup;
        private static PyCode c$3_checkgroup;
        private static PyCode c$4_Pattern;
        private static PyCode c$5___init__;
        private static PyCode c$6_dump;
        private static PyCode c$7___repr__;
        private static PyCode c$8___len__;
        private static PyCode c$9___delitem__;
        private static PyCode c$10___getitem__;
        private static PyCode c$11___setitem__;
        private static PyCode c$12___getslice__;
        private static PyCode c$13_insert;
        private static PyCode c$14_append;
        private static PyCode c$15_getwidth;
        private static PyCode c$16_SubPattern;
        private static PyCode c$17___init__;
        private static PyCode c$18___next;
        private static PyCode c$19_match;
        private static PyCode c$20_get;
        private static PyCode c$21_tell;
        private static PyCode c$22_seek;
        private static PyCode c$23_Tokenizer;
        private static PyCode c$24_isident;
        private static PyCode c$25_isdigit;
        private static PyCode c$26_isname;
        private static PyCode c$27__group;
        private static PyCode c$28__class_escape;
        private static PyCode c$29__escape;
        private static PyCode c$30__parse_sub;
        private static PyCode c$31__parse;
        private static PyCode c$32_parse;
        private static PyCode c$33_literal;
        private static PyCode c$34_parse_template;
        private static PyCode c$35_expand_template;
        private static PyCode c$36_main;
        private static void initConstants() {
            s$0 = Py.newString("Internal support module for sre");
            s$1 = Py.newString(".\\[{()*+?^$|");
            s$2 = Py.newString("*+?{");
            s$3 = Py.newString("0123456789");
            s$4 = Py.newString("01234567");
            s$5 = Py.newString("0123456789abcdefABCDEF");
            s$6 = Py.newString(" \011\012\015\013\014");
            s$7 = Py.newString("\\a");
            s$8 = Py.newString("\007");
            s$9 = Py.newString("\\b");
            s$10 = Py.newString("\010");
            s$11 = Py.newString("\\f");
            s$12 = Py.newString("\014");
            s$13 = Py.newString("\\n");
            s$14 = Py.newString("\012");
            s$15 = Py.newString("\\r");
            s$16 = Py.newString("\015");
            s$17 = Py.newString("\\t");
            s$18 = Py.newString("\011");
            s$19 = Py.newString("\\v");
            s$20 = Py.newString("\013");
            s$21 = Py.newString("\\\\");
            s$22 = Py.newString("\\");
            s$23 = Py.newString("\\A");
            s$24 = Py.newString("\\B");
            s$25 = Py.newString("\\d");
            s$26 = Py.newString("\\D");
            s$27 = Py.newString("\\s");
            s$28 = Py.newString("\\S");
            s$29 = Py.newString("\\w");
            s$30 = Py.newString("\\W");
            s$31 = Py.newString("\\Z");
            s$32 = Py.newString("i");
            s$33 = Py.newString("L");
            s$34 = Py.newString("m");
            s$35 = Py.newString("s");
            s$36 = Py.newString("x");
            s$37 = Py.newString("t");
            s$38 = Py.newString("u");
            s$39 = Py.newString("10");
            i$40 = Py.newInteger(8);
            i$41 = Py.newInteger(0);
            i$42 = Py.newInteger(1);
            s$43 = Py.newString("redefinition of group name %s as group %d; was group %d");
            s$44 = Py.newString("  ");
            s$45 = Py.newString("in");
            s$46 = Py.newString("branch");
            s$47 = Py.newString("or");
            l$48 = Py.newLong("0");
            i$49 = Py.newInteger(2);
            s$50 = Py.newString("bogus escape (end of line)");
            s$51 = Py.newString("a");
            s$52 = Py.newString("z");
            s$53 = Py.newString("A");
            s$54 = Py.newString("Z");
            s$55 = Py.newString("_");
            s$56 = Py.newString("0");
            s$57 = Py.newString("9");
            i$58 = Py.newInteger(4);
            s$59 = Py.newString("bogus escape: %s");
            i$60 = Py.newInteger(16);
            i$61 = Py.newInteger(255);
            i$62 = Py.newInteger(5);
            s$63 = Py.newString("cannot refer to open group");
            s$64 = Py.newString("|");
            s$65 = Py.newString(")");
            s$66 = Py.newString("pattern not properly closed");
            s$67 = Py.newString("#");
            s$68 = Py.newString("[");
            s$69 = Py.newString("^");
            s$70 = Py.newString("]");
            s$71 = Py.newString("unexpected end of regular expression");
            s$72 = Py.newString("-");
            s$73 = Py.newString("bad character range");
            s$74 = Py.newString("?");
            s$75 = Py.newString("*");
            s$76 = Py.newString("+");
            s$77 = Py.newString("{");
            s$78 = Py.newString("");
            s$79 = Py.newString(",");
            s$80 = Py.newString("}");
            s$81 = Py.newString("bad repeat interval");
            s$82 = Py.newString("not supported");
            s$83 = Py.newString("nothing to repeat");
            s$84 = Py.newString("multiple repeat");
            s$85 = Py.newString(".");
            s$86 = Py.newString("(");
            s$87 = Py.newString("P");
            s$88 = Py.newString("<");
            s$89 = Py.newString("unterminated name");
            s$90 = Py.newString(">");
            s$91 = Py.newString("bad character in group name");
            s$92 = Py.newString("=");
            s$93 = Py.newString("unknown group name");
            s$94 = Py.newString("unexpected end of pattern");
            s$95 = Py.newString("unknown specifier: ?P%s");
            s$96 = Py.newString(":");
            s$97 = Py.newString("unbalanced parenthesis");
            s$98 = Py.newString("!");
            s$99 = Py.newString("syntax error");
            s$100 = Py.newString("unknown extension");
            s$101 = Py.newString("$");
            s$102 = Py.newString("parser error");
            s$103 = Py.newString("bogus characters at end of regular expression");
            s$104 = Py.newString("\\g");
            s$105 = Py.newString("unterminated group name");
            s$106 = Py.newString("bad group name");
            i$107 = Py.newInteger(6);
            s$108 = Py.newString("empty group");
            s$109 = Py.newString("F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_parse.py");
            funcTable = new _PyInner();
            c$0___init__ = Py.newCode(1, new String[] {"self"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_parse.py", "__init__", false, false, funcTable, 0, null, null, 0, 17);
            c$1_opengroup = Py.newCode(2, new String[] {"self", "name", "ogid", "gid"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_parse.py", "opengroup", false, false, funcTable, 1, null, null, 0, 17);
            c$2_closegroup = Py.newCode(2, new String[] {"self", "gid"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_parse.py", "closegroup", false, false, funcTable, 2, null, null, 0, 17);
            c$3_checkgroup = Py.newCode(2, new String[] {"self", "gid"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_parse.py", "checkgroup", false, false, funcTable, 3, null, null, 0, 17);
            c$4_Pattern = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_parse.py", "Pattern", false, false, funcTable, 4, null, null, 0, 16);
            c$5___init__ = Py.newCode(3, new String[] {"self", "pattern", "data"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_parse.py", "__init__", false, false, funcTable, 5, null, null, 0, 17);
            c$6_dump = Py.newCode(2, new String[] {"self", "level", "nl", "av", "i", "op", "a"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_parse.py", "dump", false, false, funcTable, 6, null, null, 0, 17);
            c$7___repr__ = Py.newCode(1, new String[] {"self"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_parse.py", "__repr__", false, false, funcTable, 7, null, null, 0, 17);
            c$8___len__ = Py.newCode(1, new String[] {"self"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_parse.py", "__len__", false, false, funcTable, 8, null, null, 0, 17);
            c$9___delitem__ = Py.newCode(2, new String[] {"self", "index"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_parse.py", "__delitem__", false, false, funcTable, 9, null, null, 0, 17);
            c$10___getitem__ = Py.newCode(2, new String[] {"self", "index"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_parse.py", "__getitem__", false, false, funcTable, 10, null, null, 0, 17);
            c$11___setitem__ = Py.newCode(3, new String[] {"self", "index", "code"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_parse.py", "__setitem__", false, false, funcTable, 11, null, null, 0, 17);
            c$12___getslice__ = Py.newCode(3, new String[] {"self", "start", "stop"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_parse.py", "__getslice__", false, false, funcTable, 12, null, null, 0, 17);
            c$13_insert = Py.newCode(3, new String[] {"self", "index", "code"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_parse.py", "insert", false, false, funcTable, 13, null, null, 0, 17);
            c$14_append = Py.newCode(2, new String[] {"self", "code"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_parse.py", "append", false, false, funcTable, 14, null, null, 0, 17);
            c$15_getwidth = Py.newCode(1, new String[] {"self", "hi", "lo", "op", "av", "l", "j", "i", "h"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_parse.py", "getwidth", false, false, funcTable, 15, null, null, 0, 17);
            c$16_SubPattern = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_parse.py", "SubPattern", false, false, funcTable, 16, null, null, 0, 16);
            c$17___init__ = Py.newCode(2, new String[] {"self", "string"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_parse.py", "__init__", false, false, funcTable, 17, null, null, 0, 17);
            c$18___next = Py.newCode(1, new String[] {"self", "char", "c"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_parse.py", "__next", false, false, funcTable, 18, null, null, 0, 17);
            c$19_match = Py.newCode(3, new String[] {"self", "char", "skip"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_parse.py", "match", false, false, funcTable, 19, null, null, 0, 17);
            c$20_get = Py.newCode(1, new String[] {"self", "this"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_parse.py", "get", false, false, funcTable, 20, null, null, 0, 17);
            c$21_tell = Py.newCode(1, new String[] {"self"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_parse.py", "tell", false, false, funcTable, 21, null, null, 0, 17);
            c$22_seek = Py.newCode(2, new String[] {"self", "index"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_parse.py", "seek", false, false, funcTable, 22, null, null, 0, 17);
            c$23_Tokenizer = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_parse.py", "Tokenizer", false, false, funcTable, 23, null, null, 0, 16);
            c$24_isident = Py.newCode(1, new String[] {"char"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_parse.py", "isident", false, false, funcTable, 24, null, null, 0, 17);
            c$25_isdigit = Py.newCode(1, new String[] {"char"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_parse.py", "isdigit", false, false, funcTable, 25, null, null, 0, 17);
            c$26_isname = Py.newCode(1, new String[] {"name", "char"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_parse.py", "isname", false, false, funcTable, 26, null, null, 0, 17);
            c$27__group = Py.newCode(2, new String[] {"escape", "groups", "gid"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_parse.py", "_group", false, false, funcTable, 27, null, null, 0, 17);
            c$28__class_escape = Py.newCode(2, new String[] {"source", "escape", "code"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_parse.py", "_class_escape", false, false, funcTable, 28, null, null, 0, 17);
            c$29__escape = Py.newCode(3, new String[] {"source", "escape", "state", "here", "code", "group"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_parse.py", "_escape", false, false, funcTable, 29, null, null, 0, 17);
            c$30__parse_sub = Py.newCode(3, new String[] {"source", "state", "nested", "subpattern", "prefix", "items", "set", "item"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_parse.py", "_parse_sub", false, false, funcTable, 30, null, null, 0, 17);
            c$31__parse = Py.newCode(2, new String[] {"source", "state", "code", "this", "name", "group", "code2", "code1", "max", "start", "set", "item", "subpattern", "lo", "here", "char", "gid", "p", "dir", "min", "hi"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_parse.py", "_parse", false, false, funcTable, 31, null, null, 0, 17);
            c$32_parse = Py.newCode(3, new String[] {"str", "flags", "pattern", "source", "p", "tail"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_parse.py", "parse", false, false, funcTable, 32, null, null, 0, 17);
            c$33_literal = Py.newCode(2, new String[] {"literal", "p"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_parse.py", "literal", false, false, funcTable, 33, null, null, 0, 17);
            c$34_parse_template = Py.newCode(2, new String[] {"source", "pattern", "literals", "code", "this", "makechar", "literal", "groups", "name", "group", "sep", "index", "char", "s", "p", "i", "c", "a"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_parse.py", "parse_template", false, false, funcTable, 34, null, null, 0, 17);
            c$35_expand_template = Py.newCode(2, new String[] {"template", "match", "literals", "groups", "g", "index", "group", "s", "sep"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_parse.py", "expand_template", false, false, funcTable, 35, null, null, 0, 17);
            c$36_main = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_parse.py", "main", false, false, funcTable, 36, null, null, 0, 16);
        }
        
        
        public PyCode getMain() {
            if (c$36_main == null) _PyInner.initConstants();
            return c$36_main;
        }
        
        public PyObject call_function(int index, PyFrame frame) {
            switch (index){
                case 0:
                return _PyInner.__init__$1(frame);
                case 1:
                return _PyInner.opengroup$2(frame);
                case 2:
                return _PyInner.closegroup$3(frame);
                case 3:
                return _PyInner.checkgroup$4(frame);
                case 4:
                return _PyInner.Pattern$5(frame);
                case 5:
                return _PyInner.__init__$6(frame);
                case 6:
                return _PyInner.dump$7(frame);
                case 7:
                return _PyInner.__repr__$8(frame);
                case 8:
                return _PyInner.__len__$9(frame);
                case 9:
                return _PyInner.__delitem__$10(frame);
                case 10:
                return _PyInner.__getitem__$11(frame);
                case 11:
                return _PyInner.__setitem__$12(frame);
                case 12:
                return _PyInner.__getslice__$13(frame);
                case 13:
                return _PyInner.insert$14(frame);
                case 14:
                return _PyInner.append$15(frame);
                case 15:
                return _PyInner.getwidth$16(frame);
                case 16:
                return _PyInner.SubPattern$17(frame);
                case 17:
                return _PyInner.__init__$18(frame);
                case 18:
                return _PyInner.__next$19(frame);
                case 19:
                return _PyInner.match$20(frame);
                case 20:
                return _PyInner.get$21(frame);
                case 21:
                return _PyInner.tell$22(frame);
                case 22:
                return _PyInner.seek$23(frame);
                case 23:
                return _PyInner.Tokenizer$24(frame);
                case 24:
                return _PyInner.isident$25(frame);
                case 25:
                return _PyInner.isdigit$26(frame);
                case 26:
                return _PyInner.isname$27(frame);
                case 27:
                return _PyInner._group$28(frame);
                case 28:
                return _PyInner._class_escape$29(frame);
                case 29:
                return _PyInner._escape$30(frame);
                case 30:
                return _PyInner._parse_sub$31(frame);
                case 31:
                return _PyInner._parse$32(frame);
                case 32:
                return _PyInner.parse$33(frame);
                case 33:
                return _PyInner.literal$34(frame);
                case 34:
                return _PyInner.parse_template$35(frame);
                case 35:
                return _PyInner.expand_template$36(frame);
                case 36:
                return _PyInner.main$37(frame);
                default:
                return null;
            }
        }
        
        private static PyObject __init__$1(PyFrame frame) {
            frame.getlocal(0).__setattr__("flags", i$41);
            frame.getlocal(0).__setattr__("open", new PyList(new PyObject[] {}));
            frame.getlocal(0).__setattr__("groups", i$42);
            frame.getlocal(0).__setattr__("groupdict", new PyDictionary(new PyObject[] {}));
            return Py.None;
        }
        
        private static PyObject opengroup$2(PyFrame frame) {
            frame.setlocal(3, frame.getlocal(0).__getattr__("groups"));
            frame.getlocal(0).__setattr__("groups", frame.getlocal(3)._add(i$42));
            if (frame.getlocal(1).__nonzero__()) {
                frame.setlocal(2, frame.getlocal(0).__getattr__("groupdict").invoke("get", frame.getlocal(1), frame.getglobal("None")));
                if (frame.getlocal(2)._isnot(frame.getglobal("None")).__nonzero__()) {
                    throw Py.makeException(frame.getglobal("error"), s$43._mod(new PyTuple(new PyObject[] {frame.getglobal("repr").__call__(frame.getlocal(1)), frame.getlocal(3), frame.getlocal(2)})));
                }
                frame.getlocal(0).__getattr__("groupdict").__setitem__(frame.getlocal(1), frame.getlocal(3));
            }
            frame.getlocal(0).__getattr__("open").invoke("append", frame.getlocal(3));
            return frame.getlocal(3);
        }
        
        private static PyObject closegroup$3(PyFrame frame) {
            frame.getlocal(0).__getattr__("open").invoke("remove", frame.getlocal(1));
            return Py.None;
        }
        
        private static PyObject checkgroup$4(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject;
            
            // Code
            return (t$0$PyObject = frame.getlocal(1)._lt(frame.getlocal(0).__getattr__("groups"))).__nonzero__() ? frame.getlocal(1)._notin(frame.getlocal(0).__getattr__("open")) : t$0$PyObject;
        }
        
        private static PyObject Pattern$5(PyFrame frame) {
            frame.setlocal("__init__", new PyFunction(frame.f_globals, new PyObject[] {}, c$0___init__));
            frame.setlocal("opengroup", new PyFunction(frame.f_globals, new PyObject[] {frame.getname("None")}, c$1_opengroup));
            frame.setlocal("closegroup", new PyFunction(frame.f_globals, new PyObject[] {}, c$2_closegroup));
            frame.setlocal("checkgroup", new PyFunction(frame.f_globals, new PyObject[] {}, c$3_checkgroup));
            return frame.getf_locals();
        }
        
        private static PyObject __init__$6(PyFrame frame) {
            frame.getlocal(0).__setattr__("pattern", frame.getlocal(1));
            if (frame.getlocal(2).__not__().__nonzero__()) {
                frame.setlocal(2, new PyList(new PyObject[] {}));
            }
            frame.getlocal(0).__setattr__("data", frame.getlocal(2));
            frame.getlocal(0).__setattr__("width", frame.getglobal("None"));
            return Py.None;
        }
        
        private static PyObject dump$7(PyFrame frame) {
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            PyObject t$0$PyObject, t$1$PyObject, t$2$PyObject, t$3$PyObject, t$4$PyObject, t$5$PyObject, t$6$PyObject, t$7$PyObject;
            
            // Code
            frame.setlocal(2, i$42);
            t$0$PyObject = frame.getlocal(0).__getattr__("data").__iter__();
            while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                t$0$PyObject__ = org.python.core.Py.unpackSequence(t$1$PyObject, 2);
                frame.setlocal(5, t$0$PyObject__[0]);
                frame.setlocal(3, t$0$PyObject__[1]);
                Py.printComma(Py.None, frame.getlocal(1)._mul(s$44)._add(frame.getlocal(5)));
                frame.setlocal(2, i$41);
                if (frame.getlocal(5)._eq(s$45).__nonzero__()) {
                    Py.printlnv(Py.None);
                    frame.setlocal(2, i$42);
                    t$2$PyObject = frame.getlocal(3).__iter__();
                    while ((t$3$PyObject = t$2$PyObject.__iternext__()) != null) {
                        t$0$PyObject__ = org.python.core.Py.unpackSequence(t$3$PyObject, 2);
                        frame.setlocal(5, t$0$PyObject__[0]);
                        frame.setlocal(6, t$0$PyObject__[1]);
                        Py.printComma(Py.None, frame.getlocal(1)._add(i$42)._mul(s$44)._add(frame.getlocal(5)));
                        Py.println(Py.None, frame.getlocal(6));
                    }
                }
                else {
                    if (frame.getlocal(5)._eq(s$46).__nonzero__()) {
                        Py.printlnv(Py.None);
                        frame.setlocal(2, i$42);
                        frame.setlocal(4, i$41);
                        t$4$PyObject = frame.getlocal(3).__getitem__(i$42).__iter__();
                        while ((t$5$PyObject = t$4$PyObject.__iternext__()) != null) {
                            frame.setlocal(6, t$5$PyObject);
                            if (frame.getlocal(4)._gt(i$41).__nonzero__()) {
                                Py.println(Py.None, frame.getlocal(1)._mul(s$44)._add(s$47));
                            }
                            frame.getlocal(6).invoke("dump", frame.getlocal(1)._add(i$42));
                            frame.setlocal(2, i$42);
                            frame.setlocal(4, frame.getlocal(4)._add(i$42));
                        }
                    }
                    else {
                        if (frame.getglobal("type").__call__(frame.getlocal(3))._in(new PyTuple(new PyObject[] {frame.getglobal("type").__call__(new PyTuple(new PyObject[] {})), frame.getglobal("type").__call__(new PyList(new PyObject[] {}))})).__nonzero__()) {
                            t$6$PyObject = frame.getlocal(3).__iter__();
                            while ((t$7$PyObject = t$6$PyObject.__iternext__()) != null) {
                                frame.setlocal(6, t$7$PyObject);
                                if (frame.getglobal("isinstance").__call__(frame.getlocal(6), frame.getglobal("SubPattern")).__nonzero__()) {
                                    if (frame.getlocal(2).__not__().__nonzero__()) {
                                        Py.printlnv(Py.None);
                                    }
                                    frame.getlocal(6).invoke("dump", frame.getlocal(1)._add(i$42));
                                    frame.setlocal(2, i$42);
                                }
                                else {
                                    Py.printComma(Py.None, frame.getlocal(6));
                                    frame.setlocal(2, i$41);
                                }
                            }
                        }
                        else {
                            Py.printComma(Py.None, frame.getlocal(3));
                            frame.setlocal(2, i$41);
                        }
                    }
                }
                if (frame.getlocal(2).__not__().__nonzero__()) {
                    Py.printlnv(Py.None);
                }
            }
            return Py.None;
        }
        
        private static PyObject __repr__$8(PyFrame frame) {
            return frame.getglobal("repr").__call__(frame.getlocal(0).__getattr__("data"));
        }
        
        private static PyObject __len__$9(PyFrame frame) {
            return frame.getglobal("len").__call__(frame.getlocal(0).__getattr__("data"));
        }
        
        private static PyObject __delitem__$10(PyFrame frame) {
            frame.getlocal(0).__getattr__("data").__delitem__(frame.getlocal(1));
            return Py.None;
        }
        
        private static PyObject __getitem__$11(PyFrame frame) {
            return frame.getlocal(0).__getattr__("data").__getitem__(frame.getlocal(1));
        }
        
        private static PyObject __setitem__$12(PyFrame frame) {
            frame.getlocal(0).__getattr__("data").__setitem__(frame.getlocal(1), frame.getlocal(2));
            return Py.None;
        }
        
        private static PyObject __getslice__$13(PyFrame frame) {
            return frame.getglobal("SubPattern").__call__(frame.getlocal(0).__getattr__("pattern"), frame.getlocal(0).__getattr__("data").__getslice__(frame.getlocal(1), frame.getlocal(2), null));
        }
        
        private static PyObject insert$14(PyFrame frame) {
            frame.getlocal(0).__getattr__("data").invoke("insert", frame.getlocal(1), frame.getlocal(2));
            return Py.None;
        }
        
        private static PyObject append$15(PyFrame frame) {
            frame.getlocal(0).__getattr__("data").invoke("append", frame.getlocal(1));
            return Py.None;
        }
        
        private static PyObject getwidth$16(PyFrame frame) {
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            PyObject t$0$PyObject, t$1$PyObject, t$2$PyObject, t$3$PyObject;
            
            // Code
            if (frame.getlocal(0).__getattr__("width").__nonzero__()) {
                return frame.getlocal(0).__getattr__("width");
            }
            t$0$PyObject = l$48;
            frame.setlocal(2, t$0$PyObject);
            frame.setlocal(1, t$0$PyObject);
            t$0$PyObject = frame.getlocal(0).__getattr__("data").__iter__();
            while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                t$0$PyObject__ = org.python.core.Py.unpackSequence(t$1$PyObject, 2);
                frame.setlocal(3, t$0$PyObject__[0]);
                frame.setlocal(4, t$0$PyObject__[1]);
                if (frame.getlocal(3)._is(frame.getglobal("BRANCH")).__nonzero__()) {
                    frame.setlocal(7, frame.getglobal("sys").__getattr__("maxint"));
                    frame.setlocal(6, i$41);
                    t$2$PyObject = frame.getlocal(4).__getitem__(i$42).__iter__();
                    while ((t$3$PyObject = t$2$PyObject.__iternext__()) != null) {
                        frame.setlocal(4, t$3$PyObject);
                        t$0$PyObject__ = org.python.core.Py.unpackSequence(frame.getlocal(4).invoke("getwidth"), 2);
                        frame.setlocal(5, t$0$PyObject__[0]);
                        frame.setlocal(8, t$0$PyObject__[1]);
                        frame.setlocal(7, frame.getglobal("min").__call__(frame.getlocal(7), frame.getlocal(5)));
                        frame.setlocal(6, frame.getglobal("max").__call__(frame.getlocal(6), frame.getlocal(8)));
                    }
                    frame.setlocal(2, frame.getlocal(2)._add(frame.getlocal(7)));
                    frame.setlocal(1, frame.getlocal(1)._add(frame.getlocal(6)));
                }
                else {
                    if (frame.getlocal(3)._is(frame.getglobal("CALL")).__nonzero__()) {
                        t$0$PyObject__ = org.python.core.Py.unpackSequence(frame.getlocal(4).invoke("getwidth"), 2);
                        frame.setlocal(7, t$0$PyObject__[0]);
                        frame.setlocal(6, t$0$PyObject__[1]);
                        frame.setlocal(2, frame.getlocal(2)._add(frame.getlocal(7)));
                        frame.setlocal(1, frame.getlocal(1)._add(frame.getlocal(6)));
                    }
                    else {
                        if (frame.getlocal(3)._is(frame.getglobal("SUBPATTERN")).__nonzero__()) {
                            t$0$PyObject__ = org.python.core.Py.unpackSequence(frame.getlocal(4).__getitem__(i$42).invoke("getwidth"), 2);
                            frame.setlocal(7, t$0$PyObject__[0]);
                            frame.setlocal(6, t$0$PyObject__[1]);
                            frame.setlocal(2, frame.getlocal(2)._add(frame.getlocal(7)));
                            frame.setlocal(1, frame.getlocal(1)._add(frame.getlocal(6)));
                        }
                        else {
                            if (frame.getlocal(3)._in(new PyTuple(new PyObject[] {frame.getglobal("MIN_REPEAT"), frame.getglobal("MAX_REPEAT")})).__nonzero__()) {
                                t$0$PyObject__ = org.python.core.Py.unpackSequence(frame.getlocal(4).__getitem__(i$49).invoke("getwidth"), 2);
                                frame.setlocal(7, t$0$PyObject__[0]);
                                frame.setlocal(6, t$0$PyObject__[1]);
                                frame.setlocal(2, frame.getlocal(2)._add(frame.getglobal("long").__call__(frame.getlocal(7))._mul(frame.getlocal(4).__getitem__(i$41))));
                                frame.setlocal(1, frame.getlocal(1)._add(frame.getglobal("long").__call__(frame.getlocal(6))._mul(frame.getlocal(4).__getitem__(i$42))));
                            }
                            else {
                                if (frame.getlocal(3)._in(new PyTuple(new PyObject[] {frame.getglobal("ANY"), frame.getglobal("RANGE"), frame.getglobal("IN"), frame.getglobal("LITERAL"), frame.getglobal("NOT_LITERAL"), frame.getglobal("CATEGORY")})).__nonzero__()) {
                                    frame.setlocal(2, frame.getlocal(2)._add(i$42));
                                    frame.setlocal(1, frame.getlocal(1)._add(i$42));
                                }
                                else {
                                    if (frame.getlocal(3)._eq(frame.getglobal("SUCCESS")).__nonzero__()) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            frame.getlocal(0).__setattr__("width", new PyTuple(new PyObject[] {frame.getglobal("int").__call__(frame.getglobal("min").__call__(frame.getlocal(2), frame.getglobal("sys").__getattr__("maxint"))), frame.getglobal("int").__call__(frame.getglobal("min").__call__(frame.getlocal(1), frame.getglobal("sys").__getattr__("maxint")))}));
            return frame.getlocal(0).__getattr__("width");
        }
        
        private static PyObject SubPattern$17(PyFrame frame) {
            frame.setlocal("__init__", new PyFunction(frame.f_globals, new PyObject[] {frame.getname("None")}, c$5___init__));
            frame.setlocal("dump", new PyFunction(frame.f_globals, new PyObject[] {i$41}, c$6_dump));
            frame.setlocal("__repr__", new PyFunction(frame.f_globals, new PyObject[] {}, c$7___repr__));
            frame.setlocal("__len__", new PyFunction(frame.f_globals, new PyObject[] {}, c$8___len__));
            frame.setlocal("__delitem__", new PyFunction(frame.f_globals, new PyObject[] {}, c$9___delitem__));
            frame.setlocal("__getitem__", new PyFunction(frame.f_globals, new PyObject[] {}, c$10___getitem__));
            frame.setlocal("__setitem__", new PyFunction(frame.f_globals, new PyObject[] {}, c$11___setitem__));
            frame.setlocal("__getslice__", new PyFunction(frame.f_globals, new PyObject[] {}, c$12___getslice__));
            frame.setlocal("insert", new PyFunction(frame.f_globals, new PyObject[] {}, c$13_insert));
            frame.setlocal("append", new PyFunction(frame.f_globals, new PyObject[] {}, c$14_append));
            frame.setlocal("getwidth", new PyFunction(frame.f_globals, new PyObject[] {}, c$15_getwidth));
            return frame.getf_locals();
        }
        
        private static PyObject __init__$18(PyFrame frame) {
            frame.getlocal(0).__setattr__("string", frame.getlocal(1));
            frame.getlocal(0).__setattr__("index", i$41);
            frame.getlocal(0).invoke("_Tokenizer__next");
            return Py.None;
        }
        
        private static PyObject __next$19(PyFrame frame) {
            // Temporary Variables
            PyException t$0$PyException;
            
            // Code
            if (frame.getlocal(0).__getattr__("index")._ge(frame.getglobal("len").__call__(frame.getlocal(0).__getattr__("string"))).__nonzero__()) {
                frame.getlocal(0).__setattr__("next", frame.getglobal("None"));
                return Py.None;
            }
            frame.setlocal(1, frame.getlocal(0).__getattr__("string").__getitem__(frame.getlocal(0).__getattr__("index")));
            if (frame.getlocal(1).__getitem__(i$41)._eq(s$22).__nonzero__()) {
                try {
                    frame.setlocal(2, frame.getlocal(0).__getattr__("string").__getitem__(frame.getlocal(0).__getattr__("index")._add(i$42)));
                }
                catch (Throwable x$0) {
                    t$0$PyException = Py.setException(x$0, frame);
                    if (Py.matchException(t$0$PyException, frame.getglobal("IndexError"))) {
                        throw Py.makeException(frame.getglobal("error"), s$50);
                    }
                    else throw t$0$PyException;
                }
                frame.setlocal(1, frame.getlocal(1)._add(frame.getlocal(2)));
            }
            frame.getlocal(0).__setattr__("index", frame.getlocal(0).__getattr__("index")._add(frame.getglobal("len").__call__(frame.getlocal(1))));
            frame.getlocal(0).__setattr__("next", frame.getlocal(1));
            return Py.None;
        }
        
        private static PyObject match$20(PyFrame frame) {
            if (frame.getlocal(1)._eq(frame.getlocal(0).__getattr__("next")).__nonzero__()) {
                if (frame.getlocal(2).__nonzero__()) {
                    frame.getlocal(0).invoke("_Tokenizer__next");
                }
                return i$42;
            }
            return i$41;
        }
        
        private static PyObject get$21(PyFrame frame) {
            frame.setlocal(1, frame.getlocal(0).__getattr__("next"));
            frame.getlocal(0).invoke("_Tokenizer__next");
            return frame.getlocal(1);
        }
        
        private static PyObject tell$22(PyFrame frame) {
            return new PyTuple(new PyObject[] {frame.getlocal(0).__getattr__("index"), frame.getlocal(0).__getattr__("next")});
        }
        
        private static PyObject seek$23(PyFrame frame) {
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            
            // Code
            t$0$PyObject__ = org.python.core.Py.unpackSequence(frame.getlocal(1), 2);
            frame.getlocal(0).__setattr__("index", t$0$PyObject__[0]);
            frame.getlocal(0).__setattr__("next", t$0$PyObject__[1]);
            return Py.None;
        }
        
        private static PyObject Tokenizer$24(PyFrame frame) {
            frame.setlocal("__init__", new PyFunction(frame.f_globals, new PyObject[] {}, c$17___init__));
            frame.setlocal("_Tokenizer__next", new PyFunction(frame.f_globals, new PyObject[] {}, c$18___next));
            frame.setlocal("match", new PyFunction(frame.f_globals, new PyObject[] {i$42}, c$19_match));
            frame.setlocal("get", new PyFunction(frame.f_globals, new PyObject[] {}, c$20_get));
            frame.setlocal("tell", new PyFunction(frame.f_globals, new PyObject[] {}, c$21_tell));
            frame.setlocal("seek", new PyFunction(frame.f_globals, new PyObject[] {}, c$22_seek));
            return frame.getf_locals();
        }
        
        private static PyObject isident$25(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject;
            
            // Code
            return (t$0$PyObject = ((t$0$PyObject = (s$51._le(t$0$PyObject = frame.getlocal(0)).__nonzero__() ? t$0$PyObject._le(s$52) : Py.Zero)).__nonzero__() ? t$0$PyObject : (s$53._le(t$0$PyObject = frame.getlocal(0)).__nonzero__() ? t$0$PyObject._le(s$54) : Py.Zero))).__nonzero__() ? t$0$PyObject : frame.getlocal(0)._eq(s$55);
        }
        
        private static PyObject isdigit$26(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject;
            
            // Code
            return s$56._le(t$0$PyObject = frame.getlocal(0)).__nonzero__() ? t$0$PyObject._le(s$57) : Py.Zero;
        }
        
        private static PyObject isname$27(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject, t$1$PyObject, t$2$PyObject;
            
            // Code
            if (frame.getglobal("isident").__call__(frame.getlocal(0).__getitem__(i$41)).__not__().__nonzero__()) {
                return i$41;
            }
            t$0$PyObject = frame.getlocal(0).__iter__();
            while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                frame.setlocal(1, t$1$PyObject);
                if (((t$2$PyObject = frame.getglobal("isident").__call__(frame.getlocal(1)).__not__()).__nonzero__() ? frame.getglobal("isdigit").__call__(frame.getlocal(1)).__not__() : t$2$PyObject).__nonzero__()) {
                    return i$41;
                }
            }
            return i$42;
        }
        
        private static PyObject _group$28(PyFrame frame) {
            // Temporary Variables
            PyException t$0$PyException;
            PyObject t$0$PyObject;
            
            // Code
            try {
                frame.setlocal(2, frame.getglobal("atoi").__call__(frame.getlocal(0).__getslice__(i$42, null, null)));
                if (((t$0$PyObject = frame.getlocal(2)).__nonzero__() ? frame.getlocal(2)._lt(frame.getlocal(1)) : t$0$PyObject).__nonzero__()) {
                    return frame.getlocal(2);
                }
            }
            catch (Throwable x$0) {
                t$0$PyException = Py.setException(x$0, frame);
                if (Py.matchException(t$0$PyException, frame.getglobal("ValueError"))) {
                    // pass
                }
                else throw t$0$PyException;
            }
            return frame.getglobal("None");
        }
        
        private static PyObject _class_escape$29(PyFrame frame) {
            // Temporary Variables
            PyException t$0$PyException;
            PyObject t$0$PyObject;
            
            // Code
            frame.setlocal(2, frame.getglobal("ESCAPES").invoke("get", frame.getlocal(1)));
            if (frame.getlocal(2).__nonzero__()) {
                return frame.getlocal(2);
            }
            frame.setlocal(2, frame.getglobal("CATEGORIES").invoke("get", frame.getlocal(1)));
            if (frame.getlocal(2).__nonzero__()) {
                return frame.getlocal(2);
            }
            try {
                if (frame.getlocal(1).__getslice__(i$42, i$49, null)._eq(s$36).__nonzero__()) {
                    while (((t$0$PyObject = frame.getlocal(0).__getattr__("next")._in(frame.getglobal("HEXDIGITS"))).__nonzero__() ? frame.getglobal("len").__call__(frame.getlocal(1))._lt(i$58) : t$0$PyObject).__nonzero__()) {
                        frame.setlocal(1, frame.getlocal(1)._add(frame.getlocal(0).invoke("get")));
                    }
                    frame.setlocal(1, frame.getlocal(1).__getslice__(i$49, null, null));
                    if (frame.getglobal("len").__call__(frame.getlocal(1))._ne(i$49).__nonzero__()) {
                        throw Py.makeException(frame.getglobal("error"), s$59._mod(frame.getglobal("repr").__call__(s$22._add(frame.getlocal(1)))));
                    }
                    return new PyTuple(new PyObject[] {frame.getglobal("LITERAL"), frame.getglobal("atoi").__call__(frame.getlocal(1), i$60)._and(i$61)});
                }
                else {
                    if (frame.getlocal(1).__getslice__(i$42, i$49, null)._in(frame.getglobal("OCTDIGITS")).__nonzero__()) {
                        while (((t$0$PyObject = frame.getlocal(0).__getattr__("next")._in(frame.getglobal("OCTDIGITS"))).__nonzero__() ? frame.getglobal("len").__call__(frame.getlocal(1))._lt(i$62) : t$0$PyObject).__nonzero__()) {
                            frame.setlocal(1, frame.getlocal(1)._add(frame.getlocal(0).invoke("get")));
                        }
                        frame.setlocal(1, frame.getlocal(1).__getslice__(i$42, null, null));
                        return new PyTuple(new PyObject[] {frame.getglobal("LITERAL"), frame.getglobal("atoi").__call__(frame.getlocal(1), i$40)._and(i$61)});
                    }
                }
                if (frame.getglobal("len").__call__(frame.getlocal(1))._eq(i$49).__nonzero__()) {
                    return new PyTuple(new PyObject[] {frame.getglobal("LITERAL"), frame.getglobal("ord").__call__(frame.getlocal(1).__getitem__(i$42))});
                }
            }
            catch (Throwable x$0) {
                t$0$PyException = Py.setException(x$0, frame);
                if (Py.matchException(t$0$PyException, frame.getglobal("ValueError"))) {
                    // pass
                }
                else throw t$0$PyException;
            }
            throw Py.makeException(frame.getglobal("error"), s$59._mod(frame.getglobal("repr").__call__(frame.getlocal(1))));
        }
        
        private static PyObject _escape$30(PyFrame frame) {
            // Temporary Variables
            PyException t$0$PyException;
            PyObject t$0$PyObject;
            
            // Code
            frame.setlocal(4, frame.getglobal("CATEGORIES").invoke("get", frame.getlocal(1)));
            if (frame.getlocal(4).__nonzero__()) {
                return frame.getlocal(4);
            }
            frame.setlocal(4, frame.getglobal("ESCAPES").invoke("get", frame.getlocal(1)));
            if (frame.getlocal(4).__nonzero__()) {
                return frame.getlocal(4);
            }
            try {
                if (frame.getlocal(1).__getslice__(i$42, i$49, null)._eq(s$36).__nonzero__()) {
                    while (((t$0$PyObject = frame.getlocal(0).__getattr__("next")._in(frame.getglobal("HEXDIGITS"))).__nonzero__() ? frame.getglobal("len").__call__(frame.getlocal(1))._lt(i$58) : t$0$PyObject).__nonzero__()) {
                        frame.setlocal(1, frame.getlocal(1)._add(frame.getlocal(0).invoke("get")));
                    }
                    if (frame.getglobal("len").__call__(frame.getlocal(1))._ne(i$58).__nonzero__()) {
                        throw Py.makeException(frame.getglobal("ValueError"));
                    }
                    return new PyTuple(new PyObject[] {frame.getglobal("LITERAL"), frame.getglobal("atoi").__call__(frame.getlocal(1).__getslice__(i$49, null, null), i$60)._and(i$61)});
                }
                else {
                    if (frame.getlocal(1).__getslice__(i$42, i$49, null)._eq(s$56).__nonzero__()) {
                        while (((t$0$PyObject = frame.getlocal(0).__getattr__("next")._in(frame.getglobal("OCTDIGITS"))).__nonzero__() ? frame.getglobal("len").__call__(frame.getlocal(1))._lt(i$58) : t$0$PyObject).__nonzero__()) {
                            frame.setlocal(1, frame.getlocal(1)._add(frame.getlocal(0).invoke("get")));
                        }
                        return new PyTuple(new PyObject[] {frame.getglobal("LITERAL"), frame.getglobal("atoi").__call__(frame.getlocal(1).__getslice__(i$42, null, null), i$40)._and(i$61)});
                    }
                    else {
                        if (frame.getlocal(1).__getslice__(i$42, i$49, null)._in(frame.getglobal("DIGITS")).__nonzero__()) {
                            frame.setlocal(3, frame.getlocal(0).invoke("tell"));
                            if (frame.getlocal(0).__getattr__("next")._in(frame.getglobal("DIGITS")).__nonzero__()) {
                                frame.setlocal(1, frame.getlocal(1)._add(frame.getlocal(0).invoke("get")));
                                if (((t$0$PyObject = ((t$0$PyObject = frame.getlocal(1).__getitem__(i$42)._in(frame.getglobal("OCTDIGITS"))).__nonzero__() ? frame.getlocal(1).__getitem__(i$49)._in(frame.getglobal("OCTDIGITS")) : t$0$PyObject)).__nonzero__() ? frame.getlocal(0).__getattr__("next")._in(frame.getglobal("OCTDIGITS")) : t$0$PyObject).__nonzero__()) {
                                    frame.setlocal(1, frame.getlocal(1)._add(frame.getlocal(0).invoke("get")));
                                    return new PyTuple(new PyObject[] {frame.getglobal("LITERAL"), frame.getglobal("atoi").__call__(frame.getlocal(1).__getslice__(i$42, null, null), i$40)._and(i$61)});
                                }
                            }
                            frame.setlocal(5, frame.getglobal("_group").__call__(frame.getlocal(1), frame.getlocal(2).__getattr__("groups")));
                            if (frame.getlocal(5).__nonzero__()) {
                                if (frame.getlocal(2).invoke("checkgroup", frame.getlocal(5)).__not__().__nonzero__()) {
                                    throw Py.makeException(frame.getglobal("error"), s$63);
                                }
                                return new PyTuple(new PyObject[] {frame.getglobal("GROUPREF"), frame.getlocal(5)});
                            }
                            throw Py.makeException(frame.getglobal("ValueError"));
                        }
                    }
                }
                if (frame.getglobal("len").__call__(frame.getlocal(1))._eq(i$49).__nonzero__()) {
                    return new PyTuple(new PyObject[] {frame.getglobal("LITERAL"), frame.getglobal("ord").__call__(frame.getlocal(1).__getitem__(i$42))});
                }
            }
            catch (Throwable x$0) {
                t$0$PyException = Py.setException(x$0, frame);
                if (Py.matchException(t$0$PyException, frame.getglobal("ValueError"))) {
                    // pass
                }
                else throw t$0$PyException;
            }
            throw Py.makeException(frame.getglobal("error"), s$59._mod(frame.getglobal("repr").__call__(frame.getlocal(1))));
        }
        
        private static PyObject _parse_sub$31(PyFrame frame) {
            // Temporary Variables
            boolean t$0$boolean;
            PyObject t$0$PyObject, t$1$PyObject, t$2$PyObject, t$3$PyObject, t$4$PyObject, t$5$PyObject, t$6$PyObject, t$7$PyObject;
            
            // Code
            frame.setlocal(5, new PyList(new PyObject[] {}));
            while (i$42.__nonzero__()) {
                frame.getlocal(5).invoke("append", frame.getglobal("_parse").__call__(frame.getlocal(0), frame.getlocal(1)));
                if (frame.getlocal(0).invoke("match", s$64).__nonzero__()) {
                    continue;
                }
                if (frame.getlocal(2).__not__().__nonzero__()) {
                    break;
                }
                if (((t$0$PyObject = frame.getlocal(0).__getattr__("next").__not__()).__nonzero__() ? t$0$PyObject : frame.getlocal(0).invoke("match", s$65, i$41)).__nonzero__()) {
                    break;
                }
                else {
                    throw Py.makeException(frame.getglobal("error"), s$66);
                }
            }
            if (frame.getglobal("len").__call__(frame.getlocal(5))._eq(i$42).__nonzero__()) {
                return frame.getlocal(5).__getitem__(i$41);
            }
            frame.setlocal(3, frame.getglobal("SubPattern").__call__(frame.getlocal(1)));
            while (i$42.__nonzero__()) {
                frame.setlocal(4, frame.getglobal("None"));
                t$0$PyObject = frame.getlocal(5).__iter__();
                while (t$0$boolean=(t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                    frame.setlocal(7, t$1$PyObject);
                    if (frame.getlocal(7).__not__().__nonzero__()) {
                        break;
                    }
                    if (frame.getlocal(4)._is(frame.getglobal("None")).__nonzero__()) {
                        frame.setlocal(4, frame.getlocal(7).__getitem__(i$41));
                    }
                    else {
                        if (frame.getlocal(7).__getitem__(i$41)._ne(frame.getlocal(4)).__nonzero__()) {
                            break;
                        }
                    }
                }
                if (!t$0$boolean) {
                    t$2$PyObject = frame.getlocal(5).__iter__();
                    while ((t$3$PyObject = t$2$PyObject.__iternext__()) != null) {
                        frame.setlocal(7, t$3$PyObject);
                        frame.getlocal(7).__delitem__(i$41);
                    }
                    frame.getlocal(3).invoke("append", frame.getlocal(4));
                    continue;
                }
                break;
            }
            t$4$PyObject = frame.getlocal(5).__iter__();
            while (t$0$boolean=(t$5$PyObject = t$4$PyObject.__iternext__()) != null) {
                frame.setlocal(7, t$5$PyObject);
                if (((t$6$PyObject = frame.getglobal("len").__call__(frame.getlocal(7))._ne(i$42)).__nonzero__() ? t$6$PyObject : frame.getlocal(7).__getitem__(i$41).__getitem__(i$41)._ne(frame.getglobal("LITERAL"))).__nonzero__()) {
                    break;
                }
            }
            if (!t$0$boolean) {
                frame.setlocal(6, new PyList(new PyObject[] {}));
                t$6$PyObject = frame.getlocal(5).__iter__();
                while ((t$7$PyObject = t$6$PyObject.__iternext__()) != null) {
                    frame.setlocal(7, t$7$PyObject);
                    frame.getlocal(6).invoke("append", frame.getlocal(7).__getitem__(i$41));
                }
                frame.getlocal(3).invoke("append", new PyTuple(new PyObject[] {frame.getglobal("IN"), frame.getlocal(6)}));
                return frame.getlocal(3);
            }
            frame.getlocal(3).invoke("append", new PyTuple(new PyObject[] {frame.getglobal("BRANCH"), new PyTuple(new PyObject[] {frame.getglobal("None"), frame.getlocal(5)})}));
            return frame.getlocal(3);
        }
        
        private static PyObject _parse$32(PyFrame frame) {
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            PyObject t$0$PyObject;
            
            // Code
            frame.setlocal(12, frame.getglobal("SubPattern").__call__(frame.getlocal(1)));
            while (i$42.__nonzero__()) {
                if (frame.getlocal(0).__getattr__("next")._in(new PyTuple(new PyObject[] {s$64, s$65})).__nonzero__()) {
                    break;
                }
                frame.setlocal(3, frame.getlocal(0).invoke("get"));
                if (frame.getlocal(3)._is(frame.getglobal("None")).__nonzero__()) {
                    break;
                }
                if (frame.getlocal(1).__getattr__("flags")._and(frame.getglobal("SRE_FLAG_VERBOSE")).__nonzero__()) {
                    if (frame.getlocal(3)._in(frame.getglobal("WHITESPACE")).__nonzero__()) {
                        continue;
                    }
                    if (frame.getlocal(3)._eq(s$67).__nonzero__()) {
                        while (i$42.__nonzero__()) {
                            frame.setlocal(3, frame.getlocal(0).invoke("get"));
                            if (frame.getlocal(3)._in(new PyTuple(new PyObject[] {frame.getglobal("None"), s$14})).__nonzero__()) {
                                break;
                            }
                        }
                        continue;
                    }
                }
                if (((t$0$PyObject = frame.getlocal(3)).__nonzero__() ? frame.getlocal(3).__getitem__(i$41)._notin(frame.getglobal("SPECIAL_CHARS")) : t$0$PyObject).__nonzero__()) {
                    frame.getlocal(12).invoke("append", new PyTuple(new PyObject[] {frame.getglobal("LITERAL"), frame.getglobal("ord").__call__(frame.getlocal(3))}));
                }
                else {
                    if (frame.getlocal(3)._eq(s$68).__nonzero__()) {
                        frame.setlocal(10, new PyList(new PyObject[] {}));
                        if (frame.getlocal(0).invoke("match", s$69).__nonzero__()) {
                            frame.getlocal(10).invoke("append", new PyTuple(new PyObject[] {frame.getglobal("NEGATE"), frame.getglobal("None")}));
                        }
                        frame.setlocal(9, frame.getlocal(10).__getslice__(null, null, null));
                        while (i$42.__nonzero__()) {
                            frame.setlocal(3, frame.getlocal(0).invoke("get"));
                            if (((t$0$PyObject = frame.getlocal(3)._eq(s$70)).__nonzero__() ? frame.getlocal(10)._ne(frame.getlocal(9)) : t$0$PyObject).__nonzero__()) {
                                break;
                            }
                            else {
                                if (((t$0$PyObject = frame.getlocal(3)).__nonzero__() ? frame.getlocal(3).__getitem__(i$41)._eq(s$22) : t$0$PyObject).__nonzero__()) {
                                    frame.setlocal(7, frame.getglobal("_class_escape").__call__(frame.getlocal(0), frame.getlocal(3)));
                                }
                                else {
                                    if (frame.getlocal(3).__nonzero__()) {
                                        frame.setlocal(7, new PyTuple(new PyObject[] {frame.getglobal("LITERAL"), frame.getglobal("ord").__call__(frame.getlocal(3))}));
                                    }
                                    else {
                                        throw Py.makeException(frame.getglobal("error"), s$71);
                                    }
                                }
                            }
                            if (frame.getlocal(0).invoke("match", s$72).__nonzero__()) {
                                frame.setlocal(3, frame.getlocal(0).invoke("get"));
                                if (frame.getlocal(3)._eq(s$70).__nonzero__()) {
                                    if (frame.getlocal(7).__getitem__(i$41)._is(frame.getglobal("IN")).__nonzero__()) {
                                        frame.setlocal(7, frame.getlocal(7).__getitem__(i$42).__getitem__(i$41));
                                    }
                                    frame.getlocal(10).invoke("append", frame.getlocal(7));
                                    frame.getlocal(10).invoke("append", new PyTuple(new PyObject[] {frame.getglobal("LITERAL"), frame.getglobal("ord").__call__(s$72)}));
                                    break;
                                }
                                else {
                                    if (frame.getlocal(3).__getitem__(i$41)._eq(s$22).__nonzero__()) {
                                        frame.setlocal(6, frame.getglobal("_class_escape").__call__(frame.getlocal(0), frame.getlocal(3)));
                                    }
                                    else {
                                        frame.setlocal(6, new PyTuple(new PyObject[] {frame.getglobal("LITERAL"), frame.getglobal("ord").__call__(frame.getlocal(3))}));
                                    }
                                    if (((t$0$PyObject = frame.getlocal(7).__getitem__(i$41)._ne(frame.getglobal("LITERAL"))).__nonzero__() ? t$0$PyObject : frame.getlocal(6).__getitem__(i$41)._ne(frame.getglobal("LITERAL"))).__nonzero__()) {
                                        throw Py.makeException(frame.getglobal("error"), s$73);
                                    }
                                    frame.setlocal(13, frame.getlocal(7).__getitem__(i$42));
                                    frame.setlocal(20, frame.getlocal(6).__getitem__(i$42));
                                    if (frame.getlocal(20)._lt(frame.getlocal(13)).__nonzero__()) {
                                        throw Py.makeException(frame.getglobal("error"), s$73);
                                    }
                                    frame.getlocal(10).invoke("append", new PyTuple(new PyObject[] {frame.getglobal("RANGE"), new PyTuple(new PyObject[] {frame.getlocal(13), frame.getlocal(20)})}));
                                }
                            }
                            else {
                                if (frame.getlocal(7).__getitem__(i$41)._is(frame.getglobal("IN")).__nonzero__()) {
                                    frame.setlocal(7, frame.getlocal(7).__getitem__(i$42).__getitem__(i$41));
                                }
                                frame.getlocal(10).invoke("append", frame.getlocal(7));
                            }
                        }
                        if (((t$0$PyObject = frame.getglobal("len").__call__(frame.getlocal(10))._eq(i$42)).__nonzero__() ? frame.getlocal(10).__getitem__(i$41).__getitem__(i$41)._is(frame.getglobal("LITERAL")) : t$0$PyObject).__nonzero__()) {
                            frame.getlocal(12).invoke("append", frame.getlocal(10).__getitem__(i$41));
                        }
                        else {
                            if (((t$0$PyObject = ((t$0$PyObject = frame.getglobal("len").__call__(frame.getlocal(10))._eq(i$49)).__nonzero__() ? frame.getlocal(10).__getitem__(i$41).__getitem__(i$41)._is(frame.getglobal("NEGATE")) : t$0$PyObject)).__nonzero__() ? frame.getlocal(10).__getitem__(i$42).__getitem__(i$41)._is(frame.getglobal("LITERAL")) : t$0$PyObject).__nonzero__()) {
                                frame.getlocal(12).invoke("append", new PyTuple(new PyObject[] {frame.getglobal("NOT_LITERAL"), frame.getlocal(10).__getitem__(i$42).__getitem__(i$42)}));
                            }
                            else {
                                frame.getlocal(12).invoke("append", new PyTuple(new PyObject[] {frame.getglobal("IN"), frame.getlocal(10)}));
                            }
                        }
                    }
                    else {
                        if (((t$0$PyObject = frame.getlocal(3)).__nonzero__() ? frame.getlocal(3).__getitem__(i$41)._in(frame.getglobal("REPEAT_CHARS")) : t$0$PyObject).__nonzero__()) {
                            if (frame.getlocal(3)._eq(s$74).__nonzero__()) {
                                t$0$PyObject__ = org.python.core.Py.unpackSequence(new PyTuple(new PyObject[] {i$41, i$42}), 2);
                                frame.setlocal(19, t$0$PyObject__[0]);
                                frame.setlocal(8, t$0$PyObject__[1]);
                            }
                            else {
                                if (frame.getlocal(3)._eq(s$75).__nonzero__()) {
                                    t$0$PyObject__ = org.python.core.Py.unpackSequence(new PyTuple(new PyObject[] {i$41, frame.getglobal("MAXREPEAT")}), 2);
                                    frame.setlocal(19, t$0$PyObject__[0]);
                                    frame.setlocal(8, t$0$PyObject__[1]);
                                }
                                else {
                                    if (frame.getlocal(3)._eq(s$76).__nonzero__()) {
                                        t$0$PyObject__ = org.python.core.Py.unpackSequence(new PyTuple(new PyObject[] {i$42, frame.getglobal("MAXREPEAT")}), 2);
                                        frame.setlocal(19, t$0$PyObject__[0]);
                                        frame.setlocal(8, t$0$PyObject__[1]);
                                    }
                                    else {
                                        if (frame.getlocal(3)._eq(s$77).__nonzero__()) {
                                            frame.setlocal(14, frame.getlocal(0).invoke("tell"));
                                            t$0$PyObject__ = org.python.core.Py.unpackSequence(new PyTuple(new PyObject[] {i$41, frame.getglobal("MAXREPEAT")}), 2);
                                            frame.setlocal(19, t$0$PyObject__[0]);
                                            frame.setlocal(8, t$0$PyObject__[1]);
                                            t$0$PyObject = s$78;
                                            frame.setlocal(13, t$0$PyObject);
                                            frame.setlocal(20, t$0$PyObject);
                                            while (frame.getlocal(0).__getattr__("next")._in(frame.getglobal("DIGITS")).__nonzero__()) {
                                                frame.setlocal(13, frame.getlocal(13)._add(frame.getlocal(0).invoke("get")));
                                            }
                                            if (frame.getlocal(0).invoke("match", s$79).__nonzero__()) {
                                                while (frame.getlocal(0).__getattr__("next")._in(frame.getglobal("DIGITS")).__nonzero__()) {
                                                    frame.setlocal(20, frame.getlocal(20)._add(frame.getlocal(0).invoke("get")));
                                                }
                                            }
                                            else {
                                                frame.setlocal(20, frame.getlocal(13));
                                            }
                                            if (frame.getlocal(0).invoke("match", s$80).__not__().__nonzero__()) {
                                                frame.getlocal(12).invoke("append", new PyTuple(new PyObject[] {frame.getglobal("LITERAL"), frame.getglobal("ord").__call__(frame.getlocal(3))}));
                                                frame.getlocal(0).invoke("seek", frame.getlocal(14));
                                                continue;
                                            }
                                            if (frame.getlocal(13).__nonzero__()) {
                                                frame.setlocal(19, frame.getglobal("atoi").__call__(frame.getlocal(13)));
                                            }
                                            if (frame.getlocal(20).__nonzero__()) {
                                                frame.setlocal(8, frame.getglobal("atoi").__call__(frame.getlocal(20)));
                                            }
                                            if (frame.getlocal(8)._lt(frame.getlocal(19)).__nonzero__()) {
                                                throw Py.makeException(frame.getglobal("error"), s$81);
                                            }
                                        }
                                        else {
                                            throw Py.makeException(frame.getglobal("error"), s$82);
                                        }
                                    }
                                }
                            }
                            if (frame.getlocal(12).__nonzero__()) {
                                frame.setlocal(11, frame.getlocal(12).__getslice__(i$42.__neg__(), null, null));
                            }
                            else {
                                frame.setlocal(11, frame.getglobal("None"));
                            }
                            if (((t$0$PyObject = frame.getlocal(11).__not__()).__nonzero__() ? t$0$PyObject : ((t$0$PyObject = frame.getglobal("len").__call__(frame.getlocal(11))._eq(i$42)).__nonzero__() ? frame.getlocal(11).__getitem__(i$41).__getitem__(i$41)._eq(frame.getglobal("AT")) : t$0$PyObject)).__nonzero__()) {
                                throw Py.makeException(frame.getglobal("error"), s$83);
                            }
                            if (frame.getlocal(11).__getitem__(i$41).__getitem__(i$41)._in(new PyTuple(new PyObject[] {frame.getglobal("MIN_REPEAT"), frame.getglobal("MAX_REPEAT")})).__nonzero__()) {
                                throw Py.makeException(frame.getglobal("error"), s$84);
                            }
                            if (frame.getlocal(0).invoke("match", s$74).__nonzero__()) {
                                frame.getlocal(12).__setitem__(i$42.__neg__(), new PyTuple(new PyObject[] {frame.getglobal("MIN_REPEAT"), new PyTuple(new PyObject[] {frame.getlocal(19), frame.getlocal(8), frame.getlocal(11)})}));
                            }
                            else {
                                frame.getlocal(12).__setitem__(i$42.__neg__(), new PyTuple(new PyObject[] {frame.getglobal("MAX_REPEAT"), new PyTuple(new PyObject[] {frame.getlocal(19), frame.getlocal(8), frame.getlocal(11)})}));
                            }
                        }
                        else {
                            if (frame.getlocal(3)._eq(s$85).__nonzero__()) {
                                frame.getlocal(12).invoke("append", new PyTuple(new PyObject[] {frame.getglobal("ANY"), frame.getglobal("None")}));
                            }
                            else {
                                if (frame.getlocal(3)._eq(s$86).__nonzero__()) {
                                    frame.setlocal(5, i$42);
                                    frame.setlocal(4, frame.getglobal("None"));
                                    if (frame.getlocal(0).invoke("match", s$74).__nonzero__()) {
                                        frame.setlocal(5, i$41);
                                        if (frame.getlocal(0).invoke("match", s$87).__nonzero__()) {
                                            if (frame.getlocal(0).invoke("match", s$88).__nonzero__()) {
                                                frame.setlocal(4, s$78);
                                                while (i$42.__nonzero__()) {
                                                    frame.setlocal(15, frame.getlocal(0).invoke("get"));
                                                    if (frame.getlocal(15)._is(frame.getglobal("None")).__nonzero__()) {
                                                        throw Py.makeException(frame.getglobal("error"), s$89);
                                                    }
                                                    if (frame.getlocal(15)._eq(s$90).__nonzero__()) {
                                                        break;
                                                    }
                                                    frame.setlocal(4, frame.getlocal(4)._add(frame.getlocal(15)));
                                                }
                                                frame.setlocal(5, i$42);
                                                if (frame.getglobal("isname").__call__(frame.getlocal(4)).__not__().__nonzero__()) {
                                                    throw Py.makeException(frame.getglobal("error"), s$91);
                                                }
                                            }
                                            else {
                                                if (frame.getlocal(0).invoke("match", s$92).__nonzero__()) {
                                                    frame.setlocal(4, s$78);
                                                    while (i$42.__nonzero__()) {
                                                        frame.setlocal(15, frame.getlocal(0).invoke("get"));
                                                        if (frame.getlocal(15)._is(frame.getglobal("None")).__nonzero__()) {
                                                            throw Py.makeException(frame.getglobal("error"), s$89);
                                                        }
                                                        if (frame.getlocal(15)._eq(s$65).__nonzero__()) {
                                                            break;
                                                        }
                                                        frame.setlocal(4, frame.getlocal(4)._add(frame.getlocal(15)));
                                                    }
                                                    if (frame.getglobal("isname").__call__(frame.getlocal(4)).__not__().__nonzero__()) {
                                                        throw Py.makeException(frame.getglobal("error"), s$91);
                                                    }
                                                    frame.setlocal(16, frame.getlocal(1).__getattr__("groupdict").invoke("get", frame.getlocal(4)));
                                                    if (frame.getlocal(16)._is(frame.getglobal("None")).__nonzero__()) {
                                                        throw Py.makeException(frame.getglobal("error"), s$93);
                                                    }
                                                    frame.getlocal(12).invoke("append", new PyTuple(new PyObject[] {frame.getglobal("GROUPREF"), frame.getlocal(16)}));
                                                    continue;
                                                }
                                                else {
                                                    frame.setlocal(15, frame.getlocal(0).invoke("get"));
                                                    if (frame.getlocal(15)._is(frame.getglobal("None")).__nonzero__()) {
                                                        throw Py.makeException(frame.getglobal("error"), s$94);
                                                    }
                                                    throw Py.makeException(frame.getglobal("error"), s$95._mod(frame.getlocal(15)));
                                                }
                                            }
                                        }
                                        else {
                                            if (frame.getlocal(0).invoke("match", s$96).__nonzero__()) {
                                                frame.setlocal(5, i$49);
                                            }
                                            else {
                                                if (frame.getlocal(0).invoke("match", s$67).__nonzero__()) {
                                                    while (i$42.__nonzero__()) {
                                                        if (((t$0$PyObject = frame.getlocal(0).__getattr__("next")._is(frame.getglobal("None"))).__nonzero__() ? t$0$PyObject : frame.getlocal(0).__getattr__("next")._eq(s$65)).__nonzero__()) {
                                                            break;
                                                        }
                                                        frame.getlocal(0).invoke("get");
                                                    }
                                                    if (frame.getlocal(0).invoke("match", s$65).__not__().__nonzero__()) {
                                                        throw Py.makeException(frame.getglobal("error"), s$97);
                                                    }
                                                    continue;
                                                }
                                                else {
                                                    if (frame.getlocal(0).__getattr__("next")._in(new PyTuple(new PyObject[] {s$92, s$98, s$88})).__nonzero__()) {
                                                        frame.setlocal(15, frame.getlocal(0).invoke("get"));
                                                        frame.setlocal(18, i$42);
                                                        if (frame.getlocal(15)._eq(s$88).__nonzero__()) {
                                                            if (frame.getlocal(0).__getattr__("next")._notin(new PyTuple(new PyObject[] {s$92, s$98})).__nonzero__()) {
                                                                throw Py.makeException(frame.getglobal("error"), s$99);
                                                            }
                                                            frame.setlocal(18, i$42.__neg__());
                                                            frame.setlocal(15, frame.getlocal(0).invoke("get"));
                                                        }
                                                        frame.setlocal(17, frame.getglobal("_parse_sub").__call__(frame.getlocal(0), frame.getlocal(1)));
                                                        if (frame.getlocal(0).invoke("match", s$65).__not__().__nonzero__()) {
                                                            throw Py.makeException(frame.getglobal("error"), s$97);
                                                        }
                                                        if (frame.getlocal(15)._eq(s$92).__nonzero__()) {
                                                            frame.getlocal(12).invoke("append", new PyTuple(new PyObject[] {frame.getglobal("ASSERT"), new PyTuple(new PyObject[] {frame.getlocal(18), frame.getlocal(17)})}));
                                                        }
                                                        else {
                                                            frame.getlocal(12).invoke("append", new PyTuple(new PyObject[] {frame.getglobal("ASSERT_NOT"), new PyTuple(new PyObject[] {frame.getlocal(18), frame.getlocal(17)})}));
                                                        }
                                                        continue;
                                                    }
                                                    else {
                                                        if (frame.getglobal("FLAGS").invoke("has_key", frame.getlocal(0).__getattr__("next")).__not__().__nonzero__()) {
                                                            throw Py.makeException(frame.getglobal("error"), s$94);
                                                        }
                                                        while (frame.getglobal("FLAGS").invoke("has_key", frame.getlocal(0).__getattr__("next")).__nonzero__()) {
                                                            frame.getlocal(1).__setattr__("flags", frame.getlocal(1).__getattr__("flags")._or(frame.getglobal("FLAGS").__getitem__(frame.getlocal(0).invoke("get"))));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (frame.getlocal(5).__nonzero__()) {
                                        if (frame.getlocal(5)._eq(i$49).__nonzero__()) {
                                            frame.setlocal(5, frame.getglobal("None"));
                                        }
                                        else {
                                            frame.setlocal(5, frame.getlocal(1).invoke("opengroup", frame.getlocal(4)));
                                        }
                                        frame.setlocal(17, frame.getglobal("_parse_sub").__call__(frame.getlocal(0), frame.getlocal(1)));
                                        if (frame.getlocal(0).invoke("match", s$65).__not__().__nonzero__()) {
                                            throw Py.makeException(frame.getglobal("error"), s$97);
                                        }
                                        if (frame.getlocal(5)._isnot(frame.getglobal("None")).__nonzero__()) {
                                            frame.getlocal(1).invoke("closegroup", frame.getlocal(5));
                                        }
                                        frame.getlocal(12).invoke("append", new PyTuple(new PyObject[] {frame.getglobal("SUBPATTERN"), new PyTuple(new PyObject[] {frame.getlocal(5), frame.getlocal(17)})}));
                                    }
                                    else {
                                        while (i$42.__nonzero__()) {
                                            frame.setlocal(15, frame.getlocal(0).invoke("get"));
                                            if (frame.getlocal(15)._is(frame.getglobal("None")).__nonzero__()) {
                                                throw Py.makeException(frame.getglobal("error"), s$94);
                                            }
                                            if (frame.getlocal(15)._eq(s$65).__nonzero__()) {
                                                break;
                                            }
                                            throw Py.makeException(frame.getglobal("error"), s$100);
                                        }
                                    }
                                }
                                else {
                                    if (frame.getlocal(3)._eq(s$69).__nonzero__()) {
                                        frame.getlocal(12).invoke("append", new PyTuple(new PyObject[] {frame.getglobal("AT"), frame.getglobal("AT_BEGINNING")}));
                                    }
                                    else {
                                        if (frame.getlocal(3)._eq(s$101).__nonzero__()) {
                                            frame.getlocal(12).invoke("append", new PyTuple(new PyObject[] {frame.getglobal("AT"), frame.getglobal("AT_END")}));
                                        }
                                        else {
                                            if (((t$0$PyObject = frame.getlocal(3)).__nonzero__() ? frame.getlocal(3).__getitem__(i$41)._eq(s$22) : t$0$PyObject).__nonzero__()) {
                                                frame.setlocal(2, frame.getglobal("_escape").__call__(frame.getlocal(0), frame.getlocal(3), frame.getlocal(1)));
                                                frame.getlocal(12).invoke("append", frame.getlocal(2));
                                            }
                                            else {
                                                throw Py.makeException(frame.getglobal("error"), s$102);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return frame.getlocal(12);
        }
        
        private static PyObject parse$33(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject;
            
            // Code
            frame.setlocal(3, frame.getglobal("Tokenizer").__call__(frame.getlocal(0)));
            if (frame.getlocal(2)._is(frame.getglobal("None")).__nonzero__()) {
                frame.setlocal(2, frame.getglobal("Pattern").__call__());
            }
            frame.getlocal(2).__setattr__("flags", frame.getlocal(1));
            frame.getlocal(2).__setattr__("str", frame.getlocal(0));
            frame.setlocal(4, frame.getglobal("_parse_sub").__call__(frame.getlocal(3), frame.getlocal(2), i$41));
            frame.setlocal(5, frame.getlocal(3).invoke("get"));
            if (frame.getlocal(5)._eq(s$65).__nonzero__()) {
                throw Py.makeException(frame.getglobal("error"), s$97);
            }
            else {
                if (frame.getlocal(5).__nonzero__()) {
                    throw Py.makeException(frame.getglobal("error"), s$103);
                }
            }
            if (frame.getlocal(1)._and(frame.getglobal("SRE_FLAG_DEBUG")).__nonzero__()) {
                frame.getlocal(4).invoke("dump");
            }
            if (((t$0$PyObject = frame.getlocal(1)._and(frame.getglobal("SRE_FLAG_VERBOSE")).__not__()).__nonzero__() ? frame.getlocal(4).__getattr__("pattern").__getattr__("flags")._and(frame.getglobal("SRE_FLAG_VERBOSE")) : t$0$PyObject).__nonzero__()) {
                return frame.getglobal("parse").__call__(frame.getlocal(0), frame.getlocal(4).__getattr__("pattern").__getattr__("flags"));
            }
            return frame.getlocal(4);
        }
        
        private static PyObject literal$34(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject;
            
            // Code
            if (((t$0$PyObject = frame.getlocal(1)).__nonzero__() ? frame.getlocal(1).__getitem__(i$42.__neg__()).__getitem__(i$41)._is(frame.getglobal("LITERAL")) : t$0$PyObject).__nonzero__()) {
                frame.getlocal(1).__setitem__(i$42.__neg__(), new PyTuple(new PyObject[] {frame.getglobal("LITERAL"), frame.getlocal(1).__getitem__(i$42.__neg__()).__getitem__(i$42)._add(frame.getlocal(0))}));
            }
            else {
                frame.getlocal(1).invoke("append", new PyTuple(new PyObject[] {frame.getglobal("LITERAL"), frame.getlocal(0)}));
            }
            return Py.None;
        }
        
        private static PyObject parse_template$35(PyFrame frame) {
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            PyException t$0$PyException, t$1$PyException;
            PyObject t$0$PyObject, t$1$PyObject;
            
            // Code
            frame.setlocal(13, frame.getglobal("Tokenizer").__call__(frame.getlocal(0)));
            frame.setlocal(14, new PyList(new PyObject[] {}));
            frame.setlocal(17, frame.getlocal(14).__getattr__("append"));
            frame.setlocal(6, new PyFunction(frame.f_globals, new PyObject[] {frame.getlocal(14)}, c$33_literal));
            frame.setlocal(10, frame.getlocal(0).__getslice__(null, i$41, null));
            if (frame.getglobal("type").__call__(frame.getlocal(10))._is(frame.getglobal("type").__call__(s$78)).__nonzero__()) {
                frame.setlocal(5, frame.getglobal("chr"));
            }
            else {
                frame.setlocal(5, frame.getglobal("unichr"));
            }
            while (i$42.__nonzero__()) {
                frame.setlocal(4, frame.getlocal(13).invoke("get"));
                if (frame.getlocal(4)._is(frame.getglobal("None")).__nonzero__()) {
                    break;
                }
                if (((t$0$PyObject = frame.getlocal(4)).__nonzero__() ? frame.getlocal(4).__getitem__(i$41)._eq(s$22) : t$0$PyObject).__nonzero__()) {
                    if (frame.getlocal(4)._eq(s$104).__nonzero__()) {
                        frame.setlocal(8, s$78);
                        if (frame.getlocal(13).invoke("match", s$88).__nonzero__()) {
                            while (i$42.__nonzero__()) {
                                frame.setlocal(12, frame.getlocal(13).invoke("get"));
                                if (frame.getlocal(12)._is(frame.getglobal("None")).__nonzero__()) {
                                    throw Py.makeException(frame.getglobal("error"), s$105);
                                }
                                if (frame.getlocal(12)._eq(s$90).__nonzero__()) {
                                    break;
                                }
                                frame.setlocal(8, frame.getlocal(8)._add(frame.getlocal(12)));
                            }
                        }
                        if (frame.getlocal(8).__not__().__nonzero__()) {
                            throw Py.makeException(frame.getglobal("error"), s$106);
                        }
                        try {
                            frame.setlocal(11, frame.getglobal("atoi").__call__(frame.getlocal(8)));
                        }
                        catch (Throwable x$0) {
                            t$0$PyException = Py.setException(x$0, frame);
                            if (Py.matchException(t$0$PyException, frame.getglobal("ValueError"))) {
                                if (frame.getglobal("isname").__call__(frame.getlocal(8)).__not__().__nonzero__()) {
                                    throw Py.makeException(frame.getglobal("error"), s$91);
                                }
                                try {
                                    frame.setlocal(11, frame.getlocal(1).__getattr__("groupindex").__getitem__(frame.getlocal(8)));
                                }
                                catch (Throwable x$1) {
                                    t$1$PyException = Py.setException(x$1, frame);
                                    if (Py.matchException(t$1$PyException, frame.getglobal("KeyError"))) {
                                        throw Py.makeException(frame.getglobal("IndexError"), s$93);
                                    }
                                    else throw t$1$PyException;
                                }
                            }
                            else throw t$0$PyException;
                        }
                        frame.getlocal(17).__call__(new PyTuple(new PyObject[] {frame.getglobal("MARK"), frame.getlocal(11)}));
                    }
                    else {
                        if (((t$0$PyObject = frame.getglobal("len").__call__(frame.getlocal(4))._gt(i$42)).__nonzero__() ? frame.getlocal(4).__getitem__(i$42)._in(frame.getglobal("DIGITS")) : t$0$PyObject).__nonzero__()) {
                            frame.setlocal(3, frame.getglobal("None"));
                            while (i$42.__nonzero__()) {
                                frame.setlocal(9, frame.getglobal("_group").__call__(frame.getlocal(4), frame.getlocal(1).__getattr__("groups")._add(i$42)));
                                if (frame.getlocal(9).__nonzero__()) {
                                    if (((t$0$PyObject = frame.getlocal(13).__getattr__("next")._notin(frame.getglobal("DIGITS"))).__nonzero__() ? t$0$PyObject : frame.getglobal("_group").__call__(frame.getlocal(4)._add(frame.getlocal(13).__getattr__("next")), frame.getlocal(1).__getattr__("groups")._add(i$42)).__not__()).__nonzero__()) {
                                        frame.setlocal(3, new PyTuple(new PyObject[] {frame.getglobal("MARK"), frame.getlocal(9)}));
                                        break;
                                    }
                                }
                                else {
                                    if (frame.getlocal(13).__getattr__("next")._in(frame.getglobal("OCTDIGITS")).__nonzero__()) {
                                        frame.setlocal(4, frame.getlocal(4)._add(frame.getlocal(13).invoke("get")));
                                    }
                                    else {
                                        break;
                                    }
                                }
                            }
                            if (frame.getlocal(3).__not__().__nonzero__()) {
                                frame.setlocal(4, frame.getlocal(4).__getslice__(i$42, null, null));
                                frame.setlocal(3, new PyTuple(new PyObject[] {frame.getglobal("LITERAL"), frame.getlocal(5).__call__(frame.getglobal("atoi").__call__(frame.getlocal(4).__getslice__(i$107.__neg__(), null, null), i$40)._and(i$61))}));
                            }
                            if (frame.getlocal(3).__getitem__(i$41)._is(frame.getglobal("LITERAL")).__nonzero__()) {
                                frame.getlocal(6).__call__(frame.getlocal(3).__getitem__(i$42));
                            }
                            else {
                                frame.getlocal(17).__call__(frame.getlocal(3));
                            }
                        }
                        else {
                            try {
                                frame.setlocal(4, frame.getlocal(5).__call__(frame.getglobal("ESCAPES").__getitem__(frame.getlocal(4)).__getitem__(i$42)));
                            }
                            catch (Throwable x$2) {
                                t$0$PyException = Py.setException(x$2, frame);
                                if (Py.matchException(t$0$PyException, frame.getglobal("KeyError"))) {
                                    // pass
                                }
                                else throw t$0$PyException;
                            }
                            frame.getlocal(6).__call__(frame.getlocal(4));
                        }
                    }
                }
                else {
                    frame.getlocal(6).__call__(frame.getlocal(4));
                }
            }
            frame.setlocal(15, i$41);
            frame.setlocal(7, new PyList(new PyObject[] {}));
            frame.setlocal(2, new PyList(new PyObject[] {}));
            t$0$PyObject = frame.getlocal(14).__iter__();
            while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                t$0$PyObject__ = org.python.core.Py.unpackSequence(t$1$PyObject, 2);
                frame.setlocal(16, t$0$PyObject__[0]);
                frame.setlocal(13, t$0$PyObject__[1]);
                if (frame.getlocal(16)._is(frame.getglobal("MARK")).__nonzero__()) {
                    frame.getlocal(7).invoke("append", new PyTuple(new PyObject[] {frame.getlocal(15), frame.getlocal(13)}));
                    frame.getlocal(2).invoke("append", frame.getglobal("None"));
                }
                else {
                    frame.getlocal(2).invoke("append", frame.getlocal(13));
                }
                frame.setlocal(15, frame.getlocal(15)._add(i$42));
            }
            return new PyTuple(new PyObject[] {frame.getlocal(7), frame.getlocal(2)});
        }
        
        private static PyObject expand_template$36(PyFrame frame) {
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            PyException t$0$PyException;
            PyObject t$0$PyObject, t$1$PyObject, t$2$PyObject;
            
            // Code
            frame.setlocal(4, frame.getlocal(1).__getattr__("group"));
            frame.setlocal(8, frame.getlocal(1).__getattr__("string").__getslice__(null, i$41, null));
            t$0$PyObject__ = org.python.core.Py.unpackSequence(frame.getlocal(0), 2);
            frame.setlocal(3, t$0$PyObject__[0]);
            frame.setlocal(2, t$0$PyObject__[1]);
            frame.setlocal(2, frame.getlocal(2).__getslice__(null, null, null));
            try {
                t$0$PyObject = frame.getlocal(3).__iter__();
                while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                    t$0$PyObject__ = org.python.core.Py.unpackSequence(t$1$PyObject, 2);
                    frame.setlocal(5, t$0$PyObject__[0]);
                    frame.setlocal(6, t$0$PyObject__[1]);
                    t$2$PyObject = frame.getlocal(4).__call__(frame.getlocal(6));
                    frame.getlocal(2).__setitem__(frame.getlocal(5), t$2$PyObject);
                    frame.setlocal(7, t$2$PyObject);
                    if (frame.getlocal(7)._is(frame.getglobal("None")).__nonzero__()) {
                        throw Py.makeException(frame.getglobal("IndexError"));
                    }
                }
            }
            catch (Throwable x$0) {
                t$0$PyException = Py.setException(x$0, frame);
                if (Py.matchException(t$0$PyException, frame.getglobal("IndexError"))) {
                    throw Py.makeException(frame.getglobal("error"), s$108);
                }
                else throw t$0$PyException;
            }
            return frame.getglobal("string").__getattr__("join").__call__(frame.getlocal(2), frame.getlocal(8));
        }
        
        private static PyObject main$37(PyFrame frame) {
            frame.setglobal("__file__", s$109);
            
            // Temporary Variables
            PyException t$0$PyException;
            
            // Code
            /* Internal support module for sre */
            frame.setlocal("string", org.python.core.imp.importOne("string", frame));
            frame.setlocal("sys", org.python.core.imp.importOne("sys", frame));
            org.python.core.imp.importAll("sre_constants", frame);
            frame.setlocal("SPECIAL_CHARS", s$1);
            frame.setlocal("REPEAT_CHARS", s$2);
            frame.setlocal("DIGITS", frame.getname("tuple").__call__(s$3));
            frame.setlocal("OCTDIGITS", frame.getname("tuple").__call__(s$4));
            frame.setlocal("HEXDIGITS", frame.getname("tuple").__call__(s$5));
            frame.setlocal("WHITESPACE", frame.getname("tuple").__call__(s$6));
            frame.setlocal("ESCAPES", new PyDictionary(new PyObject[] {s$7, new PyTuple(new PyObject[] {frame.getname("LITERAL"), frame.getname("ord").__call__(s$8)}), s$9, new PyTuple(new PyObject[] {frame.getname("LITERAL"), frame.getname("ord").__call__(s$10)}), s$11, new PyTuple(new PyObject[] {frame.getname("LITERAL"), frame.getname("ord").__call__(s$12)}), s$13, new PyTuple(new PyObject[] {frame.getname("LITERAL"), frame.getname("ord").__call__(s$14)}), s$15, new PyTuple(new PyObject[] {frame.getname("LITERAL"), frame.getname("ord").__call__(s$16)}), s$17, new PyTuple(new PyObject[] {frame.getname("LITERAL"), frame.getname("ord").__call__(s$18)}), s$19, new PyTuple(new PyObject[] {frame.getname("LITERAL"), frame.getname("ord").__call__(s$20)}), s$21, new PyTuple(new PyObject[] {frame.getname("LITERAL"), frame.getname("ord").__call__(s$22)})}));
            frame.setlocal("CATEGORIES", new PyDictionary(new PyObject[] {s$23, new PyTuple(new PyObject[] {frame.getname("AT"), frame.getname("AT_BEGINNING_STRING")}), s$9, new PyTuple(new PyObject[] {frame.getname("AT"), frame.getname("AT_BOUNDARY")}), s$24, new PyTuple(new PyObject[] {frame.getname("AT"), frame.getname("AT_NON_BOUNDARY")}), s$25, new PyTuple(new PyObject[] {frame.getname("IN"), new PyList(new PyObject[] {new PyTuple(new PyObject[] {frame.getname("CATEGORY"), frame.getname("CATEGORY_DIGIT")})})}), s$26, new PyTuple(new PyObject[] {frame.getname("IN"), new PyList(new PyObject[] {new PyTuple(new PyObject[] {frame.getname("CATEGORY"), frame.getname("CATEGORY_NOT_DIGIT")})})}), s$27, new PyTuple(new PyObject[] {frame.getname("IN"), new PyList(new PyObject[] {new PyTuple(new PyObject[] {frame.getname("CATEGORY"), frame.getname("CATEGORY_SPACE")})})}), s$28, new PyTuple(new PyObject[] {frame.getname("IN"), new PyList(new PyObject[] {new PyTuple(new PyObject[] {frame.getname("CATEGORY"), frame.getname("CATEGORY_NOT_SPACE")})})}), s$29, new PyTuple(new PyObject[] {frame.getname("IN"), new PyList(new PyObject[] {new PyTuple(new PyObject[] {frame.getname("CATEGORY"), frame.getname("CATEGORY_WORD")})})}), s$30, new PyTuple(new PyObject[] {frame.getname("IN"), new PyList(new PyObject[] {new PyTuple(new PyObject[] {frame.getname("CATEGORY"), frame.getname("CATEGORY_NOT_WORD")})})}), s$31, new PyTuple(new PyObject[] {frame.getname("AT"), frame.getname("AT_END_STRING")})}));
            frame.setlocal("FLAGS", new PyDictionary(new PyObject[] {s$32, frame.getname("SRE_FLAG_IGNORECASE"), s$33, frame.getname("SRE_FLAG_LOCALE"), s$34, frame.getname("SRE_FLAG_MULTILINE"), s$35, frame.getname("SRE_FLAG_DOTALL"), s$36, frame.getname("SRE_FLAG_VERBOSE"), s$37, frame.getname("SRE_FLAG_TEMPLATE"), s$38, frame.getname("SRE_FLAG_UNICODE")}));
            try {
                frame.getname("int").__call__(s$39, i$40);
                frame.setlocal("atoi", frame.getname("int"));
            }
            catch (Throwable x$0) {
                t$0$PyException = Py.setException(x$0, frame);
                if (Py.matchException(t$0$PyException, frame.getname("TypeError"))) {
                    frame.setlocal("atoi", frame.getname("string").__getattr__("atoi"));
                }
                else throw t$0$PyException;
            }
            frame.setlocal("Pattern", Py.makeClass("Pattern", new PyObject[] {}, c$4_Pattern, null));
            frame.setlocal("SubPattern", Py.makeClass("SubPattern", new PyObject[] {}, c$16_SubPattern, null));
            frame.setlocal("Tokenizer", Py.makeClass("Tokenizer", new PyObject[] {}, c$23_Tokenizer, null));
            frame.setlocal("isident", new PyFunction(frame.f_globals, new PyObject[] {}, c$24_isident));
            frame.setlocal("isdigit", new PyFunction(frame.f_globals, new PyObject[] {}, c$25_isdigit));
            frame.setlocal("isname", new PyFunction(frame.f_globals, new PyObject[] {}, c$26_isname));
            frame.setlocal("_group", new PyFunction(frame.f_globals, new PyObject[] {}, c$27__group));
            frame.setlocal("_class_escape", new PyFunction(frame.f_globals, new PyObject[] {}, c$28__class_escape));
            frame.setlocal("_escape", new PyFunction(frame.f_globals, new PyObject[] {}, c$29__escape));
            frame.setlocal("_parse_sub", new PyFunction(frame.f_globals, new PyObject[] {i$42}, c$30__parse_sub));
            frame.setlocal("_parse", new PyFunction(frame.f_globals, new PyObject[] {}, c$31__parse));
            frame.setlocal("parse", new PyFunction(frame.f_globals, new PyObject[] {i$41, frame.getname("None")}, c$32_parse));
            frame.setlocal("parse_template", new PyFunction(frame.f_globals, new PyObject[] {}, c$34_parse_template));
            frame.setlocal("expand_template", new PyFunction(frame.f_globals, new PyObject[] {}, c$35_expand_template));
            return Py.None;
        }
        
    }
    public static void moduleDictInit(PyObject dict) {
        dict.__setitem__("__name__", new PyString("sre_parse"));
        Py.runCode(new _PyInner().getMain(), dict, dict);
    }
    
    public static void main(String[] args) throws java.lang.Exception {
        String[] newargs = new String[args.length+1];
        newargs[0] = "sre_parse";
        java.lang.System.arraycopy(args, 0, newargs, 1, args.length);
        Py.runMain(sre_parse._PyInner.class, newargs, sre_parse.jpy$packages, sre_parse.jpy$mainProperties, "", new String[] {"string", "random", "traceback", "sre_compile", "atexit", "warnings", "popen2", "getopt", "sre", "sre_constants", "StringIO", "QAsystem", "javaos", "repr", "copy_reg", "re", "linecache", "javapath", "UserDict", "copy", "threading", "stat", "sre_parse", "javashell"});
    }
    
}

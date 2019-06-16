import org.python.core.*;

public class sre_compile extends java.lang.Object {
    static String[] jpy$mainProperties = new String[] {"python.modules.builtin", "exceptions:org.python.core.exceptions"};
    static String[] jpy$proxyProperties = new String[] {"python.modules.builtin", "exceptions:org.python.core.exceptions", "python.options.showJavaExceptions", "true"};
    static String[] jpy$packages = new String[] {"org.python.core", null, "java.lang", null, "java.io", null, "java.util", null};
    
    public static class _PyInner extends PyFunctionTable implements PyRunnable {
        private static PyObject s$0;
        private static PyObject s$1;
        private static PyObject i$2;
        private static PyObject i$3;
        private static PyObject s$4;
        private static PyObject i$5;
        private static PyObject i$6;
        private static PyObject s$7;
        private static PyObject s$8;
        private static PyObject s$9;
        private static PyObject i$10;
        private static PyObject i$11;
        private static PyObject i$12;
        private static PyObject s$13;
        private static PyObject s$14;
        private static PyObject s$15;
        private static PyObject i$16;
        private static PyObject s$17;
        private static PyObject s$18;
        private static PyFunctionTable funcTable;
        private static PyCode c$0_fixup;
        private static PyCode c$1_lambda;
        private static PyCode c$2__compile;
        private static PyCode c$3_lambda;
        private static PyCode c$4__compile_charset;
        private static PyCode c$5__optimize_charset;
        private static PyCode c$6__mk_bitmap;
        private static PyCode c$7__optimize_unicode;
        private static PyCode c$8__simple;
        private static PyCode c$9__compile_info;
        private static PyCode c$10__code;
        private static PyCode c$11_compile;
        private static PyCode c$12_main;
        private static void initConstants() {
            s$0 = Py.newString("Internal support module for sre");
            s$1 = Py.newString("SRE module mismatch");
            i$2 = Py.newInteger(65535);
            i$3 = Py.newInteger(0);
            s$4 = Py.newString("internal: unsupported template operator");
            i$5 = Py.newInteger(1);
            i$6 = Py.newInteger(2);
            s$7 = Py.newString("look-behind requires fixed-width pattern");
            s$8 = Py.newString("unsupported operand type");
            s$9 = Py.newString("internal: unsupported set operator");
            i$10 = Py.newInteger(256);
            i$11 = Py.newInteger(65536);
            i$12 = Py.newInteger(128);
            s$13 = Py.newString("big");
            s$14 = Py.newString("nothing to repeat");
            s$15 = Py.newString("");
            i$16 = Py.newInteger(100);
            s$17 = Py.newString("sorry, but this version only supports 100 named groups");
            s$18 = Py.newString("F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_compile.py");
            funcTable = new _PyInner();
            c$0_fixup = Py.newCode(2, new String[] {"literal", "flags"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_compile.py", "fixup", false, false, funcTable, 0, null, null, 0, 17);
            c$1_lambda = Py.newCode(1, new String[] {"x"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_compile.py", "<lambda>", false, false, funcTable, 1, null, null, 0, 17);
            c$2__compile = Py.newCode(3, new String[] {"code", "pattern", "flags", "av", "emit", "skip", "lo", "op", "fixup", "hi", "tail"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_compile.py", "_compile", false, false, funcTable, 2, null, null, 0, 17);
            c$3_lambda = Py.newCode(1, new String[] {"x"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_compile.py", "<lambda>", false, false, funcTable, 3, null, null, 0, 17);
            c$4__compile_charset = Py.newCode(4, new String[] {"charset", "flags", "code", "fixup", "op", "av", "emit"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_compile.py", "_compile_charset", false, false, funcTable, 4, null, null, 0, 17);
            c$5__optimize_charset = Py.newCode(2, new String[] {"charset", "fixup", "op", "av", "charmap", "p", "n", "runs", "i", "out", "c", "data"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_compile.py", "_optimize_charset", false, false, funcTable, 5, null, null, 0, 17);
            c$6__mk_bitmap = Py.newCode(1, new String[] {"bits", "m", "v", "data", "c"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_compile.py", "_mk_bitmap", false, false, funcTable, 6, null, null, 0, 17);
            c$7__optimize_unicode = Py.newCode(2, new String[] {"charset", "fixup", "negate", "block", "op", "mapping", "chunk", "av", "charmap", "comps", "new", "header", "i", "data"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_compile.py", "_optimize_unicode", false, false, funcTable, 7, null, null, 0, 17);
            c$8__simple = Py.newCode(1, new String[] {"av", "hi", "lo"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_compile.py", "_simple", false, false, funcTable, 8, null, null, 0, 17);
            c$9__compile_info = Py.newCode(3, new String[] {"code", "pattern", "flags", "hi", "charset", "lo", "op", "av", "emit", "p", "skip", "prefix", "i", "mask", "table", "c", "prefix_skip"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_compile.py", "_compile_info", false, false, funcTable, 9, null, null, 0, 17);
            c$10__code = Py.newCode(2, new String[] {"p", "flags", "code"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_compile.py", "_code", false, false, funcTable, 10, null, null, 0, 17);
            c$11_compile = Py.newCode(2, new String[] {"p", "flags", "groupindex", "code", "indexgroup", "k", "i", "sre_parse", "pattern"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_compile.py", "compile", false, false, funcTable, 11, null, null, 0, 17);
            c$12_main = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\sre_compile.py", "main", false, false, funcTable, 12, null, null, 0, 16);
        }
        
        
        public PyCode getMain() {
            if (c$12_main == null) _PyInner.initConstants();
            return c$12_main;
        }
        
        public PyObject call_function(int index, PyFrame frame) {
            switch (index){
                case 0:
                return _PyInner.fixup$1(frame);
                case 1:
                return _PyInner.lambda$2(frame);
                case 2:
                return _PyInner._compile$3(frame);
                case 3:
                return _PyInner.lambda$4(frame);
                case 4:
                return _PyInner._compile_charset$5(frame);
                case 5:
                return _PyInner._optimize_charset$6(frame);
                case 6:
                return _PyInner._mk_bitmap$7(frame);
                case 7:
                return _PyInner._optimize_unicode$8(frame);
                case 8:
                return _PyInner._simple$9(frame);
                case 9:
                return _PyInner._compile_info$10(frame);
                case 10:
                return _PyInner._code$11(frame);
                case 11:
                return _PyInner.compile$12(frame);
                case 12:
                return _PyInner.main$13(frame);
                default:
                return null;
            }
        }
        
        private static PyObject fixup$1(PyFrame frame) {
            return frame.getglobal("_sre").__getattr__("getlower").__call__(frame.getlocal(0), frame.getlocal(1));
        }
        
        private static PyObject lambda$2(PyFrame frame) {
            return frame.getlocal(0);
        }
        
        private static PyObject _compile$3(PyFrame frame) {
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            PyObject t$0$PyObject, t$1$PyObject, t$2$PyObject, t$3$PyObject, t$4$PyObject, t$5$PyObject;
            
            // Code
            frame.setlocal(4, frame.getlocal(0).__getattr__("append"));
            t$0$PyObject = frame.getlocal(1).__iter__();
            while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                t$0$PyObject__ = org.python.core.Py.unpackSequence(t$1$PyObject, 2);
                frame.setlocal(7, t$0$PyObject__[0]);
                frame.setlocal(3, t$0$PyObject__[1]);
                if (frame.getlocal(7)._in(new PyTuple(new PyObject[] {frame.getglobal("LITERAL"), frame.getglobal("NOT_LITERAL")})).__nonzero__()) {
                    if (frame.getlocal(2)._and(frame.getglobal("SRE_FLAG_IGNORECASE")).__nonzero__()) {
                        frame.getlocal(4).__call__(frame.getglobal("OPCODES").__getitem__(frame.getglobal("OP_IGNORE").__getitem__(frame.getlocal(7))));
                        frame.getlocal(4).__call__(frame.getglobal("_sre").__getattr__("getlower").__call__(frame.getlocal(3), frame.getlocal(2)));
                    }
                    else {
                        frame.getlocal(4).__call__(frame.getglobal("OPCODES").__getitem__(frame.getlocal(7)));
                        frame.getlocal(4).__call__(frame.getlocal(3));
                    }
                }
                else {
                    if (frame.getlocal(7)._is(frame.getglobal("IN")).__nonzero__()) {
                        if (frame.getlocal(2)._and(frame.getglobal("SRE_FLAG_IGNORECASE")).__nonzero__()) {
                            frame.getlocal(4).__call__(frame.getglobal("OPCODES").__getitem__(frame.getglobal("OP_IGNORE").__getitem__(frame.getlocal(7))));
                            frame.setlocal(8, new PyFunction(frame.f_globals, new PyObject[] {frame.getlocal(2)}, c$0_fixup));
                        }
                        else {
                            frame.getlocal(4).__call__(frame.getglobal("OPCODES").__getitem__(frame.getlocal(7)));
                            frame.setlocal(8, new PyFunction(frame.f_globals, new PyObject[] {}, c$1_lambda));
                        }
                        frame.setlocal(5, frame.getglobal("len").__call__(frame.getlocal(0)));
                        frame.getlocal(4).__call__(i$3);
                        frame.getglobal("_compile_charset").__call__(new PyObject[] {frame.getlocal(3), frame.getlocal(2), frame.getlocal(0), frame.getlocal(8)});
                        frame.getlocal(0).__setitem__(frame.getlocal(5), frame.getglobal("len").__call__(frame.getlocal(0))._sub(frame.getlocal(5)));
                    }
                    else {
                        if (frame.getlocal(7)._is(frame.getglobal("ANY")).__nonzero__()) {
                            if (frame.getlocal(2)._and(frame.getglobal("SRE_FLAG_DOTALL")).__nonzero__()) {
                                frame.getlocal(4).__call__(frame.getglobal("OPCODES").__getitem__(frame.getglobal("ANY_ALL")));
                            }
                            else {
                                frame.getlocal(4).__call__(frame.getglobal("OPCODES").__getitem__(frame.getglobal("ANY")));
                            }
                        }
                        else {
                            if (frame.getlocal(7)._in(new PyTuple(new PyObject[] {frame.getglobal("REPEAT"), frame.getglobal("MIN_REPEAT"), frame.getglobal("MAX_REPEAT")})).__nonzero__()) {
                                if (frame.getlocal(2)._and(frame.getglobal("SRE_FLAG_TEMPLATE")).__nonzero__()) {
                                    throw Py.makeException(frame.getglobal("error"), s$4);
                                }
                                else {
                                    if (((t$2$PyObject = frame.getglobal("_simple").__call__(frame.getlocal(3))).__nonzero__() ? frame.getlocal(7)._eq(frame.getglobal("MAX_REPEAT")) : t$2$PyObject).__nonzero__()) {
                                        frame.getlocal(4).__call__(frame.getglobal("OPCODES").__getitem__(frame.getglobal("REPEAT_ONE")));
                                        frame.setlocal(5, frame.getglobal("len").__call__(frame.getlocal(0)));
                                        frame.getlocal(4).__call__(i$3);
                                        frame.getlocal(4).__call__(frame.getlocal(3).__getitem__(i$3));
                                        frame.getlocal(4).__call__(frame.getlocal(3).__getitem__(i$5));
                                        frame.getglobal("_compile").__call__(frame.getlocal(0), frame.getlocal(3).__getitem__(i$6), frame.getlocal(2));
                                        frame.getlocal(4).__call__(frame.getglobal("OPCODES").__getitem__(frame.getglobal("SUCCESS")));
                                        frame.getlocal(0).__setitem__(frame.getlocal(5), frame.getglobal("len").__call__(frame.getlocal(0))._sub(frame.getlocal(5)));
                                    }
                                    else {
                                        frame.getlocal(4).__call__(frame.getglobal("OPCODES").__getitem__(frame.getglobal("REPEAT")));
                                        frame.setlocal(5, frame.getglobal("len").__call__(frame.getlocal(0)));
                                        frame.getlocal(4).__call__(i$3);
                                        frame.getlocal(4).__call__(frame.getlocal(3).__getitem__(i$3));
                                        frame.getlocal(4).__call__(frame.getlocal(3).__getitem__(i$5));
                                        frame.getglobal("_compile").__call__(frame.getlocal(0), frame.getlocal(3).__getitem__(i$6), frame.getlocal(2));
                                        frame.getlocal(0).__setitem__(frame.getlocal(5), frame.getglobal("len").__call__(frame.getlocal(0))._sub(frame.getlocal(5)));
                                        if (frame.getlocal(7)._eq(frame.getglobal("MAX_REPEAT")).__nonzero__()) {
                                            frame.getlocal(4).__call__(frame.getglobal("OPCODES").__getitem__(frame.getglobal("MAX_UNTIL")));
                                        }
                                        else {
                                            frame.getlocal(4).__call__(frame.getglobal("OPCODES").__getitem__(frame.getglobal("MIN_UNTIL")));
                                        }
                                    }
                                }
                            }
                            else {
                                if (frame.getlocal(7)._is(frame.getglobal("SUBPATTERN")).__nonzero__()) {
                                    if (frame.getlocal(3).__getitem__(i$3).__nonzero__()) {
                                        frame.getlocal(4).__call__(frame.getglobal("OPCODES").__getitem__(frame.getglobal("MARK")));
                                        frame.getlocal(4).__call__(frame.getlocal(3).__getitem__(i$3)._sub(i$5)._mul(i$6));
                                    }
                                    frame.getglobal("_compile").__call__(frame.getlocal(0), frame.getlocal(3).__getitem__(i$5), frame.getlocal(2));
                                    if (frame.getlocal(3).__getitem__(i$3).__nonzero__()) {
                                        frame.getlocal(4).__call__(frame.getglobal("OPCODES").__getitem__(frame.getglobal("MARK")));
                                        frame.getlocal(4).__call__(frame.getlocal(3).__getitem__(i$3)._sub(i$5)._mul(i$6)._add(i$5));
                                    }
                                }
                                else {
                                    if (frame.getlocal(7)._in(new PyTuple(new PyObject[] {frame.getglobal("SUCCESS"), frame.getglobal("FAILURE")})).__nonzero__()) {
                                        frame.getlocal(4).__call__(frame.getglobal("OPCODES").__getitem__(frame.getlocal(7)));
                                    }
                                    else {
                                        if (frame.getlocal(7)._in(new PyTuple(new PyObject[] {frame.getglobal("ASSERT"), frame.getglobal("ASSERT_NOT")})).__nonzero__()) {
                                            frame.getlocal(4).__call__(frame.getglobal("OPCODES").__getitem__(frame.getlocal(7)));
                                            frame.setlocal(5, frame.getglobal("len").__call__(frame.getlocal(0)));
                                            frame.getlocal(4).__call__(i$3);
                                            if (frame.getlocal(3).__getitem__(i$3)._ge(i$3).__nonzero__()) {
                                                frame.getlocal(4).__call__(i$3);
                                            }
                                            else {
                                                t$0$PyObject__ = org.python.core.Py.unpackSequence(frame.getlocal(3).__getitem__(i$5).invoke("getwidth"), 2);
                                                frame.setlocal(6, t$0$PyObject__[0]);
                                                frame.setlocal(9, t$0$PyObject__[1]);
                                                if (frame.getlocal(6)._ne(frame.getlocal(9)).__nonzero__()) {
                                                    throw Py.makeException(frame.getglobal("error"), s$7);
                                                }
                                                frame.getlocal(4).__call__(frame.getlocal(6));
                                            }
                                            frame.getglobal("_compile").__call__(frame.getlocal(0), frame.getlocal(3).__getitem__(i$5), frame.getlocal(2));
                                            frame.getlocal(4).__call__(frame.getglobal("OPCODES").__getitem__(frame.getglobal("SUCCESS")));
                                            frame.getlocal(0).__setitem__(frame.getlocal(5), frame.getglobal("len").__call__(frame.getlocal(0))._sub(frame.getlocal(5)));
                                        }
                                        else {
                                            if (frame.getlocal(7)._is(frame.getglobal("CALL")).__nonzero__()) {
                                                frame.getlocal(4).__call__(frame.getglobal("OPCODES").__getitem__(frame.getlocal(7)));
                                                frame.setlocal(5, frame.getglobal("len").__call__(frame.getlocal(0)));
                                                frame.getlocal(4).__call__(i$3);
                                                frame.getglobal("_compile").__call__(frame.getlocal(0), frame.getlocal(3), frame.getlocal(2));
                                                frame.getlocal(4).__call__(frame.getglobal("OPCODES").__getitem__(frame.getglobal("SUCCESS")));
                                                frame.getlocal(0).__setitem__(frame.getlocal(5), frame.getglobal("len").__call__(frame.getlocal(0))._sub(frame.getlocal(5)));
                                            }
                                            else {
                                                if (frame.getlocal(7)._is(frame.getglobal("AT")).__nonzero__()) {
                                                    frame.getlocal(4).__call__(frame.getglobal("OPCODES").__getitem__(frame.getlocal(7)));
                                                    if (frame.getlocal(2)._and(frame.getglobal("SRE_FLAG_MULTILINE")).__nonzero__()) {
                                                        frame.setlocal(3, frame.getglobal("AT_MULTILINE").invoke("get", frame.getlocal(3), frame.getlocal(3)));
                                                    }
                                                    if (frame.getlocal(2)._and(frame.getglobal("SRE_FLAG_LOCALE")).__nonzero__()) {
                                                        frame.setlocal(3, frame.getglobal("AT_LOCALE").invoke("get", frame.getlocal(3), frame.getlocal(3)));
                                                    }
                                                    else {
                                                        if (frame.getlocal(2)._and(frame.getglobal("SRE_FLAG_UNICODE")).__nonzero__()) {
                                                            frame.setlocal(3, frame.getglobal("AT_UNICODE").invoke("get", frame.getlocal(3), frame.getlocal(3)));
                                                        }
                                                    }
                                                    frame.getlocal(4).__call__(frame.getglobal("ATCODES").__getitem__(frame.getlocal(3)));
                                                }
                                                else {
                                                    if (frame.getlocal(7)._is(frame.getglobal("BRANCH")).__nonzero__()) {
                                                        frame.getlocal(4).__call__(frame.getglobal("OPCODES").__getitem__(frame.getlocal(7)));
                                                        frame.setlocal(10, new PyList(new PyObject[] {}));
                                                        t$2$PyObject = frame.getlocal(3).__getitem__(i$5).__iter__();
                                                        while ((t$3$PyObject = t$2$PyObject.__iternext__()) != null) {
                                                            frame.setlocal(3, t$3$PyObject);
                                                            frame.setlocal(5, frame.getglobal("len").__call__(frame.getlocal(0)));
                                                            frame.getlocal(4).__call__(i$3);
                                                            frame.getglobal("_compile").__call__(frame.getlocal(0), frame.getlocal(3), frame.getlocal(2));
                                                            frame.getlocal(4).__call__(frame.getglobal("OPCODES").__getitem__(frame.getglobal("JUMP")));
                                                            frame.getlocal(10).invoke("append", frame.getglobal("len").__call__(frame.getlocal(0)));
                                                            frame.getlocal(4).__call__(i$3);
                                                            frame.getlocal(0).__setitem__(frame.getlocal(5), frame.getglobal("len").__call__(frame.getlocal(0))._sub(frame.getlocal(5)));
                                                        }
                                                        frame.getlocal(4).__call__(i$3);
                                                        t$4$PyObject = frame.getlocal(10).__iter__();
                                                        while ((t$5$PyObject = t$4$PyObject.__iternext__()) != null) {
                                                            frame.setlocal(10, t$5$PyObject);
                                                            frame.getlocal(0).__setitem__(frame.getlocal(10), frame.getglobal("len").__call__(frame.getlocal(0))._sub(frame.getlocal(10)));
                                                        }
                                                    }
                                                    else {
                                                        if (frame.getlocal(7)._is(frame.getglobal("CATEGORY")).__nonzero__()) {
                                                            frame.getlocal(4).__call__(frame.getglobal("OPCODES").__getitem__(frame.getlocal(7)));
                                                            if (frame.getlocal(2)._and(frame.getglobal("SRE_FLAG_LOCALE")).__nonzero__()) {
                                                                frame.setlocal(3, frame.getglobal("CH_LOCALE").__getitem__(frame.getlocal(3)));
                                                            }
                                                            else {
                                                                if (frame.getlocal(2)._and(frame.getglobal("SRE_FLAG_UNICODE")).__nonzero__()) {
                                                                    frame.setlocal(3, frame.getglobal("CH_UNICODE").__getitem__(frame.getlocal(3)));
                                                                }
                                                            }
                                                            frame.getlocal(4).__call__(frame.getglobal("CHCODES").__getitem__(frame.getlocal(3)));
                                                        }
                                                        else {
                                                            if (frame.getlocal(7)._is(frame.getglobal("GROUPREF")).__nonzero__()) {
                                                                if (frame.getlocal(2)._and(frame.getglobal("SRE_FLAG_IGNORECASE")).__nonzero__()) {
                                                                    frame.getlocal(4).__call__(frame.getglobal("OPCODES").__getitem__(frame.getglobal("OP_IGNORE").__getitem__(frame.getlocal(7))));
                                                                }
                                                                else {
                                                                    frame.getlocal(4).__call__(frame.getglobal("OPCODES").__getitem__(frame.getlocal(7)));
                                                                }
                                                                frame.getlocal(4).__call__(frame.getlocal(3)._sub(i$5));
                                                            }
                                                            else {
                                                                throw Py.makeException(frame.getglobal("ValueError"), new PyTuple(new PyObject[] {s$8, frame.getlocal(7)}));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return Py.None;
        }
        
        private static PyObject lambda$4(PyFrame frame) {
            return frame.getlocal(0);
        }
        
        private static PyObject _compile_charset$5(PyFrame frame) {
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            PyObject t$0$PyObject, t$1$PyObject;
            
            // Code
            frame.setlocal(6, frame.getlocal(2).__getattr__("append"));
            if (frame.getlocal(3).__not__().__nonzero__()) {
                frame.setlocal(3, new PyFunction(frame.f_globals, new PyObject[] {}, c$3_lambda));
            }
            t$0$PyObject = frame.getglobal("_optimize_charset").__call__(frame.getlocal(0), frame.getlocal(3)).__iter__();
            while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                t$0$PyObject__ = org.python.core.Py.unpackSequence(t$1$PyObject, 2);
                frame.setlocal(4, t$0$PyObject__[0]);
                frame.setlocal(5, t$0$PyObject__[1]);
                frame.getlocal(6).__call__(frame.getglobal("OPCODES").__getitem__(frame.getlocal(4)));
                if (frame.getlocal(4)._is(frame.getglobal("NEGATE")).__nonzero__()) {
                    // pass
                }
                else {
                    if (frame.getlocal(4)._is(frame.getglobal("LITERAL")).__nonzero__()) {
                        frame.getlocal(6).__call__(frame.getlocal(3).__call__(frame.getlocal(5)));
                    }
                    else {
                        if (frame.getlocal(4)._is(frame.getglobal("RANGE")).__nonzero__()) {
                            frame.getlocal(6).__call__(frame.getlocal(3).__call__(frame.getlocal(5).__getitem__(i$3)));
                            frame.getlocal(6).__call__(frame.getlocal(3).__call__(frame.getlocal(5).__getitem__(i$5)));
                        }
                        else {
                            if (frame.getlocal(4)._is(frame.getglobal("CHARSET")).__nonzero__()) {
                                frame.getlocal(2).invoke("extend", frame.getlocal(5));
                            }
                            else {
                                if (frame.getlocal(4)._is(frame.getglobal("BIGCHARSET")).__nonzero__()) {
                                    frame.getlocal(2).invoke("extend", frame.getlocal(5));
                                }
                                else {
                                    if (frame.getlocal(4)._is(frame.getglobal("CATEGORY")).__nonzero__()) {
                                        if (frame.getlocal(1)._and(frame.getglobal("SRE_FLAG_LOCALE")).__nonzero__()) {
                                            frame.getlocal(6).__call__(frame.getglobal("CHCODES").__getitem__(frame.getglobal("CH_LOCALE").__getitem__(frame.getlocal(5))));
                                        }
                                        else {
                                            if (frame.getlocal(1)._and(frame.getglobal("SRE_FLAG_UNICODE")).__nonzero__()) {
                                                frame.getlocal(6).__call__(frame.getglobal("CHCODES").__getitem__(frame.getglobal("CH_UNICODE").__getitem__(frame.getlocal(5))));
                                            }
                                            else {
                                                frame.getlocal(6).__call__(frame.getglobal("CHCODES").__getitem__(frame.getlocal(5)));
                                            }
                                        }
                                    }
                                    else {
                                        throw Py.makeException(frame.getglobal("error"), s$9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            frame.getlocal(6).__call__(frame.getglobal("OPCODES").__getitem__(frame.getglobal("FAILURE")));
            return Py.None;
        }
        
        private static PyObject _optimize_charset$6(PyFrame frame) {
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            PyException t$0$PyException;
            PyObject t$0$PyObject, t$1$PyObject, t$2$PyObject, t$3$PyObject, t$4$PyObject, t$5$PyObject, t$6$PyObject, t$7$PyObject;
            
            // Code
            frame.setlocal(9, new PyList(new PyObject[] {}));
            frame.setlocal(4, new PyList(new PyObject[] {i$3})._mul(i$10));
            try {
                t$0$PyObject = frame.getlocal(0).__iter__();
                while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                    t$0$PyObject__ = org.python.core.Py.unpackSequence(t$1$PyObject, 2);
                    frame.setlocal(2, t$0$PyObject__[0]);
                    frame.setlocal(3, t$0$PyObject__[1]);
                    if (frame.getlocal(2)._is(frame.getglobal("NEGATE")).__nonzero__()) {
                        frame.getlocal(9).invoke("append", new PyTuple(new PyObject[] {frame.getlocal(2), frame.getlocal(3)}));
                    }
                    else {
                        if (frame.getlocal(2)._is(frame.getglobal("LITERAL")).__nonzero__()) {
                            frame.getlocal(4).__setitem__(frame.getlocal(1).__call__(frame.getlocal(3)), i$5);
                        }
                        else {
                            if (frame.getlocal(2)._is(frame.getglobal("RANGE")).__nonzero__()) {
                                t$2$PyObject = frame.getglobal("range").__call__(frame.getlocal(1).__call__(frame.getlocal(3).__getitem__(i$3)), frame.getlocal(1).__call__(frame.getlocal(3).__getitem__(i$5))._add(i$5)).__iter__();
                                while ((t$3$PyObject = t$2$PyObject.__iternext__()) != null) {
                                    frame.setlocal(8, t$3$PyObject);
                                    frame.getlocal(4).__setitem__(frame.getlocal(8), i$5);
                                }
                            }
                            else {
                                if (frame.getlocal(2)._is(frame.getglobal("CATEGORY")).__nonzero__()) {
                                    return frame.getlocal(0);
                                }
                            }
                        }
                    }
                }
            }
            catch (Throwable x$0) {
                t$0$PyException = Py.setException(x$0, frame);
                if (Py.matchException(t$0$PyException, frame.getglobal("IndexError"))) {
                    if (frame.getglobal("sys").__getattr__("maxunicode")._ne(i$2).__nonzero__()) {
                        return frame.getlocal(0);
                    }
                    return frame.getglobal("_optimize_unicode").__call__(frame.getlocal(0), frame.getlocal(1));
                }
                else throw t$0$PyException;
            }
            t$4$PyObject = i$3;
            frame.setlocal(8, t$4$PyObject);
            frame.setlocal(5, t$4$PyObject);
            frame.setlocal(6, t$4$PyObject);
            frame.setlocal(7, new PyList(new PyObject[] {}));
            t$4$PyObject = frame.getlocal(4).__iter__();
            while ((t$5$PyObject = t$4$PyObject.__iternext__()) != null) {
                frame.setlocal(10, t$5$PyObject);
                if (frame.getlocal(10).__nonzero__()) {
                    if (frame.getlocal(6)._eq(i$3).__nonzero__()) {
                        frame.setlocal(5, frame.getlocal(8));
                    }
                    frame.setlocal(6, frame.getlocal(6)._add(i$5));
                }
                else {
                    if (frame.getlocal(6).__nonzero__()) {
                        frame.getlocal(7).invoke("append", new PyTuple(new PyObject[] {frame.getlocal(5), frame.getlocal(6)}));
                        frame.setlocal(6, i$3);
                    }
                }
                frame.setlocal(8, frame.getlocal(8)._add(i$5));
            }
            if (frame.getlocal(6).__nonzero__()) {
                frame.getlocal(7).invoke("append", new PyTuple(new PyObject[] {frame.getlocal(5), frame.getlocal(6)}));
            }
            if (frame.getglobal("len").__call__(frame.getlocal(7))._le(i$6).__nonzero__()) {
                t$6$PyObject = frame.getlocal(7).__iter__();
                while ((t$7$PyObject = t$6$PyObject.__iternext__()) != null) {
                    t$0$PyObject__ = org.python.core.Py.unpackSequence(t$7$PyObject, 2);
                    frame.setlocal(5, t$0$PyObject__[0]);
                    frame.setlocal(6, t$0$PyObject__[1]);
                    if (frame.getlocal(6)._eq(i$5).__nonzero__()) {
                        frame.getlocal(9).invoke("append", new PyTuple(new PyObject[] {frame.getglobal("LITERAL"), frame.getlocal(5)}));
                    }
                    else {
                        frame.getlocal(9).invoke("append", new PyTuple(new PyObject[] {frame.getglobal("RANGE"), new PyTuple(new PyObject[] {frame.getlocal(5), frame.getlocal(5)._add(frame.getlocal(6))._sub(i$5)})}));
                    }
                }
                if (frame.getglobal("len").__call__(frame.getlocal(9))._lt(frame.getglobal("len").__call__(frame.getlocal(0))).__nonzero__()) {
                    return frame.getlocal(9);
                }
            }
            else {
                frame.setlocal(11, frame.getglobal("_mk_bitmap").__call__(frame.getlocal(4)));
                frame.getlocal(9).invoke("append", new PyTuple(new PyObject[] {frame.getglobal("CHARSET"), frame.getlocal(11)}));
                return frame.getlocal(9);
            }
            return frame.getlocal(0);
        }
        
        private static PyObject _mk_bitmap$7(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject, t$1$PyObject;
            
            // Code
            frame.setlocal(3, new PyList(new PyObject[] {}));
            frame.setlocal(1, i$5);
            frame.setlocal(2, i$3);
            t$0$PyObject = frame.getlocal(0).__iter__();
            while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                frame.setlocal(4, t$1$PyObject);
                if (frame.getlocal(4).__nonzero__()) {
                    frame.setlocal(2, frame.getlocal(2)._add(frame.getlocal(1)));
                }
                frame.setlocal(1, frame.getlocal(1)._lshift(i$5));
                if (frame.getlocal(1)._gt(frame.getglobal("MAXCODE")).__nonzero__()) {
                    frame.getlocal(3).invoke("append", frame.getlocal(2));
                    frame.setlocal(1, i$5);
                    frame.setlocal(2, i$3);
                }
            }
            return frame.getlocal(3);
        }
        
        private static PyObject _optimize_unicode$8(PyFrame frame) {
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            PyObject t$0$PyObject, t$1$PyObject, t$2$PyObject, t$3$PyObject, t$4$PyObject, t$5$PyObject, t$6$PyObject, t$7$PyObject, t$8$PyObject, t$9$PyObject;
            
            // Code
            frame.setlocal(8, new PyList(new PyObject[] {i$3})._mul(i$11));
            frame.setlocal(2, i$3);
            t$0$PyObject = frame.getlocal(0).__iter__();
            while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                t$0$PyObject__ = org.python.core.Py.unpackSequence(t$1$PyObject, 2);
                frame.setlocal(4, t$0$PyObject__[0]);
                frame.setlocal(7, t$0$PyObject__[1]);
                if (frame.getlocal(4)._is(frame.getglobal("NEGATE")).__nonzero__()) {
                    frame.setlocal(2, i$5);
                }
                else {
                    if (frame.getlocal(4)._is(frame.getglobal("LITERAL")).__nonzero__()) {
                        frame.getlocal(8).__setitem__(frame.getlocal(1).__call__(frame.getlocal(7)), i$5);
                    }
                    else {
                        if (frame.getlocal(4)._is(frame.getglobal("RANGE")).__nonzero__()) {
                            t$2$PyObject = frame.getglobal("range").__call__(frame.getlocal(1).__call__(frame.getlocal(7).__getitem__(i$3)), frame.getlocal(1).__call__(frame.getlocal(7).__getitem__(i$5))._add(i$5)).__iter__();
                            while ((t$3$PyObject = t$2$PyObject.__iternext__()) != null) {
                                frame.setlocal(12, t$3$PyObject);
                                frame.getlocal(8).__setitem__(frame.getlocal(12), i$5);
                            }
                        }
                        else {
                            if (frame.getlocal(4)._is(frame.getglobal("CATEGORY")).__nonzero__()) {
                                return frame.getlocal(0);
                            }
                        }
                    }
                }
            }
            if (frame.getlocal(2).__nonzero__()) {
                t$4$PyObject = frame.getglobal("range").__call__(i$11).__iter__();
                while ((t$5$PyObject = t$4$PyObject.__iternext__()) != null) {
                    frame.setlocal(12, t$5$PyObject);
                    frame.getlocal(8).__setitem__(frame.getlocal(12), frame.getlocal(8).__getitem__(frame.getlocal(12)).__not__());
                }
            }
            frame.setlocal(9, new PyDictionary(new PyObject[] {}));
            frame.setlocal(5, new PyList(new PyObject[] {i$3})._mul(i$10));
            frame.setlocal(3, i$3);
            frame.setlocal(13, new PyList(new PyObject[] {}));
            t$6$PyObject = frame.getglobal("range").__call__(i$10).__iter__();
            while ((t$7$PyObject = t$6$PyObject.__iternext__()) != null) {
                frame.setlocal(12, t$7$PyObject);
                frame.setlocal(6, frame.getglobal("tuple").__call__(frame.getlocal(8).__getslice__(frame.getlocal(12)._mul(i$10), frame.getlocal(12)._add(i$5)._mul(i$10), null)));
                frame.setlocal(10, frame.getlocal(9).invoke("setdefault", frame.getlocal(6), frame.getlocal(3)));
                frame.getlocal(5).__setitem__(frame.getlocal(12), frame.getlocal(10));
                if (frame.getlocal(10)._eq(frame.getlocal(3)).__nonzero__()) {
                    frame.setlocal(3, frame.getlocal(3)._add(i$5));
                    frame.setlocal(13, frame.getlocal(13)._add(frame.getglobal("_mk_bitmap").__call__(frame.getlocal(6))));
                }
            }
            frame.setlocal(11, new PyList(new PyObject[] {frame.getlocal(3)}));
            if (frame.getglobal("__debug__").__nonzero__()) Py.assert_(frame.getglobal("MAXCODE")._eq(i$2));
            t$8$PyObject = frame.getglobal("range").__call__(i$12).__iter__();
            while ((t$9$PyObject = t$8$PyObject.__iternext__()) != null) {
                frame.setlocal(12, t$9$PyObject);
                if (frame.getglobal("sys").__getattr__("byteorder")._eq(s$13).__nonzero__()) {
                    frame.getlocal(11).invoke("append", i$10._mul(frame.getlocal(5).__getitem__(i$6._mul(frame.getlocal(12))))._add(frame.getlocal(5).__getitem__(i$6._mul(frame.getlocal(12))._add(i$5))));
                }
                else {
                    frame.getlocal(11).invoke("append", frame.getlocal(5).__getitem__(i$6._mul(frame.getlocal(12)))._add(i$10._mul(frame.getlocal(5).__getitem__(i$6._mul(frame.getlocal(12))._add(i$5)))));
                }
            }
            frame.getlocal(13).__setslice__(i$3, i$3, null, frame.getlocal(11));
            return new PyList(new PyObject[] {new PyTuple(new PyObject[] {frame.getglobal("BIGCHARSET"), frame.getlocal(13)})});
        }
        
        private static PyObject _simple$9(PyFrame frame) {
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            PyObject t$0$PyObject;
            
            // Code
            t$0$PyObject__ = org.python.core.Py.unpackSequence(frame.getlocal(0).__getitem__(i$6).invoke("getwidth"), 2);
            frame.setlocal(2, t$0$PyObject__[0]);
            frame.setlocal(1, t$0$PyObject__[1]);
            if (((t$0$PyObject = frame.getlocal(2)._eq(i$3)).__nonzero__() ? frame.getlocal(1)._eq(frame.getglobal("MAXREPEAT")) : t$0$PyObject).__nonzero__()) {
                throw Py.makeException(frame.getglobal("error"), s$14);
            }
            return (t$0$PyObject = (frame.getlocal(2)._eq(t$0$PyObject = frame.getlocal(1)).__nonzero__() ? t$0$PyObject._eq(i$5) : Py.Zero)).__nonzero__() ? frame.getlocal(0).__getitem__(i$6).__getitem__(i$3).__getitem__(i$3)._ne(frame.getglobal("SUBPATTERN")) : t$0$PyObject;
        }
        
        private static PyObject _compile_info$10(PyFrame frame) {
            // Temporary Variables
            boolean t$0$boolean;
            PyObject[] t$0$PyObject__;
            PyObject t$0$PyObject, t$1$PyObject, t$2$PyObject, t$3$PyObject, t$4$PyObject, t$5$PyObject, t$6$PyObject, t$7$PyObject, t$8$PyObject;
            
            // Code
            t$0$PyObject__ = org.python.core.Py.unpackSequence(frame.getlocal(1).invoke("getwidth"), 2);
            frame.setlocal(5, t$0$PyObject__[0]);
            frame.setlocal(3, t$0$PyObject__[1]);
            if (frame.getlocal(5)._eq(i$3).__nonzero__()) {
                return Py.None;
            }
            frame.setlocal(11, new PyList(new PyObject[] {}));
            frame.setlocal(16, i$3);
            frame.setlocal(4, new PyList(new PyObject[] {}));
            if (frame.getlocal(2)._and(frame.getglobal("SRE_FLAG_IGNORECASE")).__not__().__nonzero__()) {
                t$0$PyObject = frame.getlocal(1).__getattr__("data").__iter__();
                while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                    t$0$PyObject__ = org.python.core.Py.unpackSequence(t$1$PyObject, 2);
                    frame.setlocal(6, t$0$PyObject__[0]);
                    frame.setlocal(7, t$0$PyObject__[1]);
                    if (frame.getlocal(6)._is(frame.getglobal("LITERAL")).__nonzero__()) {
                        if (frame.getglobal("len").__call__(frame.getlocal(11))._eq(frame.getlocal(16)).__nonzero__()) {
                            frame.setlocal(16, frame.getlocal(16)._add(i$5));
                        }
                        frame.getlocal(11).invoke("append", frame.getlocal(7));
                    }
                    else {
                        if (((t$2$PyObject = frame.getlocal(6)._is(frame.getglobal("SUBPATTERN"))).__nonzero__() ? frame.getglobal("len").__call__(frame.getlocal(7).__getitem__(i$5))._eq(i$5) : t$2$PyObject).__nonzero__()) {
                            t$0$PyObject__ = org.python.core.Py.unpackSequence(frame.getlocal(7).__getitem__(i$5).__getitem__(i$3), 2);
                            frame.setlocal(6, t$0$PyObject__[0]);
                            frame.setlocal(7, t$0$PyObject__[1]);
                            if (frame.getlocal(6)._is(frame.getglobal("LITERAL")).__nonzero__()) {
                                frame.getlocal(11).invoke("append", frame.getlocal(7));
                            }
                            else {
                                break;
                            }
                        }
                        else {
                            break;
                        }
                    }
                }
                if (((t$2$PyObject = frame.getlocal(11).__not__()).__nonzero__() ? frame.getlocal(1).__getattr__("data") : t$2$PyObject).__nonzero__()) {
                    t$0$PyObject__ = org.python.core.Py.unpackSequence(frame.getlocal(1).__getattr__("data").__getitem__(i$3), 2);
                    frame.setlocal(6, t$0$PyObject__[0]);
                    frame.setlocal(7, t$0$PyObject__[1]);
                    if (((t$2$PyObject = frame.getlocal(6)._is(frame.getglobal("SUBPATTERN"))).__nonzero__() ? frame.getlocal(7).__getitem__(i$5) : t$2$PyObject).__nonzero__()) {
                        t$0$PyObject__ = org.python.core.Py.unpackSequence(frame.getlocal(7).__getitem__(i$5).__getitem__(i$3), 2);
                        frame.setlocal(6, t$0$PyObject__[0]);
                        frame.setlocal(7, t$0$PyObject__[1]);
                        if (frame.getlocal(6)._is(frame.getglobal("LITERAL")).__nonzero__()) {
                            frame.getlocal(4).invoke("append", new PyTuple(new PyObject[] {frame.getlocal(6), frame.getlocal(7)}));
                        }
                        else {
                            if (frame.getlocal(6)._is(frame.getglobal("BRANCH")).__nonzero__()) {
                                frame.setlocal(15, new PyList(new PyObject[] {}));
                                t$2$PyObject = frame.getlocal(7).__getitem__(i$5).__iter__();
                                while (t$0$boolean=(t$3$PyObject = t$2$PyObject.__iternext__()) != null) {
                                    frame.setlocal(9, t$3$PyObject);
                                    if (frame.getlocal(9).__not__().__nonzero__()) {
                                        break;
                                    }
                                    t$0$PyObject__ = org.python.core.Py.unpackSequence(frame.getlocal(9).__getitem__(i$3), 2);
                                    frame.setlocal(6, t$0$PyObject__[0]);
                                    frame.setlocal(7, t$0$PyObject__[1]);
                                    if (frame.getlocal(6)._is(frame.getglobal("LITERAL")).__nonzero__()) {
                                        frame.getlocal(15).invoke("append", new PyTuple(new PyObject[] {frame.getlocal(6), frame.getlocal(7)}));
                                    }
                                    else {
                                        break;
                                    }
                                }
                                if (!t$0$boolean) {
                                    frame.setlocal(4, frame.getlocal(15));
                                }
                            }
                        }
                    }
                    else {
                        if (frame.getlocal(6)._is(frame.getglobal("BRANCH")).__nonzero__()) {
                            frame.setlocal(15, new PyList(new PyObject[] {}));
                            t$4$PyObject = frame.getlocal(7).__getitem__(i$5).__iter__();
                            while (t$0$boolean=(t$5$PyObject = t$4$PyObject.__iternext__()) != null) {
                                frame.setlocal(9, t$5$PyObject);
                                if (frame.getlocal(9).__not__().__nonzero__()) {
                                    break;
                                }
                                t$0$PyObject__ = org.python.core.Py.unpackSequence(frame.getlocal(9).__getitem__(i$3), 2);
                                frame.setlocal(6, t$0$PyObject__[0]);
                                frame.setlocal(7, t$0$PyObject__[1]);
                                if (frame.getlocal(6)._is(frame.getglobal("LITERAL")).__nonzero__()) {
                                    frame.getlocal(15).invoke("append", new PyTuple(new PyObject[] {frame.getlocal(6), frame.getlocal(7)}));
                                }
                                else {
                                    break;
                                }
                            }
                            if (!t$0$boolean) {
                                frame.setlocal(4, frame.getlocal(15));
                            }
                        }
                        else {
                            if (frame.getlocal(6)._is(frame.getglobal("IN")).__nonzero__()) {
                                frame.setlocal(4, frame.getlocal(7));
                            }
                        }
                    }
                }
            }
            frame.setlocal(8, frame.getlocal(0).__getattr__("append"));
            frame.getlocal(8).__call__(frame.getglobal("OPCODES").__getitem__(frame.getglobal("INFO")));
            frame.setlocal(10, frame.getglobal("len").__call__(frame.getlocal(0)));
            frame.getlocal(8).__call__(i$3);
            frame.setlocal(13, i$3);
            if (frame.getlocal(11).__nonzero__()) {
                frame.setlocal(13, frame.getglobal("SRE_INFO_PREFIX"));
                if ((frame.getglobal("len").__call__(frame.getlocal(11))._eq(t$6$PyObject = frame.getlocal(16)).__nonzero__() ? t$6$PyObject._eq(frame.getglobal("len").__call__(frame.getlocal(1).__getattr__("data"))) : Py.Zero).__nonzero__()) {
                    frame.setlocal(13, frame.getlocal(13)._add(frame.getglobal("SRE_INFO_LITERAL")));
                }
            }
            else {
                if (frame.getlocal(4).__nonzero__()) {
                    frame.setlocal(13, frame.getlocal(13)._add(frame.getglobal("SRE_INFO_CHARSET")));
                }
            }
            frame.getlocal(8).__call__(frame.getlocal(13));
            if (frame.getlocal(5)._lt(frame.getglobal("MAXCODE")).__nonzero__()) {
                frame.getlocal(8).__call__(frame.getlocal(5));
            }
            else {
                frame.getlocal(8).__call__(frame.getglobal("MAXCODE"));
                frame.setlocal(11, frame.getlocal(11).__getslice__(null, frame.getglobal("MAXCODE"), null));
            }
            if (frame.getlocal(3)._lt(frame.getglobal("MAXCODE")).__nonzero__()) {
                frame.getlocal(8).__call__(frame.getlocal(3));
            }
            else {
                frame.getlocal(8).__call__(i$3);
            }
            if (frame.getlocal(11).__nonzero__()) {
                frame.getlocal(8).__call__(frame.getglobal("len").__call__(frame.getlocal(11)));
                frame.getlocal(8).__call__(frame.getlocal(16));
                frame.getlocal(0).invoke("extend", frame.getlocal(11));
                frame.setlocal(14, new PyList(new PyObject[] {i$5.__neg__()})._add(new PyList(new PyObject[] {i$3})._mul(frame.getglobal("len").__call__(frame.getlocal(11)))));
                t$6$PyObject = frame.getglobal("range").__call__(frame.getglobal("len").__call__(frame.getlocal(11))).__iter__();
                while ((t$7$PyObject = t$6$PyObject.__iternext__()) != null) {
                    frame.setlocal(12, t$7$PyObject);
                    frame.getlocal(14).__setitem__(frame.getlocal(12)._add(i$5), frame.getlocal(14).__getitem__(frame.getlocal(12))._add(i$5));
                    while (((t$8$PyObject = frame.getlocal(14).__getitem__(frame.getlocal(12)._add(i$5))._gt(i$3)).__nonzero__() ? frame.getlocal(11).__getitem__(frame.getlocal(12))._ne(frame.getlocal(11).__getitem__(frame.getlocal(14).__getitem__(frame.getlocal(12)._add(i$5))._sub(i$5))) : t$8$PyObject).__nonzero__()) {
                        frame.getlocal(14).__setitem__(frame.getlocal(12)._add(i$5), frame.getlocal(14).__getitem__(frame.getlocal(14).__getitem__(frame.getlocal(12)._add(i$5))._sub(i$5))._add(i$5));
                    }
                }
                frame.getlocal(0).invoke("extend", frame.getlocal(14).__getslice__(i$5, null, null));
            }
            else {
                if (frame.getlocal(4).__nonzero__()) {
                    frame.getglobal("_compile_charset").__call__(frame.getlocal(4), frame.getlocal(2), frame.getlocal(0));
                }
            }
            frame.getlocal(0).__setitem__(frame.getlocal(10), frame.getglobal("len").__call__(frame.getlocal(0))._sub(frame.getlocal(10)));
            return Py.None;
        }
        
        private static PyObject _code$11(PyFrame frame) {
            frame.setlocal(1, frame.getlocal(0).__getattr__("pattern").__getattr__("flags")._or(frame.getlocal(1)));
            frame.setlocal(2, new PyList(new PyObject[] {}));
            frame.getglobal("_compile_info").__call__(frame.getlocal(2), frame.getlocal(0), frame.getlocal(1));
            frame.getglobal("_compile").__call__(frame.getlocal(2), frame.getlocal(0).__getattr__("data"), frame.getlocal(1));
            frame.getlocal(2).invoke("append", frame.getglobal("OPCODES").__getitem__(frame.getglobal("SUCCESS")));
            return frame.getlocal(2);
        }
        
        private static PyObject compile$12(PyFrame frame) {
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            PyObject t$0$PyObject, t$1$PyObject;
            
            // Code
            if (frame.getglobal("type").__call__(frame.getlocal(0))._in(frame.getglobal("STRING_TYPES")).__nonzero__()) {
                frame.setlocal(7, org.python.core.imp.importOne("sre_parse", frame));
                frame.setlocal(8, frame.getlocal(0));
                frame.setlocal(0, frame.getlocal(7).__getattr__("parse").__call__(frame.getlocal(0), frame.getlocal(1)));
            }
            else {
                frame.setlocal(8, frame.getglobal("None"));
            }
            frame.setlocal(3, frame.getglobal("_code").__call__(frame.getlocal(0), frame.getlocal(1)));
            if (frame.getglobal("__debug__").__nonzero__()) Py.assert_(frame.getlocal(0).__getattr__("pattern").__getattr__("groups")._le(i$16), s$17);
            frame.setlocal(2, frame.getlocal(0).__getattr__("pattern").__getattr__("groupdict"));
            frame.setlocal(4, new PyList(new PyObject[] {frame.getglobal("None")})._mul(frame.getlocal(0).__getattr__("pattern").__getattr__("groups")));
            t$0$PyObject = frame.getlocal(2).invoke("items").__iter__();
            while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                t$0$PyObject__ = org.python.core.Py.unpackSequence(t$1$PyObject, 2);
                frame.setlocal(5, t$0$PyObject__[0]);
                frame.setlocal(6, t$0$PyObject__[1]);
                frame.getlocal(4).__setitem__(frame.getlocal(6), frame.getlocal(5));
            }
            return frame.getglobal("_sre").__getattr__("compile").__call__(new PyObject[] {frame.getlocal(8), frame.getlocal(1), frame.getlocal(3), frame.getlocal(0).__getattr__("pattern").__getattr__("groups")._sub(i$5), frame.getlocal(2), frame.getlocal(4)});
        }
        
        private static PyObject main$13(PyFrame frame) {
            frame.setglobal("__file__", s$18);
            
            // Temporary Variables
            PyException t$0$PyException;
            
            // Code
            /* Internal support module for sre */
            frame.setlocal("_sre", org.python.core.imp.importOne("_sre", frame));
            frame.setlocal("sys", org.python.core.imp.importOne("sys", frame));
            org.python.core.imp.importAll("sre_constants", frame);
            if (frame.getglobal("__debug__").__nonzero__()) Py.assert_(frame.getname("_sre").__getattr__("MAGIC")._eq(frame.getname("MAGIC")), s$1);
            frame.setlocal("MAXCODE", i$2);
            frame.setlocal("_compile", new PyFunction(frame.f_globals, new PyObject[] {}, c$2__compile));
            frame.setlocal("_compile_charset", new PyFunction(frame.f_globals, new PyObject[] {frame.getname("None")}, c$4__compile_charset));
            frame.setlocal("_optimize_charset", new PyFunction(frame.f_globals, new PyObject[] {}, c$5__optimize_charset));
            frame.setlocal("_mk_bitmap", new PyFunction(frame.f_globals, new PyObject[] {}, c$6__mk_bitmap));
            frame.setlocal("_optimize_unicode", new PyFunction(frame.f_globals, new PyObject[] {}, c$7__optimize_unicode));
            frame.setlocal("_simple", new PyFunction(frame.f_globals, new PyObject[] {}, c$8__simple));
            frame.setlocal("_compile_info", new PyFunction(frame.f_globals, new PyObject[] {}, c$9__compile_info));
            frame.setlocal("STRING_TYPES", new PyList(new PyObject[] {frame.getname("type").__call__(s$15)}));
            try {
                frame.getname("STRING_TYPES").invoke("append", frame.getname("type").__call__(frame.getname("unicode").__call__(s$15)));
            }
            catch (Throwable x$0) {
                t$0$PyException = Py.setException(x$0, frame);
                if (Py.matchException(t$0$PyException, frame.getname("NameError"))) {
                    // pass
                }
                else throw t$0$PyException;
            }
            frame.setlocal("_code", new PyFunction(frame.f_globals, new PyObject[] {}, c$10__code));
            frame.setlocal("compile", new PyFunction(frame.f_globals, new PyObject[] {i$3}, c$11_compile));
            return Py.None;
        }
        
    }
    public static void moduleDictInit(PyObject dict) {
        dict.__setitem__("__name__", new PyString("sre_compile"));
        Py.runCode(new _PyInner().getMain(), dict, dict);
    }
    
    public static void main(String[] args) throws java.lang.Exception {
        String[] newargs = new String[args.length+1];
        newargs[0] = "sre_compile";
        java.lang.System.arraycopy(args, 0, newargs, 1, args.length);
        Py.runMain(sre_compile._PyInner.class, newargs, sre_compile.jpy$packages, sre_compile.jpy$mainProperties, "", new String[] {"string", "random", "traceback", "sre_compile", "atexit", "warnings", "popen2", "getopt", "sre", "sre_constants", "StringIO", "QAsystem", "javaos", "repr", "copy_reg", "re", "linecache", "javapath", "UserDict", "copy", "threading", "stat", "sre_parse", "javashell"});
    }
    
}

import org.python.core.*;

public class warnings extends java.lang.Object {
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
        private static PyObject i$8;
        private static PyObject s$9;
        private static PyObject s$10;
        private static PyObject s$11;
        private static PyObject s$12;
        private static PyObject s$13;
        private static PyObject s$14;
        private static PyObject i$15;
        private static PyObject s$16;
        private static PyObject i$17;
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
        private static PyObject i$42;
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
        private static PyFunctionTable funcTable;
        private static PyCode c$0_warn;
        private static PyCode c$1_warn_explicit;
        private static PyCode c$2_showwarning;
        private static PyCode c$3_formatwarning;
        private static PyCode c$4_filterwarnings;
        private static PyCode c$5_resetwarnings;
        private static PyCode c$6__OptionError;
        private static PyCode c$7__processoptions;
        private static PyCode c$8__setoption;
        private static PyCode c$9__getaction;
        private static PyCode c$10__getcategory;
        private static PyCode c$11__test;
        private static PyCode c$12_main;
        private static void initConstants() {
            s$0 = Py.newString("Python part of the warnings subsystem.");
            s$1 = Py.newString("warn");
            s$2 = Py.newString("showwarning");
            s$3 = Py.newString("formatwarning");
            s$4 = Py.newString("filterwarnings");
            s$5 = Py.newString("resetwarnings");
            s$6 = Py.newString("default");
            s$7 = Py.newString("Issue a warning, or maybe ignore it or raise an exception.");
            i$8 = Py.newInteger(1);
            s$9 = Py.newString("__name__");
            s$10 = Py.newString("<string>");
            s$11 = Py.newString("__file__");
            s$12 = Py.newString(".pyc");
            s$13 = Py.newString(".pyo");
            s$14 = Py.newString("__main__");
            i$15 = Py.newInteger(0);
            s$16 = Py.newString("__warningregistry__");
            i$17 = Py.newInteger(3);
            s$18 = Py.newString(".py");
            s$19 = Py.newString("ignore");
            s$20 = Py.newString("error");
            s$21 = Py.newString("once");
            s$22 = Py.newString("always");
            s$23 = Py.newString("module");
            s$24 = Py.newString("Unrecognized action (%s) in warnings.filters:\012 %s");
            s$25 = Py.newString("Hook to write a warning to a file; replace if you like.");
            s$26 = Py.newString("Function to format a warning the standard way.");
            s$27 = Py.newString("%s:%s: %s: %s\012");
            s$28 = Py.newString("  ");
            s$29 = Py.newString("\012");
            s$30 = Py.newString("Insert an entry into the list of warnings filters (at the front).\012\012    Use assertions to check that all arguments have the right type.");
            s$31 = Py.newString("invalid action: %s");
            s$32 = Py.newString("message must be a string");
            s$33 = Py.newString("category must be a class");
            s$34 = Py.newString("category must be a Warning subclass");
            s$35 = Py.newString("module must be a string");
            s$36 = Py.newString("lineno must be an int >= 0");
            s$37 = Py.newString("");
            s$38 = Py.newString("Clear the list of warning filters, so that no filters are active.");
            s$39 = Py.newString("Exception used by option processing helpers.");
            s$40 = Py.newString("Invalid -W option ignored:");
            s$41 = Py.newString(":");
            i$42 = Py.newInteger(5);
            s$43 = Py.newString("too many fields (max 5): %s");
            s$44 = Py.newString("$");
            s$45 = Py.newString("invalid lineno %s");
            s$46 = Py.newString("all");
            s$47 = Py.newString("^[a-zA-Z0-9_]+$");
            s$48 = Py.newString("unknown warning category: %s");
            s$49 = Py.newString(".");
            s$50 = Py.newString("invalid module name: %s");
            s$51 = Py.newString("invalid warning category: %s");
            s$52 = Py.newString("W:");
            s$53 = Py.newString("hello world");
            s$54 = Py.newString("Caught");
            s$55 = Py.newString("No exception");
            s$56 = Py.newString("booh");
            s$57 = Py.newString("warnings");
            s$58 = Py.newString("F:\\Java\\Jython\\jython2.2.1\\Lib\\warnings.py");
            funcTable = new _PyInner();
            c$0_warn = Py.newCode(3, new String[] {"message", "category", "stacklevel", "registry", "filename", "module", "lineno", "caller", "fnl", "globals"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\warnings.py", "warn", false, false, funcTable, 1, null, null, 0, 17);
            c$1_warn_explicit = Py.newCode(6, new String[] {"message", "category", "filename", "lineno", "module", "registry", "msg", "cat", "ln", "oncekey", "action", "altkey", "item", "mod", "key"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\warnings.py", "warn_explicit", false, false, funcTable, 2, null, null, 0, 17);
            c$2_showwarning = Py.newCode(5, new String[] {"message", "category", "filename", "lineno", "file"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\warnings.py", "showwarning", false, false, funcTable, 3, null, null, 0, 17);
            c$3_formatwarning = Py.newCode(4, new String[] {"message", "category", "filename", "lineno", "line", "linecache", "s"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\warnings.py", "formatwarning", false, false, funcTable, 4, null, null, 0, 17);
            c$4_filterwarnings = Py.newCode(6, new String[] {"action", "message", "category", "module", "lineno", "append", "item"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\warnings.py", "filterwarnings", false, false, funcTable, 5, null, null, 0, 17);
            c$5_resetwarnings = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\warnings.py", "resetwarnings", false, false, funcTable, 6, null, null, 0, 17);
            c$6__OptionError = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\warnings.py", "_OptionError", false, false, funcTable, 7, null, null, 0, 16);
            c$7__processoptions = Py.newCode(1, new String[] {"args", "arg", "msg"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\warnings.py", "_processoptions", false, false, funcTable, 8, null, null, 0, 17);
            c$8__setoption = Py.newCode(1, new String[] {"arg", "module", "_[1]", "lineno", "message", "s", "parts", "category", "action"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\warnings.py", "_setoption", false, false, funcTable, 9, null, null, 0, 17);
            c$9__getaction = Py.newCode(1, new String[] {"action", "a"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\warnings.py", "_getaction", false, false, funcTable, 10, null, null, 0, 17);
            c$10__getcategory = Py.newCode(1, new String[] {"category", "module", "cat", "klass", "m", "i"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\warnings.py", "_getcategory", false, false, funcTable, 11, null, null, 0, 17);
            c$11__test = Py.newCode(0, new String[] {"args", "getopt", "msg", "hello", "opts", "o", "i", "item", "a", "testoptions"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\warnings.py", "_test", false, false, funcTable, 12, null, null, 0, 17);
            c$12_main = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\warnings.py", "main", false, false, funcTable, 13, null, null, 0, 16);
        }
        
        
        public PyCode getMain() {
            if (c$12_main == null) _PyInner.initConstants();
            return c$12_main;
        }
        
        public PyObject call_function(int index, PyFrame frame) {
            switch (index){
                case 0:
                return _PyInner.__listcomprehension$1(frame);
                case 1:
                return _PyInner.warn$2(frame);
                case 2:
                return _PyInner.warn_explicit$3(frame);
                case 3:
                return _PyInner.showwarning$4(frame);
                case 4:
                return _PyInner.formatwarning$5(frame);
                case 5:
                return _PyInner.filterwarnings$6(frame);
                case 6:
                return _PyInner.resetwarnings$7(frame);
                case 7:
                return _PyInner._OptionError$8(frame);
                case 8:
                return _PyInner._processoptions$9(frame);
                case 9:
                return _PyInner._setoption$10(frame);
                case 10:
                return _PyInner._getaction$11(frame);
                case 11:
                return _PyInner._getcategory$12(frame);
                case 12:
                return _PyInner._test$13(frame);
                case 13:
                return _PyInner.main$14(frame);
                default:
                return null;
            }
        }
        
        private static PyObject __listcomprehension$1(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject, t$1$PyObject, t$2$PyObject, t$3$PyObject;
            
            t$0$PyObject = new PyList(new PyObject[] {});
            frame.setlocal(2, t$0$PyObject.__getattr__("append"));
            t$2$PyObject = frame.getlocal(6).__iter__();
            while ((t$3$PyObject = t$2$PyObject.__iternext__()) != null) {
                frame.setlocal(5, t$3$PyObject);
                frame.getlocal(2).__call__(frame.getlocal(5).invoke("strip"));
            }
            return t$0$PyObject;
        }
        
        private static PyObject warn$2(PyFrame frame) {
            // Temporary Variables
            boolean t$0$boolean;
            PyObject t$0$PyObject;
            PyException t$0$PyException;
            
            // Code
            /* Issue a warning, or maybe ignore it or raise an exception. */
            if (frame.getlocal(1)._is(frame.getglobal("None")).__nonzero__()) {
                frame.setlocal(1, frame.getglobal("UserWarning"));
            }
            if (frame.getglobal("__debug__").__nonzero__()) Py.assert_(frame.getglobal("issubclass").__call__(frame.getlocal(1), frame.getglobal("Warning")));
            t$0$boolean = true;
            try {
                frame.setlocal(7, frame.getglobal("sys").__getattr__("_getframe").__call__(frame.getlocal(2)));
            }
            catch (Throwable x$0) {
                t$0$boolean = false;
                t$0$PyException = Py.setException(x$0, frame);
                if (Py.matchException(t$0$PyException, frame.getglobal("ValueError"))) {
                    frame.setlocal(9, frame.getglobal("sys").__getattr__("__dict__"));
                    frame.setlocal(6, i$8);
                }
                else throw t$0$PyException;
            }
            if (t$0$boolean) {
                frame.setlocal(9, frame.getlocal(7).__getattr__("f_globals"));
                frame.setlocal(6, frame.getlocal(7).__getattr__("f_lineno"));
            }
            if (frame.getlocal(9).invoke("has_key", s$9).__nonzero__()) {
                frame.setlocal(5, frame.getlocal(9).__getitem__(s$9));
            }
            else {
                frame.setlocal(5, s$10);
            }
            frame.setlocal(4, frame.getlocal(9).invoke("get", s$11));
            if (frame.getlocal(4).__nonzero__()) {
                frame.setlocal(8, frame.getlocal(4).invoke("lower"));
                if (((t$0$PyObject = frame.getlocal(8).invoke("endswith", s$12)).__nonzero__() ? t$0$PyObject : frame.getlocal(8).invoke("endswith", s$13)).__nonzero__()) {
                    frame.setlocal(4, frame.getlocal(4).__getslice__(null, i$8.__neg__(), null));
                }
            }
            else {
                if (frame.getlocal(5)._eq(s$14).__nonzero__()) {
                    frame.setlocal(4, frame.getglobal("sys").__getattr__("argv").__getitem__(i$15));
                }
                if (frame.getlocal(4).__not__().__nonzero__()) {
                    frame.setlocal(4, frame.getlocal(5));
                }
            }
            frame.setlocal(3, frame.getlocal(9).invoke("setdefault", s$16, new PyDictionary(new PyObject[] {})));
            frame.getglobal("warn_explicit").__call__(new PyObject[] {frame.getlocal(0), frame.getlocal(1), frame.getlocal(4), frame.getlocal(6), frame.getlocal(5), frame.getlocal(3)});
            return Py.None;
        }
        
        private static PyObject warn_explicit$3(PyFrame frame) {
            // Temporary Variables
            boolean t$0$boolean;
            PyObject[] t$0$PyObject__;
            PyObject t$0$PyObject, t$1$PyObject, t$2$PyObject;
            
            // Code
            if (frame.getlocal(4)._is(frame.getglobal("None")).__nonzero__()) {
                frame.setlocal(4, frame.getlocal(2));
                if (frame.getlocal(4).__getslice__(i$17.__neg__(), null, null).invoke("lower")._eq(s$18).__nonzero__()) {
                    frame.setlocal(4, frame.getlocal(4).__getslice__(null, i$17.__neg__(), null));
                }
            }
            if (frame.getlocal(5)._is(frame.getglobal("None")).__nonzero__()) {
                frame.setlocal(5, new PyDictionary(new PyObject[] {}));
            }
            frame.setlocal(14, new PyTuple(new PyObject[] {frame.getlocal(0), frame.getlocal(1), frame.getlocal(3)}));
            if (frame.getlocal(5).invoke("get", frame.getlocal(14)).__nonzero__()) {
                return Py.None;
            }
            t$0$PyObject = frame.getglobal("filters").__iter__();
            while (t$0$boolean=(t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                frame.setlocal(12, t$1$PyObject);
                t$0$PyObject__ = org.python.core.Py.unpackSequence(frame.getlocal(12), 5);
                frame.setlocal(10, t$0$PyObject__[0]);
                frame.setlocal(6, t$0$PyObject__[1]);
                frame.setlocal(7, t$0$PyObject__[2]);
                frame.setlocal(13, t$0$PyObject__[3]);
                frame.setlocal(8, t$0$PyObject__[4]);
                if (((t$2$PyObject = ((t$2$PyObject = ((t$2$PyObject = frame.getlocal(6).invoke("match", frame.getlocal(0))).__nonzero__() ? frame.getglobal("issubclass").__call__(frame.getlocal(1), frame.getlocal(7)) : t$2$PyObject)).__nonzero__() ? frame.getlocal(13).invoke("match", frame.getlocal(4)) : t$2$PyObject)).__nonzero__() ? ((t$2$PyObject = frame.getlocal(8)._eq(i$15)).__nonzero__() ? t$2$PyObject : frame.getlocal(3)._eq(frame.getlocal(8))) : t$2$PyObject).__nonzero__()) {
                    break;
                }
            }
            if (!t$0$boolean) {
                frame.setlocal(10, frame.getglobal("defaultaction"));
            }
            if (frame.getlocal(10)._eq(s$19).__nonzero__()) {
                frame.getlocal(5).__setitem__(frame.getlocal(14), i$8);
                return Py.None;
            }
            if (frame.getlocal(10)._eq(s$20).__nonzero__()) {
                throw Py.makeException(frame.getlocal(1).__call__(frame.getlocal(0)));
            }
            if (frame.getlocal(10)._eq(s$21).__nonzero__()) {
                frame.getlocal(5).__setitem__(frame.getlocal(14), i$8);
                frame.setlocal(9, new PyTuple(new PyObject[] {frame.getlocal(0), frame.getlocal(1)}));
                if (frame.getglobal("onceregistry").invoke("get", frame.getlocal(9)).__nonzero__()) {
                    return Py.None;
                }
                frame.getglobal("onceregistry").__setitem__(frame.getlocal(9), i$8);
            }
            else {
                if (frame.getlocal(10)._eq(s$22).__nonzero__()) {
                    // pass
                }
                else {
                    if (frame.getlocal(10)._eq(s$23).__nonzero__()) {
                        frame.getlocal(5).__setitem__(frame.getlocal(14), i$8);
                        frame.setlocal(11, new PyTuple(new PyObject[] {frame.getlocal(0), frame.getlocal(1), i$15}));
                        if (frame.getlocal(5).invoke("get", frame.getlocal(11)).__nonzero__()) {
                            return Py.None;
                        }
                        frame.getlocal(5).__setitem__(frame.getlocal(11), i$8);
                    }
                    else {
                        if (frame.getlocal(10)._eq(s$6).__nonzero__()) {
                            frame.getlocal(5).__setitem__(frame.getlocal(14), i$8);
                        }
                        else {
                            throw Py.makeException(frame.getglobal("RuntimeError").__call__(s$24._mod(new PyTuple(new PyObject[] {frame.getlocal(10).__repr__(), frame.getglobal("str").__call__(frame.getlocal(12))}))));
                        }
                    }
                }
            }
            frame.getglobal("showwarning").__call__(new PyObject[] {frame.getlocal(0), frame.getlocal(1), frame.getlocal(2), frame.getlocal(3)});
            return Py.None;
        }
        
        private static PyObject showwarning$4(PyFrame frame) {
            // Temporary Variables
            PyException t$0$PyException;
            
            // Code
            /* Hook to write a warning to a file; replace if you like. */
            if (frame.getlocal(4)._is(frame.getglobal("None")).__nonzero__()) {
                frame.setlocal(4, frame.getglobal("sys").__getattr__("stderr"));
            }
            try {
                frame.getlocal(4).invoke("write", frame.getglobal("formatwarning").__call__(new PyObject[] {frame.getlocal(0), frame.getlocal(1), frame.getlocal(2), frame.getlocal(3)}));
            }
            catch (Throwable x$0) {
                t$0$PyException = Py.setException(x$0, frame);
                if (Py.matchException(t$0$PyException, frame.getglobal("IOError"))) {
                    // pass
                }
                else throw t$0$PyException;
            }
            return Py.None;
        }
        
        private static PyObject formatwarning$5(PyFrame frame) {
            /* Function to format a warning the standard way. */
            frame.setlocal(5, org.python.core.imp.importOne("linecache", frame));
            frame.setlocal(6, s$27._mod(new PyTuple(new PyObject[] {frame.getlocal(2), frame.getlocal(3), frame.getlocal(1).__getattr__("__name__"), frame.getlocal(0)})));
            frame.setlocal(4, frame.getlocal(5).__getattr__("getline").__call__(frame.getlocal(2), frame.getlocal(3)).invoke("strip"));
            if (frame.getlocal(4).__nonzero__()) {
                frame.setlocal(6, frame.getlocal(6)._add(s$28)._add(frame.getlocal(4))._add(s$29));
            }
            return frame.getlocal(6);
        }
        
        private static PyObject filterwarnings$6(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject;
            
            // Code
            /* Insert an entry into the list of warnings filters (at the front).
            
                Use assertions to check that all arguments have the right type. */
            if (frame.getglobal("__debug__").__nonzero__()) Py.assert_(frame.getlocal(0)._in(new PyTuple(new PyObject[] {s$20, s$19, s$22, s$6, s$23, s$21})), s$31._mod(frame.getlocal(0).__repr__()));
            if (frame.getglobal("__debug__").__nonzero__()) Py.assert_(frame.getglobal("isinstance").__call__(frame.getlocal(1), frame.getglobal("types").__getattr__("StringType")), s$32);
            if (frame.getglobal("__debug__").__nonzero__()) Py.assert_(frame.getglobal("isinstance").__call__(frame.getlocal(2), frame.getglobal("types").__getattr__("ClassType")), s$33);
            if (frame.getglobal("__debug__").__nonzero__()) Py.assert_(frame.getglobal("issubclass").__call__(frame.getlocal(2), frame.getglobal("Warning")), s$34);
            if (frame.getglobal("__debug__").__nonzero__()) Py.assert_(frame.getglobal("type").__call__(frame.getlocal(3))._is(frame.getglobal("types").__getattr__("StringType")), s$35);
            if (frame.getglobal("__debug__").__nonzero__()) Py.assert_((t$0$PyObject = frame.getglobal("type").__call__(frame.getlocal(4))._is(frame.getglobal("types").__getattr__("IntType"))).__nonzero__() ? frame.getlocal(4)._ge(i$15) : t$0$PyObject, s$36);
            frame.setlocal(6, new PyTuple(new PyObject[] {frame.getlocal(0), frame.getglobal("re").__getattr__("compile").__call__(frame.getlocal(1), frame.getglobal("re").__getattr__("I")), frame.getlocal(2), frame.getglobal("re").__getattr__("compile").__call__(frame.getlocal(3)), frame.getlocal(4)}));
            if (frame.getlocal(5).__nonzero__()) {
                frame.getglobal("filters").invoke("append", frame.getlocal(6));
            }
            else {
                frame.getglobal("filters").invoke("insert", i$15, frame.getlocal(6));
            }
            return Py.None;
        }
        
        private static PyObject resetwarnings$7(PyFrame frame) {
            /* Clear the list of warning filters, so that no filters are active. */
            frame.getglobal("filters").__setslice__(null, null, null, new PyList(new PyObject[] {}));
            return Py.None;
        }
        
        private static PyObject _OptionError$8(PyFrame frame) {
            /* Exception used by option processing helpers. */
            // pass
            return frame.getf_locals();
        }
        
        private static PyObject _processoptions$9(PyFrame frame) {
            // Temporary Variables
            PyException t$0$PyException;
            PyObject t$0$PyObject, t$1$PyObject;
            
            // Code
            t$0$PyObject = frame.getlocal(0).__iter__();
            while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                frame.setlocal(1, t$1$PyObject);
                try {
                    frame.getglobal("_setoption").__call__(frame.getlocal(1));
                }
                catch (Throwable x$0) {
                    t$0$PyException = Py.setException(x$0, frame);
                    if (Py.matchException(t$0$PyException, frame.getglobal("_OptionError"))) {
                        frame.setlocal(2, t$0$PyException.value);
                        Py.printComma(frame.getglobal("sys").__getattr__("stderr"), s$40);
                        Py.println(frame.getglobal("sys").__getattr__("stderr"), frame.getlocal(2));
                    }
                    else throw t$0$PyException;
                }
            }
            return Py.None;
        }
        
        private static PyObject _setoption$10(PyFrame frame) {
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            PyException t$0$PyException;
            
            // Code
            frame.setlocal(6, frame.getlocal(0).invoke("split", s$41));
            if (frame.getglobal("len").__call__(frame.getlocal(6))._gt(i$42).__nonzero__()) {
                throw Py.makeException(frame.getglobal("_OptionError").__call__(s$43._mod(frame.getlocal(0).__repr__())));
            }
            while (frame.getglobal("len").__call__(frame.getlocal(6))._lt(i$42).__nonzero__()) {
                frame.getlocal(6).invoke("append", s$37);
            }
            t$0$PyObject__ = org.python.core.Py.unpackSequence(__listcomprehension$1(frame), 5);
            frame.setlocal(8, t$0$PyObject__[0]);
            frame.setlocal(4, t$0$PyObject__[1]);
            frame.setlocal(7, t$0$PyObject__[2]);
            frame.setlocal(1, t$0$PyObject__[3]);
            frame.setlocal(3, t$0$PyObject__[4]);
            frame.setlocal(8, frame.getglobal("_getaction").__call__(frame.getlocal(8)));
            frame.setlocal(4, frame.getglobal("re").__getattr__("escape").__call__(frame.getlocal(4)));
            frame.setlocal(7, frame.getglobal("_getcategory").__call__(frame.getlocal(7)));
            frame.setlocal(1, frame.getglobal("re").__getattr__("escape").__call__(frame.getlocal(1)));
            if (frame.getlocal(1).__nonzero__()) {
                frame.setlocal(1, frame.getlocal(1)._add(s$44));
            }
            if (frame.getlocal(3).__nonzero__()) {
                try {
                    frame.setlocal(3, frame.getglobal("int").__call__(frame.getlocal(3)));
                    if (frame.getlocal(3)._lt(i$15).__nonzero__()) {
                        throw Py.makeException(frame.getglobal("ValueError"));
                    }
                }
                catch (Throwable x$0) {
                    t$0$PyException = Py.setException(x$0, frame);
                    if (Py.matchException(t$0$PyException, new PyTuple(new PyObject[] {frame.getglobal("ValueError"), frame.getglobal("OverflowError")}))) {
                        throw Py.makeException(frame.getglobal("_OptionError").__call__(s$45._mod(frame.getlocal(3).__repr__())));
                    }
                    else throw t$0$PyException;
                }
            }
            else {
                frame.setlocal(3, i$15);
            }
            frame.getglobal("filterwarnings").__call__(new PyObject[] {frame.getlocal(8), frame.getlocal(4), frame.getlocal(7), frame.getlocal(1), frame.getlocal(3)});
            return Py.None;
        }
        
        private static PyObject _getaction$11(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject, t$1$PyObject;
            
            // Code
            if (frame.getlocal(0).__not__().__nonzero__()) {
                return s$6;
            }
            if (frame.getlocal(0)._eq(s$46).__nonzero__()) {
                return s$22;
            }
            t$0$PyObject = new PyList(new PyObject[] {s$6, s$22, s$19, s$23, s$21, s$20}).__iter__();
            while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                frame.setlocal(1, t$1$PyObject);
                if (frame.getlocal(1).invoke("startswith", frame.getlocal(0)).__nonzero__()) {
                    return frame.getlocal(1);
                }
            }
            throw Py.makeException(frame.getglobal("_OptionError").__call__(s$31._mod(frame.getlocal(0).__repr__())));
        }
        
        private static PyObject _getcategory$12(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject;
            PyException t$0$PyException;
            
            // Code
            if (frame.getlocal(0).__not__().__nonzero__()) {
                return frame.getglobal("Warning");
            }
            if (frame.getglobal("re").__getattr__("match").__call__(s$47, frame.getlocal(0)).__nonzero__()) {
                try {
                    frame.setlocal(2, frame.getglobal("eval").__call__(frame.getlocal(0)));
                }
                catch (Throwable x$0) {
                    t$0$PyException = Py.setException(x$0, frame);
                    if (Py.matchException(t$0$PyException, frame.getglobal("NameError"))) {
                        throw Py.makeException(frame.getglobal("_OptionError").__call__(s$48._mod(frame.getlocal(0).__repr__())));
                    }
                    else throw t$0$PyException;
                }
            }
            else {
                frame.setlocal(5, frame.getlocal(0).invoke("rfind", s$49));
                frame.setlocal(1, frame.getlocal(0).__getslice__(null, frame.getlocal(5), null));
                frame.setlocal(3, frame.getlocal(0).__getslice__(frame.getlocal(5)._add(i$8), null, null));
                try {
                    frame.setlocal(4, frame.getglobal("__import__").__call__(new PyObject[] {frame.getlocal(1), frame.getglobal("None"), frame.getglobal("None"), new PyList(new PyObject[] {frame.getlocal(3)})}));
                }
                catch (Throwable x$1) {
                    t$0$PyException = Py.setException(x$1, frame);
                    if (Py.matchException(t$0$PyException, frame.getglobal("ImportError"))) {
                        throw Py.makeException(frame.getglobal("_OptionError").__call__(s$50._mod(frame.getlocal(1).__repr__())));
                    }
                    else throw t$0$PyException;
                }
                try {
                    frame.setlocal(2, frame.getglobal("getattr").__call__(frame.getlocal(4), frame.getlocal(3)));
                }
                catch (Throwable x$2) {
                    t$0$PyException = Py.setException(x$2, frame);
                    if (Py.matchException(t$0$PyException, frame.getglobal("AttributeError"))) {
                        throw Py.makeException(frame.getglobal("_OptionError").__call__(s$48._mod(frame.getlocal(0).__repr__())));
                    }
                    else throw t$0$PyException;
                }
            }
            if (((t$0$PyObject = frame.getglobal("isinstance").__call__(frame.getlocal(2), frame.getglobal("types").__getattr__("ClassType")).__not__()).__nonzero__() ? t$0$PyObject : frame.getglobal("issubclass").__call__(frame.getlocal(2), frame.getglobal("Warning")).__not__()).__nonzero__()) {
                throw Py.makeException(frame.getglobal("_OptionError").__call__(s$51._mod(frame.getlocal(0).__repr__())));
            }
            return frame.getlocal(2);
        }
        
        private static PyObject _test$13(PyFrame frame) {
            // Temporary Variables
            boolean t$0$boolean;
            PyObject[] t$0$PyObject__;
            PyObject t$0$PyObject, t$1$PyObject, t$2$PyObject, t$3$PyObject, t$4$PyObject, t$5$PyObject;
            PyException t$0$PyException;
            
            // Code
            frame.setlocal(1, org.python.core.imp.importOne("getopt", frame));
            frame.setlocal(9, new PyList(new PyObject[] {}));
            try {
                t$0$PyObject__ = org.python.core.Py.unpackSequence(frame.getlocal(1).__getattr__("getopt").__call__(frame.getglobal("sys").__getattr__("argv").__getslice__(i$8, null, null), s$52), 2);
                frame.setlocal(4, t$0$PyObject__[0]);
                frame.setlocal(0, t$0$PyObject__[1]);
            }
            catch (Throwable x$0) {
                t$0$PyException = Py.setException(x$0, frame);
                if (Py.matchException(t$0$PyException, frame.getlocal(1).__getattr__("error"))) {
                    frame.setlocal(2, t$0$PyException.value);
                    Py.println(frame.getglobal("sys").__getattr__("stderr"), frame.getlocal(2));
                    return Py.None;
                }
                else throw t$0$PyException;
            }
            t$0$PyObject = frame.getlocal(4).__iter__();
            while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                t$0$PyObject__ = org.python.core.Py.unpackSequence(t$1$PyObject, 2);
                frame.setlocal(5, t$0$PyObject__[0]);
                frame.setlocal(8, t$0$PyObject__[1]);
                frame.getlocal(9).invoke("append", frame.getlocal(8));
            }
            try {
                frame.getglobal("_processoptions").__call__(frame.getlocal(9));
            }
            catch (Throwable x$1) {
                t$0$PyException = Py.setException(x$1, frame);
                if (Py.matchException(t$0$PyException, frame.getglobal("_OptionError"))) {
                    frame.setlocal(2, t$0$PyException.value);
                    Py.println(frame.getglobal("sys").__getattr__("stderr"), frame.getlocal(2));
                    return Py.None;
                }
                else throw t$0$PyException;
            }
            t$2$PyObject = frame.getglobal("filters").__iter__();
            while ((t$3$PyObject = t$2$PyObject.__iternext__()) != null) {
                frame.setlocal(7, t$3$PyObject);
                Py.println(Py.None, frame.getlocal(7));
            }
            frame.setlocal(3, s$53);
            frame.getglobal("warn").__call__(frame.getlocal(3));
            frame.getglobal("warn").__call__(frame.getlocal(3));
            frame.getglobal("warn").__call__(frame.getlocal(3));
            frame.getglobal("warn").__call__(frame.getlocal(3));
            frame.getglobal("warn").__call__(frame.getlocal(3), frame.getglobal("UserWarning"));
            frame.getglobal("warn").__call__(frame.getlocal(3), frame.getglobal("DeprecationWarning"));
            t$4$PyObject = frame.getglobal("range").__call__(i$17).__iter__();
            while ((t$5$PyObject = t$4$PyObject.__iternext__()) != null) {
                frame.setlocal(6, t$5$PyObject);
                frame.getglobal("warn").__call__(frame.getlocal(3));
            }
            frame.getglobal("filterwarnings").__call__(new PyObject[] {s$20, s$37, frame.getglobal("Warning"), s$37, i$15});
            t$0$boolean = true;
            try {
                frame.getglobal("warn").__call__(frame.getlocal(3));
            }
            catch (Throwable x$2) {
                t$0$boolean = false;
                t$0$PyException = Py.setException(x$2, frame);
                if (Py.matchException(t$0$PyException, frame.getglobal("Exception"))) {
                    frame.setlocal(2, t$0$PyException.value);
                    Py.printComma(Py.None, s$54);
                    Py.printComma(Py.None, frame.getlocal(2).__getattr__("__class__").__getattr__("__name__")._add(s$41));
                    Py.println(Py.None, frame.getlocal(2));
                }
                else throw t$0$PyException;
            }
            if (t$0$boolean) {
                Py.println(Py.None, s$55);
            }
            frame.getglobal("resetwarnings").__call__();
            t$0$boolean = true;
            try {
                frame.getglobal("filterwarnings").__call__(new PyObject[] {s$56, s$37, frame.getglobal("Warning"), s$37, i$15});
            }
            catch (Throwable x$3) {
                t$0$boolean = false;
                t$0$PyException = Py.setException(x$3, frame);
                if (Py.matchException(t$0$PyException, frame.getglobal("Exception"))) {
                    frame.setlocal(2, t$0$PyException.value);
                    Py.printComma(Py.None, s$54);
                    Py.printComma(Py.None, frame.getlocal(2).__getattr__("__class__").__getattr__("__name__")._add(s$41));
                    Py.println(Py.None, frame.getlocal(2));
                }
                else throw t$0$PyException;
            }
            if (t$0$boolean) {
                Py.println(Py.None, s$55);
            }
            return Py.None;
        }
        
        private static PyObject main$14(PyFrame frame) {
            frame.setglobal("__file__", s$58);
            
            /* Python part of the warnings subsystem. */
            frame.setlocal("sys", org.python.core.imp.importOne("sys", frame));
            frame.setlocal("re", org.python.core.imp.importOne("re", frame));
            frame.setlocal("types", org.python.core.imp.importOne("types", frame));
            frame.setlocal("__all__", new PyList(new PyObject[] {s$1, s$2, s$3, s$4, s$5}));
            frame.setlocal("defaultaction", s$6);
            frame.setlocal("filters", new PyList(new PyObject[] {}));
            frame.setlocal("onceregistry", new PyDictionary(new PyObject[] {}));
            frame.setlocal("warn", new PyFunction(frame.f_globals, new PyObject[] {frame.getname("None"), i$8}, c$0_warn));
            frame.setlocal("warn_explicit", new PyFunction(frame.f_globals, new PyObject[] {frame.getname("None"), frame.getname("None")}, c$1_warn_explicit));
            frame.setlocal("showwarning", new PyFunction(frame.f_globals, new PyObject[] {frame.getname("None")}, c$2_showwarning));
            frame.setlocal("formatwarning", new PyFunction(frame.f_globals, new PyObject[] {}, c$3_formatwarning));
            frame.setlocal("filterwarnings", new PyFunction(frame.f_globals, new PyObject[] {s$37, frame.getname("Warning"), s$37, i$15, i$15}, c$4_filterwarnings));
            frame.setlocal("resetwarnings", new PyFunction(frame.f_globals, new PyObject[] {}, c$5_resetwarnings));
            frame.setlocal("_OptionError", Py.makeClass("_OptionError", new PyObject[] {frame.getname("Exception")}, c$6__OptionError, null));
            frame.setlocal("_processoptions", new PyFunction(frame.f_globals, new PyObject[] {}, c$7__processoptions));
            frame.setlocal("_setoption", new PyFunction(frame.f_globals, new PyObject[] {}, c$8__setoption));
            frame.setlocal("_getaction", new PyFunction(frame.f_globals, new PyObject[] {}, c$9__getaction));
            frame.setlocal("_getcategory", new PyFunction(frame.f_globals, new PyObject[] {}, c$10__getcategory));
            frame.setlocal("_test", new PyFunction(frame.f_globals, new PyObject[] {}, c$11__test));
            if (frame.getname("__name__")._eq(s$14).__nonzero__()) {
                frame.setlocal("__main__", org.python.core.imp.importOne("__main__", frame));
                frame.getname("sys").__getattr__("modules").__setitem__(s$57, frame.getname("__main__"));
                frame.getname("_test").__call__();
            }
            else {
                frame.getname("_processoptions").__call__(frame.getname("sys").__getattr__("warnoptions"));
                frame.getname("filterwarnings").__call__(new PyObject[] {s$19, frame.getname("OverflowWarning"), i$8}, new String[] {"category", "append"});
            }
            return Py.None;
        }
        
    }
    public static void moduleDictInit(PyObject dict) {
        dict.__setitem__("__name__", new PyString("warnings"));
        Py.runCode(new _PyInner().getMain(), dict, dict);
    }
    
    public static void main(String[] args) throws java.lang.Exception {
        String[] newargs = new String[args.length+1];
        newargs[0] = "warnings";
        java.lang.System.arraycopy(args, 0, newargs, 1, args.length);
        Py.runMain(warnings._PyInner.class, newargs, warnings.jpy$packages, warnings.jpy$mainProperties, "", new String[] {"string", "random", "traceback", "sre_compile", "atexit", "warnings", "popen2", "getopt", "sre", "sre_constants", "StringIO", "QAsystem", "javaos", "repr", "copy_reg", "re", "linecache", "javapath", "UserDict", "copy", "threading", "stat", "sre_parse", "javashell"});
    }
    
}

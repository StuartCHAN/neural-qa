import org.python.core.*;

public class getopt extends java.lang.Object {
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
        private static PyObject i$6;
        private static PyObject s$7;
        private static PyObject s$8;
        private static PyObject i$9;
        private static PyObject i$10;
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
        private static PyFunctionTable funcTable;
        private static PyCode c$0___init__;
        private static PyCode c$1___str__;
        private static PyCode c$2_GetoptError;
        private static PyCode c$3_getopt;
        private static PyCode c$4_do_longs;
        private static PyCode c$5_long_has_args;
        private static PyCode c$6_do_shorts;
        private static PyCode c$7_short_has_arg;
        private static PyCode c$8_main;
        private static void initConstants() {
            s$0 = Py.newString("Parser for command line options.\012\012This module helps scripts to parse the command line arguments in\012sys.argv.  It supports the same conventions as the Unix getopt()\012function (including the special meanings of arguments of the form `-'\012and `--').  Long options similar to those supported by GNU software\012may be used as well via an optional third argument.  This module\012provides a single function and an exception:\012\012getopt() -- Parse command line options\012GetoptError -- exception (class) raised with 'opt' attribute, which is the\012option involved with the exception.\012");
            s$1 = Py.newString("GetoptError");
            s$2 = Py.newString("error");
            s$3 = Py.newString("getopt");
            s$4 = Py.newString("");
            s$5 = Py.newString("getopt(args, options[, long_options]) -> opts, args\012\012    Parses command line options and parameter list.  args is the\012    argument list to be parsed, without the leading reference to the\012    running program.  Typically, this means \"sys.argv[1:]\".  shortopts\012    is the string of option letters that the script wants to\012    recognize, with options that require an argument followed by a\012    colon (i.e., the same format that Unix getopt() uses).  If\012    specified, longopts is a list of strings with the names of the\012    long options which should be supported.  The leading '--'\012    characters should not be included in the option name.  Options\012    which require an argument should be followed by an equal sign\012    ('=').\012\012    The return value consists of two elements: the first is a list of\012    (option, value) pairs; the second is the list of program arguments\012    left after the option list was stripped (this is a trailing slice\012    of the first argument).  Each option-and-value pair returned has\012    the option as its first element, prefixed with a hyphen (e.g.,\012    '-x'), and the option argument as its second element, or an empty\012    string if the option has no argument.  The options occur in the\012    list in the same order in which they were found, thus allowing\012    multiple occurrences.  Long and short options may be mixed.\012\012    ");
            i$6 = Py.newInteger(0);
            s$7 = Py.newString("-");
            s$8 = Py.newString("--");
            i$9 = Py.newInteger(1);
            i$10 = Py.newInteger(2);
            s$11 = Py.newString("=");
            s$12 = Py.newString("option --%s requires argument");
            s$13 = Py.newString("option --%s must not have an argument");
            s$14 = Py.newString("option --%s not recognized");
            s$15 = Py.newString("option --%s not a unique prefix");
            s$16 = Py.newString("option -%s requires argument");
            s$17 = Py.newString(":");
            s$18 = Py.newString("option -%s not recognized");
            s$19 = Py.newString("__main__");
            s$20 = Py.newString("a:b");
            s$21 = Py.newString("alpha=");
            s$22 = Py.newString("beta");
            s$23 = Py.newString("F:\\Java\\Jython\\jython2.2.1\\Lib\\getopt.py");
            funcTable = new _PyInner();
            c$0___init__ = Py.newCode(3, new String[] {"self", "msg", "opt"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\getopt.py", "__init__", false, false, funcTable, 1, null, null, 0, 17);
            c$1___str__ = Py.newCode(1, new String[] {"self"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\getopt.py", "__str__", false, false, funcTable, 2, null, null, 0, 17);
            c$2_GetoptError = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\getopt.py", "GetoptError", false, false, funcTable, 3, null, null, 0, 16);
            c$3_getopt = Py.newCode(3, new String[] {"args", "shortopts", "longopts", "opts"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\getopt.py", "getopt", false, false, funcTable, 4, null, null, 0, 17);
            c$4_do_longs = Py.newCode(4, new String[] {"opts", "opt", "longopts", "args", "has_arg", "i", "optarg"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\getopt.py", "do_longs", false, false, funcTable, 5, null, null, 0, 17);
            c$5_long_has_args = Py.newCode(2, new String[] {"opt", "longopts", "o", "possibilities", "unique_match", "has_arg", "_[1]"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\getopt.py", "long_has_args", false, false, funcTable, 6, null, null, 0, 17);
            c$6_do_shorts = Py.newCode(4, new String[] {"opts", "optstring", "shortopts", "args", "opt", "optarg"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\getopt.py", "do_shorts", false, false, funcTable, 7, null, null, 0, 17);
            c$7_short_has_arg = Py.newCode(2, new String[] {"opt", "shortopts", "i"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\getopt.py", "short_has_arg", false, false, funcTable, 8, null, null, 0, 17);
            c$8_main = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\getopt.py", "main", false, false, funcTable, 9, null, null, 0, 16);
        }
        
        
        public PyCode getMain() {
            if (c$8_main == null) _PyInner.initConstants();
            return c$8_main;
        }
        
        public PyObject call_function(int index, PyFrame frame) {
            switch (index){
                case 0:
                return _PyInner.__listcomprehension$1(frame);
                case 1:
                return _PyInner.__init__$2(frame);
                case 2:
                return _PyInner.__str__$3(frame);
                case 3:
                return _PyInner.GetoptError$4(frame);
                case 4:
                return _PyInner.getopt$5(frame);
                case 5:
                return _PyInner.do_longs$6(frame);
                case 6:
                return _PyInner.long_has_args$7(frame);
                case 7:
                return _PyInner.do_shorts$8(frame);
                case 8:
                return _PyInner.short_has_arg$9(frame);
                case 9:
                return _PyInner.main$10(frame);
                default:
                return null;
            }
        }
        
        private static PyObject __listcomprehension$1(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject, t$1$PyObject, t$2$PyObject, t$3$PyObject;
            
            t$0$PyObject = new PyList(new PyObject[] {});
            frame.setlocal(6, t$0$PyObject.__getattr__("append"));
            t$2$PyObject = frame.getlocal(1).__iter__();
            while ((t$3$PyObject = t$2$PyObject.__iternext__()) != null) {
                frame.setlocal(2, t$3$PyObject);
                if (frame.getlocal(2).invoke("startswith", frame.getlocal(0)).__nonzero__()) {
                    frame.getlocal(6).__call__(frame.getlocal(2));
                }
            }
            return t$0$PyObject;
        }
        
        private static PyObject __init__$2(PyFrame frame) {
            frame.getlocal(0).__setattr__("msg", frame.getlocal(1));
            frame.getlocal(0).__setattr__("opt", frame.getlocal(2));
            frame.getglobal("Exception").invoke("__init__", new PyObject[] {frame.getlocal(0), frame.getlocal(1), frame.getlocal(2)});
            return Py.None;
        }
        
        private static PyObject __str__$3(PyFrame frame) {
            return frame.getlocal(0).__getattr__("msg");
        }
        
        private static PyObject GetoptError$4(PyFrame frame) {
            frame.setlocal("opt", s$4);
            frame.setlocal("msg", s$4);
            frame.setlocal("__init__", new PyFunction(frame.f_globals, new PyObject[] {}, c$0___init__));
            frame.setlocal("__str__", new PyFunction(frame.f_globals, new PyObject[] {}, c$1___str__));
            return frame.getf_locals();
        }
        
        private static PyObject getopt$5(PyFrame frame) {
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            PyObject t$0$PyObject;
            
            // Code
            /* getopt(args, options[, long_options]) -> opts, args
            
                Parses command line options and parameter list.  args is the
                argument list to be parsed, without the leading reference to the
                running program.  Typically, this means "sys.argv[1:]".  shortopts
                is the string of option letters that the script wants to
                recognize, with options that require an argument followed by a
                colon (i.e., the same format that Unix getopt() uses).  If
                specified, longopts is a list of strings with the names of the
                long options which should be supported.  The leading '--'
                characters should not be included in the option name.  Options
                which require an argument should be followed by an equal sign
                ('=').
            
                The return value consists of two elements: the first is a list of
                (option, value) pairs; the second is the list of program arguments
                left after the option list was stripped (this is a trailing slice
                of the first argument).  Each option-and-value pair returned has
                the option as its first element, prefixed with a hyphen (e.g.,
                '-x'), and the option argument as its second element, or an empty
                string if the option has no argument.  The options occur in the
                list in the same order in which they were found, thus allowing
                multiple occurrences.  Long and short options may be mixed.
            
                 */
            frame.setlocal(3, new PyList(new PyObject[] {}));
            if (frame.getglobal("type").__call__(frame.getlocal(2))._eq(frame.getglobal("type").__call__(s$4)).__nonzero__()) {
                frame.setlocal(2, new PyList(new PyObject[] {frame.getlocal(2)}));
            }
            else {
                frame.setlocal(2, frame.getglobal("list").__call__(frame.getlocal(2)));
            }
            while (((t$0$PyObject = ((t$0$PyObject = frame.getlocal(0)).__nonzero__() ? frame.getlocal(0).__getitem__(i$6).invoke("startswith", s$7) : t$0$PyObject)).__nonzero__() ? frame.getlocal(0).__getitem__(i$6)._ne(s$7) : t$0$PyObject).__nonzero__()) {
                if (frame.getlocal(0).__getitem__(i$6)._eq(s$8).__nonzero__()) {
                    frame.setlocal(0, frame.getlocal(0).__getslice__(i$9, null, null));
                    break;
                }
                if (frame.getlocal(0).__getitem__(i$6).__getslice__(null, i$10, null)._eq(s$8).__nonzero__()) {
                    t$0$PyObject__ = org.python.core.Py.unpackSequence(frame.getglobal("do_longs").__call__(new PyObject[] {frame.getlocal(3), frame.getlocal(0).__getitem__(i$6).__getslice__(i$10, null, null), frame.getlocal(2), frame.getlocal(0).__getslice__(i$9, null, null)}), 2);
                    frame.setlocal(3, t$0$PyObject__[0]);
                    frame.setlocal(0, t$0$PyObject__[1]);
                }
                else {
                    t$0$PyObject__ = org.python.core.Py.unpackSequence(frame.getglobal("do_shorts").__call__(new PyObject[] {frame.getlocal(3), frame.getlocal(0).__getitem__(i$6).__getslice__(i$9, null, null), frame.getlocal(1), frame.getlocal(0).__getslice__(i$9, null, null)}), 2);
                    frame.setlocal(3, t$0$PyObject__[0]);
                    frame.setlocal(0, t$0$PyObject__[1]);
                }
            }
            return new PyTuple(new PyObject[] {frame.getlocal(3), frame.getlocal(0)});
        }
        
        private static PyObject do_longs$6(PyFrame frame) {
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            boolean t$0$boolean;
            PyObject t$0$PyObject;
            PyException t$0$PyException;
            
            // Code
            t$0$boolean = true;
            try {
                frame.setlocal(5, frame.getlocal(1).invoke("index", s$11));
            }
            catch (Throwable x$0) {
                t$0$boolean = false;
                t$0$PyException = Py.setException(x$0, frame);
                if (Py.matchException(t$0$PyException, frame.getglobal("ValueError"))) {
                    frame.setlocal(6, frame.getglobal("None"));
                }
                else throw t$0$PyException;
            }
            if (t$0$boolean) {
                t$0$PyObject__ = org.python.core.Py.unpackSequence(new PyTuple(new PyObject[] {frame.getlocal(1).__getslice__(null, frame.getlocal(5), null), frame.getlocal(1).__getslice__(frame.getlocal(5)._add(i$9), null, null)}), 2);
                frame.setlocal(1, t$0$PyObject__[0]);
                frame.setlocal(6, t$0$PyObject__[1]);
            }
            t$0$PyObject__ = org.python.core.Py.unpackSequence(frame.getglobal("long_has_args").__call__(frame.getlocal(1), frame.getlocal(2)), 2);
            frame.setlocal(4, t$0$PyObject__[0]);
            frame.setlocal(1, t$0$PyObject__[1]);
            if (frame.getlocal(4).__nonzero__()) {
                if (frame.getlocal(6)._is(frame.getglobal("None")).__nonzero__()) {
                    if (frame.getlocal(3).__not__().__nonzero__()) {
                        throw Py.makeException(frame.getglobal("GetoptError").__call__(s$12._mod(frame.getlocal(1)), frame.getlocal(1)));
                    }
                    t$0$PyObject__ = org.python.core.Py.unpackSequence(new PyTuple(new PyObject[] {frame.getlocal(3).__getitem__(i$6), frame.getlocal(3).__getslice__(i$9, null, null)}), 2);
                    frame.setlocal(6, t$0$PyObject__[0]);
                    frame.setlocal(3, t$0$PyObject__[1]);
                }
            }
            else {
                if (frame.getlocal(6).__nonzero__()) {
                    throw Py.makeException(frame.getglobal("GetoptError").__call__(s$13._mod(frame.getlocal(1)), frame.getlocal(1)));
                }
            }
            frame.getlocal(0).invoke("append", new PyTuple(new PyObject[] {s$8._add(frame.getlocal(1)), (t$0$PyObject = frame.getlocal(6)).__nonzero__() ? t$0$PyObject : s$4}));
            return new PyTuple(new PyObject[] {frame.getlocal(0), frame.getlocal(3)});
        }
        
        private static PyObject long_has_args$7(PyFrame frame) {
            frame.setlocal(3, __listcomprehension$1(frame));
            if (frame.getlocal(3).__not__().__nonzero__()) {
                throw Py.makeException(frame.getglobal("GetoptError").__call__(s$14._mod(frame.getlocal(0)), frame.getlocal(0)));
            }
            if (frame.getlocal(0)._in(frame.getlocal(3)).__nonzero__()) {
                return new PyTuple(new PyObject[] {i$6, frame.getlocal(0)});
            }
            else {
                if (frame.getlocal(0)._add(s$11)._in(frame.getlocal(3)).__nonzero__()) {
                    return new PyTuple(new PyObject[] {i$9, frame.getlocal(0)});
                }
            }
            if (frame.getglobal("len").__call__(frame.getlocal(3))._gt(i$9).__nonzero__()) {
                throw Py.makeException(frame.getglobal("GetoptError").__call__(s$15._mod(frame.getlocal(0)), frame.getlocal(0)));
            }
            if (frame.getglobal("__debug__").__nonzero__()) Py.assert_(frame.getglobal("len").__call__(frame.getlocal(3))._eq(i$9));
            frame.setlocal(4, frame.getlocal(3).__getitem__(i$6));
            frame.setlocal(5, frame.getlocal(4).invoke("endswith", s$11));
            if (frame.getlocal(5).__nonzero__()) {
                frame.setlocal(4, frame.getlocal(4).__getslice__(null, i$9.__neg__(), null));
            }
            return new PyTuple(new PyObject[] {frame.getlocal(5), frame.getlocal(4)});
        }
        
        private static PyObject do_shorts$8(PyFrame frame) {
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            
            // Code
            while (frame.getlocal(1)._ne(s$4).__nonzero__()) {
                t$0$PyObject__ = org.python.core.Py.unpackSequence(new PyTuple(new PyObject[] {frame.getlocal(1).__getitem__(i$6), frame.getlocal(1).__getslice__(i$9, null, null)}), 2);
                frame.setlocal(4, t$0$PyObject__[0]);
                frame.setlocal(1, t$0$PyObject__[1]);
                if (frame.getglobal("short_has_arg").__call__(frame.getlocal(4), frame.getlocal(2)).__nonzero__()) {
                    if (frame.getlocal(1)._eq(s$4).__nonzero__()) {
                        if (frame.getlocal(3).__not__().__nonzero__()) {
                            throw Py.makeException(frame.getglobal("GetoptError").__call__(s$16._mod(frame.getlocal(4)), frame.getlocal(4)));
                        }
                        t$0$PyObject__ = org.python.core.Py.unpackSequence(new PyTuple(new PyObject[] {frame.getlocal(3).__getitem__(i$6), frame.getlocal(3).__getslice__(i$9, null, null)}), 2);
                        frame.setlocal(1, t$0$PyObject__[0]);
                        frame.setlocal(3, t$0$PyObject__[1]);
                    }
                    t$0$PyObject__ = org.python.core.Py.unpackSequence(new PyTuple(new PyObject[] {frame.getlocal(1), s$4}), 2);
                    frame.setlocal(5, t$0$PyObject__[0]);
                    frame.setlocal(1, t$0$PyObject__[1]);
                }
                else {
                    frame.setlocal(5, s$4);
                }
                frame.getlocal(0).invoke("append", new PyTuple(new PyObject[] {s$7._add(frame.getlocal(4)), frame.getlocal(5)}));
            }
            return new PyTuple(new PyObject[] {frame.getlocal(0), frame.getlocal(3)});
        }
        
        private static PyObject short_has_arg$9(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject, t$1$PyObject, t$2$PyObject;
            
            // Code
            t$0$PyObject = frame.getglobal("range").__call__(frame.getglobal("len").__call__(frame.getlocal(1))).__iter__();
            while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                frame.setlocal(2, t$1$PyObject);
                if ((frame.getlocal(0)._eq(t$2$PyObject = frame.getlocal(1).__getitem__(frame.getlocal(2))).__nonzero__() ? t$2$PyObject._ne(s$17) : Py.Zero).__nonzero__()) {
                    return frame.getlocal(1).__getslice__(frame.getlocal(2)._add(i$9), frame.getlocal(2)._add(i$10), null)._eq(s$17);
                }
            }
            throw Py.makeException(frame.getglobal("GetoptError").__call__(s$18._mod(frame.getlocal(0)), frame.getlocal(0)));
        }
        
        private static PyObject main$10(PyFrame frame) {
            frame.setglobal("__file__", s$23);
            
            /* Parser for command line options.
            
            This module helps scripts to parse the command line arguments in
            sys.argv.  It supports the same conventions as the Unix getopt()
            function (including the special meanings of arguments of the form `-'
            and `--').  Long options similar to those supported by GNU software
            may be used as well via an optional third argument.  This module
            provides a single function and an exception:
            
            getopt() -- Parse command line options
            GetoptError -- exception (class) raised with 'opt' attribute, which is the
            option involved with the exception.
             */
            frame.setlocal("__all__", new PyList(new PyObject[] {s$1, s$2, s$3}));
            frame.setlocal("GetoptError", Py.makeClass("GetoptError", new PyObject[] {frame.getname("Exception")}, c$2_GetoptError, null));
            frame.setlocal("error", frame.getname("GetoptError"));
            frame.setlocal("getopt", new PyFunction(frame.f_globals, new PyObject[] {new PyList(new PyObject[] {})}, c$3_getopt));
            frame.setlocal("do_longs", new PyFunction(frame.f_globals, new PyObject[] {}, c$4_do_longs));
            frame.setlocal("long_has_args", new PyFunction(frame.f_globals, new PyObject[] {}, c$5_long_has_args));
            frame.setlocal("do_shorts", new PyFunction(frame.f_globals, new PyObject[] {}, c$6_do_shorts));
            frame.setlocal("short_has_arg", new PyFunction(frame.f_globals, new PyObject[] {}, c$7_short_has_arg));
            if (frame.getname("__name__")._eq(s$19).__nonzero__()) {
                frame.setlocal("sys", org.python.core.imp.importOne("sys", frame));
                Py.println(Py.None, frame.getname("getopt").__call__(frame.getname("sys").__getattr__("argv").__getslice__(i$9, null, null), s$20, new PyList(new PyObject[] {s$21, s$22})));
            }
            return Py.None;
        }
        
    }
    public static void moduleDictInit(PyObject dict) {
        dict.__setitem__("__name__", new PyString("getopt"));
        Py.runCode(new _PyInner().getMain(), dict, dict);
    }
    
    public static void main(String[] args) throws java.lang.Exception {
        String[] newargs = new String[args.length+1];
        newargs[0] = "getopt";
        java.lang.System.arraycopy(args, 0, newargs, 1, args.length);
        Py.runMain(getopt._PyInner.class, newargs, getopt.jpy$packages, getopt.jpy$mainProperties, "", new String[] {"string", "random", "traceback", "sre_compile", "atexit", "warnings", "popen2", "getopt", "sre", "sre_constants", "StringIO", "QAsystem", "javaos", "repr", "copy_reg", "re", "linecache", "javapath", "UserDict", "copy", "threading", "stat", "sre_parse", "javashell"});
    }
    
}

import org.python.core.*;

public class copy_reg extends java.lang.Object {
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
        private static PyObject i$7;
        private static PyObject s$8;
        private static PyObject s$9;
        private static PyObject s$10;
        private static PyFunctionTable funcTable;
        private static PyCode c$0_pickle;
        private static PyCode c$1_constructor;
        private static PyCode c$2_pickle_complex;
        private static PyCode c$3__reconstructor;
        private static PyCode c$4__reduce;
        private static PyCode c$5_main;
        private static void initConstants() {
            s$0 = Py.newString("Helper to provide extensibility for pickle/cPickle.\012\012This is only useful to add pickle support for extension types defined in\012C, not for instances of user-defined classes.\012");
            s$1 = Py.newString("pickle");
            s$2 = Py.newString("constructor");
            s$3 = Py.newString("copy_reg is not intended for use with classes");
            s$4 = Py.newString("reduction functions must be callable");
            s$5 = Py.newString("constructors must be callable");
            i$6 = Py.newInteger(1);
            i$7 = Py.newInteger(9);
            s$8 = Py.newString("__flags__");
            s$9 = Py.newString("can't pickle %s objects");
            s$10 = Py.newString("F:\\Java\\Jython\\jython2.2.1\\Lib\\copy_reg.py");
            funcTable = new _PyInner();
            c$0_pickle = Py.newCode(3, new String[] {"ob_type", "pickle_function", "constructor_ob"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\copy_reg.py", "pickle", false, false, funcTable, 0, null, null, 0, 17);
            c$1_constructor = Py.newCode(1, new String[] {"object"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\copy_reg.py", "constructor", false, false, funcTable, 1, null, null, 0, 17);
            c$2_pickle_complex = Py.newCode(1, new String[] {"c"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\copy_reg.py", "pickle_complex", false, false, funcTable, 2, null, null, 0, 17);
            c$3__reconstructor = Py.newCode(3, new String[] {"cls", "base", "state", "obj"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\copy_reg.py", "_reconstructor", false, false, funcTable, 3, null, null, 0, 17);
            c$4__reduce = Py.newCode(1, new String[] {"self", "state", "base", "dict", "args", "getstate"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\copy_reg.py", "_reduce", false, false, funcTable, 4, null, null, 0, 17);
            c$5_main = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\copy_reg.py", "main", false, false, funcTable, 5, null, null, 0, 16);
        }
        
        
        public PyCode getMain() {
            if (c$5_main == null) _PyInner.initConstants();
            return c$5_main;
        }
        
        public PyObject call_function(int index, PyFrame frame) {
            switch (index){
                case 0:
                return _PyInner.pickle$1(frame);
                case 1:
                return _PyInner.constructor$2(frame);
                case 2:
                return _PyInner.pickle_complex$3(frame);
                case 3:
                return _PyInner._reconstructor$4(frame);
                case 4:
                return _PyInner._reduce$5(frame);
                case 5:
                return _PyInner.main$6(frame);
                default:
                return null;
            }
        }
        
        private static PyObject pickle$1(PyFrame frame) {
            if (frame.getglobal("type").__call__(frame.getlocal(0))._is(frame.getglobal("_ClassType")).__nonzero__()) {
                throw Py.makeException(frame.getglobal("TypeError").__call__(s$3));
            }
            if (frame.getglobal("callable").__call__(frame.getlocal(1)).__not__().__nonzero__()) {
                throw Py.makeException(frame.getglobal("TypeError").__call__(s$4));
            }
            frame.getglobal("dispatch_table").__setitem__(frame.getlocal(0), frame.getlocal(1));
            if (frame.getlocal(2)._isnot(frame.getglobal("None")).__nonzero__()) {
                frame.getglobal("constructor").__call__(frame.getlocal(2));
            }
            return Py.None;
        }
        
        private static PyObject constructor$2(PyFrame frame) {
            if (frame.getglobal("callable").__call__(frame.getlocal(0)).__not__().__nonzero__()) {
                throw Py.makeException(frame.getglobal("TypeError").__call__(s$5));
            }
            frame.getglobal("safe_constructors").__setitem__(frame.getlocal(0), i$6);
            return Py.None;
        }
        
        private static PyObject pickle_complex$3(PyFrame frame) {
            return new PyTuple(new PyObject[] {frame.getglobal("complex"), new PyTuple(new PyObject[] {frame.getlocal(0).__getattr__("real"), frame.getlocal(0).__getattr__("imag")})});
        }
        
        private static PyObject _reconstructor$4(PyFrame frame) {
            frame.setlocal(3, frame.getlocal(1).invoke("__new__", frame.getlocal(0), frame.getlocal(2)));
            frame.getlocal(1).invoke("__init__", frame.getlocal(3), frame.getlocal(2));
            return frame.getlocal(3);
        }
        
        private static PyObject _reduce$5(PyFrame frame) {
            // Temporary Variables
            boolean t$0$boolean;
            PyException t$0$PyException, t$1$PyException;
            PyObject t$0$PyObject, t$1$PyObject, t$2$PyObject;
            
            // Code
            t$0$PyObject = frame.getlocal(0).__getattr__("__class__").__getattr__("__mro__").__iter__();
            while (t$0$boolean=(t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                frame.setlocal(2, t$1$PyObject);
                if (((t$2$PyObject = frame.getglobal("hasattr").__call__(frame.getlocal(2), s$8)).__nonzero__() ? frame.getlocal(2).__getattr__("__flags__")._and(frame.getglobal("_HEAPTYPE")).__not__() : t$2$PyObject).__nonzero__()) {
                    break;
                }
            }
            if (!t$0$boolean) {
                frame.setlocal(2, frame.getglobal("object"));
            }
            if (frame.getlocal(2)._is(frame.getglobal("object")).__nonzero__()) {
                frame.setlocal(1, frame.getglobal("None"));
            }
            else {
                if (frame.getlocal(2)._is(frame.getlocal(0).__getattr__("__class__")).__nonzero__()) {
                    throw Py.makeException(frame.getglobal("TypeError"), s$9._mod(frame.getlocal(2).__getattr__("__name__")));
                }
                frame.setlocal(1, frame.getlocal(2).__call__(frame.getlocal(0)));
            }
            frame.setlocal(4, new PyTuple(new PyObject[] {frame.getlocal(0).__getattr__("__class__"), frame.getlocal(2), frame.getlocal(1)}));
            t$0$boolean = true;
            try {
                frame.setlocal(5, frame.getlocal(0).__getattr__("__getstate__"));
            }
            catch (Throwable x$0) {
                t$0$boolean = false;
                t$0$PyException = Py.setException(x$0, frame);
                if (Py.matchException(t$0$PyException, frame.getglobal("AttributeError"))) {
                    try {
                        frame.setlocal(3, frame.getlocal(0).__getattr__("__dict__"));
                    }
                    catch (Throwable x$1) {
                        t$1$PyException = Py.setException(x$1, frame);
                        if (Py.matchException(t$1$PyException, frame.getglobal("AttributeError"))) {
                            frame.setlocal(3, frame.getglobal("None"));
                        }
                        else throw t$1$PyException;
                    }
                }
                else throw t$0$PyException;
            }
            if (t$0$boolean) {
                frame.setlocal(3, frame.getlocal(5).__call__());
            }
            if (frame.getlocal(3).__nonzero__()) {
                return new PyTuple(new PyObject[] {frame.getglobal("_reconstructor"), frame.getlocal(4), frame.getlocal(3)});
            }
            else {
                return new PyTuple(new PyObject[] {frame.getglobal("_reconstructor"), frame.getlocal(4)});
            }
        }
        
        private static PyObject main$6(PyFrame frame) {
            frame.setglobal("__file__", s$10);
            
            // Temporary Variables
            boolean t$0$boolean;
            PyObject[] t$0$PyObject__;
            PyException t$0$PyException;
            
            // Code
            /* Helper to provide extensibility for pickle/cPickle.
            
            This is only useful to add pickle support for extension types defined in
            C, not for instances of user-defined classes.
             */
            t$0$PyObject__ = org.python.core.imp.importFrom("types", new String[] {"ClassType"}, frame);
            frame.setlocal("_ClassType", t$0$PyObject__[0]);
            t$0$PyObject__ = null;
            frame.setlocal("__all__", new PyList(new PyObject[] {s$1, s$2}));
            frame.setlocal("dispatch_table", new PyDictionary(new PyObject[] {}));
            frame.setlocal("safe_constructors", new PyDictionary(new PyObject[] {}));
            frame.setlocal("pickle", new PyFunction(frame.f_globals, new PyObject[] {frame.getname("None")}, c$0_pickle));
            frame.setlocal("constructor", new PyFunction(frame.f_globals, new PyObject[] {}, c$1_constructor));
            t$0$boolean = true;
            try {
                frame.getname("complex");
            }
            catch (Throwable x$0) {
                t$0$boolean = false;
                t$0$PyException = Py.setException(x$0, frame);
                if (Py.matchException(t$0$PyException, frame.getname("NameError"))) {
                    // pass
                }
                else throw t$0$PyException;
            }
            if (t$0$boolean) {
                frame.setlocal("pickle_complex", new PyFunction(frame.f_globals, new PyObject[] {}, c$2_pickle_complex));
                frame.getname("pickle").__call__(frame.getname("complex"), frame.getname("pickle_complex"), frame.getname("complex"));
            }
            frame.setlocal("_reconstructor", new PyFunction(frame.f_globals, new PyObject[] {}, c$3__reconstructor));
            frame.getname("_reconstructor").__setattr__("__safe_for_unpickling__", i$6);
            frame.setlocal("_HEAPTYPE", i$6._lshift(i$7));
            frame.setlocal("_reduce", new PyFunction(frame.f_globals, new PyObject[] {}, c$4__reduce));
            return Py.None;
        }
        
    }
    public static void moduleDictInit(PyObject dict) {
        dict.__setitem__("__name__", new PyString("copy_reg"));
        Py.runCode(new _PyInner().getMain(), dict, dict);
    }
    
    public static void main(String[] args) throws java.lang.Exception {
        String[] newargs = new String[args.length+1];
        newargs[0] = "copy_reg";
        java.lang.System.arraycopy(args, 0, newargs, 1, args.length);
        Py.runMain(copy_reg._PyInner.class, newargs, copy_reg.jpy$packages, copy_reg.jpy$mainProperties, "", new String[] {"string", "random", "traceback", "sre_compile", "atexit", "warnings", "popen2", "getopt", "sre", "sre_constants", "StringIO", "QAsystem", "javaos", "repr", "copy_reg", "re", "linecache", "javapath", "UserDict", "copy", "threading", "stat", "sre_parse", "javashell"});
    }
    
}

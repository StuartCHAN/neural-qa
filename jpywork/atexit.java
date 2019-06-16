import org.python.core.*;

public class atexit extends java.lang.Object {
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
        private static PyObject i$9;
        private static PyObject i$10;
        private static PyObject s$11;
        private static PyObject s$12;
        private static PyObject s$13;
        private static PyFunctionTable funcTable;
        private static PyCode c$0__run_exitfuncs;
        private static PyCode c$1_register;
        private static PyCode c$2_x1;
        private static PyCode c$3_x2;
        private static PyCode c$4_x3;
        private static PyCode c$5_main;
        private static void initConstants() {
            s$0 = Py.newString("\012atexit.py - allow programmer to define multiple exit functions to be executed\012upon normal program termination.\012\012One public function, register, is defined.\012");
            s$1 = Py.newString("register");
            s$2 = Py.newString("run any registered exit functions\012\012    _exithandlers is traversed in reverse order so functions are executed\012    last in, first out.\012    ");
            s$3 = Py.newString("register a function to be executed upon normal program termination\012\012    func - function to be called at exit\012    targs - optional arguments to pass to func\012    kargs - optional keyword arguments to pass to func\012    ");
            s$4 = Py.newString("exitfunc");
            s$5 = Py.newString("__main__");
            s$6 = Py.newString("running x1");
            s$7 = Py.newString("running x2(%s)");
            s$8 = Py.newString("running x3(%s, kwd=%s)");
            i$9 = Py.newInteger(12);
            i$10 = Py.newInteger(5);
            s$11 = Py.newString("bar");
            s$12 = Py.newString("no kwd args");
            s$13 = Py.newString("F:\\Java\\Jython\\jython2.2.1\\Lib\\atexit.py");
            funcTable = new _PyInner();
            c$0__run_exitfuncs = Py.newCode(0, new String[] {"targs", "func", "kargs"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\atexit.py", "_run_exitfuncs", false, false, funcTable, 0, null, null, 0, 17);
            c$1_register = Py.newCode(3, new String[] {"func", "targs", "kargs"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\atexit.py", "register", true, true, funcTable, 1, null, null, 0, 17);
            c$2_x1 = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\atexit.py", "x1", false, false, funcTable, 2, null, null, 0, 17);
            c$3_x2 = Py.newCode(1, new String[] {"n"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\atexit.py", "x2", false, false, funcTable, 3, null, null, 0, 17);
            c$4_x3 = Py.newCode(2, new String[] {"n", "kwd"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\atexit.py", "x3", false, false, funcTable, 4, null, null, 0, 17);
            c$5_main = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\atexit.py", "main", false, false, funcTable, 5, null, null, 0, 16);
        }
        
        
        public PyCode getMain() {
            if (c$5_main == null) _PyInner.initConstants();
            return c$5_main;
        }
        
        public PyObject call_function(int index, PyFrame frame) {
            switch (index){
                case 0:
                return _PyInner._run_exitfuncs$1(frame);
                case 1:
                return _PyInner.register$2(frame);
                case 2:
                return _PyInner.x1$3(frame);
                case 3:
                return _PyInner.x2$4(frame);
                case 4:
                return _PyInner.x3$5(frame);
                case 5:
                return _PyInner.main$6(frame);
                default:
                return null;
            }
        }
        
        private static PyObject _run_exitfuncs$1(PyFrame frame) {
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            
            // Code
            /* run any registered exit functions
            
                _exithandlers is traversed in reverse order so functions are executed
                last in, first out.
                 */
            while (frame.getglobal("_exithandlers").__nonzero__()) {
                t$0$PyObject__ = org.python.core.Py.unpackSequence(frame.getglobal("_exithandlers").invoke("pop"), 3);
                frame.setlocal(1, t$0$PyObject__[0]);
                frame.setlocal(0, t$0$PyObject__[1]);
                frame.setlocal(2, t$0$PyObject__[2]);
                frame.getglobal("apply").__call__(frame.getlocal(1), frame.getlocal(0), frame.getlocal(2));
            }
            return Py.None;
        }
        
        private static PyObject register$2(PyFrame frame) {
            /* register a function to be executed upon normal program termination
            
                func - function to be called at exit
                targs - optional arguments to pass to func
                kargs - optional keyword arguments to pass to func
                 */
            frame.getglobal("_exithandlers").invoke("append", new PyTuple(new PyObject[] {frame.getlocal(0), frame.getlocal(1), frame.getlocal(2)}));
            return Py.None;
        }
        
        private static PyObject x1$3(PyFrame frame) {
            Py.println(Py.None, s$6);
            return Py.None;
        }
        
        private static PyObject x2$4(PyFrame frame) {
            Py.println(Py.None, s$7._mod(frame.getlocal(0).__repr__()));
            return Py.None;
        }
        
        private static PyObject x3$5(PyFrame frame) {
            Py.println(Py.None, s$8._mod(new PyTuple(new PyObject[] {frame.getlocal(0).__repr__(), frame.getlocal(1).__repr__()})));
            return Py.None;
        }
        
        private static PyObject main$6(PyFrame frame) {
            frame.setglobal("__file__", s$13);
            
            /* 
            atexit.py - allow programmer to define multiple exit functions to be executed
            upon normal program termination.
            
            One public function, register, is defined.
             */
            frame.setlocal("__all__", new PyList(new PyObject[] {s$1}));
            frame.setlocal("_exithandlers", new PyList(new PyObject[] {}));
            frame.setlocal("_run_exitfuncs", new PyFunction(frame.f_globals, new PyObject[] {}, c$0__run_exitfuncs));
            frame.setlocal("register", new PyFunction(frame.f_globals, new PyObject[] {}, c$1_register));
            frame.setlocal("sys", org.python.core.imp.importOne("sys", frame));
            if (frame.getname("hasattr").__call__(frame.getname("sys"), s$4).__nonzero__()) {
                frame.getname("register").__call__(frame.getname("sys").__getattr__("exitfunc"));
            }
            frame.getname("sys").__setattr__("exitfunc", frame.getname("_run_exitfuncs"));
            frame.dellocal("sys");
            if (frame.getname("__name__")._eq(s$5).__nonzero__()) {
                frame.setlocal("x1", new PyFunction(frame.f_globals, new PyObject[] {}, c$2_x1));
                frame.setlocal("x2", new PyFunction(frame.f_globals, new PyObject[] {}, c$3_x2));
                frame.setlocal("x3", new PyFunction(frame.f_globals, new PyObject[] {frame.getname("None")}, c$4_x3));
                frame.getname("register").__call__(frame.getname("x1"));
                frame.getname("register").__call__(frame.getname("x2"), i$9);
                frame.getname("register").__call__(frame.getname("x3"), i$10, s$11);
                frame.getname("register").__call__(frame.getname("x3"), s$12);
            }
            return Py.None;
        }
        
    }
    public static void moduleDictInit(PyObject dict) {
        dict.__setitem__("__name__", new PyString("atexit"));
        Py.runCode(new _PyInner().getMain(), dict, dict);
    }
    
    public static void main(String[] args) throws java.lang.Exception {
        String[] newargs = new String[args.length+1];
        newargs[0] = "atexit";
        java.lang.System.arraycopy(args, 0, newargs, 1, args.length);
        Py.runMain(atexit._PyInner.class, newargs, atexit.jpy$packages, atexit.jpy$mainProperties, "", new String[] {"string", "random", "traceback", "sre_compile", "atexit", "warnings", "popen2", "getopt", "sre", "sre_constants", "StringIO", "QAsystem", "javaos", "repr", "copy_reg", "re", "linecache", "javapath", "UserDict", "copy", "threading", "stat", "sre_parse", "javashell"});
    }
    
}

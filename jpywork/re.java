import org.python.core.*;

public class re extends java.lang.Object {
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
        private static PyFunctionTable funcTable;
        private static PyCode c$0_main;
        private static void initConstants() {
            s$0 = Py.newString("match");
            s$1 = Py.newString("search");
            s$2 = Py.newString("sub");
            s$3 = Py.newString("subn");
            s$4 = Py.newString("split");
            s$5 = Py.newString("findall");
            s$6 = Py.newString("compile");
            s$7 = Py.newString("purge");
            s$8 = Py.newString("template");
            s$9 = Py.newString("escape");
            s$10 = Py.newString("I");
            s$11 = Py.newString("L");
            s$12 = Py.newString("M");
            s$13 = Py.newString("S");
            s$14 = Py.newString("X");
            s$15 = Py.newString("U");
            s$16 = Py.newString("IGNORECASE");
            s$17 = Py.newString("LOCALE");
            s$18 = Py.newString("MULTILINE");
            s$19 = Py.newString("DOTALL");
            s$20 = Py.newString("VERBOSE");
            s$21 = Py.newString("UNICODE");
            s$22 = Py.newString("error");
            s$23 = Py.newString("re");
            s$24 = Py.newString("F:\\Java\\Jython\\jython2.2.1\\Lib\\re.py");
            funcTable = new _PyInner();
            c$0_main = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\re.py", "main", false, false, funcTable, 0, null, null, 0, 16);
        }
        
        
        public PyCode getMain() {
            if (c$0_main == null) _PyInner.initConstants();
            return c$0_main;
        }
        
        public PyObject call_function(int index, PyFrame frame) {
            switch (index){
                case 0:
                return _PyInner.main$1(frame);
                default:
                return null;
            }
        }
        
        private static PyObject main$1(PyFrame frame) {
            frame.setglobal("__file__", s$24);
            
            // Temporary Variables
            PyObject t$0$PyObject, t$1$PyObject;
            
            // Code
            frame.setlocal("__all__", new PyList(new PyObject[] {s$0, s$1, s$2, s$3, s$4, s$5, s$6, s$7, s$8, s$9, s$10, s$11, s$12, s$13, s$14, s$15, s$16, s$17, s$18, s$19, s$20, s$21, s$22}));
            frame.setlocal("sre", org.python.core.imp.importOne("sre", frame));
            frame.setlocal("sys", org.python.core.imp.importOne("sys", frame));
            frame.setlocal("module", frame.getname("sys").__getattr__("modules").__getitem__(s$23));
            t$0$PyObject = frame.getname("__all__").__iter__();
            while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                frame.setlocal("name", t$1$PyObject);
                frame.getname("setattr").__call__(frame.getname("module"), frame.getname("name"), frame.getname("getattr").__call__(frame.getname("sre"), frame.getname("name")));
            }
            return Py.None;
        }
        
    }
    public static void moduleDictInit(PyObject dict) {
        dict.__setitem__("__name__", new PyString("re"));
        Py.runCode(new _PyInner().getMain(), dict, dict);
    }
    
    public static void main(String[] args) throws java.lang.Exception {
        String[] newargs = new String[args.length+1];
        newargs[0] = "re";
        java.lang.System.arraycopy(args, 0, newargs, 1, args.length);
        Py.runMain(re._PyInner.class, newargs, re.jpy$packages, re.jpy$mainProperties, "", new String[] {"string", "random", "traceback", "sre_compile", "atexit", "warnings", "popen2", "getopt", "sre", "sre_constants", "StringIO", "QAsystem", "javaos", "repr", "copy_reg", "re", "linecache", "javapath", "UserDict", "copy", "threading", "stat", "sre_parse", "javashell"});
    }
    
}

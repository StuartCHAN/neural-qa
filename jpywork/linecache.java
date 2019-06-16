import org.python.core.*;

public class linecache extends java.lang.Object {
    static String[] jpy$mainProperties = new String[] {"python.modules.builtin", "exceptions:org.python.core.exceptions"};
    static String[] jpy$proxyProperties = new String[] {"python.modules.builtin", "exceptions:org.python.core.exceptions", "python.options.showJavaExceptions", "true"};
    static String[] jpy$packages = new String[] {"org.python.core", null, "java.lang", null, "java.io", null, "java.util", null};
    
    public static class _PyInner extends PyFunctionTable implements PyRunnable {
        private static PyObject s$0;
        private static PyObject s$1;
        private static PyObject s$2;
        private static PyObject s$3;
        private static PyObject i$4;
        private static PyObject s$5;
        private static PyObject s$6;
        private static PyObject s$7;
        private static PyObject i$8;
        private static PyObject s$9;
        private static PyObject s$10;
        private static PyObject i$11;
        private static PyObject s$12;
        private static PyObject s$13;
        private static PyObject s$14;
        private static PyFunctionTable funcTable;
        private static PyCode c$0_getline;
        private static PyCode c$1_clearcache;
        private static PyCode c$2_getlines;
        private static PyCode c$3_checkcache;
        private static PyCode c$4_updatecache;
        private static PyCode c$5_main;
        private static void initConstants() {
            s$0 = Py.newString("Cache lines from files.\012\012This is intended to read lines from modules imported -- hence if a filename\012is not found, it will look down the module search path for a file by\012that name.\012");
            s$1 = Py.newString("getline");
            s$2 = Py.newString("clearcache");
            s$3 = Py.newString("checkcache");
            i$4 = Py.newInteger(1);
            s$5 = Py.newString("");
            s$6 = Py.newString("Clear the cache entirely.");
            s$7 = Py.newString("Get the lines for a file from the cache.\012    Update the cache if it doesn't contain an entry for this file already.");
            i$8 = Py.newInteger(2);
            s$9 = Py.newString("Discard cache entries that are out of date.\012    (This is not checked upon each call!)");
            s$10 = Py.newString("Update a cache entry and return its list of lines.\012    If something's wrong, print a message, discard the cache entry,\012    and return an empty list.");
            i$11 = Py.newInteger(0);
            s$12 = Py.newString("<>");
            s$13 = Py.newString("r");
            s$14 = Py.newString("F:\\Java\\Jython\\jython2.2.1\\Lib\\linecache.py");
            funcTable = new _PyInner();
            c$0_getline = Py.newCode(2, new String[] {"filename", "lineno", "lines"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\linecache.py", "getline", false, false, funcTable, 0, null, null, 0, 17);
            c$1_clearcache = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\linecache.py", "clearcache", false, false, funcTable, 1, null, null, 0, 17);
            c$2_getlines = Py.newCode(1, new String[] {"filename"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\linecache.py", "getlines", false, false, funcTable, 2, null, null, 0, 17);
            c$3_checkcache = Py.newCode(0, new String[] {"filename", "stat", "mtime", "fullname", "size", "lines"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\linecache.py", "checkcache", false, false, funcTable, 3, null, null, 0, 17);
            c$4_updatecache = Py.newCode(1, new String[] {"filename", "lines", "basename", "dirname", "msg", "fp", "mtime", "size", "fullname", "stat"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\linecache.py", "updatecache", false, false, funcTable, 4, null, null, 0, 17);
            c$5_main = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\linecache.py", "main", false, false, funcTable, 5, null, null, 0, 16);
        }
        
        
        public PyCode getMain() {
            if (c$5_main == null) _PyInner.initConstants();
            return c$5_main;
        }
        
        public PyObject call_function(int index, PyFrame frame) {
            switch (index){
                case 0:
                return _PyInner.getline$1(frame);
                case 1:
                return _PyInner.clearcache$2(frame);
                case 2:
                return _PyInner.getlines$3(frame);
                case 3:
                return _PyInner.checkcache$4(frame);
                case 4:
                return _PyInner.updatecache$5(frame);
                case 5:
                return _PyInner.main$6(frame);
                default:
                return null;
            }
        }
        
        private static PyObject getline$1(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject;
            
            // Code
            frame.setlocal(2, frame.getglobal("getlines").__call__(frame.getlocal(0)));
            if ((i$4._le(t$0$PyObject = frame.getlocal(1)).__nonzero__() ? t$0$PyObject._le(frame.getglobal("len").__call__(frame.getlocal(2))) : Py.Zero).__nonzero__()) {
                return frame.getlocal(2).__getitem__(frame.getlocal(1)._sub(i$4));
            }
            else {
                return s$5;
            }
        }
        
        private static PyObject clearcache$2(PyFrame frame) {
            /* Clear the cache entirely. */
            // global cache
            frame.setglobal("cache", new PyDictionary(new PyObject[] {}));
            return Py.None;
        }
        
        private static PyObject getlines$3(PyFrame frame) {
            /* Get the lines for a file from the cache.
                Update the cache if it doesn't contain an entry for this file already. */
            if (frame.getglobal("cache").invoke("has_key", frame.getlocal(0)).__nonzero__()) {
                return frame.getglobal("cache").__getitem__(frame.getlocal(0)).__getitem__(i$8);
            }
            else {
                return frame.getglobal("updatecache").__call__(frame.getlocal(0));
            }
        }
        
        private static PyObject checkcache$4(PyFrame frame) {
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            PyException t$0$PyException;
            PyObject t$0$PyObject, t$1$PyObject, t$2$PyObject;
            
            // Code
            /* Discard cache entries that are out of date.
                (This is not checked upon each call!) */
            t$0$PyObject = frame.getglobal("cache").invoke("keys").__iter__();
            while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                frame.setlocal(0, t$1$PyObject);
                t$0$PyObject__ = org.python.core.Py.unpackSequence(frame.getglobal("cache").__getitem__(frame.getlocal(0)), 4);
                frame.setlocal(4, t$0$PyObject__[0]);
                frame.setlocal(2, t$0$PyObject__[1]);
                frame.setlocal(5, t$0$PyObject__[2]);
                frame.setlocal(3, t$0$PyObject__[3]);
                try {
                    frame.setlocal(1, frame.getglobal("os").__getattr__("stat").__call__(frame.getlocal(3)));
                }
                catch (Throwable x$0) {
                    t$0$PyException = Py.setException(x$0, frame);
                    if (Py.matchException(t$0$PyException, frame.getglobal("os").__getattr__("error"))) {
                        frame.getglobal("cache").__delitem__(frame.getlocal(0));
                        continue;
                    }
                    else throw t$0$PyException;
                }
                if (((t$2$PyObject = frame.getlocal(4)._ne(frame.getlocal(1).__getitem__(frame.getglobal("ST_SIZE")))).__nonzero__() ? t$2$PyObject : frame.getlocal(2)._ne(frame.getlocal(1).__getitem__(frame.getglobal("ST_MTIME")))).__nonzero__()) {
                    frame.getglobal("cache").__delitem__(frame.getlocal(0));
                }
            }
            return Py.None;
        }
        
        private static PyObject updatecache$5(PyFrame frame) {
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            boolean t$0$boolean;
            PyException t$0$PyException, t$1$PyException;
            PyObject t$0$PyObject, t$1$PyObject;
            
            // Code
            /* Update a cache entry and return its list of lines.
                If something's wrong, print a message, discard the cache entry,
                and return an empty list. */
            if (frame.getglobal("cache").invoke("has_key", frame.getlocal(0)).__nonzero__()) {
                frame.getglobal("cache").__delitem__(frame.getlocal(0));
            }
            if (((t$0$PyObject = frame.getlocal(0).__not__()).__nonzero__() ? t$0$PyObject : frame.getlocal(0).__getitem__(i$11)._add(frame.getlocal(0).__getitem__(i$4.__neg__()))._eq(s$12)).__nonzero__()) {
                return new PyList(new PyObject[] {});
            }
            frame.setlocal(8, frame.getlocal(0));
            try {
                frame.setlocal(9, frame.getglobal("os").__getattr__("stat").__call__(frame.getlocal(8)));
            }
            catch (Throwable x$0) {
                t$0$PyException = Py.setException(x$0, frame);
                if (Py.matchException(t$0$PyException, frame.getglobal("os").__getattr__("error"))) {
                    frame.setlocal(4, t$0$PyException.value);
                    frame.setlocal(2, frame.getglobal("os").__getattr__("path").__getattr__("split").__call__(frame.getlocal(0)).__getitem__(i$4));
                    t$0$PyObject = frame.getglobal("sys").__getattr__("path").__iter__();
                    while (t$0$boolean=(t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                        frame.setlocal(3, t$1$PyObject);
                        t$0$boolean = true;
                        try {
                            frame.setlocal(8, frame.getglobal("os").__getattr__("path").__getattr__("join").__call__(frame.getlocal(3), frame.getlocal(2)));
                        }
                        catch (Throwable x$1) {
                            t$0$boolean = false;
                            t$1$PyException = Py.setException(x$1, frame);
                            if (Py.matchException(t$1$PyException, new PyTuple(new PyObject[] {frame.getglobal("TypeError"), frame.getglobal("AttributeError")}))) {
                                // pass
                            }
                            else throw t$1$PyException;
                        }
                        if (t$0$boolean) {
                            try {
                                frame.setlocal(9, frame.getglobal("os").__getattr__("stat").__call__(frame.getlocal(8)));
                                break;
                            }
                            catch (Throwable x$2) {
                                t$1$PyException = Py.setException(x$2, frame);
                                if (Py.matchException(t$1$PyException, frame.getglobal("os").__getattr__("error"))) {
                                    // pass
                                }
                                else throw t$1$PyException;
                            }
                        }
                    }
                    if (!t$0$boolean) {
                        return new PyList(new PyObject[] {});
                    }
                }
                else throw t$0$PyException;
            }
            try {
                frame.setlocal(5, frame.getglobal("open").__call__(frame.getlocal(8), s$13));
                frame.setlocal(1, frame.getlocal(5).invoke("readlines"));
                frame.getlocal(5).invoke("close");
            }
            catch (Throwable x$3) {
                t$0$PyException = Py.setException(x$3, frame);
                if (Py.matchException(t$0$PyException, frame.getglobal("IOError"))) {
                    frame.setlocal(4, t$0$PyException.value);
                    return new PyList(new PyObject[] {});
                }
                else throw t$0$PyException;
            }
            t$0$PyObject__ = org.python.core.Py.unpackSequence(new PyTuple(new PyObject[] {frame.getlocal(9).__getitem__(frame.getglobal("ST_SIZE")), frame.getlocal(9).__getitem__(frame.getglobal("ST_MTIME"))}), 2);
            frame.setlocal(7, t$0$PyObject__[0]);
            frame.setlocal(6, t$0$PyObject__[1]);
            frame.getglobal("cache").__setitem__(frame.getlocal(0), new PyTuple(new PyObject[] {frame.getlocal(7), frame.getlocal(6), frame.getlocal(1), frame.getlocal(8)}));
            return frame.getlocal(1);
        }
        
        private static PyObject main$6(PyFrame frame) {
            frame.setglobal("__file__", s$14);
            
            /* Cache lines from files.
            
            This is intended to read lines from modules imported -- hence if a filename
            is not found, it will look down the module search path for a file by
            that name.
             */
            frame.setlocal("sys", org.python.core.imp.importOne("sys", frame));
            frame.setlocal("os", org.python.core.imp.importOne("os", frame));
            org.python.core.imp.importAll("stat", frame);
            frame.setlocal("__all__", new PyList(new PyObject[] {s$1, s$2, s$3}));
            frame.setlocal("getline", new PyFunction(frame.f_globals, new PyObject[] {}, c$0_getline));
            frame.setlocal("cache", new PyDictionary(new PyObject[] {}));
            frame.setlocal("clearcache", new PyFunction(frame.f_globals, new PyObject[] {}, c$1_clearcache));
            frame.setlocal("getlines", new PyFunction(frame.f_globals, new PyObject[] {}, c$2_getlines));
            frame.setlocal("checkcache", new PyFunction(frame.f_globals, new PyObject[] {}, c$3_checkcache));
            frame.setlocal("updatecache", new PyFunction(frame.f_globals, new PyObject[] {}, c$4_updatecache));
            return Py.None;
        }
        
    }
    public static void moduleDictInit(PyObject dict) {
        dict.__setitem__("__name__", new PyString("linecache"));
        Py.runCode(new _PyInner().getMain(), dict, dict);
    }
    
    public static void main(String[] args) throws java.lang.Exception {
        String[] newargs = new String[args.length+1];
        newargs[0] = "linecache";
        java.lang.System.arraycopy(args, 0, newargs, 1, args.length);
        Py.runMain(linecache._PyInner.class, newargs, linecache.jpy$packages, linecache.jpy$mainProperties, "", new String[] {"string", "random", "traceback", "sre_compile", "atexit", "warnings", "popen2", "getopt", "sre", "sre_constants", "StringIO", "QAsystem", "javaos", "repr", "copy_reg", "re", "linecache", "javapath", "UserDict", "copy", "threading", "stat", "sre_parse", "javashell"});
    }
    
}

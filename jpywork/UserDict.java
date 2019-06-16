import org.python.core.*;

public class UserDict extends java.lang.Object {
    static String[] jpy$mainProperties = new String[] {"python.modules.builtin", "exceptions:org.python.core.exceptions"};
    static String[] jpy$proxyProperties = new String[] {"python.modules.builtin", "exceptions:org.python.core.exceptions", "python.options.showJavaExceptions", "true"};
    static String[] jpy$packages = new String[] {"org.python.core", null, "java.lang", null, "java.io", null, "java.util", null};
    
    public static class _PyInner extends PyFunctionTable implements PyRunnable {
        private static PyObject s$0;
        private static PyObject s$1;
        private static PyFunctionTable funcTable;
        private static PyCode c$0___init__;
        private static PyCode c$1___repr__;
        private static PyCode c$2___cmp__;
        private static PyCode c$3___len__;
        private static PyCode c$4___getitem__;
        private static PyCode c$5___setitem__;
        private static PyCode c$6___delitem__;
        private static PyCode c$7_clear;
        private static PyCode c$8_copy;
        private static PyCode c$9_keys;
        private static PyCode c$10_items;
        private static PyCode c$11_iteritems;
        private static PyCode c$12_iterkeys;
        private static PyCode c$13_itervalues;
        private static PyCode c$14_values;
        private static PyCode c$15_has_key;
        private static PyCode c$16_update;
        private static PyCode c$17_get;
        private static PyCode c$18_setdefault;
        private static PyCode c$19_popitem;
        private static PyCode c$20___contains__;
        private static PyCode c$21_UserDict;
        private static PyCode c$22___iter__;
        private static PyCode c$23_IterableUserDict;
        private static PyCode c$24_main;
        private static void initConstants() {
            s$0 = Py.newString("A more or less complete user-defined wrapper around dictionary objects.");
            s$1 = Py.newString("F:\\Java\\Jython\\jython2.2.1\\Lib\\UserDict.py");
            funcTable = new _PyInner();
            c$0___init__ = Py.newCode(2, new String[] {"self", "dict"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\UserDict.py", "__init__", false, false, funcTable, 0, null, null, 0, 17);
            c$1___repr__ = Py.newCode(1, new String[] {"self"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\UserDict.py", "__repr__", false, false, funcTable, 1, null, null, 0, 17);
            c$2___cmp__ = Py.newCode(2, new String[] {"self", "dict"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\UserDict.py", "__cmp__", false, false, funcTable, 2, null, null, 0, 17);
            c$3___len__ = Py.newCode(1, new String[] {"self"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\UserDict.py", "__len__", false, false, funcTable, 3, null, null, 0, 17);
            c$4___getitem__ = Py.newCode(2, new String[] {"self", "key"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\UserDict.py", "__getitem__", false, false, funcTable, 4, null, null, 0, 17);
            c$5___setitem__ = Py.newCode(3, new String[] {"self", "key", "item"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\UserDict.py", "__setitem__", false, false, funcTable, 5, null, null, 0, 17);
            c$6___delitem__ = Py.newCode(2, new String[] {"self", "key"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\UserDict.py", "__delitem__", false, false, funcTable, 6, null, null, 0, 17);
            c$7_clear = Py.newCode(1, new String[] {"self"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\UserDict.py", "clear", false, false, funcTable, 7, null, null, 0, 17);
            c$8_copy = Py.newCode(1, new String[] {"self", "data", "c", "copy"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\UserDict.py", "copy", false, false, funcTable, 8, null, null, 0, 17);
            c$9_keys = Py.newCode(1, new String[] {"self"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\UserDict.py", "keys", false, false, funcTable, 9, null, null, 0, 17);
            c$10_items = Py.newCode(1, new String[] {"self"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\UserDict.py", "items", false, false, funcTable, 10, null, null, 0, 17);
            c$11_iteritems = Py.newCode(1, new String[] {"self"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\UserDict.py", "iteritems", false, false, funcTable, 11, null, null, 0, 17);
            c$12_iterkeys = Py.newCode(1, new String[] {"self"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\UserDict.py", "iterkeys", false, false, funcTable, 12, null, null, 0, 17);
            c$13_itervalues = Py.newCode(1, new String[] {"self"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\UserDict.py", "itervalues", false, false, funcTable, 13, null, null, 0, 17);
            c$14_values = Py.newCode(1, new String[] {"self"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\UserDict.py", "values", false, false, funcTable, 14, null, null, 0, 17);
            c$15_has_key = Py.newCode(2, new String[] {"self", "key"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\UserDict.py", "has_key", false, false, funcTable, 15, null, null, 0, 17);
            c$16_update = Py.newCode(2, new String[] {"self", "dict", "v", "k"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\UserDict.py", "update", false, false, funcTable, 16, null, null, 0, 17);
            c$17_get = Py.newCode(3, new String[] {"self", "key", "failobj"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\UserDict.py", "get", false, false, funcTable, 17, null, null, 0, 17);
            c$18_setdefault = Py.newCode(3, new String[] {"self", "key", "failobj"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\UserDict.py", "setdefault", false, false, funcTable, 18, null, null, 0, 17);
            c$19_popitem = Py.newCode(1, new String[] {"self"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\UserDict.py", "popitem", false, false, funcTable, 19, null, null, 0, 17);
            c$20___contains__ = Py.newCode(2, new String[] {"self", "key"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\UserDict.py", "__contains__", false, false, funcTable, 20, null, null, 0, 17);
            c$21_UserDict = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\UserDict.py", "UserDict", false, false, funcTable, 21, null, null, 0, 16);
            c$22___iter__ = Py.newCode(1, new String[] {"self"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\UserDict.py", "__iter__", false, false, funcTable, 22, null, null, 0, 17);
            c$23_IterableUserDict = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\UserDict.py", "IterableUserDict", false, false, funcTable, 23, null, null, 0, 16);
            c$24_main = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\UserDict.py", "main", false, false, funcTable, 24, null, null, 0, 16);
        }
        
        
        public PyCode getMain() {
            if (c$24_main == null) _PyInner.initConstants();
            return c$24_main;
        }
        
        public PyObject call_function(int index, PyFrame frame) {
            switch (index){
                case 0:
                return _PyInner.__init__$1(frame);
                case 1:
                return _PyInner.__repr__$2(frame);
                case 2:
                return _PyInner.__cmp__$3(frame);
                case 3:
                return _PyInner.__len__$4(frame);
                case 4:
                return _PyInner.__getitem__$5(frame);
                case 5:
                return _PyInner.__setitem__$6(frame);
                case 6:
                return _PyInner.__delitem__$7(frame);
                case 7:
                return _PyInner.clear$8(frame);
                case 8:
                return _PyInner.copy$9(frame);
                case 9:
                return _PyInner.keys$10(frame);
                case 10:
                return _PyInner.items$11(frame);
                case 11:
                return _PyInner.iteritems$12(frame);
                case 12:
                return _PyInner.iterkeys$13(frame);
                case 13:
                return _PyInner.itervalues$14(frame);
                case 14:
                return _PyInner.values$15(frame);
                case 15:
                return _PyInner.has_key$16(frame);
                case 16:
                return _PyInner.update$17(frame);
                case 17:
                return _PyInner.get$18(frame);
                case 18:
                return _PyInner.setdefault$19(frame);
                case 19:
                return _PyInner.popitem$20(frame);
                case 20:
                return _PyInner.__contains__$21(frame);
                case 21:
                return _PyInner.UserDict$22(frame);
                case 22:
                return _PyInner.__iter__$23(frame);
                case 23:
                return _PyInner.IterableUserDict$24(frame);
                case 24:
                return _PyInner.main$25(frame);
                default:
                return null;
            }
        }
        
        private static PyObject __init__$1(PyFrame frame) {
            frame.getlocal(0).__setattr__("data", new PyDictionary(new PyObject[] {}));
            if (frame.getlocal(1)._isnot(frame.getglobal("None")).__nonzero__()) {
                frame.getlocal(0).invoke("update", frame.getlocal(1));
            }
            return Py.None;
        }
        
        private static PyObject __repr__$2(PyFrame frame) {
            return frame.getglobal("repr").__call__(frame.getlocal(0).__getattr__("data"));
        }
        
        private static PyObject __cmp__$3(PyFrame frame) {
            if (frame.getglobal("isinstance").__call__(frame.getlocal(1), frame.getglobal("UserDict")).__nonzero__()) {
                return frame.getglobal("cmp").__call__(frame.getlocal(0).__getattr__("data"), frame.getlocal(1).__getattr__("data"));
            }
            else {
                return frame.getglobal("cmp").__call__(frame.getlocal(0).__getattr__("data"), frame.getlocal(1));
            }
        }
        
        private static PyObject __len__$4(PyFrame frame) {
            return frame.getglobal("len").__call__(frame.getlocal(0).__getattr__("data"));
        }
        
        private static PyObject __getitem__$5(PyFrame frame) {
            return frame.getlocal(0).__getattr__("data").__getitem__(frame.getlocal(1));
        }
        
        private static PyObject __setitem__$6(PyFrame frame) {
            frame.getlocal(0).__getattr__("data").__setitem__(frame.getlocal(1), frame.getlocal(2));
            return Py.None;
        }
        
        private static PyObject __delitem__$7(PyFrame frame) {
            frame.getlocal(0).__getattr__("data").__delitem__(frame.getlocal(1));
            return Py.None;
        }
        
        private static PyObject clear$8(PyFrame frame) {
            frame.getlocal(0).__getattr__("data").invoke("clear");
            return Py.None;
        }
        
        private static PyObject copy$9(PyFrame frame) {
            if (frame.getlocal(0).__getattr__("__class__")._is(frame.getglobal("UserDict")).__nonzero__()) {
                return frame.getglobal("UserDict").__call__(frame.getlocal(0).__getattr__("data"));
            }
            frame.setlocal(3, org.python.core.imp.importOne("copy", frame));
            frame.setlocal(1, frame.getlocal(0).__getattr__("data"));
            try {
                frame.getlocal(0).__setattr__("data", new PyDictionary(new PyObject[] {}));
                frame.setlocal(2, frame.getlocal(3).__getattr__("copy").__call__(frame.getlocal(0)));
            }
            finally {
                frame.getlocal(0).__setattr__("data", frame.getlocal(1));
            }
            frame.getlocal(2).invoke("update", frame.getlocal(0));
            return frame.getlocal(2);
        }
        
        private static PyObject keys$10(PyFrame frame) {
            return frame.getlocal(0).__getattr__("data").invoke("keys");
        }
        
        private static PyObject items$11(PyFrame frame) {
            return frame.getlocal(0).__getattr__("data").invoke("items");
        }
        
        private static PyObject iteritems$12(PyFrame frame) {
            return frame.getlocal(0).__getattr__("data").invoke("iteritems");
        }
        
        private static PyObject iterkeys$13(PyFrame frame) {
            return frame.getlocal(0).__getattr__("data").invoke("iterkeys");
        }
        
        private static PyObject itervalues$14(PyFrame frame) {
            return frame.getlocal(0).__getattr__("data").invoke("itervalues");
        }
        
        private static PyObject values$15(PyFrame frame) {
            return frame.getlocal(0).__getattr__("data").invoke("values");
        }
        
        private static PyObject has_key$16(PyFrame frame) {
            return frame.getlocal(0).__getattr__("data").invoke("has_key", frame.getlocal(1));
        }
        
        private static PyObject update$17(PyFrame frame) {
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            PyObject t$0$PyObject, t$1$PyObject;
            
            // Code
            if (frame.getglobal("isinstance").__call__(frame.getlocal(1), frame.getglobal("UserDict")).__nonzero__()) {
                frame.getlocal(0).__getattr__("data").invoke("update", frame.getlocal(1).__getattr__("data"));
            }
            else {
                if (frame.getglobal("isinstance").__call__(frame.getlocal(1), frame.getglobal("type").__call__(frame.getlocal(0).__getattr__("data"))).__nonzero__()) {
                    frame.getlocal(0).__getattr__("data").invoke("update", frame.getlocal(1));
                }
                else {
                    t$0$PyObject = frame.getlocal(1).invoke("items").__iter__();
                    while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                        t$0$PyObject__ = org.python.core.Py.unpackSequence(t$1$PyObject, 2);
                        frame.setlocal(3, t$0$PyObject__[0]);
                        frame.setlocal(2, t$0$PyObject__[1]);
                        frame.getlocal(0).__setitem__(frame.getlocal(3), frame.getlocal(2));
                    }
                }
            }
            return Py.None;
        }
        
        private static PyObject get$18(PyFrame frame) {
            if (frame.getlocal(0).invoke("has_key", frame.getlocal(1)).__not__().__nonzero__()) {
                return frame.getlocal(2);
            }
            return frame.getlocal(0).__getitem__(frame.getlocal(1));
        }
        
        private static PyObject setdefault$19(PyFrame frame) {
            if (frame.getlocal(0).invoke("has_key", frame.getlocal(1)).__not__().__nonzero__()) {
                frame.getlocal(0).__setitem__(frame.getlocal(1), frame.getlocal(2));
            }
            return frame.getlocal(0).__getitem__(frame.getlocal(1));
        }
        
        private static PyObject popitem$20(PyFrame frame) {
            return frame.getlocal(0).__getattr__("data").invoke("popitem");
        }
        
        private static PyObject __contains__$21(PyFrame frame) {
            return frame.getlocal(1)._in(frame.getlocal(0).__getattr__("data"));
        }
        
        private static PyObject UserDict$22(PyFrame frame) {
            frame.setlocal("__init__", new PyFunction(frame.f_globals, new PyObject[] {frame.getname("None")}, c$0___init__));
            frame.setlocal("__repr__", new PyFunction(frame.f_globals, new PyObject[] {}, c$1___repr__));
            frame.setlocal("__cmp__", new PyFunction(frame.f_globals, new PyObject[] {}, c$2___cmp__));
            frame.setlocal("__len__", new PyFunction(frame.f_globals, new PyObject[] {}, c$3___len__));
            frame.setlocal("__getitem__", new PyFunction(frame.f_globals, new PyObject[] {}, c$4___getitem__));
            frame.setlocal("__setitem__", new PyFunction(frame.f_globals, new PyObject[] {}, c$5___setitem__));
            frame.setlocal("__delitem__", new PyFunction(frame.f_globals, new PyObject[] {}, c$6___delitem__));
            frame.setlocal("clear", new PyFunction(frame.f_globals, new PyObject[] {}, c$7_clear));
            frame.setlocal("copy", new PyFunction(frame.f_globals, new PyObject[] {}, c$8_copy));
            frame.setlocal("keys", new PyFunction(frame.f_globals, new PyObject[] {}, c$9_keys));
            frame.setlocal("items", new PyFunction(frame.f_globals, new PyObject[] {}, c$10_items));
            frame.setlocal("iteritems", new PyFunction(frame.f_globals, new PyObject[] {}, c$11_iteritems));
            frame.setlocal("iterkeys", new PyFunction(frame.f_globals, new PyObject[] {}, c$12_iterkeys));
            frame.setlocal("itervalues", new PyFunction(frame.f_globals, new PyObject[] {}, c$13_itervalues));
            frame.setlocal("values", new PyFunction(frame.f_globals, new PyObject[] {}, c$14_values));
            frame.setlocal("has_key", new PyFunction(frame.f_globals, new PyObject[] {}, c$15_has_key));
            frame.setlocal("update", new PyFunction(frame.f_globals, new PyObject[] {}, c$16_update));
            frame.setlocal("get", new PyFunction(frame.f_globals, new PyObject[] {frame.getname("None")}, c$17_get));
            frame.setlocal("setdefault", new PyFunction(frame.f_globals, new PyObject[] {frame.getname("None")}, c$18_setdefault));
            frame.setlocal("popitem", new PyFunction(frame.f_globals, new PyObject[] {}, c$19_popitem));
            frame.setlocal("__contains__", new PyFunction(frame.f_globals, new PyObject[] {}, c$20___contains__));
            return frame.getf_locals();
        }
        
        private static PyObject __iter__$23(PyFrame frame) {
            return frame.getglobal("iter").__call__(frame.getlocal(0).__getattr__("data"));
        }
        
        private static PyObject IterableUserDict$24(PyFrame frame) {
            frame.setlocal("__iter__", new PyFunction(frame.f_globals, new PyObject[] {}, c$22___iter__));
            return frame.getf_locals();
        }
        
        private static PyObject main$25(PyFrame frame) {
            frame.setglobal("__file__", s$1);
            
            /* A more or less complete user-defined wrapper around dictionary objects. */
            frame.setlocal("UserDict", Py.makeClass("UserDict", new PyObject[] {}, c$21_UserDict, null));
            frame.setlocal("IterableUserDict", Py.makeClass("IterableUserDict", new PyObject[] {frame.getname("UserDict")}, c$23_IterableUserDict, null));
            return Py.None;
        }
        
    }
    public static void moduleDictInit(PyObject dict) {
        dict.__setitem__("__name__", new PyString("UserDict"));
        Py.runCode(new _PyInner().getMain(), dict, dict);
    }
    
    public static void main(String[] args) throws java.lang.Exception {
        String[] newargs = new String[args.length+1];
        newargs[0] = "UserDict";
        java.lang.System.arraycopy(args, 0, newargs, 1, args.length);
        Py.runMain(UserDict._PyInner.class, newargs, UserDict.jpy$packages, UserDict.jpy$mainProperties, "", new String[] {"string", "random", "traceback", "sre_compile", "atexit", "warnings", "popen2", "getopt", "sre", "sre_constants", "StringIO", "QAsystem", "javaos", "repr", "copy_reg", "re", "linecache", "javapath", "UserDict", "copy", "threading", "stat", "sre_parse", "javashell"});
    }
    
}

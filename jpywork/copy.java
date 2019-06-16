import org.python.core.*;

public class copy extends java.lang.Object {
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
        private static PyObject i$16;
        private static PyObject l$17;
        private static PyObject f$18;
        private static PyObject s$19;
        private static PyObject s$20;
        private static PyObject s$21;
        private static PyObject s$22;
        private static PyObject i$23;
        private static PyObject s$24;
        private static PyObject s$25;
        private static PyObject s$26;
        private static PyObject s$27;
        private static PyObject i$28;
        private static PyObject s$29;
        private static PyFunctionTable funcTable;
        private static PyCode c$0_Error;
        private static PyCode c$1_copy;
        private static PyCode c$2__copy_atomic;
        private static PyCode c$3__copy_list;
        private static PyCode c$4__copy_tuple;
        private static PyCode c$5__copy_dict;
        private static PyCode c$6__copy_inst;
        private static PyCode c$7_deepcopy;
        private static PyCode c$8__deepcopy_atomic;
        private static PyCode c$9__deepcopy_list;
        private static PyCode c$10__deepcopy_tuple;
        private static PyCode c$11__deepcopy_dict;
        private static PyCode c$12__keep_alive;
        private static PyCode c$13__deepcopy_inst;
        private static PyCode c$14__EmptyClass;
        private static PyCode c$15___del__;
        private static PyCode c$16__EmptyClassDel;
        private static PyCode c$17___init__;
        private static PyCode c$18___getstate__;
        private static PyCode c$19___setstate__;
        private static PyCode c$20___deepcopy__;
        private static PyCode c$21_C;
        private static PyCode c$22__test;
        private static PyCode c$23_main;
        private static void initConstants() {
            s$0 = Py.newString("Generic (shallow and deep) copying operations.\012\012Interface summary:\012\012        import copy\012\012        x = copy.copy(y)        # make a shallow copy of y\012        x = copy.deepcopy(y)    # make a deep copy of y\012\012For module specific errors, copy.error is raised.\012\012The difference between shallow and deep copying is only relevant for\012compound objects (objects that contain other objects, like lists or\012class instances).\012\012- A shallow copy constructs a new compound object and then (to the\012  extent possible) inserts *the same objects* into in that the\012  original contains.\012\012- A deep copy constructs a new compound object and then, recursively,\012  inserts *copies* into it of the objects found in the original.\012\012Two problems often exist with deep copy operations that don't exist\012with shallow copy operations:\012\012 a) recursive objects (compound objects that, directly or indirectly,\012    contain a reference to themselves) may cause a recursive loop\012\012 b) because deep copy copies *everything* it may copy too much, e.g.\012    administrative data structures that should be shared even between\012    copies\012\012Python's deep copy operation avoids these problems by:\012\012 a) keeping a table of objects already copied during the current\012    copying pass\012\012 b) letting user-defined classes override the copying operation or the\012    set of components copied\012\012This version does not copy types like module, class, function, method,\012nor stack trace, stack frame, nor file, socket, window, nor array, nor\012any similar types.\012\012Classes can use the same interfaces to control copying that they use\012to control pickling: they can define methods called __getinitargs__(),\012__getstate__() and __setstate__().  See the documentation for module\012\"pickle\" for information on these methods.\012");
            s$1 = Py.newString("Error");
            s$2 = Py.newString("error");
            s$3 = Py.newString("copy");
            s$4 = Py.newString("deepcopy");
            s$5 = Py.newString("Shallow copy operation on arbitrary Python objects.\012\012    See the module's __doc__ string for more info.\012    ");
            s$6 = Py.newString("un(shallow)copyable object of type %s");
            s$7 = Py.newString("__copy__");
            s$8 = Py.newString("__getinitargs__");
            s$9 = Py.newString("__del__");
            s$10 = Py.newString("__getstate__");
            s$11 = Py.newString("__setstate__");
            s$12 = Py.newString("Deep copy operation on arbitrary Python objects.\012\012    See the module's __doc__ string for more info.\012    ");
            s$13 = Py.newString("un-deep-copyable object of type %s");
            s$14 = Py.newString("Keeps a reference to the object x in the memo.\012\012    Because we remember objects by their id, we have\012    to assure that possibly temporary objects are kept\012    alive by referencing them.\012    We store a reference at the id of the memo, which should\012    normally not be used unless someone tries to deepcopy\012    the memo itself...\012    ");
            s$15 = Py.newString("__deepcopy__");
            i$16 = Py.newInteger(1);
            l$17 = Py.newLong("2");
            f$18 = Py.newFloat(3.14);
            s$19 = Py.newString("xyzzy");
            s$20 = Py.newString("abc");
            s$21 = Py.newString("ABC");
            s$22 = Py.newString("__main__");
            i$23 = Py.newInteger(0);
            s$24 = Py.newString("a");
            s$25 = Py.newString("arg");
            s$26 = Py.newString("argument sketch");
            s$27 = Py.newString("xyz");
            i$28 = Py.newInteger(2);
            s$29 = Py.newString("F:\\Java\\Jython\\jython2.2.1\\Lib\\copy.py");
            funcTable = new _PyInner();
            c$0_Error = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\copy.py", "Error", false, false, funcTable, 0, null, null, 0, 16);
            c$1_copy = Py.newCode(1, new String[] {"x", "copier", "copierfunction", "y"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\copy.py", "copy", false, false, funcTable, 1, null, null, 0, 17);
            c$2__copy_atomic = Py.newCode(1, new String[] {"x"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\copy.py", "_copy_atomic", false, false, funcTable, 2, null, null, 0, 17);
            c$3__copy_list = Py.newCode(1, new String[] {"x"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\copy.py", "_copy_list", false, false, funcTable, 3, null, null, 0, 17);
            c$4__copy_tuple = Py.newCode(1, new String[] {"x"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\copy.py", "_copy_tuple", false, false, funcTable, 4, null, null, 0, 17);
            c$5__copy_dict = Py.newCode(1, new String[] {"x"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\copy.py", "_copy_dict", false, false, funcTable, 5, null, null, 0, 17);
            c$6__copy_inst = Py.newCode(1, new String[] {"x", "args", "state", "y"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\copy.py", "_copy_inst", false, false, funcTable, 6, null, null, 0, 17);
            c$7_deepcopy = Py.newCode(2, new String[] {"x", "memo", "copier", "copierfunction", "d", "y"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\copy.py", "deepcopy", false, false, funcTable, 7, null, null, 0, 17);
            c$8__deepcopy_atomic = Py.newCode(2, new String[] {"x", "memo"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\copy.py", "_deepcopy_atomic", false, false, funcTable, 8, null, null, 0, 17);
            c$9__deepcopy_list = Py.newCode(2, new String[] {"x", "memo", "a", "y"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\copy.py", "_deepcopy_list", false, false, funcTable, 9, null, null, 0, 17);
            c$10__deepcopy_tuple = Py.newCode(2, new String[] {"x", "memo", "i", "d", "y", "a"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\copy.py", "_deepcopy_tuple", false, false, funcTable, 10, null, null, 0, 17);
            c$11__deepcopy_dict = Py.newCode(2, new String[] {"x", "memo", "key", "y"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\copy.py", "_deepcopy_dict", false, false, funcTable, 11, null, null, 0, 17);
            c$12__keep_alive = Py.newCode(2, new String[] {"x", "memo"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\copy.py", "_keep_alive", false, false, funcTable, 12, null, null, 0, 17);
            c$13__deepcopy_inst = Py.newCode(2, new String[] {"x", "memo", "state", "args", "y"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\copy.py", "_deepcopy_inst", false, false, funcTable, 13, null, null, 0, 17);
            c$14__EmptyClass = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\copy.py", "_EmptyClass", false, false, funcTable, 14, null, null, 0, 16);
            c$15___del__ = Py.newCode(1, new String[] {"self"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\copy.py", "__del__", false, false, funcTable, 15, null, null, 0, 17);
            c$16__EmptyClassDel = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\copy.py", "_EmptyClassDel", false, false, funcTable, 16, null, null, 0, 16);
            c$17___init__ = Py.newCode(2, new String[] {"self", "arg", "file", "sys"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\copy.py", "__init__", false, false, funcTable, 17, null, null, 0, 17);
            c$18___getstate__ = Py.newCode(1, new String[] {"self"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\copy.py", "__getstate__", false, false, funcTable, 18, null, null, 0, 17);
            c$19___setstate__ = Py.newCode(2, new String[] {"self", "state", "key"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\copy.py", "__setstate__", false, false, funcTable, 19, null, null, 0, 17);
            c$20___deepcopy__ = Py.newCode(2, new String[] {"self", "memo", "new"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\copy.py", "__deepcopy__", false, false, funcTable, 20, null, null, 0, 17);
            c$21_C = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\copy.py", "C", false, false, funcTable, 21, null, null, 0, 16);
            c$22__test = Py.newCode(0, new String[] {"C", "l3", "l2", "repr", "l", "l1", "c"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\copy.py", "_test", false, false, funcTable, 22, null, null, 0, 17);
            c$23_main = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\copy.py", "main", false, false, funcTable, 23, null, null, 0, 16);
        }
        
        
        public PyCode getMain() {
            if (c$23_main == null) _PyInner.initConstants();
            return c$23_main;
        }
        
        public PyObject call_function(int index, PyFrame frame) {
            switch (index){
                case 0:
                return _PyInner.Error$1(frame);
                case 1:
                return _PyInner.copy$2(frame);
                case 2:
                return _PyInner._copy_atomic$3(frame);
                case 3:
                return _PyInner._copy_list$4(frame);
                case 4:
                return _PyInner._copy_tuple$5(frame);
                case 5:
                return _PyInner._copy_dict$6(frame);
                case 6:
                return _PyInner._copy_inst$7(frame);
                case 7:
                return _PyInner.deepcopy$8(frame);
                case 8:
                return _PyInner._deepcopy_atomic$9(frame);
                case 9:
                return _PyInner._deepcopy_list$10(frame);
                case 10:
                return _PyInner._deepcopy_tuple$11(frame);
                case 11:
                return _PyInner._deepcopy_dict$12(frame);
                case 12:
                return _PyInner._keep_alive$13(frame);
                case 13:
                return _PyInner._deepcopy_inst$14(frame);
                case 14:
                return _PyInner._EmptyClass$15(frame);
                case 15:
                return _PyInner.__del__$16(frame);
                case 16:
                return _PyInner._EmptyClassDel$17(frame);
                case 17:
                return _PyInner.__init__$18(frame);
                case 18:
                return _PyInner.__getstate__$19(frame);
                case 19:
                return _PyInner.__setstate__$20(frame);
                case 20:
                return _PyInner.__deepcopy__$21(frame);
                case 21:
                return _PyInner.C$22(frame);
                case 22:
                return _PyInner._test$23(frame);
                case 23:
                return _PyInner.main$24(frame);
                default:
                return null;
            }
        }
        
        private static PyObject Error$1(PyFrame frame) {
            // pass
            return frame.getf_locals();
        }
        
        private static PyObject copy$2(PyFrame frame) {
            // Temporary Variables
            boolean t$0$boolean;
            PyException t$0$PyException, t$1$PyException;
            
            // Code
            /* Shallow copy operation on arbitrary Python objects.
            
                See the module's __doc__ string for more info.
                 */
            t$0$boolean = true;
            try {
                frame.setlocal(2, frame.getglobal("_copy_dispatch").__getitem__(frame.getglobal("type").__call__(frame.getlocal(0))));
            }
            catch (Throwable x$0) {
                t$0$boolean = false;
                t$0$PyException = Py.setException(x$0, frame);
                if (Py.matchException(t$0$PyException, frame.getglobal("KeyError"))) {
                    try {
                        frame.setlocal(1, frame.getlocal(0).__getattr__("__copy__"));
                    }
                    catch (Throwable x$1) {
                        t$1$PyException = Py.setException(x$1, frame);
                        if (Py.matchException(t$1$PyException, frame.getglobal("AttributeError"))) {
                            throw Py.makeException(frame.getglobal("error"), s$6._mod(frame.getglobal("type").__call__(frame.getlocal(0))));
                        }
                        else throw t$1$PyException;
                    }
                    frame.setlocal(3, frame.getlocal(1).__call__());
                }
                else throw t$0$PyException;
            }
            if (t$0$boolean) {
                frame.setlocal(3, frame.getlocal(2).__call__(frame.getlocal(0)));
            }
            return frame.getlocal(3);
        }
        
        private static PyObject _copy_atomic$3(PyFrame frame) {
            return frame.getlocal(0);
        }
        
        private static PyObject _copy_list$4(PyFrame frame) {
            return frame.getlocal(0).__getslice__(null, null, null);
        }
        
        private static PyObject _copy_tuple$5(PyFrame frame) {
            return frame.getlocal(0).__getslice__(null, null, null);
        }
        
        private static PyObject _copy_dict$6(PyFrame frame) {
            return frame.getlocal(0).invoke("copy");
        }
        
        private static PyObject _copy_inst$7(PyFrame frame) {
            if (frame.getglobal("hasattr").__call__(frame.getlocal(0), s$7).__nonzero__()) {
                return frame.getlocal(0).invoke("__copy__");
            }
            if (frame.getglobal("hasattr").__call__(frame.getlocal(0), s$8).__nonzero__()) {
                frame.setlocal(1, frame.getlocal(0).invoke("__getinitargs__"));
                frame.setlocal(3, frame.getglobal("apply").__call__(frame.getlocal(0).__getattr__("__class__"), frame.getlocal(1)));
            }
            else {
                if (frame.getglobal("hasattr").__call__(frame.getlocal(0).__getattr__("__class__"), s$9).__nonzero__()) {
                    frame.setlocal(3, frame.getglobal("_EmptyClassDel").__call__());
                }
                else {
                    frame.setlocal(3, frame.getglobal("_EmptyClass").__call__());
                }
                frame.getlocal(3).__setattr__("__class__", frame.getlocal(0).__getattr__("__class__"));
            }
            if (frame.getglobal("hasattr").__call__(frame.getlocal(0), s$10).__nonzero__()) {
                frame.setlocal(2, frame.getlocal(0).invoke("__getstate__"));
            }
            else {
                frame.setlocal(2, frame.getlocal(0).__getattr__("__dict__"));
            }
            if (frame.getglobal("hasattr").__call__(frame.getlocal(3), s$11).__nonzero__()) {
                frame.getlocal(3).invoke("__setstate__", frame.getlocal(2));
            }
            else {
                frame.getlocal(3).__getattr__("__dict__").invoke("update", frame.getlocal(2));
            }
            return frame.getlocal(3);
        }
        
        private static PyObject deepcopy$8(PyFrame frame) {
            // Temporary Variables
            boolean t$0$boolean;
            PyException t$0$PyException, t$1$PyException;
            
            // Code
            /* Deep copy operation on arbitrary Python objects.
            
                See the module's __doc__ string for more info.
                 */
            if (frame.getlocal(1)._is(frame.getglobal("None")).__nonzero__()) {
                frame.setlocal(1, new PyDictionary(new PyObject[] {}));
            }
            frame.setlocal(4, frame.getglobal("id").__call__(frame.getlocal(0)));
            if (frame.getlocal(1).invoke("has_key", frame.getlocal(4)).__nonzero__()) {
                return frame.getlocal(1).__getitem__(frame.getlocal(4));
            }
            t$0$boolean = true;
            try {
                frame.setlocal(3, frame.getglobal("_deepcopy_dispatch").__getitem__(frame.getglobal("type").__call__(frame.getlocal(0))));
            }
            catch (Throwable x$0) {
                t$0$boolean = false;
                t$0$PyException = Py.setException(x$0, frame);
                if (Py.matchException(t$0$PyException, frame.getglobal("KeyError"))) {
                    try {
                        frame.setlocal(2, frame.getlocal(0).__getattr__("__deepcopy__"));
                    }
                    catch (Throwable x$1) {
                        t$1$PyException = Py.setException(x$1, frame);
                        if (Py.matchException(t$1$PyException, frame.getglobal("AttributeError"))) {
                            throw Py.makeException(frame.getglobal("error"), s$13._mod(frame.getglobal("type").__call__(frame.getlocal(0))));
                        }
                        else throw t$1$PyException;
                    }
                    frame.setlocal(5, frame.getlocal(2).__call__(frame.getlocal(1)));
                }
                else throw t$0$PyException;
            }
            if (t$0$boolean) {
                frame.setlocal(5, frame.getlocal(3).__call__(frame.getlocal(0), frame.getlocal(1)));
            }
            frame.getlocal(1).__setitem__(frame.getlocal(4), frame.getlocal(5));
            return frame.getlocal(5);
        }
        
        private static PyObject _deepcopy_atomic$9(PyFrame frame) {
            return frame.getlocal(0);
        }
        
        private static PyObject _deepcopy_list$10(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject, t$1$PyObject;
            
            // Code
            frame.setlocal(3, new PyList(new PyObject[] {}));
            frame.getlocal(1).__setitem__(frame.getglobal("id").__call__(frame.getlocal(0)), frame.getlocal(3));
            t$0$PyObject = frame.getlocal(0).__iter__();
            while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                frame.setlocal(2, t$1$PyObject);
                frame.getlocal(3).invoke("append", frame.getglobal("deepcopy").__call__(frame.getlocal(2), frame.getlocal(1)));
            }
            return frame.getlocal(3);
        }
        
        private static PyObject _deepcopy_tuple$11(PyFrame frame) {
            // Temporary Variables
            boolean t$0$boolean;
            PyException t$0$PyException;
            PyObject t$0$PyObject, t$1$PyObject, t$2$PyObject, t$3$PyObject;
            
            // Code
            frame.setlocal(4, new PyList(new PyObject[] {}));
            t$0$PyObject = frame.getlocal(0).__iter__();
            while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                frame.setlocal(5, t$1$PyObject);
                frame.getlocal(4).invoke("append", frame.getglobal("deepcopy").__call__(frame.getlocal(5), frame.getlocal(1)));
            }
            frame.setlocal(3, frame.getglobal("id").__call__(frame.getlocal(0)));
            try {
                return frame.getlocal(1).__getitem__(frame.getlocal(3));
            }
            catch (Throwable x$0) {
                t$0$PyException = Py.setException(x$0, frame);
                if (Py.matchException(t$0$PyException, frame.getglobal("KeyError"))) {
                    // pass
                }
                else throw t$0$PyException;
            }
            t$2$PyObject = frame.getglobal("range").__call__(frame.getglobal("len").__call__(frame.getlocal(0))).__iter__();
            while (t$0$boolean=(t$3$PyObject = t$2$PyObject.__iternext__()) != null) {
                frame.setlocal(2, t$3$PyObject);
                if (frame.getlocal(0).__getitem__(frame.getlocal(2))._isnot(frame.getlocal(4).__getitem__(frame.getlocal(2))).__nonzero__()) {
                    frame.setlocal(4, frame.getglobal("tuple").__call__(frame.getlocal(4)));
                    break;
                }
            }
            if (!t$0$boolean) {
                frame.setlocal(4, frame.getlocal(0));
            }
            frame.getlocal(1).__setitem__(frame.getlocal(3), frame.getlocal(4));
            return frame.getlocal(4);
        }
        
        private static PyObject _deepcopy_dict$12(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject, t$1$PyObject;
            
            // Code
            frame.setlocal(3, new PyDictionary(new PyObject[] {}));
            frame.getlocal(1).__setitem__(frame.getglobal("id").__call__(frame.getlocal(0)), frame.getlocal(3));
            t$0$PyObject = frame.getlocal(0).invoke("keys").__iter__();
            while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                frame.setlocal(2, t$1$PyObject);
                frame.getlocal(3).__setitem__(frame.getglobal("deepcopy").__call__(frame.getlocal(2), frame.getlocal(1)), frame.getglobal("deepcopy").__call__(frame.getlocal(0).__getitem__(frame.getlocal(2)), frame.getlocal(1)));
            }
            return frame.getlocal(3);
        }
        
        private static PyObject _keep_alive$13(PyFrame frame) {
            // Temporary Variables
            PyException t$0$PyException;
            
            // Code
            /* Keeps a reference to the object x in the memo.
            
                Because we remember objects by their id, we have
                to assure that possibly temporary objects are kept
                alive by referencing them.
                We store a reference at the id of the memo, which should
                normally not be used unless someone tries to deepcopy
                the memo itself...
                 */
            try {
                frame.getlocal(1).__getitem__(frame.getglobal("id").__call__(frame.getlocal(1))).invoke("append", frame.getlocal(0));
            }
            catch (Throwable x$0) {
                t$0$PyException = Py.setException(x$0, frame);
                if (Py.matchException(t$0$PyException, frame.getglobal("KeyError"))) {
                    frame.getlocal(1).__setitem__(frame.getglobal("id").__call__(frame.getlocal(1)), new PyList(new PyObject[] {frame.getlocal(0)}));
                }
                else throw t$0$PyException;
            }
            return Py.None;
        }
        
        private static PyObject _deepcopy_inst$14(PyFrame frame) {
            if (frame.getglobal("hasattr").__call__(frame.getlocal(0), s$15).__nonzero__()) {
                return frame.getlocal(0).invoke("__deepcopy__", frame.getlocal(1));
            }
            if (frame.getglobal("hasattr").__call__(frame.getlocal(0), s$8).__nonzero__()) {
                frame.setlocal(3, frame.getlocal(0).invoke("__getinitargs__"));
                frame.getglobal("_keep_alive").__call__(frame.getlocal(3), frame.getlocal(1));
                frame.setlocal(3, frame.getglobal("deepcopy").__call__(frame.getlocal(3), frame.getlocal(1)));
                frame.setlocal(4, frame.getglobal("apply").__call__(frame.getlocal(0).__getattr__("__class__"), frame.getlocal(3)));
            }
            else {
                if (frame.getglobal("hasattr").__call__(frame.getlocal(0).__getattr__("__class__"), s$9).__nonzero__()) {
                    frame.setlocal(4, frame.getglobal("_EmptyClassDel").__call__());
                }
                else {
                    frame.setlocal(4, frame.getglobal("_EmptyClass").__call__());
                }
                frame.getlocal(4).__setattr__("__class__", frame.getlocal(0).__getattr__("__class__"));
            }
            frame.getlocal(1).__setitem__(frame.getglobal("id").__call__(frame.getlocal(0)), frame.getlocal(4));
            if (frame.getglobal("hasattr").__call__(frame.getlocal(0), s$10).__nonzero__()) {
                frame.setlocal(2, frame.getlocal(0).invoke("__getstate__"));
                frame.getglobal("_keep_alive").__call__(frame.getlocal(2), frame.getlocal(1));
            }
            else {
                frame.setlocal(2, frame.getlocal(0).__getattr__("__dict__"));
            }
            frame.setlocal(2, frame.getglobal("deepcopy").__call__(frame.getlocal(2), frame.getlocal(1)));
            if (frame.getglobal("hasattr").__call__(frame.getlocal(4), s$11).__nonzero__()) {
                frame.getlocal(4).invoke("__setstate__", frame.getlocal(2));
            }
            else {
                frame.getlocal(4).__getattr__("__dict__").invoke("update", frame.getlocal(2));
            }
            return frame.getlocal(4);
        }
        
        private static PyObject _EmptyClass$15(PyFrame frame) {
            // pass
            return frame.getf_locals();
        }
        
        private static PyObject __del__$16(PyFrame frame) {
            // pass
            return Py.None;
        }
        
        private static PyObject _EmptyClassDel$17(PyFrame frame) {
            frame.setlocal("__del__", new PyFunction(frame.f_globals, new PyObject[] {}, c$15___del__));
            return frame.getf_locals();
        }
        
        private static PyObject __init__$18(PyFrame frame) {
            frame.getlocal(0).__setattr__("a", i$16);
            frame.getlocal(0).__setattr__("arg", frame.getlocal(1));
            if (frame.getglobal("__name__")._eq(s$22).__nonzero__()) {
                frame.setlocal(3, org.python.core.imp.importOne("sys", frame));
                frame.setlocal(2, frame.getlocal(3).__getattr__("argv").__getitem__(i$23));
            }
            else {
                frame.setlocal(2, frame.getglobal("__file__"));
            }
            frame.getlocal(0).__setattr__("fp", frame.getglobal("open").__call__(frame.getlocal(2)));
            frame.getlocal(0).__getattr__("fp").invoke("close");
            return Py.None;
        }
        
        private static PyObject __getstate__$19(PyFrame frame) {
            return new PyDictionary(new PyObject[] {s$24, frame.getlocal(0).__getattr__("a"), s$25, frame.getlocal(0).__getattr__("arg")});
        }
        
        private static PyObject __setstate__$20(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject, t$1$PyObject;
            
            // Code
            t$0$PyObject = frame.getlocal(1).invoke("keys").__iter__();
            while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                frame.setlocal(2, t$1$PyObject);
                frame.getglobal("setattr").__call__(frame.getlocal(0), frame.getlocal(2), frame.getlocal(1).__getitem__(frame.getlocal(2)));
            }
            return Py.None;
        }
        
        private static PyObject __deepcopy__$21(PyFrame frame) {
            frame.setlocal(2, frame.getlocal(0).invoke("__class__", frame.getglobal("deepcopy").__call__(frame.getlocal(0).__getattr__("arg"), frame.getlocal(1))));
            frame.getlocal(2).__setattr__("a", frame.getlocal(0).__getattr__("a"));
            return frame.getlocal(2);
        }
        
        private static PyObject C$22(PyFrame frame) {
            frame.setlocal("__init__", new PyFunction(frame.f_globals, new PyObject[] {frame.getname("None")}, c$17___init__));
            frame.setlocal("__getstate__", new PyFunction(frame.f_globals, new PyObject[] {}, c$18___getstate__));
            frame.setlocal("__setstate__", new PyFunction(frame.f_globals, new PyObject[] {}, c$19___setstate__));
            frame.setlocal("__deepcopy__", new PyFunction(frame.f_globals, new PyObject[] {frame.getname("None")}, c$20___deepcopy__));
            return frame.getf_locals();
        }
        
        private static PyObject _test$23(PyFrame frame) {
            frame.setlocal(4, new PyList(new PyObject[] {frame.getglobal("None"), i$16, l$17, f$18, s$19, new PyTuple(new PyObject[] {i$16, l$17}), new PyList(new PyObject[] {f$18, s$20}), new PyDictionary(new PyObject[] {s$20, s$21}), new PyTuple(new PyObject[] {}), new PyList(new PyObject[] {}), new PyDictionary(new PyObject[] {})}));
            frame.setlocal(5, frame.getglobal("copy").__call__(frame.getlocal(4)));
            Py.println(Py.None, frame.getlocal(5)._eq(frame.getlocal(4)));
            frame.setlocal(5, frame.getglobal("map").__call__(frame.getglobal("copy"), frame.getlocal(4)));
            Py.println(Py.None, frame.getlocal(5)._eq(frame.getlocal(4)));
            frame.setlocal(5, frame.getglobal("deepcopy").__call__(frame.getlocal(4)));
            Py.println(Py.None, frame.getlocal(5)._eq(frame.getlocal(4)));
            frame.setlocal(0, Py.makeClass("C", new PyObject[] {}, c$21_C, null));
            frame.setlocal(6, frame.getlocal(0).__call__(s$26));
            frame.getlocal(4).invoke("append", frame.getlocal(6));
            frame.setlocal(2, frame.getglobal("copy").__call__(frame.getlocal(4)));
            Py.println(Py.None, frame.getlocal(4)._eq(frame.getlocal(2)));
            Py.println(Py.None, frame.getlocal(4));
            Py.println(Py.None, frame.getlocal(2));
            frame.setlocal(2, frame.getglobal("deepcopy").__call__(frame.getlocal(4)));
            Py.println(Py.None, frame.getlocal(4)._eq(frame.getlocal(2)));
            Py.println(Py.None, frame.getlocal(4));
            Py.println(Py.None, frame.getlocal(2));
            frame.getlocal(4).invoke("append", new PyDictionary(new PyObject[] {frame.getlocal(4).__getitem__(i$16), frame.getlocal(4), s$27, frame.getlocal(4).__getitem__(i$28)}));
            frame.setlocal(1, frame.getglobal("copy").__call__(frame.getlocal(4)));
            frame.setlocal(3, org.python.core.imp.importOne("repr", frame));
            Py.println(Py.None, frame.getglobal("map").__call__(frame.getlocal(3).__getattr__("repr"), frame.getlocal(4)));
            Py.println(Py.None, frame.getglobal("map").__call__(frame.getlocal(3).__getattr__("repr"), frame.getlocal(5)));
            Py.println(Py.None, frame.getglobal("map").__call__(frame.getlocal(3).__getattr__("repr"), frame.getlocal(2)));
            Py.println(Py.None, frame.getglobal("map").__call__(frame.getlocal(3).__getattr__("repr"), frame.getlocal(1)));
            frame.setlocal(1, frame.getglobal("deepcopy").__call__(frame.getlocal(4)));
            frame.setlocal(3, org.python.core.imp.importOne("repr", frame));
            Py.println(Py.None, frame.getglobal("map").__call__(frame.getlocal(3).__getattr__("repr"), frame.getlocal(4)));
            Py.println(Py.None, frame.getglobal("map").__call__(frame.getlocal(3).__getattr__("repr"), frame.getlocal(5)));
            Py.println(Py.None, frame.getglobal("map").__call__(frame.getlocal(3).__getattr__("repr"), frame.getlocal(2)));
            Py.println(Py.None, frame.getglobal("map").__call__(frame.getlocal(3).__getattr__("repr"), frame.getlocal(1)));
            return Py.None;
        }
        
        private static PyObject main$24(PyFrame frame) {
            frame.setglobal("__file__", s$29);
            
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            PyObject t$0$PyObject;
            PyException t$0$PyException;
            
            // Code
            /* Generic (shallow and deep) copying operations.
            
            Interface summary:
            
                    import copy
            
                    x = copy.copy(y)        # make a shallow copy of y
                    x = copy.deepcopy(y)    # make a deep copy of y
            
            For module specific errors, copy.error is raised.
            
            The difference between shallow and deep copying is only relevant for
            compound objects (objects that contain other objects, like lists or
            class instances).
            
            - A shallow copy constructs a new compound object and then (to the
              extent possible) inserts *the same objects* into in that the
              original contains.
            
            - A deep copy constructs a new compound object and then, recursively,
              inserts *copies* into it of the objects found in the original.
            
            Two problems often exist with deep copy operations that don't exist
            with shallow copy operations:
            
             a) recursive objects (compound objects that, directly or indirectly,
                contain a reference to themselves) may cause a recursive loop
            
             b) because deep copy copies *everything* it may copy too much, e.g.
                administrative data structures that should be shared even between
                copies
            
            Python's deep copy operation avoids these problems by:
            
             a) keeping a table of objects already copied during the current
                copying pass
            
             b) letting user-defined classes override the copying operation or the
                set of components copied
            
            This version does not copy types like module, class, function, method,
            nor stack trace, stack frame, nor file, socket, window, nor array, nor
            any similar types.
            
            Classes can use the same interfaces to control copying that they use
            to control pickling: they can define methods called __getinitargs__(),
            __getstate__() and __setstate__().  See the documentation for module
            "pickle" for information on these methods.
             */
            frame.setlocal("types", org.python.core.imp.importOne("types", frame));
            frame.setlocal("Error", Py.makeClass("Error", new PyObject[] {frame.getname("Exception")}, c$0_Error, null));
            frame.setlocal("error", frame.getname("Error"));
            try {
                t$0$PyObject__ = org.python.core.imp.importFrom("org.python.core", new String[] {"PyStringMap"}, frame);
                frame.setlocal("PyStringMap", t$0$PyObject__[0]);
                t$0$PyObject__ = null;
            }
            catch (Throwable x$0) {
                t$0$PyException = Py.setException(x$0, frame);
                if (Py.matchException(t$0$PyException, frame.getname("ImportError"))) {
                    frame.setlocal("PyStringMap", frame.getname("None"));
                }
                else throw t$0$PyException;
            }
            frame.setlocal("__all__", new PyList(new PyObject[] {s$1, s$2, s$3, s$4}));
            frame.setlocal("copy", new PyFunction(frame.f_globals, new PyObject[] {}, c$1_copy));
            t$0$PyObject = new PyDictionary(new PyObject[] {});
            frame.setlocal("_copy_dispatch", t$0$PyObject);
            frame.setlocal("d", t$0$PyObject);
            frame.setlocal("_copy_atomic", new PyFunction(frame.f_globals, new PyObject[] {}, c$2__copy_atomic));
            frame.getname("d").__setitem__(frame.getname("types").__getattr__("NoneType"), frame.getname("_copy_atomic"));
            frame.getname("d").__setitem__(frame.getname("types").__getattr__("IntType"), frame.getname("_copy_atomic"));
            frame.getname("d").__setitem__(frame.getname("types").__getattr__("LongType"), frame.getname("_copy_atomic"));
            frame.getname("d").__setitem__(frame.getname("types").__getattr__("FloatType"), frame.getname("_copy_atomic"));
            frame.getname("d").__setitem__(frame.getname("types").__getattr__("StringType"), frame.getname("_copy_atomic"));
            frame.getname("d").__setitem__(frame.getname("types").__getattr__("UnicodeType"), frame.getname("_copy_atomic"));
            try {
                frame.getname("d").__setitem__(frame.getname("types").__getattr__("CodeType"), frame.getname("_copy_atomic"));
            }
            catch (Throwable x$1) {
                t$0$PyException = Py.setException(x$1, frame);
                if (Py.matchException(t$0$PyException, frame.getname("AttributeError"))) {
                    // pass
                }
                else throw t$0$PyException;
            }
            frame.getname("d").__setitem__(frame.getname("types").__getattr__("TypeType"), frame.getname("_copy_atomic"));
            frame.getname("d").__setitem__(frame.getname("types").__getattr__("XRangeType"), frame.getname("_copy_atomic"));
            frame.getname("d").__setitem__(frame.getname("types").__getattr__("ClassType"), frame.getname("_copy_atomic"));
            frame.setlocal("_copy_list", new PyFunction(frame.f_globals, new PyObject[] {}, c$3__copy_list));
            frame.getname("d").__setitem__(frame.getname("types").__getattr__("ListType"), frame.getname("_copy_list"));
            frame.setlocal("_copy_tuple", new PyFunction(frame.f_globals, new PyObject[] {}, c$4__copy_tuple));
            frame.getname("d").__setitem__(frame.getname("types").__getattr__("TupleType"), frame.getname("_copy_tuple"));
            frame.setlocal("_copy_dict", new PyFunction(frame.f_globals, new PyObject[] {}, c$5__copy_dict));
            frame.getname("d").__setitem__(frame.getname("types").__getattr__("DictionaryType"), frame.getname("_copy_dict"));
            if (frame.getname("PyStringMap")._isnot(frame.getname("None")).__nonzero__()) {
                frame.getname("d").__setitem__(frame.getname("PyStringMap"), frame.getname("_copy_dict"));
            }
            frame.setlocal("_copy_inst", new PyFunction(frame.f_globals, new PyObject[] {}, c$6__copy_inst));
            frame.getname("d").__setitem__(frame.getname("types").__getattr__("InstanceType"), frame.getname("_copy_inst"));
            frame.dellocal("d");
            frame.setlocal("deepcopy", new PyFunction(frame.f_globals, new PyObject[] {frame.getname("None")}, c$7_deepcopy));
            t$0$PyObject = new PyDictionary(new PyObject[] {});
            frame.setlocal("_deepcopy_dispatch", t$0$PyObject);
            frame.setlocal("d", t$0$PyObject);
            frame.setlocal("_deepcopy_atomic", new PyFunction(frame.f_globals, new PyObject[] {}, c$8__deepcopy_atomic));
            frame.getname("d").__setitem__(frame.getname("types").__getattr__("NoneType"), frame.getname("_deepcopy_atomic"));
            frame.getname("d").__setitem__(frame.getname("types").__getattr__("IntType"), frame.getname("_deepcopy_atomic"));
            frame.getname("d").__setitem__(frame.getname("types").__getattr__("LongType"), frame.getname("_deepcopy_atomic"));
            frame.getname("d").__setitem__(frame.getname("types").__getattr__("FloatType"), frame.getname("_deepcopy_atomic"));
            frame.getname("d").__setitem__(frame.getname("types").__getattr__("StringType"), frame.getname("_deepcopy_atomic"));
            frame.getname("d").__setitem__(frame.getname("types").__getattr__("UnicodeType"), frame.getname("_deepcopy_atomic"));
            frame.getname("d").__setitem__(frame.getname("types").__getattr__("CodeType"), frame.getname("_deepcopy_atomic"));
            frame.getname("d").__setitem__(frame.getname("types").__getattr__("TypeType"), frame.getname("_deepcopy_atomic"));
            frame.getname("d").__setitem__(frame.getname("types").__getattr__("XRangeType"), frame.getname("_deepcopy_atomic"));
            frame.setlocal("_deepcopy_list", new PyFunction(frame.f_globals, new PyObject[] {}, c$9__deepcopy_list));
            frame.getname("d").__setitem__(frame.getname("types").__getattr__("ListType"), frame.getname("_deepcopy_list"));
            frame.setlocal("_deepcopy_tuple", new PyFunction(frame.f_globals, new PyObject[] {}, c$10__deepcopy_tuple));
            frame.getname("d").__setitem__(frame.getname("types").__getattr__("TupleType"), frame.getname("_deepcopy_tuple"));
            frame.setlocal("_deepcopy_dict", new PyFunction(frame.f_globals, new PyObject[] {}, c$11__deepcopy_dict));
            frame.getname("d").__setitem__(frame.getname("types").__getattr__("DictionaryType"), frame.getname("_deepcopy_dict"));
            if (frame.getname("PyStringMap")._isnot(frame.getname("None")).__nonzero__()) {
                frame.getname("d").__setitem__(frame.getname("PyStringMap"), frame.getname("_deepcopy_dict"));
            }
            frame.setlocal("_keep_alive", new PyFunction(frame.f_globals, new PyObject[] {}, c$12__keep_alive));
            frame.setlocal("_deepcopy_inst", new PyFunction(frame.f_globals, new PyObject[] {}, c$13__deepcopy_inst));
            frame.getname("d").__setitem__(frame.getname("types").__getattr__("InstanceType"), frame.getname("_deepcopy_inst"));
            frame.dellocal("d");
            frame.dellocal("types");
            frame.setlocal("_EmptyClass", Py.makeClass("_EmptyClass", new PyObject[] {}, c$14__EmptyClass, null));
            frame.setlocal("_EmptyClassDel", Py.makeClass("_EmptyClassDel", new PyObject[] {}, c$16__EmptyClassDel, null));
            frame.setlocal("_test", new PyFunction(frame.f_globals, new PyObject[] {}, c$22__test));
            if (frame.getname("__name__")._eq(s$22).__nonzero__()) {
                frame.getname("_test").__call__();
            }
            return Py.None;
        }
        
    }
    public static void moduleDictInit(PyObject dict) {
        dict.__setitem__("__name__", new PyString("copy"));
        Py.runCode(new _PyInner().getMain(), dict, dict);
    }
    
    public static void main(String[] args) throws java.lang.Exception {
        String[] newargs = new String[args.length+1];
        newargs[0] = "copy";
        java.lang.System.arraycopy(args, 0, newargs, 1, args.length);
        Py.runMain(copy._PyInner.class, newargs, copy.jpy$packages, copy.jpy$mainProperties, "", new String[] {"string", "random", "traceback", "sre_compile", "atexit", "warnings", "popen2", "getopt", "sre", "sre_constants", "StringIO", "QAsystem", "javaos", "repr", "copy_reg", "re", "linecache", "javapath", "UserDict", "copy", "threading", "stat", "sre_parse", "javashell"});
    }
    
}

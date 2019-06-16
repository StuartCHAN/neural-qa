import org.python.core.*;

public class StringIO extends java.lang.Object {
    static String[] jpy$mainProperties = new String[] {"python.modules.builtin", "exceptions:org.python.core.exceptions"};
    static String[] jpy$proxyProperties = new String[] {"python.modules.builtin", "exceptions:org.python.core.exceptions", "python.options.showJavaExceptions", "true"};
    static String[] jpy$packages = new String[] {"org.python.core", null, "java.lang", null, "java.io", null, "java.util", null};
    
    public static class _PyInner extends PyFunctionTable implements PyRunnable {
        private static PyObject s$0;
        private static PyObject i$1;
        private static PyObject s$2;
        private static PyObject s$3;
        private static PyObject i$4;
        private static PyObject s$5;
        private static PyObject s$6;
        private static PyObject i$7;
        private static PyObject s$8;
        private static PyObject i$9;
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
        private static PyFunctionTable funcTable;
        private static PyCode c$0___init__;
        private static PyCode c$1___iter__;
        private static PyCode c$2_close;
        private static PyCode c$3_isatty;
        private static PyCode c$4_seek;
        private static PyCode c$5_tell;
        private static PyCode c$6_read;
        private static PyCode c$7_readline;
        private static PyCode c$8_readlines;
        private static PyCode c$9_truncate;
        private static PyCode c$10_write;
        private static PyCode c$11_writelines;
        private static PyCode c$12_flush;
        private static PyCode c$13_getvalue;
        private static PyCode c$14_StringIO;
        private static PyCode c$15_test;
        private static PyCode c$16_main;
        private static void initConstants() {
            s$0 = Py.newString("File-like objects that read from or write to a string buffer.\012\012This implements (nearly) all stdio methods.\012\012f = StringIO()      # ready for writing\012f = StringIO(buf)   # ready for reading\012f.close()           # explicitly release resources held\012flag = f.isatty()   # always false\012pos = f.tell()      # get current position\012f.seek(pos)         # set current position\012f.seek(pos, mode)   # mode 0: absolute; 1: relative; 2: relative to EOF\012buf = f.read()      # read until EOF\012buf = f.read(n)     # read up to n bytes\012buf = f.readline()  # read until end of line ('\012') or EOF\012list = f.readlines()# list of f.readline() results until EOF\012f.truncate([size])  # truncate file at to at most size (default: current pos)\012f.write(buf)        # write at current position\012f.writelines(list)  # for line in list: f.write(line)\012f.getvalue()        # return whole file's contents as a string\012\012Notes:\012- Using a real file is often faster (but less convenient).\012- There's also a much faster implementation in C, called cStringIO, but\012  it's not subclassable.\012- fileno() is left unimplemented so that code which uses it triggers\012  an exception early.\012- Seeking far beyond EOF and then writing will insert real null\012  bytes that occupy space in the buffer.\012- There's a simple test set (see end of this file).\012");
            i$1 = Py.newInteger(22);
            s$2 = Py.newString("StringIO");
            s$3 = Py.newString("class StringIO([buffer])\012\012    When a StringIO object is created, it can be initialized to an existing\012    string by passing the string to the constructor. If no string is given,\012    the StringIO will start empty.\012\012    The StringIO object can accept either Unicode or 8-bit strings, but\012    mixing the two may take some care. If both are used, 8-bit strings that\012    cannot be interpreted as 7-bit ASCII (that use the 8th bit) will cause\012    a UnicodeError to be raised when getvalue() is called.\012    ");
            i$4 = Py.newInteger(0);
            s$5 = Py.newString("");
            s$6 = Py.newString("Free the memory buffer.");
            i$7 = Py.newInteger(1);
            s$8 = Py.newString("I/O operation on closed file");
            i$9 = Py.newInteger(2);
            s$10 = Py.newString("\012");
            s$11 = Py.newString("Negative size not allowed");
            s$12 = Py.newString("\000");
            s$13 = Py.newString("\012        Retrieve the entire contents of the \"file\" at any time before\012        the StringIO object's close() method is called.\012\012        The StringIO object can accept either Unicode or 8-bit strings,\012        but mixing the two may take some care. If both are used, 8-bit\012        strings that cannot be interpreted as 7-bit ASCII (that use the\012        8th bit) will cause a UnicodeError to be raised when getvalue()\012        is called.\012        ");
            s$14 = Py.newString("/etc/passwd");
            s$15 = Py.newString("r");
            s$16 = Py.newString("write failed");
            s$17 = Py.newString("File length =");
            s$18 = Py.newString("First line =");
            s$19 = Py.newString("Second line =");
            s$20 = Py.newString("bad result after seek back");
            s$21 = Py.newString("bad result after seek back from EOF");
            s$22 = Py.newString("Read");
            s$23 = Py.newString("more lines");
            s$24 = Py.newString("bad length");
            s$25 = Py.newString("__main__");
            s$26 = Py.newString("F:\\Java\\Jython\\jython2.2.1\\Lib\\StringIO.py");
            funcTable = new _PyInner();
            c$0___init__ = Py.newCode(2, new String[] {"self", "buf"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\StringIO.py", "__init__", false, false, funcTable, 0, null, null, 0, 17);
            c$1___iter__ = Py.newCode(1, new String[] {"self"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\StringIO.py", "__iter__", false, false, funcTable, 1, null, null, 0, 17);
            c$2_close = Py.newCode(1, new String[] {"self"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\StringIO.py", "close", false, false, funcTable, 2, null, null, 0, 17);
            c$3_isatty = Py.newCode(1, new String[] {"self"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\StringIO.py", "isatty", false, false, funcTable, 3, null, null, 0, 17);
            c$4_seek = Py.newCode(3, new String[] {"self", "pos", "mode"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\StringIO.py", "seek", false, false, funcTable, 4, null, null, 0, 17);
            c$5_tell = Py.newCode(1, new String[] {"self"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\StringIO.py", "tell", false, false, funcTable, 5, null, null, 0, 17);
            c$6_read = Py.newCode(2, new String[] {"self", "n", "r", "newpos"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\StringIO.py", "read", false, false, funcTable, 6, null, null, 0, 17);
            c$7_readline = Py.newCode(2, new String[] {"self", "length", "i", "r", "newpos"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\StringIO.py", "readline", false, false, funcTable, 7, null, null, 0, 17);
            c$8_readlines = Py.newCode(2, new String[] {"self", "sizehint", "line", "lines", "total"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\StringIO.py", "readlines", false, false, funcTable, 8, null, null, 0, 17);
            c$9_truncate = Py.newCode(2, new String[] {"self", "size"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\StringIO.py", "truncate", false, false, funcTable, 9, null, null, 0, 17);
            c$10_write = Py.newCode(2, new String[] {"self", "s", "newpos"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\StringIO.py", "write", false, false, funcTable, 10, null, null, 0, 17);
            c$11_writelines = Py.newCode(2, new String[] {"self", "list"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\StringIO.py", "writelines", false, false, funcTable, 11, null, null, 0, 17);
            c$12_flush = Py.newCode(1, new String[] {"self"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\StringIO.py", "flush", false, false, funcTable, 12, null, null, 0, 17);
            c$13_getvalue = Py.newCode(1, new String[] {"self"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\StringIO.py", "getvalue", false, false, funcTable, 13, null, null, 0, 17);
            c$14_StringIO = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\StringIO.py", "StringIO", false, false, funcTable, 14, null, null, 0, 16);
            c$15_test = Py.newCode(0, new String[] {"length", "file", "f", "list", "here", "line2", "text", "sys", "lines", "line"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\StringIO.py", "test", false, false, funcTable, 15, null, null, 0, 17);
            c$16_main = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\StringIO.py", "main", false, false, funcTable, 16, null, null, 0, 16);
        }
        
        
        public PyCode getMain() {
            if (c$16_main == null) _PyInner.initConstants();
            return c$16_main;
        }
        
        public PyObject call_function(int index, PyFrame frame) {
            switch (index){
                case 0:
                return _PyInner.__init__$1(frame);
                case 1:
                return _PyInner.__iter__$2(frame);
                case 2:
                return _PyInner.close$3(frame);
                case 3:
                return _PyInner.isatty$4(frame);
                case 4:
                return _PyInner.seek$5(frame);
                case 5:
                return _PyInner.tell$6(frame);
                case 6:
                return _PyInner.read$7(frame);
                case 7:
                return _PyInner.readline$8(frame);
                case 8:
                return _PyInner.readlines$9(frame);
                case 9:
                return _PyInner.truncate$10(frame);
                case 10:
                return _PyInner.write$11(frame);
                case 11:
                return _PyInner.writelines$12(frame);
                case 12:
                return _PyInner.flush$13(frame);
                case 13:
                return _PyInner.getvalue$14(frame);
                case 14:
                return _PyInner.StringIO$15(frame);
                case 15:
                return _PyInner.test$16(frame);
                case 16:
                return _PyInner.main$17(frame);
                default:
                return null;
            }
        }
        
        private static PyObject __init__$1(PyFrame frame) {
            if (frame.getglobal("type").__call__(frame.getlocal(1))._notin(frame.getglobal("types").__getattr__("StringTypes")).__nonzero__()) {
                frame.setlocal(1, frame.getglobal("str").__call__(frame.getlocal(1)));
            }
            frame.getlocal(0).__setattr__("buf", frame.getlocal(1));
            frame.getlocal(0).__setattr__("len", frame.getglobal("len").__call__(frame.getlocal(1)));
            frame.getlocal(0).__setattr__("buflist", new PyList(new PyObject[] {}));
            frame.getlocal(0).__setattr__("pos", i$4);
            frame.getlocal(0).__setattr__("closed", i$4);
            frame.getlocal(0).__setattr__("softspace", i$4);
            return Py.None;
        }
        
        private static PyObject __iter__$2(PyFrame frame) {
            return frame.getglobal("iter").__call__(frame.getlocal(0).__getattr__("readline"), s$5);
        }
        
        private static PyObject close$3(PyFrame frame) {
            /* Free the memory buffer. */
            if (frame.getlocal(0).__getattr__("closed").__not__().__nonzero__()) {
                frame.getlocal(0).__setattr__("closed", i$7);
                frame.getlocal(0).__delattr__("buf");
                frame.getlocal(0).__delattr__("pos");
            }
            return Py.None;
        }
        
        private static PyObject isatty$4(PyFrame frame) {
            if (frame.getlocal(0).__getattr__("closed").__nonzero__()) {
                throw Py.makeException(frame.getglobal("ValueError"), s$8);
            }
            return i$4;
        }
        
        private static PyObject seek$5(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject;
            
            // Code
            if (frame.getlocal(0).__getattr__("closed").__nonzero__()) {
                throw Py.makeException(frame.getglobal("ValueError"), s$8);
            }
            if (frame.getlocal(0).__getattr__("buflist").__nonzero__()) {
                t$0$PyObject = frame.getlocal(0);
                t$0$PyObject.__setattr__("buf", t$0$PyObject.__getattr__("buf").__iadd__(s$5.invoke("join", frame.getlocal(0).__getattr__("buflist"))));
                frame.getlocal(0).__setattr__("buflist", new PyList(new PyObject[] {}));
            }
            if (frame.getlocal(2)._eq(i$7).__nonzero__()) {
                frame.setlocal(1, frame.getlocal(1).__iadd__(frame.getlocal(0).__getattr__("pos")));
            }
            else {
                if (frame.getlocal(2)._eq(i$9).__nonzero__()) {
                    frame.setlocal(1, frame.getlocal(1).__iadd__(frame.getlocal(0).__getattr__("len")));
                }
            }
            frame.getlocal(0).__setattr__("pos", frame.getglobal("max").__call__(i$4, frame.getlocal(1)));
            return Py.None;
        }
        
        private static PyObject tell$6(PyFrame frame) {
            if (frame.getlocal(0).__getattr__("closed").__nonzero__()) {
                throw Py.makeException(frame.getglobal("ValueError"), s$8);
            }
            return frame.getlocal(0).__getattr__("pos");
        }
        
        private static PyObject read$7(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject;
            
            // Code
            if (frame.getlocal(0).__getattr__("closed").__nonzero__()) {
                throw Py.makeException(frame.getglobal("ValueError"), s$8);
            }
            if (frame.getlocal(0).__getattr__("buflist").__nonzero__()) {
                t$0$PyObject = frame.getlocal(0);
                t$0$PyObject.__setattr__("buf", t$0$PyObject.__getattr__("buf").__iadd__(s$5.invoke("join", frame.getlocal(0).__getattr__("buflist"))));
                frame.getlocal(0).__setattr__("buflist", new PyList(new PyObject[] {}));
            }
            if (frame.getlocal(1)._lt(i$4).__nonzero__()) {
                frame.setlocal(3, frame.getlocal(0).__getattr__("len"));
            }
            else {
                frame.setlocal(3, frame.getglobal("min").__call__(frame.getlocal(0).__getattr__("pos")._add(frame.getlocal(1)), frame.getlocal(0).__getattr__("len")));
            }
            frame.setlocal(2, frame.getlocal(0).__getattr__("buf").__getslice__(frame.getlocal(0).__getattr__("pos"), frame.getlocal(3), null));
            frame.getlocal(0).__setattr__("pos", frame.getlocal(3));
            return frame.getlocal(2);
        }
        
        private static PyObject readline$8(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject;
            
            // Code
            if (frame.getlocal(0).__getattr__("closed").__nonzero__()) {
                throw Py.makeException(frame.getglobal("ValueError"), s$8);
            }
            if (frame.getlocal(0).__getattr__("buflist").__nonzero__()) {
                t$0$PyObject = frame.getlocal(0);
                t$0$PyObject.__setattr__("buf", t$0$PyObject.__getattr__("buf").__iadd__(s$5.invoke("join", frame.getlocal(0).__getattr__("buflist"))));
                frame.getlocal(0).__setattr__("buflist", new PyList(new PyObject[] {}));
            }
            frame.setlocal(2, frame.getlocal(0).__getattr__("buf").invoke("find", s$10, frame.getlocal(0).__getattr__("pos")));
            if (frame.getlocal(2)._lt(i$4).__nonzero__()) {
                frame.setlocal(4, frame.getlocal(0).__getattr__("len"));
            }
            else {
                frame.setlocal(4, frame.getlocal(2)._add(i$7));
            }
            if (frame.getlocal(1)._isnot(frame.getglobal("None")).__nonzero__()) {
                if (frame.getlocal(0).__getattr__("pos")._add(frame.getlocal(1))._lt(frame.getlocal(4)).__nonzero__()) {
                    frame.setlocal(4, frame.getlocal(0).__getattr__("pos")._add(frame.getlocal(1)));
                }
            }
            frame.setlocal(3, frame.getlocal(0).__getattr__("buf").__getslice__(frame.getlocal(0).__getattr__("pos"), frame.getlocal(4), null));
            frame.getlocal(0).__setattr__("pos", frame.getlocal(4));
            return frame.getlocal(3);
        }
        
        private static PyObject readlines$9(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject;
            
            // Code
            frame.setlocal(4, i$4);
            frame.setlocal(3, new PyList(new PyObject[] {}));
            frame.setlocal(2, frame.getlocal(0).invoke("readline"));
            while (frame.getlocal(2).__nonzero__()) {
                frame.getlocal(3).invoke("append", frame.getlocal(2));
                frame.setlocal(4, frame.getlocal(4).__iadd__(frame.getglobal("len").__call__(frame.getlocal(2))));
                if ((i$4._lt(t$0$PyObject = frame.getlocal(1)).__nonzero__() ? t$0$PyObject._le(frame.getlocal(4)) : Py.Zero).__nonzero__()) {
                    break;
                }
                frame.setlocal(2, frame.getlocal(0).invoke("readline"));
            }
            return frame.getlocal(3);
        }
        
        private static PyObject truncate$10(PyFrame frame) {
            if (frame.getlocal(0).__getattr__("closed").__nonzero__()) {
                throw Py.makeException(frame.getglobal("ValueError"), s$8);
            }
            if (frame.getlocal(1)._is(frame.getglobal("None")).__nonzero__()) {
                frame.setlocal(1, frame.getlocal(0).__getattr__("pos"));
            }
            else {
                if (frame.getlocal(1)._lt(i$4).__nonzero__()) {
                    throw Py.makeException(frame.getglobal("IOError").__call__(frame.getglobal("EINVAL"), s$11));
                }
                else {
                    if (frame.getlocal(1)._lt(frame.getlocal(0).__getattr__("pos")).__nonzero__()) {
                        frame.getlocal(0).__setattr__("pos", frame.getlocal(1));
                    }
                }
            }
            frame.getlocal(0).__setattr__("buf", frame.getlocal(0).invoke("getvalue").__getslice__(null, frame.getlocal(1), null));
            return Py.None;
        }
        
        private static PyObject write$11(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject;
            
            // Code
            if (frame.getlocal(0).__getattr__("closed").__nonzero__()) {
                throw Py.makeException(frame.getglobal("ValueError"), s$8);
            }
            if (frame.getlocal(1).__not__().__nonzero__()) {
                return Py.None;
            }
            if (frame.getglobal("type").__call__(frame.getlocal(1))._notin(frame.getglobal("types").__getattr__("StringTypes")).__nonzero__()) {
                frame.setlocal(1, frame.getglobal("str").__call__(frame.getlocal(1)));
            }
            if (frame.getlocal(0).__getattr__("pos")._gt(frame.getlocal(0).__getattr__("len")).__nonzero__()) {
                frame.getlocal(0).__getattr__("buflist").invoke("append", s$12._mul(frame.getlocal(0).__getattr__("pos")._sub(frame.getlocal(0).__getattr__("len"))));
                frame.getlocal(0).__setattr__("len", frame.getlocal(0).__getattr__("pos"));
            }
            frame.setlocal(2, frame.getlocal(0).__getattr__("pos")._add(frame.getglobal("len").__call__(frame.getlocal(1))));
            if (frame.getlocal(0).__getattr__("pos")._lt(frame.getlocal(0).__getattr__("len")).__nonzero__()) {
                if (frame.getlocal(0).__getattr__("buflist").__nonzero__()) {
                    t$0$PyObject = frame.getlocal(0);
                    t$0$PyObject.__setattr__("buf", t$0$PyObject.__getattr__("buf").__iadd__(s$5.invoke("join", frame.getlocal(0).__getattr__("buflist"))));
                    frame.getlocal(0).__setattr__("buflist", new PyList(new PyObject[] {}));
                }
                frame.getlocal(0).__setattr__("buflist", new PyList(new PyObject[] {frame.getlocal(0).__getattr__("buf").__getslice__(null, frame.getlocal(0).__getattr__("pos"), null), frame.getlocal(1), frame.getlocal(0).__getattr__("buf").__getslice__(frame.getlocal(2), null, null)}));
                frame.getlocal(0).__setattr__("buf", s$5);
                if (frame.getlocal(2)._gt(frame.getlocal(0).__getattr__("len")).__nonzero__()) {
                    frame.getlocal(0).__setattr__("len", frame.getlocal(2));
                }
            }
            else {
                frame.getlocal(0).__getattr__("buflist").invoke("append", frame.getlocal(1));
                frame.getlocal(0).__setattr__("len", frame.getlocal(2));
            }
            frame.getlocal(0).__setattr__("pos", frame.getlocal(2));
            return Py.None;
        }
        
        private static PyObject writelines$12(PyFrame frame) {
            frame.getlocal(0).invoke("write", s$5.invoke("join", frame.getlocal(1)));
            return Py.None;
        }
        
        private static PyObject flush$13(PyFrame frame) {
            if (frame.getlocal(0).__getattr__("closed").__nonzero__()) {
                throw Py.makeException(frame.getglobal("ValueError"), s$8);
            }
            return Py.None;
        }
        
        private static PyObject getvalue$14(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject;
            
            // Code
            /* 
                    Retrieve the entire contents of the "file" at any time before
                    the StringIO object's close() method is called.
            
                    The StringIO object can accept either Unicode or 8-bit strings,
                    but mixing the two may take some care. If both are used, 8-bit
                    strings that cannot be interpreted as 7-bit ASCII (that use the
                    8th bit) will cause a UnicodeError to be raised when getvalue()
                    is called.
                     */
            if (frame.getlocal(0).__getattr__("buflist").__nonzero__()) {
                t$0$PyObject = frame.getlocal(0);
                t$0$PyObject.__setattr__("buf", t$0$PyObject.__getattr__("buf").__iadd__(s$5.invoke("join", frame.getlocal(0).__getattr__("buflist"))));
                frame.getlocal(0).__setattr__("buflist", new PyList(new PyObject[] {}));
            }
            return frame.getlocal(0).__getattr__("buf");
        }
        
        private static PyObject StringIO$15(PyFrame frame) {
            /* class StringIO([buffer])
            
                When a StringIO object is created, it can be initialized to an existing
                string by passing the string to the constructor. If no string is given,
                the StringIO will start empty.
            
                The StringIO object can accept either Unicode or 8-bit strings, but
                mixing the two may take some care. If both are used, 8-bit strings that
                cannot be interpreted as 7-bit ASCII (that use the 8th bit) will cause
                a UnicodeError to be raised when getvalue() is called.
                 */
            frame.setlocal("__init__", new PyFunction(frame.f_globals, new PyObject[] {s$5}, c$0___init__));
            frame.setlocal("__iter__", new PyFunction(frame.f_globals, new PyObject[] {}, c$1___iter__));
            frame.setlocal("close", new PyFunction(frame.f_globals, new PyObject[] {}, c$2_close));
            frame.setlocal("isatty", new PyFunction(frame.f_globals, new PyObject[] {}, c$3_isatty));
            frame.setlocal("seek", new PyFunction(frame.f_globals, new PyObject[] {i$4}, c$4_seek));
            frame.setlocal("tell", new PyFunction(frame.f_globals, new PyObject[] {}, c$5_tell));
            frame.setlocal("read", new PyFunction(frame.f_globals, new PyObject[] {i$7.__neg__()}, c$6_read));
            frame.setlocal("readline", new PyFunction(frame.f_globals, new PyObject[] {frame.getname("None")}, c$7_readline));
            frame.setlocal("readlines", new PyFunction(frame.f_globals, new PyObject[] {i$4}, c$8_readlines));
            frame.setlocal("truncate", new PyFunction(frame.f_globals, new PyObject[] {frame.getname("None")}, c$9_truncate));
            frame.setlocal("write", new PyFunction(frame.f_globals, new PyObject[] {}, c$10_write));
            frame.setlocal("writelines", new PyFunction(frame.f_globals, new PyObject[] {}, c$11_writelines));
            frame.setlocal("flush", new PyFunction(frame.f_globals, new PyObject[] {}, c$12_flush));
            frame.setlocal("getvalue", new PyFunction(frame.f_globals, new PyObject[] {}, c$13_getvalue));
            return frame.getf_locals();
        }
        
        private static PyObject test$16(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject, t$1$PyObject;
            
            // Code
            frame.setlocal(7, org.python.core.imp.importOne("sys", frame));
            if (frame.getlocal(7).__getattr__("argv").__getslice__(i$7, null, null).__nonzero__()) {
                frame.setlocal(1, frame.getlocal(7).__getattr__("argv").__getitem__(i$7));
            }
            else {
                frame.setlocal(1, s$14);
            }
            frame.setlocal(8, frame.getglobal("open").__call__(frame.getlocal(1), s$15).invoke("readlines"));
            frame.setlocal(6, frame.getglobal("open").__call__(frame.getlocal(1), s$15).invoke("read"));
            frame.setlocal(2, frame.getglobal("StringIO").__call__());
            t$0$PyObject = frame.getlocal(8).__getslice__(null, i$9.__neg__(), null).__iter__();
            while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                frame.setlocal(9, t$1$PyObject);
                frame.getlocal(2).invoke("write", frame.getlocal(9));
            }
            frame.getlocal(2).invoke("writelines", frame.getlocal(8).__getslice__(i$9.__neg__(), null, null));
            if (frame.getlocal(2).invoke("getvalue")._ne(frame.getlocal(6)).__nonzero__()) {
                throw Py.makeException(frame.getglobal("RuntimeError"), s$16);
            }
            frame.setlocal(0, frame.getlocal(2).invoke("tell"));
            Py.printComma(Py.None, s$17);
            Py.println(Py.None, frame.getlocal(0));
            frame.getlocal(2).invoke("seek", frame.getglobal("len").__call__(frame.getlocal(8).__getitem__(i$4)));
            frame.getlocal(2).invoke("write", frame.getlocal(8).__getitem__(i$7));
            frame.getlocal(2).invoke("seek", i$4);
            Py.printComma(Py.None, s$18);
            Py.println(Py.None, frame.getlocal(2).invoke("readline").__repr__());
            frame.setlocal(4, frame.getlocal(2).invoke("tell"));
            frame.setlocal(9, frame.getlocal(2).invoke("readline"));
            Py.printComma(Py.None, s$19);
            Py.println(Py.None, frame.getlocal(9).__repr__());
            frame.getlocal(2).invoke("seek", frame.getglobal("len").__call__(frame.getlocal(9)).__neg__(), i$7);
            frame.setlocal(5, frame.getlocal(2).invoke("read", frame.getglobal("len").__call__(frame.getlocal(9))));
            if (frame.getlocal(9)._ne(frame.getlocal(5)).__nonzero__()) {
                throw Py.makeException(frame.getglobal("RuntimeError"), s$20);
            }
            frame.getlocal(2).invoke("seek", frame.getglobal("len").__call__(frame.getlocal(5)), i$7);
            frame.setlocal(3, frame.getlocal(2).invoke("readlines"));
            frame.setlocal(9, frame.getlocal(3).__getitem__(i$7.__neg__()));
            frame.getlocal(2).invoke("seek", frame.getlocal(2).invoke("tell")._sub(frame.getglobal("len").__call__(frame.getlocal(9))));
            frame.setlocal(5, frame.getlocal(2).invoke("read"));
            if (frame.getlocal(9)._ne(frame.getlocal(5)).__nonzero__()) {
                throw Py.makeException(frame.getglobal("RuntimeError"), s$21);
            }
            Py.printComma(Py.None, s$22);
            Py.printComma(Py.None, frame.getglobal("len").__call__(frame.getlocal(3)));
            Py.println(Py.None, s$23);
            Py.printComma(Py.None, s$17);
            Py.println(Py.None, frame.getlocal(2).invoke("tell"));
            if (frame.getlocal(2).invoke("tell")._ne(frame.getlocal(0)).__nonzero__()) {
                throw Py.makeException(frame.getglobal("RuntimeError"), s$24);
            }
            frame.getlocal(2).invoke("close");
            return Py.None;
        }
        
        private static PyObject main$17(PyFrame frame) {
            frame.setglobal("__file__", s$26);
            
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            PyException t$0$PyException;
            
            // Code
            /* File-like objects that read from or write to a string buffer.
            
            This implements (nearly) all stdio methods.
            
            f = StringIO()      # ready for writing
            f = StringIO(buf)   # ready for reading
            f.close()           # explicitly release resources held
            flag = f.isatty()   # always false
            pos = f.tell()      # get current position
            f.seek(pos)         # set current position
            f.seek(pos, mode)   # mode 0: absolute; 1: relative; 2: relative to EOF
            buf = f.read()      # read until EOF
            buf = f.read(n)     # read up to n bytes
            buf = f.readline()  # read until end of line ('
            ') or EOF
            list = f.readlines()# list of f.readline() results until EOF
            f.truncate([size])  # truncate file at to at most size (default: current pos)
            f.write(buf)        # write at current position
            f.writelines(list)  # for line in list: f.write(line)
            f.getvalue()        # return whole file's contents as a string
            
            Notes:
            - Using a real file is often faster (but less convenient).
            - There's also a much faster implementation in C, called cStringIO, but
              it's not subclassable.
            - fileno() is left unimplemented so that code which uses it triggers
              an exception early.
            - Seeking far beyond EOF and then writing will insert real null
              bytes that occupy space in the buffer.
            - There's a simple test set (see end of this file).
             */
            frame.setlocal("types", org.python.core.imp.importOne("types", frame));
            try {
                t$0$PyObject__ = org.python.core.imp.importFrom("errno", new String[] {"EINVAL"}, frame);
                frame.setlocal("EINVAL", t$0$PyObject__[0]);
                t$0$PyObject__ = null;
            }
            catch (Throwable x$0) {
                t$0$PyException = Py.setException(x$0, frame);
                if (Py.matchException(t$0$PyException, frame.getname("ImportError"))) {
                    frame.setlocal("EINVAL", i$1);
                }
                else throw t$0$PyException;
            }
            frame.setlocal("__all__", new PyList(new PyObject[] {s$2}));
            frame.setlocal("StringIO", Py.makeClass("StringIO", new PyObject[] {}, c$14_StringIO, null));
            frame.setlocal("test", new PyFunction(frame.f_globals, new PyObject[] {}, c$15_test));
            if (frame.getname("__name__")._eq(s$25).__nonzero__()) {
                frame.getname("test").__call__();
            }
            return Py.None;
        }
        
    }
    public static void moduleDictInit(PyObject dict) {
        dict.__setitem__("__name__", new PyString("StringIO"));
        Py.runCode(new _PyInner().getMain(), dict, dict);
    }
    
    public static void main(String[] args) throws java.lang.Exception {
        String[] newargs = new String[args.length+1];
        newargs[0] = "StringIO";
        java.lang.System.arraycopy(args, 0, newargs, 1, args.length);
        Py.runMain(StringIO._PyInner.class, newargs, StringIO.jpy$packages, StringIO.jpy$mainProperties, "", new String[] {"string", "random", "traceback", "sre_compile", "atexit", "warnings", "popen2", "getopt", "sre", "sre_constants", "StringIO", "QAsystem", "javaos", "repr", "copy_reg", "re", "linecache", "javapath", "UserDict", "copy", "threading", "stat", "sre_parse", "javashell"});
    }
    
}

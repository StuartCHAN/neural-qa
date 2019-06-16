import org.python.core.*;

public class popen2 extends java.lang.Object {
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
        private static PyObject i$10;
        private static PyObject i$11;
        private static PyObject s$12;
        private static PyObject s$13;
        private static PyObject s$14;
        private static PyObject s$15;
        private static PyObject f$16;
        private static PyObject s$17;
        private static PyObject s$18;
        private static PyObject s$19;
        private static PyObject s$20;
        private static PyObject i$21;
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
        private static PyObject s$42;
        private static PyObject s$43;
        private static PyObject s$44;
        private static PyObject s$45;
        private static PyObject s$46;
        private static PyObject s$47;
        private static PyFunctionTable funcTable;
        private static PyCode c$0___init__;
        private static PyCode c$1___getattr__;
        private static PyCode c$2___repr__;
        private static PyCode c$3_close;
        private static PyCode c$4__ProcessFile;
        private static PyCode c$5___init__;
        private static PyCode c$6__startChildWaiter;
        private static PyCode c$7_poll;
        private static PyCode c$8_wait;
        private static PyCode c$9_Popen3;
        private static PyCode c$10__makeReaderThread;
        private static PyCode c$11__readStream;
        private static PyCode c$12___init__;
        private static PyCode c$13__join;
        private static PyCode c$14__close;
        private static PyCode c$15_Popen4;
        private static PyCode c$16_popen;
        private static PyCode c$17_popen2;
        private static PyCode c$18_popen3;
        private static PyCode c$19_popen4;
        private static PyCode c$20_system;
        private static PyCode c$21__test;
        private static PyCode c$22_main;
        private static void initConstants() {
            s$0 = Py.newString("\012popen2.py\012\012Implement popen2 module functionality for Jython.\012\012Note that the popen* methods in this module follow the return value\012ordering of the Python popen2.popen* methods:\012\012\011fromChild, toChild = popen2.popen2(...)\012\011fromChild, toChild, errorFromChild = popen2.popen3(...)\012\011fromChildInclError, toChild = popen2.popen4(...)\012\012The os.popen* methods are more natural as follows:\012\012\011toChild, fromChild = os.popen2(...)\012\011toChild, fromChild, errorFromChild = os.popen3(...)\012\011toChild, fromChildInclError = os.popen4(...)\012\012The Popen3 and Popen4 classes allow users to poll() or wait() for\012child processes to terminate.\012");
            s$1 = Py.newString("popen");
            s$2 = Py.newString("popen2");
            s$3 = Py.newString("popen3");
            s$4 = Py.newString("popen4");
            s$5 = Py.newString("Popen3");
            s$6 = Py.newString("Popen4");
            s$7 = Py.newString("Python file object that returns the process exit status from\012    the close method.\012    ");
            s$8 = Py.newString("'%s'");
            s$9 = Py.newString("Class representing a child process.  Normally instances are created\012    by the factory functions popen2() and popen3().");
            i$10 = Py.newInteger(1);
            i$11 = Py.newInteger(0);
            s$12 = Py.newString("The parameter 'cmd' is the shell command to execute in a\012        sub-process.  Can be either a sequence of executable\012        and arguments, or a shell command.\012        The 'capturestderr' flag, if true, specifies that\012        the object should capture standard error output of the child process.\012        The default is false.  If the 'bufsize' parameter is specified, it\012        specifies the size of the I/O buffers to/from the child process.\012        ");
            s$13 = Py.newString("Start a subthread that waits for the child process to exit.");
            s$14 = Py.newString("ChildWaiter %s");
            s$15 = Py.newString("Return the exit status of the child process if it has finished,\012        or -1 if it hasn't finished yet.");
            f$16 = Py.newFloat(0.1);
            s$17 = Py.newString("Wait for and return the exit status of the child process.");
            s$18 = Py.newString("Create a thread that reads the stream, calling outfunc for each block,\012    and calling postFunc when the end of stream is reached.\012    ");
            s$19 = Py.newString("StreamReader %s");
            s$20 = Py.newString("Read instream, calling outfunc( buf, 0, count ) with each block.\012    Copy streams by passing destStream.write as the outfunc.\012    postFunc is called when the end of instream is reached.\012    ");
            i$21 = Py.newInteger(4096);
            s$22 = Py.newString("b");
            s$23 = Py.newString("Popen object that joins the stdout and stderr streams into a single  \012    output stream.");
            s$24 = Py.newString("create a stream that joins two output streams");
            s$25 = Py.newString("%s-stdout");
            s$26 = Py.newString("%s-stderr");
            s$27 = Py.newString("Must be closed twice (once for each of the two joined pipes)");
            s$28 = Py.newString("r");
            s$29 = Py.newString("w");
            s$30 = Py.newString("Invalid mode");
            s$31 = Py.newString("t");
            s$32 = Py.newString("Imitate the standard library 'system' call.\012    Execute 'cmd' in a shell, and send output to stdout & stderr.\012\012    This is in popen2 only because its Jython implementation is similar to\012    that of the popen functions.\012    ");
            s$33 = Py.newString("stderr");
            s$34 = Py.newString("cat");
            s$35 = Py.newString("ab cd\012");
            s$36 = Py.newString("nt");
            s$37 = Py.newString("java");
            s$38 = Py.newString("more");
            s$39 = Py.newString("testing popen2...");
            s$40 = Py.newString("wrote %s read %s");
            s$41 = Py.newString("testing popen3...");
            s$42 = Py.newString("wrote %s read %s, error %s");
            s$43 = Py.newString("unexected %s on stderr");
            s$44 = Py.newString("All OK");
            s$45 = Py.newString("This is\012a test of\012writing\012");
            s$46 = Py.newString("__main__");
            s$47 = Py.newString("F:\\Java\\Jython\\jython2.2.1\\Lib\\popen2.py");
            funcTable = new _PyInner();
            c$0___init__ = Py.newCode(4, new String[] {"self", "stream", "process", "name"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\popen2.py", "__init__", false, false, funcTable, 0, null, null, 0, 17);
            c$1___getattr__ = Py.newCode(2, new String[] {"self", "name"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\popen2.py", "__getattr__", false, false, funcTable, 1, null, null, 0, 17);
            c$2___repr__ = Py.newCode(1, new String[] {"self"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\popen2.py", "__repr__", false, false, funcTable, 2, null, null, 0, 17);
            c$3_close = Py.newCode(1, new String[] {"self"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\popen2.py", "close", false, false, funcTable, 3, null, null, 0, 17);
            c$4__ProcessFile = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\popen2.py", "_ProcessFile", false, false, funcTable, 4, null, null, 0, 16);
            c$5___init__ = Py.newCode(4, new String[] {"self", "cmd", "capturestderr", "bufsize", "threading"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\popen2.py", "__init__", false, false, funcTable, 5, null, null, 0, 17);
            c$6__startChildWaiter = Py.newCode(1, new String[] {"self", "threading"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\popen2.py", "_startChildWaiter", false, false, funcTable, 6, null, null, 0, 17);
            c$7_poll = Py.newCode(1, new String[] {"self"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\popen2.py", "poll", false, false, funcTable, 7, null, null, 0, 17);
            c$8_wait = Py.newCode(1, new String[] {"self"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\popen2.py", "wait", false, false, funcTable, 8, null, null, 0, 17);
            c$9_Popen3 = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\popen2.py", "Popen3", false, false, funcTable, 9, null, null, 0, 16);
            c$10__makeReaderThread = Py.newCode(5, new String[] {"stream", "outfunc", "bufsize", "name", "postFunc", "threadName", "reader", "threading"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\popen2.py", "_makeReaderThread", false, false, funcTable, 10, null, null, 0, 17);
            c$11__readStream = Py.newCode(4, new String[] {"instream", "outfunc", "bufsize", "postFunc", "buf", "count", "total"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\popen2.py", "_readStream", false, false, funcTable, 11, null, null, 0, 17);
            c$12___init__ = Py.newCode(3, new String[] {"self", "cmd", "bufsize"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\popen2.py", "__init__", false, false, funcTable, 12, null, null, 0, 17);
            c$13__join = Py.newCode(4, new String[] {"self", "stdout", "stderr", "bufsize", "joinedStream"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\popen2.py", "_join", false, false, funcTable, 13, null, null, 0, 17);
            c$14__close = Py.newCode(1, new String[] {"self"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\popen2.py", "_close", false, false, funcTable, 14, null, null, 0, 17);
            c$15_Popen4 = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\popen2.py", "Popen4", false, false, funcTable, 15, null, null, 0, 16);
            c$16_popen = Py.newCode(3, new String[] {"path", "mode", "bufsize", "p"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\popen2.py", "popen", false, false, funcTable, 16, null, null, 0, 17);
            c$17_popen2 = Py.newCode(3, new String[] {"path", "mode", "bufsize", "p"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\popen2.py", "popen2", false, false, funcTable, 17, null, null, 0, 17);
            c$18_popen3 = Py.newCode(3, new String[] {"path", "mode", "bufsize", "p"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\popen2.py", "popen3", false, false, funcTable, 18, null, null, 0, 17);
            c$19_popen4 = Py.newCode(3, new String[] {"path", "mode", "bufsize", "p"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\popen2.py", "popen4", false, false, funcTable, 19, null, null, 0, 17);
            c$20_system = Py.newCode(1, new String[] {"cmd", "p", "bufsize", "status", "errReader"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\popen2.py", "system", false, false, funcTable, 20, null, null, 0, 17);
            c$21__test = Py.newCode(0, new String[] {"r", "q", "p", "cmd", "err", "teststr", "os", "expected", "e", "got", "x", "w"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\popen2.py", "_test", false, false, funcTable, 21, null, null, 0, 17);
            c$22_main = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\popen2.py", "main", false, false, funcTable, 22, null, null, 0, 16);
        }
        
        
        public PyCode getMain() {
            if (c$22_main == null) _PyInner.initConstants();
            return c$22_main;
        }
        
        public PyObject call_function(int index, PyFrame frame) {
            switch (index){
                case 0:
                return _PyInner.__init__$1(frame);
                case 1:
                return _PyInner.__getattr__$2(frame);
                case 2:
                return _PyInner.__repr__$3(frame);
                case 3:
                return _PyInner.close$4(frame);
                case 4:
                return _PyInner._ProcessFile$5(frame);
                case 5:
                return _PyInner.__init__$6(frame);
                case 6:
                return _PyInner._startChildWaiter$7(frame);
                case 7:
                return _PyInner.poll$8(frame);
                case 8:
                return _PyInner.wait$9(frame);
                case 9:
                return _PyInner.Popen3$10(frame);
                case 10:
                return _PyInner._makeReaderThread$11(frame);
                case 11:
                return _PyInner._readStream$12(frame);
                case 12:
                return _PyInner.__init__$13(frame);
                case 13:
                return _PyInner._join$14(frame);
                case 14:
                return _PyInner._close$15(frame);
                case 15:
                return _PyInner.Popen4$16(frame);
                case 16:
                return _PyInner.popen$17(frame);
                case 17:
                return _PyInner.popen2$18(frame);
                case 18:
                return _PyInner.popen3$19(frame);
                case 19:
                return _PyInner.popen4$20(frame);
                case 20:
                return _PyInner.system$21(frame);
                case 21:
                return _PyInner._test$22(frame);
                case 22:
                return _PyInner.main$23(frame);
                default:
                return null;
            }
        }
        
        private static PyObject __init__$1(PyFrame frame) {
            frame.getlocal(0).__setattr__("_file", frame.getglobal("PyFile").__call__(frame.getlocal(1), s$8._mod(frame.getlocal(3))));
            frame.getlocal(0).__setattr__("_process", frame.getlocal(2));
            return Py.None;
        }
        
        private static PyObject __getattr__$2(PyFrame frame) {
            return frame.getglobal("getattr").__call__(frame.getlocal(0).__getattr__("_file"), frame.getlocal(1));
        }
        
        private static PyObject __repr__$3(PyFrame frame) {
            return frame.getlocal(0).__getattr__("_file").__repr__();
        }
        
        private static PyObject close$4(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject;
            
            // Code
            frame.getlocal(0).__getattr__("_file").invoke("close");
            return (t$0$PyObject = frame.getlocal(0).__getattr__("_process").invoke("waitFor")).__nonzero__() ? t$0$PyObject : frame.getglobal("None");
        }
        
        private static PyObject _ProcessFile$5(PyFrame frame) {
            /* Python file object that returns the process exit status from
                the close method.
                 */
            frame.setlocal("__init__", new PyFunction(frame.f_globals, new PyObject[] {}, c$0___init__));
            frame.setlocal("__getattr__", new PyFunction(frame.f_globals, new PyObject[] {}, c$1___getattr__));
            frame.setlocal("__repr__", new PyFunction(frame.f_globals, new PyObject[] {}, c$2___repr__));
            frame.setlocal("close", new PyFunction(frame.f_globals, new PyObject[] {}, c$3_close));
            return frame.getf_locals();
        }
        
        private static PyObject __init__$6(PyFrame frame) {
            /* The parameter 'cmd' is the shell command to execute in a
                    sub-process.  Can be either a sequence of executable
                    and arguments, or a shell command.
                    The 'capturestderr' flag, if true, specifies that
                    the object should capture standard error output of the child process.
                    The default is false.  If the 'bufsize' parameter is specified, it
                    specifies the size of the I/O buffers to/from the child process.
                     */
            frame.getlocal(0).__setattr__("process", frame.getglobal("shellexecute").__call__(frame.getlocal(1)));
            frame.getlocal(0).__setattr__("_tochild", frame.getlocal(0).__getattr__("process").invoke("getOutputStream"));
            frame.getlocal(0).__setattr__("_fromchild", frame.getlocal(0).__getattr__("process").invoke("getInputStream"));
            if (frame.getlocal(2).__nonzero__()) {
                frame.getlocal(0).__setattr__("_childerr", frame.getlocal(0).__getattr__("process").invoke("getErrorStream"));
            }
            else {
                frame.getlocal(0).__setattr__("_childerr", frame.getglobal("None"));
            }
            frame.setlocal(4, org.python.core.imp.importOne("threading", frame));
            frame.getlocal(0).__setattr__("childWaiterLock", frame.getlocal(4).__getattr__("Lock").__call__());
            if (frame.getlocal(3)._gt(i$11).__nonzero__()) {
                frame.getlocal(0).__setattr__("_tochild", frame.getglobal("BufferedOutputStream").__call__(frame.getlocal(0).__getattr__("_tochild"), frame.getlocal(3)));
                frame.getlocal(0).__setattr__("_fromchild", frame.getglobal("BufferedInputStream").__call__(frame.getlocal(0).__getattr__("_fromchild"), frame.getlocal(3)));
                if (frame.getlocal(0).__getattr__("_childerr").__nonzero__()) {
                    frame.getlocal(0).__setattr__("_childerr", frame.getglobal("BufferedInputStream").__call__(frame.getlocal(0).__getattr__("_childerr"), frame.getlocal(3)));
                }
            }
            frame.getlocal(0).__setattr__("tochild", frame.getglobal("PyFile").__call__(frame.getlocal(0).__getattr__("_tochild")));
            frame.getlocal(0).__setattr__("fromchild", frame.getglobal("PyFile").__call__(frame.getlocal(0).__getattr__("_fromchild")));
            if (frame.getlocal(0).__getattr__("_childerr").__nonzero__()) {
                frame.getlocal(0).__setattr__("childerr", frame.getglobal("PyFile").__call__(frame.getlocal(0).__getattr__("_childerr")));
            }
            return Py.None;
        }
        
        private static PyObject _startChildWaiter$7(PyFrame frame) {
            /* Start a subthread that waits for the child process to exit. */
            frame.getlocal(0).__getattr__("childWaiterLock").invoke("acquire");
            try {
                if (frame.getlocal(0).__getattr__("childWaiter").__not__().__nonzero__()) {
                    frame.setlocal(1, org.python.core.imp.importOne("threading", frame));
                    frame.getlocal(0).__setattr__("childWaiter", frame.getlocal(1).__getattr__("Thread").__call__(new PyObject[] {frame.getlocal(0).__getattr__("wait"), s$14._mod(frame.getlocal(0).__getattr__("process")), new PyTuple(new PyObject[] {})}, new String[] {"target", "name", "args"}));
                    frame.getlocal(0).__getattr__("childWaiter").invoke("setDaemon", i$10);
                    frame.getlocal(0).__getattr__("childWaiter").invoke("start");
                }
            }
            finally {
                frame.getlocal(0).__getattr__("childWaiterLock").invoke("release");
            }
            return Py.None;
        }
        
        private static PyObject poll$8(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject;
            
            // Code
            /* Return the exit status of the child process if it has finished,
                    or -1 if it hasn't finished yet. */
            if (((t$0$PyObject = frame.getlocal(0).__getattr__("sts")._lt(i$11)).__nonzero__() ? frame.getlocal(0).__getattr__("childWaiter").__not__() : t$0$PyObject).__nonzero__()) {
                frame.getlocal(0).invoke("_startChildWaiter");
                frame.getlocal(0).__getattr__("childWaiter").invoke("join", f$16);
            }
            return frame.getlocal(0).__getattr__("sts");
        }
        
        private static PyObject wait$9(PyFrame frame) {
            /* Wait for and return the exit status of the child process. */
            frame.getlocal(0).__setattr__("sts", frame.getlocal(0).__getattr__("process").invoke("waitFor"));
            return frame.getlocal(0).__getattr__("sts");
        }
        
        private static PyObject Popen3$10(PyFrame frame) {
            /* Class representing a child process.  Normally instances are created
                by the factory functions popen2() and popen3(). */
            frame.setlocal("sts", i$10.__neg__());
            frame.setlocal("childWaiter", frame.getname("None"));
            frame.setlocal("count", i$11);
            frame.setlocal("__init__", new PyFunction(frame.f_globals, new PyObject[] {i$11, i$10.__neg__()}, c$5___init__));
            frame.setlocal("_startChildWaiter", new PyFunction(frame.f_globals, new PyObject[] {}, c$6__startChildWaiter));
            frame.setlocal("poll", new PyFunction(frame.f_globals, new PyObject[] {}, c$7_poll));
            frame.setlocal("wait", new PyFunction(frame.f_globals, new PyObject[] {}, c$8_wait));
            return frame.getf_locals();
        }
        
        private static PyObject _makeReaderThread$11(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject;
            
            // Code
            /* Create a thread that reads the stream, calling outfunc for each block,
                and calling postFunc when the end of stream is reached.
                 */
            t$0$PyObject = frame.getglobal("Popen3");
            t$0$PyObject.__setattr__("count", t$0$PyObject.__getattr__("count").__iadd__(i$10));
            frame.setlocal(3, (t$0$PyObject = frame.getlocal(3)).__nonzero__() ? t$0$PyObject : frame.getglobal("str").__call__(frame.getglobal("Popen3").__getattr__("count")));
            frame.setlocal(5, s$19._mod(frame.getlocal(3)));
            frame.setlocal(7, org.python.core.imp.importOne("threading", frame));
            frame.setlocal(6, frame.getlocal(7).__getattr__("Thread").__call__(new PyObject[] {frame.getglobal("_readStream"), frame.getlocal(5), new PyTuple(new PyObject[] {frame.getlocal(0), frame.getlocal(1), frame.getlocal(2), frame.getlocal(4)})}, new String[] {"target", "name", "args"}));
            frame.getlocal(6).invoke("setDaemon", i$10);
            frame.getlocal(6).invoke("start");
            return frame.getlocal(6);
        }
        
        private static PyObject _readStream$12(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject;
            
            // Code
            /* Read instream, calling outfunc( buf, 0, count ) with each block.
                Copy streams by passing destStream.write as the outfunc.
                postFunc is called when the end of instream is reached.
                 */
            frame.setlocal(2, (t$0$PyObject = ((t$0$PyObject = frame.getlocal(2)._lt(i$10)).__nonzero__() ? i$21 : t$0$PyObject)).__nonzero__() ? t$0$PyObject : frame.getlocal(2));
            frame.setlocal(4, frame.getglobal("jarray").__getattr__("zeros").__call__(frame.getlocal(2), s$22));
            frame.setlocal(6, i$11);
            while (i$10.__nonzero__()) {
                frame.setlocal(5, frame.getlocal(0).invoke("read", frame.getlocal(4)));
                if (i$10.__neg__()._eq(frame.getlocal(5)).__nonzero__()) {
                    frame.getlocal(0).invoke("close");
                    if (frame.getlocal(3).__nonzero__()) {
                        frame.getlocal(3).__call__();
                    }
                    break;
                }
                else {
                    frame.setlocal(6, frame.getlocal(6).__iadd__(frame.getlocal(5)));
                    frame.getlocal(1).__call__(frame.getlocal(4), i$11, frame.getlocal(5));
                }
            }
            return frame.getlocal(6);
        }
        
        private static PyObject __init__$13(PyFrame frame) {
            frame.getglobal("Popen3").invoke("__init__", new PyObject[] {frame.getlocal(0), frame.getlocal(1), i$10, frame.getlocal(2)});
            frame.getlocal(0).__setattr__("closed", frame.getglobal("Vector").__call__());
            frame.getlocal(0).__setattr__("fromchild", frame.getlocal(0).invoke("_join", new PyObject[] {frame.getlocal(0).__getattr__("_fromchild"), frame.getlocal(0).__getattr__("_childerr"), frame.getlocal(2)}));
            return Py.None;
        }
        
        private static PyObject _join$14(PyFrame frame) {
            /* create a stream that joins two output streams */
            frame.getlocal(0).__setattr__("_pipeOut", frame.getglobal("PipedOutputStream").__call__());
            frame.setlocal(4, frame.getglobal("PipedInputStream").__call__(frame.getlocal(0).__getattr__("_pipeOut")));
            frame.getlocal(0).__setattr__("_outReader", frame.getglobal("_makeReaderThread").__call__(new PyObject[] {frame.getlocal(1), frame.getlocal(0).__getattr__("_pipeOut").__getattr__("write"), frame.getlocal(3), s$25._mod(frame.getlocal(0).__getattr__("process")), frame.getlocal(0).__getattr__("_close")}));
            frame.getlocal(0).__setattr__("_errReader", frame.getglobal("_makeReaderThread").__call__(new PyObject[] {frame.getlocal(2), frame.getlocal(0).__getattr__("_pipeOut").__getattr__("write"), frame.getlocal(3), s$26._mod(frame.getlocal(0).__getattr__("process")), frame.getlocal(0).__getattr__("_close")}));
            return frame.getglobal("PyFile").__call__(frame.getlocal(4));
        }
        
        private static PyObject _close$15(PyFrame frame) {
            /* Must be closed twice (once for each of the two joined pipes) */
            frame.getlocal(0).__getattr__("closed").invoke("add", frame.getglobal("None"));
            if (frame.getlocal(0).__getattr__("closed").invoke("size")._gt(i$10).__nonzero__()) {
                frame.getlocal(0).__getattr__("_pipeOut").invoke("close");
            }
            return Py.None;
        }
        
        private static PyObject Popen4$16(PyFrame frame) {
            /* Popen object that joins the stdout and stderr streams into a single  
                output stream. */
            frame.setlocal("childerr", frame.getname("None"));
            frame.setlocal("__init__", new PyFunction(frame.f_globals, new PyObject[] {i$10.__neg__()}, c$12___init__));
            frame.setlocal("_join", new PyFunction(frame.f_globals, new PyObject[] {}, c$13__join));
            frame.setlocal("_close", new PyFunction(frame.f_globals, new PyObject[] {}, c$14__close));
            return frame.getf_locals();
        }
        
        private static PyObject popen$17(PyFrame frame) {
            frame.setlocal(3, frame.getglobal("Popen3").__call__(frame.getlocal(0), i$11, frame.getlocal(2)));
            if (frame.getlocal(1)._eq(s$28).__nonzero__()) {
                return frame.getglobal("_ProcessFile").__call__(frame.getlocal(3).__getattr__("fromchild"), frame.getlocal(3).__getattr__("process"), frame.getlocal(0));
            }
            else {
                if (frame.getlocal(1)._eq(s$29).__nonzero__()) {
                    return frame.getglobal("_ProcessFile").__call__(frame.getlocal(3).__getattr__("tochild"), frame.getlocal(3).__getattr__("process"), frame.getlocal(0));
                }
                else {
                    throw Py.makeException(frame.getglobal("OSError").__call__(i$11, s$30, frame.getlocal(1)));
                }
            }
        }
        
        private static PyObject popen2$18(PyFrame frame) {
            frame.setlocal(3, frame.getglobal("Popen3").__call__(frame.getlocal(0), i$11, frame.getlocal(2)));
            return new PyTuple(new PyObject[] {frame.getlocal(3).__getattr__("fromchild"), frame.getlocal(3).__getattr__("tochild")});
        }
        
        private static PyObject popen3$19(PyFrame frame) {
            frame.setlocal(3, frame.getglobal("Popen3").__call__(frame.getlocal(0), i$10, frame.getlocal(2)));
            return new PyTuple(new PyObject[] {frame.getlocal(3).__getattr__("fromchild"), frame.getlocal(3).__getattr__("tochild"), frame.getlocal(3).__getattr__("childerr")});
        }
        
        private static PyObject popen4$20(PyFrame frame) {
            frame.setlocal(3, frame.getglobal("Popen4").__call__(frame.getlocal(0), frame.getlocal(2)));
            return new PyTuple(new PyObject[] {frame.getlocal(3).__getattr__("fromchild"), frame.getlocal(3).__getattr__("tochild")});
        }
        
        private static PyObject system$21(PyFrame frame) {
            /* Imitate the standard library 'system' call.
                Execute 'cmd' in a shell, and send output to stdout & stderr.
            
                This is in popen2 only because its Jython implementation is similar to
                that of the popen functions.
                 */
            frame.setlocal(2, i$21);
            frame.setlocal(1, frame.getglobal("Popen3").__call__(frame.getlocal(0), i$10, frame.getlocal(2)));
            frame.getlocal(1).__getattr__("tochild").invoke("close");
            frame.setlocal(4, frame.getglobal("_makeReaderThread").__call__(new PyObject[] {frame.getlocal(1).__getattr__("_childerr"), frame.getglobal("System").__getattr__("err").__getattr__("write"), frame.getlocal(2), s$33}));
            frame.getglobal("_readStream").__call__(frame.getlocal(1).__getattr__("_fromchild"), frame.getglobal("System").__getattr__("out").__getattr__("write"), frame.getlocal(2));
            frame.setlocal(3, frame.getlocal(1).invoke("wait"));
            return frame.getlocal(3);
        }
        
        private static PyObject _test$22(PyFrame frame) {
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            PyException t$0$PyException;
            
            // Code
            frame.setlocal(3, s$34);
            frame.setlocal(5, s$35);
            frame.setlocal(6, org.python.core.imp.importOne("os", frame));
            if (frame.getlocal(6).__getattr__("name")._in(new PyList(new PyObject[] {s$36, s$37})).__nonzero__()) {
                frame.setlocal(3, s$38);
            }
            frame.setlocal(7, frame.getlocal(5).invoke("strip"));
            Py.println(Py.None, s$39);
            t$0$PyObject__ = org.python.core.Py.unpackSequence(frame.getglobal("popen2").__call__(frame.getlocal(3)), 2);
            frame.setlocal(0, t$0$PyObject__[0]);
            frame.setlocal(11, t$0$PyObject__[1]);
            frame.getlocal(11).invoke("write", frame.getlocal(5));
            frame.getlocal(11).invoke("close");
            frame.setlocal(9, frame.getlocal(0).invoke("read"));
            if (frame.getlocal(9).invoke("strip")._ne(frame.getlocal(7)).__nonzero__()) {
                throw Py.makeException(frame.getglobal("ValueError").__call__(s$40._mod(new PyTuple(new PyObject[] {frame.getlocal(5), frame.getlocal(9)}))));
            }
            Py.println(Py.None, s$41);
            try {
                t$0$PyObject__ = org.python.core.Py.unpackSequence(frame.getglobal("popen3").__call__(new PyList(new PyObject[] {frame.getlocal(3)})), 3);
                frame.setlocal(0, t$0$PyObject__[0]);
                frame.setlocal(11, t$0$PyObject__[1]);
                frame.setlocal(8, t$0$PyObject__[2]);
            }
            catch (Throwable x$0) {
                t$0$PyException = Py.setException(x$0, frame);
                t$0$PyObject__ = org.python.core.Py.unpackSequence(frame.getglobal("popen3").__call__(frame.getlocal(3)), 3);
                frame.setlocal(0, t$0$PyObject__[0]);
                frame.setlocal(11, t$0$PyObject__[1]);
                frame.setlocal(8, t$0$PyObject__[2]);
            }
            frame.getlocal(11).invoke("write", frame.getlocal(5));
            frame.getlocal(11).invoke("close");
            frame.setlocal(9, frame.getlocal(0).invoke("read"));
            frame.setlocal(4, frame.getlocal(8).invoke("read"));
            if (frame.getlocal(9).invoke("strip")._ne(frame.getlocal(7)).__nonzero__()) {
                throw Py.makeException(frame.getglobal("ValueError").__call__(s$42._mod(new PyTuple(new PyObject[] {frame.getlocal(5), frame.getlocal(9), frame.getlocal(4)}))));
            }
            if (frame.getlocal(4).__nonzero__()) {
                throw Py.makeException(frame.getglobal("ValueError").__call__(s$43._mod(frame.getlocal(4))));
            }
            Py.println(Py.None, s$44);
            frame.setlocal(2, frame.getglobal("Popen3").__call__(frame.getlocal(3)));
            frame.setlocal(1, s$45);
            frame.getlocal(2).__getattr__("tochild").invoke("write", frame.getlocal(1));
            frame.getlocal(2).__getattr__("tochild").invoke("close");
            frame.setlocal(0, frame.getlocal(2).__getattr__("fromchild").invoke("read"));
            frame.setlocal(10, frame.getlocal(2).invoke("poll"));
            if (frame.getglobal("__debug__").__nonzero__()) Py.assert_(frame.getlocal(10)._eq(i$11));
            if (frame.getglobal("__debug__").__nonzero__()) Py.assert_(frame.getlocal(0).invoke("strip")._eq(frame.getlocal(1).invoke("strip")));
            return Py.None;
        }
        
        private static PyObject main$23(PyFrame frame) {
            frame.setglobal("__file__", s$47);
            
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            
            // Code
            /* 
            popen2.py
            
            Implement popen2 module functionality for Jython.
            
            Note that the popen* methods in this module follow the return value
            ordering of the Python popen2.popen* methods:
            
            	fromChild, toChild = popen2.popen2(...)
            	fromChild, toChild, errorFromChild = popen2.popen3(...)
            	fromChildInclError, toChild = popen2.popen4(...)
            
            The os.popen* methods are more natural as follows:
            
            	toChild, fromChild = os.popen2(...)
            	toChild, fromChild, errorFromChild = os.popen3(...)
            	toChild, fromChildInclError = os.popen4(...)
            
            The Popen3 and Popen4 classes allow users to poll() or wait() for
            child processes to terminate.
             */
            frame.setlocal("jarray", org.python.core.imp.importOne("jarray", frame));
            t$0$PyObject__ = org.python.core.imp.importFrom("java.lang", new String[] {"System"}, frame);
            frame.setlocal("System", t$0$PyObject__[0]);
            t$0$PyObject__ = null;
            t$0$PyObject__ = org.python.core.imp.importFrom("java.util", new String[] {"Vector"}, frame);
            frame.setlocal("Vector", t$0$PyObject__[0]);
            t$0$PyObject__ = null;
            t$0$PyObject__ = org.python.core.imp.importFrom("java.io", new String[] {"BufferedOutputStream"}, frame);
            frame.setlocal("BufferedOutputStream", t$0$PyObject__[0]);
            t$0$PyObject__ = null;
            t$0$PyObject__ = org.python.core.imp.importFrom("java.io", new String[] {"BufferedInputStream"}, frame);
            frame.setlocal("BufferedInputStream", t$0$PyObject__[0]);
            t$0$PyObject__ = null;
            t$0$PyObject__ = org.python.core.imp.importFrom("java.io", new String[] {"PipedOutputStream"}, frame);
            frame.setlocal("PipedOutputStream", t$0$PyObject__[0]);
            t$0$PyObject__ = null;
            t$0$PyObject__ = org.python.core.imp.importFrom("java.io", new String[] {"PipedInputStream"}, frame);
            frame.setlocal("PipedInputStream", t$0$PyObject__[0]);
            t$0$PyObject__ = null;
            t$0$PyObject__ = org.python.core.imp.importFrom("org.python.core", new String[] {"PyFile"}, frame);
            frame.setlocal("PyFile", t$0$PyObject__[0]);
            t$0$PyObject__ = null;
            t$0$PyObject__ = org.python.core.imp.importFrom("javashell", new String[] {"shellexecute"}, frame);
            frame.setlocal("shellexecute", t$0$PyObject__[0]);
            t$0$PyObject__ = null;
            frame.setlocal("__all__", new PyList(new PyObject[] {s$1, s$2, s$3, s$4, s$5, s$6}));
            frame.setlocal("_active", new PyList(new PyObject[] {}));
            frame.setlocal("_ProcessFile", Py.makeClass("_ProcessFile", new PyObject[] {}, c$4__ProcessFile, null));
            frame.setlocal("Popen3", Py.makeClass("Popen3", new PyObject[] {}, c$9_Popen3, null));
            frame.setlocal("_makeReaderThread", new PyFunction(frame.f_globals, new PyObject[] {frame.getname("None"), frame.getname("None")}, c$10__makeReaderThread));
            frame.setlocal("_readStream", new PyFunction(frame.f_globals, new PyObject[] {frame.getname("None")}, c$11__readStream));
            frame.setlocal("Popen4", Py.makeClass("Popen4", new PyObject[] {frame.getname("Popen3")}, c$15_Popen4, null));
            frame.setlocal("popen", new PyFunction(frame.f_globals, new PyObject[] {s$28, i$10.__neg__()}, c$16_popen));
            frame.setlocal("popen2", new PyFunction(frame.f_globals, new PyObject[] {s$31, i$10.__neg__()}, c$17_popen2));
            frame.setlocal("popen3", new PyFunction(frame.f_globals, new PyObject[] {s$31, i$10.__neg__()}, c$18_popen3));
            frame.setlocal("popen4", new PyFunction(frame.f_globals, new PyObject[] {s$31, i$10.__neg__()}, c$19_popen4));
            frame.setlocal("system", new PyFunction(frame.f_globals, new PyObject[] {}, c$20_system));
            frame.setlocal("_test", new PyFunction(frame.f_globals, new PyObject[] {}, c$21__test));
            if (frame.getname("__name__")._eq(s$46).__nonzero__()) {
                frame.getname("_test").__call__();
            }
            return Py.None;
        }
        
    }
    public static void moduleDictInit(PyObject dict) {
        dict.__setitem__("__name__", new PyString("popen2"));
        Py.runCode(new _PyInner().getMain(), dict, dict);
    }
    
    public static void main(String[] args) throws java.lang.Exception {
        String[] newargs = new String[args.length+1];
        newargs[0] = "popen2";
        java.lang.System.arraycopy(args, 0, newargs, 1, args.length);
        Py.runMain(popen2._PyInner.class, newargs, popen2.jpy$packages, popen2.jpy$mainProperties, "", new String[] {"string", "random", "traceback", "sre_compile", "atexit", "warnings", "popen2", "getopt", "sre", "sre_constants", "StringIO", "QAsystem", "javaos", "repr", "copy_reg", "re", "linecache", "javapath", "UserDict", "copy", "threading", "stat", "sre_parse", "javashell"});
    }
    
}

import org.python.core.*;

public class javashell extends java.lang.Object {
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
        private static PyObject s$10;
        private static PyObject s$11;
        private static PyObject s$12;
        private static PyObject s$13;
        private static PyObject s$14;
        private static PyObject s$15;
        private static PyObject s$16;
        private static PyObject s$17;
        private static PyObject s$18;
        private static PyObject i$19;
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
        private static PyObject s$42;
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
        private static PyFunctionTable funcTable;
        private static PyCode c$0___warn;
        private static PyCode c$1___init__;
        private static PyCode c$2_execute;
        private static PyCode c$3__formatCmd;
        private static PyCode c$4__formatEnvironment;
        private static PyCode c$5__getEnvironment;
        private static PyCode c$6__ShellEnv;
        private static PyCode c$7__getOsType;
        private static PyCode c$8__getShellEnv;
        private static PyCode c$9_main;
        private static void initConstants() {
            s$0 = Py.newString("\012Implement subshell functionality for Jython.\012\012This is mostly to provide the environ object for the os module,\012and subshell execution functionality for os.system and popen* functions.\012\012javashell attempts to determine a suitable command shell for the host\012operating system, and uses that shell to determine environment variables\012and to provide subshell execution functionality.\012");
            s$1 = Py.newString("shellexecute");
            s$2 = Py.newString("environ");
            s$3 = Py.newString("putenv");
            s$4 = Py.newString("getenv");
            s$5 = Py.newString(" ");
            s$6 = Py.newString("Provide environment derived by spawning a subshell and parsing its\012    environment.  Also supports subshell execution functions and provides\012    empty environment support for platforms with unknown shell functionality.\012    ");
            s$7 = Py.newString("Construct _ShellEnv instance.\012        cmd: list of exec() arguments required to run a command in\012            subshell, or None\012        getEnv: shell command to list environment variables, or None\012        keyTransform: normalization function for environment keys,\012          such as 'string.upper', or None\012        ");
            s$8 = Py.newString("Execute cmd in a shell, and return the java.lang.Process instance.\012        Accepts either a string command to be executed in a shell,\012        or a sequence of [executable, args...].\012        ");
            i$9 = Py.newInteger(0);
            s$10 = Py.newString("Failed to execute command (%s): %s");
            s$11 = Py.newString("Format a command for execution in a shell.");
            s$12 = Py.newString("Unable to execute commands in subshell because shell functionality not implemented for OS %s with shell setting %s. Failed command=%s");
            s$13 = Py.newString("Format enviroment in lines suitable for Runtime.exec");
            s$14 = Py.newString("%s=%s");
            s$15 = Py.newString("Get the environment variables by spawning a subshell.\012        This allows multi-line variables as long as subsequent lines do\012        not have '=' signs.\012        ");
            s$16 = Py.newString("=");
            s$17 = Py.newString("Failed to get environment, getEnv command (%s) did not print environment as key=value lines.\012Output=%s");
            s$18 = Py.newString("\012");
            i$19 = Py.newInteger(1);
            s$20 = Py.newString("%s\012%s");
            s$21 = Py.newString("Failed to get environment, environ will be empty:");
            s$22 = Py.newString("Select the OS behavior based on os argument, 'python.os' registry\012    setting and 'os.name' Java property.\012    os: explicitly select desired OS. os=None to autodetect, os='None' to\012    disable \012    ");
            s$23 = Py.newString("python.os");
            s$24 = Py.newString("os.name");
            s$25 = Py.newString("nt");
            s$26 = Py.newString("Windows NT");
            s$27 = Py.newString("Windows NT 4.0");
            s$28 = Py.newString("WindowsNT");
            s$29 = Py.newString("Windows 2000");
            s$30 = Py.newString("Windows 2003");
            s$31 = Py.newString("Windows XP");
            s$32 = Py.newString("Windows CE");
            s$33 = Py.newString("Windows Vista");
            s$34 = Py.newString("dos");
            s$35 = Py.newString("Windows 95");
            s$36 = Py.newString("Windows 98");
            s$37 = Py.newString("Windows ME");
            s$38 = Py.newString("mac");
            s$39 = Py.newString("MacOS");
            s$40 = Py.newString("Darwin");
            s$41 = Py.newString("None");
            s$42 = Py.newString("posix");
            s$43 = Py.newString("python.environment");
            s$44 = Py.newString("shell");
            s$45 = Py.newString("cmd");
            s$46 = Py.newString("/c");
            s$47 = Py.newString("set");
            s$48 = Py.newString("command.com");
            s$49 = Py.newString("sh");
            s$50 = Py.newString("-c");
            s$51 = Py.newString("env");
            s$52 = Py.newString(":");
            s$53 = Py.newString("::");
            s$54 = Py.newString("F:\\Java\\Jython\\jython2.2.1\\Lib\\javashell.py");
            funcTable = new _PyInner();
            c$0___warn = Py.newCode(1, new String[] {"args", "arg", "_[1]"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javashell.py", "__warn", true, false, funcTable, 1, null, null, 0, 17);
            c$1___init__ = Py.newCode(4, new String[] {"self", "cmd", "getEnv", "keyTransform"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javashell.py", "__init__", false, false, funcTable, 2, null, null, 0, 17);
            c$2_execute = Py.newCode(2, new String[] {"self", "cmd", "p", "shellCmd", "env", "ex"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javashell.py", "execute", false, false, funcTable, 3, null, null, 0, 17);
            c$3__formatCmd = Py.newCode(2, new String[] {"self", "cmd", "shellCmd", "msgFmt"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javashell.py", "_formatCmd", false, false, funcTable, 4, null, null, 0, 17);
            c$4__formatEnvironment = Py.newCode(2, new String[] {"self", "env", "lines", "keyValue"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javashell.py", "_formatEnvironment", false, false, funcTable, 5, null, null, 0, 17);
            c$5__getEnvironment = Py.newCode(1, new String[] {"self", "r", "p", "i", "env", "ex", "value", "key", "line", "lines"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javashell.py", "_getEnvironment", false, false, funcTable, 6, null, null, 0, 17);
            c$6__ShellEnv = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javashell.py", "_ShellEnv", false, false, funcTable, 7, null, null, 0, 16);
            c$7__getOsType = Py.newCode(1, new String[] {"os", "osType", "_osTypeMap", "patterns", "pattern", "foundType"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javashell.py", "_getOsType", false, false, funcTable, 8, null, null, 0, 17);
            c$8__getShellEnv = Py.newCode(0, new String[] {"osType", "envType", "pardir", "shellCmd", "envTransform", "curdir", "envCmd"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javashell.py", "_getShellEnv", false, false, funcTable, 9, null, null, 0, 17);
            c$9_main = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javashell.py", "main", false, false, funcTable, 10, null, null, 0, 16);
        }
        
        
        public PyCode getMain() {
            if (c$9_main == null) _PyInner.initConstants();
            return c$9_main;
        }
        
        public PyObject call_function(int index, PyFrame frame) {
            switch (index){
                case 0:
                return _PyInner.__listcomprehension$1(frame);
                case 1:
                return _PyInner.__warn$2(frame);
                case 2:
                return _PyInner.__init__$3(frame);
                case 3:
                return _PyInner.execute$4(frame);
                case 4:
                return _PyInner._formatCmd$5(frame);
                case 5:
                return _PyInner._formatEnvironment$6(frame);
                case 6:
                return _PyInner._getEnvironment$7(frame);
                case 7:
                return _PyInner._ShellEnv$8(frame);
                case 8:
                return _PyInner._getOsType$9(frame);
                case 9:
                return _PyInner._getShellEnv$10(frame);
                case 10:
                return _PyInner.main$11(frame);
                default:
                return null;
            }
        }
        
        private static PyObject __listcomprehension$1(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject, t$1$PyObject, t$2$PyObject, t$3$PyObject;
            
            t$0$PyObject = new PyList(new PyObject[] {});
            frame.setlocal(2, t$0$PyObject.__getattr__("append"));
            t$2$PyObject = frame.getlocal(0).__iter__();
            while ((t$3$PyObject = t$2$PyObject.__iternext__()) != null) {
                frame.setlocal(1, t$3$PyObject);
                frame.getlocal(2).__call__(frame.getglobal("str").__call__(frame.getlocal(1)));
            }
            return t$0$PyObject;
        }
        
        private static PyObject __warn$2(PyFrame frame) {
            Py.println(Py.None, s$5.invoke("join", __listcomprehension$1(frame)));
            return Py.None;
        }
        
        private static PyObject __init__$3(PyFrame frame) {
            /* Construct _ShellEnv instance.
                    cmd: list of exec() arguments required to run a command in
                        subshell, or None
                    getEnv: shell command to list environment variables, or None
                    keyTransform: normalization function for environment keys,
                      such as 'string.upper', or None
                     */
            frame.getlocal(0).__setattr__("cmd", frame.getlocal(1));
            frame.getlocal(0).__setattr__("getEnv", frame.getlocal(2));
            frame.getlocal(0).__setattr__("environment", frame.getglobal("LazyDict").__call__(new PyObject[] {frame.getlocal(0).__getattr__("_getEnvironment"), frame.getlocal(3)}, new String[] {"populate", "keyTransform"}));
            frame.getlocal(0).__setattr__("_keyTransform", frame.getlocal(0).__getattr__("environment").__getattr__("_keyTransform"));
            return Py.None;
        }
        
        private static PyObject execute$4(PyFrame frame) {
            // Temporary Variables
            PyException t$0$PyException;
            
            // Code
            /* Execute cmd in a shell, and return the java.lang.Process instance.
                    Accepts either a string command to be executed in a shell,
                    or a sequence of [executable, args...].
                     */
            frame.setlocal(3, frame.getlocal(0).invoke("_formatCmd", frame.getlocal(1)));
            if (frame.getlocal(0).__getattr__("environment").__getattr__("_populated").__nonzero__()) {
                frame.setlocal(4, frame.getlocal(0).invoke("_formatEnvironment", frame.getlocal(0).__getattr__("environment")));
            }
            else {
                frame.setlocal(4, frame.getglobal("None"));
            }
            try {
                frame.setlocal(2, frame.getglobal("Runtime").__getattr__("getRuntime").__call__().invoke("exec", frame.getlocal(3), frame.getlocal(4)));
                return frame.getlocal(2);
            }
            catch (Throwable x$0) {
                t$0$PyException = Py.setException(x$0, frame);
                if (Py.matchException(t$0$PyException, frame.getglobal("IOException"))) {
                    frame.setlocal(5, t$0$PyException.value);
                    throw Py.makeException(frame.getglobal("OSError").__call__(i$9, s$10._mod(new PyTuple(new PyObject[] {frame.getlocal(3), frame.getlocal(5)}))));
                }
                else throw t$0$PyException;
            }
        }
        
        private static PyObject _formatCmd$5(PyFrame frame) {
            /* Format a command for execution in a shell. */
            if (frame.getlocal(0).__getattr__("cmd")._is(frame.getglobal("None")).__nonzero__()) {
                frame.setlocal(3, s$12);
                throw Py.makeException(frame.getglobal("OSError").__call__(i$9, frame.getlocal(3)._mod(new PyTuple(new PyObject[] {frame.getglobal("_osType"), frame.getglobal("_envType"), frame.getlocal(1)}))));
            }
            if (frame.getglobal("isinstance").__call__(frame.getlocal(1), frame.getglobal("basestring")).__nonzero__()) {
                frame.setlocal(2, frame.getlocal(0).__getattr__("cmd")._add(new PyList(new PyObject[] {frame.getlocal(1)})));
            }
            else {
                frame.setlocal(2, frame.getlocal(1));
            }
            return frame.getlocal(2);
        }
        
        private static PyObject _formatEnvironment$6(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject, t$1$PyObject;
            
            // Code
            /* Format enviroment in lines suitable for Runtime.exec */
            frame.setlocal(2, new PyList(new PyObject[] {}));
            t$0$PyObject = frame.getlocal(1).invoke("items").__iter__();
            while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                frame.setlocal(3, t$1$PyObject);
                frame.getlocal(2).invoke("append", s$14._mod(frame.getlocal(3)));
            }
            return frame.getlocal(2);
        }
        
        private static PyObject _getEnvironment$7(PyFrame frame) {
            // Temporary Variables
            PyException t$0$PyException;
            PyObject t$0$PyObject, t$1$PyObject;
            
            // Code
            /* Get the environment variables by spawning a subshell.
                    This allows multi-line variables as long as subsequent lines do
                    not have '=' signs.
                     */
            frame.setlocal(4, new PyDictionary(new PyObject[] {}));
            if (frame.getlocal(0).__getattr__("getEnv").__nonzero__()) {
                try {
                    frame.setlocal(2, frame.getlocal(0).invoke("execute", frame.getlocal(0).__getattr__("getEnv")));
                    frame.setlocal(1, frame.getglobal("BufferedReader").__call__(frame.getglobal("InputStreamReader").__call__(frame.getlocal(2).invoke("getInputStream"))));
                    frame.setlocal(9, new PyList(new PyObject[] {}));
                    while (frame.getglobal("True").__nonzero__()) {
                        frame.setlocal(8, frame.getlocal(1).invoke("readLine"));
                        if (frame.getlocal(8).__not__().__nonzero__()) {
                            break;
                        }
                        frame.getlocal(9).invoke("append", frame.getlocal(8));
                    }
                    if (s$16._notin(frame.getlocal(9).__getitem__(i$9)).__nonzero__()) {
                        frame.getglobal("__warn").__call__(s$17._mod(new PyTuple(new PyObject[] {frame.getlocal(0).__getattr__("getEnv"), s$18.invoke("join", frame.getlocal(9))})));
                        return frame.getlocal(4);
                    }
                    t$0$PyObject = frame.getlocal(9).__iter__();
                    while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                        frame.setlocal(8, t$1$PyObject);
                        try {
                            frame.setlocal(3, frame.getlocal(8).invoke("index", s$16));
                            frame.setlocal(7, frame.getlocal(0).invoke("_keyTransform", frame.getlocal(8).__getslice__(null, frame.getlocal(3), null)));
                            frame.setlocal(6, frame.getlocal(8).__getslice__(frame.getlocal(3)._add(i$19), null, null));
                        }
                        catch (Throwable x$0) {
                            t$0$PyException = Py.setException(x$0, frame);
                            if (Py.matchException(t$0$PyException, frame.getglobal("ValueError"))) {
                                frame.setlocal(6, s$20._mod(new PyTuple(new PyObject[] {frame.getlocal(6), frame.getlocal(8)})));
                            }
                            else throw t$0$PyException;
                        }
                        frame.getlocal(4).__setitem__(frame.getlocal(7), frame.getlocal(6));
                    }
                }
                catch (Throwable x$1) {
                    t$0$PyException = Py.setException(x$1, frame);
                    if (Py.matchException(t$0$PyException, frame.getglobal("OSError"))) {
                        frame.setlocal(5, t$0$PyException.value);
                        frame.getglobal("__warn").__call__(s$21, frame.getlocal(5));
                    }
                    else throw t$0$PyException;
                }
            }
            return frame.getlocal(4);
        }
        
        private static PyObject _ShellEnv$8(PyFrame frame) {
            /* Provide environment derived by spawning a subshell and parsing its
                environment.  Also supports subshell execution functions and provides
                empty environment support for platforms with unknown shell functionality.
                 */
            frame.setlocal("__init__", new PyFunction(frame.f_globals, new PyObject[] {frame.getname("None"), frame.getname("None"), frame.getname("None")}, c$1___init__));
            frame.setlocal("execute", new PyFunction(frame.f_globals, new PyObject[] {}, c$2_execute));
            frame.setlocal("_formatCmd", new PyFunction(frame.f_globals, new PyObject[] {}, c$3__formatCmd));
            frame.setlocal("_formatEnvironment", new PyFunction(frame.f_globals, new PyObject[] {}, c$4__formatEnvironment));
            frame.setlocal("_getEnvironment", new PyFunction(frame.f_globals, new PyObject[] {}, c$5__getEnvironment));
            return frame.getf_locals();
        }
        
        private static PyObject _getOsType$9(PyFrame frame) {
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            PyObject t$0$PyObject, t$1$PyObject, t$2$PyObject, t$3$PyObject;
            
            // Code
            /* Select the OS behavior based on os argument, 'python.os' registry
                setting and 'os.name' Java property.
                os: explicitly select desired OS. os=None to autodetect, os='None' to
                disable 
                 */
            frame.setlocal(0, frame.getglobal("str").__call__((t$0$PyObject = ((t$0$PyObject = frame.getlocal(0)).__nonzero__() ? t$0$PyObject : frame.getglobal("sys").__getattr__("registry").__getattr__("getProperty").__call__(s$23))).__nonzero__() ? t$0$PyObject : frame.getglobal("System").__getattr__("getProperty").__call__(s$24)));
            frame.setlocal(2, new PyTuple(new PyObject[] {new PyTuple(new PyObject[] {s$25, new PyTuple(new PyObject[] {s$25, s$26, s$27, s$28, s$29, s$30, s$31, s$32, s$33})}), new PyTuple(new PyObject[] {s$34, new PyTuple(new PyObject[] {s$34, s$35, s$36, s$37})}), new PyTuple(new PyObject[] {s$38, new PyTuple(new PyObject[] {s$38, s$39, s$40})}), new PyTuple(new PyObject[] {s$41, new PyTuple(new PyObject[] {s$41})})}));
            frame.setlocal(5, frame.getglobal("None"));
            t$0$PyObject = frame.getlocal(2).__iter__();
            while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                t$0$PyObject__ = org.python.core.Py.unpackSequence(t$1$PyObject, 2);
                frame.setlocal(1, t$0$PyObject__[0]);
                frame.setlocal(3, t$0$PyObject__[1]);
                t$2$PyObject = frame.getlocal(3).__iter__();
                while ((t$3$PyObject = t$2$PyObject.__iternext__()) != null) {
                    frame.setlocal(4, t$3$PyObject);
                    if (frame.getlocal(0).invoke("startswith", frame.getlocal(4)).__nonzero__()) {
                        frame.setlocal(5, frame.getlocal(1));
                        break;
                    }
                }
                if (frame.getlocal(5).__nonzero__()) {
                    break;
                }
            }
            if (frame.getlocal(5).__not__().__nonzero__()) {
                frame.setlocal(5, s$42);
            }
            return frame.getlocal(5);
        }
        
        private static PyObject _getShellEnv$10(PyFrame frame) {
            frame.setlocal(3, frame.getglobal("None"));
            frame.setlocal(6, frame.getglobal("None"));
            frame.setlocal(4, frame.getglobal("None"));
            frame.setlocal(1, frame.getglobal("sys").__getattr__("registry").__getattr__("getProperty").__call__(s$43, s$44));
            if (frame.getlocal(1)._eq(s$44).__nonzero__()) {
                frame.setlocal(0, frame.getglobal("_getOsType").__call__());
                if (frame.getlocal(0)._eq(s$25).__nonzero__()) {
                    frame.setlocal(3, new PyList(new PyObject[] {s$45, s$46}));
                    frame.setlocal(6, s$47);
                    frame.setlocal(4, frame.getglobal("string").__getattr__("upper"));
                }
                else {
                    if (frame.getlocal(0)._eq(s$34).__nonzero__()) {
                        frame.setlocal(3, new PyList(new PyObject[] {s$48, s$46}));
                        frame.setlocal(6, s$47);
                        frame.setlocal(4, frame.getglobal("string").__getattr__("upper"));
                    }
                    else {
                        if (frame.getlocal(0)._eq(s$42).__nonzero__()) {
                            frame.setlocal(3, new PyList(new PyObject[] {s$49, s$50}));
                            frame.setlocal(6, s$51);
                        }
                        else {
                            if (frame.getlocal(0)._eq(s$38).__nonzero__()) {
                                frame.setlocal(5, s$52);
                                frame.setlocal(2, s$53);
                            }
                            else {
                                if (frame.getlocal(0)._eq(s$41).__nonzero__()) {
                                    // pass
                                }
                            }
                        }
                    }
                }
            }
            return frame.getglobal("_ShellEnv").__call__(frame.getlocal(3), frame.getlocal(6), frame.getlocal(4));
        }
        
        private static PyObject main$11(PyFrame frame) {
            frame.setglobal("__file__", s$54);
            
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            
            // Code
            /* 
            Implement subshell functionality for Jython.
            
            This is mostly to provide the environ object for the os module,
            and subshell execution functionality for os.system and popen* functions.
            
            javashell attempts to determine a suitable command shell for the host
            operating system, and uses that shell to determine environment variables
            and to provide subshell execution functionality.
             */
            t$0$PyObject__ = org.python.core.imp.importFrom("java.lang", new String[] {"System", "Runtime"}, frame);
            frame.setlocal("System", t$0$PyObject__[0]);
            frame.setlocal("Runtime", t$0$PyObject__[1]);
            t$0$PyObject__ = null;
            t$0$PyObject__ = org.python.core.imp.importFrom("java.io", new String[] {"IOException"}, frame);
            frame.setlocal("IOException", t$0$PyObject__[0]);
            t$0$PyObject__ = null;
            t$0$PyObject__ = org.python.core.imp.importFrom("java.io", new String[] {"InputStreamReader"}, frame);
            frame.setlocal("InputStreamReader", t$0$PyObject__[0]);
            t$0$PyObject__ = null;
            t$0$PyObject__ = org.python.core.imp.importFrom("java.io", new String[] {"BufferedReader"}, frame);
            frame.setlocal("BufferedReader", t$0$PyObject__[0]);
            t$0$PyObject__ = null;
            t$0$PyObject__ = org.python.core.imp.importFrom("UserDict", new String[] {"UserDict"}, frame);
            frame.setlocal("UserDict", t$0$PyObject__[0]);
            t$0$PyObject__ = null;
            frame.setlocal("jarray", org.python.core.imp.importOne("jarray", frame));
            frame.setlocal("string", org.python.core.imp.importOne("string", frame));
            frame.setlocal("sys", org.python.core.imp.importOne("sys", frame));
            frame.setlocal("types", org.python.core.imp.importOne("types", frame));
            t$0$PyObject__ = org.python.core.imp.importFrom("javaos", new String[] {"LazyDict"}, frame);
            frame.setlocal("LazyDict", t$0$PyObject__[0]);
            t$0$PyObject__ = null;
            frame.setlocal("__all__", new PyList(new PyObject[] {s$1, s$2, s$3, s$4}));
            frame.setlocal("__warn", new PyFunction(frame.f_globals, new PyObject[] {}, c$0___warn));
            frame.setlocal("_ShellEnv", Py.makeClass("_ShellEnv", new PyObject[] {}, c$6__ShellEnv, null));
            frame.setlocal("_getOsType", new PyFunction(frame.f_globals, new PyObject[] {frame.getname("None")}, c$7__getOsType));
            frame.setlocal("_getShellEnv", new PyFunction(frame.f_globals, new PyObject[] {}, c$8__getShellEnv));
            frame.setlocal("_shellEnv", frame.getname("_getShellEnv").__call__());
            frame.setlocal("shellexecute", frame.getname("_shellEnv").__getattr__("execute"));
            return Py.None;
        }
        
    }
    public static void moduleDictInit(PyObject dict) {
        dict.__setitem__("__name__", new PyString("javashell"));
        Py.runCode(new _PyInner().getMain(), dict, dict);
    }
    
    public static void main(String[] args) throws java.lang.Exception {
        String[] newargs = new String[args.length+1];
        newargs[0] = "javashell";
        java.lang.System.arraycopy(args, 0, newargs, 1, args.length);
        Py.runMain(javashell._PyInner.class, newargs, javashell.jpy$packages, javashell.jpy$mainProperties, "", new String[] {"string", "random", "traceback", "sre_compile", "atexit", "warnings", "popen2", "getopt", "sre", "sre_constants", "StringIO", "QAsystem", "javaos", "repr", "copy_reg", "re", "linecache", "javapath", "UserDict", "copy", "threading", "stat", "sre_parse", "javashell"});
    }
    
}

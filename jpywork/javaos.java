import org.python.core.*;

public class javaos extends java.lang.Object {
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
        private static PyObject s$25;
        private static PyObject s$26;
        private static PyObject s$27;
        private static PyObject i$28;
        private static PyObject s$29;
        private static PyObject i$30;
        private static PyObject i$31;
        private static PyObject s$32;
        private static PyObject s$33;
        private static PyObject i$34;
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
        private static PyObject s$55;
        private static PyObject s$56;
        private static PyObject s$57;
        private static PyObject s$58;
        private static PyObject s$59;
        private static PyObject f$60;
        private static PyObject s$61;
        private static PyObject s$62;
        private static PyObject s$63;
        private static PyObject s$64;
        private static PyObject s$65;
        private static PyObject s$66;
        private static PyObject s$67;
        private static PyObject s$68;
        private static PyObject s$69;
        private static PyObject s$70;
        private static PyObject s$71;
        private static PyObject s$72;
        private static PyObject s$73;
        private static PyObject s$74;
        private static PyFunctionTable funcTable;
        private static PyCode c$0___init__;
        private static PyCode c$1___getitem__;
        private static PyCode c$2___setitem__;
        private static PyCode c$3___setattr__;
        private static PyCode c$4___len__;
        private static PyCode c$5___cmp__;
        private static PyCode c$6_stat_result;
        private static PyCode c$7__exit;
        private static PyCode c$8_getcwd;
        private static PyCode c$9_chdir;
        private static PyCode c$10_listdir;
        private static PyCode c$11_mkdir;
        private static PyCode c$12_makedirs;
        private static PyCode c$13_remove;
        private static PyCode c$14_rename;
        private static PyCode c$15_rmdir;
        private static PyCode c$16_stat;
        private static PyCode c$17_utime;
        private static PyCode c$18_lambda;
        private static PyCode c$19_lambda;
        private static PyCode c$20___init__;
        private static PyCode c$21___populate;
        private static PyCode c$22___repr__;
        private static PyCode c$23___cmp__;
        private static PyCode c$24___len__;
        private static PyCode c$25___getitem__;
        private static PyCode c$26___setitem__;
        private static PyCode c$27___delitem__;
        private static PyCode c$28_clear;
        private static PyCode c$29_copy;
        private static PyCode c$30_keys;
        private static PyCode c$31_items;
        private static PyCode c$32_values;
        private static PyCode c$33_has_key;
        private static PyCode c$34_update;
        private static PyCode c$35_get;
        private static PyCode c$36_setdefault;
        private static PyCode c$37_popitem;
        private static PyCode c$38_pop;
        private static PyCode c$39_iteritems;
        private static PyCode c$40_iterkeys;
        private static PyCode c$41_itervalues;
        private static PyCode c$42___contains__;
        private static PyCode c$43_LazyDict;
        private static PyCode c$44__getEnvironment;
        private static PyCode c$45_getenv;
        private static PyCode c$46_system;
        private static PyCode c$47_popen;
        private static PyCode c$48_popen2;
        private static PyCode c$49_popen3;
        private static PyCode c$50_popen4;
        private static PyCode c$51_getlogin;
        private static PyCode c$52_main;
        private static void initConstants() {
            s$0 = Py.newString("OS routines for Java, with some attempts to support DOS, NT, and\012Posix functionality.\012\012This exports:\012  - all functions from posix, nt, dos, os2, mac, or ce, e.g. unlink, stat, etc.\012  - os.path is one of the modules posixpath, ntpath, macpath, or dospath\012  - os.name is 'posix', 'nt', 'dos', 'os2', 'mac', 'ce' or 'riscos'\012  - os.curdir is a string representing the current directory ('.' or ':')\012  - os.pardir is a string representing the parent directory ('..' or '::')\012  - os.sep is the (or a most common) pathname separator ('/' or ':' or '\\\\')\012  - os.altsep is the alternate pathname separator (None or '/')\012  - os.pathsep is the component separator used in $PATH etc\012  - os.linesep is the line separator in text files ('\\r' or '\\n' or '\\r\\n')\012  - os.defpath is the default search path for executables\012\012Programs that import and use 'os' stand a better chance of being\012portable between different platforms.  Of course, they must then\012only use functions that are defined by all platforms (e.g., unlink\012and opendir), and leave all pathname manipulation to os.path\012(e.g., split and join).\012");
            s$1 = Py.newString("altsep");
            s$2 = Py.newString("curdir");
            s$3 = Py.newString("pardir");
            s$4 = Py.newString("sep");
            s$5 = Py.newString("pathsep");
            s$6 = Py.newString("linesep");
            s$7 = Py.newString("defpath");
            s$8 = Py.newString("name");
            s$9 = Py.newString("system");
            s$10 = Py.newString("environ");
            s$11 = Py.newString("putenv");
            s$12 = Py.newString("getenv");
            s$13 = Py.newString("popen");
            s$14 = Py.newString("popen2");
            s$15 = Py.newString("popen3");
            s$16 = Py.newString("popen4");
            s$17 = Py.newString("getlogin");
            s$18 = Py.newString("st_mode");
            s$19 = Py.newString("st_ino");
            s$20 = Py.newString("st_dev");
            s$21 = Py.newString("st_nlink");
            s$22 = Py.newString("st_uid");
            s$23 = Py.newString("st_gid");
            s$24 = Py.newString("st_size");
            s$25 = Py.newString("st_atime");
            s$26 = Py.newString("st_mtime");
            s$27 = Py.newString("st_ctime");
            i$28 = Py.newInteger(10);
            s$29 = Py.newString("stat_result() takes an a  10-sequence");
            i$30 = Py.newInteger(0);
            i$31 = Py.newInteger(9);
            s$32 = Py.newString("object doesn't support item assignment");
            s$33 = Py.newString("readonly attribute");
            i$34 = Py.newInteger(1);
            s$35 = Py.newString("java");
            s$36 = Py.newString(".");
            s$37 = Py.newString("..");
            s$38 = Py.newString("line.separator");
            s$39 = Py.newString("/");
            s$40 = Py.newString("_exit(status)\012\012    Exit to the system with specified status, without normal exit\012    processing.\012    ");
            s$41 = Py.newString("getcwd() -> path\012\012    Return a string representing the current working directory.\012    ");
            s$42 = Py.newString("foo");
            s$43 = Py.newString("chdir(path)\012\012    Change the current working directory to the specified path.\012    ");
            s$44 = Py.newString("chdir not supported in Java");
            s$45 = Py.newString("listdir(path) -> list_of_strings\012\012    Return a list containing the names of the entries in the directory.\012\012        path: path of directory to list\012\012    The list is in arbitrary order.  It does not include the special\012    entries '.' and '..' even if they are present in the directory.\012    ");
            s$46 = Py.newString("No such directory");
            s$47 = Py.newString("mkdir(path [, mode=0777])\012\012    Create a directory.\012\012    The optional parameter is currently ignored.\012    ");
            s$48 = Py.newString("couldn't make directory");
            s$49 = Py.newString("ignored");
            s$50 = Py.newString("makedirs(path [, mode=0777])\012\012    Super-mkdir; create a leaf directory and all intermediate ones.\012\012    Works like mkdir, except that any intermediate path segment (not\012    just the rightmost) will be created if it does not exist.\012    The optional parameter is currently ignored.\012    ");
            s$51 = Py.newString("couldn't make directories");
            s$52 = Py.newString("remove(path)\012\012    Remove a file (same as unlink(path)).\012    ");
            s$53 = Py.newString("couldn't delete file");
            s$54 = Py.newString("rename(old, new)\012\012    Rename a file or directory.\012    ");
            s$55 = Py.newString("couldn't rename file");
            s$56 = Py.newString("rmdir(path)\012\012    Remove a directory.");
            s$57 = Py.newString("couldn't delete directory");
            s$58 = Py.newString("stat(path) -> stat result\012\012    Perform a stat system call on the given path.\012\012    The Java stat implementation only returns a small subset of\012    the standard fields: size, modification time and change time.\012    ");
            s$59 = Py.newString("No such file or directory");
            f$60 = Py.newFloat(1000.0);
            s$61 = Py.newString("utime(path, (atime, mtime))\012    utime(path, None)\012\012    Set the access and modified time of the file to the given values.\012    If the second form is used, set the access and modified times to the\012    current time.\012\012    Due to java limitations only the modification time is changed.\012    ");
            s$62 = Py.newString("setLastModified");
            s$63 = Py.newString("A lazy-populating User Dictionary.\012    Lazy initialization is not thread-safe.\012    ");
            s$64 = Py.newString("dict: starting dictionary of values\012        populate: function that returns the populated dictionary\012        keyTransform: function to normalize the keys (e.g., toupper/None)\012        ");
            s$65 = Py.newString("Get an environment variable, return None if it doesn't exist.\012\012    The optional second argument can specify an alternate default.\012    ");
            s$66 = Py.newString("system(command) -> exit_status\012\012    Execute the command (a string) in a subshell.\012    ");
            s$67 = Py.newString("popen(command [, mode='r' [, bufsize]]) -> pipe\012\012    Open a pipe to/from a command returning a file object.\012    ");
            s$68 = Py.newString("Execute the shell command cmd in a sub-process.\012\012    On UNIX, 'cmd' may be a sequence, in which case arguments will be\012    passed directly to the program without shell intervention (as with\012    os.spawnv()).  If 'cmd' is a string it will be passed to the shell\012    (as with os.system()).  If 'bufsize' is specified, it sets the\012    buffer size for the I/O pipes.  The file objects (child_stdin,\012    child_stdout) are returned.\012    ");
            s$69 = Py.newString("t");
            s$70 = Py.newString("Execute the shell command 'cmd' in a sub-process.\012\012    On UNIX, 'cmd' may be a sequence, in which case arguments will be\012    passed directly to the program without shell intervention\012    (as with os.spawnv()).  If 'cmd' is a string it will be passed\012    to the shell (as with os.system()).  If 'bufsize' is specified,\012    it sets the buffer size for the I/O pipes.  The file objects\012    (child_stdin, child_stdout, child_stderr) are returned.\012    ");
            s$71 = Py.newString("Execute the shell command 'cmd' in a sub-process.\012\012    On UNIX, 'cmd' may be a sequence, in which case arguments will be\012    passed directly to the program without shell intervention\012    (as with os.spawnv()).  If 'cmd' is a string it will be passed\012    to the shell (as with os.system()).  If 'bufsize' is specified,\012    it sets the buffer size for the I/O pipes.  The file objects\012    (child_stdin, child_stdout_stderr) are returned.\012    ");
            s$72 = Py.newString("getlogin() -> string\012\012    Return the actual login name.\012    ");
            s$73 = Py.newString("user.name");
            s$74 = Py.newString("F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py");
            funcTable = new _PyInner();
            c$0___init__ = Py.newCode(2, new String[] {"self", "results", "index", "name"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "__init__", false, false, funcTable, 1, null, null, 0, 17);
            c$1___getitem__ = Py.newCode(2, new String[] {"self", "i"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "__getitem__", false, false, funcTable, 2, null, null, 0, 17);
            c$2___setitem__ = Py.newCode(3, new String[] {"self", "x", "value"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "__setitem__", false, false, funcTable, 3, null, null, 0, 17);
            c$3___setattr__ = Py.newCode(3, new String[] {"self", "name", "value", "x", "_[1]"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "__setattr__", false, false, funcTable, 4, null, null, 0, 17);
            c$4___len__ = Py.newCode(1, new String[] {"self"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "__len__", false, false, funcTable, 5, null, null, 0, 17);
            c$5___cmp__ = Py.newCode(2, new String[] {"self", "other"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "__cmp__", false, false, funcTable, 6, null, null, 0, 17);
            c$6_stat_result = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "stat_result", false, false, funcTable, 7, null, null, 0, 16);
            c$7__exit = Py.newCode(1, new String[] {"n"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "_exit", false, false, funcTable, 8, null, null, 0, 17);
            c$8_getcwd = Py.newCode(0, new String[] {"foo"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "getcwd", false, false, funcTable, 9, null, null, 0, 17);
            c$9_chdir = Py.newCode(1, new String[] {"path"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "chdir", false, false, funcTable, 10, null, null, 0, 17);
            c$10_listdir = Py.newCode(1, new String[] {"path", "l"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "listdir", false, false, funcTable, 11, null, null, 0, 17);
            c$11_mkdir = Py.newCode(2, new String[] {"path", "mode"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "mkdir", false, false, funcTable, 12, null, null, 0, 17);
            c$12_makedirs = Py.newCode(2, new String[] {"path", "mode"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "makedirs", false, false, funcTable, 13, null, null, 0, 17);
            c$13_remove = Py.newCode(1, new String[] {"path"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "remove", false, false, funcTable, 14, null, null, 0, 17);
            c$14_rename = Py.newCode(2, new String[] {"path", "newpath"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "rename", false, false, funcTable, 15, null, null, 0, 17);
            c$15_rmdir = Py.newCode(1, new String[] {"path"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "rmdir", false, false, funcTable, 16, null, null, 0, 17);
            c$16_stat = Py.newCode(1, new String[] {"path", "mtime", "size", "f"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "stat", false, false, funcTable, 17, null, null, 0, 17);
            c$17_utime = Py.newCode(2, new String[] {"path", "times", "mtime"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "utime", false, false, funcTable, 18, null, null, 0, 17);
            c$18_lambda = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "<lambda>", false, false, funcTable, 19, null, null, 0, 17);
            c$19_lambda = Py.newCode(1, new String[] {"key"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "<lambda>", false, false, funcTable, 20, null, null, 0, 17);
            c$20___init__ = Py.newCode(4, new String[] {"self", "dict", "populate", "keyTransform"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "__init__", false, false, funcTable, 21, null, null, 0, 17);
            c$21___populate = Py.newCode(1, new String[] {"self"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "__populate", false, false, funcTable, 22, null, null, 0, 17);
            c$22___repr__ = Py.newCode(1, new String[] {"self"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "__repr__", false, false, funcTable, 23, null, null, 0, 17);
            c$23___cmp__ = Py.newCode(2, new String[] {"self", "dict"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "__cmp__", false, false, funcTable, 24, null, null, 0, 17);
            c$24___len__ = Py.newCode(1, new String[] {"self"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "__len__", false, false, funcTable, 25, null, null, 0, 17);
            c$25___getitem__ = Py.newCode(2, new String[] {"self", "key"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "__getitem__", false, false, funcTable, 26, null, null, 0, 17);
            c$26___setitem__ = Py.newCode(3, new String[] {"self", "key", "item"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "__setitem__", false, false, funcTable, 27, null, null, 0, 17);
            c$27___delitem__ = Py.newCode(2, new String[] {"self", "key"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "__delitem__", false, false, funcTable, 28, null, null, 0, 17);
            c$28_clear = Py.newCode(1, new String[] {"self"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "clear", false, false, funcTable, 29, null, null, 0, 17);
            c$29_copy = Py.newCode(1, new String[] {"self"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "copy", false, false, funcTable, 30, null, null, 0, 17);
            c$30_keys = Py.newCode(1, new String[] {"self"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "keys", false, false, funcTable, 31, null, null, 0, 17);
            c$31_items = Py.newCode(1, new String[] {"self"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "items", false, false, funcTable, 32, null, null, 0, 17);
            c$32_values = Py.newCode(1, new String[] {"self"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "values", false, false, funcTable, 33, null, null, 0, 17);
            c$33_has_key = Py.newCode(2, new String[] {"self", "key"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "has_key", false, false, funcTable, 34, null, null, 0, 17);
            c$34_update = Py.newCode(2, new String[] {"self", "dict"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "update", false, false, funcTable, 35, null, null, 0, 17);
            c$35_get = Py.newCode(3, new String[] {"self", "key", "failobj"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "get", false, false, funcTable, 36, null, null, 0, 17);
            c$36_setdefault = Py.newCode(3, new String[] {"self", "key", "failobj"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "setdefault", false, false, funcTable, 37, null, null, 0, 17);
            c$37_popitem = Py.newCode(1, new String[] {"self"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "popitem", false, false, funcTable, 38, null, null, 0, 17);
            c$38_pop = Py.newCode(2, new String[] {"self", "args"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "pop", true, false, funcTable, 39, null, null, 0, 17);
            c$39_iteritems = Py.newCode(1, new String[] {"self"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "iteritems", false, false, funcTable, 40, null, null, 0, 17);
            c$40_iterkeys = Py.newCode(1, new String[] {"self"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "iterkeys", false, false, funcTable, 41, null, null, 0, 17);
            c$41_itervalues = Py.newCode(1, new String[] {"self"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "itervalues", false, false, funcTable, 42, null, null, 0, 17);
            c$42___contains__ = Py.newCode(2, new String[] {"self", "key"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "__contains__", false, false, funcTable, 43, null, null, 0, 17);
            c$43_LazyDict = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "LazyDict", false, false, funcTable, 44, null, null, 0, 16);
            c$44__getEnvironment = Py.newCode(0, new String[] {"javashell"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "_getEnvironment", false, false, funcTable, 45, null, null, 0, 17);
            c$45_getenv = Py.newCode(2, new String[] {"key", "default"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "getenv", false, false, funcTable, 46, null, null, 0, 17);
            c$46_system = Py.newCode(2, new String[] {"args", "kwargs", "popen2"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "system", true, true, funcTable, 47, null, null, 0, 17);
            c$47_popen = Py.newCode(2, new String[] {"args", "kwargs", "popen2"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "popen", true, true, funcTable, 48, null, null, 0, 17);
            c$48_popen2 = Py.newCode(3, new String[] {"cmd", "mode", "bufsize", "stdout", "popen2", "stdin"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "popen2", false, false, funcTable, 49, null, null, 0, 17);
            c$49_popen3 = Py.newCode(3, new String[] {"cmd", "mode", "bufsize", "stdout", "stderr", "popen2", "stdin"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "popen3", false, false, funcTable, 50, null, null, 0, 17);
            c$50_popen4 = Py.newCode(3, new String[] {"cmd", "mode", "bufsize", "stdout", "popen2", "stdin"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "popen4", false, false, funcTable, 51, null, null, 0, 17);
            c$51_getlogin = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "getlogin", false, false, funcTable, 52, null, null, 0, 17);
            c$52_main = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javaos.py", "main", false, false, funcTable, 53, null, null, 0, 16);
        }
        
        
        public PyCode getMain() {
            if (c$52_main == null) _PyInner.initConstants();
            return c$52_main;
        }
        
        public PyObject call_function(int index, PyFrame frame) {
            switch (index){
                case 0:
                return _PyInner.__listcomprehension$1(frame);
                case 1:
                return _PyInner.__init__$2(frame);
                case 2:
                return _PyInner.__getitem__$3(frame);
                case 3:
                return _PyInner.__setitem__$4(frame);
                case 4:
                return _PyInner.__setattr__$5(frame);
                case 5:
                return _PyInner.__len__$6(frame);
                case 6:
                return _PyInner.__cmp__$7(frame);
                case 7:
                return _PyInner.stat_result$8(frame);
                case 8:
                return _PyInner._exit$9(frame);
                case 9:
                return _PyInner.getcwd$10(frame);
                case 10:
                return _PyInner.chdir$11(frame);
                case 11:
                return _PyInner.listdir$12(frame);
                case 12:
                return _PyInner.mkdir$13(frame);
                case 13:
                return _PyInner.makedirs$14(frame);
                case 14:
                return _PyInner.remove$15(frame);
                case 15:
                return _PyInner.rename$16(frame);
                case 16:
                return _PyInner.rmdir$17(frame);
                case 17:
                return _PyInner.stat$18(frame);
                case 18:
                return _PyInner.utime$19(frame);
                case 19:
                return _PyInner.lambda$20(frame);
                case 20:
                return _PyInner.lambda$21(frame);
                case 21:
                return _PyInner.__init__$22(frame);
                case 22:
                return _PyInner.__populate$23(frame);
                case 23:
                return _PyInner.__repr__$24(frame);
                case 24:
                return _PyInner.__cmp__$25(frame);
                case 25:
                return _PyInner.__len__$26(frame);
                case 26:
                return _PyInner.__getitem__$27(frame);
                case 27:
                return _PyInner.__setitem__$28(frame);
                case 28:
                return _PyInner.__delitem__$29(frame);
                case 29:
                return _PyInner.clear$30(frame);
                case 30:
                return _PyInner.copy$31(frame);
                case 31:
                return _PyInner.keys$32(frame);
                case 32:
                return _PyInner.items$33(frame);
                case 33:
                return _PyInner.values$34(frame);
                case 34:
                return _PyInner.has_key$35(frame);
                case 35:
                return _PyInner.update$36(frame);
                case 36:
                return _PyInner.get$37(frame);
                case 37:
                return _PyInner.setdefault$38(frame);
                case 38:
                return _PyInner.popitem$39(frame);
                case 39:
                return _PyInner.pop$40(frame);
                case 40:
                return _PyInner.iteritems$41(frame);
                case 41:
                return _PyInner.iterkeys$42(frame);
                case 42:
                return _PyInner.itervalues$43(frame);
                case 43:
                return _PyInner.__contains__$44(frame);
                case 44:
                return _PyInner.LazyDict$45(frame);
                case 45:
                return _PyInner._getEnvironment$46(frame);
                case 46:
                return _PyInner.getenv$47(frame);
                case 47:
                return _PyInner.system$48(frame);
                case 48:
                return _PyInner.popen$49(frame);
                case 49:
                return _PyInner.popen2$50(frame);
                case 50:
                return _PyInner.popen3$51(frame);
                case 51:
                return _PyInner.popen4$52(frame);
                case 52:
                return _PyInner.getlogin$53(frame);
                case 53:
                return _PyInner.main$54(frame);
                default:
                return null;
            }
        }
        
        private static PyObject __listcomprehension$1(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject, t$1$PyObject, t$2$PyObject, t$3$PyObject;
            
            t$0$PyObject = new PyList(new PyObject[] {});
            frame.setlocal(4, t$0$PyObject.__getattr__("append"));
            t$2$PyObject = frame.getglobal("stat_result").__getattr__("_stat_members").__iter__();
            while ((t$3$PyObject = t$2$PyObject.__iternext__()) != null) {
                frame.setlocal(3, t$3$PyObject);
                frame.getlocal(4).__call__(frame.getlocal(3).__getitem__(i$30));
            }
            return t$0$PyObject;
        }
        
        private static PyObject __init__$2(PyFrame frame) {
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            PyObject t$0$PyObject, t$1$PyObject;
            
            // Code
            if (frame.getglobal("len").__call__(frame.getlocal(1))._ne(i$28).__nonzero__()) {
                throw Py.makeException(frame.getglobal("TypeError").__call__(s$29));
            }
            t$0$PyObject = frame.getglobal("stat_result").__getattr__("_stat_members").__iter__();
            while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                t$0$PyObject__ = org.python.core.Py.unpackSequence(t$1$PyObject, 2);
                frame.setlocal(3, t$0$PyObject__[0]);
                frame.setlocal(2, t$0$PyObject__[1]);
                frame.getlocal(0).__getattr__("__dict__").__setitem__(frame.getlocal(3), frame.getlocal(1).__getitem__(frame.getlocal(2)));
            }
            return Py.None;
        }
        
        private static PyObject __getitem__$3(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject;
            
            // Code
            if (((t$0$PyObject = frame.getlocal(1)._lt(i$30)).__nonzero__() ? t$0$PyObject : frame.getlocal(1)._gt(i$31)).__nonzero__()) {
                throw Py.makeException(frame.getglobal("IndexError").__call__(frame.getlocal(1)));
            }
            return frame.getglobal("getattr").__call__(frame.getlocal(0), frame.getglobal("stat_result").__getattr__("_stat_members").__getitem__(frame.getlocal(1)).__getitem__(i$30));
        }
        
        private static PyObject __setitem__$4(PyFrame frame) {
            throw Py.makeException(frame.getglobal("TypeError").__call__(s$32));
        }
        
        private static PyObject __setattr__$5(PyFrame frame) {
            if (frame.getlocal(1)._in(__listcomprehension$1(frame)).__nonzero__()) {
                throw Py.makeException(frame.getglobal("TypeError").__call__(frame.getlocal(1)));
            }
            throw Py.makeException(frame.getglobal("AttributeError").__call__(s$33));
        }
        
        private static PyObject __len__$6(PyFrame frame) {
            return i$28;
        }
        
        private static PyObject __cmp__$7(PyFrame frame) {
            if (frame.getglobal("isinstance").__call__(frame.getlocal(1), frame.getglobal("stat_result")).__not__().__nonzero__()) {
                return i$34;
            }
            return frame.getglobal("cmp").__call__(frame.getlocal(0).__getattr__("__dict__"), frame.getlocal(1).__getattr__("__dict__"));
        }
        
        private static PyObject stat_result$8(PyFrame frame) {
            frame.setlocal("_stat", org.python.core.imp.importOneAs("stat", frame));
            frame.setlocal("_stat_members", new PyTuple(new PyObject[] {new PyTuple(new PyObject[] {s$18, frame.getname("_stat").__getattr__("ST_MODE")}), new PyTuple(new PyObject[] {s$19, frame.getname("_stat").__getattr__("ST_INO")}), new PyTuple(new PyObject[] {s$20, frame.getname("_stat").__getattr__("ST_DEV")}), new PyTuple(new PyObject[] {s$21, frame.getname("_stat").__getattr__("ST_NLINK")}), new PyTuple(new PyObject[] {s$22, frame.getname("_stat").__getattr__("ST_UID")}), new PyTuple(new PyObject[] {s$23, frame.getname("_stat").__getattr__("ST_GID")}), new PyTuple(new PyObject[] {s$24, frame.getname("_stat").__getattr__("ST_SIZE")}), new PyTuple(new PyObject[] {s$25, frame.getname("_stat").__getattr__("ST_ATIME")}), new PyTuple(new PyObject[] {s$26, frame.getname("_stat").__getattr__("ST_MTIME")}), new PyTuple(new PyObject[] {s$27, frame.getname("_stat").__getattr__("ST_CTIME")})}));
            frame.setlocal("__init__", new PyFunction(frame.f_globals, new PyObject[] {}, c$0___init__));
            frame.setlocal("__getitem__", new PyFunction(frame.f_globals, new PyObject[] {}, c$1___getitem__));
            frame.setlocal("__setitem__", new PyFunction(frame.f_globals, new PyObject[] {}, c$2___setitem__));
            frame.setlocal("__setattr__", new PyFunction(frame.f_globals, new PyObject[] {}, c$3___setattr__));
            frame.setlocal("__len__", new PyFunction(frame.f_globals, new PyObject[] {}, c$4___len__));
            frame.setlocal("__cmp__", new PyFunction(frame.f_globals, new PyObject[] {}, c$5___cmp__));
            return frame.getf_locals();
        }
        
        private static PyObject _exit$9(PyFrame frame) {
            /* _exit(status)
            
                Exit to the system with specified status, without normal exit
                processing.
                 */
            frame.getglobal("java").__getattr__("lang").__getattr__("System").__getattr__("exit").__call__(frame.getlocal(0));
            return Py.None;
        }
        
        private static PyObject getcwd$10(PyFrame frame) {
            /* getcwd() -> path
            
                Return a string representing the current working directory.
                 */
            frame.setlocal(0, frame.getglobal("File").__call__(frame.getglobal("File").__call__(s$42).invoke("getAbsolutePath")));
            return frame.getlocal(0).invoke("getParent");
        }
        
        private static PyObject chdir$11(PyFrame frame) {
            /* chdir(path)
            
                Change the current working directory to the specified path.
                 */
            throw Py.makeException(frame.getglobal("OSError").__call__(i$30, s$44, frame.getlocal(0)));
        }
        
        private static PyObject listdir$12(PyFrame frame) {
            /* listdir(path) -> list_of_strings
            
                Return a list containing the names of the entries in the directory.
            
                    path: path of directory to list
            
                The list is in arbitrary order.  It does not include the special
                entries '.' and '..' even if they are present in the directory.
                 */
            frame.setlocal(1, frame.getglobal("File").__call__(frame.getlocal(0)).invoke("list"));
            if (frame.getlocal(1)._is(frame.getglobal("None")).__nonzero__()) {
                throw Py.makeException(frame.getglobal("OSError").__call__(i$30, s$46, frame.getlocal(0)));
            }
            return frame.getglobal("list").__call__(frame.getlocal(1));
        }
        
        private static PyObject mkdir$13(PyFrame frame) {
            /* mkdir(path [, mode=0777])
            
                Create a directory.
            
                The optional parameter is currently ignored.
                 */
            if (frame.getglobal("File").__call__(frame.getlocal(0)).invoke("mkdir").__not__().__nonzero__()) {
                throw Py.makeException(frame.getglobal("OSError").__call__(i$30, s$48, frame.getlocal(0)));
            }
            return Py.None;
        }
        
        private static PyObject makedirs$14(PyFrame frame) {
            /* makedirs(path [, mode=0777])
            
                Super-mkdir; create a leaf directory and all intermediate ones.
            
                Works like mkdir, except that any intermediate path segment (not
                just the rightmost) will be created if it does not exist.
                The optional parameter is currently ignored.
                 */
            if (frame.getglobal("File").__call__(frame.getlocal(0)).invoke("mkdirs").__not__().__nonzero__()) {
                throw Py.makeException(frame.getglobal("OSError").__call__(i$30, s$51, frame.getlocal(0)));
            }
            return Py.None;
        }
        
        private static PyObject remove$15(PyFrame frame) {
            /* remove(path)
            
                Remove a file (same as unlink(path)).
                 */
            if (frame.getglobal("File").__call__(frame.getlocal(0)).invoke("delete").__not__().__nonzero__()) {
                throw Py.makeException(frame.getglobal("OSError").__call__(i$30, s$53, frame.getlocal(0)));
            }
            return Py.None;
        }
        
        private static PyObject rename$16(PyFrame frame) {
            /* rename(old, new)
            
                Rename a file or directory.
                 */
            if (frame.getglobal("File").__call__(frame.getlocal(0)).invoke("renameTo", frame.getglobal("File").__call__(frame.getlocal(1))).__not__().__nonzero__()) {
                throw Py.makeException(frame.getglobal("OSError").__call__(i$30, s$55, frame.getlocal(0)));
            }
            return Py.None;
        }
        
        private static PyObject rmdir$17(PyFrame frame) {
            /* rmdir(path)
            
                Remove a directory. */
            if (frame.getglobal("File").__call__(frame.getlocal(0)).invoke("delete").__not__().__nonzero__()) {
                throw Py.makeException(frame.getglobal("OSError").__call__(i$30, s$57, frame.getlocal(0)));
            }
            return Py.None;
        }
        
        private static PyObject stat$18(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject;
            
            // Code
            /* stat(path) -> stat result
            
                Perform a stat system call on the given path.
            
                The Java stat implementation only returns a small subset of
                the standard fields: size, modification time and change time.
                 */
            frame.setlocal(3, frame.getglobal("File").__call__(frame.getlocal(0)));
            frame.setlocal(2, frame.getlocal(3).invoke("length"));
            if (((t$0$PyObject = frame.getlocal(2)._eq(i$30)).__nonzero__() ? frame.getlocal(3).invoke("exists").__not__() : t$0$PyObject).__nonzero__()) {
                throw Py.makeException(frame.getglobal("OSError").__call__(i$30, s$59, frame.getlocal(0)));
            }
            frame.setlocal(1, frame.getlocal(3).invoke("lastModified")._div(f$60));
            return frame.getglobal("stat_result").__call__(new PyTuple(new PyObject[] {i$30, i$30, i$30, i$30, i$30, i$30, frame.getlocal(2), frame.getlocal(1), frame.getlocal(1), i$30}));
        }
        
        private static PyObject utime$19(PyFrame frame) {
            /* utime(path, (atime, mtime))
                utime(path, None)
            
                Set the access and modified time of the file to the given values.
                If the second form is used, set the access and modified times to the
                current time.
            
                Due to java limitations only the modification time is changed.
                 */
            if (frame.getlocal(1)._isnot(frame.getglobal("None")).__nonzero__()) {
                frame.setlocal(2, frame.getlocal(1).__getitem__(i$34));
            }
            else {
                frame.setlocal(2, frame.getglobal("time").__getattr__("time").__call__());
            }
            if (frame.getglobal("hasattr").__call__(frame.getglobal("File"), s$62).__nonzero__()) {
                frame.getglobal("File").__call__(frame.getlocal(0)).invoke("setLastModified", frame.getglobal("long").__call__(frame.getlocal(2)._mul(f$60)));
            }
            return Py.None;
        }
        
        private static PyObject lambda$20(PyFrame frame) {
            return new PyDictionary(new PyObject[] {});
        }
        
        private static PyObject lambda$21(PyFrame frame) {
            return frame.getlocal(0);
        }
        
        private static PyObject __init__$22(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject;
            
            // Code
            /* dict: starting dictionary of values
                    populate: function that returns the populated dictionary
                    keyTransform: function to normalize the keys (e.g., toupper/None)
                     */
            frame.getglobal("UserDict").__getattr__("__init__").__call__(frame.getlocal(0), frame.getlocal(1));
            frame.getlocal(0).__setattr__("_populated", i$30);
            frame.getlocal(0).__setattr__("_LazyDict__populateFunc", (t$0$PyObject = frame.getlocal(2)).__nonzero__() ? t$0$PyObject : new PyFunction(frame.f_globals, new PyObject[] {}, c$18_lambda));
            frame.getlocal(0).__setattr__("_keyTransform", (t$0$PyObject = frame.getlocal(3)).__nonzero__() ? t$0$PyObject : new PyFunction(frame.f_globals, new PyObject[] {}, c$19_lambda));
            return Py.None;
        }
        
        private static PyObject __populate$23(PyFrame frame) {
            if (frame.getlocal(0).__getattr__("_populated").__not__().__nonzero__()) {
                frame.getlocal(0).__setattr__("data", frame.getlocal(0).invoke("_LazyDict__populateFunc"));
                frame.getlocal(0).__setattr__("_populated", i$34);
            }
            return Py.None;
        }
        
        private static PyObject __repr__$24(PyFrame frame) {
            frame.getlocal(0).invoke("_LazyDict__populate");
            return frame.getglobal("UserDict").__getattr__("__repr__").__call__(frame.getlocal(0));
        }
        
        private static PyObject __cmp__$25(PyFrame frame) {
            frame.getlocal(0).invoke("_LazyDict__populate");
            return frame.getglobal("UserDict").__getattr__("__cmp__").__call__(frame.getlocal(0), frame.getlocal(1));
        }
        
        private static PyObject __len__$26(PyFrame frame) {
            frame.getlocal(0).invoke("_LazyDict__populate");
            return frame.getglobal("UserDict").__getattr__("__len__").__call__(frame.getlocal(0));
        }
        
        private static PyObject __getitem__$27(PyFrame frame) {
            frame.getlocal(0).invoke("_LazyDict__populate");
            return frame.getglobal("UserDict").__getattr__("__getitem__").__call__(frame.getlocal(0), frame.getlocal(0).invoke("_keyTransform", frame.getlocal(1)));
        }
        
        private static PyObject __setitem__$28(PyFrame frame) {
            frame.getlocal(0).invoke("_LazyDict__populate");
            frame.getglobal("UserDict").__getattr__("__setitem__").__call__(frame.getlocal(0), frame.getlocal(0).invoke("_keyTransform", frame.getlocal(1)), frame.getlocal(2));
            return Py.None;
        }
        
        private static PyObject __delitem__$29(PyFrame frame) {
            frame.getlocal(0).invoke("_LazyDict__populate");
            frame.getglobal("UserDict").__getattr__("__delitem__").__call__(frame.getlocal(0), frame.getlocal(0).invoke("_keyTransform", frame.getlocal(1)));
            return Py.None;
        }
        
        private static PyObject clear$30(PyFrame frame) {
            frame.getlocal(0).invoke("_LazyDict__populate");
            frame.getglobal("UserDict").__getattr__("clear").__call__(frame.getlocal(0));
            return Py.None;
        }
        
        private static PyObject copy$31(PyFrame frame) {
            frame.getlocal(0).invoke("_LazyDict__populate");
            return frame.getglobal("UserDict").__getattr__("copy").__call__(frame.getlocal(0));
        }
        
        private static PyObject keys$32(PyFrame frame) {
            frame.getlocal(0).invoke("_LazyDict__populate");
            return frame.getglobal("UserDict").__getattr__("keys").__call__(frame.getlocal(0));
        }
        
        private static PyObject items$33(PyFrame frame) {
            frame.getlocal(0).invoke("_LazyDict__populate");
            return frame.getglobal("UserDict").__getattr__("items").__call__(frame.getlocal(0));
        }
        
        private static PyObject values$34(PyFrame frame) {
            frame.getlocal(0).invoke("_LazyDict__populate");
            return frame.getglobal("UserDict").__getattr__("values").__call__(frame.getlocal(0));
        }
        
        private static PyObject has_key$35(PyFrame frame) {
            frame.getlocal(0).invoke("_LazyDict__populate");
            return frame.getglobal("UserDict").__getattr__("has_key").__call__(frame.getlocal(0), frame.getlocal(0).invoke("_keyTransform", frame.getlocal(1)));
        }
        
        private static PyObject update$36(PyFrame frame) {
            frame.getlocal(0).invoke("_LazyDict__populate");
            frame.getglobal("UserDict").__getattr__("update").__call__(frame.getlocal(0), frame.getlocal(1));
            return Py.None;
        }
        
        private static PyObject get$37(PyFrame frame) {
            frame.getlocal(0).invoke("_LazyDict__populate");
            return frame.getglobal("UserDict").__getattr__("get").__call__(frame.getlocal(0), frame.getlocal(0).invoke("_keyTransform", frame.getlocal(1)), frame.getlocal(2));
        }
        
        private static PyObject setdefault$38(PyFrame frame) {
            frame.getlocal(0).invoke("_LazyDict__populate");
            return frame.getglobal("UserDict").__getattr__("setdefault").__call__(frame.getlocal(0), frame.getlocal(0).invoke("_keyTransform", frame.getlocal(1)), frame.getlocal(2));
        }
        
        private static PyObject popitem$39(PyFrame frame) {
            frame.getlocal(0).invoke("_LazyDict__populate");
            return frame.getglobal("UserDict").__getattr__("popitem").__call__(frame.getlocal(0));
        }
        
        private static PyObject pop$40(PyFrame frame) {
            frame.getlocal(0).invoke("_LazyDict__populate");
            return frame.getglobal("UserDict").__getattr__("pop")._callextra(new PyObject[] {frame.getlocal(0)}, new String[] {}, frame.getlocal(1), Py.None);
        }
        
        private static PyObject iteritems$41(PyFrame frame) {
            frame.getlocal(0).invoke("_LazyDict__populate");
            return frame.getglobal("UserDict").__getattr__("iteritems").__call__(frame.getlocal(0));
        }
        
        private static PyObject iterkeys$42(PyFrame frame) {
            frame.getlocal(0).invoke("_LazyDict__populate");
            return frame.getglobal("UserDict").__getattr__("iterkeys").__call__(frame.getlocal(0));
        }
        
        private static PyObject itervalues$43(PyFrame frame) {
            frame.getlocal(0).invoke("_LazyDict__populate");
            return frame.getglobal("UserDict").__getattr__("itervalues").__call__(frame.getlocal(0));
        }
        
        private static PyObject __contains__$44(PyFrame frame) {
            frame.getlocal(0).invoke("_LazyDict__populate");
            return frame.getglobal("UserDict").__getattr__("__contains__").__call__(frame.getlocal(0), frame.getlocal(1));
        }
        
        private static PyObject LazyDict$45(PyFrame frame) {
            /* A lazy-populating User Dictionary.
                Lazy initialization is not thread-safe.
                 */
            frame.setlocal("__init__", new PyFunction(frame.f_globals, new PyObject[] {frame.getname("None"), frame.getname("None"), frame.getname("None")}, c$20___init__));
            frame.setlocal("_LazyDict__populate", new PyFunction(frame.f_globals, new PyObject[] {}, c$21___populate));
            frame.setlocal("__repr__", new PyFunction(frame.f_globals, new PyObject[] {}, c$22___repr__));
            frame.setlocal("__cmp__", new PyFunction(frame.f_globals, new PyObject[] {}, c$23___cmp__));
            frame.setlocal("__len__", new PyFunction(frame.f_globals, new PyObject[] {}, c$24___len__));
            frame.setlocal("__getitem__", new PyFunction(frame.f_globals, new PyObject[] {}, c$25___getitem__));
            frame.setlocal("__setitem__", new PyFunction(frame.f_globals, new PyObject[] {}, c$26___setitem__));
            frame.setlocal("__delitem__", new PyFunction(frame.f_globals, new PyObject[] {}, c$27___delitem__));
            frame.setlocal("clear", new PyFunction(frame.f_globals, new PyObject[] {}, c$28_clear));
            frame.setlocal("copy", new PyFunction(frame.f_globals, new PyObject[] {}, c$29_copy));
            frame.setlocal("keys", new PyFunction(frame.f_globals, new PyObject[] {}, c$30_keys));
            frame.setlocal("items", new PyFunction(frame.f_globals, new PyObject[] {}, c$31_items));
            frame.setlocal("values", new PyFunction(frame.f_globals, new PyObject[] {}, c$32_values));
            frame.setlocal("has_key", new PyFunction(frame.f_globals, new PyObject[] {}, c$33_has_key));
            frame.setlocal("update", new PyFunction(frame.f_globals, new PyObject[] {}, c$34_update));
            frame.setlocal("get", new PyFunction(frame.f_globals, new PyObject[] {frame.getname("None")}, c$35_get));
            frame.setlocal("setdefault", new PyFunction(frame.f_globals, new PyObject[] {frame.getname("None")}, c$36_setdefault));
            frame.setlocal("popitem", new PyFunction(frame.f_globals, new PyObject[] {}, c$37_popitem));
            frame.setlocal("pop", new PyFunction(frame.f_globals, new PyObject[] {}, c$38_pop));
            frame.setlocal("iteritems", new PyFunction(frame.f_globals, new PyObject[] {}, c$39_iteritems));
            frame.setlocal("iterkeys", new PyFunction(frame.f_globals, new PyObject[] {}, c$40_iterkeys));
            frame.setlocal("itervalues", new PyFunction(frame.f_globals, new PyObject[] {}, c$41_itervalues));
            frame.setlocal("__contains__", new PyFunction(frame.f_globals, new PyObject[] {}, c$42___contains__));
            return frame.getf_locals();
        }
        
        private static PyObject _getEnvironment$46(PyFrame frame) {
            frame.setlocal(0, org.python.core.imp.importOne("javashell", frame));
            return frame.getlocal(0).__getattr__("_shellEnv").__getattr__("environment");
        }
        
        private static PyObject getenv$47(PyFrame frame) {
            /* Get an environment variable, return None if it doesn't exist.
            
                The optional second argument can specify an alternate default.
                 */
            return frame.getglobal("environ").invoke("get", frame.getlocal(0), frame.getlocal(1));
        }
        
        private static PyObject system$48(PyFrame frame) {
            /* system(command) -> exit_status
            
                Execute the command (a string) in a subshell.
                 */
            frame.setlocal(2, org.python.core.imp.importOne("popen2", frame));
            return frame.getlocal(2).__getattr__("system")._callextra(new PyObject[] {}, new String[] {}, frame.getlocal(0), frame.getlocal(1));
        }
        
        private static PyObject popen$49(PyFrame frame) {
            /* popen(command [, mode='r' [, bufsize]]) -> pipe
            
                Open a pipe to/from a command returning a file object.
                 */
            frame.setlocal(2, org.python.core.imp.importOne("popen2", frame));
            return frame.getlocal(2).__getattr__("popen")._callextra(new PyObject[] {}, new String[] {}, frame.getlocal(0), frame.getlocal(1));
        }
        
        private static PyObject popen2$50(PyFrame frame) {
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            
            // Code
            /* Execute the shell command cmd in a sub-process.
            
                On UNIX, 'cmd' may be a sequence, in which case arguments will be
                passed directly to the program without shell intervention (as with
                os.spawnv()).  If 'cmd' is a string it will be passed to the shell
                (as with os.system()).  If 'bufsize' is specified, it sets the
                buffer size for the I/O pipes.  The file objects (child_stdin,
                child_stdout) are returned.
                 */
            frame.setlocal(4, org.python.core.imp.importOne("popen2", frame));
            t$0$PyObject__ = org.python.core.Py.unpackSequence(frame.getlocal(4).__getattr__("popen2").__call__(frame.getlocal(0), frame.getlocal(2)), 2);
            frame.setlocal(3, t$0$PyObject__[0]);
            frame.setlocal(5, t$0$PyObject__[1]);
            return new PyTuple(new PyObject[] {frame.getlocal(5), frame.getlocal(3)});
        }
        
        private static PyObject popen3$51(PyFrame frame) {
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            
            // Code
            /* Execute the shell command 'cmd' in a sub-process.
            
                On UNIX, 'cmd' may be a sequence, in which case arguments will be
                passed directly to the program without shell intervention
                (as with os.spawnv()).  If 'cmd' is a string it will be passed
                to the shell (as with os.system()).  If 'bufsize' is specified,
                it sets the buffer size for the I/O pipes.  The file objects
                (child_stdin, child_stdout, child_stderr) are returned.
                 */
            frame.setlocal(5, org.python.core.imp.importOne("popen2", frame));
            t$0$PyObject__ = org.python.core.Py.unpackSequence(frame.getlocal(5).__getattr__("popen3").__call__(frame.getlocal(0), frame.getlocal(2)), 3);
            frame.setlocal(3, t$0$PyObject__[0]);
            frame.setlocal(6, t$0$PyObject__[1]);
            frame.setlocal(4, t$0$PyObject__[2]);
            return new PyTuple(new PyObject[] {frame.getlocal(6), frame.getlocal(3), frame.getlocal(4)});
        }
        
        private static PyObject popen4$52(PyFrame frame) {
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            
            // Code
            /* Execute the shell command 'cmd' in a sub-process.
            
                On UNIX, 'cmd' may be a sequence, in which case arguments will be
                passed directly to the program without shell intervention
                (as with os.spawnv()).  If 'cmd' is a string it will be passed
                to the shell (as with os.system()).  If 'bufsize' is specified,
                it sets the buffer size for the I/O pipes.  The file objects
                (child_stdin, child_stdout_stderr) are returned.
                 */
            frame.setlocal(4, org.python.core.imp.importOne("popen2", frame));
            t$0$PyObject__ = org.python.core.Py.unpackSequence(frame.getlocal(4).__getattr__("popen4").__call__(frame.getlocal(0), frame.getlocal(2)), 2);
            frame.setlocal(3, t$0$PyObject__[0]);
            frame.setlocal(5, t$0$PyObject__[1]);
            return new PyTuple(new PyObject[] {frame.getlocal(5), frame.getlocal(3)});
        }
        
        private static PyObject getlogin$53(PyFrame frame) {
            /* getlogin() -> string
            
                Return the actual login name.
                 */
            return frame.getglobal("java").__getattr__("lang").__getattr__("System").__getattr__("getProperty").__call__(s$73);
        }
        
        private static PyObject main$54(PyFrame frame) {
            frame.setglobal("__file__", s$74);
            
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            
            // Code
            /* OS routines for Java, with some attempts to support DOS, NT, and
            Posix functionality.
            
            This exports:
              - all functions from posix, nt, dos, os2, mac, or ce, e.g. unlink, stat, etc.
              - os.path is one of the modules posixpath, ntpath, macpath, or dospath
              - os.name is 'posix', 'nt', 'dos', 'os2', 'mac', 'ce' or 'riscos'
              - os.curdir is a string representing the current directory ('.' or ':')
              - os.pardir is a string representing the parent directory ('..' or '::')
              - os.sep is the (or a most common) pathname separator ('/' or ':' or '\\\\')
              - os.altsep is the alternate pathname separator (None or '/')
              - os.pathsep is the component separator used in $PATH etc
              - os.linesep is the line separator in text files ('\\r' or '\\n' or '\\r\\n')
              - os.defpath is the default search path for executables
            
            Programs that import and use 'os' stand a better chance of being
            portable between different platforms.  Of course, they must then
            only use functions that are defined by all platforms (e.g., unlink
            and opendir), and leave all pathname manipulation to os.path
            (e.g., split and join).
             */
            frame.setlocal("__all__", new PyList(new PyObject[] {s$1, s$2, s$3, s$4, s$5, s$6, s$7, s$8, s$9, s$10, s$11, s$12, s$13, s$14, s$15, s$16, s$17}));
            t$0$PyObject__ = org.python.core.imp.importFrom("java.io", new String[] {"File"}, frame);
            frame.setlocal("File", t$0$PyObject__[0]);
            t$0$PyObject__ = null;
            frame.setlocal("java", org.python.core.imp.importOne("java.lang.System", frame));
            frame.setlocal("path", org.python.core.imp.importOneAs("javapath", frame));
            t$0$PyObject__ = org.python.core.imp.importFrom("UserDict", new String[] {"UserDict"}, frame);
            frame.setlocal("UserDict", t$0$PyObject__[0]);
            t$0$PyObject__ = null;
            frame.setlocal("time", org.python.core.imp.importOne("time", frame));
            frame.setlocal("stat_result", Py.makeClass("stat_result", new PyObject[] {}, c$6_stat_result, null));
            frame.setlocal("error", frame.getname("OSError"));
            frame.setlocal("name", s$35);
            frame.setlocal("curdir", s$36);
            frame.setlocal("pardir", s$37);
            frame.setlocal("sep", frame.getname("File").__getattr__("separator"));
            frame.setlocal("altsep", frame.getname("None"));
            frame.setlocal("pathsep", frame.getname("File").__getattr__("pathSeparator"));
            frame.setlocal("defpath", s$36);
            frame.setlocal("linesep", frame.getname("java").__getattr__("lang").__getattr__("System").__getattr__("getProperty").__call__(s$38));
            if (frame.getname("sep")._eq(s$36).__nonzero__()) {
                frame.setlocal("extsep", s$39);
            }
            else {
                frame.setlocal("extsep", s$36);
            }
            frame.getname("path").__setattr__("curdir", frame.getname("curdir"));
            frame.getname("path").__setattr__("pardir", frame.getname("pardir"));
            frame.getname("path").__setattr__("sep", frame.getname("sep"));
            frame.getname("path").__setattr__("altsep", frame.getname("altsep"));
            frame.getname("path").__setattr__("pathsep", frame.getname("pathsep"));
            frame.getname("path").__setattr__("defpath", frame.getname("defpath"));
            frame.getname("path").__setattr__("extsep", frame.getname("extsep"));
            frame.setlocal("_exit", new PyFunction(frame.f_globals, new PyObject[] {i$30}, c$7__exit));
            frame.setlocal("getcwd", new PyFunction(frame.f_globals, new PyObject[] {}, c$8_getcwd));
            frame.setlocal("chdir", new PyFunction(frame.f_globals, new PyObject[] {}, c$9_chdir));
            frame.setlocal("listdir", new PyFunction(frame.f_globals, new PyObject[] {}, c$10_listdir));
            frame.setlocal("mkdir", new PyFunction(frame.f_globals, new PyObject[] {s$49}, c$11_mkdir));
            frame.setlocal("makedirs", new PyFunction(frame.f_globals, new PyObject[] {s$49}, c$12_makedirs));
            frame.setlocal("remove", new PyFunction(frame.f_globals, new PyObject[] {}, c$13_remove));
            frame.setlocal("rename", new PyFunction(frame.f_globals, new PyObject[] {}, c$14_rename));
            frame.setlocal("rmdir", new PyFunction(frame.f_globals, new PyObject[] {}, c$15_rmdir));
            frame.setlocal("unlink", frame.getname("remove"));
            frame.setlocal("stat", new PyFunction(frame.f_globals, new PyObject[] {}, c$16_stat));
            frame.setlocal("utime", new PyFunction(frame.f_globals, new PyObject[] {}, c$17_utime));
            frame.setlocal("LazyDict", Py.makeClass("LazyDict", new PyObject[] {frame.getname("UserDict")}, c$43_LazyDict, null));
            frame.setlocal("_getEnvironment", new PyFunction(frame.f_globals, new PyObject[] {}, c$44__getEnvironment));
            frame.setlocal("environ", frame.getname("LazyDict").__call__(new PyObject[] {frame.getname("_getEnvironment")}, new String[] {"populate"}));
            frame.setlocal("putenv", frame.getname("environ").__getattr__("__setitem__"));
            frame.setlocal("getenv", new PyFunction(frame.f_globals, new PyObject[] {frame.getname("None")}, c$45_getenv));
            frame.setlocal("system", new PyFunction(frame.f_globals, new PyObject[] {}, c$46_system));
            frame.setlocal("popen", new PyFunction(frame.f_globals, new PyObject[] {}, c$47_popen));
            frame.setlocal("popen2", new PyFunction(frame.f_globals, new PyObject[] {s$69, i$34.__neg__()}, c$48_popen2));
            frame.setlocal("popen3", new PyFunction(frame.f_globals, new PyObject[] {s$69, i$34.__neg__()}, c$49_popen3));
            frame.setlocal("popen4", new PyFunction(frame.f_globals, new PyObject[] {s$69, i$34.__neg__()}, c$50_popen4));
            frame.setlocal("getlogin", new PyFunction(frame.f_globals, new PyObject[] {}, c$51_getlogin));
            return Py.None;
        }
        
    }
    public static void moduleDictInit(PyObject dict) {
        dict.__setitem__("__name__", new PyString("javaos"));
        Py.runCode(new _PyInner().getMain(), dict, dict);
    }
    
    public static void main(String[] args) throws java.lang.Exception {
        String[] newargs = new String[args.length+1];
        newargs[0] = "javaos";
        java.lang.System.arraycopy(args, 0, newargs, 1, args.length);
        Py.runMain(javaos._PyInner.class, newargs, javaos.jpy$packages, javaos.jpy$mainProperties, "", new String[] {"string", "random", "traceback", "sre_compile", "atexit", "warnings", "popen2", "getopt", "sre", "sre_constants", "StringIO", "QAsystem", "javaos", "repr", "copy_reg", "re", "linecache", "javapath", "UserDict", "copy", "threading", "stat", "sre_parse", "javashell"});
    }
    
}

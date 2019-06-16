import org.python.core.*;

public class javapath extends java.lang.Object {
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
        private static PyObject i$14;
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
        private static PyObject f$49;
        private static PyObject s$50;
        private static PyObject s$51;
        private static PyObject s$52;
        private static PyObject s$53;
        private static PyObject s$54;
        private static PyObject s$55;
        private static PyObject s$56;
        private static PyObject s$57;
        private static PyFunctionTable funcTable;
        private static PyCode c$0__tostr;
        private static PyCode c$1_dirname;
        private static PyCode c$2_basename;
        private static PyCode c$3_split;
        private static PyCode c$4_splitext;
        private static PyCode c$5_splitdrive;
        private static PyCode c$6_exists;
        private static PyCode c$7_isabs;
        private static PyCode c$8_isfile;
        private static PyCode c$9_isdir;
        private static PyCode c$10_join;
        private static PyCode c$11_normcase;
        private static PyCode c$12_commonprefix;
        private static PyCode c$13_islink;
        private static PyCode c$14_samefile;
        private static PyCode c$15_ismount;
        private static PyCode c$16_walk;
        private static PyCode c$17_expanduser;
        private static PyCode c$18_getuser;
        private static PyCode c$19_gethome;
        private static PyCode c$20_normpath;
        private static PyCode c$21_abspath;
        private static PyCode c$22__abspath;
        private static PyCode c$23_realpath;
        private static PyCode c$24__realpath;
        private static PyCode c$25_getsize;
        private static PyCode c$26_getmtime;
        private static PyCode c$27_getatime;
        private static PyCode c$28_expandvars;
        private static PyCode c$29_main;
        private static void initConstants() {
            s$0 = Py.newString("Common pathname manipulations, JDK version.\012\012Instead of importing this module directly, import os and refer to this\012module as os.path.\012\012");
            s$1 = Py.newString("%s() argument must be a str or unicode object, not %s");
            s$2 = Py.newString("Return the directory component of a pathname");
            s$3 = Py.newString("dirname");
            s$4 = Py.newString("");
            s$5 = Py.newString("Return the final component of a pathname");
            s$6 = Py.newString("basename");
            s$7 = Py.newString("Split a pathname.\012\012    Return tuple \"(head, tail)\" where \"tail\" is everything after the\012    final slash.  Either part may be empty.\012\012    ");
            s$8 = Py.newString("split");
            s$9 = Py.newString("Split the extension from a pathname.\012\012    Extension is everything from the last dot to the end.  Return\012    \"(root, ext)\", either part may be empty.\012\012    ");
            i$10 = Py.newInteger(0);
            i$11 = Py.newInteger(1);
            s$12 = Py.newString(".");
            s$13 = Py.newString("Split a pathname into drive and path specifiers. \012\012    Returns a 2-tuple \"(drive,path)\"; either part may be empty.\012    ");
            i$14 = Py.newInteger(2);
            s$15 = Py.newString(":");
            s$16 = Py.newString("abcdefghijklmnopqrstuvwxyz");
            s$17 = Py.newString("/\\");
            s$18 = Py.newString("Test whether a path exists.\012\012    Returns false for broken symbolic links.\012\012    ");
            s$19 = Py.newString("exists");
            s$20 = Py.newString("Test whether a path is absolute");
            s$21 = Py.newString("isabs");
            s$22 = Py.newString("Test whether a path is a regular file");
            s$23 = Py.newString("isfile");
            s$24 = Py.newString("Test whether a path is a directory");
            s$25 = Py.newString("isdir");
            s$26 = Py.newString("Join two or more pathname components, inserting os.sep as needed");
            s$27 = Py.newString("join");
            s$28 = Py.newString("Normalize case of pathname.\012\012    XXX Not done right under JDK.\012\012    ");
            s$29 = Py.newString("normcase");
            s$30 = Py.newString("Given a list of pathnames, return the longest common leading component");
            s$31 = Py.newString("Test whether a path is a symbolic link.\012\012    XXX This incorrectly always returns false under JDK.\012\012    ");
            s$32 = Py.newString("Test whether two pathnames reference the same actual file");
            s$33 = Py.newString("samefile");
            s$34 = Py.newString("Test whether a path is a mount point.\012\012    XXX This incorrectly always returns false under JDK.\012\012    ");
            s$35 = Py.newString("Walk a directory tree.\012\012    walk(top,func,args) calls func(arg, d, files) for each directory\012    \"d\" in the tree rooted at \"top\" (including \"top\" itself).  \"files\"\012    is a list of all the files and subdirs in directory \"d\".\012\012    ");
            s$36 = Py.newString("~");
            s$37 = Py.newString("user.name");
            s$38 = Py.newString("user.home");
            s$39 = Py.newString("Normalize path, eliminating double slashes, etc.");
            s$40 = Py.newString("\\");
            s$41 = Py.newString("/");
            s$42 = Py.newString("Return an absolute path normalized but symbolic links not eliminated");
            s$43 = Py.newString("abspath");
            s$44 = Py.newString("Return an absolute path normalized and symbolic links eliminated");
            s$45 = Py.newString("realpath");
            s$46 = Py.newString("getsize");
            s$47 = Py.newString("No such file or directory");
            s$48 = Py.newString("getmtime");
            f$49 = Py.newFloat(1000.0);
            s$50 = Py.newString("getatime");
            s$51 = Py.newString("Expand shell variables of form $var and ${var}.\012\012    Unknown variables are left unchanged.");
            s$52 = Py.newString("$");
            s$53 = Py.newString("_-");
            s$54 = Py.newString("'");
            s$55 = Py.newString("{");
            s$56 = Py.newString("}");
            s$57 = Py.newString("F:\\Java\\Jython\\jython2.2.1\\Lib\\javapath.py");
            funcTable = new _PyInner();
            c$0__tostr = Py.newCode(2, new String[] {"s", "method", "org"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javapath.py", "_tostr", false, false, funcTable, 0, null, null, 0, 17);
            c$1_dirname = Py.newCode(1, new String[] {"path", "result"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javapath.py", "dirname", false, false, funcTable, 1, null, null, 0, 17);
            c$2_basename = Py.newCode(1, new String[] {"path"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javapath.py", "basename", false, false, funcTable, 2, null, null, 0, 17);
            c$3_split = Py.newCode(1, new String[] {"path"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javapath.py", "split", false, false, funcTable, 3, null, null, 0, 17);
            c$4_splitext = Py.newCode(1, new String[] {"path", "i", "c", "n"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javapath.py", "splitext", false, false, funcTable, 4, null, null, 0, 17);
            c$5_splitdrive = Py.newCode(1, new String[] {"path"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javapath.py", "splitdrive", false, false, funcTable, 5, null, null, 0, 17);
            c$6_exists = Py.newCode(1, new String[] {"path"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javapath.py", "exists", false, false, funcTable, 6, null, null, 0, 17);
            c$7_isabs = Py.newCode(1, new String[] {"path"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javapath.py", "isabs", false, false, funcTable, 7, null, null, 0, 17);
            c$8_isfile = Py.newCode(1, new String[] {"path"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javapath.py", "isfile", false, false, funcTable, 8, null, null, 0, 17);
            c$9_isdir = Py.newCode(1, new String[] {"path"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javapath.py", "isdir", false, false, funcTable, 9, null, null, 0, 17);
            c$10_join = Py.newCode(2, new String[] {"path", "args", "a", "g", "f"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javapath.py", "join", true, false, funcTable, 10, null, null, 0, 17);
            c$11_normcase = Py.newCode(1, new String[] {"path"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javapath.py", "normcase", false, false, funcTable, 11, null, null, 0, 17);
            c$12_commonprefix = Py.newCode(1, new String[] {"m", "i", "item", "prefix"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javapath.py", "commonprefix", false, false, funcTable, 12, null, null, 0, 17);
            c$13_islink = Py.newCode(1, new String[] {"path"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javapath.py", "islink", false, false, funcTable, 13, null, null, 0, 17);
            c$14_samefile = Py.newCode(2, new String[] {"path", "path2"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javapath.py", "samefile", false, false, funcTable, 14, null, null, 0, 17);
            c$15_ismount = Py.newCode(1, new String[] {"path"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javapath.py", "ismount", false, false, funcTable, 15, null, null, 0, 17);
            c$16_walk = Py.newCode(3, new String[] {"top", "func", "arg", "name", "names"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javapath.py", "walk", false, false, funcTable, 16, null, null, 0, 17);
            c$17_expanduser = Py.newCode(1, new String[] {"path", "c"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javapath.py", "expanduser", false, false, funcTable, 17, null, null, 0, 17);
            c$18_getuser = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javapath.py", "getuser", false, false, funcTable, 18, null, null, 0, 17);
            c$19_gethome = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javapath.py", "gethome", false, false, funcTable, 19, null, null, 0, 17);
            c$20_normpath = Py.newCode(1, new String[] {"path", "comps", "i", "pardir", "string", "slashes", "curdir", "sep"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javapath.py", "normpath", false, false, funcTable, 20, null, null, 0, 17);
            c$21_abspath = Py.newCode(1, new String[] {"path"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javapath.py", "abspath", false, false, funcTable, 21, null, null, 0, 17);
            c$22__abspath = Py.newCode(1, new String[] {"path"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javapath.py", "_abspath", false, false, funcTable, 22, null, null, 0, 17);
            c$23_realpath = Py.newCode(1, new String[] {"path"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javapath.py", "realpath", false, false, funcTable, 23, null, null, 0, 17);
            c$24__realpath = Py.newCode(1, new String[] {"path"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javapath.py", "_realpath", false, false, funcTable, 24, null, null, 0, 17);
            c$25_getsize = Py.newCode(1, new String[] {"path", "size", "f"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javapath.py", "getsize", false, false, funcTable, 25, null, null, 0, 17);
            c$26_getmtime = Py.newCode(1, new String[] {"path", "f"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javapath.py", "getmtime", false, false, funcTable, 26, null, null, 0, 17);
            c$27_getatime = Py.newCode(1, new String[] {"path", "f"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javapath.py", "getatime", false, false, funcTable, 27, null, null, 0, 17);
            c$28_expandvars = Py.newCode(1, new String[] {"path", "varchars", "string", "index", "res", "c", "pathlen", "var"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javapath.py", "expandvars", false, false, funcTable, 28, null, null, 0, 17);
            c$29_main = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\javapath.py", "main", false, false, funcTable, 29, null, null, 0, 16);
        }
        
        
        public PyCode getMain() {
            if (c$29_main == null) _PyInner.initConstants();
            return c$29_main;
        }
        
        public PyObject call_function(int index, PyFrame frame) {
            switch (index){
                case 0:
                return _PyInner._tostr$1(frame);
                case 1:
                return _PyInner.dirname$2(frame);
                case 2:
                return _PyInner.basename$3(frame);
                case 3:
                return _PyInner.split$4(frame);
                case 4:
                return _PyInner.splitext$5(frame);
                case 5:
                return _PyInner.splitdrive$6(frame);
                case 6:
                return _PyInner.exists$7(frame);
                case 7:
                return _PyInner.isabs$8(frame);
                case 8:
                return _PyInner.isfile$9(frame);
                case 9:
                return _PyInner.isdir$10(frame);
                case 10:
                return _PyInner.join$11(frame);
                case 11:
                return _PyInner.normcase$12(frame);
                case 12:
                return _PyInner.commonprefix$13(frame);
                case 13:
                return _PyInner.islink$14(frame);
                case 14:
                return _PyInner.samefile$15(frame);
                case 15:
                return _PyInner.ismount$16(frame);
                case 16:
                return _PyInner.walk$17(frame);
                case 17:
                return _PyInner.expanduser$18(frame);
                case 18:
                return _PyInner.getuser$19(frame);
                case 19:
                return _PyInner.gethome$20(frame);
                case 20:
                return _PyInner.normpath$21(frame);
                case 21:
                return _PyInner.abspath$22(frame);
                case 22:
                return _PyInner._abspath$23(frame);
                case 23:
                return _PyInner.realpath$24(frame);
                case 24:
                return _PyInner._realpath$25(frame);
                case 25:
                return _PyInner.getsize$26(frame);
                case 26:
                return _PyInner.getmtime$27(frame);
                case 27:
                return _PyInner.getatime$28(frame);
                case 28:
                return _PyInner.expandvars$29(frame);
                case 29:
                return _PyInner.main$30(frame);
                default:
                return null;
            }
        }
        
        private static PyObject _tostr$1(PyFrame frame) {
            if (frame.getglobal("isinstance").__call__(frame.getlocal(0), frame.getglobal("basestring")).__nonzero__()) {
                return frame.getlocal(0);
            }
            frame.setlocal(2, org.python.core.imp.importOne("org", frame));
            throw Py.makeException(frame.getglobal("TypeError"), s$1._mod(new PyTuple(new PyObject[] {frame.getlocal(1), frame.getlocal(2).__getattr__("python").__getattr__("core").__getattr__("Py").__getattr__("safeRepr").__call__(frame.getlocal(0))})));
        }
        
        private static PyObject dirname$2(PyFrame frame) {
            /* Return the directory component of a pathname */
            frame.setlocal(0, frame.getglobal("_tostr").__call__(frame.getlocal(0), s$3));
            frame.setlocal(1, frame.getglobal("File").__call__(frame.getlocal(0)).invoke("getParent"));
            if (frame.getlocal(1).__not__().__nonzero__()) {
                if (frame.getglobal("isabs").__call__(frame.getlocal(0)).__nonzero__()) {
                    frame.setlocal(1, frame.getlocal(0));
                }
                else {
                    frame.setlocal(1, s$4);
                }
            }
            return frame.getlocal(1);
        }
        
        private static PyObject basename$3(PyFrame frame) {
            /* Return the final component of a pathname */
            frame.setlocal(0, frame.getglobal("_tostr").__call__(frame.getlocal(0), s$6));
            return frame.getglobal("File").__call__(frame.getlocal(0)).invoke("getName");
        }
        
        private static PyObject split$4(PyFrame frame) {
            /* Split a pathname.
            
                Return tuple "(head, tail)" where "tail" is everything after the
                final slash.  Either part may be empty.
            
                 */
            frame.setlocal(0, frame.getglobal("_tostr").__call__(frame.getlocal(0), s$8));
            return new PyTuple(new PyObject[] {frame.getglobal("dirname").__call__(frame.getlocal(0)), frame.getglobal("basename").__call__(frame.getlocal(0))});
        }
        
        private static PyObject splitext$5(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject, t$1$PyObject;
            
            // Code
            /* Split the extension from a pathname.
            
                Extension is everything from the last dot to the end.  Return
                "(root, ext)", either part may be empty.
            
                 */
            frame.setlocal(1, i$10);
            frame.setlocal(3, i$11.__neg__());
            t$0$PyObject = frame.getlocal(0).__iter__();
            while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                frame.setlocal(2, t$1$PyObject);
                if (frame.getlocal(2)._eq(s$12).__nonzero__()) {
                    frame.setlocal(3, frame.getlocal(1));
                }
                frame.setlocal(1, frame.getlocal(1)._add(i$11));
            }
            if (frame.getlocal(3)._lt(i$10).__nonzero__()) {
                return new PyTuple(new PyObject[] {frame.getlocal(0), s$4});
            }
            else {
                return new PyTuple(new PyObject[] {frame.getlocal(0).__getslice__(null, frame.getlocal(3), null), frame.getlocal(0).__getslice__(frame.getlocal(3), null, null)});
            }
        }
        
        private static PyObject splitdrive$6(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject;
            
            // Code
            /* Split a pathname into drive and path specifiers. 
            
                Returns a 2-tuple "(drive,path)"; either part may be empty.
                 */
            if (((t$0$PyObject = ((t$0$PyObject = frame.getlocal(0).__getslice__(i$11, i$14, null)._eq(s$15)).__nonzero__() ? frame.getlocal(0).__getitem__(i$10).invoke("lower")._in(s$16) : t$0$PyObject)).__nonzero__() ? ((t$0$PyObject = frame.getlocal(0).__getslice__(i$14, null, null)._eq(s$4)).__nonzero__() ? t$0$PyObject : frame.getlocal(0).__getitem__(i$14)._in(s$17)) : t$0$PyObject).__nonzero__()) {
                return new PyTuple(new PyObject[] {frame.getlocal(0).__getslice__(null, i$14, null), frame.getlocal(0).__getslice__(i$14, null, null)});
            }
            return new PyTuple(new PyObject[] {s$4, frame.getlocal(0)});
        }
        
        private static PyObject exists$7(PyFrame frame) {
            /* Test whether a path exists.
            
                Returns false for broken symbolic links.
            
                 */
            frame.setlocal(0, frame.getglobal("_tostr").__call__(frame.getlocal(0), s$19));
            return frame.getglobal("File").__call__(frame.getlocal(0)).invoke("exists");
        }
        
        private static PyObject isabs$8(PyFrame frame) {
            /* Test whether a path is absolute */
            frame.setlocal(0, frame.getglobal("_tostr").__call__(frame.getlocal(0), s$21));
            return frame.getglobal("File").__call__(frame.getlocal(0)).invoke("isAbsolute");
        }
        
        private static PyObject isfile$9(PyFrame frame) {
            /* Test whether a path is a regular file */
            frame.setlocal(0, frame.getglobal("_tostr").__call__(frame.getlocal(0), s$23));
            return frame.getglobal("File").__call__(frame.getlocal(0)).invoke("isFile");
        }
        
        private static PyObject isdir$10(PyFrame frame) {
            /* Test whether a path is a directory */
            frame.setlocal(0, frame.getglobal("_tostr").__call__(frame.getlocal(0), s$25));
            return frame.getglobal("File").__call__(frame.getlocal(0)).invoke("isDirectory");
        }
        
        private static PyObject join$11(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject, t$1$PyObject, t$2$PyObject;
            
            // Code
            /* Join two or more pathname components, inserting os.sep as needed */
            frame.setlocal(0, frame.getglobal("_tostr").__call__(frame.getlocal(0), s$27));
            frame.setlocal(4, frame.getglobal("File").__call__(frame.getlocal(0)));
            t$0$PyObject = frame.getlocal(1).__iter__();
            while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                frame.setlocal(2, t$1$PyObject);
                frame.setlocal(2, frame.getglobal("_tostr").__call__(frame.getlocal(2), s$27));
                frame.setlocal(3, frame.getglobal("File").__call__(frame.getlocal(2)));
                if (((t$2$PyObject = frame.getlocal(3).invoke("isAbsolute")).__nonzero__() ? t$2$PyObject : frame.getglobal("len").__call__(frame.getlocal(4).invoke("getPath"))._eq(i$10)).__nonzero__()) {
                    frame.setlocal(4, frame.getlocal(3));
                }
                else {
                    frame.setlocal(4, frame.getglobal("File").__call__(frame.getlocal(4), frame.getlocal(2)));
                }
            }
            return frame.getlocal(4).invoke("getPath");
        }
        
        private static PyObject normcase$12(PyFrame frame) {
            /* Normalize case of pathname.
            
                XXX Not done right under JDK.
            
                 */
            frame.setlocal(0, frame.getglobal("_tostr").__call__(frame.getlocal(0), s$29));
            return frame.getglobal("File").__call__(frame.getlocal(0)).invoke("getPath");
        }
        
        private static PyObject commonprefix$13(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject, t$1$PyObject, t$2$PyObject, t$3$PyObject;
            
            // Code
            /* Given a list of pathnames, return the longest common leading component */
            if (frame.getlocal(0).__not__().__nonzero__()) {
                return s$4;
            }
            frame.setlocal(3, frame.getlocal(0).__getitem__(i$10));
            t$0$PyObject = frame.getlocal(0).__iter__();
            while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                frame.setlocal(2, t$1$PyObject);
                t$2$PyObject = frame.getglobal("range").__call__(frame.getglobal("len").__call__(frame.getlocal(3))).__iter__();
                while ((t$3$PyObject = t$2$PyObject.__iternext__()) != null) {
                    frame.setlocal(1, t$3$PyObject);
                    if (frame.getlocal(3).__getslice__(null, frame.getlocal(1)._add(i$11), null)._ne(frame.getlocal(2).__getslice__(null, frame.getlocal(1)._add(i$11), null)).__nonzero__()) {
                        frame.setlocal(3, frame.getlocal(3).__getslice__(null, frame.getlocal(1), null));
                        if (frame.getlocal(1)._eq(i$10).__nonzero__()) {
                            return s$4;
                        }
                        break;
                    }
                }
            }
            return frame.getlocal(3);
        }
        
        private static PyObject islink$14(PyFrame frame) {
            /* Test whether a path is a symbolic link.
            
                XXX This incorrectly always returns false under JDK.
            
                 */
            return i$10;
        }
        
        private static PyObject samefile$15(PyFrame frame) {
            /* Test whether two pathnames reference the same actual file */
            frame.setlocal(0, frame.getglobal("_tostr").__call__(frame.getlocal(0), s$33));
            frame.setlocal(1, frame.getglobal("_tostr").__call__(frame.getlocal(1), s$33));
            return frame.getglobal("_realpath").__call__(frame.getlocal(0))._eq(frame.getglobal("_realpath").__call__(frame.getlocal(1)));
        }
        
        private static PyObject ismount$16(PyFrame frame) {
            /* Test whether a path is a mount point.
            
                XXX This incorrectly always returns false under JDK.
            
                 */
            return i$10;
        }
        
        private static PyObject walk$17(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject, t$1$PyObject, t$2$PyObject;
            PyException t$0$PyException;
            
            // Code
            /* Walk a directory tree.
            
                walk(top,func,args) calls func(arg, d, files) for each directory
                "d" in the tree rooted at "top" (including "top" itself).  "files"
                is a list of all the files and subdirs in directory "d".
            
                 */
            try {
                frame.setlocal(4, frame.getglobal("os").__getattr__("listdir").__call__(frame.getlocal(0)));
            }
            catch (Throwable x$0) {
                t$0$PyException = Py.setException(x$0, frame);
                if (Py.matchException(t$0$PyException, frame.getglobal("os").__getattr__("error"))) {
                    return Py.None;
                }
                else throw t$0$PyException;
            }
            frame.getlocal(1).__call__(frame.getlocal(2), frame.getlocal(0), frame.getlocal(4));
            t$0$PyObject = frame.getlocal(4).__iter__();
            while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                frame.setlocal(3, t$1$PyObject);
                frame.setlocal(3, frame.getglobal("join").__call__(frame.getlocal(0), frame.getlocal(3)));
                if (((t$2$PyObject = frame.getglobal("isdir").__call__(frame.getlocal(3))).__nonzero__() ? frame.getglobal("islink").__call__(frame.getlocal(3)).__not__() : t$2$PyObject).__nonzero__()) {
                    frame.getglobal("walk").__call__(frame.getlocal(3), frame.getlocal(1), frame.getlocal(2));
                }
            }
            return Py.None;
        }
        
        private static PyObject expanduser$18(PyFrame frame) {
            if (frame.getlocal(0).__getslice__(null, i$11, null)._eq(s$36).__nonzero__()) {
                frame.setlocal(1, frame.getlocal(0).__getslice__(i$11, i$14, null));
                if (frame.getlocal(1).__not__().__nonzero__()) {
                    return frame.getglobal("gethome").__call__();
                }
                if (frame.getlocal(1)._eq(frame.getglobal("os").__getattr__("sep")).__nonzero__()) {
                    return frame.getglobal("File").__call__(frame.getglobal("gethome").__call__(), frame.getlocal(0).__getslice__(i$14, null, null)).invoke("getPath");
                }
            }
            return frame.getlocal(0);
        }
        
        private static PyObject getuser$19(PyFrame frame) {
            return frame.getglobal("System").__getattr__("getProperty").__call__(s$37);
        }
        
        private static PyObject gethome$20(PyFrame frame) {
            return frame.getglobal("System").__getattr__("getProperty").__call__(s$38);
        }
        
        private static PyObject normpath$21(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject;
            
            // Code
            /* Normalize path, eliminating double slashes, etc. */
            frame.setlocal(7, frame.getglobal("os").__getattr__("sep"));
            if (frame.getlocal(7)._eq(s$40).__nonzero__()) {
                frame.setlocal(0, frame.getlocal(0).invoke("replace", s$41, frame.getlocal(7)));
            }
            frame.setlocal(6, frame.getglobal("os").__getattr__("curdir"));
            frame.setlocal(3, frame.getglobal("os").__getattr__("pardir"));
            frame.setlocal(4, org.python.core.imp.importOne("string", frame));
            frame.setlocal(5, s$4);
            while (frame.getlocal(0).__getslice__(null, i$11, null)._eq(frame.getlocal(7)).__nonzero__()) {
                frame.setlocal(5, frame.getlocal(5)._add(frame.getlocal(7)));
                frame.setlocal(0, frame.getlocal(0).__getslice__(i$11, null, null));
            }
            frame.setlocal(1, frame.getlocal(4).__getattr__("splitfields").__call__(frame.getlocal(0), frame.getlocal(7)));
            frame.setlocal(2, i$10);
            while (frame.getlocal(2)._lt(frame.getglobal("len").__call__(frame.getlocal(1))).__nonzero__()) {
                if (frame.getlocal(1).__getitem__(frame.getlocal(2))._eq(frame.getlocal(6)).__nonzero__()) {
                    frame.getlocal(1).__delitem__(frame.getlocal(2));
                    while (((t$0$PyObject = frame.getlocal(2)._lt(frame.getglobal("len").__call__(frame.getlocal(1)))).__nonzero__() ? frame.getlocal(1).__getitem__(frame.getlocal(2))._eq(s$4) : t$0$PyObject).__nonzero__()) {
                        frame.getlocal(1).__delitem__(frame.getlocal(2));
                    }
                }
                else {
                    if (((t$0$PyObject = ((t$0$PyObject = frame.getlocal(1).__getitem__(frame.getlocal(2))._eq(frame.getlocal(3))).__nonzero__() ? frame.getlocal(2)._gt(i$10) : t$0$PyObject)).__nonzero__() ? frame.getlocal(1).__getitem__(frame.getlocal(2)._sub(i$11))._notin(new PyTuple(new PyObject[] {s$4, frame.getlocal(3)})) : t$0$PyObject).__nonzero__()) {
                        frame.getlocal(1).__delslice__(frame.getlocal(2)._sub(i$11), frame.getlocal(2)._add(i$11), null);
                        frame.setlocal(2, frame.getlocal(2)._sub(i$11));
                    }
                    else {
                        if (((t$0$PyObject = ((t$0$PyObject = frame.getlocal(1).__getitem__(frame.getlocal(2))._eq(s$4)).__nonzero__() ? frame.getlocal(2)._gt(i$10) : t$0$PyObject)).__nonzero__() ? frame.getlocal(1).__getitem__(frame.getlocal(2)._sub(i$11))._ne(s$4) : t$0$PyObject).__nonzero__()) {
                            frame.getlocal(1).__delitem__(frame.getlocal(2));
                        }
                        else {
                            frame.setlocal(2, frame.getlocal(2)._add(i$11));
                        }
                    }
                }
            }
            if (((t$0$PyObject = frame.getlocal(1).__not__()).__nonzero__() ? frame.getlocal(5).__not__() : t$0$PyObject).__nonzero__()) {
                frame.getlocal(1).invoke("append", frame.getlocal(6));
            }
            return frame.getlocal(5)._add(frame.getlocal(4).__getattr__("joinfields").__call__(frame.getlocal(1), frame.getlocal(7)));
        }
        
        private static PyObject abspath$22(PyFrame frame) {
            /* Return an absolute path normalized but symbolic links not eliminated */
            frame.setlocal(0, frame.getglobal("_tostr").__call__(frame.getlocal(0), s$43));
            return frame.getglobal("_abspath").__call__(frame.getlocal(0));
        }
        
        private static PyObject _abspath$23(PyFrame frame) {
            return frame.getglobal("normpath").__call__(frame.getglobal("File").__call__(frame.getlocal(0)).invoke("getAbsolutePath"));
        }
        
        private static PyObject realpath$24(PyFrame frame) {
            /* Return an absolute path normalized and symbolic links eliminated */
            frame.setlocal(0, frame.getglobal("_tostr").__call__(frame.getlocal(0), s$45));
            return frame.getglobal("_realpath").__call__(frame.getlocal(0));
        }
        
        private static PyObject _realpath$25(PyFrame frame) {
            // Temporary Variables
            PyException t$0$PyException;
            
            // Code
            try {
                return frame.getglobal("File").__call__(frame.getlocal(0)).invoke("getCanonicalPath");
            }
            catch (Throwable x$0) {
                t$0$PyException = Py.setException(x$0, frame);
                if (Py.matchException(t$0$PyException, frame.getglobal("java").__getattr__("io").__getattr__("IOException"))) {
                    return frame.getglobal("_abspath").__call__(frame.getlocal(0));
                }
                else throw t$0$PyException;
            }
        }
        
        private static PyObject getsize$26(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject;
            
            // Code
            frame.setlocal(0, frame.getglobal("_tostr").__call__(frame.getlocal(0), s$46));
            frame.setlocal(2, frame.getglobal("File").__call__(frame.getlocal(0)));
            frame.setlocal(1, frame.getlocal(2).invoke("length"));
            if (((t$0$PyObject = frame.getlocal(1)._eq(i$10)).__nonzero__() ? frame.getlocal(2).invoke("exists").__not__() : t$0$PyObject).__nonzero__()) {
                throw Py.makeException(frame.getglobal("OSError").__call__(i$10, s$47, frame.getlocal(0)));
            }
            return frame.getlocal(1);
        }
        
        private static PyObject getmtime$27(PyFrame frame) {
            frame.setlocal(0, frame.getglobal("_tostr").__call__(frame.getlocal(0), s$48));
            frame.setlocal(1, frame.getglobal("File").__call__(frame.getlocal(0)));
            if (frame.getlocal(1).invoke("exists").__not__().__nonzero__()) {
                throw Py.makeException(frame.getglobal("OSError").__call__(i$10, s$47, frame.getlocal(0)));
            }
            return frame.getlocal(1).invoke("lastModified")._div(f$49);
        }
        
        private static PyObject getatime$28(PyFrame frame) {
            frame.setlocal(0, frame.getglobal("_tostr").__call__(frame.getlocal(0), s$50));
            frame.setlocal(1, frame.getglobal("File").__call__(frame.getlocal(0)));
            if (frame.getlocal(1).invoke("exists").__not__().__nonzero__()) {
                throw Py.makeException(frame.getglobal("OSError").__call__(i$10, s$47, frame.getlocal(0)));
            }
            return frame.getlocal(1).invoke("lastModified")._div(f$49);
        }
        
        private static PyObject expandvars$29(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject;
            PyException t$0$PyException;
            
            // Code
            /* Expand shell variables of form $var and ${var}.
            
                Unknown variables are left unchanged. */
            if (s$52._notin(frame.getlocal(0)).__nonzero__()) {
                return frame.getlocal(0);
            }
            frame.setlocal(2, org.python.core.imp.importOne("string", frame));
            frame.setlocal(1, frame.getlocal(2).__getattr__("letters")._add(frame.getlocal(2).__getattr__("digits"))._add(s$53));
            frame.setlocal(4, s$4);
            frame.setlocal(3, i$10);
            frame.setlocal(6, frame.getglobal("len").__call__(frame.getlocal(0)));
            while (frame.getlocal(3)._lt(frame.getlocal(6)).__nonzero__()) {
                frame.setlocal(5, frame.getlocal(0).__getitem__(frame.getlocal(3)));
                if (frame.getlocal(5)._eq(s$54).__nonzero__()) {
                    frame.setlocal(0, frame.getlocal(0).__getslice__(frame.getlocal(3)._add(i$11), null, null));
                    frame.setlocal(6, frame.getglobal("len").__call__(frame.getlocal(0)));
                    try {
                        frame.setlocal(3, frame.getlocal(0).invoke("index", s$54));
                        frame.setlocal(4, frame.getlocal(4)._add(s$54)._add(frame.getlocal(0).__getslice__(null, frame.getlocal(3)._add(i$11), null)));
                    }
                    catch (Throwable x$0) {
                        t$0$PyException = Py.setException(x$0, frame);
                        if (Py.matchException(t$0$PyException, frame.getglobal("ValueError"))) {
                            frame.setlocal(4, frame.getlocal(4)._add(frame.getlocal(0)));
                            frame.setlocal(3, frame.getlocal(6)._sub(i$11));
                        }
                        else throw t$0$PyException;
                    }
                }
                else {
                    if (frame.getlocal(5)._eq(s$52).__nonzero__()) {
                        if (frame.getlocal(0).__getslice__(frame.getlocal(3)._add(i$11), frame.getlocal(3)._add(i$14), null)._eq(s$52).__nonzero__()) {
                            frame.setlocal(4, frame.getlocal(4)._add(frame.getlocal(5)));
                            frame.setlocal(3, frame.getlocal(3)._add(i$11));
                        }
                        else {
                            if (frame.getlocal(0).__getslice__(frame.getlocal(3)._add(i$11), frame.getlocal(3)._add(i$14), null)._eq(s$55).__nonzero__()) {
                                frame.setlocal(0, frame.getlocal(0).__getslice__(frame.getlocal(3)._add(i$14), null, null));
                                frame.setlocal(6, frame.getglobal("len").__call__(frame.getlocal(0)));
                                try {
                                    frame.setlocal(3, frame.getlocal(0).invoke("index", s$56));
                                    frame.setlocal(7, frame.getlocal(0).__getslice__(null, frame.getlocal(3), null));
                                    if (frame.getglobal("os").__getattr__("environ").__getattr__("has_key").__call__(frame.getlocal(7)).__nonzero__()) {
                                        frame.setlocal(4, frame.getlocal(4)._add(frame.getglobal("os").__getattr__("environ").__getitem__(frame.getlocal(7))));
                                    }
                                }
                                catch (Throwable x$1) {
                                    t$0$PyException = Py.setException(x$1, frame);
                                    if (Py.matchException(t$0$PyException, frame.getglobal("ValueError"))) {
                                        frame.setlocal(4, frame.getlocal(4)._add(frame.getlocal(0)));
                                        frame.setlocal(3, frame.getlocal(6)._sub(i$11));
                                    }
                                    else throw t$0$PyException;
                                }
                            }
                            else {
                                frame.setlocal(7, s$4);
                                frame.setlocal(3, frame.getlocal(3)._add(i$11));
                                frame.setlocal(5, frame.getlocal(0).__getslice__(frame.getlocal(3), frame.getlocal(3)._add(i$11), null));
                                while (((t$0$PyObject = frame.getlocal(5)._ne(s$4)).__nonzero__() ? frame.getlocal(5)._in(frame.getlocal(1)) : t$0$PyObject).__nonzero__()) {
                                    frame.setlocal(7, frame.getlocal(7)._add(frame.getlocal(5)));
                                    frame.setlocal(3, frame.getlocal(3)._add(i$11));
                                    frame.setlocal(5, frame.getlocal(0).__getslice__(frame.getlocal(3), frame.getlocal(3)._add(i$11), null));
                                }
                                if (frame.getglobal("os").__getattr__("environ").__getattr__("has_key").__call__(frame.getlocal(7)).__nonzero__()) {
                                    frame.setlocal(4, frame.getlocal(4)._add(frame.getglobal("os").__getattr__("environ").__getitem__(frame.getlocal(7))));
                                }
                                if (frame.getlocal(5)._ne(s$4).__nonzero__()) {
                                    frame.setlocal(4, frame.getlocal(4)._add(frame.getlocal(5)));
                                }
                            }
                        }
                    }
                    else {
                        frame.setlocal(4, frame.getlocal(4)._add(frame.getlocal(5)));
                    }
                }
                frame.setlocal(3, frame.getlocal(3)._add(i$11));
            }
            return frame.getlocal(4);
        }
        
        private static PyObject main$30(PyFrame frame) {
            frame.setglobal("__file__", s$57);
            
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            
            // Code
            /* Common pathname manipulations, JDK version.
            
            Instead of importing this module directly, import os and refer to this
            module as os.path.
            
             */
            t$0$PyObject__ = org.python.core.imp.importFrom("java.io", new String[] {"File"}, frame);
            frame.setlocal("File", t$0$PyObject__[0]);
            t$0$PyObject__ = null;
            frame.setlocal("java", org.python.core.imp.importOne("java.io.IOException", frame));
            t$0$PyObject__ = org.python.core.imp.importFrom("java.lang", new String[] {"System"}, frame);
            frame.setlocal("System", t$0$PyObject__[0]);
            t$0$PyObject__ = null;
            frame.setlocal("os", org.python.core.imp.importOne("os", frame));
            frame.setlocal("_tostr", new PyFunction(frame.f_globals, new PyObject[] {}, c$0__tostr));
            frame.setlocal("dirname", new PyFunction(frame.f_globals, new PyObject[] {}, c$1_dirname));
            frame.setlocal("basename", new PyFunction(frame.f_globals, new PyObject[] {}, c$2_basename));
            frame.setlocal("split", new PyFunction(frame.f_globals, new PyObject[] {}, c$3_split));
            frame.setlocal("splitext", new PyFunction(frame.f_globals, new PyObject[] {}, c$4_splitext));
            frame.setlocal("splitdrive", new PyFunction(frame.f_globals, new PyObject[] {}, c$5_splitdrive));
            frame.setlocal("exists", new PyFunction(frame.f_globals, new PyObject[] {}, c$6_exists));
            frame.setlocal("isabs", new PyFunction(frame.f_globals, new PyObject[] {}, c$7_isabs));
            frame.setlocal("isfile", new PyFunction(frame.f_globals, new PyObject[] {}, c$8_isfile));
            frame.setlocal("isdir", new PyFunction(frame.f_globals, new PyObject[] {}, c$9_isdir));
            frame.setlocal("join", new PyFunction(frame.f_globals, new PyObject[] {}, c$10_join));
            frame.setlocal("normcase", new PyFunction(frame.f_globals, new PyObject[] {}, c$11_normcase));
            frame.setlocal("commonprefix", new PyFunction(frame.f_globals, new PyObject[] {}, c$12_commonprefix));
            frame.setlocal("islink", new PyFunction(frame.f_globals, new PyObject[] {}, c$13_islink));
            frame.setlocal("samefile", new PyFunction(frame.f_globals, new PyObject[] {}, c$14_samefile));
            frame.setlocal("ismount", new PyFunction(frame.f_globals, new PyObject[] {}, c$15_ismount));
            frame.setlocal("walk", new PyFunction(frame.f_globals, new PyObject[] {}, c$16_walk));
            frame.setlocal("expanduser", new PyFunction(frame.f_globals, new PyObject[] {}, c$17_expanduser));
            frame.setlocal("getuser", new PyFunction(frame.f_globals, new PyObject[] {}, c$18_getuser));
            frame.setlocal("gethome", new PyFunction(frame.f_globals, new PyObject[] {}, c$19_gethome));
            frame.setlocal("normpath", new PyFunction(frame.f_globals, new PyObject[] {}, c$20_normpath));
            frame.setlocal("abspath", new PyFunction(frame.f_globals, new PyObject[] {}, c$21_abspath));
            frame.setlocal("_abspath", new PyFunction(frame.f_globals, new PyObject[] {}, c$22__abspath));
            frame.setlocal("realpath", new PyFunction(frame.f_globals, new PyObject[] {}, c$23_realpath));
            frame.setlocal("_realpath", new PyFunction(frame.f_globals, new PyObject[] {}, c$24__realpath));
            frame.setlocal("getsize", new PyFunction(frame.f_globals, new PyObject[] {}, c$25_getsize));
            frame.setlocal("getmtime", new PyFunction(frame.f_globals, new PyObject[] {}, c$26_getmtime));
            frame.setlocal("getatime", new PyFunction(frame.f_globals, new PyObject[] {}, c$27_getatime));
            frame.setlocal("expandvars", new PyFunction(frame.f_globals, new PyObject[] {}, c$28_expandvars));
            return Py.None;
        }
        
    }
    public static void moduleDictInit(PyObject dict) {
        dict.__setitem__("__name__", new PyString("javapath"));
        Py.runCode(new _PyInner().getMain(), dict, dict);
    }
    
    public static void main(String[] args) throws java.lang.Exception {
        String[] newargs = new String[args.length+1];
        newargs[0] = "javapath";
        java.lang.System.arraycopy(args, 0, newargs, 1, args.length);
        Py.runMain(javapath._PyInner.class, newargs, javapath.jpy$packages, javapath.jpy$mainProperties, "", new String[] {"string", "random", "traceback", "sre_compile", "atexit", "warnings", "popen2", "getopt", "sre", "sre_constants", "StringIO", "QAsystem", "javaos", "repr", "copy_reg", "re", "linecache", "javapath", "UserDict", "copy", "threading", "stat", "sre_parse", "javashell"});
    }
    
}

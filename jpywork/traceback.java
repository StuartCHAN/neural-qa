import org.python.core.*;

public class traceback extends java.lang.Object {
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
        private static PyObject i$24;
        private static PyObject s$25;
        private static PyObject i$26;
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
        private static PyObject i$44;
        private static PyObject s$45;
        private static PyObject s$46;
        private static PyObject s$47;
        private static PyObject s$48;
        private static PyObject s$49;
        private static PyFunctionTable funcTable;
        private static PyCode c$0__print;
        private static PyCode c$1_print_list;
        private static PyCode c$2_format_list;
        private static PyCode c$3_print_tb;
        private static PyCode c$4_format_tb;
        private static PyCode c$5_extract_tb;
        private static PyCode c$6_print_exception;
        private static PyCode c$7_format_exception;
        private static PyCode c$8_format_exception_only;
        private static PyCode c$9__some_str;
        private static PyCode c$10_print_exc;
        private static PyCode c$11_print_last;
        private static PyCode c$12_print_stack;
        private static PyCode c$13_format_stack;
        private static PyCode c$14_extract_stack;
        private static PyCode c$15_tb_lineno;
        private static PyCode c$16_main;
        private static void initConstants() {
            s$0 = Py.newString("Extract, format and print information about Python stack traces.");
            s$1 = Py.newString("extract_stack");
            s$2 = Py.newString("extract_tb");
            s$3 = Py.newString("format_exception");
            s$4 = Py.newString("format_exception_only");
            s$5 = Py.newString("format_list");
            s$6 = Py.newString("format_stack");
            s$7 = Py.newString("format_tb");
            s$8 = Py.newString("print_exc");
            s$9 = Py.newString("print_exception");
            s$10 = Py.newString("print_last");
            s$11 = Py.newString("print_stack");
            s$12 = Py.newString("print_tb");
            s$13 = Py.newString("tb_lineno");
            s$14 = Py.newString("");
            s$15 = Py.newString("\012");
            s$16 = Py.newString("Print the list of tuples as returned by extract_tb() or\012    extract_stack() as a formatted stack trace to the given file.");
            s$17 = Py.newString("  File \"%s\", line %d, in %s");
            s$18 = Py.newString("    %s");
            s$19 = Py.newString("Format a list of traceback entry tuples for printing.\012\012    Given a list of tuples as returned by extract_tb() or\012    extract_stack(), return a list of strings ready for printing.\012    Each string in the resulting list corresponds to the item with the\012    same index in the argument list.  Each string ends in a newline;\012    the strings may contain internal newlines as well, for those items\012    whose source text line is not None.\012    ");
            s$20 = Py.newString("  File \"%s\", line %d, in %s\012");
            s$21 = Py.newString("    %s\012");
            s$22 = Py.newString("Print up to 'limit' stack trace entries from the traceback 'tb'.\012\012    If 'limit' is omitted or None, all entries are printed.  If 'file'\012    is omitted or None, the output goes to sys.stderr; otherwise\012    'file' should be an open file or file-like object with a write()\012    method.\012    ");
            s$23 = Py.newString("tracebacklimit");
            i$24 = Py.newInteger(0);
            s$25 = Py.newString("    ");
            i$26 = Py.newInteger(1);
            s$27 = Py.newString("A shorthand for 'format_list(extract_stack(f, limit)).");
            s$28 = Py.newString("Return list of up to limit pre-processed entries from traceback.\012\012    This is useful for alternate formatting of stack traces.  If\012    'limit' is omitted or None, all entries are extracted.  A\012    pre-processed stack trace entry is a quadruple (filename, line\012    number, function name, text) representing the information that is\012    usually printed for a stack trace.  The text is a string with\012    leading and trailing whitespace stripped; if the source is not\012    available it is None.\012    ");
            s$29 = Py.newString("Print exception up to 'limit' stack trace entries from 'tb' to 'file'.\012\012    This differs from print_tb() in the following ways: (1) if\012    traceback is not None, it prints a header \"Traceback (most recent\012    call last):\"; (2) it prints the exception type and value after the\012    stack trace; (3) if type is SyntaxError and value has the\012    appropriate format, it prints the line where the syntax error\012    occurred with a caret on the next line indicating the approximate\012    position of the error.\012    ");
            s$30 = Py.newString("Traceback (most recent call last):");
            s$31 = Py.newString(" ");
            s$32 = Py.newString("Format a stack trace and the exception information.\012\012    The arguments have the same meaning as the corresponding arguments\012    to print_exception().  The return value is a list of strings, each\012    ending in a newline and some containing internal newlines.  When\012    these lines are concatenated and printed, exactly the same text is\012    printed as does print_exception().\012    ");
            s$33 = Py.newString("Traceback (most recent call last):\012");
            s$34 = Py.newString("Format the exception part of a traceback.\012\012    The arguments are the exception type and value such as given by\012    sys.last_type and sys.last_value. The return value is a list of\012    strings, each ending in a newline.  Normally, the list contains a\012    single string; however, for SyntaxError exceptions, it contains\012    several lines that (when printed) display detailed information\012    about where the syntax error occurred.  The message indicating\012    which exception occurred is the always last string in the list.\012    ");
            s$35 = Py.newString("<string>");
            s$36 = Py.newString("  File \"%s\", line %d\012");
            s$37 = Py.newString("%s^\012");
            s$38 = Py.newString("%s: %s\012");
            s$39 = Py.newString("%s\012");
            s$40 = Py.newString("<unprintable %s object>");
            s$41 = Py.newString("Shorthand for 'print_exception(sys.exc_type, sys.exc_value, sys.exc_traceback, limit, file)'.\012    (In fact, it uses sys.exc_info() to retrieve the same information\012    in a thread-safe way.)");
            s$42 = Py.newString("This is a shorthand for 'print_exception(sys.last_type,\012    sys.last_value, sys.last_traceback, limit, file)'.");
            s$43 = Py.newString("Print a stack trace from its invocation point.\012\012    The optional 'f' argument can be used to specify an alternate\012    stack frame at which to start. The optional 'limit' and 'file'\012    arguments have the same meaning as for print_exception().\012    ");
            i$44 = Py.newInteger(2);
            s$45 = Py.newString("Shorthand for 'format_list(extract_stack(f, limit))'.");
            s$46 = Py.newString("Extract the raw traceback from the current stack frame.\012\012    The return value has the same format as for extract_tb().  The\012    optional 'f' and 'limit' arguments have the same meaning as for\012    print_stack().  Each item in the list is a quadruple (filename,\012    line number, function name, text), and the entries are in order\012    from oldest to newest stack frame.\012    ");
            s$47 = Py.newString("Calculate correct line number of traceback given in tb.\012\012    Even works with -O on.\012    ");
            s$48 = Py.newString("co_lnotab");
            s$49 = Py.newString("F:\\Java\\Jython\\jython2.2.1\\Lib\\traceback.py");
            funcTable = new _PyInner();
            c$0__print = Py.newCode(3, new String[] {"file", "str", "terminator"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\traceback.py", "_print", false, false, funcTable, 0, null, null, 0, 17);
            c$1_print_list = Py.newCode(2, new String[] {"extracted_list", "file", "line", "filename", "name", "lineno"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\traceback.py", "print_list", false, false, funcTable, 1, null, null, 0, 17);
            c$2_format_list = Py.newCode(1, new String[] {"extracted_list", "line", "filename", "name", "item", "list", "lineno"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\traceback.py", "format_list", false, false, funcTable, 2, null, null, 0, 17);
            c$3_print_tb = Py.newCode(3, new String[] {"tb", "limit", "file", "filename", "name", "lineno", "n", "f", "co", "line"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\traceback.py", "print_tb", false, false, funcTable, 3, null, null, 0, 17);
            c$4_format_tb = Py.newCode(2, new String[] {"tb", "limit"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\traceback.py", "format_tb", false, false, funcTable, 4, null, null, 0, 17);
            c$5_extract_tb = Py.newCode(2, new String[] {"tb", "limit", "filename", "name", "lineno", "n", "f", "list", "co", "line"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\traceback.py", "extract_tb", false, false, funcTable, 5, null, null, 0, 17);
            c$6_print_exception = Py.newCode(5, new String[] {"etype", "value", "tb", "limit", "file", "line", "lines"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\traceback.py", "print_exception", false, false, funcTable, 6, null, null, 0, 17);
            c$7_format_exception = Py.newCode(4, new String[] {"etype", "value", "tb", "limit", "list"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\traceback.py", "format_exception", false, false, funcTable, 7, null, null, 0, 17);
            c$8_format_exception_only = Py.newCode(2, new String[] {"etype", "value", "stype", "msg", "offset", "lineno", "line", "s", "filename", "i", "list", "c"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\traceback.py", "format_exception_only", false, false, funcTable, 8, null, null, 0, 17);
            c$9__some_str = Py.newCode(1, new String[] {"value"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\traceback.py", "_some_str", false, false, funcTable, 9, null, null, 0, 17);
            c$10_print_exc = Py.newCode(2, new String[] {"limit", "file", "tb", "etype", "value"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\traceback.py", "print_exc", false, false, funcTable, 10, null, null, 0, 17);
            c$11_print_last = Py.newCode(2, new String[] {"limit", "file"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\traceback.py", "print_last", false, false, funcTable, 11, null, null, 0, 17);
            c$12_print_stack = Py.newCode(3, new String[] {"f", "limit", "file"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\traceback.py", "print_stack", false, false, funcTable, 12, null, null, 0, 17);
            c$13_format_stack = Py.newCode(2, new String[] {"f", "limit"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\traceback.py", "format_stack", false, false, funcTable, 13, null, null, 0, 17);
            c$14_extract_stack = Py.newCode(2, new String[] {"f", "limit", "filename", "name", "lineno", "n", "list", "co", "line"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\traceback.py", "extract_stack", false, false, funcTable, 14, null, null, 0, 17);
            c$15_tb_lineno = Py.newCode(1, new String[] {"tb", "tab", "i", "c", "addr", "stopat", "line"}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\traceback.py", "tb_lineno", false, false, funcTable, 15, null, null, 0, 17);
            c$16_main = Py.newCode(0, new String[] {}, "F:\\Java\\Jython\\jython2.2.1\\Lib\\traceback.py", "main", false, false, funcTable, 16, null, null, 0, 16);
        }
        
        
        public PyCode getMain() {
            if (c$16_main == null) _PyInner.initConstants();
            return c$16_main;
        }
        
        public PyObject call_function(int index, PyFrame frame) {
            switch (index){
                case 0:
                return _PyInner._print$1(frame);
                case 1:
                return _PyInner.print_list$2(frame);
                case 2:
                return _PyInner.format_list$3(frame);
                case 3:
                return _PyInner.print_tb$4(frame);
                case 4:
                return _PyInner.format_tb$5(frame);
                case 5:
                return _PyInner.extract_tb$6(frame);
                case 6:
                return _PyInner.print_exception$7(frame);
                case 7:
                return _PyInner.format_exception$8(frame);
                case 8:
                return _PyInner.format_exception_only$9(frame);
                case 9:
                return _PyInner._some_str$10(frame);
                case 10:
                return _PyInner.print_exc$11(frame);
                case 11:
                return _PyInner.print_last$12(frame);
                case 12:
                return _PyInner.print_stack$13(frame);
                case 13:
                return _PyInner.format_stack$14(frame);
                case 14:
                return _PyInner.extract_stack$15(frame);
                case 15:
                return _PyInner.tb_lineno$16(frame);
                case 16:
                return _PyInner.main$17(frame);
                default:
                return null;
            }
        }
        
        private static PyObject _print$1(PyFrame frame) {
            frame.getlocal(0).invoke("write", frame.getlocal(1)._add(frame.getlocal(2)));
            return Py.None;
        }
        
        private static PyObject print_list$2(PyFrame frame) {
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            PyObject t$0$PyObject, t$1$PyObject;
            
            // Code
            /* Print the list of tuples as returned by extract_tb() or
                extract_stack() as a formatted stack trace to the given file. */
            if (frame.getlocal(1).__not__().__nonzero__()) {
                frame.setlocal(1, frame.getglobal("sys").__getattr__("stderr"));
            }
            t$0$PyObject = frame.getlocal(0).__iter__();
            while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                t$0$PyObject__ = org.python.core.Py.unpackSequence(t$1$PyObject, 4);
                frame.setlocal(3, t$0$PyObject__[0]);
                frame.setlocal(5, t$0$PyObject__[1]);
                frame.setlocal(4, t$0$PyObject__[2]);
                frame.setlocal(2, t$0$PyObject__[3]);
                frame.getglobal("_print").__call__(frame.getlocal(1), s$17._mod(new PyTuple(new PyObject[] {frame.getlocal(3), frame.getlocal(5), frame.getlocal(4)})));
                if (frame.getlocal(2).__nonzero__()) {
                    frame.getglobal("_print").__call__(frame.getlocal(1), s$18._mod(frame.getlocal(2).invoke("strip")));
                }
            }
            return Py.None;
        }
        
        private static PyObject format_list$3(PyFrame frame) {
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            PyObject t$0$PyObject, t$1$PyObject;
            
            // Code
            /* Format a list of traceback entry tuples for printing.
            
                Given a list of tuples as returned by extract_tb() or
                extract_stack(), return a list of strings ready for printing.
                Each string in the resulting list corresponds to the item with the
                same index in the argument list.  Each string ends in a newline;
                the strings may contain internal newlines as well, for those items
                whose source text line is not None.
                 */
            frame.setlocal(5, new PyList(new PyObject[] {}));
            t$0$PyObject = frame.getlocal(0).__iter__();
            while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                t$0$PyObject__ = org.python.core.Py.unpackSequence(t$1$PyObject, 4);
                frame.setlocal(2, t$0$PyObject__[0]);
                frame.setlocal(6, t$0$PyObject__[1]);
                frame.setlocal(3, t$0$PyObject__[2]);
                frame.setlocal(1, t$0$PyObject__[3]);
                frame.setlocal(4, s$20._mod(new PyTuple(new PyObject[] {frame.getlocal(2), frame.getlocal(6), frame.getlocal(3)})));
                if (frame.getlocal(1).__nonzero__()) {
                    frame.setlocal(4, frame.getlocal(4)._add(s$21._mod(frame.getlocal(1).invoke("strip"))));
                }
                frame.getlocal(5).invoke("append", frame.getlocal(4));
            }
            return frame.getlocal(5);
        }
        
        private static PyObject print_tb$4(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject;
            
            // Code
            /* Print up to 'limit' stack trace entries from the traceback 'tb'.
            
                If 'limit' is omitted or None, all entries are printed.  If 'file'
                is omitted or None, the output goes to sys.stderr; otherwise
                'file' should be an open file or file-like object with a write()
                method.
                 */
            if (frame.getlocal(2).__not__().__nonzero__()) {
                frame.setlocal(2, frame.getglobal("sys").__getattr__("stderr"));
            }
            if (frame.getlocal(1)._is(frame.getglobal("None")).__nonzero__()) {
                if (frame.getglobal("hasattr").__call__(frame.getglobal("sys"), s$23).__nonzero__()) {
                    frame.setlocal(1, frame.getglobal("sys").__getattr__("tracebacklimit"));
                }
            }
            frame.setlocal(6, i$24);
            while (((t$0$PyObject = frame.getlocal(0)._isnot(frame.getglobal("None"))).__nonzero__() ? ((t$0$PyObject = frame.getlocal(1)._is(frame.getglobal("None"))).__nonzero__() ? t$0$PyObject : frame.getlocal(6)._lt(frame.getlocal(1))) : t$0$PyObject).__nonzero__()) {
                frame.setlocal(7, frame.getlocal(0).__getattr__("tb_frame"));
                frame.setlocal(5, frame.getglobal("tb_lineno").__call__(frame.getlocal(0)));
                frame.setlocal(8, frame.getlocal(7).__getattr__("f_code"));
                frame.setlocal(3, frame.getlocal(8).__getattr__("co_filename"));
                frame.setlocal(4, frame.getlocal(8).__getattr__("co_name"));
                frame.getglobal("_print").__call__(frame.getlocal(2), s$17._mod(new PyTuple(new PyObject[] {frame.getlocal(3), frame.getlocal(5), frame.getlocal(4)})));
                frame.setlocal(9, frame.getglobal("linecache").__getattr__("getline").__call__(frame.getlocal(3), frame.getlocal(5)));
                if (frame.getlocal(9).__nonzero__()) {
                    frame.getglobal("_print").__call__(frame.getlocal(2), s$25._add(frame.getlocal(9).invoke("strip")));
                }
                frame.setlocal(0, frame.getlocal(0).__getattr__("tb_next"));
                frame.setlocal(6, frame.getlocal(6)._add(i$26));
            }
            return Py.None;
        }
        
        private static PyObject format_tb$5(PyFrame frame) {
            /* A shorthand for 'format_list(extract_stack(f, limit)). */
            return frame.getglobal("format_list").__call__(frame.getglobal("extract_tb").__call__(frame.getlocal(0), frame.getlocal(1)));
        }
        
        private static PyObject extract_tb$6(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject;
            
            // Code
            /* Return list of up to limit pre-processed entries from traceback.
            
                This is useful for alternate formatting of stack traces.  If
                'limit' is omitted or None, all entries are extracted.  A
                pre-processed stack trace entry is a quadruple (filename, line
                number, function name, text) representing the information that is
                usually printed for a stack trace.  The text is a string with
                leading and trailing whitespace stripped; if the source is not
                available it is None.
                 */
            if (frame.getlocal(1)._is(frame.getglobal("None")).__nonzero__()) {
                if (frame.getglobal("hasattr").__call__(frame.getglobal("sys"), s$23).__nonzero__()) {
                    frame.setlocal(1, frame.getglobal("sys").__getattr__("tracebacklimit"));
                }
            }
            frame.setlocal(7, new PyList(new PyObject[] {}));
            frame.setlocal(5, i$24);
            while (((t$0$PyObject = frame.getlocal(0)._isnot(frame.getglobal("None"))).__nonzero__() ? ((t$0$PyObject = frame.getlocal(1)._is(frame.getglobal("None"))).__nonzero__() ? t$0$PyObject : frame.getlocal(5)._lt(frame.getlocal(1))) : t$0$PyObject).__nonzero__()) {
                frame.setlocal(6, frame.getlocal(0).__getattr__("tb_frame"));
                frame.setlocal(4, frame.getglobal("tb_lineno").__call__(frame.getlocal(0)));
                frame.setlocal(8, frame.getlocal(6).__getattr__("f_code"));
                frame.setlocal(2, frame.getlocal(8).__getattr__("co_filename"));
                frame.setlocal(3, frame.getlocal(8).__getattr__("co_name"));
                frame.setlocal(9, frame.getglobal("linecache").__getattr__("getline").__call__(frame.getlocal(2), frame.getlocal(4)));
                if (frame.getlocal(9).__nonzero__()) {
                    frame.setlocal(9, frame.getlocal(9).invoke("strip"));
                }
                else {
                    frame.setlocal(9, frame.getglobal("None"));
                }
                frame.getlocal(7).invoke("append", new PyTuple(new PyObject[] {frame.getlocal(2), frame.getlocal(4), frame.getlocal(3), frame.getlocal(9)}));
                frame.setlocal(0, frame.getlocal(0).__getattr__("tb_next"));
                frame.setlocal(5, frame.getlocal(5)._add(i$26));
            }
            return frame.getlocal(7);
        }
        
        private static PyObject print_exception$7(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject, t$1$PyObject;
            
            // Code
            /* Print exception up to 'limit' stack trace entries from 'tb' to 'file'.
            
                This differs from print_tb() in the following ways: (1) if
                traceback is not None, it prints a header "Traceback (most recent
                call last):"; (2) it prints the exception type and value after the
                stack trace; (3) if type is SyntaxError and value has the
                appropriate format, it prints the line where the syntax error
                occurred with a caret on the next line indicating the approximate
                position of the error.
                 */
            if (frame.getlocal(4).__not__().__nonzero__()) {
                frame.setlocal(4, frame.getglobal("sys").__getattr__("stderr"));
            }
            if (frame.getlocal(2).__nonzero__()) {
                frame.getglobal("_print").__call__(frame.getlocal(4), s$30);
                frame.getglobal("print_tb").__call__(frame.getlocal(2), frame.getlocal(3), frame.getlocal(4));
            }
            frame.setlocal(6, frame.getglobal("format_exception_only").__call__(frame.getlocal(0), frame.getlocal(1)));
            t$0$PyObject = frame.getlocal(6).__getslice__(null, i$26.__neg__(), null).__iter__();
            while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                frame.setlocal(5, t$1$PyObject);
                frame.getglobal("_print").__call__(frame.getlocal(4), frame.getlocal(5), s$31);
            }
            frame.getglobal("_print").__call__(frame.getlocal(4), frame.getlocal(6).__getitem__(i$26.__neg__()), s$14);
            return Py.None;
        }
        
        private static PyObject format_exception$8(PyFrame frame) {
            /* Format a stack trace and the exception information.
            
                The arguments have the same meaning as the corresponding arguments
                to print_exception().  The return value is a list of strings, each
                ending in a newline and some containing internal newlines.  When
                these lines are concatenated and printed, exactly the same text is
                printed as does print_exception().
                 */
            if (frame.getlocal(2).__nonzero__()) {
                frame.setlocal(4, new PyList(new PyObject[] {s$33}));
                frame.setlocal(4, frame.getlocal(4)._add(frame.getglobal("format_tb").__call__(frame.getlocal(2), frame.getlocal(3))));
            }
            else {
                frame.setlocal(4, new PyList(new PyObject[] {}));
            }
            frame.setlocal(4, frame.getlocal(4)._add(frame.getglobal("format_exception_only").__call__(frame.getlocal(0), frame.getlocal(1))));
            return frame.getlocal(4);
        }
        
        private static PyObject format_exception_only$9(PyFrame frame) {
            // Temporary Variables
            PyObject[] t$0$PyObject__, t$1$PyObject__;
            boolean t$0$boolean;
            PyObject t$0$PyObject, t$1$PyObject;
            PyException t$0$PyException;
            
            // Code
            /* Format the exception part of a traceback.
            
                The arguments are the exception type and value such as given by
                sys.last_type and sys.last_value. The return value is a list of
                strings, each ending in a newline.  Normally, the list contains a
                single string; however, for SyntaxError exceptions, it contains
                several lines that (when printed) display detailed information
                about where the syntax error occurred.  The message indicating
                which exception occurred is the always last string in the list.
                 */
            frame.setlocal(10, new PyList(new PyObject[] {}));
            if (frame.getglobal("type").__call__(frame.getlocal(0))._eq(frame.getglobal("types").__getattr__("ClassType")).__nonzero__()) {
                frame.setlocal(2, frame.getlocal(0).__getattr__("__name__"));
            }
            else {
                frame.setlocal(2, frame.getlocal(0));
            }
            if (frame.getlocal(1)._is(frame.getglobal("None")).__nonzero__()) {
                frame.getlocal(10).invoke("append", frame.getglobal("str").__call__(frame.getlocal(2))._add(s$15));
            }
            else {
                if (frame.getlocal(0)._is(frame.getglobal("SyntaxError")).__nonzero__()) {
                    t$0$boolean = true;
                    try {
                        t$0$PyObject__ = org.python.core.Py.unpackSequence(frame.getlocal(1), 2);
                        frame.setlocal(3, t$0$PyObject__[0]);
                        t$1$PyObject__ = org.python.core.Py.unpackSequence(t$0$PyObject__[1], 4);
                        frame.setlocal(8, t$1$PyObject__[0]);
                        frame.setlocal(5, t$1$PyObject__[1]);
                        frame.setlocal(4, t$1$PyObject__[2]);
                        frame.setlocal(6, t$1$PyObject__[3]);
                    }
                    catch (Throwable x$0) {
                        t$0$boolean = false;
                        t$0$PyException = Py.setException(x$0, frame);
                        // pass
                    }
                    if (t$0$boolean) {
                        if (frame.getlocal(8).__not__().__nonzero__()) {
                            frame.setlocal(8, s$35);
                        }
                        frame.getlocal(10).invoke("append", s$36._mod(new PyTuple(new PyObject[] {frame.getlocal(8), frame.getlocal(5)})));
                        if (frame.getlocal(6)._isnot(frame.getglobal("None")).__nonzero__()) {
                            frame.setlocal(9, i$24);
                            while (((t$0$PyObject = frame.getlocal(9)._lt(frame.getglobal("len").__call__(frame.getlocal(6)))).__nonzero__() ? frame.getlocal(6).__getitem__(frame.getlocal(9)).invoke("isspace") : t$0$PyObject).__nonzero__()) {
                                frame.setlocal(9, frame.getlocal(9)._add(i$26));
                            }
                            frame.getlocal(10).invoke("append", s$21._mod(frame.getlocal(6).invoke("strip")));
                            if (frame.getlocal(4)._isnot(frame.getglobal("None")).__nonzero__()) {
                                frame.setlocal(7, s$25);
                                t$0$PyObject = frame.getlocal(6).__getslice__(frame.getlocal(9), frame.getlocal(4)._sub(i$26), null).__iter__();
                                while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                                    frame.setlocal(11, t$1$PyObject);
                                    if (frame.getlocal(11).invoke("isspace").__nonzero__()) {
                                        frame.setlocal(7, frame.getlocal(7)._add(frame.getlocal(11)));
                                    }
                                    else {
                                        frame.setlocal(7, frame.getlocal(7)._add(s$31));
                                    }
                                }
                                frame.getlocal(10).invoke("append", s$37._mod(frame.getlocal(7)));
                            }
                            frame.setlocal(1, frame.getlocal(3));
                        }
                    }
                }
                frame.setlocal(7, frame.getglobal("_some_str").__call__(frame.getlocal(1)));
                if (frame.getlocal(7).__nonzero__()) {
                    frame.getlocal(10).invoke("append", s$38._mod(new PyTuple(new PyObject[] {frame.getglobal("str").__call__(frame.getlocal(2)), frame.getlocal(7)})));
                }
                else {
                    frame.getlocal(10).invoke("append", s$39._mod(frame.getglobal("str").__call__(frame.getlocal(2))));
                }
            }
            return frame.getlocal(10);
        }
        
        private static PyObject _some_str$10(PyFrame frame) {
            // Temporary Variables
            PyException t$0$PyException;
            
            // Code
            try {
                return frame.getglobal("str").__call__(frame.getlocal(0));
            }
            catch (Throwable x$0) {
                t$0$PyException = Py.setException(x$0, frame);
                return s$40._mod(frame.getglobal("type").__call__(frame.getlocal(0)).__getattr__("__name__"));
            }
        }
        
        private static PyObject print_exc$11(PyFrame frame) {
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            PyObject t$0$PyObject;
            
            // Code
            /* Shorthand for 'print_exception(sys.exc_type, sys.exc_value, sys.exc_traceback, limit, file)'.
                (In fact, it uses sys.exc_info() to retrieve the same information
                in a thread-safe way.) */
            if (frame.getlocal(1).__not__().__nonzero__()) {
                frame.setlocal(1, frame.getglobal("sys").__getattr__("stderr"));
            }
            try {
                t$0$PyObject__ = org.python.core.Py.unpackSequence(frame.getglobal("sys").__getattr__("exc_info").__call__(), 3);
                frame.setlocal(3, t$0$PyObject__[0]);
                frame.setlocal(4, t$0$PyObject__[1]);
                frame.setlocal(2, t$0$PyObject__[2]);
                frame.getglobal("print_exception").__call__(new PyObject[] {frame.getlocal(3), frame.getlocal(4), frame.getlocal(2), frame.getlocal(0), frame.getlocal(1)});
            }
            finally {
                t$0$PyObject = frame.getglobal("None");
                frame.setlocal(3, t$0$PyObject);
                frame.setlocal(4, t$0$PyObject);
                frame.setlocal(2, t$0$PyObject);
            }
            return Py.None;
        }
        
        private static PyObject print_last$12(PyFrame frame) {
            /* This is a shorthand for 'print_exception(sys.last_type,
                sys.last_value, sys.last_traceback, limit, file)'. */
            if (frame.getlocal(1).__not__().__nonzero__()) {
                frame.setlocal(1, frame.getglobal("sys").__getattr__("stderr"));
            }
            frame.getglobal("print_exception").__call__(new PyObject[] {frame.getglobal("sys").__getattr__("last_type"), frame.getglobal("sys").__getattr__("last_value"), frame.getglobal("sys").__getattr__("last_traceback"), frame.getlocal(0), frame.getlocal(1)});
            return Py.None;
        }
        
        private static PyObject print_stack$13(PyFrame frame) {
            // Temporary Variables
            PyException t$0$PyException;
            
            // Code
            /* Print a stack trace from its invocation point.
            
                The optional 'f' argument can be used to specify an alternate
                stack frame at which to start. The optional 'limit' and 'file'
                arguments have the same meaning as for print_exception().
                 */
            if (frame.getlocal(0)._is(frame.getglobal("None")).__nonzero__()) {
                try {
                    throw Py.makeException(frame.getglobal("ZeroDivisionError"));
                }
                catch (Throwable x$0) {
                    t$0$PyException = Py.setException(x$0, frame);
                    if (Py.matchException(t$0$PyException, frame.getglobal("ZeroDivisionError"))) {
                        frame.setlocal(0, frame.getglobal("sys").__getattr__("exc_info").__call__().__getitem__(i$44).__getattr__("tb_frame").__getattr__("f_back"));
                    }
                    else throw t$0$PyException;
                }
            }
            frame.getglobal("print_list").__call__(frame.getglobal("extract_stack").__call__(frame.getlocal(0), frame.getlocal(1)), frame.getlocal(2));
            return Py.None;
        }
        
        private static PyObject format_stack$14(PyFrame frame) {
            // Temporary Variables
            PyException t$0$PyException;
            
            // Code
            /* Shorthand for 'format_list(extract_stack(f, limit))'. */
            if (frame.getlocal(0)._is(frame.getglobal("None")).__nonzero__()) {
                try {
                    throw Py.makeException(frame.getglobal("ZeroDivisionError"));
                }
                catch (Throwable x$0) {
                    t$0$PyException = Py.setException(x$0, frame);
                    if (Py.matchException(t$0$PyException, frame.getglobal("ZeroDivisionError"))) {
                        frame.setlocal(0, frame.getglobal("sys").__getattr__("exc_info").__call__().__getitem__(i$44).__getattr__("tb_frame").__getattr__("f_back"));
                    }
                    else throw t$0$PyException;
                }
            }
            return frame.getglobal("format_list").__call__(frame.getglobal("extract_stack").__call__(frame.getlocal(0), frame.getlocal(1)));
        }
        
        private static PyObject extract_stack$15(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject;
            PyException t$0$PyException;
            
            // Code
            /* Extract the raw traceback from the current stack frame.
            
                The return value has the same format as for extract_tb().  The
                optional 'f' and 'limit' arguments have the same meaning as for
                print_stack().  Each item in the list is a quadruple (filename,
                line number, function name, text), and the entries are in order
                from oldest to newest stack frame.
                 */
            if (frame.getlocal(0)._is(frame.getglobal("None")).__nonzero__()) {
                try {
                    throw Py.makeException(frame.getglobal("ZeroDivisionError"));
                }
                catch (Throwable x$0) {
                    t$0$PyException = Py.setException(x$0, frame);
                    if (Py.matchException(t$0$PyException, frame.getglobal("ZeroDivisionError"))) {
                        frame.setlocal(0, frame.getglobal("sys").__getattr__("exc_info").__call__().__getitem__(i$44).__getattr__("tb_frame").__getattr__("f_back"));
                    }
                    else throw t$0$PyException;
                }
            }
            if (frame.getlocal(1)._is(frame.getglobal("None")).__nonzero__()) {
                if (frame.getglobal("hasattr").__call__(frame.getglobal("sys"), s$23).__nonzero__()) {
                    frame.setlocal(1, frame.getglobal("sys").__getattr__("tracebacklimit"));
                }
            }
            frame.setlocal(6, new PyList(new PyObject[] {}));
            frame.setlocal(5, i$24);
            while (((t$0$PyObject = frame.getlocal(0)._isnot(frame.getglobal("None"))).__nonzero__() ? ((t$0$PyObject = frame.getlocal(1)._is(frame.getglobal("None"))).__nonzero__() ? t$0$PyObject : frame.getlocal(5)._lt(frame.getlocal(1))) : t$0$PyObject).__nonzero__()) {
                frame.setlocal(4, frame.getlocal(0).__getattr__("f_lineno"));
                frame.setlocal(7, frame.getlocal(0).__getattr__("f_code"));
                frame.setlocal(2, frame.getlocal(7).__getattr__("co_filename"));
                frame.setlocal(3, frame.getlocal(7).__getattr__("co_name"));
                frame.setlocal(8, frame.getglobal("linecache").__getattr__("getline").__call__(frame.getlocal(2), frame.getlocal(4)));
                if (frame.getlocal(8).__nonzero__()) {
                    frame.setlocal(8, frame.getlocal(8).invoke("strip"));
                }
                else {
                    frame.setlocal(8, frame.getglobal("None"));
                }
                frame.getlocal(6).invoke("append", new PyTuple(new PyObject[] {frame.getlocal(2), frame.getlocal(4), frame.getlocal(3), frame.getlocal(8)}));
                frame.setlocal(0, frame.getlocal(0).__getattr__("f_back"));
                frame.setlocal(5, frame.getlocal(5)._add(i$26));
            }
            frame.getlocal(6).invoke("reverse");
            return frame.getlocal(6);
        }
        
        private static PyObject tb_lineno$16(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject, t$1$PyObject;
            
            // Code
            /* Calculate correct line number of traceback given in tb.
            
                Even works with -O on.
                 */
            frame.setlocal(3, frame.getlocal(0).__getattr__("tb_frame").__getattr__("f_code"));
            if (frame.getglobal("hasattr").__call__(frame.getlocal(3), s$48).__not__().__nonzero__()) {
                return frame.getlocal(0).__getattr__("tb_lineno");
            }
            frame.setlocal(1, frame.getlocal(3).__getattr__("co_lnotab"));
            frame.setlocal(6, frame.getlocal(3).__getattr__("co_firstlineno"));
            frame.setlocal(5, frame.getlocal(0).__getattr__("tb_lasti"));
            frame.setlocal(4, i$24);
            t$0$PyObject = frame.getglobal("range").__call__(i$24, frame.getglobal("len").__call__(frame.getlocal(1)), i$44).__iter__();
            while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                frame.setlocal(2, t$1$PyObject);
                frame.setlocal(4, frame.getlocal(4)._add(frame.getglobal("ord").__call__(frame.getlocal(1).__getitem__(frame.getlocal(2)))));
                if (frame.getlocal(4)._gt(frame.getlocal(5)).__nonzero__()) {
                    break;
                }
                frame.setlocal(6, frame.getlocal(6)._add(frame.getglobal("ord").__call__(frame.getlocal(1).__getitem__(frame.getlocal(2)._add(i$26)))));
            }
            return frame.getlocal(6);
        }
        
        private static PyObject main$17(PyFrame frame) {
            frame.setglobal("__file__", s$49);
            
            /* Extract, format and print information about Python stack traces. */
            frame.setlocal("linecache", org.python.core.imp.importOne("linecache", frame));
            frame.setlocal("sys", org.python.core.imp.importOne("sys", frame));
            frame.setlocal("types", org.python.core.imp.importOne("types", frame));
            frame.setlocal("__all__", new PyList(new PyObject[] {s$1, s$2, s$3, s$4, s$5, s$6, s$7, s$8, s$9, s$10, s$11, s$12, s$13}));
            frame.setlocal("_print", new PyFunction(frame.f_globals, new PyObject[] {s$14, s$15}, c$0__print));
            frame.setlocal("print_list", new PyFunction(frame.f_globals, new PyObject[] {frame.getname("None")}, c$1_print_list));
            frame.setlocal("format_list", new PyFunction(frame.f_globals, new PyObject[] {}, c$2_format_list));
            frame.setlocal("print_tb", new PyFunction(frame.f_globals, new PyObject[] {frame.getname("None"), frame.getname("None")}, c$3_print_tb));
            frame.setlocal("format_tb", new PyFunction(frame.f_globals, new PyObject[] {frame.getname("None")}, c$4_format_tb));
            frame.setlocal("extract_tb", new PyFunction(frame.f_globals, new PyObject[] {frame.getname("None")}, c$5_extract_tb));
            frame.setlocal("print_exception", new PyFunction(frame.f_globals, new PyObject[] {frame.getname("None"), frame.getname("None")}, c$6_print_exception));
            frame.setlocal("format_exception", new PyFunction(frame.f_globals, new PyObject[] {frame.getname("None")}, c$7_format_exception));
            frame.setlocal("format_exception_only", new PyFunction(frame.f_globals, new PyObject[] {}, c$8_format_exception_only));
            frame.setlocal("_some_str", new PyFunction(frame.f_globals, new PyObject[] {}, c$9__some_str));
            frame.setlocal("print_exc", new PyFunction(frame.f_globals, new PyObject[] {frame.getname("None"), frame.getname("None")}, c$10_print_exc));
            frame.setlocal("print_last", new PyFunction(frame.f_globals, new PyObject[] {frame.getname("None"), frame.getname("None")}, c$11_print_last));
            frame.setlocal("print_stack", new PyFunction(frame.f_globals, new PyObject[] {frame.getname("None"), frame.getname("None"), frame.getname("None")}, c$12_print_stack));
            frame.setlocal("format_stack", new PyFunction(frame.f_globals, new PyObject[] {frame.getname("None"), frame.getname("None")}, c$13_format_stack));
            frame.setlocal("extract_stack", new PyFunction(frame.f_globals, new PyObject[] {frame.getname("None"), frame.getname("None")}, c$14_extract_stack));
            frame.setlocal("tb_lineno", new PyFunction(frame.f_globals, new PyObject[] {}, c$15_tb_lineno));
            return Py.None;
        }
        
    }
    public static void moduleDictInit(PyObject dict) {
        dict.__setitem__("__name__", new PyString("traceback"));
        Py.runCode(new _PyInner().getMain(), dict, dict);
    }
    
    public static void main(String[] args) throws java.lang.Exception {
        String[] newargs = new String[args.length+1];
        newargs[0] = "traceback";
        java.lang.System.arraycopy(args, 0, newargs, 1, args.length);
        Py.runMain(traceback._PyInner.class, newargs, traceback.jpy$packages, traceback.jpy$mainProperties, "", new String[] {"string", "random", "traceback", "sre_compile", "atexit", "warnings", "popen2", "getopt", "sre", "sre_constants", "StringIO", "QAsystem", "javaos", "repr", "copy_reg", "re", "linecache", "javapath", "UserDict", "copy", "threading", "stat", "sre_parse", "javashell"});
    }
    
}

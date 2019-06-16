import org.python.core.*;

public class ask_evaluation extends java.lang.Object {
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
        private static PyObject s$8;
        private static PyFunctionTable funcTable;
        private static PyCode c$0___init__;
        private static PyCode c$1_interprete;
        private static PyCode c$2_ask;
        private static PyCode c$3_QAsystem;
        private static PyCode c$4_main;
        private static void initConstants() {
            s$0 = Py.newString("    \012    def create_csv(self,path):\012        with open(path,'wb') as f:\012            csv_write = csv.writer(f)\012            csv_head = [\"question\", \"decoded_sparql\",\"evaluation\"]\012            csv_write.writerow(csv_head)");
            s$1 = Py.newString("\012        encoded_sparql = encoded\012        decoded_sparql = decode(encoded_sparql)\012        decoded_sparql = fix_URI(decoded_sparql)\012        return decoded_sparql ;");
            s$2 = Py.newString("cd nmt");
            s$3 = Py.newString("python -m nmt.nmt  --vocab_prefix=../{temp}/vocab --model_dir=../{temp}_model  --inference_input_file=./to_ask.txt  --inference_output_file=./output.txt --out_dir=../{temp}_model --src=en --tgt=sparql | tail -n4");
            i$4 = Py.newInteger(0);
            s$5 = Py.newString("__main__");
            s$6 = Py.newString("evaluation");
            s$7 = Py.newString("../evaluation/evaluation_questions.txt");
            s$8 = Py.newString("F:\\portfolio\\GSoC\\neural-qa\\ask_evaluation.py");
            funcTable = new _PyInner();
            c$0___init__ = Py.newCode(3, new String[] {"self", "model", "quest_path"}, "F:\\portfolio\\GSoC\\neural-qa\\ask_evaluation.py", "__init__", false, false, funcTable, 0, null, null, 0, 17);
            c$1_interprete = Py.newCode(2, new String[] {"self", "encoded"}, "F:\\portfolio\\GSoC\\neural-qa\\ask_evaluation.py", "interprete", false, false, funcTable, 1, null, null, 0, 17);
            c$2_ask = Py.newCode(3, new String[] {"self", "model", "quest_path", "q", "cmd", "quest", "quests", "decoded_sparql"}, "F:\\portfolio\\GSoC\\neural-qa\\ask_evaluation.py", "ask", false, false, funcTable, 2, null, null, 0, 17);
            c$3_QAsystem = Py.newCode(0, new String[] {}, "F:\\portfolio\\GSoC\\neural-qa\\ask_evaluation.py", "QAsystem", false, false, funcTable, 3, null, null, 0, 16);
            c$4_main = Py.newCode(0, new String[] {}, "F:\\portfolio\\GSoC\\neural-qa\\ask_evaluation.py", "main", false, false, funcTable, 4, null, null, 0, 16);
        }
        
        
        public PyCode getMain() {
            if (c$4_main == null) _PyInner.initConstants();
            return c$4_main;
        }
        
        public PyObject call_function(int index, PyFrame frame) {
            switch (index){
                case 0:
                return _PyInner.__init__$1(frame);
                case 1:
                return _PyInner.interprete$2(frame);
                case 2:
                return _PyInner.ask$3(frame);
                case 3:
                return _PyInner.QAsystem$4(frame);
                case 4:
                return _PyInner.main$5(frame);
                default:
                return null;
            }
        }
        
        private static PyObject __init__$1(PyFrame frame) {
            frame.getlocal(0).__setattr__("model", frame.getlocal(1));
            frame.getlocal(0).__setattr__("quest_path", frame.getlocal(2));
            frame.getlocal(0).__setattr__("quest", frame.getlocal(0).invoke("ask", frame.getlocal(0).__getattr__("model"), frame.getlocal(0).__getattr__("quest_path")));
            Py.println(Py.None, frame.getlocal(0).__getattr__("quest"));
            return Py.None;
        }
        
        private static PyObject interprete$2(PyFrame frame) {
            /* 
                    encoded_sparql = encoded
                    decoded_sparql = decode(encoded_sparql)
                    decoded_sparql = fix_URI(decoded_sparql)
                    return decoded_sparql ; */
            return frame.getglobal("open").__call__(frame.getlocal(1)).invoke("readlines");
        }
        
        private static PyObject ask$3(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject, t$1$PyObject;
            
            // Code
            frame.getglobal("os").__getattr__("system").__call__(s$2);
            frame.setlocal(4, s$3.__getattr__("format").__call__(new PyObject[] {frame.getlocal(1)}, new String[] {"temp"}));
            frame.getglobal("os").__getattr__("system").__call__(frame.getlocal(4));
            frame.setlocal(5, new PyList(new PyObject[] {}));
            frame.setlocal(7, frame.getlocal(0).invoke("interprete", frame.getlocal(3)));
            frame.setlocal(6, frame.getglobal("open").__call__(frame.getlocal(2)).invoke("readlines"));
            t$0$PyObject = frame.getglobal("range").__call__(i$4, frame.getglobal("len").__call__(frame.getlocal(6))).__iter__();
            while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                frame.setlocal(3, t$1$PyObject);
                frame.getlocal(5).invoke("append", new PyList(new PyObject[] {frame.getlocal(3), frame.getlocal(7)}));
            }
            return frame.getlocal(5);
        }
        
        private static PyObject QAsystem$4(PyFrame frame) {
            frame.setlocal("__init__", new PyFunction(frame.f_globals, new PyObject[] {}, c$0___init__));
            /*     
                def create_csv(self,path):
                    with open(path,'wb') as f:
                        csv_write = csv.writer(f)
                        csv_head = ["question", "decoded_sparql","evaluation"]
                        csv_write.writerow(csv_head) */
            frame.setlocal("interprete", new PyFunction(frame.f_globals, new PyObject[] {}, c$1_interprete));
            frame.setlocal("ask", new PyFunction(frame.f_globals, new PyObject[] {}, c$2_ask));
            return frame.getf_locals();
        }
        
        private static PyObject main$5(PyFrame frame) {
            frame.setglobal("__file__", s$8);
            
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            
            // Code
            frame.setlocal("sys", org.python.core.imp.importOne("sys", frame));
            frame.setlocal("re", org.python.core.imp.importOne("re", frame));
            frame.setlocal("os", org.python.core.imp.importOne("os", frame));
            frame.setlocal("csv", org.python.core.imp.importOne("csv", frame));
            frame.setlocal("QAsystem", Py.makeClass("QAsystem", new PyObject[] {}, c$3_QAsystem, null));
            if (frame.getname("__name__")._eq(s$5).__nonzero__()) {
                t$0$PyObject__ = org.python.core.Py.unpackSequence(new PyTuple(new PyObject[] {s$6, s$7}), 2);
                frame.setlocal("model", t$0$PyObject__[0]);
                frame.setlocal("quest_path", t$0$PyObject__[1]);
                frame.setlocal("qasystem", frame.getname("QAsystem").__call__(frame.getname("model"), frame.getname("quest_path")));
            }
            return Py.None;
        }
        
    }
    public static void moduleDictInit(PyObject dict) {
        dict.__setitem__("__name__", new PyString("ask_evaluation"));
        Py.runCode(new _PyInner().getMain(), dict, dict);
    }
    
    public static void main(String[] args) throws java.lang.Exception {
        String[] newargs = new String[args.length+1];
        newargs[0] = "ask_evaluation";
        java.lang.System.arraycopy(args, 0, newargs, 1, args.length);
        Py.runMain(ask_evaluation._PyInner.class, newargs, ask_evaluation.jpy$packages, ask_evaluation.jpy$mainProperties, "", new String[] {"string", "random", "traceback", "sre_compile", "atexit", "warnings", "popen2", "getopt", "sre", "sre_constants", "StringIO", "javaos", "ask_evaluation", "repr", "copy_reg", "re", "linecache", "javapath", "UserDict", "copy", "threading", "stat", "sre_parse", "javashell"});
    }
    
}

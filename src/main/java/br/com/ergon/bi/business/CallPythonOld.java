package br.com.ergon.bi.business;

public class CallPythonOld {
	
    public static void main(String[] args) {
        ExecutePy executePy = new ExecutePy();
		try {
			executePy.Processador("ProcessarETL.py", "python_scripts");
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}

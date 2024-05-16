package br.com.ergon.bi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.ergon.bi.business.ExecutePy;

@RestController
public class ETLController {

    @PostMapping("/processarETL")
    public String processarETL() {
        ExecutePy executePy = new ExecutePy();
        try {
            executePy.Processador("ProcessarETL.py", "scriptsETL");
            return "ETL executado com sucesso!";
        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao executar ETL";
        }
    }

    @PostMapping("/agendarETL")
    public String agendarETL() {
        ExecutePy executePy = new ExecutePy();
        try {
            executePy.Processador("AgendamentoETL.py", "scriptsETL");
            return "ETL executado com sucesso!";
        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao executar ETL";
        }
    }
}

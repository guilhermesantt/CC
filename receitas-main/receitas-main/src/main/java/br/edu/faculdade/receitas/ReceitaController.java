package br.edu.faculdade.receitas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ReceitaController {

    @GetMapping("/boas-vindas")
    public String boasVindas() {
        return "API de receitas da Ana - no ar!";
    }

    @GetMapping("/destaque")
    public Receita destaque() {
        return new Receita("Bolo de fubá", "Doce", 50, true);
    }

    @GetMapping("/receitas")
    public List<Receita> listar() {
        return List.of(
                new Receita("Bolo de fubá", "Doce", 50, true),
                new Receita("Salada Caesar", "Salgado", 15, false),
                new Receita("Sopa de legumes", "Salgado", 30, true),
                new Receita("Mousse de maracujá", "Doce", 10, true)
        );
    }
}
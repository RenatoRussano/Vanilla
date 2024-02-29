package br.com.fiap.Thintrack.controller;

import org.springframework.stereotype.Controller;

@Controller

public class ClientesController {

    @RequestMapping(
        method = requestmethod.GET, 
        patch ="/clientes", 
        produces = "application/json")
    
        @ResponseBody
    public String index(){
        return '''
            {
                {
                "id": 1,

                "nome": "clientes",
                "icone": "clientes-icon",
                }
            }
                ''';
    }    
}

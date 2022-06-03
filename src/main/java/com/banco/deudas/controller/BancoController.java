package com.banco.deudas.controller;

import com.banco.deudas.entity.Banco;
import com.banco.deudas.model.CuotaModel;
import com.banco.deudas.service.BancoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/mibanco")
public class BancoController {
    @Autowired
    BancoService banco;
    @GetMapping("/login")
    public String login(@RequestParam("user") String nombreUsuario, @RequestParam("psw") String clave){
        return banco.login(nombreUsuario,clave);
    }

    @GetMapping("/AllBancos")
    public List<Banco> bancoList(){
        return banco.findAllBancos();
    }
    @PostMapping("/Pagar")
    public List<Banco> Pagar(@RequestBody CuotaModel cuota){
        return banco.findAllBancos();
    }

}

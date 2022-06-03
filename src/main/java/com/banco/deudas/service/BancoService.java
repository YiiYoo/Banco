package com.banco.deudas.service;

import com.banco.deudas.entity.Banco;
import com.banco.deudas.entity.Usuario;
import com.banco.deudas.model.CuotaModel;
import com.banco.deudas.repository.BancoRepository;
import com.banco.deudas.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BancoService {
    @Autowired
    UsuarioRepository repository;
    @Autowired
    BancoRepository r;

    public String login(String nombreUsuario, String clave){
        String salida=" ";

        List<Usuario> lista = repository.findAllByNombreUsuario(nombreUsuario);
        if(lista.isEmpty()){
            salida="Usuario no existe";
        }else if(lista.get(0).getClave().equals(clave)){
            repository.save(lista.get(0));
            salida="Bienvenido";
        }else{
            salida="clave incorrecta";
        }
        return salida;
    }

    public List<Banco> findAllBancos(){

        List<Banco> banco=r.findAll();

        return banco;
    }
    public List<Banco> pagarDeuda(CuotaModel cuota){
        Banco aux=r.findById(cuota.getNombreEntidad()).get();
        if(cuota.getCantidadCuotas()==aux.getCuotasDebe()){
            aux.setCuotasDebe(0);
            aux.setDeudaPaga(1);
            aux.setSaldo(0);
        } //else if (cuota.getCantidadCuotas()!=aux.getCuotasDebe()) {
          //  aux.setCuotasDebe()+aux.setCuotasPagas()=aux.setCuotasTotales();
       // }
        return r.findAll();
    }


}

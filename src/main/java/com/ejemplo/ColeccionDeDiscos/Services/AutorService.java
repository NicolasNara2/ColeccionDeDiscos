package com.ejemplo.ColeccionDeDiscos.Services;

import com.ejemplo.ColeccionDeDiscos.Entity.Autor;
import com.ejemplo.ColeccionDeDiscos.Repository.IDao;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AutorService {

private IDao<Autor> autorDao;

    public AutorService(IDao autorDao) {
        this.autorDao = autorDao;
    }

    public IDao getAutorDao() {
        return autorDao;
    }

    public void setAutorDao(IDao autorDao) {
        this.autorDao = autorDao;
    }

    public Autor create(Autor autor){
       return autorDao.create(autor);
    }
    public void eliminar (Long id){
        autorDao.eliminar(id);
    }
    public Autor buscarId (Long id){
        return autorDao.buscarId(id);
    }

    public List<Autor> listarTodos(){
        return autorDao.listarTodos();
    }
    public Autor update(Autor autor){
        return autorDao.update(autor);
    }
}

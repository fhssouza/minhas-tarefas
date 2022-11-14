package br.com.tarefas.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tarefas.model.TarefaCategoria;
import br.com.tarefas.repository.TarefaCategoriaRepository;

@Service
public class TarefaCategoriaService {

	@Autowired
	private TarefaCategoriaRepository repositorio;
	
	public List<TarefaCategoria> getTodasCategorias(){
		return repositorio.findAll();
	}
	
	public List<TarefaCategoria> getCategoriasPorNome(String nome){
		return repositorio.findByNomeLike("%" + nome + "%");
	}
	
	public TarefaCategoria getCategoriaPorId(Integer id) {
		return repositorio.findById(id).orElseThrow(()-> new EntityNotFoundException());
	}
	
	public TarefaCategoria salvarCategoria(TarefaCategoria tarefaCategoria) {
		return repositorio.save(tarefaCategoria);
	}
	
	public void deleteByIdCategoria(Integer id) {
		repositorio.deleteById(id);
	}
	
	
}

package br.com.tarefas;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.tarefas.model.Tarefa;
import br.com.tarefas.repository.TarefaRepository;

@SpringBootTest
public class TarefaRepositoryTest {

	@Autowired
	private TarefaRepository repositorio;
	
	@Test
	void testFindByCategoria() {
		List<Tarefa> tarefas = repositorio.findByNomeCategoria("Estudos");
		Assertions.assertEquals(2, tarefas.size());
	}
	
	@Test
	void testTarefasPorCategoria() {
		List<Tarefa> tarefas = repositorio.tarefasPorCategoria("Estudos");
		Assertions.assertEquals(2, tarefas.size());
	}
}

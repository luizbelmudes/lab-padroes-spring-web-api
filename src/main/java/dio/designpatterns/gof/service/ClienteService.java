package dio.designpatterns.gof.service;

import dio.designpatterns.gof.model.Cliente;

public interface ClienteService {

        Iterable<Cliente> buscarTodos();

        Cliente buscarPorId(Long id);

        void inserir(Cliente cliente);

        void atualizar(Long id, Cliente cliente);

        void deletar(Long id);

}

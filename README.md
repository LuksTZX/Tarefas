# 📝 Lista de Tarefas

Gerenciador de tarefas para o terminal, feito em Java. As tarefas ficam guardadas em memória enquanto o programa está aberto.

## Funcionalidades

- **Adicionar** uma nova tarefa
- **Listar** todas as tarefas numeradas
- **Remover** uma tarefa pelo número
- **Sair**

## Menu

```
1 - Adicionar
2 - Listar
3 - Remover
4 - Sair
```

## Tratamentos incluídos

- Aviso quando a lista está vazia (ao listar ou remover)
- Validação do número ao remover (rejeita números fora da lista)
- Opção inválida no menu é identificada
- Letras no lugar de números não derrubam o programa
- Tarefas vazias não são aceitas


## Exemplo de execução

```
1 - Adicionar, 2 - Listar, 3 - Remover, 4 - Sair
1
Qual tarefa voce quer adicionar?
Estudar Java
Tarefa Adicionada!
1 - Adicionar, 2 - Listar, 3 - Remover, 4 - Sair
2
1 - Estudar Java
```

## Conceitos praticados

- `ArrayList<String>` (add, remove, get, size, isEmpty)
- `Scanner` com `nextInt()` e `nextLine()`
- Laço `do/while` e `switch`
- Validação de índice

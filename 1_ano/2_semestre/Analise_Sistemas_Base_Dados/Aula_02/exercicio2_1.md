# Exercício 1 - Inscrição ‘online’ de alunos em disciplinas

# Iniciar Sessão

### Descrição detalhada

| Use case                                | Iniciar Sessão                                            |
|-----------------------------------------|-----------------------------------------------------------|
| Descrição <br/> Breve do <br/> Use Case | Permite ao ator iniciar sessão no sistema                 |
| Atores                                  | Aluno, Funcionário Secretaria, Professor, Admin           |
| Outros Interessados                     | -----                                                     |
| Prioridade                              | Alta                                                      |
| Finalidade                              | Ter acesso aos dados da conta <br/> Utilização do sistema |
| Pré-<br/>condições                      | O ator deverá ter registo de acesso no sistema            |
| Pós-<br/>condições                      | O ator recebe acesso ao sistema                           |
| Trigger                                 | O utilizador tenta entrar no sistema                      |

### Fluxo de Eventos

| Fluxo de Acontecimentos | Ações de Atores                                                 | Sistema                                                                                                                                                         |
|-------------------------|-----------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Percurso Básico         | 1. Ator tenta iniciar sessão<br/> 2. O ator confirma a password | <br/><br/><br/>3. O sistema valida a password. <br/> 4. Password é válida, termina o use case.                                                                  |
| Percurso Alternativo    | B1. Utilizador seleciona a opção "Esqueci-me da password"       | A1. O utilizador insere a password incorreta, mensagem de erro é mostrada e o use case reinicia  <br/> B2. Email é enviado para o utilizador alterar a password |

### Diagrama de atividades

<img src="iniciarSessão.png" width="700" height="600" alt="Fluxo iniciar sessão">

# Imprimir Comprovativo

### Descrição detalhada

| Use case                                | Imprimir Comprovativo                                                                              |
|-----------------------------------------|----------------------------------------------------------------------------------------------------|
| Descrição <br/> Breve do <br/> Use Case | Imprime o comprovativo de inscrição                                                                |
| Atores                                  | Aluno, Funcionário Secretaria, Professor, Admin                                                    |
| Outros Interessados                     | -----                                                                                              |
| Prioridade                              | Baixa                                                                                              |
| Finalidade                              | Ter um comprovativo da inscrição                                                                   |
| Pré-<br/>condições                      | O ator deverá ter a sessão iniciada<br/> O ator deverá estar inscrito em pelo menos uma disciplina |
| Pós-<br/>condições                      | O sistema imprime os dados da inscrição                                                            |
| Trigger                                 | O utilizador seleciona a opção "Imprimir Comprovativo"                                             |

### Fluxo de Eventos

| Fluxo de Acontecimentos | Ações de Atores                                          | Sistema                                                                                                                                |
|-------------------------|----------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------|
| Percurso Básico         | 1. O ator seleciona a opção "Imprimir Comprovativo"<br/> | <br/><br/><br/>2. Verifica se aluno está inscrito<br/> 3. Sistema cria comprovativo<br/> 4. Sistema envia comprovativo por mail        |
| Percurso Alternativo    | -----                                                    | A1. Utilizador não está inscrito em nenhuma cadeira, mensagem de erro aparece<br/> A2. Sistema envia o ator para a página de inscrição |

### Diagrama de atividades

<img src="imprimirComprovativo.png" width="700" height="600" alt="Fluxo imprimir comprovativo">

# Consultar Inscrições (do Aluno)

### Descrição detalhada

| Use case                                | Consultar Inscrições (do Aluno)                             |
|-----------------------------------------|-------------------------------------------------------------|
| Descrição <br/> Breve do <br/> Use Case | O aluno consegue consultar as inscrições feitas             |
| Atores                                  | Aluno, Admin                                                |
| Outros Interessados                     | Professor, Funcionário Secretaria                           |
| Prioridade                              | Média                                                       |
| Finalidade                              | O aluno saber as cadeiras as quais conseguiu inscrever-se   |
| Pré-<br/>condições                      | O ator tem sessão iniciada <br/> Ser aluno                  |
| Pós-<br/>condições                      | O sistema mostra as cadeiras as quais o aluno está inscrito |
| Trigger                                 | O utilizador seleciona a opção "Ver inscrições"             |

### Fluxo de Eventos

| Fluxo de Acontecimentos | Ações de Atores                              | Sistema                                                      |
|-------------------------|----------------------------------------------|--------------------------------------------------------------|
| Percurso Básico         | 1. O ator seleciona a opção "Ver inscrições" | <br/><br/>2. Sistema mostra a lista de disciplinas inscritas |
| Percurso Alternativo    |                                              |                                                              |

### Diagrama de atividades
<img src="consultarInscricoes_Aluno.png" height="600" width="700" alt="Fluxo consultar inscrições">

# Consultar Lista de Inscritos a Disciplina

### Descrição detalhada

| Use case                                | Consultar Lista de Inscritos a Disciplina                        |
|-----------------------------------------|------------------------------------------------------------------|
| Descrição <br/> Breve do <br/> Use Case | Ator consegue ver a lista de alunos numa cadeira                 |
| Atores                                  | Professor, Funcionário Secretaria, Admin                         |
| Outros Interessados                     | Aluno                                                            |
| Prioridade                              | Média                                                            |
| Finalidade                              | Verificar os alunos inscritos na cadeira                         |
| Pré-<br/>condições                      | O ator deve ter a sessão iniciada <br/> Ter acesso ao case       |
| Pós-<br/>condições                      | Sistema mostra a lista de Alunos inscritos na cadeira            |
| Trigger                                 | O utilizador seleciona a opção "Ver inscritos" dentro da cadeira |

### Fluxo de Eventos

| Fluxo de Acontecimentos | Ações de Atores                                                                   | Sistema                                                                  |
|-------------------------|-----------------------------------------------------------------------------------|--------------------------------------------------------------------------|
| Percurso Básico         | 1. O ator seleciona a disciplina<br/> 2. O ator seleciona a opção "Ver inscritos" | <br/><br/> 3. O Sistema mostra a lista de alunos inscritos na disciplina |
| Percurso Alternativo    |                                                                                   |                                                                          |

### Diagrama de atividades

<img src="listaAlunosInscritos.png" width="700" height="600" alt="Fluxo lista de alunos inscritos">

# Inscrever Alunos em Disciplinas

### Descrição detalhada

| Use case                                | Inscrever Alunos em Disciplinas                                |
|-----------------------------------------|----------------------------------------------------------------|
| Descrição <br/> Breve do <br/> Use Case | Inscreve vários alunos numa disciplina previamente selecionada |
| Atores                                  | Funcionário Secretaria, Admin                                  |
| Outros Interessados                     | Aluno, Professor                                               |
| Prioridade                              | Alta                                                           |
| Finalidade                              | Inscrever alunos numa disciplina                               |
| Pré-<br/>condições                      | Utilizador ter sessão iniciada <br/> Ter acesso ao Use case    |
| Pós-<br/>condições                      | Alunos são inscritos na disciplina selecionada                 |
| Trigger                                 | O ator seleciona a opção "Inscrever alunos"                    |

### Fluxo de Eventos

| Fluxo de Acontecimentos | Ações de Atores                                                                                                                                                                                                        | Sistema                                                   |
|-------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------|
| Percurso Básico         | 1. Para cada disciplina selecionada<br/> &nbsp;&nbsp; a) O ator seleciona o código da cadeira<br/> &nbsp;&nbsp; 2. Para cada aluno selecionado<br/> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; a) O ator seleciona o nmec do aluno | <br/><br/><br/> 3. O sistema insere o aluno na disciplina |
| Percurso Alternativo    |                                                                                                                                                                                                                        |                                                           |

### Diagrama de atividades

<img src="inserirAluno.png" width="700" height="600" alt="Fluxo Inserir aluno">
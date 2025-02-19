# Sistema informático para suporte do funcionamento do serviço de alimentação de um hospital

## 1. Atores
    Enfermeira
    Médico
    Admin

## 2. StakeHolders
    DiretorHospital
    Doente

## 3. Use Cases
Todos fazem LogIn e LogOut
### Enfermeira
    ConsultarDoente
    ConsultarDieta
    ConsultarHorário
### Médico
    CriarHorário
    AlterarHorário
    ConsultarEnfermeira
    ConsultarDoentes
    AlterarDadosDoentes
    CriarDieta
    AlterarDieta
    EliminarDieta
### Admin
    Todos os anterioes
    CRUD(Médico, Enfermeira, Doente, FuncionárioCantina, Horário)

## 4. Descrição simples dos Use Cases
### ConsultarAlgo
    Ver a informação sobre esse doente, dieta, Enfermeira ou horário
### AlterarAlgo
    Alterar a informaçao do doente, dieta, Enfermeira, horário
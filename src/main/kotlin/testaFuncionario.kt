fun testaFuncionario() {
    val funcionario = Analista(nome = "Hernani", cpf = "333.333.333.33", tipoFuncionario = TipoFuncionario.comum)
    var pagamento = 2500.0
    funcionario.pagamentoSalario(
        pagamento = pagamento,
    )
    println(funcionario.toString())

    val gerente =
        Gerente(nome = "Hernani", cpf = "333.333.333.33", tipoFuncionario = TipoFuncionario.gerente, senha = 123456)
    gerente.pagamentoSalario(
        pagamento = pagamento,
    )

    if (Sistema().autenticacao(admin = gerente,password = 123456)) {
        println("Autenticado com sucesso")
    } else {
        println("Senha invalida")
    }
    println(gerente)
    val calculaBonificacao = CalculadoraBonificacao();
    calculaBonificacao.registra(funcionario)
    calculaBonificacao.registra(gerente)
    println(calculaBonificacao.total)
}
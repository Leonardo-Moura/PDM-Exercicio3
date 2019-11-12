package pdm.exercicio3.extension

import pdm.exercicio3.model.Produto

class ListaDeProdutos : ArrayList<Produto>() {

    fun Apagar(produto: Produto) : Int{
        val index = this.indexOfFirst { p -> p.Codigo == produto.Codigo }
        this.removeAt(index)
        return index
    }

    fun Adicionar(produto: Produto) : Int{
        val index = this.size

        produto.Codigo = if (this.size == 0) 0 else this[index -1].Codigo + 1
        this.add(produto)

        return index
    }

    fun Atualizar(produto: Produto) : Int{
        val index = this.indexOfFirst { p -> p.Codigo == produto.Codigo }
        this[index] = produto
        return index
    }
}
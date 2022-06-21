async function consultar(){
    let dados = await fetch('http://localhost:8080/pokemon')
    .then(response => {
        return response.json()
    })
    .catch(error => {
        console.log(error)
    });
    let result = ""
    dados.map( dado => {
        result += `<tr> <td> ${dado.nome} </td> <td> ${dado.tipo} </td> <td> ${dado.peso} </td> <td> ${dado.altura} </td> <td> ${dado.tipoBola} </td> <td>  <i onClick="remove(${dado.id})" class="bi bi-trash"></i> </td> <td> <i onClick="atualiza(${dado.id}, '${dado.nome}', '${dado.tipo}', ${dado.peso}, ${dado.altura}, '${dado.tipoBola}')" class="bi bi-pencil"></i> </td> </tr>`
    })
    document.getElementById("conteudoTabela").innerHTML = result
}

function atualiza(id, nome, tipo, peso, altura, tipoBola){
    document.getElementById("id").value = id;
    document.getElementById("nome").value = nome
    document.getElementById("tipo").value = tipo
    document.getElementById("peso").value = peso
    document.getElementById("altura").value = altura
    document.getElementById("tipoBola").value = tipoBola
} 
async function cadastrar(){
    let id = document.getElementById("id").value
    let nome = document.getElementById("nome").value
    let tipo = document.getElementById("tipo").value
    let peso = Number(document.getElementById("peso").value)
    let altura = Number(document.getElementById("altura").value)
    let tipoBola = document.getElementById("tipoBola").value

    let dados
    let metodo
    if (id) { // atualiza
        dados = {
            id, nome, tipo, peso, altura, tipoBola
        }
        metodo = 'PUT'
        alert(`PUT`)
    }
    else {
        dados = {
            nome, tipo, peso, altura, tipoBola
        }
        metodo = 'POST'
        alert(`POST`)
    }
    
    await fetch('http://localhost:8080/pokemon', {
        method: metodo,
        body: JSON.stringify(dados),
        headers: {"Content-Type": "application/json; charset=UTF-8"}
    })
    .then(response => {
       alert(`Pokemon cadastrado / atualizado com sucesso`)
    })
    .catch(error => {
        console.log(error)
    });
    consultar() // atualiza os pokemons
}

async function remove(id){
    let resposta = confirm(`Confirma a exclusão`)
    if (resposta) {
        await fetch(`http://localhost:8080/pokemon/${id}`, {
            method: 'DELETE'
        })
        .then(response => {
            alert(`Pokemon removido com sucesso`)
         })
         .catch(error => {
             console.log(error)
         });
         consultar() // atualiza os pokemons
    }
}
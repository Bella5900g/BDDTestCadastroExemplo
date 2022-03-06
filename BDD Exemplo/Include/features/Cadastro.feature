#language: pt
#encoding: UTF-8
#author: Isabella.Vieira
#version: 1.0

Funcionalidade: Validar o cadastro na aplicação

  Esquema do Cenario: Cadastro com sucesso
    Dado que acesso a aplicação
    E clico no menu My Account
    E preencho os dados de cadastro com <email>
    Quando clico no botão register
    Entao visualizo a tela my account logado
    
    Exemplos:
    | email |
    | testetes12342@gmail.com |
    | fafafa12321@gmail.com |
    | belllllla5900g@gmail.com |
    
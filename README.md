# 📊 AnotaFácil - Analisador de Notas Fiscais XML

Este é um sistema web simples, desenvolvido com **Flask** e **Python**, para realizar upload de arquivos XML de notas fiscais, consolidar os dados em um CSV e aplicar uma análise com agrupamento (`KMeans`) nos produtos com base nos preços. O resultado é exibido de forma visual em uma tabela na interface web.

---

##  Como iniciar o projeto

###  Pré-requisitos

- Python 3.8 ou superior
- pip (gerenciador de pacotes do Python)
- Git (opcional)

---

 1. Clone o repositório (ou baixe o ZIP)

 2. Crie e ative um ambiente virtual (opcional, mas recomendado)
 python -m venv venv
venv\Scripts\activate

linux: python3 -m venv venv
source venv/bin/activate

3. Instale as dependências
pip install -r requirements.txt


4. Inicie o servidor Flask

python app.py


Limpar dados gerados
Você pode limpar os arquivos e o CSV gerado clicando em “Excluir dados” no rodapé da aplicação.


Segurança e Avisos
Este projeto é apenas para fins educacionais e prototipagem.

Em produção, desative o modo debug=True no app.run.

Não armazene dados sensíveis sem criptografia/autenticação.

- Desenvolvido por Arthur

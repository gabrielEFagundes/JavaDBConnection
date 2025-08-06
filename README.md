# 🚀 JavaDBConnection

![Gatinho Codando](https://media0.giphy.com/media/v1.Y2lkPTc5MGI3NjExN3BqY3F6ZXpucnF5YWloNHlpOXkzYzFyamNjNGRuOW9lYm5lNjgyMiZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/3oKIPnAiaMCws8nOsE/giphy.gif)

Repositório para demonstração de **conexão do Java com Banco de Dados local**, utilizando **Docker** 🐳 e **Maven** 🧰.

## 📚 Sobre o Projeto

Este projeto foi criado para facilitar o entendimento e a prática de como realizar a integração entre aplicações Java ☕ e bancos de dados locais 🗄️. O uso do Docker permite criar ambientes isolados e reproduzíveis para o banco de dados, enquanto o Maven gerencia as dependências do projeto Java.

## ✨ Funcionalidades

- Exemplo de conexão entre Java e banco de dados local.
- Utilização do Docker para subir o banco de dados rapidamente.
- Gerenciamento automático de dependências via Maven.
- Estrutura pronta para estudos, experimentos ou como base para projetos maiores.

## 📁 Estrutura do Projeto

- `.gitignore`: Arquivo de configuração para ignorar arquivos desnecessários no Git.
- `pom.xml`: Gerenciador de dependências do Maven.
- `src/`: Diretório principal do código-fonte Java.
- `.idea/`: Configurações do projeto para IDEs (como IntelliJ IDEA).

## 🛠️ Pré-Requisitos

- **Java** instalado (JDK 8+ recomendado) ☕
- **Docker** instalado e rodando 🐳
- **Maven** instalado 🧰

## ▶️ Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/gabrielEFagundes/JavaDBConnection.git
   cd JavaDBConnection
   ```

2. Suba o banco de dados com Docker (consulte instruções específicas para seu banco em uso).

3. Instale as dependências do projeto:
   ```bash
   mvn install
   ```

4. Execute o projeto Java:
   ```bash
   mvn exec:java
   ```

## 🖌️ Personalização

Este repositório é pensado para ser simples, direto e fácil de adaptar para diferentes bancos de dados e cenários de estudo ou desenvolvimento.

## 👤 Autor

- [gabrielEFagundes](https://github.com/gabrielEFagundes)

---

Sinta-se livre para contribuir, abrir issues ou sugestões! 💡

# CRUD Lista de Tarefas (ToDo List)

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![JavaFX](https://img.shields.io/badge/JavaFX-blue?style=for-the-badge)
![Gradle](https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white)

Este projeto é uma aplicação de gerenciamento de tarefas (ToDo List) desenvolvida em Java, focada na implementação de uma interface gráfica intuitiva utilizando **JavaFX** e gerenciamento de dependências via **Gradle**.

## 📋 Funcionalidades

O sistema permite ao usuário gerenciar seu fluxo de trabalho através das seguintes capacidades:

*   **Adicionar Tarefa:** Criação de novas tarefas com título e descrição opcional.
*   **Listagem Dinâmica:** Visualização de todas as tarefas em um painel rolável (**ScrollPane**).
*   **Status de Conclusão:** Utilização de `CheckBox` para marcar tarefas como feitas.
*   **Gestão de Datas:** Ao concluir uma tarefa (`setSelected(true)`), um `DatePicker` é habilitado para registrar a data de finalização.
*   **Edição e Remoção:** Botões dedicados para atualizar o conteúdo de uma tarefa ou excluí-la da lista.
*   **Indicadores de Performance:** Painel de resumo que exibe em tempo real o total de tarefas, pendentes e concluídas.

---

## 🖼️ Protótipo da Interface

Abaixo está o layout estrutural da janela principal:
```text
+-----------------------------------------------------------------------+
|   TodoList                                                            |
+-----------------------------------------------------------------------+
|   Digite uma nova tarefa...   [ TextField    ]   [ Botão Adicionar]   |
|   Descrição (opcional)        [ TextArea     ]                        |
|                                                                       |
|   [Scroll Pane (Conteúdo Dinâmico)]                                   |
|   --------------------------------------------------------------------|
|   [X] Revisar prova         [ 16/04/2026 ]      [ Deletar ]           |
|       Descrição: Lorem ipsum...                 [ Atualizar ]         |
|   --------------------------------------------------------------------|
|                                                                       |
|   3 Total | 2 Pendentes | 1 Concluída                                 |
+-----------------------------------------------------------------------+

```

---

## 🛠️ Tecnologias e Implementação

O projeto utiliza o **Gradle** com o plugin oficial do JavaFX para simplificar a compilação e execução, eliminando a necessidade de configurar os módulos manualmente no comando de execução.

### Configuração Gradle (`build.gradle`)

O projeto está configurado para incluir os módulos necessários:

* `javafx.controls`
* `javafx.fxml`

### Estrutura do ScrollPane

```java
VBox painelTarefas = new VBox(10); 
ScrollPane scroll = new ScrollPane();
scroll.setPrefSize(400, 300);
scroll.setContent(painelTarefas);

```

---

## 🚀 Como Executar

Como o projeto utiliza o plugin do JavaFX para Gradle, você não precisa se preocupar com o caminho das bibliotecas nativas.

1. **Clone o repositório:**
```bash
git clone https://github.com/VonLanplace/CRUD-Lista-de-Tarefas
cd CRUD_Lista_de_Tarefas

```


2. **Execute via Terminal:**
   Utilize o wrapper do Gradle incluído no projeto:
```bash
# Linux/macOS
./gradlew run

# Windows
gradlew.bat run

```


3. **Importação na IDE:**
* **IntelliJ:** File > Open > Selecione a pasta do projeto.
* **VS Code:** Certifique-se de ter a "Extension Pack for Java" instalada e abra a pasta.



---

*Desenvolvido para consolidar conceitos de CRUD, layouts dinâmicos e automação de builds com Gradle.*

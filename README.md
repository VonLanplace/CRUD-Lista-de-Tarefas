Crie uma janela para o desenvolvimento de uma Lista de Tarefas (ToDo List)

Nota: as "caixas" são feitas com o componente/elemento CheckBox. Para fazer com que ela tenha o aspecto de selecionada, utilize o comando {nome_do_elemento}.setSelected(true);

Todos os outros itens são os Labels, TextFields. TextAreas e Buttons

```text
+-------------------------------------------+
|   TodoList                                |
+-------------------------------------------+
|       Digite uma nova tarefa...   []      |
|       Descrição (opicional)       []      |
|                                           |
|       []  Revisar para a prova            |
|                                           |
|       +----------------------------+      |
|       |Lorem ipsum dolor sid amet. |      |
|       +----------------------------|      |
|                                           |
|       []  Desenvover atividades JavaFx    |
|                                           |
|       +----------------------------+      |
|       |Lorem ipsum dolor sid amet. |      |
|       +----------------------------|      |
|                                           |
|       []  Revisar para a prova            |
|                                           |
|       +----------------------------+      |
|       |Lorem ipsum dolor sid amet. |      |
|       +----------------------------|      |
|                                           |
|       3 Total 2 Pendentes 1 Concluída     |
+-------------------------------------------+
```

Quando a tarefa for concluída, a tela deve mostrar um DatePicker para escolher a data de conclusão

Faça os Labels debaixo mostrarem os totalizadores dos tipos das tarefas

```text
|                                           |
|       3 Total 2 Pendentes 1 Concluída     |
+-------------------------------------------+

```


Para permitir que existam diversas tarefas na tela, utilize um **ScrollPane** envolvendo o painel que contém as tarefas.

```java
VBox painel = new VBox();

// Adicione os componentes para mostrar as tarefas, em seguida envolva o painel no ScrollPane

ScrollPane s1 = new ScrollPane();
s1.setPrefSize(120, 120);
s1.setContent( painel );
```

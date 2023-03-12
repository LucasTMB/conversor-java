# Conversor Java

Este projeto é um conversor de moedas, temperatura e velocidade, desenvolvido em Java. Para o conversor de moedas foi utilizado a API Awesome para obter taxas de câmbio de várias moedas. A interface gráfica foi desenvolvida com a biblioteca Swing.

## Funcionalidades do Conversor de Moedas

O conversor de moedas permite que o usuário converta valores entre várias moedas tendo o Real como base. Moedas incluídas:

* Real (BRL)
* Dólar americano (USD)
* Euro (EUR)
* Libra esterlina (GBP)
* Peso argentino (ARS)
* Peso chileno (CLP)

O usuário pode seleciona qual moeda será convertida, tendo como base o Real, e o conversor calcula a taxa de câmbio e exibe o valor convertido.

## Funcionalidades do Conversor de Temperatura

O conversor de temperatura permite que o usuário converta valores entre Celsius, Fahrenheit e Kelvin.

## Funcionalidades do Conversor de Velocidade

O conversor de velocidade permite que o usuário converta valores entre diferentes medidas de velocidade. Medidas incluídas:

* Metros por segundo (m/s)
* Quilômetros por segundo (km/s)
* Quilômetros por hora (km/h)
* Milimetros por segundo (mm/s)
* Micrômetros por segundo (µm/s)
* Milhas por segundo (mi/s)
* Milhas por hora (mph)
* Pés por segundo (ft/s)

## Pré-requisitos

Para executar o conversor de moedas (e os outros conversores), você precisa ter o Java Development Kit (JDK) instalado em seu computador.

## Como executar o projeto

1. Clone este repositório em seu computador: 
```
https://github.com/LucasTMB/conversor-java.git
```
2. Abra o projeto em sua IDE preferida (Eclipse, IntelliJ, NetBeans, etc.).
3. Execute o arquivo `Screen.java` na pasta `src`.
4. A interface gráfica será exibida e o usuário poderá selecionar qual conversor deseja utilizar através do menu.

## Como contribuir

Se você quiser contribuir para o projeto, siga estes passos:

1. Faça um fork deste repositório.
2. Crie uma nova branch com suas alterações:
```
git checkout -b minha-branch
```
3. Faça commit das suas alterações:
```
git commit -m "Adicionei uma nova funcionalidade"
```
4. Envie as alterações para o seu fork:
```
git push origin minha-branch
```
5. Abra um pull request para este repositório, explicando as suas alterações.
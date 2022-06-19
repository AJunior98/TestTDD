# Test_TDD

Este projeto consiste em desenvolver uma aplicação guiada por testes (TDD).

# Diagrama de classes e testes realizados

Os testes foram desenhados de acordo com o diagrama abaixo:

![image](https://user-images.githubusercontent.com/100853329/174487381-003d2640-aea2-4314-838e-ed63641436b8.png)

## Foram implementados 7 testes
Para a classe City, na camada controller, será realizado 5 testes:
- findAll deverá
  - retornar todos os recursos ordenados por nome
- insert deverá
  - retornar "created" (código 201), bem como uma nova cidade.
- delete deverá
  - retornar "no content" (código 204), quando existir um id independente.
- delete deverá
  - retornar "not found" (código 404), quando o id não existir.
- delete deverá
  - retornar "bad request" (código 400), quando existir um id dependente.

![image](https://user-images.githubusercontent.com/100853329/174487803-5e788ac2-2633-40a1-8e78-f1a58c6120a1.png)

Para a classe Event, na camada controller, será realizado 2 testes:
- update deveria
  - retornar um EventDTO quando o id existir
- update deveria
  - retornar "not found" (código 404), quando o id não existir.

![image](https://user-images.githubusercontent.com/100853329/174487890-cddcd5c8-f0ea-4031-a5de-abe83d592537.png)

# Resultado da aplicação
A aplicação foi desenvolvida em camadas, conforme o print abaixo:
![image](https://user-images.githubusercontent.com/100853329/174488030-9e73e203-9dbe-4617-abaa-4d8d8efa42d2.png)

Imagem do projeto final:

![image](https://user-images.githubusercontent.com/100853329/174488005-f66321f9-f356-4e66-bae8-5e9a64c4520e.png)

Imagem de todos os testes em funcionamento após o desenvolvimento da aplicação:

![image](https://user-images.githubusercontent.com/100853329/174488072-b350e009-e5b1-4a9e-9879-e58d5167aba8.png)


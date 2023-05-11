# QEHomeWorks

Инструкция по использованию заглушки:
1) Собрать и запустить проект
2) Через любой сервис для тестирования API (например Postman) нужно отправить POST запрос по адресу localhost:8080/greeting
3) В запросе должно быть 3 поля: firstname, lastname и age
4) В качестве ответа вернётся JSON с полями introdaction и name (с тем же значением, что было отправлено в запросе в поле firstname)
Пример: 
  Запрос: 
    {
      "firstname":"Tagir",
      "lastname":"Khaybullin",
      "age":21
    }
  Ответ:
    {
    "introduction": "Nice to meet you",
    "name": "Tagir"
    }

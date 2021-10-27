# graphQLExample


#Sample Queriy and result

{
  bankAccount1(id:"33b86226-e111-4b7f-b1af-db747555e510"){
    id
    name
    currency
  }
}

{
  "data": {
    "bankAccount1": {
      "id": "33b86226-e111-4b7f-b1af-db747555e510",
      "name": "Harshit",
      "currency": "USD"
    }
  }
}

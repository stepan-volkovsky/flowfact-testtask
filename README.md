# flowfact-testtask

This is a RESTful service, which should be able to delegate CRUD operations on addresses and phone numbers.
I'm using Spring here to build RESTful service and be able to use dependency injection.

Mappings:

${server-root}/${context-root}/address
GET - search addresses. Query params are 
  -- ID for address id;
  -- PC for postal code;
  -- CR for country;
  -- CRA for country area;
  -- CT for city;
  -- CTA for city area;
  -- SL0 for street line 0;
  -- SL1 for street line 0;
neither of params is required, every passed one will be included in search query.

PUT - store address. Address object should be passed as query body:
      {
         "postcode": "49000",
         "country": "Ukraine",
         "countryArea": "Dnipropetrovska oblast",
         "city": "Dnepropetrovsk",
         "cityArea": "Zhovtnevy district",
         "streetLine0": "Barykadna str 15a",
         "streetLine1": "building 3",
         "phoneNumbers":[
                           {
                               "countryCode": "38",
                               "areaCode": "56",
                               "phoneNumber": "1234567"
                           }
                        ]
      }

POST - update address. Address object should be passed as query body

DELETE - delete address. Query param ID


${server-root}/${context-root}/address/phonenum

GET - get phone numbers for specified address. Query param ID for address id

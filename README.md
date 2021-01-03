# microservicio

1. Eureka



# CO-RECTOR-ADAPTER

 

Proyecto para comunicación con RECTOR

 

## Resources

 

- [STAGING API] "url staging"

 

[![Build Status](https://drone.segurosfalabella.com/api/badges/segurosfalabella/co-rector-adapter/status.svg)](https://drone.segurosfalabella.com/segurosfalabella/co-rector-adapter)

 

URLs:

 

- Staging: "url staging"
- Production: "url production"
- Local: http://localhost:3000

 

API para realizar el proceso de venta en rector

 

dependencias base:

 

- gin-gonic ("framework para generar api rest")

 

## Requisitos

 

- Go 1.13
- make 
- Docker (solo si desea levantarlo con esta herramienta)

 

## Levantar servicio

 

### Ambiente Local

 

Se debe ejecutar los siguientes comandos en una terminal

 - sudo make dev-build (esto cosntruye el contenedor)
 - sudo make dev-run (esto ejecuta el contenedor disponibilisando los enpoint correspondientes)
 
El servicio será levantado en http://localhost:3000.

 

### Ambiente Docker

 

Se debe tener los requisitos del instalados previamente.

 

En la raiz del proyecto, crear un .env con las siguientes variables de entorno, modificando los secretos entre corchetes.


    ````
	COUNTRY=[COUNTRY]
	COMMERCE=[COMMERCE]
	PRODUCT=[PRODUCT]
	ENVIRONMENT=[ENVIRONMENT]
	ORACLE_URL=[ORACLE_URL]
	USER=[USER]
	PASSWORD=[PASSWORD]    
	
    ````

Se debe ejecutar los siguientes comandos en una terminal

 - sudo make dev-build (esto cosntruye el contenedor)
 - sudo make dev-run (esto ejecuta el contenedor disponibilisando los enpoint correspondientes)

 
El servicio será levantado en http://localhost:3000.
 


## Herramientas

 

### Logs

 

Para ver los logs que genera el servicio, ingresar al sitio de Kibana y filtrar por los siguientes datos:


- appname: co-rector-adapter
- version: version que desee revisar
- environment: staging o production

 

### Health

 

El endpoint expuesto para saber el estado de la API es GET / `/health`.

 

##

##

### Endpoint

**POST** 
``{url}/api/v1/quote``

**HEADER:**

| Parameter    | Required     | Descripction | Example      |
| ------------ | ------------ | ------------ | ------------ |
|  Host             |   |<calculated when request is sent>| |
|  User-Agent       |   |<calculated when request is sent>| |
|  Accept           |   | */* |  |
|  Accept-Encoding  |   | gzip, deflate, br | |
|  Connection       |   | keep-alive |  |

**BODY:**

```json
[
    {
        "identificacion": 1024462247,
        "tipoIdentificacion": "",
        "fechaExpedicion": "2021-01-03",
        "lugarExpedicion": "Bogota D.C",
        "nombre": "John",
        "primerApellido": "Ochoa",
        "segundoApellido": "Mesa",
        "fechaNacimiento": "2021-01-03",
        "genero": "Masculino",
        "email": "john.ochoa@gmail.com",
        "pais": "Colombia",
        "departamento": "Cundinamarca",
        "municipio": "Bogota D.C",
        "estadoCivil": "Casado",
        "estrato": "2",
        "tipoSangre": "O+",
        "eps": "Sanitas"
    },
    {
        "identificacion": 1024462248,
        "tipoIdentificacion": "",
        "fechaExpedicion": "2021-01-03",
        "lugarExpedicion": "Bogota D.C",
        "nombre": "Natalia",
        "primerApellido": "Rojas",
        "segundoApellido": "Barreto",
        "fechaNacimiento": "2021-01-03",
        "genero": "Femenino",
        "email": "natalia.rojas@gmail.com",
        "pais": "Colombia",
        "departamento": "Cundinamarca",
        "municipio": "Bogota D.C",
        "estadoCivil": "Casado",
        "estrato": "2",
        "tipoSangre": "O+",
        "eps": "Sanitas"
    }
]
```
**API GATEWAY (Centralizador)**
``{url}/api/info/**
``



**Campos infoPersona**
![image](https://user-images.githubusercontent.com/17706660/103491397-ad9aea00-4df1-11eb-8f16-565f95995fd6.png)

**Campos infoPersona**
![image](https://user-images.githubusercontent.com/17706660/103491398-b55a8e80-4df1-11eb-9834-749518368d27.png)

**Campos infoPersona**
![image](https://user-images.githubusercontent.com/17706660/103491401-bb506f80-4df1-11eb-968c-39bb8a679098.png)

**Campos infoPersona**
![image](https://user-images.githubusercontent.com/17706660/103491407-c0152380-4df1-11eb-9260-92c75098b209.png)

**Campos infoPersona**
![image](https://user-images.githubusercontent.com/17706660/103491412-c3a8aa80-4df1-11eb-8135-8b637ec85da4.png)



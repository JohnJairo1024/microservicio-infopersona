# microservicio

1. Eureka
2. zuul
3. infopersona
4. configuracion
 

## Requisitos

- Java 8
- Spring boot
- Maven
 

### Ambiente Local

 

Se debe ejecutar los siguientes comandos en una terminal

 - mvn clean install (esto cosntruye el contenedor)
  
El servicio será levantado en http://localhost:8891.

 

## Herramientas

 - Intejji Idea
 - Postman
 - h2



### Endpoint

**POST**

``http://localhost:8891/infopersona``

``http://localhost:8891/infopersona/guardar``

``http://localhost:8891/infopersona/eliminar/1024462249``


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

**Eureka**
![image](https://user-images.githubusercontent.com/17706660/103491401-bb506f80-4df1-11eb-968c-39bb8a679098.png)

**Tabla infoPersona**
![image](https://user-images.githubusercontent.com/17706660/103491407-c0152380-4df1-11eb-9260-92c75098b209.png)

**Tabla Auditoria**
![image](https://user-images.githubusercontent.com/17706660/103491412-c3a8aa80-4df1-11eb-8135-8b637ec85da4.png)



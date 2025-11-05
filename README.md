# prueba_tecnica

Prueba con arquitectura hexagonal, se ha dividido el código en tres capas principales:

- ___Dominio (Core):___


    Esta capa contiene la lógica de negocio central.
    Contiene entidades, reglas de negocio y puertos (interfaces).

- ___Aplicacion:___
  

    Implementa casos de uso y orquesta el flujo entre el dominio y la infraestructura.

- ___Infraestructura:___


  Adaptadores para bases de datos, APIs REST, mensajería, etc.

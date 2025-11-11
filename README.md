# prueba_tecnica

## Estructura del proyecto
Prueba con arquitectura hexagonal, (com.prueba), se ha dividido el código en tres capas principales:
application, domain e infrastructure

- application
  - dto
    - PriceDTO.java
  - repository
    - PriceRepository.java
  - service
    - PriceService.java
- domain
    - Price.java
- infrastructure
    - adapter
      - PriceCrudRepository.java
      - PriceRepositoryImpl.java
    - controller
      - PriceController.java
    - entity
      - PriceEntity.java
    - mapper
      - PriceMapper.java
- PruebaApplication

##  resources

He configurado la base de datos H2 en application.yml y he puesto la estructura
de la tabla PRICES en schema.sql y en data.sql los datos de la tabla

## Tests solicitados
- test
  - Se ha creado un fichero PriceServiceTest.java con las 5 pruebas test que se pedían
    - Los datos mockeados se ha creado en DataMock.java
  - Tambien he creado un test para el contexto llamado PruebaApplicationTests.java

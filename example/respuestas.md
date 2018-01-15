¿Has aplicado los principios SOLID?

Si, en nuestra arquitectura base usamos Spring como framework principal, por lo qu emuchos de los principios de SOLID los 
usamos de forma implicita dentro del mismo Framework. Tratamos siempre de diseñar y codificar bajo el principio de bajo acoplamiento
y alta cohesión. 

¿Cuánto tiempo has estado pensando y escribiendo los tests del código? Si hubieras tenido mucho más tiempo... ¿que habrías añadido?

Invertimos aproximadamente 1 hora en escribir las pruebas.   

¿Por qué motivo has elegido el lenguaje que has usado para este test?

Use Spring y angularJS. Use Spring dado que se integra fácilmente con JUNIT. 
Ayuda más a integrar los principios de SOLID y además es el Framework que usamos en la empresa

¿Cómo mejorarías la API que has usado?

Pondría la entidad Session a un nivel más alto, agrupando los proveddores por sesión para no hacer el agrupamiento en el cliente. 
Además agregaría unaconsulta predictiva por nombre de sesión y paginación.

¿Qué framework y lenguaje crees que se ha usado para exponer esta API REST? Consejo: En el protocolo HTTP viaja mucha información

Supongo que de desarrollo con Node - Express y se desplego en Amazon

¿Crees que esta API soporta peticiones CORS? ¿Cómo has llegado a esa conclusión?

Si, soporta peticiones CORS por el header access-control-allow-origin, además de que se intentó consultar el API desde una función javascript desde un fichero local y se logró ejecutar

¿En qué infraestructura crees que está alojada la API? ¿Por qué crees que hemos tomado esa decisión?

Está alojada en Amazon. Amazon ofrece muchas ventajas para servicios REST con Express, para hacer despliegues (Elastic Beanstalk) 
y para crecer elasticamente conforme la demanda (Elastic)

¿Cómo rastrearías un problema de rendimiento en producción? ¿Alguna vez has tenido que hacerlo?


En Amazon podemos usar ClodWatch para rastrear los logs de la aplicación y después conectar un APM como New Relic

Descríbete a ti mismo usando JSON.

Todo se vuelve más fácil con JSON, me encanta la terna Angular - Spring MVC / Rest - Mongo. La serialización de los datos es automática.
No sólo podría mapear una entidad con JSON, sino que a través de un documento JSON podría definir en comportamiento entero de una aplicación.

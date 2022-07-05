#language: es

Característica: Login
  Yo , como usuario
  Quiero, tener una opción para iniciar sesión
  Para ver todos los items
  @test
  Escenario: Logeo exitoso
    Dado que me encuentro en la app de login de SwagLabs
    Cuando inicio sesión con las credenciales usuario: "standard_user" y contraseña: "secret_sauce"
    Entonces valido que debería aparecer titulo de "PRODUCTOS"
    Y tambien valido que al menos exista un item
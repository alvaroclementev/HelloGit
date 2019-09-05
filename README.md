# Hello Git

Este es un proyecto de ejemplo para enseñar el funcionamiento de Git
junto con Github, Java e IntelliJ.

## Instrucciones de descarga
Para descargar el proyecto, primero asegurarse de que git está instalado:
```{bash}
git --version
``` 

Y a continuación clonar el repositorio:
```{bash}
git clone https://github.com/alvaroclementev/HelloGit.git
```

Ahora ya se puede importar y editar el proyecto desde IntelliJ.

## Ejecución
Desde la consola, podemos hacer:
```{bash}
cd HelloGit
mvn package
java -jar target/HelloGit-0.1-SNAPHOT-jar-with-dependecies.jar
```
Y deberíamos ver una salida en consola que tiene color azul
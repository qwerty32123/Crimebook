<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="estilos.css">
    <title>Crimebook</title>
  </head>
  <body>
    <div class="letradefault">

      <div>
        <table class="tablacodigo">
          <tr >
            <th style="color:white">Codigo:</th>
            <th class="codigoprogramado">AAAAA</th>
          </tr>
        </table>
        </div>
        <br>
        <br>
      <div>
        <p class="pruebaX">PRUEBA X</p>
        <hr id="linea">

      <p class="tituloprueba">Título de la prueba</p>

        <hr id="linea">

      </div>
          <div class="scrolltexto">
        <div class="textodelaprueba">

            <p>texto</p>
            <p>texto</p>
            <p>texto</p>
            <p>texto</p>
            <p>texto</p>
            <p>texto</p>
            <p>texto</p>
            <p>texto</p>
            <p id="demo"></p>
        </div>
</div>
        <form action="index.jsp" method="post">
          <input class="inputtextcodigo2" type="text" name="Codigogame" placeholder="Respuesta">
        </form>


        <table class="tablabotones" width="100%">
          <tr>
            <th><a class="botonatras" href="pagina_2.jsp"></th>
            <th><button  onclick="typeWriter()" class="botonbombilla"></button></th>
            <th><a class="botonenviar" href="pagina_2.jsp"></a></th>
          </tr>

          <script>
          var i = 0;
          var txt = 'PISTA: "texto texto texto texto texto"';
          var speed = 50;

          function typeWriter() {
            if (i < txt.length) {
              document.getElementById("demo").innerHTML += txt.charAt(i);
              i++;
              setTimeout(typeWriter, speed);
            }
          }
          </script>


  </body>
</html>

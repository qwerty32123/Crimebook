<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="resources/css/estilos.css">
    <title>Crimebook</title>
  </head>
  <body>
    <div class="letradefault">
<p id="hasperdido" >¡HAS PERDIDO!</p>
<a class="imgderrota">
      <img src="resources/img/imgderrota.png" style="width:100%"></a>

      <audio autoplay id="myaudio3">
        <source src="resources/mp3/lose.mp3" type="audio/mpeg">
      </audio>

      <script>
        var audio = document.getElementById("myaudio3");
        audio.volume = 0.1;

      </script>

    </div>
  </body>
</html>

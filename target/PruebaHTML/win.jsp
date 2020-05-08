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

      <div class="container">
       <div class="confetti"></div>
       <div class="confetti"></div>
       <div class="confetti"></div>
       <div class="confetti"></div>
       <div class="confetti"></div>
       <div class="confetti"></div>
       <div class="confetti"></div>
       <div class="confetti"></div>
       <div class="confetti"></div>
       <div class="confetti"></div>
       <div class="confetti"></div>
       <div class="confetti"></div>
       <div class="confetti"></div>
       <div class="confetti"></div>
       <div class="confetti"></div>
       <div class="confetti"></div>
       <div class="confetti"></div>
       <div class="confetti"></div>
     </div>

<p class="enhorabuena">¡ENHORABUENA</p>
<p class="hasganado">HAS GANADO!</p>

<img src="img/wincopa.png" alt="Foto copa ganador" id="copawin">


<audio autoplay loop id="myaudio">
  <source src="mp3/win.mp3" type="audio/mpeg">
</audio>

<audio autoplay id="myaudio2">
  <source src="mp3/iuju.mp3" type="audio/mpeg">
</audio>


<script>
  var audio = document.getElementById("myaudio");
  audio.volume = 0.1;

  var audio = document.getElementById("myaudio2");
  audio.volume = 0.2;
</script>

    </div>
  </body>
</html>

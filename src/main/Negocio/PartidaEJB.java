package Negocio;

import Modelos.Juegos;
import Modelos.Partidas;
import Modelos.Usuarios;

import javax.ejb.Local;
import java.util.List;

@Local
public interface PartidaEJB {
    public void guardarPartida(Integer codigo);
    public Partidas ultimaPartida();
    public List<Partidas> todasLasPartidas();
    public Juegos buscarJuegoId(Integer id);
    public Usuarios buscarUsuarioUsername(String username);

}

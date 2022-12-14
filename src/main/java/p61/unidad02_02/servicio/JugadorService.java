/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package p61.unidad02_02.servicio;

import java.util.List;
import p61.unidad02_02.modelo.Jugador;

/**
 *
 * @author tom59
 */
public interface JugadorService {

    public abstract void crear(Jugador jugador);

    public abstract void modificar(int codigo, Jugador jugadorModificado);

    public abstract void eliminar(int codigo);

    public abstract List<Jugador> listar();

}
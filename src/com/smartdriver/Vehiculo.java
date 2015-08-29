package com.smartdriver;

import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alucard on 8/13/2015.
 */
@ManagedBean
public class Vehiculo {

    private String marca;
    private String modelo;
    private String ano;
    private String categoria;
    private String placa;
    private String kilometraje;

    private List<String> listaMarcas;
    private List<String> listaModelosMitsubishi;
    private List<String> listaCategorias;
    private String[] listaAnos = new String[58];


    public Vehiculo() {
        listaMarcas = new ArrayList<String>();
        listaMarcas.add("Seleccionar");
        listaMarcas.add("Audi");
        listaMarcas.add("Chevrolet");
        listaMarcas.add("Ford");
        listaMarcas.add("Honda");
        listaMarcas.add("Hyundai");
        listaMarcas.add("Kia");
        listaMarcas.add("Mazda");
        listaMarcas.add("Mitsubishi");
        listaMarcas.add("Nissan");
        listaMarcas.add("Peugeot");
        listaMarcas.add("Toyota");
        listaMarcas.add("Subaru");
        listaMarcas.add("Suzuki");
        listaMarcas.add("Skoda");
        listaMarcas.add("Volkswagen");
        listaMarcas.add("Volvo");

        // crear categorias
        listaCategorias = new ArrayList<String>();
        listaCategorias.add("Seleccionar");
        listaCategorias.add("Camioneta");
        listaCategorias.add("Coupe");
        listaCategorias.add("Jeepeta");
        listaCategorias.add("Sedan");
        listaCategorias.add("Utilitario");

        // listaAnos
        listaAnos[0] = "Seleccionar";
        int ultimoAno = 2017;
        for (int i = 1; i < 58; i++) {
            ultimoAno -= 1;
            listaAnos[i] = String.valueOf(ultimoAno);
        }

        // modelos Mitsubishi
        listaModelosMitsubishi = new ArrayList<String>();
        listaModelosMitsubishi.add("Seleccionar");
        listaModelosMitsubishi.add("ASX");
        listaModelosMitsubishi.add("Eclipse");
        listaModelosMitsubishi.add("Endeavor");
        listaModelosMitsubishi.add("Galant");
        listaModelosMitsubishi.add("L200");
        listaModelosMitsubishi.add("Lancer");
        listaModelosMitsubishi.add("Mirage");
        listaModelosMitsubishi.add("Montero");
        listaModelosMitsubishi.add("Nativa");
        listaModelosMitsubishi.add("Outlander");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;
    }

    public List<String> getListaMarcas() {
        return listaMarcas;
    }

    public List<String> getListaCategorias() {
        return listaCategorias;
    }

    public String[] getListaAnos() {
        return listaAnos;
    }

    public List<String> getListaModelosMitsubishi() {
        return listaModelosMitsubishi;
    }
}

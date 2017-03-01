package com.taniafontcuberta.basketball.controller.managers;

import com.taniafontcuberta.basketball.model.Atleta;

import java.util.List;


public interface AtletaCallback {
    void onSuccess(List<Atleta> playerList);
    void onSucces();

    void onFailure(Throwable t);
}

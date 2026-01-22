package com.xworkz.ipl.service;

import com.xworkz.ipl.dto.IplDto;

public class IplService {
    public boolean validation(IplDto dto) {
        if (dto.getTeamName() != null && dto.getTeamName().length() <= 5
                && dto.getPlayers() <= 12 &&
                dto.getCaption() != null && dto.getCaption().length() <= 10
                && dto.getYear() < 2025
                && dto.getLocation() != null && dto.getLocation().length() >= 5) {
            return true;
        }else {
            return false;
        }

    }
}
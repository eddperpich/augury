package com.eddperpich.augury.rest;

import com.eddperpich.augury.dao.*;
import com.eddperpich.augury.entity.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Locale;

import com.eddperpich.augury.utils.GlobalConstants;

@RestController
@RequestMapping(GlobalConstants.REAL_PATH)
public class AuguryMain {

    @Autowired
    ActionEventDao dao;
    @Autowired
    PlayerDao playerDao;
    @Autowired
    ActionDao actions;
    @Autowired
    SessionDao session;
    @Autowired
    EncounterDao encounter;

    @GetMapping("/action-events/player/{name}")
    public List<ActionEvent> readEventsForPlayer(@PathVariable String name) {
        return dao.findAllEventsForPlayer(name.toUpperCase(Locale.ROOT));
    }

    @GetMapping("/menu")
    public MenuData getMenu() {
        return new MenuData(playerDao.findAll(), actions.findAll(), session.findAll(), encounter.findAll());
    }

    @Getter
    @Setter
    @AllArgsConstructor
    static class MenuData {
        List<Player> players;
        List<Action> actions;
        List<Session> sessions;
        List<Encounter> encounters;
    }
}


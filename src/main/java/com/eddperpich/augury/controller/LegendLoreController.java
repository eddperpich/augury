package com.eddperpich.augury.controller;

import com.eddperpich.augury.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.eddperpich.augury.model.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class LegendLoreController {

    @Autowired
    CharacterRepository characterRepository;

    @GetMapping("/players")
    public ResponseEntity<List<Player>> getAllCharacters(@RequestParam(required = false) String title) {
        try {
            List<Player> players = new ArrayList<Player>();

            if (title == null)
                players.addAll(characterRepository.findAll());
            else
                players.addAll(characterRepository.findByName(title));

            if (players.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(players, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/players/{id}")
    public ResponseEntity<Player> getCharacterById(@PathVariable("id") int id) {
        Optional<Player> characterData = characterRepository.findById(id);

        return characterData.map(player -> new ResponseEntity<>(player, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/characters")
    public ResponseEntity<Player> createCharacter(@RequestBody Player player) {
        try {
            Player _player = characterRepository
                    .save(new Player(player.getName(), player.getEntity_id()));
            return new ResponseEntity<>(_player, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/characters/{id}")
    public ResponseEntity<Player> updateCharacter(@PathVariable("id") int id, @RequestBody Player player) {
        Optional<Player> characterData = characterRepository.findById(id);
        if (characterData.isPresent()) {
            Player _player = characterData.get();
            _player.setName(player.getName());
            _player.setEntity_id(player.getEntity_id());
            return new ResponseEntity<>(characterRepository.save(_player), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/characters/{id}")
    public ResponseEntity<HttpStatus> deleteCharacter(@PathVariable("id") int id) {
        try {
            characterRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/characters")
    public ResponseEntity<HttpStatus> deleteAllCharacters() {
        try {
            characterRepository.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @GetMapping("/characters/{name}")
    public ResponseEntity<List<Player>> findByPublished(@PathVariable("name") String name) {
        try {
            List<Player> players = characterRepository.findByName(name);

            if (players.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(players, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}

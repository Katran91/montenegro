package com.katran.controller;

import com.katran.dao.service.ProtocolService;
import com.katran.dao.service.WinnerService;
import com.katran.dto.*;
import com.katran.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by astratii on 6/16/2015.
 */
@Controller
@RequestMapping("/api/statistic")
public class StatisticController {
    @Resource(name="protocolService")
    private ProtocolService protocolService;

    @Resource(name="winnerService")
    private WinnerService winnerService;

    @RequestMapping(value = "/protocols", method = RequestMethod.GET)
    @ResponseBody
    public List<StatisticDTO> getProtocolList(){
        List<Protocol> protocols = protocolService.getAll();
        List<StatisticDTO> statisticDTOs = new ArrayList<StatisticDTO>();

        for(Protocol protocol: protocols){
            for(Winner winner: protocol.getWinners()){
                statisticDTOs.add(new StatisticDTO(
                        winner.getWinnerId(),
                        protocol.getProtocol_id(),
                        protocol.getInstitute(),
                        protocol.getKafedra(),
                        protocol.getDysciplina_name(),
                        protocol.getDysciplina(),
                        winner.getStudent(),
                        winner.getInstitute(),
                        winner.getTeacher(),
                        winner.getKafedra(),
                        winner.getScore(),
                        winner.getPosition(),
                        winner.getPositionMONU()
                ));
            }
        }

        return statisticDTOs;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> addProtocol(@RequestBody StatisticDTO statisticDTO){
        Winner winner= new Winner(statisticDTO.getStudent_name(),statisticDTO.getStudent_institute(),
                statisticDTO.getTeacher(),statisticDTO.getTeacher_kafedra());

        winner.setWinnerId(statisticDTO.getWinnerId());


        winner.setPosition(statisticDTO.getPosition());
        winner.setPositionMONU(statisticDTO.getPositionMONU());
        winner.setScore(statisticDTO.getScore());

        winnerService.update(winner);

        return new ResponseEntity<String>("Protocol added", HttpStatus.OK);
    }
}

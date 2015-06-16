package com.katran.controller;

import com.katran.dao.service.ProtocolService;
import com.katran.dto.StatisticDTO;
import com.katran.model.Institute;
import com.katran.model.Protocol;
import com.katran.model.Winner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by astratii on 6/16/2015.
 */
@Controller
@RequestMapping("/api/statistic")
public class StatisticController {
    @Resource(name="protocolService")
    private ProtocolService protocolService;

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
}

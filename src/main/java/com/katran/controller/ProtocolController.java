package com.katran.controller;

import com.katran.dao.service.*;
import com.katran.dto.ProtocolDTO;
import com.katran.dto.WinnerDTO;
import com.katran.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;

/**
 * Created by astratii on 6/12/2015.
 */
@Controller
@RequestMapping("/api/protocol")
public class ProtocolController {
    @Resource(name="protocolService")
    private ProtocolService protocolService;
    @Resource(name="studentService")
    private StudentService studentService;
    @Resource(name="dysciplinaService")
    private DysciplinaService dysciplinaService;
    @Resource(name="instituteService")
    private InstituteService instituteService;
    @Resource(name="kafedraService")
    private KafedraService kafedraService;
    @Resource(name="teacherService")
    private TeacherService teacherService;
    @Resource(name="winnerService")
    private WinnerService winnerService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> addProtocol(@RequestBody ProtocolDTO protocolDTO){
        Protocol protocol = new Protocol();

        protocol.setDate(protocolDTO.getDate());
        protocol.setDysciplina(dysciplinaService.get(protocolDTO.getCategory()));
        protocol.setDysciplina_name(protocolDTO.getCategoryName());

        protocol.setKafedra(kafedraService.get(protocolDTO.getKafedra()));
        protocol.setInstitute(instituteService.get(protocolDTO.getInstitut()));

        Set<Winner> winners = new HashSet<Winner>();

        for(WinnerDTO winner : protocolDTO.getWinners()){
            winners.add(new Winner(winner.getStudent(),instituteService.get(winner.getStudentInstitut()),
                    winner.getTeacher(),kafedraService.get(winner.getTeacherKafedra())));
        }

        protocol.setWinners(winners);

        protocolService.add(protocol);

        return new ResponseEntity<String>("Protocol added", HttpStatus.OK);
    }

    @RequestMapping(value = "/getInstitut", method = RequestMethod.GET)
    @ResponseBody
    public List<Institute> getIntitutList(){
        return instituteService.getAll();
    }

    @RequestMapping(value = "/getKafedra", method = RequestMethod.GET)
    @ResponseBody
    public List<Kafedra> getKafedraList(){
        return kafedraService.getAll();
    }

    @RequestMapping(value = "/getDysciplina", method = RequestMethod.GET)
    @ResponseBody
    public List<Dysciplina> getDyciplinaList(){
        return dysciplinaService.getAll();
    }
}

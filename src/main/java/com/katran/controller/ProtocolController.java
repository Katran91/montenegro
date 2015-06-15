package com.katran.controller;

import com.katran.dao.service.*;
import com.katran.dto.ProtocolDTO;
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
        protocol.setDysciplina_name(protocolDTO.getCategory_name());

        protocol.setKafedra(kafedraService.get(protocolDTO.getKafedra()));
        protocol.setInstitute(instituteService.get(protocolDTO.getInstitut()));

        Winner winner1 = new Winner();
        Winner winner2 = new Winner();
        Winner winner3 = new Winner();

        winner1.setStudent(protocolDTO.getWinner1().getStudent());
        winner1.setInstitute(instituteService.get(protocolDTO.getWinner1().getStudentInstitut()));
        winner1.setTeacher(protocolDTO.getWinner1().getTeacher());
        winner1.setKafedra(kafedraService.get(protocolDTO.getWinner1().getKafedra()));
        winner1.setProtocol(protocol);

        winner2.setStudent(protocolDTO.getWinner2().getStudent());
        winner2.setInstitute(instituteService.get(protocolDTO.getWinner2().getStudentInstitut()));
        winner2.setTeacher(protocolDTO.getWinner2().getTeacher());
        winner2.setKafedra(kafedraService.get(protocolDTO.getWinner2().getKafedra()));
        winner2.setProtocol(protocol);

        winner3.setStudent(protocolDTO.getWinner3().getStudent());
        winner3.setInstitute(instituteService.get(protocolDTO.getWinner3().getStudentInstitut()));
        winner3.setTeacher(protocolDTO.getWinner3().getTeacher());
        winner3.setKafedra(kafedraService.get(protocolDTO.getWinner3().getKafedra()));
        winner3.setProtocol(protocol);

        protocol.setWinners(new HashSet<Winner>(Arrays.asList(new Winner[]{winner1, winner2, winner3})));

        protocolService.add(protocol);

        return new ResponseEntity<String>("Offer Created", HttpStatus.OK);
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

package com.katran.controller;

import com.katran.dao.service.*;
import com.katran.dto.ComParticipantsDTO;
import com.katran.dto.InstStatisticDTO;
import com.katran.dto.ProtocolDTO;
import com.katran.dto.WinnerDTO;
import com.katran.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
        protocol.setInstitute(instituteService.get(protocolDTO.getInstitute()));

        Set<Winner> winners = new HashSet<Winner>();

        for(WinnerDTO winner : protocolDTO.getWinners()){
            winners.add(new Winner(winner.getStudent(),instituteService.get(winner.getStudentInstitut()),
                    winner.getTeacher(),kafedraService.get(winner.getTeacherKafedra())));
        }

        Set<IntStatistic> instStatistics = new HashSet<IntStatistic>();

        for(InstStatisticDTO instStatistic : protocolDTO.getInstStatistic()) {
            instStatistics.add(new IntStatistic(instituteService.get(instStatistic.getInstitute()),instStatistic.getStudentCount()));
        }

        Set<ComParticipant> comParticipants = new HashSet<ComParticipant>();

        for(ComParticipantsDTO comParticipant: protocolDTO.getComParticipants()) {
           comParticipants.add(new ComParticipant(comParticipant.getName()));
        }

        protocol.setWinners(winners);
        protocol.setIntStatistics(instStatistics);
        protocol.setComParticipants(comParticipants);

        protocolService.add(protocol);

        return new ResponseEntity<String>("Protocol added", HttpStatus.OK);
    }

    @RequestMapping(value = "/getProtocolsList", method = RequestMethod.GET)
    @ResponseBody
    public List<ProtocolDTO> getProtocolsList(){
        Object a = new Integer[10];

        List<ProtocolDTO> protocolDTOs = new ArrayList<ProtocolDTO>();

        for(Protocol protocol:protocolService.getAll()){
            ProtocolDTO protocolDTO = new ProtocolDTO();

            protocolDTO.setDate(protocol.getDate());
            protocolDTO.setCategory(protocol.getDysciplina().getId());
            protocolDTO.setCategoryName(protocol.getDysciplina_name());

            protocolDTO.setKafedra(protocol.getKafedra().getId());
            protocolDTO.setInstitute(protocol.getInstitute().getId());

            Set<WinnerDTO> winners = new HashSet<WinnerDTO>();

            int i = 1;
            for(Winner winner : protocol.getWinners()){
                winners.add(new WinnerDTO(i,
                        winner.getStudent(), winner.getInstitute().getInstituteId(),
                        winner.getTeacher(), winner.getKafedra().getId()));
                i++;
            }

            Set<InstStatisticDTO> instStatisticsDTO = new HashSet<InstStatisticDTO>();

            i = 1;
            for(IntStatistic instStatistic : protocol.getIntStatistics()) {
                instStatisticsDTO.add(new InstStatisticDTO(i,instStatistic.getInstitute().getId(),instStatistic.getStudentCount()));
                i++;
            }

            Set<ComParticipantsDTO> comParticipantDTO = new HashSet<ComParticipantsDTO>();

            i = 1;
            for(ComParticipant comParticipant: protocol.getComParticipants()) {
                comParticipantDTO.add(new ComParticipantsDTO(i,comParticipant.getName()));
                i++;
            }

            protocolDTO.setWinners(winners);
            protocolDTO.setInstStatistic(instStatisticsDTO);
            protocolDTO.setComParticipants(comParticipantDTO);

            protocolDTOs.add(protocolDTO);
        }

        return protocolDTOs;
    }

    @RequestMapping(value = "/getInstitute", method = RequestMethod.GET)
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

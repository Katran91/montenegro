package com.katran.utils.service;

import com.katran.dao.service.DysciplinaService;
import com.katran.dao.service.InstituteService;
import com.katran.dao.service.KafedraService;
import com.katran.dao.service.StudentService;
import com.katran.dto.ComParticipantsDTO;
import com.katran.dto.InstStatisticDTO;
import com.katran.dto.ProtocolDTO;
import com.katran.dto.WinnerDTO;
import com.katran.model.ComParticipant;
import com.katran.model.IntStatistic;
import com.katran.model.Protocol;
import com.katran.model.Winner;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by astratii on 7/17/2015.
 */
public class ProtocolService {
    @Resource(name="protocolService")
    private com.katran.dao.service.ProtocolService protocolService;
    @Resource(name="studentService")
    private StudentService studentService;
    @Resource(name="dysciplinaService")
    private DysciplinaService dysciplinaService;
    @Resource(name="instituteService")
    private InstituteService instituteService;
    @Resource(name="kafedraService")
    private KafedraService kafedraService;

//    public static ProtocolDTO convertProtocolToDTO(Protocol protocol){
//
//    }
//
//    public static Protocol convertProtocolDTOToProtocol(ProtocolDTO protocolDTO){
//        Protocol protocol = new Protocol();
//
//        protocol.setDate(protocolDTO.getDate());
//        protocol.setDysciplina(dysciplinaService.get(protocolDTO.getCategory()));
//        protocol.setDysciplina_name(protocolDTO.getCategoryName());
//
//        protocol.setKafedra(kafedraService.get(protocolDTO.getKafedra()));
//        protocol.setInstitute(instituteService.get(protocolDTO.getInstitute()));
//
//        Set<Winner> winners = new HashSet<Winner>();
//
//        for(WinnerDTO winner : protocolDTO.getWinners()){
//            winners.add(new Winner(winner.getStudent(),instituteService.get(winner.getStudentInstitut()),
//                    winner.getTeacher(),kafedraService.get(winner.getTeacherKafedra())));
//        }
//
//        Set<IntStatistic> instStatistics = new HashSet<IntStatistic>();
//
//        for(InstStatisticDTO instStatistic : protocolDTO.getInstStatistic()) {
//            instStatistics.add(new IntStatistic(instituteService.get(instStatistic.getInstitute()),instStatistic.getStudentCount()));
//        }
//
//        Set<ComParticipant> comParticipants = new HashSet<ComParticipant>();
//
//        for(ComParticipantsDTO comParticipant: protocolDTO.getComParticipants()) {
//            comParticipants.add(new ComParticipant(comParticipant.getName()));
//        }
//
//        protocol.setWinners(winners);
//        protocol.setIntStatistics(instStatistics);
//        protocol.setComParticipants(comParticipants);
//    }
}

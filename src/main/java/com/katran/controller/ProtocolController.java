package com.katran.controller;

import com.katran.dao.service.ProtocolService;
import com.katran.dao.service.StudentService;
import com.katran.dto.ProtocolDTO;
import com.katran.model.Protocol;
import com.katran.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by astratii on 6/12/2015.
 */
@Controller
@RequestMapping("/api/protocol")
public class ProtocolController {
    @Resource(name="protocolService")
    private ProtocolService protocolService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> addStudent(@RequestBody ProtocolDTO protocol){


        return new ResponseEntity<String>("Offer Created", HttpStatus.OK);
    }
}

package com.kamil.controller;

import com.kamil.domain.LottoDto;
import com.kamil.service.LottoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lotto")
public class LottoController {

    @Autowired
    private LottoService lottoService;

    @RequestMapping(path = "/get-result", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Returns back result of bets")
    public LottoDto add(@RequestBody LottoDto dto) {
        return lottoService.calculateWins(dto);
    }

}

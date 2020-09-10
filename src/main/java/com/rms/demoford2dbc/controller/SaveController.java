package com.rms.demoford2dbc.controller;

import com.rms.demoford2dbc.domain.CheckCreateAtRet;
import com.rms.demoford2dbc.repo.CheckCreateAtRetRepo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/save")
public class SaveController {

    private final CheckCreateAtRetRepo checkCreateAtRetRepo;

    @GetMapping("/echo")
    public Mono<String> testSave() {
        return checkCreateAtRetRepo.save(new CheckCreateAtRet().setStatus("Status123"))
                .map(entity -> entity.getId() + " " + entity.getCreatedAt());
    }

}

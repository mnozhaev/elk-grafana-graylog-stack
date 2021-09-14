package com.example.demo.gateway.web;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class TestController implements ErrorController {

  @GetMapping(path = "/info")
  public String infoCall() {
    log.info("info call made");
    return "Info";
  }

  @GetMapping(path = "/warn")
  public String warnCall() {
    log.warn("warn call made");
    return "Warn";
  }

  @GetMapping(path = "/error")
  public String errorCall() {
    log.error("error call made");
    return "Error";
  }

  @Override
    public String getErrorPath() {
      return "/error";
  }
}

package com.poja.bigSum.endpoint.rest.controller;

import com.poja.bigSum.PojaGenerated;
import java.math.BigInteger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@PojaGenerated
@RestController
public class BigSumController {

  @GetMapping("/big-sum")
  public String calculateBigSum(@RequestParam("a") String a, @RequestParam("b") String b) {
    try {
      BigInteger numberA = new BigInteger(a);
      BigInteger numberB = new BigInteger(b);
      BigInteger sum = numberA.add(numberB);

      return sum.toString();
    } catch (NumberFormatException e) {
      throw new RuntimeException("Please provide valid numbers : " + e.getMessage());
    }
  }
}

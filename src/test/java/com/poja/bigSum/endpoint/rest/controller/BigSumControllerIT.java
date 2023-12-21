package com.poja.bigSum.endpoint.rest.controller;

import com.poja.bigSum.PojaGenerated;
import com.poja.bigSum.conf.FacadeIT;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@PojaGenerated
class BigSumControllerIT extends FacadeIT {

  @Autowired
  BigSumController bigSumController;

  @Test
  void test_big_sum_endpoint() {
    String a = "100000000000000000000000000000000000000000000000000000000000";
    String b = "200000000000000000000000000000000000000000000000000000000000";
    String expectedResult = "300000000000000000000000000000000000000000000000000000000000";

    String result = bigSumController.calculateBigSum(a, b);

    Assertions.assertEquals(expectedResult, result);
  }
}

package com.udacity.pricing.api;

import com.udacity.pricing.domain.price.Price;
import com.udacity.pricing.service.PricingService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PricingControllerTest {

    @Test
    public void getCarPrice() {

    }
}
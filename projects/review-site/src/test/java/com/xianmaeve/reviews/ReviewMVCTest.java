package com.xianmaeve.reviews;


import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.Collection;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest
public class ReviewMVCTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ReviewRepository testRepo;

    @Mock
    private Review testOne;

    @Mock
    private Review testTwo;

    @Test
    public void should200AllReviews() throws Exception{
        mockMvc.perform(get("/reviews")).andExpect(status().isOk()).andExpect(view().name("reviewsTemplate"));

    }

    @Test
    public void should200OneReview() throws Exception{
        Long testOneID= 1l;
        when(testRepo.getOne(testOneID)).thenReturn(testOne);
        mockMvc.perform(get("/review?id=1")).andExpect(status().isOk()).andExpect(model().attribute("reviewModel", testOne));
    }


    @Test
    public void shouldFindAllReviews() throws Exception{
        Collection<Review> allReviews = Arrays.asList(testOne, testTwo);
        when(testRepo.getAll()).thenReturn(allReviews);
        mockMvc.perform(get("/reviews")).andExpect(model().attribute("reviewsModel", allReviews));
    }
}

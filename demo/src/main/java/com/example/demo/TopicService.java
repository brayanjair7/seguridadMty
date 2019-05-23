/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author braya
 */
@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(
            new Topic("spring", "Spring FrameWork", "Spring Description"),
            new Topic("java", "JAVA NETBEANS", "Java Description"),
            new Topic("SQL", "SQL DB", "sql Description")
    );

    public List<Topic> getAllTopics() {
        return topics;
    }
}

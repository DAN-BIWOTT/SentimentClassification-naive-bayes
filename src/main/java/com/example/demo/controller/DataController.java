/**
 * 
 */
package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class DataController {
	@Autowired
    private SentimentalAnalysis sentimentAnalysis;
	
	@GetMapping("/testApi")
    public ResponseEntity<Object> getAllResponse() {
		return ResponseEntity.ok(sentimentAnalysis.getAnalysisResponse());
    }
	@PostMapping("/analysedData")
    public ResponseEntity<Object> postDataSet(@RequestBody SentimentalAnalysis data) {
		return ResponseEntity.ok(this.sentimentAnalysis.createDataSet(data));
    }
}
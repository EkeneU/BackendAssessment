//package com.assessment.BackendAssessment;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api")
//public class ContributionsRestController {
//
//    @Autowired
//    private ContributionsService service;
//    @PostMapping("/causes")
//    public Contributions addCauses(@RequestBody Contributions contributions) {
//        contributions.set_id(0);
//
//        return service.save(contributions);
//    }
//}

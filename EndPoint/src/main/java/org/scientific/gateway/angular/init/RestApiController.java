package org.scientific.gateway.angular.init;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.scientific.gateway.angular.init.DataPost;
//import org.airavata.teamzenith.dao.JobDetails;
//import org.airavata.teamzenith.dao.UserDetails;
//import org.airavata.teamzenith.webmethods.CancelJob;
//import org.airavata.teamzenith.webmethods.MonitorJob;
//import org.airavata.teamzenith.webmethods.SubmitJob;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
//import com.jcraft.jsch.JSchException;
/*
 * This is the main controller class which provides the following three REST APIs
 * upload- Accepts user and job details in order to submit a job on Karst
 * monitor- Accepts user details and job ID which is used to fetch the status of the job
 * cancel - Accepts user details and job ID which is used to cancel the job
 */
@RestController
public class RestApiController {

	@RequestMapping(value="/upload", method=RequestMethod.GET)
	public @ResponseBody String provideUploadInfo() {
		return "A Karst job can be submitted by POSTing to this URL.";
	}

	@RequestMapping(value="/upload", method=RequestMethod.POST, consumes = "application/json",produces= "application/json")
	public @ResponseBody DataPost handleFileUpload( @RequestBody DataPost datapost){
		
		System.out.println(datapost.getUsername());
		datapost.setUsername(datapost.getUsername()+"Controller");
		System.out.println("hello");
		return datapost;
	}

	
	}

//public @ResponseBody String handleFileUpload(			@RequestParam(value = "username", required =false) String jobName, @RequestParam(value ="size",required = false) String nodes,
//@RequestParam(value ="email",required =false) String email){
//System.out.println("hello");
//return "The company data (name: , employees: "+ jobName + ", headoffice: " + email + ") is saved";
//}
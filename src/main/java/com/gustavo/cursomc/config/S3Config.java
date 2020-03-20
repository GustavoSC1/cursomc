package com.gustavo.cursomc.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;

import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.S3ClientOptions;

@Configuration
public class S3Config {
	
	@Value("${aws.access_key_id}")
	private String awsId;
	
	@Value("${aws.secret_access_key}")
	private String awsKey;
    
	 String NINJA_URL = "http://localhost:9444/s3";
	/*
	@Value("${s3.region}")
	private String region;*/
	/*
	@Bean
	public AmazonS3 s3client() {
		BasicAWSCredentials awsCred = new BasicAWSCredentials(awsId, awsKey);
		AmazonS3 s3client = AmazonS3ClientBuilder.standard().withRegion(Regions.fromName(region))
				.withCredentials(new AWSStaticCredentialsProvider(awsCred)).build();
		return s3client;
	}*/
	
	 @Bean
	public AmazonS3Client s3client() {
		 AWSCredentials credentials = new BasicAWSCredentials(
					"",
					"");			
			
			AmazonS3Client newClient =	new AmazonS3Client(credentials,	new ClientConfiguration());
			newClient.setS3ClientOptions(S3ClientOptions.builder().setPathStyleAccess(true).disableChunkedEncoding().build());
			newClient.setEndpoint("http://localhost:9444/s3");
			return newClient;
	}
}

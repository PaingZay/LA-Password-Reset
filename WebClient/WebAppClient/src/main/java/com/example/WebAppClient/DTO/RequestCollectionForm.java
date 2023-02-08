package com.example.WebAppClient.DTO;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class RequestCollectionForm 
{

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

    private String packageName;
    private int quantity = 1;

    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalTime start;
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalTime end;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate pickUpDate;

    private String status = "Pending";
    private String description;
    private String category;
    private String itemList;
    private Long businessId;


    public RequestCollectionForm (String packageName, int quantity, LocalTime start, LocalTime end, LocalDate pickUpDate, String description, String category, Long businessId){
        this.packageName = packageName;
        this.quantity = quantity;
        this.start = start;
        this.end = end;
        this.pickUpDate = pickUpDate;
        this.description = description;
        this.category = category;
        this.businessId = businessId;
    }
}

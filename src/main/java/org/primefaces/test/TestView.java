package org.primefaces.test;

import java.io.Serializable;
import java.time.LocalDate;
import java.math.BigDecimal;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import lombok.Data;

@Data
@Named
@ViewScoped
public class TestView implements Serializable {
    
    private String string;
    private Integer integer;
    private BigDecimal decimal;
    private LocalDate startDate;
    private LocalDate endDate;
    
    private String stringDialog;
    private LocalDate startDateDialog;
    private LocalDate endDateDialog;
    
    @PostConstruct  
    public void init() {
        string = "Welcome to PrimeFaces!!!";
    }
    
    public String getString() {
    	return string;
    }

    public void setString(String string) {
    	this.string = string;
    }

	public Integer getInteger() {
		return integer;
	}

	public void setInteger(Integer integer) {
		this.integer = integer;
	}

	public BigDecimal getDecimal() {
		return decimal;
	}

	public void setDecimal(BigDecimal decimal) {
		this.decimal = decimal;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getStringDialog() {
		return stringDialog;
	}

	public void setStringDialog(String stringDialog) {
		this.stringDialog = stringDialog;
	}

	public LocalDate getStartDateDialog() {
		return startDateDialog;
	}

	public void setStartDateDialog(LocalDate startDateDialog) {
		this.startDateDialog = startDateDialog;
	}

	public LocalDate getEndDateDialog() {
		return endDateDialog;
	}

	public void setEndDateDialog(LocalDate endDateDialog) {
		this.endDateDialog = endDateDialog;
	}
}

package com.magnit.EmpSatiProj.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="employee_data")
public class EmployeeEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String overallSatisfaction;
	private String valuedAtWorks;
	private String feedbacks;
	private String dayOfWeek;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOverallSatisfaction() {
		return overallSatisfaction;
	}
	public void setOverallSatisfaction(String overallSatisfaction) {
		this.overallSatisfaction = overallSatisfaction;
	}
	public String getValuedAtWorks() {
		return valuedAtWorks;
	}
	public void setValuedAtWorks(String valuedAtWorks) {
		this.valuedAtWorks = valuedAtWorks;
	}
	public String getFeedbacks() {
		return feedbacks;
	}
	public void setFeedbacks(String feedbacks) {
		this.feedbacks = feedbacks;
	}
	public String getDayOfWeek() {
		return dayOfWeek;
	}
	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", name=" + name + ", overallSatisfaction=" + overallSatisfaction
				+ ", valuedAtWorks=" + valuedAtWorks + ", feedbacks=" + feedbacks + ", dayOfWeek=" + dayOfWeek + "]";
	}
}

package com.blinkx.excelStatus.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="m_top_fund")
public class TopFund implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column
	private String listOfFund;
	
	@Column
	private boolean topFunds;
	
	@Column
	private boolean wealthCreation;
	
	@Column
	private boolean topTaxSaver;
	
	@Column
	private boolean balanceFunds;
	
	@Column
	private boolean betterThanSavings;
	
	@Column
	private boolean betterThanFd;
	

	public TopFund(long id, String listOfFund, boolean topFunds, boolean wealthCreation, boolean topTaxSaver,
			boolean balanceFunds, boolean betterThanSavings, boolean betterThanFd) {
		super();
		this.id = id;
		this.listOfFund = listOfFund;
		this.topFunds = topFunds;
		this.wealthCreation = wealthCreation;
		this.topTaxSaver = topTaxSaver;
		this.balanceFunds = balanceFunds;
		this.betterThanSavings = betterThanSavings;
		this.betterThanFd = betterThanFd;
	}



	public TopFund() {
		
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getListOfFund() {
		return listOfFund;
	}



	public void setListOfFund(String listOfFund) {
		this.listOfFund = listOfFund;
	}



	public boolean isTopFunds() {
		return topFunds;
	}



	public void setTopFunds(boolean topFunds) {
		this.topFunds = topFunds;
	}



	public boolean isWealthCreation() {
		return wealthCreation;
	}



	public void setWealthCreation(boolean wealthCreation) {
		this.wealthCreation = wealthCreation;
	}



	public boolean isTopTaxSaver() {
		return topTaxSaver;
	}



	public void setTopTaxSaver(boolean topTaxSaver) {
		this.topTaxSaver = topTaxSaver;
	}



	public boolean isBalanceFunds() {
		return balanceFunds;
	}



	public void setBalanceFunds(boolean balanceFunds) {
		this.balanceFunds = balanceFunds;
	}



	public boolean isBetterThanSavings() {
		return betterThanSavings;
	}



	public void setBetterThanSavings(boolean betterThanSavings) {
		this.betterThanSavings = betterThanSavings;
	}



	public boolean isBetterThanFd() {
		return betterThanFd;
	}



	public void setBetterThanFd(boolean betterThanFd) {
		this.betterThanFd = betterThanFd;
	}



	@Override
	public String toString() {
		return "TopFund [id=" + id + ", listOfFund=" + listOfFund + ", topFunds=" + topFunds + ", wealthCreation="
				+ wealthCreation + ", topTaxSaver=" + topTaxSaver + ", balanceFunds=" + balanceFunds
				+ ", betterThanSavings=" + betterThanSavings + ", betterThanFd=" + betterThanFd + "]";
	}
	
	
	
	
}

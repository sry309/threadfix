package com.denimgroup.threadfix.data.entities;

public enum ScannerType {
	ACUNETIX_WVS("acunetix", "Acunetix WVS"),
	APPSCAN_DYNAMIC("appscan", "IBM Rational AppScan"),
	ARACHNI("arachni", "Arachni"),
	BRAKEMAN("brakeman", "Brakeman"),
	BURPSUITE("burp", "Burp Suite"),
	CAT_NET("catnet", "Microsoft CAT.NET"),
	DEPENDENCY_CHECK("dependencycheck", "Dependency Check"),
	FINDBUGS("findbugs", "FindBugs"),
	FORTIFY("fortify", "Fortify 360"),
	NESSUS("nessus", "Nessus"),
	NTO_SPIDER("nto", "NTO Spider"),
	NETSPARKER("netsparker", "Mavituna Security Netsparker"),
	SKIPFISH("skipfish", "Skipfish"),
	W3AF("w3af", "w3af"),
	WEBINSPECT("webinspect", "WebInspect"),
	ZAPROXY("zap", "OWASP Zed Attack Proxy"),
	APPSCAN_SOURCE("appscansource", "IBM Rational AppScan Source Edition"),
	APPSCAN_ENTERPRISE("appscanenterprise", "IBM Rational AppScan Enterprise");

	private String fullName;
	private String shortName;
	
	public String getFullName() { 
		return this.fullName; 
	}
	
	public String getShortName() {
		return this.shortName;
	}
	
	private ScannerType(String shortName, String fullName) { 
		this.shortName = shortName;
		this.fullName = fullName;
	}
	
}
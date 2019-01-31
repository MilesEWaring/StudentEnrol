package com.enrol

class Module {
	String module_title;
	String module_code;
	int credits;
	String lecturer;
	String course;
	String description;

    static constraints = {
    	module_title nullable: false
    	module_title blank: false
    	module_code nullable: false
    	module_code blank: false
    	lecturer nullable: false
    	lecturer blank: false
    	credits nullable: false
    	credits blank: false
    	credits minSize: 20
    	credits maxSize: 120
    	description nullable: false
    	description blank: false
    	description maxSize: 5000
    	description widget: 'textarea'
    }
}

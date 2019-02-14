package com.enrol

class Course {

	String department
	String courseTitle
	String courseLeader
	String courseCode
	Date startDate
	Date endDate
	String description
	int numberOfStudents
	double tuitionFees
	String studyMode

	static constraints = {
    		courseTitle nullable: false
    		courseTitle blank: false
    		department nullable: false
    		department blank: false
    		courseLeader nullable: false
    		courseLeader blank: false
    		courseCode nullable: false
    		courseCode blank: false
    		startDate nullable: false
    		startDate blank: false
    		endDate nullable: false
    		endDate blank: false
    		numberOfStudents nullable: false
    		numberOfStudents blank: false
    		numberOfStudents minSize: 20
    		numberOfStudents maxSize: 60
    		studyMode nullable: false
    		studyMode blank: false
    		studyMode size: 1..20
    		description nullable: false
    		description blank: false
    		description maxSize: 5000
    		description widget: 'textarea'
    		tuitionFees nullable: false
    		tuitionFees blank: false
        }



}

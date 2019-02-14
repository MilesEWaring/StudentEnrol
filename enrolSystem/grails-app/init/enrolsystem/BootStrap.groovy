package com.enrol

class BootStrap {

    def init = { servletContext ->
	def computing = new Course(
		department: 'Computing',
		courseTitle: 'BSc Hon Computing',
		courseLeader: 'Dr Michelle Murphy',
		courseCode: 'CS123',
		startDate: new Date ('09/07/2019'),
		endDate: new Date ('07/09/2023'),
		description: 'Lorem ipsum',
		numberOfStudents: 55,
		tuitionFees: 9000.60,
		studyMode: 'Fulltime').save()
	
	def MilesWaring = new Student(
		studentName: 'Miles',
		studentID: 'b6029387',
		dob: new Date ('20/06/1997'),
		isFundingAvailable: 'True',
		studentEmail: 'b6029387@my.shu.ac.uk',
		studentUsername: 'b6029387',
		studentPassword: 'password123',
		course: 'BSc Hon Computing').save()
	
	def BenYardley = new Student(
		studentName: 'Ben',
		studentID: 'b7039287',
		dob: new Date ('20/06/1998'),
		isFundingAvailable: 'True',
		studentEmail: 'b7039287@my.shu.ac.uk',
		studentUsername: 'b7039287',
		studentPassword: 'password321',
		course: 'BSc Hon Computing').save()

	def TonderiMaswera = new Lecturer(
		fullName: 'Tonderi Maswera',
		post: 'Department Head',
		subject: 'Computer Science',
		lecturerEmail: 'T.Maswera@my.shu.ac.uk',
		office: '9321',
		bio: 'Lorem Ipsum').save()

	def SystemArchitecture = new Module(
		module_title: 'System Architecture',
		module_code: 'abc123',
		credits: 150,
		lecturer: 'Tonderi Maswera',
		course: 'Computing',
		description: 'Lorem Ipsum').save()

	
		
    }
    def destroy = {
    }
}

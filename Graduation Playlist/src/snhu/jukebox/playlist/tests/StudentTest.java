package snhu.jukebox.playlist.tests;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import snhu.jukebox.playlist.Student;
import snhu.jukebox.playlist.StudentList;
import snhu.student.playlists.*;


public class StudentTest {

	//Test the list of student names and ensure we get back the name value we expect at the correct/specific point in the list
	@Test
	public void testGetStudentNameList1() {
		List<String> studentNames = new ArrayList<String>();							//create variable for student list of names
		StudentList studentList = new StudentList();									//instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();									//populate the studentNames list with the actual values in the StudentsList object
		assertEquals("TestStudent1Name", studentNames.get(0));							//test case for pass/fail. We expect the first name to be TestStudent1Name. Remember arrays start their count at 0 not 1.
	}
	
	@Test
	public void testGetStudentNameList8() {
		List<String> studentNames = new ArrayList<String>(); 							// Instantiate an ArrayList variable to hold list of student names
		StudentList studentList = new StudentList();									// Instantiate studentList object
		studentNames = studentList.getStudentsNames(); 									// Populate studentNames ArrayList from studentList object 
		assertEquals("Brittany Martinez", studentNames.get(7));                   // Is it the right name?
	}
	
	//Module 6 Test Case Area
	//Test each student profile to ensure it can be retrieved and accessed
	@Test
	public void testGetStudent1Profile() {
		TestStudent1_Playlist testStudent1Playlist = new TestStudent1_Playlist();						//instantiating the variable for a specific student
		Student TestStudent1 = new Student("TestStudent1", testStudent1Playlist.StudentPlaylist());		//creating populated student object
		assertEquals("TestStudent1", TestStudent1.getName());											//test case pass/fail line - did the name match what you expected?
	}
	
	@Test
	public void testGetBrittanyMartinezProfile() {
		BrittanyMartinez_Playlist brittanyMartinezPlaylist = new BrittanyMartinez_Playlist();						//instantiating the variable for Brittany Martinez
		Student BrittanyMartinez = new Student("BrittanyMartinez", brittanyMartinezPlaylist.StudentPlaylist());    //creating populated student object
		assertEquals("BrittanyMartinez", BrittanyMartinez.getName());											//test case pass/fail line to make sure the name is "Brittany Martinez"
	}

	
	//Module 6 - Add your unit test case here to check for your profile after you have added it to the StudentList
	
}


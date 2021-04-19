package snhu.jukebox.playlist;

import snhu.student.playlists.*;

import java.util.ArrayList;
import java.util.List;

public class StudentList {

	public StudentList(){
	}

	public List<String> getStudentsNames() {
		ArrayList<String> studentNames = new ArrayList<String>();
		
		String StudentName1 = "TestStudent1Name";
		studentNames.add(StudentName1);
		
		String StudentName2 = "TestStudent2Name";
		studentNames.add(StudentName2);
		
		String StudentName8 = "Brittany DelAccort";
		studentNames.add(StudentName8);

		return studentNames;
	}

	public Student GetStudentProfile(String student){
		Student emptyStudent = null;
	
		switch(student) {
		   case "TestStudent1_Playlist":
			   TestStudent1_Playlist testStudent1Playlist = new TestStudent1_Playlist();
			   Student TestStudent1 = new Student("TestStudent1", testStudent1Playlist.StudentPlaylist());
			   return TestStudent1;
			   
		   case "BrittanyMartinez_Playlist":
			   BrittanyMartinez_Playlist brittanyMartinezPlaylist = new BrittanyMartinez_Playlist();
			   Student BrittanyMartinez = new Student("BrittanyMartinez", brittanyMartinezPlaylist.StudentPlaylist());
			   return BrittanyMartinez;
			   
		   //Module 6 Code Assignment - Add your own case statement for your profile. Use the above case statements as a template.

		}
		return emptyStudent;
	}
}
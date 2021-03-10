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
		
		String StudentName3 = "Justin Carlson";
		studentNames.add(StudentName3);
		
		String StudentName4 = "Garrett Waag";
		studentNames.add(StudentName4);
		
		String StudentName5 = "Emily McCann";
		studentNames.add(StudentName5);
		
		String StudentName6 = "Jacob Mousseau";
		studentNames.add(StudentName6);
		
		String StudentName7 = "Dylan O'Malley-Morrison";
		studentNames.add(StudentName7);
		
		String StudentName8 = "Brittany Martinez";
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
			   
		   case "TestStudent2_Playlist":
			   TestStudent2_Playlist testStudent2Playlist = new TestStudent2_Playlist();
			   Student TestStudent2 = new Student("TestStudent2", testStudent2Playlist.StudentPlaylist());
			   return TestStudent2;
			   
		   case "JustinCarlson_Playlist":
			   JustinCarlson_Playlist justinCarlsonPlaylist = new JustinCarlson_Playlist();
			   Student JustinCarlson = new Student("JustinCarlson", justinCarlsonPlaylist.StudentPlaylist());
			   return JustinCarlson;
			   
		   //case to retrieve EmilyMcCann student profile
		   case "EmilyMcCann_Playlist":
			   EmilyMcCann_Playlist emilyMcCannPlaylist = new EmilyMcCann_Playlist();
			   Student EmilyMcCann = new Student("EmilyMcCann", emilyMcCannPlaylist.StudentPlaylist());
			   return EmilyMcCann;
			   
		   case "BrittanyMartinez_Playlist":
			   BrittanyMartinez_Playlist brittanyMartinezPlaylist = new BrittanyMartinez_Playlist();
			   Student BrittanyMartinez = new Student("BrittanyMartinez", brittanyMartinezPlaylist.StudentPlaylist());
			   return BrittanyMartinez;
			   
		   //Module 6 Code Assignment - Add your own case statement for your profile. Use the above case statements as a template.

		}
		return emptyStudent;
	}
}
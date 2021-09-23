public class Datamatik {
public static Student[] studentsArray = {
new Student("Sofia", 19, true,'b'),
new Student("Kristian", 25, false,'b'),
new Student("Malene", 34, true,'b'),
new Student("Muneep", 26, false,'b'),
new Student("Long", 29, false,'b'),
new Student("Jens", 60, false,'b'),
new Student("Martin", 24, false,'b'),
new Student("Phil", 25, false,'b'),
new Student("Betul", 25, true,'b'),
new Student("Denis", 39, false,'b')
};

public static void main(String[] args) {
  Teacher TeacherWilliam = new Teacher("William", 300, false);

  printNames(studentsArray, 0);
  printNames(studentsArray, 1);
  printNames(studentsArray, 5);
  System.out.println(printIndex(studentsArray, "Martin"));
  System.out.println(printIndex(studentsArray, "Sofia"));
  System.out.println(printIndex(studentsArray, "Muneep"));

  System.out.println("Our teacher is " + TeacherWilliam.name);
}

public static String printNames(Student[] newStudentsArray, int newIndex) {
  Student instance = newStudentsArray[newIndex];
  System.out.println(instance.name);
  return instance.name;

}

public static int printIndex(Student[] newStudentsArray, String newName) {
  int index = -1;
  for(int i =0; i<newStudentsArray.length; i++) {
    Student instance = newStudentsArray[i];
    if (newName.equals(instance.name)) {
      index = i;
    }
  }
  return index;
  }

}

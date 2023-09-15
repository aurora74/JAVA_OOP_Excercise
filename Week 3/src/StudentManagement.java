public class StudentManagement {
    private Student[] students = new Student[100];

    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    /**
     * Add a new student to the student list.
     *
     * @param newStudent New student object added to the list.
     */
    public void addStudent(Student newStudent) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = newStudent;
                break;
            }
        }
    }

    /**
     * Returns a list of students by class in order of first occurrence.
     *
     * @return String containing a list of students by class in the required format.
     */
    public String studentsByGroup() {
        int numStudents = students.length;
        if (numStudents == 0) {
            return "";
        }

        String[] firstAppearanceGroups = new String[numStudents];
        int numFirstAppearanceGroups = 0;

        StringBuilder result = new StringBuilder();

        for (Student student : students) {
            if (student != null) {
                String group = student.getGroup();

                boolean appeared = false;
                for (int i = 0; i < numFirstAppearanceGroups; i++) {
                    if (firstAppearanceGroups[i].equals(group)) {
                        appeared = true;
                        break;
                    }
                }

                if (!appeared) {
                    firstAppearanceGroups[numFirstAppearanceGroups] = group;
                    numFirstAppearanceGroups++;
                }
            }
        }

        for (int i = 0; i < numFirstAppearanceGroups; i++) {
            String group = firstAppearanceGroups[i];
            result.append(group).append("\n");

            for (Student student : students) {
                if (student != null && student.getGroup().equals(group)) {
                    result.append(student.getInfo()).append("\n");
                }
            }
        }

        return result.toString();
    }

    /**
     * Removes a student with the specified ID from the list of students.
     *
     * @param id The ID of the student to be removed.
     */
    public void removeStudent(String id) {
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId().equals(id)) {
                index = i;
                break;
            }
        }

        if (index >= 0) {
            for (int i = index; i < students.length - 1; i++) {
                students[i] = students[i + 1];
            }
            students[students.length - 1] = null;
        }
    }

    public static void main(String[] args) {
        Student A = new Student();
        A.setName("Nguyen Van A");
        A.setId("17020001");
        A.setGroup("K62CC");
        A.setEmail("17020001@vnu.edu.vn");

        Student B = new Student("Nguyen Van B", "17020002", "17020002@vnu.edu.vn");

        Student C = new Student("Nguyen Van C", "17020003", "17020003@vnu.edu.vn");
        C.setGroup("K62CB");

        Student D = new Student("Nguyen Van D", "17020003", "17020003@vnu.edu.vn");
        D.setGroup("K62CC");

        StudentManagement sm = new StudentManagement();
        sm.addStudent(A);
        sm.addStudent(C);
        sm.addStudent(B);
        sm.addStudent(D);

        System.out.println(sm.studentsByGroup());

        sm.removeStudent("17020001");
    }
}

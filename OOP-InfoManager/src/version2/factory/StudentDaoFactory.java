package version2.factory;

import version2.dao.BaseStudentDao;
import version2.dao.OtherStudentDao;
import version2.dao.StudentDao;

public class StudentDaoFactory {
    public static BaseStudentDao getStudentDao(){
        return new OtherStudentDao();
    }
}

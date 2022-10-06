package version2.dao;

import version2.domain.Student;

public interface BaseStudentDao {
    // 添加学生方法
    public abstract boolean addStudent(Student stu);
    // 查看学生方法
    public abstract Student[] findAllStudent();
    // 删除学生方法
    public abstract void deleteStudentById(String delId);
    // 根据id找索引方法
    public abstract int getIndex(String id);
    // 修改学生方法
    public abstract void updateStudent(String updateId, Student newStu);
}

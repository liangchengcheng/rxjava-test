package mddemo.library.com.demo1;

import java.util.List;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:  2015年12月1日13:05:43
 * Description:
 */
public class Student {
    private String name;

    public List<Course> getCourse() {
        return course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }

    private List<Course> course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.hy.pojo;

import org.springframework.util.StringUtils;

public class demopri {
    public String selestt(Student1 student1){
             StringBuffer stringBuffer= new  StringBuffer("select * from spring_student where 1=1 ");
             if(!StringUtils.isEmpty(student1)) {
           if(!StringUtils.isEmpty(student1.getName())){
               stringBuffer.append("and name=#{name}");
           }
           if(!StringUtils.isEmpty(student1.getAge())){
                     stringBuffer.append("and age=#{age}");
                 }
           if(!StringUtils.isEmpty(student1.getSex())){
               stringBuffer.append("and sex=#{sex}");
           }

             }
return stringBuffer.toString();
    }
}

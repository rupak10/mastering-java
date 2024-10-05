package com.practice.designpattern.builder;

public class Student {
    private Long id;
    private String name;

    private Student(StudentBuilder studentBuilder) {
        this.id = studentBuilder.id;
        this.name = studentBuilder.name;
    }

    public static class StudentBuilder {
        private Long id;
        private String name;

        public StudentBuilder(){
            System.out.println("Constructor called");
        }

        public StudentBuilder id(Long id){
            this.id = id;
            return this;
        }
        public StudentBuilder name(String name){
            this.name = name;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

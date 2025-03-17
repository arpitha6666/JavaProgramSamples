package fileHandlingAndIo;

import java.io.Serializable;

public class Students implements Serializable {

        // Private class member variables
        private static final long serialVersionUID
                = -1438960132000208485L;
        private String name;
        private int age;

        // Constructor of this class
        public Students(String name, int age)
        {
            // super keyword refers to parent class
            super();

            // this keyword refers to current object instance
            this.name = name;
            this.age = age;
        }

        // Getters and Setter for class
        public String getName() { return name; }

        public void setName(String name) { this.name = name; }

        public int getAge() { return age; }

        public void setAge(int age) { this.age = age; }

        // Override toString method
        @Override public String toString()
        {
            // Simply return the name and age
            return "Students [name=" + name + ", age=" + age
                    + "]";
        }
}

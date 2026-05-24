package model;

import annotation.Mask;
import processor.MaskAnnotationProcessor;

public class Person {

    private String name;

    @Mask
    private String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getEmailMasked() {
        return MaskAnnotationProcessor.process(this, "email");
    }
}

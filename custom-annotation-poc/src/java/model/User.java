package model;

import annotation.Encrypt;

public record User(String name,
                   @Encrypt("***")
                   String email,
                   @Encrypt("###")
                   String password) {
}

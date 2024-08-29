package com.coherentsolutions.advanced.java.structural.composite;

public class CompositePatternExample {
    public static void main(String[] args) {
        // Creating leaf nodes
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        File file3 = new File("file3.txt");

        // Creating composite nodes
        Directory directory1 = new Directory("dir1");
        Directory directory2 = new Directory("dir2");
        Directory rootDirectory = new Directory("root");

        // Building the tree structure
        directory1.addComponent(file1);
        directory1.addComponent(file2);

        directory2.addComponent(file3);

        rootDirectory.addComponent(directory1);
        rootDirectory.addComponent(directory2);

        // Client interacts with the root directory
        rootDirectory.showDetails();
    }
}

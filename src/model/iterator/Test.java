package model.iterator;
/**
 *
 */
import java.io.*;
import java.util.*;

public class Test  {
    public static void main(String[] args) {
        String fileName = "src/model/iterator/data.txt";
        DataVector dataVector = new DataVector(fileName);
        Iterator iVector = dataVector.CreateIterator();
        for(iVector.First(); ! iVector.IsDone(); iVector.Next()) {
            iVector.CurrentItem();
        }
    }
}
package main;

import io.ObjectWriter;
import reflection.ReflectionHelper;
import sax.ReadXMLFileSAX;
import sax.WriteXMLFileSAX;
import vfs.VFS;
import vfs.VFSImpl;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;



public class Main {

    public static void main(String[] args) {

        //writeToBinFile();
        //readFromBinFile();

        //reflectionExample();
        saxExample();
        saxExample2();

    }

    private static void saxExample() {
        SerializationObject object = (SerializationObject) ReadXMLFileSAX.readXML("dbconfig.xml");
        System.out.append("WTF" + object);
        if (object != null)
            System.out.append(object.toString() + '\n');
    }

    private static void saxExample2() {
        SerializationObject object = (SerializationObject) ReflectionHelper.createInstance("main.SerializationObject");
        if (object != null) {
            ReflectionHelper.setFieldValue(object, "dialect", "PostgreSQLDialect");
            ReflectionHelper.setFieldValue(object, "connection_url", "localhost");
            ReflectionHelper.setFieldValue(object, "maxtime", "100");
        }
        WriteXMLFileSAX.writeXML(object, "dbconfig_change.xml");
    }

    private static void reflectionExample() {
        SerializationObject object = (SerializationObject) ReflectionHelper.createInstance("main.SerializationObject");
        if (object != null) {
            System.out.append(object.toString() + '\n');
            ReflectionHelper.setFieldValue(object, "dialect", "PostgreSQLDialect");
            ReflectionHelper.setFieldValue(object, "connection_url", "localhost");
            ReflectionHelper.setFieldValue(object, "maxtime", "100");
            System.out.append(object.toString() + '\n');
        }

    }

    private static void readFromBinFile() {
        System.out.append("Read from bin file\n");
        Object object = ObjectWriter.read("mine_test.bin");
        if (object != null) {
            System.out.append(object.toString() + '\n');
        }
    }

    private static void writeToBinFile() {
        SerializationObject object = new SerializationObject("smth1", "smth2", "smth3", "smth4", "smth5", 20);
        ObjectWriter.write(object, "mine_test.bin");
    }

}

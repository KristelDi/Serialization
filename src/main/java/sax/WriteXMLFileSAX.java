package sax;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.beans.XMLEncoder;
import java.io.*;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.*;
import javax.xml.parsers.*;
import org.xml.sax.helpers.DefaultHandler;

import java.io.IOException;
import java.io.StringWriter;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


public class WriteXMLFileSAX {

    static String displayText[] = new String[1000];
    static int numberLines = 0;
    static String indentation = "";

    public static void writeXML(Object obj, String filepath) {
        try {


            File file = new File(filepath);
            JAXBContext jaxbContext = JAXBContext.newInstance(obj.getClass());
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(obj, file);
            jaxbMarshaller.marshal(obj, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }










/// /
//        try (FileOutputStream out = new FileOutputStream(filepath)) {
//            BufferedOutputStream bout = new BufferedOutputStream(out);
//            ObjectOutputStream dout = new ObjectOutputStream(bout);
//            dout.writeObject(obj);
//            dout.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//
//        XMLEncoder encoder = null;
//
//        try {
//            encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(filepath)));
//        } catch (FileNotFoundException fileNotFound) {
//            System.out.println("ERROR: While Creating or Opening the File dvd.xml");
//        }
//        encoder.writeObject(obj);
//        encoder.close();

    }
}
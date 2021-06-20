import com.aditya.Flight;
import threads.*;

import javax.management.relation.RelationNotFoundException;
import javax.swing.plaf.TableHeaderUI;
import java.io.*;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String args[]) throws IOException {
        StringBuilder htmlText = new StringBuilder("<h1> Hi, This is the heading </h1>");
        htmlText.append("<h2>This is another heading </h2>");
        htmlText.append("<p>This is a paragraph</p>");
        htmlText.append("<h2>This is a h2 heading</h2>");
        htmlText.append("<p>THis is another line from the paragraph</p>");
        htmlText.append("<p>Rs 480 is a decent amount");
        htmlText.append("<h1>This is the end</h1>");

        Pattern h2Pattern = Pattern.compile("(<h2>)(.+?)(</h2>)");
        Matcher h2Matcher = h2Pattern.matcher(htmlText);

        Pattern anotherPattern = Pattern.compile("(Rs )([0-9]+)");
        Matcher ruppeefinder = anotherPattern.matcher(htmlText);

        while(h2Matcher.find()){
            System.out.println("Occurance of the Pattern: "+h2Matcher.group(2)+" at "+h2Matcher.start());
        }

        while(ruppeefinder.find()){
            System.out.println("Occurance of Rupees: "+ruppeefinder.group(2));
        }

        String alphanumeric = "Telivisionisadiasaster56and90itstillgoes8on.";
        System.out.println(alphanumeric.replaceAll("[^6]", "X"));

        System.out.println(alphanumeric.replaceAll("[T68]", "X"));

        System.out.println(alphanumeric.replaceAll("Telivision", "XX"));

        System.out.println(alphanumeric.replaceAll("\\d", "0"));
    }
}

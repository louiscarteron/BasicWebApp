package com.develogical.web;

import java.io.PrintWriter;

public class IndexPage extends HtmlPage {

    @Override
    protected void writeContentTo(PrintWriter writer) {
        writer.println(
                "<h1>Welcome to this awesome search engine!</h1>" +
                "<p>Enter your query in the box below and we'll do our best!: " +
                  "<form><input type=\"text\" name=\"q\" />" +
                    "<input type=\"submit\">" +
                  "</form>" +
                    "</br>" + 
                    "We hope this was useful!" +
                "</p>");
    }
    
}

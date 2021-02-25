
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SAXReader {
    public static void main(String[] args) throws IOException, SAXException {
        XMLReader parser = XMLReaderFactory.createXMLReader();
        BookHandler bookHandler = new BookHandler();
        parser.setContentHandler(bookHandler);
        parser.parse("books.xml");
    }
}

class BookHandler extends DefaultHandler {
    public List<String> getNameList() {
        return nameList;
    }

    private List<String> nameList;
    private boolean title = false;

    @Override
    public void startDocument() throws SAXException {
        System.out.println("start Parsing");
        nameList = new ArrayList<String>();
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println(nameList.toString());
        System.out.println("end parsing");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals("title")) {
            title = true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (title) {
            title = false;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (title) {
            String bookTitle = new String(ch, start, length);
            nameList.add(bookTitle);
        }
    }
}

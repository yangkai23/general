package com.parkerInc.xmlparsers.stax.parser;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import com.parkerInc.xmlparsers.stax.dto.DriversLicense;

public class StaxParserDemo {
	public static void main(String[] args) throws XMLStreamException {
		XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
		XMLStreamReader streamReader = xmlInputFactory
				.createXMLStreamReader(ClassLoader.getSystemResourceAsStream("xml/DriverLicense.xml"));
		DriversLicense driversLicense = null;
		String content = null;
		while (streamReader.hasNext()) {
			int event = streamReader.next();
			switch (event) {
			case XMLStreamConstants.START_ELEMENT:
				if (streamReader.getLocalName().equals("driversLicense"))
					System.out.println(streamReader.getAttributeValue(0));
				driversLicense = new DriversLicense();
				break;
			case XMLStreamConstants.CHARACTERS:
				content = streamReader.getText().trim();
				break;
			case XMLStreamConstants.END_ELEMENT:
				switch (streamReader.getLocalName()) {
				case "Number":
					driversLicense.setNumber(Integer.parseInt(content));
					break;
				case "firstName":
					driversLicense.setFirstname(content);
					break;
				case "lastName":
					driversLicense.setLastName(content);
				}
			}
		}
		System.out.println(driversLicense);
	}

}

package org.mongodb.errorHandling;

import java.net.UnknownHostException;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class InsertWithNoErrorHandling {

	@SuppressWarnings("static-access")
	private static CommandLine initializeAndParseCommandLineOptions(
			String[] args) {
		Options options = new Options();
		options.addOption(OptionBuilder.withArgName("connection uri").hasArgs()
				.isRequired().withDescription("mongodb connection string uri")
				.withLongOpt("uri").create("c"));

		CommandLineParser parser = new GnuParser();
		CommandLine line = null;

		try {
			line = parser.parse(options, args);

		} catch (ParseException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			// printHelpAndExit(options);
		}
		return line;
	}

	public static void main(String[] args) throws UnknownHostException {
		CommandLine line = initializeAndParseCommandLineOptions(args);
		String uri = line.getOptionValue("c");
		System.out.println(uri);
		MongoDatabase db = null;

		MongoClient client = new MongoClient(new MongoClientURI(uri));
		db = client.getDatabase("test");

		MongoCollection<Document> insertColl = db.getCollection("insertColl");
		insertColl.drop();
		Document obj = null;

		for (int i = 0; i < 10000; i++) {
			try {
				obj = new Document();
				obj.put("_id", i);
				System.out.println(obj);
				insertColl.insertOne(obj);
			} catch (Exception e) {
			}
		}
		client.close();
	}
}
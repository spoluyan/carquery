package pw.spn.carquery.cli;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class CarQueryExporter {
    private static final String DEFAULT_OUTPUT_FILE_NAME = "carquery.sql";

    private static final String OPT_HELP = "help";
    private static final String OPT_OUTPUT = "out";
    private static final String OPT_HELP_DESC = "shows this message";
    private static final String OPT_OUTPUT_DESC = "output file name";

    public static void main(String[] args) throws ParseException {
        String fileName = DEFAULT_OUTPUT_FILE_NAME;

        Options options = new Options().addOption(new Option(OPT_HELP, OPT_HELP_DESC)).addOption(
                Option.builder().hasArg().argName(OPT_OUTPUT).desc(OPT_OUTPUT_DESC).longOpt(OPT_OUTPUT).build());
        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, args);
        if (cmd.hasOption(OPT_HELP)) {
            showHelp(options);
            return;
        }
        if (cmd.hasOption(OPT_OUTPUT)) {
            fileName = cmd.getOptionValue(OPT_OUTPUT);
        }

        loadAndExport(fileName);
    }

    private static void loadAndExport(String fileName) {
        // TODO Auto-generated method stub

    }

    private static void showHelp(Options options) {
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("java -jar CarQueryExporter.jar [-out=filename]", options);
    }
}

package pw.spn.carquery.cli;

import java.io.File;
import java.io.OutputStream;
import java.io.PrintStream;

import org.apache.commons.cli.ParseException;
import org.junit.Assert;
import org.junit.Test;

public class CarQueryExporterTest {
    @Test
    public void testHelp() throws ParseException {
        SystemOutInterceptor interceptor = new SystemOutInterceptor(System.out);
        System.setOut(interceptor);
        CarQueryExporter.main(new String[] { "-help" });
        Assert.assertNotNull(interceptor.message);
    }

    @Test
    public void testExportToDefaultFile() throws ParseException {
        CarQueryExporter.main(new String[] {});
        File file = new File("carquery.sql");
        Assert.assertTrue(file.exists());
        Assert.assertTrue(file.isFile());
    }

    @Test
    public void testExportToCustomFile() throws ParseException {
        CarQueryExporter.main(new String[] { "-out=custom.sql" });
        File file = new File("custom.sql");
        Assert.assertTrue(file.exists());
        Assert.assertTrue(file.isFile());
    }

    private class SystemOutInterceptor extends PrintStream {
        private String message;

        public SystemOutInterceptor(OutputStream out) {
            super(out, true);
        }

        @Override
        public void write(byte[] buf, int off, int len) {
            message = "";
        }
    }
}

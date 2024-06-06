package io.github.asolntsev;

import static fr.opensagres.xdocreport.converter.ConverterTypeTo.PDF;
import static fr.opensagres.xdocreport.core.document.DocumentKind.ODT;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import fr.opensagres.xdocreport.converter.ConverterRegistry;
import fr.opensagres.xdocreport.converter.Options;
import fr.opensagres.xdocreport.converter.XDocConverterException;

public class GeneratePdfTest {
  @Test
  void generatePdfFromOdt() throws IOException, XDocConverterException {
    try (InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("sample.odt")) {
      try (OutputStream out = Files.newOutputStream(Paths.get("build", "reports", "sample.pdf"))) {
        Options options = Options.getFrom(ODT).to(PDF);
        ConverterRegistry.getRegistry().getConverter(options).convert(in, out, options);
      }
    }
  }
}

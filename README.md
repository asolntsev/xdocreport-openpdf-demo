# Test case for reproducing issue https://github.com/opensagres/xdocreport/issues/671

### Problem 1
1. Run command `./gradlew test`
2. You will get an error:

```java
java.lang.NoSuchMethodError: 
  'void fr.opensagres.odfdom.converter.pdf.internal.stylable.StylableDocumentSection$SectionPdfPTable.addCell(com.lowagie.text.pdf.PdfPCell)'
```

### Problem 2
If you comment out `openpdf` dependency in `build.gradle`, you will get another error:

```java
java.lang.NoSuchFieldError: list

	at fr.opensagres.odfdom.converter.pdf.internal.stylable.StylableList.addElement(StylableList.java:185)
```

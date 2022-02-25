
   
import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

<<<<<<< HEAD
    @Test
    public void testFile1() throws IOException {
        String contents= Files.readString(Path.of("./test-file.md"));
        List<String> expect = List.of("https://something.com", "some-page.html");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testFile2() throws IOException {
        String contents = Files.readString(Path.of("./test-file2.md"));
        List<String> expect = List.of("https://something.com", "some-page.html");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }
    
    @Test
    public void testFile3() throws IOException {
        String contents = Files.readString(Path.of("./test-file3.md"));
        List<String> expect = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testFile4() throws IOException {
        String contents = Files.readString(Path.of("./test-file4.md"));
        List<String> expect = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testFile5() throws IOException {
        String contents = Files.readString(Path.of("./test-file5.md"));
        List<String> expect = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testFile6() throws IOException {
        String contents = Files.readString(Path.of("./test-file6.md"));
        List<String> expect = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testFile7() throws IOException {
        String contents = Files.readString(Path.of("./test-file7.md"));
        List<String> expect = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testFile8() throws IOException {
        String contents = Files.readString(Path.of("./test-file8.md"));
        List<String> expect = List.of("a link on the first line");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testFile9() throws IOException {
        String contents = Files.readString(Path.of("./test-file9.md"));
        List<String> expect = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expect);
=======
    // Test getLinks on the given test file
    @Test
    public void testOneOwn() throws IOException {
        Path file = Path.of("test-file-1.md");
        String contents = Files.readString(file);

        List<String> expected = List.of("https://something.com",
                                        "some-page.html");
        assertEquals(MarkdownParse.getLinks(contents), expected);
    }
    @Test
    public void testTwoOwn() throws IOException {
        Path file = Path.of("test-file-2.md");
        String contents = Files.readString(file);

        List<String> expected = List.of("https://something.com",
                                        "some-page.html");
        assertEquals(MarkdownParse.getLinks(contents), expected);
    }
    @Test
    public void testThreeOwn() throws IOException {
        Path file = Path.of("test-file-3.md");
        String contents = Files.readString(file);

        List<String> expected = List.of("https://something.com");
        assertEquals(MarkdownParse.getLinks(contents), expected);
    }
    @Test
    public void testFourOwn() throws IOException {
        Path file = Path.of("test-file-4.md");
        String contents = Files.readString(file);

        List<String> expected = List.of("https://something.com",
                                        "some-page.html");
        assertEquals(MarkdownParse.getLinks(contents), expected);
    }
    @Test
    public void testOne() throws IOException {
        Path file = Path.of("test-file.md");
        String contents = Files.readString(file);

        List<String> expected = List.of("https://something.com",
                                        "some-page.html");
        assertEquals(MarkdownParse.getLinks(contents), expected);
    }
    @Test
    public void testTwo() throws IOException {
        Path file = Path.of("test-file2.md");
        String contents = Files.readString(file);

        List<String> expected = List.of("https://something.com",
                                        "some-page.html");
        assertEquals(MarkdownParse.getLinks(contents), expected);
    }
    @Test
    public void testThree() throws IOException {
        Path file = Path.of("test-file3.md");
        String contents = Files.readString(file);

        List<String> expected = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expected);
    }
    @Test
    public void testFour() throws IOException {
        Path file = Path.of("test-file4.md");
        String contents = Files.readString(file);

        List<String> expected = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expected);
    }
    @Test
    public void testFive() throws IOException {
        Path file = Path.of("test-file5.md");
        String contents = Files.readString(file);

        List<String> expected = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expected);
    }
    @Test
    public void testSix() throws IOException {
        Path file = Path.of("test-file6.md");
        String contents = Files.readString(file);

        List<String> expected = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expected);
    }
    @Test
    public void testSeven() throws IOException {
        Path file = Path.of("test-file7.md");
        String contents = Files.readString(file);

        List<String> expected = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expected);
    }
    @Test
    public void testEight() throws IOException {
        Path file = Path.of("test-file8.md");
        String contents = Files.readString(file);

        List<String> expected = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expected);
    }
    @Test
    public void testOwnFive() throws IOException {
        Path file = Path.of("test-file-5.md");
        String contents = Files.readString(file);

        List<String> expected = List.of("inside");
        assertEquals(MarkdownParse.getLinks(contents), expected);
>>>>>>> fa5c8aacb950e4a5297b99e21a71898ac8296f76
    }
}

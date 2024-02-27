package cc.silentio.bookservice.generated;

import static org.junit.jupiter.api.Assertions.assertTrue;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import java.util.Set;
import org.junit.jupiter.api.Test;

class ObjectFactoryTest {

    private final ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    private final Validator validator = factory.getValidator();
    private final ObjectFactory objectFactory = new ObjectFactory();

    @Test
    void testCreateBook() {
        Book book = objectFactory.createBook();
        Set<ConstraintViolation<Book>> violations = validator.validate(book);
        printViolations(violations.toArray());
        assertTrue(violations.isEmpty());
    }

    @Test
    void testCreateBooks() {
        Books books = objectFactory.createBooks();
        Set<ConstraintViolation<Books>> violations = validator.validate(books);
        printViolations(violations.toArray());
        assertTrue(violations.isEmpty());
    }

    @Test
    void testCreateGetBook() {
        GetBook getBook = objectFactory.createGetBook();
        Set<ConstraintViolation<GetBook>> violations = validator.validate(getBook);
        printViolations(violations.toArray());
        assertTrue(violations.isEmpty());
    }

    @Test
    void testCreateGetBookResponse() {
        GetBookResponse getBookResponse = objectFactory.createGetBookResponse();
        Set<ConstraintViolation<GetBookResponse>> violations = validator.validate(getBookResponse);
        printViolations(violations.toArray());
        assertTrue(violations.isEmpty());
    }

    @Test
    void testCreateAddBook() {
        AddBook addBook = objectFactory.createAddBook();
        Set<ConstraintViolation<AddBook>> violations = validator.validate(addBook);
        printViolations(violations.toArray());
        assertTrue(violations.isEmpty());
    }

    @Test
    void testCreateAddBookResponse() {
        AddBookResponse addBookResponse = objectFactory.createAddBookResponse();
        Set<ConstraintViolation<AddBookResponse>> violations = validator.validate(addBookResponse);
        printViolations(violations.toArray());
        assertTrue(violations.isEmpty());
    }

    @Test
    void testCreateGetAllBooks() {
        GetAllBooks getAllBooks = objectFactory.createGetAllBooks();
        Set<ConstraintViolation<GetAllBooks>> violations = validator.validate(getAllBooks);
        printViolations(violations.toArray());
        assertTrue(violations.isEmpty());
    }

    private void printViolations(Object[] violations) {
        for (Object violation : violations) {
            ConstraintViolation<?> v = (ConstraintViolation<?>) violation;
            var path = v.getPropertyPath().toString();
            var message = v.getMessage();
            System.out.printf("Violation at %s: %s%n", path, message);
        }
    }
}

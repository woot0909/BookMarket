package kr.ac.kopo.juns.bookmarket.repository;

import kr.ac.kopo.juns.bookmarket.domain.Book;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepositoryImpl implements BookRepository{
    private List<Book> listofBooks = new ArrayList<Book>();

    public BookRepositoryImpl() {
        Book book1 = new Book();
        book1.setBookId("isbn1001");
        book1.setName("스프링부트 완전정복");
        book1.setAuthor("송미영");
        book1.setDescription("스프링 부트는 스프링을 기반으로 쉽고 빠르게 웹 애플리케이션을 개발할 수 있는 도구이다."+
                "이 책에서는 스프링 부트의 기본 개념을 쉽게 이해하고 다양한 실습 예제로 빠르게 익힐 수 있다. 그리고 단계별 실습을 따라 하다 보면 도서 쇼핑몰 구축 프로젝트를 완성할 수 있다. 개념-실습-프로젝트의 3단계 학습으로 스프링 부트를 제대로 익힌다면 개발 시간을 단축하고 생산성을 높일 수 있는 개발자로 성장할 수 있다.");
        book1.setPublisher("길벗캠퍼스");
        book1.setCategory("IT전문서");
        book1.setUnitPrice(new BigDecimal(35000));
        book1.setReleaseDate("2024/12/31");

        Book book2 = new Book();
        book2.setBookId("isbn1002");
        book2.setName("이방인");
        book2.setAuthor("알베르 카뮈");
        book2.setDescription("낯선 인물과 독창적인 형식으로 현대 프랑스 문단에 '이방인'처럼 나타난 소설." +
                "젊은 무명 작가였던 알베르 카뮈에게 세계적 명성을 안겨준 이 작품은 현실에서 소외되어 이방인으로 살아가는 현대인이 죽음을 앞두고 비로소 마주하는 실존의 체험을 강렬하게 그린다." +
                "카뮈는 '영웅적인 태도를 취하지 않으면서 진실을 위해서는 죽음도 마다하지 않는' 뫼르소라는 인물을 통해 기존의 관습과 규칙에서 벗어난 새로운 인간상을 제시한다."
              );
        book2.setPublisher("민음사");
        book2.setCategory("해외문학");
        book2.setUnitPrice(new BigDecimal(9000));
        book2.setReleaseDate("2011/3/25");

        Book book3 = new Book();
        book3.setBookId("isbn1003");
        book3.setName("달과 6펜스");
        book3.setAuthor("윌리엄 서머싯 몸");
        book3.setDescription("예술 충동에 사로잡힌 한 남자의 지독한 이기심과 광기 어린 천재성\n" +
                "화가 폴 고갱의 삶에서 영감을 받은, 서머싯 몸의 대표작이자\n" +
                "세계대전 이후 인간 문명에 염증을 느낀 젊은이들에게 영혼의 해방구가 된 소설\n" +
                "\n"
        );
        book3.setPublisher("민음사");
        book3.setCategory("해외문학");
        book3.setUnitPrice(new BigDecimal(9000));
        book3.setReleaseDate("2000/6/30");

        listofBooks.add(book1);
        listofBooks.add(book2);
        listofBooks.add(book3);
    }

    @Override
    public List<Book> getAllBookList() {
        return listofBooks;
    }
}

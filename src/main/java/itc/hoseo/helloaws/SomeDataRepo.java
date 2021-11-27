package itc.hoseo.helloaws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SomeDataRepo {

    @Autowired
    JdbcTemplate template;

    public List<SomeData> findAll() {
        return template.query("select * from somedatas", (rs, rowNum) -> {
            return new SomeData(rs.getInt("seq"), rs.getString("content"));
        });
    }

    public List<SomeData> add(String data) {
        template.update("insert into somedatas(content) values(?)",data);
        return findAll();
    }
}

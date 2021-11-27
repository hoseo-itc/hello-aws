package itc.hoseo.helloaws;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SomeData {
    private int seq;
    private String content;
}

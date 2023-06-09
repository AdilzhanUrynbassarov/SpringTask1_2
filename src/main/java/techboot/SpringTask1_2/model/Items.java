package techboot.SpringTask1_2.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Items {
    private Long id;
    private String name;
    private String description;
    private double price;

}

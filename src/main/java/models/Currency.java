package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Currency {
    private  String base_code;
    private  String target_code;
    private double conversion_rate;
}

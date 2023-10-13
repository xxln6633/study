package juyuan.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class CityAndCountry implements Serializable {

    private Integer cityId;
    private String city;

    private Integer countryId;

    private LocalDateTime lastUpdate;

    private Integer country_id;

    private String country;
}

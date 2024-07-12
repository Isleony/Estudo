package com.learning.Controller;

import com.learning.Controller.DTO.CountryDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/country")
public class HelloWorldController {
    private List<CountryDto> countries = insertCountries();

    private List<CountryDto> insertCountries(){
        var listOfCountries = new ArrayList<CountryDto>();
        listOfCountries.add(new CountryDto(1, "Brazil", 2303445L));
        listOfCountries.add(new CountryDto(2, "Alemanha", 343435L));
        listOfCountries.add(new CountryDto(3, "China", 2342345L));
        return listOfCountries;
    }

    @PostMapping
    public ResponseEntity<CountryDto >save(@RequestBody final CountryDto countryDto) {
        countries.add(countryDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(countryDto);
    }

    @GetMapping
    public ResponseEntity<List<CountryDto>> getAll(@RequestParam(required = false)final String prefix){
       if (Objects.nonNull(prefix)){
           var listOfCoutries =
                   countries.stream()
                           .filter(countryDto -> countryDto.getName().startsWith(prefix))
                           .collect(Collectors.toList());
            return ResponseEntity.ok(listOfCoutries);
       }

        return ResponseEntity.ok(countries);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CountryDto> findById(@PathVariable("id") final Integer id) {
        for (var country : countries) {
            if (Objects.equals(country.getId(), id)) {
                return ResponseEntity.ok(country);
            }
        }
        return ResponseEntity.notFound().build();
    }

}

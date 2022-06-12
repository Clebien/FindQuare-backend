package cnds.findquare.controller;

import cnds.findquare.ExceptionManagement.BusinessException;
import cnds.findquare.componentConfig.PropertiesConfigurationServices;
import cnds.findquare.model.HousingEntity;
import cnds.findquare.service.HousingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;
@RequestMapping("/api")
@CrossOrigin
@RestController
public class HousingController {


    @Autowired
    private HousingServiceImpl housingService;

    @GetMapping("/housings")
    public List<HousingEntity> getAllHousings() {
        return housingService.getAllHousings();
    }

    @GetMapping("/housing/{id}")
    public Optional<HousingEntity> getHousingById(@PathVariable("id") final Integer id) {
        return housingService.getHousingEntityById(id);
    }

    @PostMapping("/housing")
    public HousingEntity createHousing(@RequestBody HousingEntity housing) {
        return housingService.createOrUpdateHousing(housing);
    }

    @PutMapping("/housing")
    public HousingEntity updateHousing(@RequestBody HousingEntity housing) {
        return housingService.createOrUpdateHousing(housing);
    }

    @DeleteMapping("/housing/{id}")
    public void deleteHousingById(@PathVariable("id") final Integer id) {
        housingService.deleteHousingEntityById(id);
    }

    @GetMapping("/hguser/{id}")
    public List<HousingEntity> getHousingByUser(@PathVariable("id") final Integer id) {
        return housingService.findByUserId(id);
    }

}

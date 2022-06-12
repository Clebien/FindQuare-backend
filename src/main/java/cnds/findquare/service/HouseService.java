package cnds.findquare.service;

import cnds.findquare.model.HousingEntity;

import java.util.List;
import java.util.Optional;

public interface HouseService {

    // find Housing by id
    Optional<HousingEntity> getHousingEntityById(final Integer id);
    // all housings
    List<HousingEntity> getAllHousings();
    // create or update Housing
    HousingEntity createOrUpdateHousing(HousingEntity housing);
    // delete housing by id
    void deleteHousingEntityById(final Integer id);
    // find housing by user id
    List<HousingEntity> findByUserId(Integer id);
    // find Housing by number of bathroom
    List<HousingEntity> findByBathroomEquals(Integer bathroom);
    // find Housing by number of bedroom
    List<HousingEntity> findByBedroomEquals(Integer bedroom);
    // find Housing by number of garage
    List<HousingEntity> findByGarageEquals(Integer garage);
    // find Housing by number of cellar
    List<HousingEntity> findByCellarEquals(Integer cellar);
    // find Housing by number of living room
    List<HousingEntity> findByLivingRoomEquals(Integer livingRoom);
    // find Housing by city
    List<HousingEntity> findByCityEquals(String city);
    // find Housing by postal code
    List<HousingEntity> findByPostalCodeEquals(String postalCode);
    // Find Housing by price range
    List<HousingEntity> findByPriceIsBetween(double price1, double price2);
    // find Housing whose price is greater than or equal to the price in parameter
    List<HousingEntity> findByPriceGreaterThanEqual(double price);
    // sort housing by ascending price
    List<HousingEntity> findByOrderByPriceAsc();
    // sort housing by descending price
    List<HousingEntity> findByOrderByPriceDesc();
    // sort housing by ascending publication date
    List<HousingEntity> findByOrderByPublicationAsc();
    // sort housing by descending publication date
    List<HousingEntity> findByOrderByPublicationDesc();

}

package cnds.findquare.service.repository;

import cnds.findquare.model.HousingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "apirest")
public interface HousingRepository extends JpaRepository<HousingEntity,Integer> {


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

package cnds.findquare.service;

import cnds.findquare.model.HousingEntity;
import cnds.findquare.service.repository.HousingRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service
public class HousingServiceImpl implements HouseService {

    @Autowired
    private HousingRepository housingRepository;


    @Override
    public Optional<HousingEntity> getHousingEntityById(Integer id) {
        return (Optional<HousingEntity>)(housingRepository.findById(id));
    }

    @Override
    public List<HousingEntity> getAllHousings() {
        return housingRepository.findAll();
    }

    @Override
    public HousingEntity createOrUpdateHousing(HousingEntity housing) {
        return housingRepository.save(housing);
    }


    @Override
    public void deleteHousingEntityById(Integer id) {
        housingRepository.deleteById(id);
    }


    @Override
    public List<HousingEntity> findByUserId(Integer id) {
        return housingRepository.findByUserId(id);
    }

    @Override
    public List<HousingEntity> findByBathroomEquals(Integer bathroom) {
        return housingRepository.findByBathroomEquals(bathroom);
    }

    @Override
    public List<HousingEntity> findByBedroomEquals(Integer bedroom) {
        return housingRepository.findByBedroomEquals(bedroom);
    }

    @Override
    public List<HousingEntity> findByGarageEquals(Integer garage) {
        return housingRepository.findByGarageEquals(garage);
    }

    @Override
    public List<HousingEntity> findByCellarEquals(Integer cellar) {
        return housingRepository.findByCellarEquals(cellar);
    }

    @Override
    public List<HousingEntity> findByLivingRoomEquals(Integer livingRoom) {
        return housingRepository.findByLivingRoomEquals(livingRoom);
    }

    @Override
    public List<HousingEntity> findByCityEquals(String city) {
        return housingRepository.findByCityEquals(city);
    }

    @Override
    public List<HousingEntity> findByPostalCodeEquals(String postalCode) {
        return housingRepository.findByPostalCodeEquals(postalCode);
    }

    @Override
    public List<HousingEntity> findByPriceIsBetween(double price1, double price2) {
        return housingRepository.findByPriceIsBetween(price1,price2);
    }

    @Override
    public List<HousingEntity> findByPriceGreaterThanEqual(double price) {
        return housingRepository.findByPriceGreaterThanEqual(price);
    }

    @Override
    public List<HousingEntity> findByOrderByPriceAsc() {
        return housingRepository.findByOrderByPriceAsc();
    }

    @Override
    public List<HousingEntity> findByOrderByPriceDesc() {
        return housingRepository.findByOrderByPriceDesc();
    }

    @Override
    public List<HousingEntity> findByOrderByPublicationAsc() {
        return housingRepository.findByOrderByPublicationAsc();
    }

    @Override
    public List<HousingEntity> findByOrderByPublicationDesc() {
        return housingRepository.findByOrderByPublicationDesc();
    }
}

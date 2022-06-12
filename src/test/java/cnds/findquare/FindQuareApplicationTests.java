package cnds.findquare;


import cnds.findquare.model.HousingEntity;
import cnds.findquare.model.UserEntity;
import cnds.findquare.service.HouseService;
import cnds.findquare.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class FindQuareApplicationTests {


    @Autowired
    private HouseService houseService;

    @Autowired
    private UserService userService;

    @Test
    public void testCreateUser() {
        UserEntity userEntity = new UserEntity("Leig","Alford",2,"J'aime l'immobilier","0232424323", "leig@gmail.com", UserEntity.IdentityStatus.VERIFY, UserEntity.Status.PROFESSIONAL);
        userService.createUser(userEntity);
    }

    @Test
    public void testPrice() {
        List<HousingEntity> housingEntities = houseService.findByPriceIsBetween(4,1500);
        for(HousingEntity housing : housingEntities) {
            System.out.println(housing);
        }
    }


    /*@Test
    public HousingEntity testCreateHousing() {

        HousingEntity housingEntity = new HousingEntity("lorem ipsum lorem ipsum lorem ipsum lorem ipsum",16.66,3,1,1,1,1,1,"https://data.curiousotters.club/1214.png",8, "Rue Avenue Saint Mandé", "75001","Un immeuble de haut standing",testCreateUser().getId(), YES);
        return houseService.save(housingEntity);
    }
    */


}

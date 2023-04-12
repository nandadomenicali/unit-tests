import br.com.tests.entity.Location;
import br.com.tests.entity.Movie;
import br.com.tests.entity.User;
import br.com.tests.service.LocationService;
import br.com.tests.utils.DataUtils;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class LocationServiceTest {

    @Test
    public void test() {
        LocationService locationService = new LocationService();
        User user = new User("MockedUser");
        Movie movie = new Movie("MockedMovie", 2, 5.0);

        Location location = locationService.rentMovie(user, movie);

        Assert.assertEquals(5.0, location.getPrice(), 0.01);
        Assert.assertTrue(DataUtils.isTheSameDate(location.getLocationDate(), new Date()));
        Assert.assertTrue(DataUtils.isTheSameDate(location.getReturnDate(),
                DataUtils.getDaysWithDiffDays(1)));
    }
}

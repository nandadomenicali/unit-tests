package br.com.tests.service;

import br.com.tests.entity.Location;
import br.com.tests.entity.Movie;
import br.com.tests.entity.User;

import java.util.Date;

import static br.com.tests.utils.DataUtils.addDays;

public class LocationService {

    public Location rentMovie(User user, Movie movie) {
        Location location = new Location();
        location.setMovie(movie);
        location.setUser(user);
        location.setLocationDate(new Date());
        location.setPrice(movie.getPrice());

        Date deliveryDate = new Date();
        deliveryDate = addDays(deliveryDate, 1);
        location.setReturnDate(deliveryDate);

        //TODO adicionar método para salvar

        return location;
    }

    public static void main(String[] args) {

    }
}

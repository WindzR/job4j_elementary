package ru.job4j.search;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import java.util.List;

public class ProfilesTest {

    @Test
    public void createListOfAddress() {
        Profiles profileTest = new Profiles();
        List<Address> actual = profileTest.collect(List.of(
                new Profile(new Address("Moscow", "Lenina", 220150, 60)),
                new Profile(new Address("Bryansk", "Marksa", 100500, 102)),
                new Profile(new Address("Tula", "Jukova", 520230, 444)),
                new Profile(new Address("Peterburg", "Gagarina", 666666, 13))
        ));
        List<Address> expected = List.of(
                new Address("Moscow", "Lenina", 220150, 60),
                new Address("Bryansk", "Marksa", 100500, 102),
                new Address("Tula", "Jukova", 520230, 444),
                new Address("Peterburg", "Gagarina", 666666, 13)
        );
        assertThat(actual, is(expected));
    }
}
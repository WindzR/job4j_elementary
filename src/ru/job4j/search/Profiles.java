package ru.job4j.search;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Profiles {

    public List<Address> collect(List<Profile> profiles) {
        return profiles
                .stream()
                .map(Profile::getAddress)
                .sorted(new AddressComparator())
                .distinct()
                .collect(Collectors.toList());
    }

    private class AddressComparator implements Comparator<Address> {

        @Override
        public int compare(Address first, Address second) {
            return first.getCity().toUpperCase().compareTo(second.getCity().toUpperCase());
        }
    }
}

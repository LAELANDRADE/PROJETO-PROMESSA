package domain;

import java.util.Arrays;
import java.util.List;

public class AddressTest {

    public static void main(String[] args) {
        List<LocalAddress> addresses = Arrays.asList(
                LocalAddress.builder().street("Rua").name("Amarela").number("290").build(),
                LocalAddress.builder().street("Av.").name("Azul").number("590").build(),
                LocalAddress.builder().street("Rua").name("Verde").number("490").build(),
                LocalAddress.builder().street("Av.").name("Vermelho").number("390").build(),
                LocalAddress.builder().street("Rua").name("Branco").number("190").build()
        );

        System.out.println("Fori");
        for (int i = 0; i < addresses.size(); i++) {
            System.out.println(addresses.get(i));
        }

        System.out.println("For lambda");
        addresses.forEach(a -> System.out.println(a.getName()));
    }

}

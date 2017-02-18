import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Animal> anList = new ArrayList<>();
        anList.add(new Animal("Vasya", 12));
        anList.add(new Animal("Petya", 13));
        anList.add(new Animal("Vasya1", 14));
        anList.add(new Animal("Vasya2", 4));
        anList.add(new Animal("Vasya3", 14));
      anList.add(new Animal("Vasya4", 10));
        anList.add(new Animal("Vasya5", 26));
        anList.add(new Animal("Vasya6", 1));
        anList.add(new Animal("Vasya7", 122));
        anList.add(new Animal("Vasya8", 5));
       anList.add(new Animal("Vasya12", 10));
//Task :
        // 1. collect all results with age 10;
        // 2. Find animal with max age using JAVA 8

//        Animal resultAnimal = new Animal();
//
//        for (Animal animal: anList) {
//            if (animal.getAge() == 10 ){
//                resultAnimal = animal;
//                break;
//            }
//
//        }
//        System.out.println(resultAnimal.getAge() + "  " + resultAnimal.getName());
//
  //      final Animal[] resultAnimal = {new Animal()};
/*
        anList.forEach(animal->{
            if(animal.getAge() == 10){
                resultAnimal[0] = animal;

            }
        });
        System.out.println(resultAnimal[0].getName());

*/
      /* Optional<Animal> resultAnimal = anList.stream()
                                        .filter(animal -> animal.getAge() ==10)
                                        .findAny();
       if(resultAnimal.isPresent()) {

           System.out.println(  "Java 8 Stream = " + resultAnimal.get().getName());
       }

*/
//        List <Animal> list = anList.stream()
//                                            .filter(blabjnkj -> blabjnkj.getAge() == 10)
//                                            .collect(Collectors.toList());
//       list.forEach(animal -> {
//           System.out.println(animal.getName());
//       });
        Comparator<Animal> comp = (p1, p2) -> Integer.compare( p1.getAge(), p2.getAge());
        Animal animal = anList.stream().max(comp).get();
        System.out.println(animal.getName());

        Animal animal2 = anList.stream()
                                    .min((p1,p2) -> Integer.compare(p1.getAge(), p2.getAge()))
                                    .get();
        System.out.println(animal2.getName());

    }
}

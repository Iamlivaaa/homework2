// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
            var dog = 8.0;
            System.out.println(dog);
            var cat  = 3.6;
            System.out.println(cat);
            var paper = 763789;
            System.out.println(paper);
            dog = dog + 4;
            System.out.println(dog);
            cat = cat + 4;
            System.out.println(cat);
            paper = paper + 4;
            System.out.println(paper);
            dog = dog - 3.5;
            System.out.println(dog);
            cat = cat - 1.6;
            System.out.println(cat);
            paper = paper - 7639;
            System.out.println(paper);
            var friend = 19;
            System.out.println(friend);
            friend = friend + 2;
            System.out.println(friend);
            friend = friend / 7;
            System.out.println(friend);
            var frog = 3.5;
            System.out.println(frog);
            frog = frog * 10;
            System.out.println(frog);
            frog = frog / 3.5;
            System.out.println(frog);
            frog = frog + 4;
            System.out.println(frog);
            var liftingCapacity = 50;
            var stuffWeight = 20;
            var capacityLeft = liftingCapacity - stuffWeight;
            System.out.println("Еще можно положить " + capacityLeft + " кг вещей");
            var appleWeight = 2;
            var orangesWeight = 3;
            var fruitWeight = appleWeight + orangesWeight;
            System.out.println("Общий вес фруктов " + fruitWeight);
            var meatWeight = 4;
            var waterWeight = 5;
            var tomatoesWeight = 2;
            var cucumbersWeight = 2;
            var peppersWeight = 2;
            var zucchiniWeight = 2;
            var vegetablesWeight = tomatoesWeight + cucumbersWeight + peppersWeight + zucchiniWeight;
            var productsWeight = fruitWeight + vegetablesWeight + meatWeight + waterWeight;
            System.out.println("Общий вес продуктов " + productsWeight + " кг!");
            var leftWeight = liftingCapacity - stuffWeight - productsWeight;
            System.out.println("Места осталось " + leftWeight + " кг!");
            productsWeight = productsWeight * 2;
            System.out.println("Теперь вес продуктов " + productsWeight);
            leftWeight = liftingCapacity - stuffWeight - productsWeight;
            System.out.println("Теперь места осталось " + leftWeight + " кг!");

            var overload = (stuffWeight + productsWeight) % liftingCapacity;
            System.out.println("Перегруз на " + overload + " кг!");

            var productsInOneCar  = productsWeight / 2;
            System.out.println("Продуктов в одной машине теперь " + productsInOneCar);

            var theFirstFighter = 78.2;
            var theSecondFighter = 82.7;
            var totalWeight = theFirstFighter + theSecondFighter;
            System.out.println("Общий вес бойцов " + totalWeight + " кг");

            var differenceWeight = theSecondFighter - theFirstFighter;
            System.out.println("Разница в весе бойцов " +  differenceWeight + " кг");

            var diffWeight = (theFirstFighter + theSecondFighter) % theFirstFighter;
            System.out.println("Разница в весе бойцов " + diffWeight + " кг");

            var totalHours = 640;
            var hoursPerEmployee = 8;
            var totalEmployees = totalHours / hoursPerEmployee;
            System.out.println("Всего работников в комании " + totalEmployees + " человек");

            totalEmployees = totalEmployees + 94;
            System.out.println(totalEmployees);

            var hoursForEach = totalHours % totalEmployees;
            System.out.println("Если в компании работают " + totalEmployees + " человек, то всего " + hoursForEach + " часов работы может быть поделено между сотрудниками");
        }
    }
}
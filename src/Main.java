public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        int currentYear = 2022;
        Human maxim = new Human(35, "Максим", "Минск", "бренд-менеджер");
        Human anna = new Human(29, "Аня", "Москва", "методист образовательных программ");
        Human kate = new Human(28, "Катя", "Калининград", "продакт-менеджер");
        Human artem = new Human(27, "Артем", "Москва", "директор по развитию бизнеса");

        System.out.println("Привет! Меня зовут "+ maxim.name +". Я из города "+ maxim.city +". Я родился в "+ (currentYear- maxim.age) +" году. Я работаю на должности "+ maxim.jobTitle + ". Будем знакомы!" );
        System.out.println("Привет! Меня зовут "+ kate.name +". Я из города "+ kate.city +". Я родился в "+ (currentYear- kate.age) +" году. Я работаю на должности "+ kate.jobTitle + ". Будем знакомы!" );
        System.out.println("Привет! Меня зовут "+ anna.name +". Я из города "+ anna.city +". Я родился в "+ (currentYear- anna.age) +" году. Я работаю на должности "+ anna.jobTitle + ". Будем знакомы!" );
        System.out.println("Привет! Меня зовут "+ artem.name +". Я из города "+ artem.city +". Я родился в "+ (currentYear- artem.age) +" году. Я работаю на должности "+ artem.jobTitle + ". Будем знакомы!" );
        System.out.println("");
        System.out.println("Задание №2");
        Car granta = new Car(
                "Lada",
                "Granta",
                1.6,
                "белый",
                2015,
                "Россия"
        );
        System.out.println(
                "Марка автомобиля " + granta.brand +
                        " , модель: " + granta.model +
                        " , год выпуска: " + granta.productionYear +
                        " , страна производства: " + granta.productionCountry +
                        " , цвет: " + granta.color +
                        " , объем двигателя: " + granta.engineVolume
        );
        Car audi = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                3.0,
                "черный",
                2020,
                "Германия"
        );
        System.out.println(
                "Марка автомобиля " + audi.brand +
                        " , модель: " + audi.model +
                        " , год выпуска: " + audi.productionYear +
                        " , страна производства: " + audi.productionCountry +
                        " , цвет: " + audi.color +
                        " , объем двигателя: " + audi.engineVolume
        );
        Car bmw = new Car(
                "BMW",
                "Z8",
                3.0,
                "черный",
                2021,
                "Германия"
        );
        System.out.println(
                "Марка автомобиля " + bmw.brand +
                        " , модель: " + bmw.model +
                        " , год выпуска: " + bmw.productionYear +
                        " , страна производства: " + bmw.productionCountry +
                        " , цвет: " + bmw.color +
                        " , объем двигателя: " + bmw.engineVolume
        );
        Car kia = new Car(
                "KIA",
                "Sportage 4 поколение",
                2.4,
                "красный",
                2018,
                "Южная Корея"
        );
        System.out.println(
                "Марка автомобиля " + kia.brand +
                        " , модель: " + kia.model +
                        " , год выпуска: " + kia.productionYear +
                        " , страна производства: " + kia.productionCountry +
                        " , цвет: " + kia.color +
                        " , объем двигателя: " + kia.engineVolume
        );
        Car hyundai = new Car(
                "Hyundai",
                "Avante",
                1.6,
                "оранжевый",
                2016,
                "Южная Корея"
        );
        System.out.println(
                "Марка автомобиля " + hyundai.brand +
                        " , модель: " + hyundai.model +
                        " , год выпуска: " + hyundai.productionYear +
                        " , страна производства: " + hyundai.productionCountry +
                        " , цвет: " + hyundai.color +
                        " , объем двигателя: " + hyundai.engineVolume
        );
    }
}

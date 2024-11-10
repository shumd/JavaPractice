package ru.shumilin.main;

import ru.shumilin.cities.City;
import ru.shumilin.cities.DoubleWayCity;
import ru.shumilin.cities.Way;

public class Main {
    public static void main(String[] args) {
        //НА МЕТОДАХ

        //1.1

        //1.1.1 Точка координат
//        Point point1 = new Point();
//        point1.x = 1;
//        point1.y = 2;
//        System.out.println(point1);
//
//        Point point2 = new Point();
//        point2.x = 15;
//        point2.y = 34;
//        System.out.println(point2);
//
//        Point point3 = new Point();
//        point3.x = 72;
//        point3.y = 24;
//        System.out.println(point3);
//
//
        //1.1.2 Человек
//        Human cleopatra = new Human();
//        cleopatra.fullName = "Клеопатра";
//        cleopatra.height = 152;
//        System.out.println(cleopatra);
//
//        Human pushkin = new Human();
//        pushkin.fullName = "Пушкин";
//        pushkin.height = 167;
//        System.out.println(pushkin);
//
//        Human mayakovski = new Human();
//        mayakovski.fullName = "Владимир";
//        mayakovski.height = 189;
//        System.out.println(mayakovski);
//
//
        //1.1.3 Имена
//        Name cleopatraName = new Name();
//        cleopatraName.name = "Клеопатра";
//        System.out.println(cleopatraName);
//
//        Name pushkinName = new Name();
//        pushkinName.surname = "Пушкин";
//        pushkinName.name = "Александр";
//        pushkinName.patronymic = "Сергеевич";
//        System.out.println(pushkinName);
//
//        Name mayakovskiName = new Name();
//        mayakovskiName.surname = "Маяковский";
//        mayakovskiName.name = "Владимир";
//        System.out.println(mayakovskiName);
//
        //1.1.4 Время
//        Time time1 = new Time();
//        time1.seconds = 10;
//        System.out.println(time1);
//
//        Time time2 = new Time();
//        time2.seconds = 10000;
//        System.out.println(time2);
//
//        Time time3 = new Time();
//        time3.seconds = 100000;
//        System.out.println(time3);
//
        //1.1.5 Дом
//        Building building1 = new Building();
//        building1.floors = 1;
//        System.out.println(building1);
//
//        Building building2 = new Building();
//        building2.floors = 5;
//        System.out.println(building2);
//
//        Building building3 = new Building();
//        building3.floors = 23;
//        System.out.println(building3);


        //1.2.1 Прямая
//        Line line1 = new Line();

//        Point start1 = new Point();
//        start1.x = 1;
//        start1.y = 3;
//        line1.start = start1;
//
//        Point end1 = new Point();
//        end1.x = 23;
//        end1.y = 8;
//        line1.end = end1;
//
//        System.out.println(line1);
//
//
//        Line line2 = new Line();
//
//        Point start2 = new Point();
//        start2.x = 5;
//        start2.y = 10;
//        line2.start = start2;
//
//        Point end2 = new Point();
//        end2.x = 25;
//        end2.y = 10;
//        line2.end = end2;
//
//        System.out.println(line2);
//
//
//        Line line3 = new Line();
//
//        line3.start = start1;
//        line3.end = end2;
//
//        System.out.println(line3+"\n");
//
//        start1.x = 7;
//        start1.y = 35;
//
//        end2.x = 9;
//        end2.y = 55;
//
//        System.out.println(line3+"\n");
//
//        Point start4 = new Point();
//        start4.x = 125;
//        start4.y = 8;
//
//        Point end4 = new Point();
//        end4.x = 65;
//        end4.y = 48;
//
//        line1.start = start4;
//        line1.end = end4;
//
//        System.out.println(line1);
//        System.out.println(line3);
//
//
//        //1.2.2 Человек с именем
//        Human cleopatra = new Human();
//
//        Name cleopatraName = new Name();
//        cleopatraName.name = "Клеопатра";
//        cleopatra.fullName = cleopatraName;
//
//        cleopatra.height = 152;
//        System.out.println(cleopatra);
//
//
//        Human pushkin = new Human();
//
//        Name pushkinName = new Name();
//        pushkinName.surname = "Пушкин";
//        pushkinName.name = "Александр";
//        pushkinName.patronymic = "Сергеевич";
//        pushkin.fullName = pushkinName;
//
//        pushkin.height = 167;
//        System.out.println(pushkin);
//
//
//        Human mayakovski = new Human();
//
//        Name mayakovskiName = new Name();
//        mayakovskiName.surname = "Маяковский";
//        mayakovskiName.name = "Владимир";
//        mayakovski.fullName = mayakovskiName;
//
//        mayakovski.height = 189;
//        System.out.println(mayakovski);
//
//        // 1.2.3 Человек с родителем
//        Human ivan = new Human();
//
//        Name ivanName = new Name();
//        ivanName.name = "Иван";
//        ivanName.surname = "Чудов";
//        ivan.fullName = ivanName;
//
//
//        Human petr = new Human();
//
//        Name petrName = new Name();
//        petrName.name = "Петр";
//        petrName.surname = "Чудов";
//        petr.fullName = petrName;
//
//        petr.father = ivan;
//

//        Human boris = new Human();
//
//        Name borisName = new Name();
//        borisName.name = "Борис";
//        boris.fullName = borisName;
//
//        boris.father = petr;
//
//
//        System.out.println(ivan);
//        System.out.println(petr);
//        System.out.println(boris);
//
//
//        // 1.2.4 Сотрудники и отделы
//        Department IT = new Department();
//        IT.name = "IT";
//
//
//        Employee kozlov = new Employee();
//        kozlov.name = "Козлов";
//        kozlov.department = IT;
//        IT.head = kozlov;
//
//
//        Employee petrov = new Employee();
//        petrov.name = "Петров";
//        petrov.department = IT;
//
//
//        Employee sidorov = new Employee();
//        sidorov.name = "Сидоров";
//        sidorov.department = IT;
//
//
//        System.out.println(petrov);
//        System.out.println(kozlov);
//        System.out.println(sidorov);


        //1.3 МАССИВЫ

        // ------------------------С ОБЫЧНЫМИ МАССИВАМИ----------------------------------

        //1.3.1 Студент
//        Student vasya = new Student();
//        vasya.name = "Вася";
//        vasya.marks = new int[]{3, 4, 5};
//
//        System.out.println(vasya + "\n");
//
//
//        Student petya = new Student();
//        petya.name = "Петя";
//        petya.marks = vasya.marks; // Присваиваем Пете ссылку на массив Васи. Они ссылаются на один объект
//        petya.marks[0] = 5;
//
//        System.out.println(petya);
//        System.out.println(vasya + "\n");
//
//
//        Student andrey = new Student();
//        andrey.name = "Андрей";
//        andrey.marks = new int[vasya.marks.length];
//
//        for(int i = 0; i < andrey.marks.length; i++){
//            andrey.marks[i] = vasya.marks[i];
//        }
//
//        System.out.println(andrey);
//        System.out.println(petya);
//        vasya.marks[0] = 2;
//        System.out.println(petya);
//        System.out.println(andrey);

        //1.3.2 Ломаная
//        BrokenLine firstBrokenLine = new BrokenLine();
//
//        Point point1 = new Point();
//        point1.x = 1;
//        point1.y = 5;
//
//        Point point2 = new Point();
//        point2.x = 2;
//        point2.y = 8;
//
//        Point point3 = new Point();
//        point3.x = 5;
//        point3.y = 3;
//
//        firstBrokenLine.points = new Point[]{point1, point2, point3};
//        System.out.println(firstBrokenLine);
//
//
//        BrokenLine secondBrokenLine = new BrokenLine();
//
//        Point point4 = new Point();
//        point4.x = 2;
//        point4.y = -5;
//
//        Point point5 = new Point();
//        point5.x = 4;
//        point5.y = -8;
//
//        secondBrokenLine.points = new Point[]{point1, point4, point5, point3};
//        System.out.println(secondBrokenLine);
//
//
//        point1.x = -10;
//        point1.y = 2;
//        System.out.println(firstBrokenLine);
//        System.out.println(secondBrokenLine);
//
//
//        //1.3.3. Города
//
//        City A = new City();
//        A.name = "A";
//        City B = new City();
//        B.name = "B";
//        City C = new City();
//        C.name = "C";
//        City D = new City();
//        D.name = "D";
//        City E = new City();
//        E.name = "E";
//        City F = new City();
//        F.name = "F";
//
//        // A Ways
//        Way wayAB = new Way();
//        wayAB.cityFrom = A;
//        wayAB.cityTo = B;
//        wayAB.price = 5;
//
//        Way wayAD = new Way();
//        wayAD.cityFrom = A;
//        wayAD.cityTo = D;
//        wayAD.price = 6;
//
//        Way wayAF = new Way();
//        wayAF.cityFrom = A;
//        wayAF.cityTo = F;
//        wayAF.price = 1;
//
//        // B ways
//        Way wayBC = new Way();
//        wayBC.cityFrom = B;
//        wayBC.cityTo = C;
//        wayBC.price = 3;
//
//        // C ways
//        Way wayCD = new Way();
//        wayCD.cityFrom = C;
//        wayCD.cityTo = D;
//        wayCD.price = 4;
//
//        // D ways
//        Way wayDE = new Way();
//        wayDE.cityFrom = D;
//        wayDE.cityTo = E;
//        wayDE.price = 2;
//
//        // E ways
//        Way wayEF = new Way();
//        wayEF.cityFrom = E;
//        wayEF.cityTo = F;
//        wayEF.price = 2;
//
//        // F ways
//        Way wayFB = new Way();
//        wayFB.cityFrom = F;
//        wayFB.cityTo = B;
//        wayFB.price = 1;
//
//        // Присваиваем пути городам
//        A.ways = new Way[]{wayAB, wayAD, wayAF};
//        B.ways = new Way[]{wayAB, wayBC};
//        C.ways = new Way[]{wayBC,wayCD};
//        D.ways = new Way[]{wayCD,wayDE,wayAD};
//        E.ways = new Way[]{wayEF};
//        F.ways = new Way[]{wayFB, wayEF};
//
//        System.out.println(A);
//        System.out.println(B);
//        System.out.println(C);
//        System.out.println(D);
//        System.out.println(E);
//        System.out.println(F);


//        //1.3.4 Сотрудники и отделы (КОД ПРОДУБЛИРОВАН С ЗАДАЧИ 1.2.4)
//        Department IT = new Department();
//        IT.name = "IT";
//
//
//        Employee kozlov = new Employee();
//        kozlov.name = "Козлов";
//        kozlov.department = IT;
//        IT.head = kozlov;
//
//
//        Employee petrov = new Employee();
//        petrov.name = "Петров";
//        petrov.department = IT;
//
//
//        Employee sidorov = new Employee();
//        sidorov.name = "Сидоров";
//        sidorov.department = IT;
//
//        IT.employees = new Employee[] {kozlov, petrov, sidorov};
//
//
//        System.out.println(petrov);
//        System.out.println(kozlov);
//        System.out.println(sidorov);



        // ------------------------С ПОМОЩЬЮ LIST----------------------------------

//        //1.3.1 Студент
//        Student vasya = new Student();
//        vasya.name = "Вася";
//        vasya.marks = new ArrayList<>(3);
//
//        //добавляем оценки
//        vasya.marks.add(3);
//        vasya.marks.add(4);
//        vasya.marks.add(5);
//
//
//        System.out.println(vasya + "\n");
//
//
//        Student petya = new Student();
//        petya.name = "Петя";
//        petya.marks = vasya.marks; // Присваиваем Пете ссылку на ArrayList Васи. Они ссылаются на один объект
//        petya.marks.set(0,5);
//
//        System.out.println(petya);
//        System.out.println(vasya + "\n");
//
//
//        Student andrey = new Student();
//        andrey.name = "Андрей";
//        andrey.marks = new ArrayList<>(vasya.marks);
//
//
//        System.out.println(andrey);
//        System.out.println(petya);
//        vasya.marks.set(0,2);
//        System.out.println(petya);
//        System.out.println(andrey);
//
//
//        //1.3.2 Ломаная
//        Polyline firstPolyline = new Polyline();
//
//        Point point1 = new Point();
//        point1.x = 1;
//        point1.y = 5;
//
//        Point point2 = new Point();
//        point2.x = 2;
//        point2.y = 8;
//
//        Point point3 = new Point();
//        point3.x = 5;
//        point3.y = 3;
//
//        firstPolyline.points = new ArrayList<>(3);
//
//        firstPolyline.points.add(point1);
//        firstPolyline.points.add(point2);
//        firstPolyline.points.add(point3);
//
//        System.out.println(firstPolyline);
//
//
//        Polyline secondPolyline = new Polyline();
//
//        Point point4 = new Point();
//        point4.x = 2;
//        point4.y = -5;
//
//        Point point5 = new Point();
//        point5.x = 4;
//        point5.y = -8;
//
//        secondPolyline.points = new ArrayList<>(4);
//
//        secondPolyline.points.add(point1);
//        secondPolyline.points.add(point4);
//        secondPolyline.points.add(point5);
//        secondPolyline.points.add(point3);
//
//        System.out.println(secondPolyline);
//
//
//        point1.x = -10;
//        point1.y = 2;
//        System.out.println(firstPolyline);
//        System.out.println(secondPolyline);
//
//
//        //1.3.3. Города
//
//        City A = new City();
//        A.name = "A";
//        City B = new City();
//        B.name = "B";
//        City C = new City();
//        C.name = "C";
//        City D = new City();
//        D.name = "D";
//        City E = new City();
//        E.name = "E";
//        City F = new City();
//        F.name = "F";
//
//        // A Ways
//        Way wayAB = new Way();
//        wayAB.cityFrom = A;
//        wayAB.cityTo = B;
//        wayAB.price = 5;
//
//        Way wayAD = new Way();
//        wayAD.cityFrom = A;
//        wayAD.cityTo = D;
//        wayAD.price = 6;
//
//        Way wayAF = new Way();
//        wayAF.cityFrom = A;
//        wayAF.cityTo = F;
//        wayAF.price = 1;
//
//        // B ways
//        Way wayBC = new Way();
//        wayBC.cityFrom = B;
//        wayBC.cityTo = C;
//        wayBC.price = 3;
//
//        // C ways
//        Way wayCD = new Way();
//        wayCD.cityFrom = C;
//        wayCD.cityTo = D;
//        wayCD.price = 4;
//
//        // D ways
//        Way wayDE = new Way();
//        wayDE.cityFrom = D;
//        wayDE.cityTo = E;
//        wayDE.price = 2;
//
//        // E ways
//        Way wayEF = new Way();
//        wayEF.cityFrom = E;
//        wayEF.cityTo = F;
//        wayEF.price = 2;
//
//        // F ways
//        Way wayFB = new Way();
//        wayFB.cityFrom = F;
//        wayFB.cityTo = B;
//        wayFB.price = 1;
//
//        // Присваиваем пути городам
//
//        //A
//        A.ways = new ArrayList<>();
//        A.ways.add(wayAB);
//        A.ways.add(wayAD);
//        A.ways.add(wayAF);
//
//        //B
//        B.ways = new ArrayList<>();
//        B.ways.add(wayAB);
//        B.ways.add(wayBC);
//
//        //C
//        C.ways = new ArrayList<>();
//        C.ways.add(wayBC);
//        C.ways.add(wayCD);
//
//        //D
//        D.ways = new ArrayList<>();
//        D.ways.add(wayCD);
//        D.ways.add(wayDE);
//        D.ways.add(wayAD);
//
//
//        //E
//        E.ways = new ArrayList<>();
//        E.ways.add(wayEF);
//
//
//        //F
//        F.ways = new ArrayList<>();
//        F.ways.add(wayFB);
//        F.ways.add(wayEF);
//
//        System.out.println(A);
//        System.out.println(B);
//        System.out.println(C);
//        System.out.println(D);
//        System.out.println(E);
//        System.out.println(F);
//
//
//        //1.3.4 Сотрудники и отделы (КОД ПРОДУБЛИРОВАН С ЗАДАЧИ 1.2.4)
//        Department IT = new Department();
//        IT.name = "IT";
//
//
//        Employee kozlov = new Employee();
//        kozlov.name = "Козлов";
//        kozlov.department = IT;
//        IT.head = kozlov;
//
//
//        Employee petrov = new Employee();
//        petrov.name = "Петров";
//        petrov.department = IT;
//
//
//        Employee sidorov = new Employee();
//        sidorov.name = "Сидоров";
//        sidorov.department = IT;
//
//        IT.employees = new ArrayList<>(3);
//        IT.employees.add(kozlov);
//        IT.employees.add(petrov);
//        IT.employees.add(sidorov);
//
//
//        System.out.println(petrov);
//        System.out.println(kozlov);
//        System.out.println(sidorov);

//        List<Point> points = new ArrayList<>();
//        Point p1 = new Point(1,2);
//        Point p2 = new Point(1,2);
//        Point p3 = new Point(1,2);
//
//        points = Arrays.asList(p1,p2,p3);
//
//
//        Polyline polyline1 = new Polyline(points);
//        Polyline polyline2 = new Polyline(p1,p2,p3);
//
//
//        System.out.println(polyline1);
//        System.out.println(polyline2);

        // Конструкторы 1.4

        //1.4.1 Создаем Точку
//        Point p1 = new Point(3,5);
//        System.out.println(p1);
//
//        Point p2 = new Point(25,6);
//        System.out.println(p2);
//
//        Point p3 = new Point(7,8);
//        System.out.println(p3);

        //1.4.2 Создаем Линию
//        Line line1 = new Line(1,3,23,8);
//        Line line2 = new Line(5,10,25,10);
//        Line line3 = new Line(line1.start,line2.end);

        //1.4.3 Создаем Дом
//        Building b1 = new Building(2);
//        Building b2 = new Building(35);
//        Building b3 = new Building(91);
//
//        b1.floors = b2.floors;

        //1.4.4 Создаем Время
//        Time time1 = new Time(10_000);
//        Time time2 = new Time(2,3,5);
//
//        System.out.println(time1);
//        System.out.println(time2);

        //1.4.5 Создаем Имена
//        Name n1 = new Name("Клеопатра");
//        System.out.println(n1);
//
//        Name n2 = new Name("Александр", "Пушкин", "Сергеевич");
//        System.out.println(n2);
//
//        Name n3 = new Name("Владимир","Маяковский");
//        System.out.println(n3);
//
//        Name n4 = new Name("Христофор", "Бонифатьевич");
//        System.out.println(n4);

        //1.4.6 Создаем Человека
//        Human h1 = new Human("Лев", 170);
//        System.out.println(h1);
//
//        Human h2 = new Human(new Name("Сергей", "Пушкин"), 168, h1);
//        System.out.println(h2);
//
//        Human h3 = new Human("Александр", 167, h2);
//        System.out.println(h3);

        //1.4.7 Создаем Студента
//        Student st1 = new Student("Вася", 3,4,5);
//        System.out.println(st1);
//
//        Student st2 = new Student("Максим");
//        System.out.println(st2);

        // 1.5 МЕТОДЫ

        //1.5.1 Пистолет стреляет.
//        Pistol pistol = new Pistol(3);
//        for (int i = 0;  i < 5; i++){
//            pistol.shot();
//        }
//
//        //1.5.2 Кот мяукает.
//        Cat barsik = new Cat("Барсик");
//        barsik.meow();
//        barsik.meow(3);
//
//        //1.5.3 Длина Линии
//        Line l1 = new Line(1,1,10,15);
//        System.out.println(l1.lenght());
//
//        //1.5.4 Сколько сейчас времени?
//        Time time1 = new Time(34056);
//        System.out.println(time1.getHours());
//
//        Time time2 = new Time(4532);
//        System.out.println(time2.getMinutes());
//
//        Time time3 = new Time(123);
//        System.out.println(time3.getSeconds());

//        //1.5.5 Дроби
//        Fraction f1 = new Fraction(4,3);
//        Fraction f2 = new Fraction(2,5);
//        Fraction f3 = new Fraction(3,8);
//
//        System.out.println(f1 + " + " + f2 + " = " + f1.sum(f2));
//        System.out.println(f1 + " - " + f2 + " = " + f1.minus(f2));
//        System.out.println(f1 + " / " + f2 + " = " + f1.div(f2));
//        System.out.println(f1 + " * " + f2 + " = " + f1.mult(f2));
//
//        System.out.println(f1 + " + " + 2 + " = " + f1.sum(2));
//        System.out.println(f1 + " - " + 2 + " = " + f1.minus(2));
//        System.out.println(f1 + " / " + 2 + " = " + f1.div(2));
//        System.out.println(f1 + " * " + 2 + " = " + f1.mult(2));
//
//        System.out.println(f1.sum(f2).div(f3).minus(5));
//
//        System.out.println(f1);
//        System.out.println(f2);
//        System.out.println(f3);


        //1.5.6 Студент отличник
//        Student vasya = new Student("Вася", 3,4,5,4);
//        Student petya = new Student("Петя", 5,5,5,5);
//
//        System.out.println(vasya.getAverageMark() + " " + vasya.isExcellentStudent());
//        System.out.println(petya.getAverageMark() + " " + petya.isExcellentStudent());

        //1.5.7 Длина Ломаной
//        Polyline p1 = new Polyline(new Point(1,5),
//                new Point(2,8),
//                new Point(5,3));
//
//        System.out.println(p1.length());
//
//        p1.add(new Point(5,15),new Point(8,10));
//
//        System.out.println(p1.length());
//
//        System.out.println(p1);

        //1.5.8 Квадрат
//        Square square = new Square(5,3,23);
//
//        Polyline polyline = square.getPolyline();
//        System.out.println(polyline.length());
//
//        polyline.points.get(polyline.points.size()-1).x = 15;
//        polyline.points.get(polyline.points.size()-1).y = 25;
//
//        System.out.println(polyline.length());

        //1.6 ИНКАПСУЛЯЦИЯ

        //1.6.1 Дом над землей
//        Building building = new Building(-10);

        //1.6.2 Время от начала суток
//        Time time = new Time(1000000);
//        System.out.println(time);
//        time.setSeconds(86410);
//        System.out.println(time);
//        time = new Time(25,61,23);
//        System.out.println(time);

        //1.6.3 Сторона квадрата
//        Square square = new Square(1,2, 1);
//        System.out.println(square.getSideSize());
//        square.setSideSize(-10);

        //1.6.4 Дроби
//        Fraction f1 = new Fraction(5,2);
//        Fraction f2 = new Fraction(-2,5);
//
//        System.out.println(f1.div(f2));

        //1.6.5 Пистолет
//        Pistol pistol = new Pistol(7);
//
//        pistol.reload(3);
//        for (int i = 0; i < 5; i++){
//            pistol.shot();
//        }
//
//        pistol.disCharge();
//        pistol.reload(8);
//        pistol.shot();
//        pistol.shot();
//        pistol.disCharge();
//        pistol.shot();

        // 1.6.6 Отдельные линии
//        Point p1 = new Point(1,2);
//        Point p2 = new Point(2,1);
//
//        Line l1 = new Line(p1,p2);
//        Line l2 = new Line(p1,p2);
//        System.out.println(l1);
//        System.out.println(l2);
//
//        l1.setStart(2,4);
//        l1.setEnd(5,6);
//        System.out.println(l1);
//        System.out.println(l2);

        // 1.6.7 Непустые Имена
//        Name name = new Name("","  ", "sd");

        // 1.6.8 Человек меняется

        // 1.6.9 Диапазон оценок
//        List<Integer> list = new ArrayList<>();
//        for(int i = 5; i > 0; i--){
//            list.add(i);
//        }
//        System.out.println(list);
//
//        Student student = new Student("SD");
//        student.setMarks(list);

        // 1.6.10 Дороги

//        // 1.6.11 Начальник отдела
//        Employee head = new Employee("Vasya");
//
//        Department departmentIT = new Department("IT", head);
//        System.out.println(departmentIT);
//        Department departmentIT2 = new Department("IT2", head);
//        System.out.println(departmentIT);
//        System.out.println(departmentIT2);

        //3.1.2 Замкнутая ломанная
//        ClosedPolyline closedPolyline = new ClosedPolyline(new Point(0,0),
//                new Point(1,1),
//                new Point(2,1));
//        System.out.println(closedPolyline.length());
//
//        Polyline polyline = new Polyline(new Point(0,0),
//                new Point(1,1),
//                new Point(2,1));
//        System.out.println(polyline.length());

        //3.1.3 Двусторонняя дорога
//        DoubleWayCity a = new DoubleWayCity("A");
//        DoubleWayCity b = new DoubleWayCity("B");
//        DoubleWayCity c = new DoubleWayCity("C",
//                new Way(a,7),
//                new Way(b, 5));
//
//        a.addWay(new Way(b,2));
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);

        //3.1.4 Автомат
//        Rifle rifle = new Rifle();
//        rifle.reload(100);
//        rifle.shot(5);


        // IS A & ШАБЛОНИЗАЦИЯ 3.2
//        Fraction fraction = new Fraction(10,4);
//        System.out.println(fraction.doubleValue());
//        System.out.println(fraction.floatValue());
//        System.out.println(fraction.intValue());
//        System.out.println(fraction.longValue());
//        System.out.println(fraction.byteValue());

//        Sparrow sparrow = new Sparrow();
//        Cuckoo cuckoo = new Cuckoo();
//        Parrot parrot = new Parrot("ABCDEFGH");
//
//        List<Bird> birds = new ArrayList<Bird>();
//        birds.add(sparrow);
//        birds.add(cuckoo);
//        birds.add(parrot);
//
//        for (Bird bird : birds) {
//            bird.sing();
//        }
//        Triangle triangle = new Triangle(new Point(0,0),
//                new Point(0,15),
//                new Point(10,0));
//
//        System.out.println(triangle.area());

//        BankAccount from = new BankAccount(100);
//        BankAccount to = new BankAccount(0);
//
//        try{
//            from.transferMoney(50, to);
//        } catch (ConnectionLostException e) {
//            from.money += amount;
//            to.money -=
//        }

        //Квадрат и прямоугольник через поинты
        // Property + generic method Points (Point, Point 3d, PointWithProperty)

//        ColorProperty colorProperty = new ColorProperty("red");
//        String i = colorProperty.getValue();
//        DateOfCreationProperty dateOfCreationProperty = new DateOfCreationProperty(1,75);
//        PointInh pointInh = new PointInh(1,
//                colorProperty,
//                dateOfCreationProperty,
//                new CoordinatesProperty(2,3));
//        System.out.println(pointInh);

//        Rectangle rectangle = new Rectangle(0,0,2,5);
//        SquareInheritance square = new SquareInheritance(0,0,2);
//        System.out.println(rectangle);
//        System.out.println(square);

//        rectangle.setBottomRightCorner(new Point(-1,2));
//        System.out.println(rectangle);
//        square.setBottomRightCorner(new Point(3,2));
//        System.out.println(square);

//        //3.3.1 Сложение
//        Summator summator = new Summator();
//        System.out.println(summator.sum(2,new Fraction(3,5),2.3));
//
//        //3.3.2 Птичий рынок
//        BirdShop.singAll(new Sparrow(),
//                new Sparrow(),
//                new Cuckoo(),
//                new Parrot("Parrot sing a song"));

        //3.3.3 Общая площадь
//        System.out.println(AreaCounter.countArea(new Circle(new Point(1,2),5),
//                new Rectangle(0,0,2,5),
//                new Triangle(new Point(1,2),
//                        new Point(3,5),
//                        new Point(10,0)),
//                new SquareInheritance(1,1,5)));

//        //3.3.4 Мяуканье
//        CatShop.meowAll(new Cat("Petr"),
//                new Cat("Barzik"),
//                new Tiger());
//
//        //3.3.5 Измерение длины
//        List<Point> points = List.of(new Point(0,2),
//                new Point(2,5),
//                new Point(6,10));
//        System.out.println(LengthSummator.sum(new Line(0,1,2,4),
//                new Polyline(points),
//                new ClosedPolyline(points)));
//
//        //3.3.6 Замкнутый квадрат
//        Rectangle rectangle = new Rectangle(0,0,3,5);
//        ClosedPolyline closedPolyline = (ClosedPolyline) rectangle.polyline();
//        System.out.println(closedPolyline);
//        Polyline polyline = rectangle.polyline();
//        System.out.println(polyline);
//        System.out.println(polyline.length());
//        System.out.println(closedPolyline.length());
//
//        //3.3.7 Ломай меня полностью
//        System.out.println(PolylineBuilder.buildPolyline(new SquareInheritance(1,2,5),
//                rectangle));

        // 3.3.8 Лучший стрелок
//        Shooter shooter = new Shooter("Vadik");
//        shooter.setWeapon(new PistolInheritance(4));
//        shooter.shoot();
//        shooter.setWeapon(new Rifle());
//        shooter.shoot();

//         //3.3.9 Городим
//        DoubleWayCity a = new DoubleWayCity("A");
//        City b = new City("B");
//        DoubleWayCity c = new DoubleWayCity("C");
//        DoubleWayCity d = new DoubleWayCity("D");
//        City e = new City("E");
//
//        a.addWay(new Way(b,0));
//        a.addWay(new Way(c,0));
//
//        b.addWay(new Way(c,0));
//
//        d.addWay(new Way(b,0));
//        d.addWay(new Way(e,0));
//
//        e.addWay(new Way(c,0));
//
//        List<City> cities = List.of(a,b,c,d,e);
//
//        for(City city : cities) {
//            System.out.println(city);
//        }

        // сортировка по x потом по y
//        List<Point> points1 = new ArrayList(List.of(new Point(-10,2),
//                new Point (4,5),
//                new Point(-10,4)));
//        System.out.println(points1);
//        points1.sort(null);
//        System.out.println(points1);

//        Student student = new Student("Koe",3,5,24,5);

        // BankAccount
//        BankAccount from = new BankAccount();
//        from.money = 1000;
//        BankAccount to = new BankAccount();
//
//        System.out.println(from.money);
//        System.out.println(to.money);
//
//        from.transferMoney(100,to);
//
//        System.out.println(from.money);
//        System.out.println(to.money);

//        // 3.4.1 Сравнение дробей
//        Fraction fraction = new Fraction(3,5);
//        Fraction fraction2 = new Fraction(3,5);
//        System.out.println(fraction.equals(fraction2));
//        System.out.println(fraction.hashCode() == fraction2.hashCode());
//
//        // 3.4.2 Сравнение точек
//        Point point = new Point(1,2);
//        Point point2 = new Point(1,2);
//        System.out.println(point.equals(point2));
//        System.out.println(point.hashCode() == point2.hashCode());
//
//        // 3.4.3 Сравнение линий
//        Line line = new Line(point,point2);
//        Line line2 = new Line(point2,point);
//        System.out.println(line.equals(line2));
//        System.out.println(line.hashCode() == line2.hashCode());
//
//        // 3.4.4 Сравнение ломаных линий
//        Polyline polyline = new Polyline(point,point2);
//        Polyline polyline2 = new Polyline(point2,point);
//        System.out.println(polyline.equals(polyline2));
//        System.out.println(polyline.hashCode() == polyline2.hashCode());

        // 3.4.5 Сравнение городов
        City saratov = new City("Saratov");
        City gorny = new City("Gorny");
        DoubleWayCity engels = new DoubleWayCity("Engels");
        City balakovo = new City("Balakovo");

        engels.addWay(new Way(balakovo,5));
        System.out.println(engels);

        saratov.addWay(new Way(balakovo,5));
        saratov.addWay(new Way(engels,5));
        System.out.println(saratov);

        gorny.addWay(new Way(balakovo,5));
        System.out.println(gorny);

        System.out.println(balakovo);

        System.out.println(engels.equals(gorny));
        System.out.println(engels.getWays());
        System.out.println(gorny.getWays());
        System.out.println(engels.getWays().equals(gorny.getWays()));
    }
}

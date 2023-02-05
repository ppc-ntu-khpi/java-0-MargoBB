# Результат роботи коду

## Завдання №1. Набір та запуск стартового коду

1. Код програми **"Quotation.java"** -

```

public class Quotation {
  String quote = "Welcome to Sun!";
  public void display() {
    System.out.println(quote);
  }
}

```

2. Код програми **"QuotationTest.java"** -

```

public class QuotationTest {
    public static void main(String args[]) {
        Quotation myQuotation = new Quotation();
        myQuotation.display();
    }
}

```

3. Результати роботи стартового коду -

![](https://github.com/ppc-ntu-khpi/java-0-MargoBB/blob/main/Solution/4.png)

## Завдання №2. Внесення змін до стартового коду

1. У програмі **"Quotation.java"** замінемо текст довільною цитатою, знайденою в мережі -

```

public class Quotation {
  String quote = "A man should have three keys: from the apartament, from the car and from the beer bottle. Finnish proverb.";
  
  public void display() {
    System.out.println(quote);
  }
}

```

2. Результати працюючого коду -

![](https://github.com/ppc-ntu-khpi/java-0-MargoBB/blob/main/Solution/5.png)

## Завдання №3. Додаткове завдання

1. Змінити код так, щоб окрім цитати виводилось ім'я того, кому вона належить -

```

public class Quotation {
  String quote = "A man should have three keys: from the apartament, from the car and from the beer bottle. Finnish proverb.";
  public String who = "~the man";
  
  public void display() {
    System.out.println(quote);
    System.out.println(who);
  }
}

```

2. Результати працюючого коду -

![](https://github.com/ppc-ntu-khpi/java-0-MargoBB/blob/main/Solution/6.png)
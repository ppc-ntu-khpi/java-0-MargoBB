# Результат роботи коду

## Завдання №1. Набір та запуск стартового коду

1. Код програми **"Shirt.java"** -

```

public class Shirt {

  public int shirtID = 0;
  public String description = "-description required-";
  public char colorCode = "U";
  public double price = 0;
  public int quantityInStock = 0;
 
  public void displayShirtInformation() {
    System.out.println("Shirt ID: " + shirtID);
    System.out.println("Shirt description:" + description);
    System.out.println("Color Code: " + colorCode);
    System.out.println("Shirt price: $" + price);
    System.out.println("Quantity in stock: " + quantityInStock);
  }
}

```

2. Код програми **"ShirtTest.java"** -

```

public class ShirtTest {

    public static void main(String args[]) {
        Shirt myShirt = new Shirt();
        myShirt.displayShirtInformation();
    }
}

```

3. Результати роботи стартового коду -

![](https://github.com/ppc-ntu-khpi/java-0-MargoBB/blob/main/Solution/1.png)

## Завдання №2. Внесення змін до стартового коду

1. У програмі **"Shirt.java"** змінимо номер сорочки, її опис та вартість довільними значеннями -

```

public class Shirt {

  public int shirtID = 15;
  public String description = "Really cool crimson T-shirt!";
  public char colorCode = "U";
  public double price = 50.7;
  public int quantityInStock = 0;
 
  public void displayShirtInformation() {
    System.out.println("Shirt ID: " + shirtID);
    System.out.println("Shirt description:" + description);
    System.out.println("Color Code: " + colorCode);
    System.out.println("Shirt price: $" + price);
    System.out.println("Quantity in stock: " + quantityInStock);
  }
}

```

2. Результати працюючого коду -

![](https://github.com/ppc-ntu-khpi/java-0-MargoBB/blob/main/Solution/2.png)

## Завдання №3. Додаткове завдання

1. Змінити код так, щоб колір сорочки зберігався та виводився у вигляді рядка -

'''

public class Shirt {

  public int shirtID = 15;
  public String description = "Really cool crimson T-shirt!";
  public String colorCode = "Crimson";
  public double price = 50.7;
  public int quantityInStock = 0;
 
  public void displayShirtInformation() {
    System.out.println("Shirt ID: " + shirtID);
    System.out.println("Shirt description:" + description);
    System.out.println("Color Code: " + colorCode);
    System.out.println("Shirt price: $" + price);
    System.out.println("Quantity in stock: " + quantityInStock);
  }
}

'''

2. Результати працюючого коду -

![](https://github.com/ppc-ntu-khpi/java-0-MargoBB/blob/main/Solution/3.png)


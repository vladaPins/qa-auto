# Стартовый проект для тестирования автоматизации

Этот проект предоставляет основу для изучения и практики автоматизированного тестирования с использованием **Java 11**, **Maven**, **Playwright** и **TestNG**. Следуйте приведенным ниже шагам для настройки среды и запуска проекта.

---

## Предварительные требования

### 1. Установка Java 11
#### Для macOS:
1. Установить [Homebrew](https://brew.sh/), если он еще не установлен:
   ```bash
   /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
   
2. Установить Java 11 с помощью Homebrew:
    ```
    brew install openjdk@11
    ```
3. Создать symlink OpenJSK, чтобы MacOS его распозновал:
    ```
   sudo ln -sfn /usr/local/opt/openjdk@11/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk-11.jdk
   ```

#### Для Windows 10/11:
1. Скачать Adoptium OpenJDK 11 с [Adoptium Temurin Releases](https://adoptium.net/temurin/releases/?os=windows&version=11&arch=x64).
2. Рекомендуется использовать .msi установщик для простоты установки.
3. Следуйте инструкциям установщика и убедитесь, что JDK добавлен в PATH системы.

#### Проверка установки:

 Запустите следующую команду в командной строке для проверки версии Java:

```java -version```

Вы должны увидеть что-то вроде java version "11.x.x".


### 2. Установка Maven
#### Для macOS:
   Установите Maven с помощью Homebrew:
   ```
   brew install maven
   ```
#### Для Windows 10+:
1. Скачать Maven с Apache Maven Downloads.
2. Распаковать архив в папку (например, `C:\Program Files\Maven`).
3. Добавьте Maven в PATH системы:
   * Добавьте новую системную переменную:
     * Имя переменной: ```MAVEN_HOME```
     * Значение переменной: путь к папке Maven (например, ``C:\Program Files\Maven``).
   * Отредактируйте переменную `Path` в Системных переменных и добавьте `%MAVEN_HOME%\bin`.
4. Проверьте установку Maven:
   ```
   mvn -version
   ```
   Вы должны увидеть версии Maven и Java.

### 3. Установка IntelliJ IDEA
   1. Скачайте [IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/download/)
   2. Установите и запустите IntelliJ IDEA.
   3. Склонируйте этот проект. Инструкция: https://javarush.com/groups/posts/2818-podruzhim-git-s-intellij-idea

### 4. Запуска теста
1. Открыть [SampleTest.java](/src/test/java/ru/wb/qaauto/SampleTest.java) класс.
2. Запустить тест нажав на кнопку 'Play' рядом с тест методом.
3. Убедиться, что тест прошел успешно. При первом запуске должна произойти установка Playwright и браузеров на вашей системе.


package tests;

public class test extends base class {
    @test
    public void testone () {
        driver.get("https://google.com");
        driver.findelement(by.name("q")).sendkeys("automation");
        driver.findelement(by.name("q")).sendkeys(key.enter);

        system.out.println("completed test one")
        driver.quit();

        driver.get("https://google.com");
        driver.findelement(by.name("q")).sendkeys("nearest coffee shop");
        driver.findelement(by.name("q")).sendkeys(key.enter);

        system.out.println("completed test two")
        driver.quit();

        driver.get("https://yahoo.com");
        driver.findelement(by.name("q")).sendkeys("automation");
        driver.findelement(by.name("q")).sendkeys(key.enter);

        system.out.println("completed test three")
        driver.quit();

        driver.get("https://google.com");
        driver.findelement(by.name("q")).sendkeys("0123456789");
        driver.findelement(by.name("q")).sendkeys(key.enter);

        system.out.println("completed test Four")
        driver.quit();

        driver.get("https://google.com");
        driver.findelement(by.name("q")).sendkeys("abcdef");
        driver.findelement(by.name("q")).sendkeys(key.enter);

        system.out.println("completed test Five")
        driver.quit();

        driver.get("https://hotmail.co.uk");
        driver.findelement(by.name("q")).sendkeys("test123@hotmail.co.uk");
        driver.findelement(by.name("l")).sendkeys("Password1234")
        driver.findelement(by.name("h")).sendkeys(key.enter);

        system.out.println("completed test six")
        driver.quit();

        driver.get("https://halifax.co.uk");
        driver.findelement(by.name("s")).sendkeys("test123@hotmail.co.uk");
        driver.findelement(by.name("z")).sendkeys("Password1234")
        driver.findelement(by.name("u")).sendkeys(key.enter);

        system.out.println("completed test seven")
        driver.quit();


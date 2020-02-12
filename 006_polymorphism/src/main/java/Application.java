public class Application {
    public static void main(String[] args) {
        Software software = new Software();
        Software intellijIdea = new IntellijIdea();
        Software chrome = new Chrome();
        Software wechat = new Wechat();

        System.out.println("a windows software:");
        software.eventOnPressF5();
        System.out.println("=================");

        System.out.println("IntelliJ Idea:");
        intellijIdea.eventOnPressF5();
        System.out.println("=================");

        System.out.println("chrome:");
        chrome.eventOnPressF5();
        System.out.println("=================");

        System.out.println("wechat:");
        wechat.eventOnPressF5();
        System.out.println("=================");
    }
}

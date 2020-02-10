public class Application {
    public static void main(String[] args) {
        Windows aWindowsApp = new Windows();
        Windows intellijIdea = new IntellijIdea();
        Windows chrome = new Chrome();
        Windows wechat = new Wechat();

        System.out.println("a windows app:");
        aWindowsApp.eventOnPressF5();
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

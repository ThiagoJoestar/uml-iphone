public class Iphone implements MusicPlayer, Telephone, InternetBrowser {

    @Override
    public void playMusic(){
        System.out.println("Playing Music...");
    }

    @Override
    public void pauseMusic(){
        System.out.println("Music Paused.");
    }

    @Override
    public void selectMusic(String music) {
        System.out.println("Selected Music: " + music);
    }

    @Override
    public void makeCall(String number) {
        System.out.println("Calling Number " + number);
    }

    @Override
    public void answerCall(){
        System.out.println("Answering the call...");
    }

    @Override
    public void listenVoiceMail(){
        System.out.println("Listening to messages");
    }

    @Override
    public void showPage(String url){
        System.out.println("Show Page: " + url);
    }

    @Override
    public void newTab(){
        System.out.println("Opening new tab");
    }

    @Override
    public void refreshPage(){
        System.out.println("Page Refreshed");
    }

    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        iphone.makeCall("+55 11 987654321");
        iphone.selectMusic("Fear of the Dark - Iron Maiden");
        iphone.playMusic();
        iphone.pauseMusic();
        iphone.answerCall();
        iphone.newTab();
        iphone.showPage("www.dio.me/sign-in");
    }
}

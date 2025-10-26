package SOLID_Principles.LiskovSubstitutionPrinciple;

public class WhatsApp implements SocialMedia,SocialMediaVideoManager{

    @Override
    public void groupVideoCall(String... users) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'groupVideoCall'");
    }

    @Override
    public void chatWithFriends() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'chatWithFriends'");
    }

    @Override
    public void sendPhotosAndVideos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sendPhotosAndVideos'");
    }
    
}

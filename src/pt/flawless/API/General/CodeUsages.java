package pt.flawless.API.General;

import pt.flawless.API.Messages.APIMessageType;
import pt.flawless.API.Messages.MessageHelper;

class CodeUsages {
    public static void main(String[] args) {
//        MessageHelper messageHelper = new MessageHelper("Test message", APIMessageType.DIALOG);
//        messageHelper.sendMessage();
        MessageHelper.send(APIMessageType.DIALOG, "TESTE");
    }
}

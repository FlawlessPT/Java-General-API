package pt.flawless.API.Messages;

import javax.swing.*;

/**
 * MAIN USAGE:
 * <pre>{@code
 *          MessageHelper messageHelper = new MessageHelper("Test message", APIMessageType.CONSOLE);
 *          messageHelper.sendMessage();
 *  } </pre>
 * <p>
 * <p>
 * <p>
 * EXAMPLE USAGE OF METHOD sendMessage:
 * <pre>{@code
 *          MessageHelper newMessage = messageHelper.sendMessage();
 *          messageHelper.setMessage(newMessage.getMessage());
 *          messageHelper.sendMessage();
 *  } </pre>
 */

public class MessageHelper {

    /**
     * Message to be shown.
     */
    private String message;
    /**
     * "Place" where to show the message
     */
    private APIMessageType messageType;

    /**
     *
     */
    public MessageHelper() {
    }

    /**
     * @param message     Displayed message
     * @param messageType Way to be displayed (CONSOLE/DIALOG)
     */
    public MessageHelper(String message, APIMessageType messageType) {
        this.message = message;
        this.messageType = messageType;
    }

    /**
     * @param messageType how the message will be displayed (alert/console)
     * @param message the message which is going to be shown on screen
     */
    public static void send(APIMessageType messageType, String message) {
        if (messageType == APIMessageType.CONSOLE) {
            System.out.println(message);
        } else if (messageType == APIMessageType.DIALOG) {
            JOptionPane.showMessageDialog(null, message);
        }
    }

    /**
     * Sends the message to the chosen place in APIMessageType
     *
     * @return Returns its own class
     */
    public MessageHelper sendMessage() {
        if (messageType == APIMessageType.CONSOLE) {
            System.out.println(message);
        } else if (messageType == APIMessageType.DIALOG) {
            JOptionPane.showMessageDialog(null, message);
        }
        return this;
    }

    /**
     * @return Returns its message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message Sets the message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return Returns the message type
     */
    public APIMessageType getMessageType() {
        return messageType;
    }

    /**
     * @param messageType Sets the message type
     */
    public void setMessageType(APIMessageType messageType) {
        this.messageType = messageType;
    }
}

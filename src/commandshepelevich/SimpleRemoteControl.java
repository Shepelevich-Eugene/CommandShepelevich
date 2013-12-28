/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commandshepelevich;

/**
 *
 * @author Женя
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }
    
    public void setCommand(Command command) {
        slot = command;
    }
    
    public void buttonWasPressed() {
        slot.execute();
    }
    
}

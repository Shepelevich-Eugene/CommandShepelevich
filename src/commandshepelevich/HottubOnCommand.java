/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commandshepelevich;

/**
 *
 * @author Женя
 */
public class HottubOnCommand implements Command {
    Hottub hottub;
    
    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }
    
    @Override
    public void execute() {
        hottub.on();
    }
    
    @Override
    public void undo() {
        hottub.off();
    }
}

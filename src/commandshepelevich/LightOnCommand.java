/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commandshepelevich;

/**
 *
 * @author Женя
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }
    
    @Override
    public void execute() {
        light.on();
    }
    
}

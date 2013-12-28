/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commandshepelevich;

/**
 *
 * @author Женя
 */
public class StereoOnCommand implements Command {
    Stereo stereo;
    
    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }
    
    @Override
    public void execute() {
        stereo.on();
    }
    
    @Override
    public void undo() {
        stereo.off();
    }
}

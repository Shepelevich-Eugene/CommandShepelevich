/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commandshepelevich;

/**
 *
 * @author Женя
 */
public class CeilingFanLowCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;
    
    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
    
    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
    }
    
    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        }
        if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        }
        if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        }
        if (prevSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }        
    }  
}

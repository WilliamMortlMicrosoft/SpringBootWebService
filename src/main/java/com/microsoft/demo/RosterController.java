package com.microsoft.demo;

import javax.annotation.PostConstruct;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RosterController {

    // called after construction, used for initialization
    @PostConstruct
    public void initialize() {
    }

    @RequestMapping(value = "/roster", method = RequestMethod.POST,consumes = "application/json")
    public Player roster(@RequestBody Roster roster,
        @RequestParam(value="operation", defaultValue="best") String operation) {
        
        Player retVal = new Player("N/A", "N/A", 0.0);
        operation = operation.toLowerCase();

        for (Player p : roster.getRoster()) {
            if (operation.contains("best")) {
                if (retVal.getBattingAverage() < p.getBattingAverage()) {
                    retVal = p;
                }
            } else if (operation.contains("pitcher"))
            {
                if (p.getPosition().toLowerCase().contains("pitcher")) {
                    retVal = p;
                    break;
                }
            }
        }
        
        return retVal;
    }
}
 
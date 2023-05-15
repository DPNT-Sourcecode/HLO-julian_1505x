package befaster.solutions.HLO;

import befaster.runner.SolutionNotImplementedException;

public class HelloSolution {
    public String hello(String friendName) {
        if (friendName.startsWith("x")) {
            return "no way!";
        } else {
            return "Hello, World!";
        }
    }
}


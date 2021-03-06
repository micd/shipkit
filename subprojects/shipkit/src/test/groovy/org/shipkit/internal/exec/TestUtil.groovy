package org.shipkit.internal.exec

class TestUtil {
    static boolean commandAvailable(String command) {
        try {
            return command.execute().waitFor() == 0
        } catch (Exception e) {
            return false
        }
    }
}

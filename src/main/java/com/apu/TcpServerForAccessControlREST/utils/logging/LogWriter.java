package com.apu.TcpServerForAccessControlREST.utils.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class LogWriter {
    
    private static final Logger logger = LogManager.getLogger(LogWriter.class);
    
    public void writeToLog(byte[] message) {
        String msg = null;
        msg = "Logger Message: " + message;
        logger.info(msg);
//        return msg;
    }

}

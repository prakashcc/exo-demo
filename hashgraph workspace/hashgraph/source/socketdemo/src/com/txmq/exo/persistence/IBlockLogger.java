package com.txmq.exo.persistence;

import com.txmq.exo.messaging.ExoMessage;

/**
 * Interface that defines what a storage-specific block logger 
 * has to implement.  Exo is written to deal with IBlockLoggers, 
 * not concrete instances of storage-specific loggers.
 */
public interface IBlockLogger {

    /**
     * Adds a transaction to the next block
     */
    public void addTransaction(ExoMessage transaction);
    
    /**
     * Asks the logger to persist a block to storage
     */
    public void save(Block block);
    
}
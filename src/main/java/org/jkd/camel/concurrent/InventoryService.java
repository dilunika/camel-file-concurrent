package org.jkd.camel.concurrent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class InventoryService {
	
	private static final Log LOG = LogFactory.getLog(InventoryService.class);

	public InventoryItem transform(final String line){
		
		String[] values = line.split(",");
		
		return new InventoryItem(Integer.valueOf(values[0]), values[1], Integer.valueOf(values[2]));
	}
	
	public void update(InventoryItem item) throws InterruptedException{
		
		// simulate updating using some CPU processing
        Thread.sleep(100);

        LOG.info("Inventory " + item.getItemId() + " updated.");
		
	}
}


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import com.kms.katalon.core.testobject.TestObject


 /**
	 * Check if element present in timeout
	 * @param to Katalon test object
	 * @param timeout time to wait for element to show up
	 * @return true if element present, otherwise false
	 */ 
def static "trest.isElementPresent_Mobile"(
    	TestObject to	
     , 	int timeout	) {
    (new trest()).isElementPresent_Mobile(
        	to
         , 	timeout)
}

 /**
	 * Get mobile driver for current session
	 * @return mobile driver for current session
	 */ 
def static "trest.getCurrentSessionMobileDriver"() {
    (new trest()).getCurrentSessionMobileDriver()
}


def static "btnsHideShowsAnimations.tapBtnsHideShowAnimations"() {
    (new btnsHideShowsAnimations()).tapBtnsHideShowAnimations()
}

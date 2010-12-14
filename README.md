About
=============
* Author: Margus Martsepp [email](margusmartsepp@gmail.com)
* Maintainer: Margus Martsepp [email](margusmartsepp@gmail.com)
* Created: 2010-12-04
* Version: 0.1
* Language: English
* Platform: Win7

Make
----
Start Ant build

    ant 

Or, click on the `[ant] RELEASE.ahk`. This requires AutoHotkey.

Other Ant commands
------------------

To make war file:

    ant clean compile create-WAR > "[out] war.txt"
    
To generate schema and source from it

    ant clean compile generate-schema compile-schema
    
To make JavaDoc

    ant clean compile javadoc
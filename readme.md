# PsAlMISt: Pattern bAsed MIssion Specifier

PsAlMISt is a Pattern bAsed MIssion Specifier implemented as a Java 1.8 application. It allows to create complex missions based on a set of Movement specification patterns. PsAlMISt can also send the created mission to a given planner that computes and executes it. It is fully integrated within the Co4robot project [http://www.co4robots.eu/](http://www.co4robots.eu/)

## Video of PsAlMISt in action



<a href="http://178.62.206.217/patterns/PARING.mp4" target="_blank"><img src="src/main/resources/images/img.png" /></a>


## An overview on PsAlMISt
An overview on PsAlMISt is provided in the following figure


![Image of the view text](src/main/resources/images/Co4robotGUIExample.png)

The PsAlMISt  GUI is organize in three different perspectives. 
* <b>Robot Network Settings</b>: it contains the address of a remote server able to forward the requests mission to the running robots.
The server is organized in the following way. A client-server architecture is used to send mission to the running robots.
A publish subscribe architecture is used to the remote application to notify the GUI of any change. For example, the publish subscribe architecture is used to notify the GUI when new locations and actions are detected 
* <b>Pattern Panel Selection </b> is used to specify the mission of interest by exploiting the proposed pattern catalog
* <b> Mission Library </b> organizes the specified mission into a library that can be used to load, store and compose the  missios of interest

## Using PsAlMISt
* Requirements: at least the Java version 1.8 must be installed on your laptop
* [Download](https://github.com/claudiomenghi/PsAlMISt/releases) the last version of PsAlMISt
* Double click on the downloaded jar






# ALGS4Assignment6

##Links##
markup : * [Latex](https://www.overleaf.com/14446504vvcksxyhqtpx) - Link to the latex document

##Implement at least one of the following fancy extensions.##
* Insertions sort to avoid short runs
	* Never merge runs that are shorter than 8 elements. If the current run length is less than 8, use insertion sort to sort the next 8 positions.
	* There's nothing magical about 8. In fact, larger values like 32 or 64 are probably better. 
	* But then the whole algorithm becomes hard to debug, because most of your test inputs will be  too short to ever use the merge step.
* Mirror down-runs
	* When scanning for runs, also check decreasing runs such as ZMFCBA.
	* Whenever you find a decreasing run, revert it in linear time.
	* This trick makes the algorithm run much faster on almost-reverse-sorted input.
	* Galloping
		* Read Peters or Wikipedia
* Draw a visual trace of runsort for each round in the style of the book, e.g., like the "Visual trace of shellsort" figure in Section 2.1.
	* StdStats.plotBars does most the work for you.
##Deliverables##
markup : * The source code for Runsort in a file called Runsort.java. Make sure it's perfect, following the book's conventions for clarity, brevity, indentation, variable names, comments, etc.
	 * The source code for your extension, in a file called FancyRunsort.java.
	 * A brief report in PDF, telling us if the code seems to sort, what you've tested it on, and a brief description of your extension. You may use the report skeleton on the next page.
	 * Any input files that gave your sorting algorithm trouble.

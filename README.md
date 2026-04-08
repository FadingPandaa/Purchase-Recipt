👨‍💻Author: Keabetswe Masole

Software Used: Apache NetBeans IDE 22

============================================================

📚 1. PROJECT SUMMARY
----------------------
This Java console application generates a price comparison 
report between Mirrorless and DSLR camera technologies. It 
calculates the price differences for various brands and 
identifies which manufacturer currently has the most 
significant cost gap between the two formats.

🛠️ 2. PROJECT STRUCTURE
------------------------
The project is contained within the 'camerarecipt' package 
and consists of two primary classes:

* Camera.java: 
  A blueprint class that stores camera brand names and 
  pricing for Mirrorless and DSLR models. It contains 
  the logic to calculate price differences for each brand.

* CameraTechnologyReport.java: 
  The main driver class. It initializes a list of camera 
  data, processes the calculations, and generates a 
  formatted report in the console.

⚙️ 3. FEATURES
---------------
* Automated Reporting: Prints a clean, tabular report 
  displaying brand names and their respective prices.
* Financial Calculation: Automatically computes the 
  variance between camera formats.
* Statistical Identification: Highlights the specific brand 
  with the "Most Cost Difference" using a visual indicator.

▶️ 4. HOW TO RUN
-----------------
1. Compile the source files:
   javac camerarecipt/*.java

2. Execute the main report class:
   java camerarecipt.CameraTechnologyReport

5. EXAMPLE OUTPUT
-----------------
The report will display a comparison table followed by:
- A breakdown of price differences per brand.
- The name of the brand with the highest price variance.

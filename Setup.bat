@echo off
set /p Input=Where is the .jar located(use full adress not including \Sheet.jar)
echo %@echo off > Sheet.bat
echo java -jar "%Input%"\Sheet.jar >> Sheet.bat
echo if ERRORLEVEL 1 echo You may need Java https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html >> Sheet.bat
echo set /p Input=Press Enter to Exit >> Sheet.bat
echo exit >> Sheet.bat

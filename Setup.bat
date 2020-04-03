@echo off
set /p Input=Where is the .jar located(use full adress not including \Sheet.jar)
echo %@echo off > Sheet.bat
echo %%Try%% >> Sheet.bat
echo java -jar "%Input%"\Sheet.jar >> Sheet.bat
echo set /p Input=Press Enter to Exit >> Sheet.bat
echo exit >> Sheet.bat
echo %%EndTry%% >> Sheet.bat
echo :Catch >> Sheet.bat
echo echo You need Java https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html >> Sheet.bat
echo set /p Input=Press Enter to Exit >> Sheet.bat
echo :End Catch >> Sheet.bat

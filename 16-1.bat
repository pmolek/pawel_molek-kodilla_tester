cd C:\Users\pmole\IdeaProjects\pawel_molek-kodilla_tester\build\libs

del *.jar

cd C:\Users\pmole\IdeaProjects\pawel_molek-kodilla_tester

call gradlew build

PAUSE

cd C:\Users\pmole\IdeaProjects\pawel_molek-kodilla_tester\build\libs

IF EXIST *.jar (goto create) ELSE (ECHO Compilation error)

PAUSE



:create
mkdir C:\projects

cd C:\Users\pmole\IdeaProjects\pawel_molek-kodilla_tester\build\libs

copy *.jar C:\projects

cd C:\projects

dir

PAUSE
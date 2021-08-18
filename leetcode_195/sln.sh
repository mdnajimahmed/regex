https://www.baeldung.com/linux/head-tail-commands

head and tail commands are very important for advanced devops and admins.

tail -n +10 file.txt | head -n 1

taile -n +10 => starts from the 10th line and goes until end. if no 10th line then empty stream
head -n 1 picks up the first 1 line , head -n 2 picks up the first 2 line 
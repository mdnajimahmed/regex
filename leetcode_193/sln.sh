cat file.txt | grep -E "^(\([0-9]{3}\) |[0-9]{3}-)[0-9]{3}-[0-9]{4}$"
This is my solution

I was not sure how to use \d . Solution is 

grep -P '^\d{3}-\d{3}-\d{4}$|^\(\d{3}\) \d{3}-\d{4}$' file.txt

Here are more details on flag
https://linuxcommand.org/lc3_man_pages/grep1.html
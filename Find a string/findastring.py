#marvelous solution from http://stackoverflow.com/questions/4664850/find-all-occurrences-of-a-substring-in-python
import re
word=raw_input()
substr=raw_input()
print len([m.start() for m in re.finditer('(?='+substr+')', word)])

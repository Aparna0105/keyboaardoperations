# keyboaardoperations
This program helps us to understand basic keyboard operations like pressing,releasing and typing in a better way.The program uses the interfaces KeyListener and ActionListener of the java. awt package. 
a) The KeyListener interface has three member methods : 
i) public void keyReleased(KeyEvent): This method gives the Unicode of the key released and its character equivalent if the key pressed is a letter. 

ii) public void keyPressed(KeyEvent): This method gives the Unicode of the key pressed and its character equivalent if the key pressed is a letter.

iii) public void keyTyped(KeyEvent): This method gives the character equivalent of the key pressed provided it is a valid character.

b) The ActionListener interface has member method :
public void actionPerformed(ActionEvent): This method works on the click of the exit button and the functions closes the frame.

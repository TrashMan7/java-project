  Maximus Mackert,
  3/14/2019,
  <br />
&nbsp; This project is a game of riddles. The name is first displayed along with some instructions for the user.
Then the user enters a answer if the answer is correct they move on to the next one if it is not they are sent back to a 
new set of questions. The goal is to complete five questions in a row if they can do that they win though they are only
given three tries.<br />
&nbsp; computer compares the answer to an array Example:if(answer.equalsIgnoreCase(riddles[i][j][1])) {
					System.out.println("Correct");<br />
&nbsp; The computer also delets any unesesarry a and spaces befor or after the answer Example:if(answer.contains("a ")) {
					answer = answer.replaceAll("a ", "");
				}
				answer = answer.trim();<br />
&nbsp; have wanted to get into video game developement for some time now. I always pictured the games being first person 
possible even large rpg's. Though I like the idea of benifiting the people playing the game so that they are using their 
screen time in the best possible way.<br />
&nbsp; I'm using a three demensional array to store sets of riddles and the answers to compare them too. I don't have a use for
an API currently. Also I do not need a test because I have only a main method.<br />
&nbsp; I have no current license.

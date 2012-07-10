![Static](http://i.imgur.com/ExuZJ.png "Static")

##What is Static?
Static is an RTS game built on the Spout voxel engine. It is still in its very early stages of development.

[-Spout Forums Page-](http://forums.spout.org/threads/coregame-static-voxel-based-real-time-strategy-game.3293/)

##Core Ideas:
- _Gamepacks_
    + Gamepacks will be sets of files used to customize Static. The following are examples of things that may be included in gamepacks:
        * Unit models
        * Building models
        * Block textures (For landscapes)
        * Properties (of units, buildings, and blocks; cost, speed, attack, defense, etc)
        * Game rules (score, timelimit, gamemode, etc)
    + The Static default out-of-the-box gamepack will be space-themed.
    + Gamepacks will be used to allow normal non-developer users to easily create, customize, and share their own versions of Static.
    + Functionality that isn't customizable via gamepacks can be changed via plugins using the Static API.

##The Team:
<table>
	<tr>
		<th><img src="https://en.gravatar.com/userimage/33964137/1a88e05eaeb009a4323e3076b309313c.png?size=55" alt="DziNeIT" title="DziNeIT"/><br/>DziNeIT</th>
		<th><img src="http://minotar.net/helm/DrAgonmoray/55" alt="DrAgonmoray" title="DrAgonmoray"/><br/>DrAgonmoray</th>
		<th><img src="https://dl.dropbox.com/u/35876967/fancykohlewhitebg.png" width="55" height="55" alt="Kohle" title="Kohle"/><br/>Kohle</th>
		<th><img src="http://minotar.net/helm/Thatb0x/55" alt="ThatBox" title="ThatBox"/><br/>ThatBox</th>
		<th><img src="http://en.gravatar.com/userimage/36607853/8a0a5af7c32f01350a4aa64353cf9b44.jpg?size=55" alt="IronCrystal" title="IronCrystal"/><br/>IronCrystal</th>
	</tr>
</table>

##Pull Request Guidelines / Code Conventions:

###Code Style:

* If / for / while statement: if (conditions) {
* Method: public void method() {
* Tabs only, no spaces!
* No trailing whitespace
* Midstatement newlines at an 200 column limit

###GitHub Things:

* Try to keep about of commits to one, use amend and squash commits!
* Sign off all commits!
* The finished product with your pull request must compile and run on Spout.
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
		<th><img src="http://minotar.net/helm/DrAgonmoray/55" alt="DrAgonmoray" title="DrAgonmoray"/><br/>DrAgonmoray</th>
		<th><img src="https://en.gravatar.com/userimage/33964137/1a88e05eaeb009a4323e3076b309313c.png?size=55" alt="DziNeIT" title="DziNeIT"/><br/>DziNeIT</th>
		<th><img src="http://en.gravatar.com/userimage/36607853/8a0a5af7c32f01350a4aa64353cf9b44.jpg?size=55" alt="IronCrystal" title="IronCrystal"/><br/>IronCrystal</th>
		<th><img src="https://dl.dropbox.com/u/35876967/fancykohlewhitebg.png" width="55" height="55" alt="Kohle" title="Kohle"/><br/>Kohle</th>
		<th><img src="http://www.gravatar.com/avatar/b9564e9f047c5be52eb84728aca0d13d.png" height="55" width="55" alt="ThatBox" title="ThatBox"/><br/>ThatBox</th>
	</tr>
</table>

Coding Standards
----------------------------------
* If / for / while / switch statement: if (conditions && stuff) {
* Method: public void method(Object paramObject) {
* No Tabs, Spaces only!
* No trailing whitespace
* Mid-statement newlines at a 200 column limit
* camelCase, no under_scores except constants
* Constants in full caps with underscores
* Keep the same formatting style everywhere

Pull Request Standards
----------------------------------
* Sign-off on all commits!
* Finished product must compile and run!
* No merges should be included in pull requests unless the pull request's purpose is a merge.
* Number of commits in a pull request should be kept to *one commit* and all additional commits must be *squashed*. Pull requests that make multiple changes should have one commit per change.
* Pull requests must include any applicable license headers. (These are generated when running `mvn`)
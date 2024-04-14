public class Dialogue {
    public String text;
    public String image;
    public int screen;
    public int choice;
    public String btext1;
    public String btext2;
    public String knifeName = "Knifey";
    public boolean autOn = false;

    public Dialogue(){
        text = "Main Menu";
        image = "mm.png";
        screen = -1;

    }

    public void advance(){
        switch (screen) {
            case 0:
                text = "What ever happened to peace? I've only heard of it in books, \nand nobody really reads them anymore.";
                image = "sc0.png"; //1000 x 625
                break;
            case 1:
                text = "At least they don't read the ones that talk about peace.";
                image = "sc1.png";
                break;

            case 2:
                text = "Peace is the aroma of fresh bread and roses wading over the soft streets. \nThe hurrying townsfolk shuffling to their jobs with a sort of laid-back urgency.";
                image = "sc2.png";
                break;

            case 3:
                text = "They care for their work and their lives, but they know how to take it easy.";
                image = "sc3.png";
                break;
            case 4:
                text = "They know how to relax, how to love. They follow their scent, \nchew on their fluffy bread, and ponder what world they will build for themselves today.";
                image = "sc4.png";
                break;
            case 5:
                text = "They look at each other, eyes drifting from face to face in caring oversight, \na desire to reassure and support those who begin to sway and fall. ";
                image = "sc5.png";
                break;
            case 6:
                text = "This image was so comforting to me when I was a child.";
                image = "sc6.png";
                break;
                //this is a sample choice and needs to exist in code until I implement a real one. For now, I will skip past it
            case 7:
                text = ""; //will not need for decisions

                btext1 = "CHOICE 1"; //sets button text, actual choice button menu created in main method
                btext2 = "CHOICE 2"; //main method detects screen # & if it is a choice screen, does creates buttons and
                //those buttons pull this text^ and then their choices get used in the respective choice method down there vvv

                image = "";
                break;
            case 8:
                text = "screen 8 text // decision 1";
                image = "";
                break;
            case 9:
                text = "screen 9 text // decision 2";
                image = "";
                break;
            case 10:
                text = "<html>I'd read passages on peace and love under a tree -I know, very stereotypical of me- \nwhen the days were nice and cool, but not too cool that frost would<br/> nibble at my fingers or too windy that I may be knocked over by a strange unseen force.</html>";
                image = "sc10.png";
                break;
            case 11:
                text = "I read on the perfect days.";
                image = "sc11.png";
                break;
            case 12:
                text = "That was before I knew about war.";
                image = "sc12.png";
                break;
            case 13:
                text = "I know now something that I didn't know then. A way that all of this war could have been avoided. \nRather, I know now that all this war WAS avoided.";
                image = "sc13.png";
                break;
            case 14:
                text = "Atrocities and hurricanes of blood and anger drove humanity to the edge. Knife was to throat in every inch of this sick world.";
                image = "sc14.png";
                break;
            case 15:
                text = "Yet people found civility in sadness. Their deep history and mutual understanding led them to salvation.";
                image = "sc15.png";
                break;
            case 16:
                text = "So why? Why is there a knife at my throat now?";
                image = "sc16.png";
                break;
            case 17:
                text = "Why is there a gun to my head? Why am I going to die?";
                image = "sc17.png";
                break;
            case 18:
                text = "...";
                image = "sc18.png";
                break;
            case 19:
                text = "*You feel cold steel graze the right side of your face.*"; 
                image = "sc19.png";
                break;
            case 20:
                text = "*Your heart pumps rapidly, fear balloons in your stomach, causing your muscles to slightly spasm.*";
                image = "sc20.png";
                break;
            case 21:
                text = "H-how? I haven't even done anything yet. How did anyone find me? H-HELP! Somebody help!";
                image = "sc21.png";
                break;
            case 22:
                text = "Damn, my voice isn't working. Nothing will come out of my mouth. What do I do?";
                image = "sc22.png";
                break;
            case 23:
                text = ""; //will not need for decisions

                btext1 = "look to the right"; 
                btext2 = "call for help again";

                image = "sc22.png";
                break;
            case 24: //first choice
                text = "*you try to look to the right*";
                image = "sc22.png";
                break;
            case 25:
                text = "I guess I'll see who thought it was a good idea to capture ME, the great goddess of discord: Er... Haruko I mean!";
                image = "sc25.png";
                break;
            case 26:
                text = "An apple is all it will take to stop you.";
                image = "sc25.png";
                break;
            case 27:
                text = "*You tilt you're head to the right nervously*";
                image = "sc22.png";
                break;
            case 28:
                text = "*Your muscles seize up and your neck stops half-way*";
                image = "sc22.png";
                break;
            case 29:
                text = "H- how about... the power of friendship! With my trusty companion, Mr. Flippy, I will conquer my fear and together we will defeat you.";
                image = "sc29.png";
                break;
            case 30:
                text = "*You finish turning your head*";
                image = "sc29.png";
                break;
            case 31:
                text = "It's an alarm clock holding a glock!";
                image = "sc31.png";
                break;
            case 32:
                text = "Wait... it's just an alarm clock.";
                image = "sc32.png";
                break;
            case 33: //second choice
                text = "*You call for help again*";
                image = "sc22.png";
                break;
            case 34:
                text = "HELP ME! *Once again, the words don't come out.*";
                image = "sc21.png";
                break;
            case 35:
                text = "Let's think about this rationally. There can't be anyone who knows what I'm here to do yet.";
                image = "sc22.png";
                break;
            case 36:
                text = "I must have just picked a sketchy hotel. How about I ask nicely who this is or tell him where the money is at.";
                image = "sc22.png";
                break;
            case 37:
                text = "Wait a minute... I'm broke!";
                image = "sc22.png";
                break;
            case 38:
                text = "Well, I have a little bit of cash, but if anybody seriously checks it, they'll see that it was printed in the future. I guess I'll have to fight then.";
                image = "sc22.png";
                break;
            case 39:
                text = "*You turn your head to the right*";
                image = "sc22.png";
                break;
            case 40:
                text = "It's an alarm clock...";
                image = "sc40.png";
                break;
            case 41: //where the end of both choices leads
                text = "*You leap out of bed and silence the wreched beast of unsatisfying mornings*";
                image = "sc41.png";
                break;
            case 42:
                text = "That was a strange dream... I guess the anxiety is getting to me.";
                image = "sc22.png";
                break;
            case 43:
                text = "Having to, you know, cause a tragedy... There are still a few more days before it's time to go. I need to do something to relax.";
                image = "sc22.png";
                break;
            case 44:
                text = "*You leave your hotel room and head to the store.*";
                image = "sc44.png";
                break;
            case 45:
                text = "I guess I haven't introduced myself to the future yet. I'm Haruko!, and I'm here to rule the past with my cuteness- and kill civilians!.";
                image = "sc45.png";
                break;
            case 46:
                text = "I wonder what the CIA would think of that. Or the government at all.";
                image = "sc44.png";
                break;
            case 47:
                text = "Actually, I know what would happen. They would get a report about me and choose not to act on it.";
                image = "sc47.png";
                break;
            case 48:
                text = "Lol.";
                image = "sc47.png";
                break;
            case 49:
                text = "Could not be me. I'd personally just win.";
                image = "sc47.png";
                break;
            case 50:
                text = "Oh Bin Laden- kyun! Your personal assassin of cuteness is here!";
                image = "sc50.png";
                break;
            case 51:
                text = "*You chuckle to yourself*";
                image = "sc47.png";
                break;
            case 52:
                text = "Oh yeah, I'm here to do 9/11, not prevent it.";
                image = "sc47.png";
                break;
            case 53:
                text = "Fuck the CIA. Fuck the US government for interfering with my homeland and the word of God. Praise Allah.";
                image = "sc47.png";
                break;
            case 54:
                text = "*You enter into the convenience store*";
                image = "sc54.png";
                break;
            case 55:
                text = "Oh, looky here. There's a Swiss army knife right here. Yoink!";
                image = "sc54.png";
                break;
            case 56:
                text = "That's mine now. God I love shoplifting.";
                image = "sc55.png";
                break;
            case 57:
                text = "This guy will be important later. What's your name little guy?";
                image = "sc54.png";
                break;
            case 58:
                text = "";

                btext1 = "Knifey"; 
                btext2 = "Swiss Cheese";

                image = "sc58.png";
                break;
            case 59:
                text = knifeName + " it is!";
                image = "sc58.png";
                break;
            case 60:
                text = "I guess I'll go see what they have for entertainment nowadays.";
                image = "sc54.png";
                break;
            case 61:
                text = "*You exit the convenience store without paying for the knife, how cute :3*";
                image = "sc47.png";
                break;
            case 62:
                text = "Hmm, I'm gonna go look for a mall.";
                image = "sc47.png";
                break;
            case 63:
                text = "..."; //[some scenes of walking through location of first city]
                image = "sc47.png";
                break;
            case 64:
                text = "...";
                image = "sc64.png";
                break;
            case 65:
                text = "...";
                image = "sc65.png";
                break;
            case 66:
                text = "Oh, look, there's one.";
                image = "sc66.png";
                break;
            case 67:
                text = "*You enter the mall*";
                image = "sc66.png";
                break;
            case 68:
                text = "Where to first?";
                image = "sc68.png";
                break;
            case 69: //choice#4: music store, time to game
                text = "";

                btext1 = "music store";
                btext2 = "time to game";

                image = "sc68.png";
                break;
            case 70: //music store first
                text = "*You go to the music store*";
                image = "sc68.png";
                break;
            case 71:
                text = "What albums are coming out in 2001? I wonder. ";
                image = "sc71.png";
                break;
            case 72:
                text = "<html>The isles of the music store are decked with plastic casing and intricate art. Emotional tones burst forth from around you, as some teenagers listen<br/> to a new CD in the corner of the store. You keep walking.</html>";
                image = "sc71.png";
                break;
            case 73:
                text = "At the end of the isle you see something. A new album put out this year. You recognize it.";
                image = "sc73.png";
                break;
            case 74:
                text = "t's lateralus! I love this album. The hypnotic flesh-man on the cover is so cool.";
                image = "sc73.png";
                break;
            case 75:
                text = "*You pick it up immediately, and slip it under your shirt for later*";
                image = "sc73.png";
                break;
            case 76:
                text = "Sneaky time :3";
                image = "sc73.png";
                break;
            case 77:
                text = "*You slowly drift isle to isle, as to not leave the store with a suspicious eye cast upon you.*";
                image = "sc73.png";
                break;
            case 78: //music > games
                text = "*You enter into the game store*";
                image = "sc68.png";
                break;
            case 79:
                text = "I guess I'll look for something to play. ";
                image = "sc79.png";
                break;
            case 80:
                text = "*You check the halls, searching for any of your favorite games from 2001.*";
                image = "sc79.png";
                break;
            case 81:
                text = "Dang it, I don't see them. I was hoping melee would be out by now. Or Halo. I would've loved to go fight the covenant right now.";
                image = "sc79.png";
                break;
            case 82:
                text = "<html>I just wish you didn't have to be US marines. It's *called* UNSC but you know it's probably mostly the US, considering how those <br/>guys seem to get into everybody's business.</html>";
                image = "sc79.png";
                break;
            case 83:
                text = "That's why we needed a kawaii leader like Bin Laden-kyun uwu~ I hope he's happy when we do our job. I love being part of Al-Qaeda.";
                image = "sc83.png";
                break;
            case 84:
                text = "*You twirl around in your skirt*";
                image = "sc83.png";
                break;
            case 85: //end path
                text = "I forgot! I'm in a game store. I should probably head out. I can always just read the Quran when I get back to my room.";
                image = "sc79.png";
                break;
            case 86: //game store first
                text = "*You enter into the game store*";
                image = "sc68.png";
                break;
            case 87:
                text = "I guess I'll look for something to play.";
                image = "sc79.png";
                break;
            case 88:
                text = "*You check the halls, searching for any of your favorite games from 2001.*";
                image = "sc79.png";
                break;
            case 89:
                text = "Dang it, I don't see them. I was hoping melee would be out by now. Or Halo. I would've loved to go fight the covenant right now.";
                image = "sc79.png";
                break;
            case 90:
                text = "<html>I just wish you didn't have to be US marines. It's *called* UNSC but you know it's probably mostly the US, considering how those <br/>guys seem to get into everybody's business.</html>";
                image = "sc79.png";
                break;
            case 91:
                text = "That's why we needed a kawaii leader like Bin Laden-kyun uwu~ I hope he's happy when we do our job. I love being part of Al-Qaeda.";
                image = "sc83.png";
                break;
            case 92:
                text = "*You twirl around in your skirt*";
                image = "sc83.png";
                break;
            case 93:
                text = "I forgot! I'm in a game store. I should probably head out. I can always just read the Quran after I get some music.";
                image = "sc79.png";
                break;
            case 94: //game>music
                text = "*You go to the music store*";
                image = "sc68.png";
                break;
            case 95:
                text = "What albums are coming out in 2001? I wonder.";
                image = "sc71.png";
                break;
            case 96:
                text = "<html>The isles of the music store are decked with plastic casing and intricate art. Emotional tones burst forth from around you, as some teenagers listen<br/> to a new CD in the corner of the store. You keep walking.</html>";
                image = "sc71.png";
                break;
            case 97:
                text = "At the end of the isle you see something. A new album put out this year. You recognize it.";
                image = "sc73.png";
                break;
            case 98:
                text = "It's lateralus! I love this album. The hypnotic flesh-man on the cover is so cool.";
                image = "sc73.png";
                break;
            case 99:
                text = "*You pick it up immediately, and slip it under your shirt for later*";
                image = "sc73.png";
                break;
            case 100:
                text = "Sneaky time :3";
                image = "sc73.png";
                break;
            case 101:
                text = "*You slowly drift isle to isle, as to not leave the store with a suspicious eye cast upon you.*";
                image = "sc73.png";
                break;
            case 102:
                text = "Time to head back to my hotel room.";
                image = "sc68.png";
                break;
            case 103: //after both stores, you always end up here
                text = "*You return to the hotel room, put your new CD into the player you stole a few days before and got out the Holy Quran to read a verse or two*";
                image = "sc103.png";
                break;
            case 104:
                text = "He created the heavens and earth in truth and formed you and perfected your forms; and to Him is the final destination [64:3]";
                image = "sc103.png";
                break;
            case 105:
                text = "...";
                image = "sc103.png";
                break;
            case 106:
                text = "I'm getting a little eepy. I can continue my work tomorrow. I need to go save some terrorists.";
                image = "sc106.png";
                break;
            case 107:
                text = "*You slowly drift to sleep*";
                image = "sc107.png";
                break;
            case 108:
                text = "...";
                image = "sc108.png";
                break;
            case 109: //backstory pt2
                text = "Peace and salvation redirected our purpose to solving internal issues and avoiding future conflict.";
                image = "sc15.png";
                break;
            case 110:
                text = "Of course it was unlikely that peace would ever last, but at least we had it for a short time.";
                image = "sc15.png";
                break;
            case 111:
                text = "<html>At least we knew there was some hope to stop it once more in the future. So many were so overcome with elation and accomplishment.<br/> We could finally enjoy peace.</html>";
                image = "sc11.png";
                break;
            case 112:
                text = "<html>Some, however, in this era of peace, could not bear the thought that prevention of future bloodshed would require centuries of <br/>paperwork and droning debate. Humanity was overcome by its own hubris.</html>";
                image = "sc112.png";
                break;
            case 113:
                text = "<html>When it was discovered that a strange, statistically impossible natural anomaly could be used to send matter backwards in time, the immediate response of<br/> the world governments was to find out exactly what caused it so that they could end it and prevent its use.</html>";
                image = "sc113.png";
                break;
            case 114:
                text = "Nobody wanted to find out what time travel would do to our world. They were quite naive to think we wouldn't.";
                image = "sc113.png";
                break;
            case 115:
                text = "<html>Someone wanted to spread peace to the past, and create his own eternity of pristine comfort and beauty where love ruled, and not hate. He left to prevent a <br/>former tragedy, that he believed would save thousands or millions of lives.</html>";
                image = "sc0.png";
                break;
            case 116:
                text = "But none of us understood what that would actually change about the world. His actions shattered our own peace.";
                image = "sc116.png";
                break;
            case 117:
                text = "Bombs and bullets rained down over our heads. Thunder cracked like a whip and hurricane winds tore our world down to ashes.";
                image = "sc117.png";
                break;
            case 118:
                text = "Radiation now invisibly corrupts our flesh and we fall one by one to our own great terror.";
                image = "sc118.png";
                break;
            case 119:
                text = "Nobody knows the peace that was. It was overwritten to all. All but the ignorant man.";
                image = "sc119.png";
                break;
            case 120:
                text = "...";
                image = "sc108.png";
                break;
            case 121:
                text = "*You wake up again, ready to go commit crime. Well, at least for today, you are going to prevent it.*";
                image = "sc107.png";
                break;
            case 122:
                text = "Your job is to stop the silly man from killing the group of terrorists hiding out here in Boston.";
                image = "sc106.png";
                break;
            case 123:
                text = "I wrote down where they were, but I don't know where I left my notebook!";
                image = "sc123.png";
                break;
            case 124:
                text = "This isn't good. How could I do something so stupid? I'm such a baka!";
                image = "sc124.png";
                break;
            case 125:
                text = "How about the drawer here...";
                image = "sc124.png";
                break;
            case 126:
                text = "Nope. Nothing but the Quran.";
                image = "sc124.png";
                break;
            case 127:
                text = "How about my bag...";
                image = "sc127.png";
                break;
            case 128:
                text = "Nope. Just "+knifeName+".";
                image = "sc127.png";
                break;
            case 129:
                text = "*You drop to the floor in a cascading wave of worry*";
                image = "sc129.png";
                break;
            case 130:
                text = "What if I can't find him. What if they all get killed? I have to find my notebook!";
                image = "sc129.png";
                break;
            case 131:
                text = "*You turn to your left*";
                image = "sc129.png";
                break;
            case 132:
                text = "There it is! It was under the bed!";
                image = "sc129.png";
                break;
            case 133:
                text = "*You check the address in the book and leave your room immediately.*";
                image = "sc129.png";
                break;
            case 134:
                text = "..."; //running through the city
                image = "sc134.png";
                break;
            case 135:
                text = "...";
                image = "sc135.png";
                break;
            case 136:
                text = "...";
                image = "sc136.png";
                break;
            case 137:
                text = "*You arrive on the scene, ready to help the terrorists.*";
                image = "sc137.png";
                break;
            case 138:
                text = "Ooh, there's a bush I can hide behind. Its a better bush than president Bush, teehee~.";
                image = "sc138.png";
                break;
            case 139:
                text = "*You hide for a few moments but then...*";
                image = "sc139.png";
                break;
            case 140:
                text = "*You hear a gunshot!*";
                image = "sc139.png";
                break;
            case 141:
                text = "I'm too late! He's already inside!";
                image = "sc141.png";
                break;
            case 142:
                text = "*You rush into the building to see what happened.*";
                image = "sc142.png";
                break;
            case 143:
                text = "*You peek around the corner into a room. Inside you see the terrorists. Over one of their bodies, you see him... Your father.*";
                image = "sc143.png";
                break;
            case 144: //backstory part 3
                text = "That man wrote to us about the tragedy and the anomaly. He told us what he knew.";
                image = "sc144.png";
                break;
            case 145:
                text = "He cried and cried on leaves of dry paper crumbled into notebooks and stored away in his home. My home.";
                image = "sc144.png";
                break;
            case 146:
                text = "My father was a foolish man. I knew he had a kind heart, I knew he was once a political radical, but I thought him reformed by tears and war.";
                image = "sc147.png";
                break;
            case 147:
                text = "I thought him a fiction writer in his final days. He would always whisper in my ear, the loving embrace of peace, an alternate me that could have been.";
                image = "sc147.png";
                break;
            case 148:
                text = "I did not yet understand that his fiction was once my reality.";
                image = "sc149.png";
                break;
            case 149:
                text = "When the anomaly occurred, just as he had prophecized, I knew.";
                image = "sc149.png";
                break;
            case 150:
                text = "He had made a grave mistake. He rewrote tragedy for peace, making future peace become tragedy.";
                image = "sc149.png";
                break;
            case 151:
                text = "A month ago I stood before the anomaly, and accepted my role as it's second and last victim.";
                image = "sc151.png";
                break;
            case 152:
                text = "It only let my dad in before and closed. He had to wait out his days, returning to the future by waiting and having me.";
                image = "sc151.png";
                break;
            case 153:
                text = "<html>Yet the anomaly was set to occur in my lifetime, and I had the chance to go back and undo<br/> the misfortune my dad caused and bring peace to the future with tragedy now.</html>";
                image = "sc151.png";
                break;
            case 154:
                text = "I only have one opportunity. I must make it count.";
                image = "sc151.png";
                break;
            case 155:
                text = "...";
                image = "sc155.png";
                break;
            case 156:
                text = "*You reach inside of your bag and take out the gun you've had the whole time.*";
                image = "sc143.png";
                break;
            case 157:
                text = "This is my chance. One of the terrorists is already dead, but if I kill my father now, they might still be able to hijack the plane alone.";
                image = "sc143.png";
                break;
            case 158:
                text = "*You hold your gun up to your father*";
                image = "sc158.png";
                break;
            case 159: //choice: take the shot?
                text = "";

                btext1 = "take the shot";
                btext2 = "leave quietly to avoid getting shot";

                image = "sc158.png";
                break;
            case 160: //follow path of taking the shot & working with terrorists here
                text = "*...*";
                image = "sc160.png";
                break;
            case 161:
                text = "Must have been the wind.";
                image = "sc160.png";
                break;
            case 162:
                text = "*Your father's body drops to the ground, but so does the body of another terrorist. Your father shot at the same time*";
                image = "sc162.png";
                break;
            case 163:
                text = "Great, now I have to explain myself.";
                image = "sc162.png";
                break;
            case 164:
                text = "H-hi I'm Haruko, nice to meet you all!";
                image = "sc164.png";
                break;
            case 165:
                text = "...";
                image = "sc162.png";
                break;
            case 166:
                text = "I was sent here by Allah to save you all so that we can do our duty.";
                image = "sc164.png";
                break;
            case 167:
                text = "*The eyes of the terrorists widen in awe at your perfect Arabic*";
                image = "sc167.png";
                break;
            case 168:
                text = "Wait... now I have to hijack the plane with them. I just said I would help them with *our* duty.";
                image = "sc167.png";
                break;
            case 169:
                text = "*A sinking feeling builds in your chest and you drop to your knees.*";
                image = "sc167.png";
                break;
            case 170:
                text = "*To your surprise, the terrorists come to you do offer you comfort and begin praying to Allah*";
                image = "sc170.png";
                break;
            case 171:
                text = "Maybe this isn't so bad after all.";
                image = "sc170.png";
                break;
            case 172:
                text = "...";
                image = "sc172.png";
                break;
            case 173:
                text = "...";
                image = "sc173.png";
                break;
            case 174:
                text = "*It's September 11. You arrive at the airport with your team in the early morning.*";
                image = "sc174.png";
                break;
            case 175:
                text = "This is a nice airport. There are so many nice people here. It would be a shame if all of their flights were about to get cancelled.";
                image = "sc175.png";
                break;
            case 176:
                text = "*you approach security*"; //
                image = "sc175.png";
                break;
            case 177:
                text = "They let you through to the metal detector easily, barely even checking your bags. They would only be searching for bombs anyways.";
                image = "sc177.png";
                break;
            case 178:
                text = "It's not like there's anything else you can do on a plane... lol.";
                image = "sc177.png";
                break;
            case 179:
                text = "*beep beep beep*";
                image = "sc179.png";
                break;
            case 180:
                text = "Shit, it picked up on "+knifeName+".";
                image = "sc179.png";
                break;
            case 181:
                text = "What do you have here?";
                image = "sc179.png";
                break;
            case 182:
                text = "Hmm? Nothing. I don't know why it's going off.";
                image = "sc179.png";
                break;
            case 183:
                text = "Miss, we're going to have to pat you down.";
                image = "sc179.png";
                break;
            case 184:
                text = "Ok, go ahead.";
                image = "sc179.png";
                break;
            case 185:
                text = "You get patted down but they don't find "+knifeName+".";
                image = "sc179.png";
                break;
            case 186:
                text = "You hid him well (between your breasts). I'm sure he enjoys it.";
                image = "sc179.png";
                break;
            case 187:
                text = "*You're almost through security.*";
                image = "sc179.png";
                break;
            case 188:
                text = "So, where's you're destination?";
                image = "sc179.png";
                break;
            case 189:
                text = "Uhhh, shit, where was flight 11 supposed to go?";
                image = "sc179.png";
                break;
            case 190: //choice, LA or Dallas
                text = "";

                btext1 = "Dallas";
                btext2 = "Los Angelos";

                image = "sc179.png";
                break;
            case 191: //Dallas path begins
                text = "Miss, I think we need to bring you aside and talk with you further.";
                image = "sc179.png";
                break;
            case 192:
                text = "Oh fuck.";
                image = "sc192.png";
                break;
            case 193:
                text = "*They pat you down again*";
                image = "sc192.png";
                break;
            case 194:
                text = "What's this knife?";
                image = "sc192.png";
                break;
            case 195:
                text = "It-its under 4 inches, it's allowed!";
                image = "sc195.png";
                break;
            case 196:
                text = "Why were you hiding it?";
                image = "sc195.png";
                break;
            case 197:
                text = "Uh, I don't know.";
                image = "sc195.png";
                break;
            case 198:
                text = "Miss, we're going to have to detain you.";
                image = "sc195.png";
                break;
            case 199:
                text = "*You and the other terrorists are detained and eventually imprisoned*";
                image = "sc195.png";
                break;
            case 200:
                text = "...";
                image = "sc200.png";
                break;
            case 201:
                text = "We got thrown into this stupid cage, and the other terrorists were all caught.";
                image = "sc200.png";
                break;
            case 202:
                text = "The plan was a complete failure. I bet Osama-kun fucking hates me right now.";
                image = "sc200.png";
                break;
            case 203:
                text = "I couldn't live up to him.";
                image = "sc200.png";
                break;
            case 204:
                text = "*You slowly rot away in the cell, as war breaks out around you and the world goes to hell once more.*";
                image = "sc200.png";
                break;
            case 205:
                text = "...";
                image = "sc205.png";
                break;
            case 206:
                text = "...";
                image = "sc206.png";
                break;
            case 207:
                text = "...";
                image = "sc207.png";
                break; //bad ending (security & terrorists)
            case 208: //LA choice
                text = "OK, you can go through.";
                image = "sc179.png";
                break;
            case 209:
                text = "Sweet :3 We're in.";
                image = "sc179.png";
                break;
            case 210:
                text = "You wait out until you can board your flight.";
                image = "sc210.png";
                break;
            case 211:
                text = "...";
                image = "sc211.png";
                break;
            case 212:
                text = "...";
                image = "sc212.png";
                break;
            case 213:
                text = "I'm on and we're in the air. It's show time!";
                image = "sc213.png";
                break;
            case 214:
                text = "*You wait until the proper time and begin*";
                image = "sc214.png";
                break;
            case 215:
                text = "Let's go.";
                image = "sc215.png";
                break;
            case 216:
                text = "..."; //you get up and rush the cockpit with the terrorists
                image = "sc216.png";
                break;
            case 217:
                text = "...";
                image = "sc217.png";
                break;
            case 218:
                text = "..."; //you and your crew kill the pilots
                image = "sc482.png";
                break;
            case 219:
                text = "The terrorist of kawaiiness prevails!";
                image = "sc483.png";
                break;
            case 220:
                text = "How about you guys wait outside and guard me while I fly the plane.";
                image = "sc483.png";
                break;
            case 221:
                text = "Sure.";
                image = "sc483.png";
                break;
            case 222:
                text = "I dont even know if they know what this mission truly is. Well, at least I know. That's all that matters.";
                image = "sc486.png";
                break;
            case 223:
                text = "*You turn off the transponder and steer the plane towards New York city while the others handle the passengers.*";
                image = "sc486.png";
                break;
            case 224:
                text = "...";
                image = "sc486.png";
                break;
            case 225:
                text = "It's finally time.";
                image = "sc489.png";
                break;
            case 226:
                text = "...";
                image = "sc489.png";
                break;
            case 227:
                text = "I'm going to die...";
                image = "sc489.png";
                break;
            case 228:
                text = "...";
                image = "sc492.png";
                break;
            case 229:
                text = "I really tried not to think about that before.";
                image = "sc493.png";
                break;
            case 230:
                text = "...";
                image = "sc494.png";
                break;
            case 231:
                text = "Oh fuck, so many are going to die.";
                image = "sc495.png";
                break;
            case 232:
                text = "...";
                image = "sc495.png";
                break;
            case 233:
                text = "None of them deserve this.";
                image = "sc495.png";
                break;
            case 234:
                text = "...";
                image = "sc498.png";
                break;
            case 235:
                text = "But it already happened in my original world. We eventually had peace.";
                image = "sc498.png";
                break;
            case 236:
                text = "...";
                image = "sc498.png";
                break;
            case 237:
                text = "That's why I'm doing this. Fuck fear, fuck all of the innocent people I'm about to slaughter.";
                image = "sc501.png";
                break;
            case 238:
                text = "...";
                image = "sc501.png";
                break;
            case 239:
                text = "This is my only path to peace.";
                image = "sc503.png";
                break;
            case 240:
                text = "...";
                image = "sc504.png";
                break;
            case 241:
                text = "Allahu Akbar!";
                image = "sc505.png";
                break;
            case 242: //9/11 "cutscene"
                text = "";
                image = "ofc.png";
                break; 
            case 243:
                text = "The End";
                image = "ofc2.png";
                break; //ending (9/11 & terrorists)
            case 244: //leave quietly screen
                text = "*You put your gun down and silently exit the building.*";
                image = "sc141.png";
                break;
            case 245:
                text = "A sinking feeling builds in your chest as you hear four more gunshots reverberate.";
                image = "sc141.png";
                break;
            case 246:
                text = "A whole group of hijackers was just killed. Now you'll have to be the one to hijack the plane.";
                image = "sc141.png";
                break;
            case 247:
                text = "Why the fuck didn't I do it? Why the fuck couldn't I kill him? Was I too scared? I can't hijack a plane alone.";
                image = "sc141.png";
                break;
            case 248:
                text = "*Tears drip down your face and your are overwhelmed with sadness*";
                image = "sc141.png";
                break;
            case 249:
                text = "...";
                image = "sc141.png";
                break;
            case 250:
                text = "...";
                image = "sc250.png";
                break;
            case 251:
                text = "There's no other choice. I can't let the future become hell for anyone else.";
                image = "sc250.png";
                break;
            case 252:
                text = "I'll fucking do it. I'll go ahead to the UA175 crew and stop my dad from killing them, then I'll come back and hijack flight 11 myself.";
                image = "sc250.png";
                break;
            case 253:
                text = "Besides, I'm not alone. I always have "+knifeName+" with me. Isn't that right?";
                image = "sc253.png";
                break;
            case 254:
                text = "I have to get there before him. I have the address of the next group with me.";
                image = "sc254.png";
                break;
            case 255:
                text = "They're staying at another hotel nearby. Well, as nearby as you can get in Boston.";
                image = "sc250.png";
                break;
            case 256:
                text = "I'm going to need a taxi but I don't have any good money... How am I supposed to make it there before him?";
                image = "sc250.png";
                break;
            case 257:
                text = "I know! I'll ask Flippy for help.";
                image = "sc257.png";
                break;
            case 258:
                text = "Hey Flippy, do you know how I can make some quick money to get a taxi?";
                image = "sc257.png";
                break;
            case 259:
                text = "...";
                image = "sc257.png";
                break;
            case 260:
                text = "I guess not. Flippy's been giving me the silent treatment recently. That's not very nice of him.";
                image = "sc250.png";
                break;
            case 261:
                text = "I guess I'll just hotwire a car. It's not like any investigation will tie it back to a person who doesn't exist yet.";
                image = "sc254.png";
                break;
            case 262:
                text = "..."; //get paking lot image at sunset
                image = "sc262.png";
                break;
            case 263:
                text = "...";
                image = "sc262.png";
                break;
            case 264:
                text = "Yipee~ that was easy!";
                image = "sc262.png";
                break;
            case 265:
                text = "*You start the engine and drive*"; //put Haruko in the window and put the car over multiple night streets
                image = "sc265.png";
                break;
            case 266:
                text = "...";
                image = "sc266.png";
                break;
            case 267:
                text = "...";
                image = "sc267.png";
                break;
            case 268:
                text = "There it is! The next hotel. I guess I'll park this guy in the back."; //hotel at night
                image = "sc268.png";
                break;
            case 269:
                text = "*You park the car and assume a hiding spot near the front of the hotel to wait for your father.*";
                image = "sc269.png";
                break;
            case 270:
                text = "This time, I better save the terrorists. I can disappoint my senpai, Bin Laden. OwO";
                image = "sc270.png";
                break;
            case 271:
                text = "I swear I'll make him proud. I know I have God on my side. Today begins our global jihad!";
                image = "sc270.png";
                break;
            case 272:
                text = "Oh, there he is!";
                image = "sc269.png";
                break;
            case 273:
                text = "*Your father approaches the door and you jump out in front of him with your gun, blocking his way.*";
                image = "sc273.png";
                break;
            case 274:
                text = "Stay back! I won't let you kill them!";
                image = "sc274.png";
                break;
            case 275:
                text = "Who are you? How do you know me?";
                image = "sc274.png";
                break;
            case 276:
                text = "I'm Haruko, the most kawaii terrorist in the whole wide world!";
                image = "sc270.png";
                break;
            case 277:
                text = "..."; //father raises his gun
                image = "sc277.png";
                break;
            case 278: //choice> shoot him or try to convince him to help
                text = "";

                btext1 = "shoot him";
                btext2 = "try to convince him to help you";

                image = "sc277.png";
                break;

            case 279: //shoot father path
                text = "Where should you shoot him?";
                image = "sc274.png";
                break;
            case 280: //choice> foot or head
                text = "";

                btext1 = "foot";
                btext2 = "head";

                image = "sc274.png";
                break;
            case 281://foot path
                text = "...";
                image = "sc281.png";
                break;
            case 282:
                text = "*You missed*";
                image = "sc281.png";
                break;
            case 283:
                text = "Well this is awkward.";
                image = "sc281.png";
                break;
            case 284:
                text = "..."; //your father kills you
                image = "sc284.png";
                break;
            case 285:
                text = "*You fall to the ground and slowly fade out from this world.*";
                image = "sc285.png";
                break;
            case 286:
                text = "If only I wasn't such a baka.";
                image = "sc286.png";
                break;
            case 287:
                text = "I could have saved all of those people- by killing all of those people.";
                image = "sc286.png";
                break;
            case 288:
                text = "It was all for nothing I guess. :(";
                image = "sc288.png";
                break; //bad ending (shot and killed)
            case 289: //shot in the head path
                text = "*bam*";
                image = "sc289.png";
                break;
            case 290:
                text = "Well he's fucking dead. I better get out of here.";
                image = "sc289.png";
                break;
            case 291:
                text = "You search your father's body for more cash than your few dollars.";
                image = "sc291.png";
                break;
            case 292:
                text = "*Got some :3*";
                image = "sc291.png";
                break;
            case 293:
                text = "Time to get out of here. The police can have their corpse and car.";
                image = "sc291.png";
                break;
            case 294:
                text = "..."; //running for a few screens
                image = "sc294.png";
                break;
            case 295:
                text = "...";
                image = "sc295.png";
                break;
            case 296:
                text = "...";
                image = "sc296.png";
                break;
            case 297:
                text = "Now I'll wave down a taxi. Oh, there's one.";
                image = "sc297.png";
                break;
            case 298:
                text = "*You get a taxi*";
                image = "sc297.png";
                break;
            case 299:
                text = "...";
                image = "sc299.png";
                break;
            case 300:
                text = "*The driver starts yapping*";
                image = "sc299.png";
                break;
            case 301:
                text = "What do you think about Bush? I think he's a fucking retard!";
                image = "sc299.png";
                break;
            case 302:
                text = "Wh- what?";
                image = "sc299.png";
                break;
            case 303:
                text = "Just today- erm- I guess yesterday now, my buddy called me from outside the Pentagon and told me that a bunch of money just went missing.";
                image = "sc299.png";
                break;
            case 304:
                text = "..."; //you smile to yourself
                image = "sc299.png";
                break;
            case 305:
                text = "Oh, we're here.";
                image = "sc299.png";
                break;
            case 306:
                text = "Thanks for the ride- and if you think that was crazy, turn on the TV at 8:50 this morning.";
                image = "sc299.png";
                break;
            case 307:
                text = "Huh?";
                image = "sc299.png";
                break;
            case 308:
                text = "Byebye!";
                image = "sc299.png";
                break;
            case 309:
                text = "Well, he brought me where I wanted. There's a group of university students right over there.";
                image = "sc309.png";
                break;
            case 310:
                text = "I wonder how long it will take to turn them into jihadist Muslims.";
                image = "sc309.png";
                break;
            case 311:
                text = "Hey you guys!";
                image = "sc309.png";
                break;
            case 312:
                text = "What?";
                image = "sc309.png";
                break;
            case 313:
                text = "I know its past midnight, but I have something I need to talk to you about urgently.";
                image = "sc309.png";
                break;
            case 314:
                text = "What is it?";
                image = "sc309.png";
                break;
            case 315:
                text = "<html>Your former president warned you previously about the devastating Jewish control of capital and about<br/> a day that would come when it would enslave you; it has happened.</html>";
                image = "sc309.png";
                break;
            case 316:
                text = "What the fuck are you on about?";
                image = "sc309.png";
                break;
            case 317:
                text = "No, wait! Hear me out.";
                image = "sc309.png";
                break;
            case 318:
                text = "*Maybe that wasn't the best place to start*";
                image = "sc309.png";
                break;
            case 319:
                text = "*I guess I'll explain myself*";
                image = "sc309.png";
                break;
            case 320:
                text = "You guys know the government is just controlled by lobbyists and the wealthy?";
                image = "sc309.png";
                break;
            case 321:
                text = "I- I guess.";
                image = "sc309.png";
                break;
            case 322:
                text = "Well all of them really just want oil and other natural resources that help their businesses but cause other great problems in the world.";
                image = "sc309.png";
                break;
            case 323:
                text = "Sure.";
                image = "sc309.png";
                break;
            case 324:
                text = "Additionally, the United States has a tendency to try to spread its capitalist culture onto the rest of the world. Why shouldn't they?";
                image = "sc309.png";
                break;
            case 325:
                text = "<html>The investors make more money that way and the people get told that they're spreading Democracy, <br/>something they care quite deeply for, when the government itself doesn't actually care and will just assassinate foreign leaders and kill civilians to get what it wants.</html>";
                image = "sc309.png";
                break;
            case 326:
                text = "I suppose. That was the whole reason we had the Cold War, but it wasn't like we killed that many civilians.";
                image = "sc309.png";
                break;
            case 327:
                text = "Just keep listening. During and after the Cold War, the US has been exercising influence and control over the Middle East for years.";
                image = "sc309.png";
                break;
            case 328:
                text = "Out of this they get Saudi oil and an assurance that nobody who opposes their spread of capitalism will come to power AND they get to keep helping out their buddies in Israel.";
                image = "sc309.png";
                break;
            case 329:
                text = "<html>So what about the people who actually live in the Middle East? What would they think about America suddenly entering into every part of their lives as a <br/>foreign power with no claim to control or even enter the Holy Land?</html>";
                image = "sc309.png";
                break;
            case 330:
                text = "They're destroying Islam, the Islamic people, their culture, all of it!";
                image = "sc309.png";
                break;
            case 331:
                text = "They would probably hate America... but there isn't anything we can do about it. We don't control the government.";
                image = "sc309.png";
                break;
            case 332:
                text = "<html>But here's the thing, we can still send them a message. We can hit them where it hurts- cut out what drives their spread of capital: the money-making machine, <br/>and everyone who is a part of it.</html>";
                image = "sc309.png";
                break;
            case 333:
                text = "And what is that machine?";
                image = "sc309.png";
                break;
            case 334:
                text = "The World Trade Center.";
                image = "sc309.png";
                break;
            case 335:
                text = "You seem kind of crazy.";
                image = "sc309.png";
                break;
            case 336:
                text = "Yeah, I think I'm going to go report you to the authorities.";
                image = "sc309.png";
                break;
            case 337:
                text = "Did you not just hear me? You're the fucking problem!";
                image = "sc309.png";
                break;
            case 338:
                text = "You're the people who let the government get away with this!";
                image = "sc309.png";
                break;
            case 339:
                text = "You just love getting fucked in the ass by the government so much that you'll do anything for it!";
                image = "sc309.png";
                break;
            case 340:
                text = "This is your only chance to make change in the world! Come with me.";
                image = "sc309.png";
                break;
            case 341:
                text = "*Some of the students exchange looks and come to an agreement.*";
                image = "sc309.png";
                break;
            case 342:
                text = "We'll all fight back. Isn't that right Danny? *they turn to the dissenter and peer pressure him into joining*";
                image = "sc309.png";
                break;
            case 343:
                text = "God, that was so easy.";
                image = "sc343.png";
                break;
            case 344:
                text = "<html>I didn't even mention the suicide bombing or have to try to justify why we should kill innocent civilians who aren't even aware of what indirect harm they're causing <br/>abroad and never in their lives wanted the outcome that the government created.</html>";
                image = "sc343.png";
                break;
            case 345:
                text = "Time to go do a terrorist attack! Yipee~";
                image = "sc343.png";
                break;
            case 346:
                text = "*You gather some money between the volunteers and drive together to the airport with the tickets you so graciously got from the first group of terrorists.*";
                image = "sc343.png";
                break;
            case 347:
                text = "Two of the students are white, so I doubt they'll even question the name differences on the tickets lol.";
                image = "sc343.png";
                break;
            case 348:
                text = "Security'll just let them right through, even with their hidden knives.";
                image = "sc343.png";
                break;
            case 349:
                text = "This is a nice airport. There are so many nice people here. It would be a shame if all of their flights were about to get canceled.";
                image = "sc175.png";
                break;
            case 350:
                text = "*you approach security*"; //
                image = "sc175.png";
                break;
            case 351:
                text = "They let you through to the metal detector easily, barely even checking your bags. They would only be searching for bombs anyways.";
                image = "sc351.png";
                break;
            case 352:
                text = "It's not like there's anything else you can do on a plane... lol.";
                image = "sc351.png";
                break;
            case 353:
                text = "*beep beep beep*";
                image = "sc179.png";
                break;
            case 354:
                text = "Shit, it picked up on "+knifeName+".";
                image = "sc179.png";
                break;
            case 355:
                text = "What do you have here?";
                image = "sc179.png";
                break;
            case 356:
                text = "Hmm? Nothing. I don't know why it's going off.";
                image = "sc179.png";
                break;
            case 357:
                text = "Miss, we're going to have to pat you down.";
                image = "sc179.png";
                break;
            case 358:
                text = "Ok, go ahead.";
                image = "sc179.png";
                break;
            case 359:
                text = "You get patted down but they don't find "+knifeName+".";
                image = "sc179.png";
                break;
            case 360:
                text = "You hid him well (between your breasts). I'm sure he enjoys it.";
                image = "sc179.png";
                break;
            case 361:
                text = "*You're almost through security.*";
                image = "sc179.png";
                break;
            case 362:
                text = "So, where's you're destination?";
                image = "sc179.png";
                break;
            case 363:
                text = "Uhhh, shit, where was flight 11 supposed to go?";
                image = "sc179.png";
                break;
            case 364: //choice Los Angelos, Dallas
                text = "";

                btext1 = "Dallas";
                btext2 = "Los Angelos";

                image = "sc179.png";
                break;

            case 365: //Dallas path
                text = "Miss, I think we need to bring you aside and talk with you further.";
                image = "sc179.png";
                break;
            case 366:
                text = "Oh fuck.";
                image = "sc366.png";
                break;
            case 367:
                text = "*They pat you down again*";
                image = "sc366.png";
                break;
            case 368:
                text = "What's this knife?";
                image = "sc366.png";
                break;
            case 369:
                text = "It-its under 4 inches, it's allowed!";
                image = "sc369.png";
                break;
            case 370:
                text = "Why were you hiding it?";
                image = "sc369.png";
                break;
            case 371:
                text = "Uh, I don't know.";
                image = "sc369.png";
                break;
            case 372:
                text = "Miss, we're going to have to detain you.";
                image = "sc369.png";
                break;
            case 373:
                text = "*You and the students are detained and eventually imprisoned*";
                image = "sc369.png";
                break;
            case 374:
                text = "We got thrown into this stupid cage, and the other terrorists were all caught. The plan was a complete failure.";
                image = "sc200.png";
                break;
            case 375:
                text = "I bet Osama-kun fucking hates me right now. I couldn't live up to him.";
                image = "sc200.png";
                break;
            case 376:
                text = "*You slowly rot away in the cell, as war breaks out around you and the world goes to hell once more.*";
                image = "sc200.png";
                break;
            case 377:
                text = "...";
                image = "sc205.png";
                break;
            case 378:
                text = "...";
                image = "sc206.png";
                break;
            case 379:
                text = "...";
                image = "sc207.png";
                break; //bad ending (security & students)
            case 380: //LA path
                text = "OK, you can go through.";
                image = "sc179.png";
                break;
            case 381:
                text = "Sweet :3 We're in.";
                image = "sc179.png";
                break;
            case 382:
                text = "*You wait out until you can board your flight.*";
                image = "sc210.png";
                break;
            case 383:
                text = "...";
                image = "sc211.png";
                break;
            case 384:
                text = "...";
                image = "sc212.png";
                break;
            case 385:
                text = "I'm on and we're in the air. It's show time!";
                image = "sc213.png";
                break;
            case 386:
                text = "*You wait until the proper time and begin*";
                image = "sc214.png";
                break;
            case 387:
                text = "Let's go.";
                image = "sc387.png";
                break;
            case 388:
                text = "..."; //You get up and rush the cockpit with the students
                image = "sc388.png";
                break;
            case 389:
                text = "...";
                image = "sc389.png";
                break;
            case 390:
                text = "..."; //you and your crew kill the pilots
                image = "sc482.png";
                break;
            case 391:
                text = "The terrorist of kawaiiness prevails!";
                image = "sc483.png";
                break;
            case 392:
                text = "How about you guys wait outside and guard me while I fly the plane.";
                image = "sc483.png";
                break;
            case 393:
                text = "Sure.";
                image = "sc483.png";
                break;
            case 394:
                text = "I dont even know if they know what this mission truly is. Well, at least I know. That's all that matters.";
                image = "sc486.png";
                break;
            case 395:
                text = "*You turn off the transponder and steer the plane towards New York city while the others handle the passengers.*";
                image = "sc486.png";
                break;
            case 396:
                text = "...";
                image = "sc486.png";
                break;
            case 397:
                text = "It's finally time.";
                image = "sc489.png";
                break;
            case 398:
                text = "...";
                image = "sc489.png";
                break;
            case 399:
                text = "I'm going to die...";
                image = "sc489.png";
                break;
            case 400:
                text = "...";
                image = "sc492.png";
                break;
            case 401:
                text = "I really tried not to think about that before.";
                image = "sc493.png";
                break;
            case 402:
                text = "...";
                image = "sc494.png";
                break;
            case 403:
                text = "Oh fuck, so many are going to die.";
                image = "sc495.png";
                break;
            case 404:
                text = "...";
                image = "sc495.png";
                break;
            case 405:
                text = "None of them deserve this.";
                image = "sc495.png";
                break;
            case 406:
                text = "...";
                image = "sc498.png";
                break;
            case 407:
                text = "...";
                image = "sc498.png";
                break;
            case 408:
                text = "But it already happened in my original world. We eventually had peace.";
                image = "sc498.png";
                break;
            case 409:
                text = "...";
                image = "sc501.png";
                break;
            case 410:
                text = "That's why I'm doing this. Fuck fear, fuck all of the innocent people I'm about to slaughter.";
                image = "sc501.png";
                break;
            case 411:
                text = "...";
                image = "sc501.png";
                break;
            case 412:
                text = "This is my only path to peace.";
                image = "sc503.png";
                break;
            case 413:
                text = "...";
                image = "sc504.png";
                break;
            case 414:
                text = "Allahu Akbar!";
                image = "sc505.png";
                break;
            case 415:
                text = ""; //9/11 cutscene
                image = "ofc.png";
                break;
            case 416:
                text = "The End";
                image = "ofc2.png";
                break; //Good ending (9/11 & students)
            case 417: //convince path starts here (have father say LA for you)
                text = "Wait! Listen! I'm your daughter.";
                image = "sc417.png";
                break;
            case 418:
                text = "What?";
                image = "sc417.png";
                break;
            case 419:
                text = "I came from the future too, I can prove it.";
                image = "sc417.png";
                break;
            case 420:
                text = "How?";
                image = "sc417.png";
                break;
            case 421:
                text = "<html>I have money from the future, if we could test our DNA right now, it would show our relationship. And- I have a letter you wrote in the past about how the <br/>decision you're making right now is wrong. Here.</html>";
                image = "sc417.png";
                break;
            case 422:
                text = "*You hand your father the letter.*"; //you hand your father the letter
                image = "sc417.png";
                break;
            case 423:
                text = "..."; //he reads it
                image = "sc417.png";
                break;
            case 424:
                text = "S- so, if the attacks don't happen, a far worse war will break out later?";
                image = "sc417.png";
                break;
            case 425:
                text = "<html>Yes, I don't know how, but fucking with time ruined everything. Something about this attack must have united the world just enough that the lasting impact <br/>after the war on terror led us away from greater war later.</html>";
                image = "sc417.png";
                break;
            case 426:
                text = "Then I've made a grave mistake, I've already killed Atta and his team.";
                image = "sc417.png";
                break;
            case 427:
                text = "I have a backup plan.";
                image = "sc417.png";
                break;
            case 428:
                text = "What is it?";
                image = "sc417.png";
                break;
            case 429:
                text = "We have to do the attack ourselves. We'll save many more lives than we'll end. We have to do it.";
                image = "sc417.png";
                break;
            case 430:
                text = "You're sure?";
                image = "sc417.png";
                break;
            case 431:
                text = "Yes, I'm sure. At least that's the only option I can think of.";
                image = "sc417.png";
                break;
            case 432:
                text = "<html>It would be difficult to train another group of terrorists before tomorrow, and even then, they need a capable leader who can fly a plane. <br/>That would have to be me.</html>";
                image = "sc417.png";
                break;
            case 433:
                text = "You know how to fly?";
                image = "sc417.png";
                break;
            case 434:
                text = "Are you proud of me?";
                image = "sc417.png";
                break;
            case 435:
                text = "... Yes sweetie.";
                image = "sc417.png";
                break;
            case 436:
                text = "..."; //you blush and turn your head to the side
                image = "sc436.png";
                break;
            case 437:
                text = "I'm sorry that what I did led to an even worse world.";
                image = "sc436.png";
                break;
            case 438:
                text = "It- its OK. We're still here. We can still fix it, even if we have to die.";
                image = "sc436.png";
                break;
            case 439:
                text = "..."; //you recieve each other in a long embrace
                image = "sc439.png";
                break;
            case 440:
                text = "So how do we get to the airport? We should be ready for our flight early.";
                image = "sc439.png";
                break;
            case 441:
                text = "I've got some cash, I can buy us a taxi.";
                image = "sc439.png";
                break;
            case 442:
                text = "Aww, thank you.";
                image = "sc439.png";
                break;
            case 443:
                text = "*You get a taxi*";
                image = "sc436.png";
                break;
            case 444:
                text = "...";
                image = "sc444.png";
                break;
            case 445:
                text = "*The driver starts yapping*";
                image = "sc444.png";
                break;
            case 446:
                text = "What do you two think about Bush? I think he's a fucking retard!";
                image = "sc444.png";
                break;
            case 447:
                text = "Wh- what?";
                image = "sc444.png";
                break;
            case 448:
                text = "Just today- erm- I guess yesterday now, my buddy called me from outside the Pentagon and told me that a bunch of money just went missing.";
                image = "sc444.png";
                break;
            case 449:
                text = "..."; //you and your father exchange a look
                image = "sc444.png";
                break;
            case 450:
                text = "Oh, we're here.";
                image = "sc444.png";
                break;
            case 451:
                text = "Thanks for the ride.";
                image = "sc444.png";
                break;
            case 452:
                text = "Oh, and if you think that was crazy, turn on the TV at 8:50 this morning.";
                image = "sc444.png";
                break;
            case 453:
                text = "Huh?";
                image = "sc444.png";
                break;
            case 454:
                text = "Byebye!";
                image = "sc444.png";
                break;
            case 455: //path 2 w/ father, last end
                text = "This is a nice airport. There are so many nice people here. It would be a shame if all of their flights were about to get canceled.";
                image = "sc175.png";
                break;
            case 456:
                text = "*you approach security*"; 
                image = "sc175.png";
                break;
            case 457:
                text = "They let you through to the metal detector easily, barely even checking your bags. They would only be searching for bombs anyways.";
                image = "sc457.png";
                break;
            case 458:
                text = "It's not like there's anything else you can do on a plane... lol.";
                image = "sc457.png";
                break;
            case 459:
                text = "*beep beep beep*";
                image = "sc179.png";
                break;
            case 460:
                text = "Shit, it picked up on "+knifeName+".";
                image = "sc179.png";
                break;
            case 461:
                text = "What do you have here?";
                image = "sc179.png";
                break;
            case 462:
                text = "Hmm? Nothing. I don't know why it's going off.";
                image = "sc179.png";
                break;
            case 463:
                text = "Miss, we're going to have to pat you down.";
                image = "sc179.png";
                break;
            case 464:
                text = "Ok, go ahead.";
                image = "sc179.png";
                break;
            case 465:
                text = "You get patted down but they don't find "+knifeName+".";
                image = "sc179.png";
                break;
            case 466:
                text = "You hid him well (between your breasts). I'm sure he enjoys it.";
                image = "sc179.png";
                break;
            case 467:
                text = "*You're almost through security.*";
                image = "sc179.png";
                break;
            case 468:
                text = "So, where's you're destination?";
                image = "sc179.png";
                break;
            case 469:
                text = "Uhhh, shit, where was flight 11 supposed to go?";
                image = "sc179.png";
                break;
            case 470:
                text = "*Your father interjects from behind you*";
                image = "sc470.png";
                break;
            case 471:
                text = "We're heading to LA";
                image = "sc470.png";
                break;
            case 472:
                text = "OK, you can go through.";
                image = "sc470.png";
                break;
            case 473:
                text = "Sweet :3 We're in.";
                image = "sc473.png";
                break;
            case 474:
                text = "You wait out until you can board your flight.";
                image = "sc210.png";
                break;
            case 475:
                text = "...";
                image = "sc211.png";
                break;
            case 476:
                text = "...";
                image = "sc212.png";
                break;
            case 477:
                text = "I'm on and we're in the air. It's show time!";
                image = "sc213.png";
                break;
            case 478:
                text = "*You wait until the proper time and begin*";
                image = "sc214.png";
                break;
            case 479:
                text = "Let's go.";
                image = "sc479.png";
                break;
            case 480:
                text = "..."; //you get up and rush the cockpit with your father
                image = "sc480.png";
                break;
            case 481:
                text = "...";
                image = "sc481.png";
                break;
            case 482:
                text = "..."; //you and your father kill the pilots
                image = "sc482.png";
                break;
            case 483:
                text = "The terrorist of kawaiiness prevails!";
                image = "sc483.png";
                break;
            case 484:
                text = "How about you wait outside and guard me while I fly the plane.";
                image = "sc483.png";
                break;
            case 485:
                text = "Sure.";
                image = "sc483.png";
                break;
            case 486:
                text = "*You turn off the transponder and steer the plane towards New York city while your father handles the passengers.*";
                image = "sc486.png";
                break;
            case 487:
                text = "...";
                image = "sc486.png";
                break;
            case 488:
                text = "It's finally time.";
                image = "sc486.png";
                break;
            case 489:
                text = "...";
                image = "sc489.png";
                break;
            case 490:
                text = "I'm going to die...";
                image = "sc489.png";
                break;
            case 491:
                text = "...";
                image = "sc489.png";
                break;
            case 492:
                text = "I really tried not to think about that before.";
                image = "sc492.png";
                break;
            case 493:
                text = "...";
                image = "sc493.png";
                break;
            case 494:
                text = "Oh fuck, so many are going to die.";
                image = "sc494.png";
                break;
            case 495:
                text = "...";
                image = "sc495.png";
                break;
            case 496:
                text = "None of them deserve this.";
                image = "sc495.png";
                break;
            case 497:
                text = "...";
                image = "sc495.png";
                break;
            case 498:
                text = "...";
                image = "sc498.png";
                break;
            case 499:
                text = "But it already happened in my original world. We eventually had peace.";
                image = "sc498.png";
                break;
            case 500:
                text = "...";
                image = "sc498.png";
                break;
            case 501:
                text = "That's why I'm doing this. Fuck fear, fuck all of the innocent people I'm about to slaughter.";
                image = "sc501.png";
                break;
            case 502:
                text = "...";
                image = "sc501.png";
                break;
            case 503:
                text = "This is my only path to peace.";
                image = "sc503.png";
                break;
            case 504:
                text = "...";
                image = "sc504.png";
                break;
            case 505:
                text = "Allahu Akbar!";
                image = "sc505.png";
                break;
            case 506:
                text = ""; //9/11 cutscene
                image = "ofc.png";
                break;
            case 507:
                text = "The End";
                image = "ofc2.png";
                break; //good ending (9/11 & father)
        }

    }

    public void choice1(){ //occurs on screen 7
        if (choice == 0){
            screen = 8;
            advance();
        } else if (choice == 1){
            screen = 9;
            advance();
        } 
    }

    public void choice2(){ //occurs on (screen it occurs on lmao)
        if (choice == 0){
            screen = 24;//replace w/ actual screens
            advance();
        } else if (choice == 1){
            screen = 33;//replace w/ actual screens
            advance();
        } //could do anywhere from 2-4 buttons with some more programming, will start simple though
    }

    public void choice3(){ //occurs on (screen it occurs on lmao)
        if (choice == 0){
            screen = 59;//replace w/ actual screens
            knifeName = "Knifey";
            advance();
        } else if (choice == 1){
            screen = 59;//replace w/ actual screens
            knifeName = "Swiss Cheese";
            advance();
        } //could do anywhere from 2-4 buttons with some more programming, will start simple though
    }

    public void choice4(){ 
        if (choice == 0){
            screen = 70;
            advance();
        } else if (choice == 1){
            screen = 86;
            advance();
        } 
    }

    public void choice5(){ 
        if (choice == 0){
            screen = 160;
            advance();
        } else if (choice == 1){
            screen = 244; //wherever not taking the shot path begins
            advance();
        } 
    }

    public void choice6(){ 
        if (choice == 0){
            screen = 191; //Dallas path
            advance();
        } else if (choice == 1){
            screen = 208; //LA path
            advance();
        } 
    }

    public void choice7(){ 
        if (choice == 0){
            screen = 279; //Shoot path
            advance();
        } else if (choice == 1){
            screen = 417; //Convince path
            advance();
        } 
    }

    public void choice8(){ 
        if (choice == 0){
            screen = 281; //foot path
            advance();
        } else if (choice == 1){
            screen = 289; //head path
            advance();
        } 
    }

    public void choice9(){ 
        if (choice == 0){
            screen = 365; //dallas
            advance();
        } else if (choice == 1){
            screen = 380; //LA
            advance();
        } 
    }

}

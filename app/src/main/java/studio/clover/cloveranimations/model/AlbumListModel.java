package studio.clover.cloveranimations.model;

import java.util.ArrayList;
import java.util.List;

import studio.clover.cloveranimations.R;

public class AlbumListModel {

    private List<Album> albumList = new ArrayList<>();

    public void setAlbumList() {
        this.albumList.add(new Album("Number of the beast", "Iron Maiden", R.drawable.beast, "3:50", "Run to the Hills", "White man came across the sea\n" +
                "He brought us pain and misery\n" +
                "He killed our tribes killed our creed\n" +
                "He took our game for his own need\n" +
                "We fought him hard we fought him well\n" +
                "Out on the plains we gave him hell\n" +
                "But many came too much for Cree\n" +
                "Oh will we ever be set free?\n" +
                "Riding through dust clouds and barren wastes\n" +
                "Galloping hard on the plains\n" +
                "Chasing the redskins back to their holes\n" +
                "Fighting them at their own game\n" +
                "Murder for freedom the stab in the back\n" +
                "Women and children are cowards attack\n" +
                "Run to the hills, run for your lives\n" +
                "Run to the hills, run for your lives"));
        this.albumList.add(new Album("Americana", "The Offspring", R.drawable.americana, "2:13", "Staring at the Sun", "Maybe life is like a ride on a freeway\n" +
                "Dodging bullets while you're trying to find your way\n" +
                "Everyone's around, but no one does a damn thing\n" +
                "It brings me down, but I won't let them\n" +
                "If I seem bleak\n" +
                "Well you'd be correct\n" +
                "And if I don't speak\n" +
                "It's cause I can't disconnect\n" +
                "But I won't be burned by the reflection\n" +
                "Of the fire in your eyes\n" +
                "As you're staring at the sun\n" +
                "When I ran I didn't feel like a runaway\n" +
                "When I escaped I didn't feel like I got away\n" +
                "There's more to living than only surviving\n" +
                "Maybe I'm not there, but I'm still trying\n" +
                "Though you hear me\n" +
                "I don't think that you relate\n" +
                "My will is something\n" +
                "That you can't confiscate\n" +
                "So forgive me, but I won't be frustrated\n" +
                "By destruction in your eyes\n" +
                "As you're staring at the sun"));
        this.albumList.add(new Album("Rust In Peace", "Megadeth", R.drawable.rust_in_peace, "6:36", "Holy Wars", "Brother will kill brother\n" +
                "Spilling blood across the land\n" +
                "Killing for religion\n" +
                "Something I don't understand\n" +
                "\n" +
                "Fools like me who cross the sea\n" +
                "And come to foreign lands\n" +
                "Ask the sheep for their beliefs\n" +
                "Do you kill on God's command?\n" +
                "\n" +
                "A country that's divided\n" +
                "Surely will not stand\n" +
                "My past erased, no more disgrace\n" +
                "No foolish naive stand\n" +
                "\n" +
                "The end is near, it's crystal clear\n" +
                "Part of the master plan\n" +
                "Don't look now to Israel\n" +
                "It might be your homelands\n" +
                "Holy wars"));
        this.albumList.add(new Album("Ride the lightning", "Metallica", R.drawable.ride, "6:36", "Creeping Death", "Slaves\n" +
                "Hebrews born to serve, to the pharaoh\n" +
                "Heed\n" +
                "To his every word, live in fear\n" +
                "Faith\n" +
                "Of the unknown one, the deliverer\n" +
                "Wait\n" +
                "Something must be done, four hundred years\n" +
                "So let it be written\n" +
                "So let it be done\n" +
                "I'm sent here by the chosen one\n" +
                "So let it be written\n" +
                "So let it be done\n" +
                "To kill the first born pharaoh son\n" +
                "I'm creeping death\n" +
                "Now\n" +
                "Let my people go, land of Goshen\n" +
                "Go\n" +
                "I will be with thee, bush of fire\n" +
                "Blood\n" +
                "Running red and strong, down the Nile\n" +
                "Plague\n" +
                "Darkness three days long, hail to fire\n" +
                "So let it be written\n" +
                "So let it be done\n" +
                "I'm sent here by the chosen one\n" +
                "So let it be written\n" +
                "So let it be done\n" +
                "To kill the first born pharaoh son\n" +
                "I'm creeping death\n"));
        this.albumList.add(new Album("Significant Other", "Limp Bizkit", R.drawable.significant_other, "4:49", "Nookie", "I came into this world as a reject\n" +
                "Look into these eyes\n" +
                "Then you'll see the size of these flames\n" +
                "Dwellin on the past\n" +
                "Its burnin' up my brain\n" +
                "Everyone that burns has to learn from the pain\n" +
                "Hey I think about the day\n" +
                "My girlie ran away with my pay\n" +
                "When fellas come to play\n" +
                "No she stuck with my homeez that she fucked\n" +
                "And I'm just a sucker with a lump in my throat\n" +
                "Hey, like a chump\n" +
                "Should I be feelin' bad? No\n" +
                "Should I be feelin good? No\n" +
                "Its kinda sad I'm the laughin' stock of the neighborhood\n" +
                "You would think that I'd be movin' on\n" +
                "But I'm a sucker like I said\n" +
                "Fucked up in the head, not!!\n" +
                "Maybe she just made a mistake\n" +
                "I should give her a break\n" +
                "My heart will ache either way\n" +
                "Hey, what the hell\n" +
                "Watcha want me to say\n" +
                "I wont lie that I cant deny"));
    }

    public List<Album> getAlbumList() {
        return this.albumList;
    }
}

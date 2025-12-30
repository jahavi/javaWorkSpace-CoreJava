package ObjectAndConstructorPrograms;
class MusicLibrary {

    String[] songs = new String[5];
    int count = 0;

    void addSong(String songName) {
        if (count < songs.length) {
            songs[count] = songName;
            count++;
            System.out.println("Song Added: " + songName);
        } else {
            System.out.println("Music Library Full");
        }
    }

    void removeSong(String songName) {
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (songs[i].equals(songName)) {
                found = true;

                for (int j = i; j < count - 1; j++) {
                    songs[j] = songs[j + 1];
                }

                songs[count - 1] = null;
                count--;

                System.out.println("Song Removed: " + songName);
                break;
            }
        }

        if (!found) {
            System.out.println("Song Not Found");
        }
    }

    void playRandomSong() {
        if (count == 0) {
            System.out.println("No songs to play");
            return;
        }

        int index = (int)(Math.random() * count);
        System.out.println("Playing: " + songs[index]);
    }

    void displaySongs() {
        if (count == 0) {
            System.out.println("No Songs in Library");
        } else {
            System.out.println("Songs:");
            for (int i = 0; i < count; i++) {
                System.out.println(songs[i]);
            }
        }
    }
}

public class MusicLibraryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicLibrary ml = new MusicLibrary();

        ml.addSong("Song A");
        ml.addSong("Song B");
        ml.addSong("Song C");

        ml.displaySongs();

        ml.playRandomSong();

        ml.removeSong("Song B");

        ml.displaySongs();

        ml.playRandomSong();
	}

}

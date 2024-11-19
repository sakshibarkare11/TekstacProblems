package song.com;

import java.util.*;
 
class SongInfo {
    // Set to store song details in the format "songTitle:views"
    private Set<String> songSet = new HashSet<>();
 
    // Method to add song details to the set
    public void addSong(String songDetails) {
       songSet.add(songDetails);
    }
 
    // Method to find the views for a given song title
    public int findTheViewsForGivenSongTitle(String songTitle) {
//    	for(String s : songSet) {
//    		String[] d 
//    	}
    	
        for (String songDetail : songSet) {
            String[] details = songDetail.split(":");
            if (details[0].equals(songTitle)) {
                return Integer.parseInt(details[1]);
            }
        }
        return -1; // Return -1 if the song is not found
    }
 
    // Method to find the songs with the highest views
    public List<String> findTheSongsWithHighestViews() {
        int maxViews = -1;
        List<String> highestViewedSongs = new ArrayList<>();
 
        // Loop through the set to find the maximum views
        for (String songDetail : songSet) {
            String[] details = songDetail.split(":");
            int views = Integer.parseInt(details[1]);
 
            if (views > maxViews) {
                maxViews = views;
                highestViewedSongs.clear();
                highestViewedSongs.add(details[0]);
            } else if (views == maxViews) {
                highestViewedSongs.add(details[0]);
            }
        }
        return highestViewedSongs;
    }
}
 
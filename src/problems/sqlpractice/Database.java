package problems.sqlpractice;

import java.sql.*;

public class Database {
    public static void connect(){
        var url = "jdbc:sqlite:/Users/marissaaragon/IdeaProjects/javajourney/src/problems/sqlpractice/Chinook_Sqlite.sqlite";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT AlbumId, Title, ArtistId FROM Album")) {

            System.out.println("AlbumId | Title | ArtistId");
            System.out.println("-------------------------------");

            while (rs.next()) {
                int albumId = rs.getInt("AlbumId");
                String title = rs.getString("Title");
                int artistId = rs.getInt("ArtistId");

                System.out.println(albumId + " | " + title + " | " + artistId);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        connect();

    }
}

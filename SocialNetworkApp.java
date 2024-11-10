public class SocialNetworkApp {
    public static void main(String[] args) {
        Network network = new Network();

        User user1 = new User("Alice");
        User user2 = new User("Bob");

        network.addUser(user1);
        network.addUser(user2);

        MessagePost messagePost = new MessagePost("Alice", "Hello, this is my first post!");
        PhotoPost photoPost = new PhotoPost("Bob", "https://example.com/image.jpg", "Beautiful scenery!");

        user1.addPost(messagePost);
        user2.addPost(photoPost);

        network.addPost(messagePost);
        network.addPost(photoPost);

        user2.likePost(messagePost);

        network.displayPosts();
    }
}

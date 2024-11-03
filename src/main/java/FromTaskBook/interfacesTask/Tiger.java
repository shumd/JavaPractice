package FromTaskBook.interfacesTask;

public class Tiger implements Meowable{
    @Override
    public void meow() {
        System.out.println("Hello I`m tiger :)\n" +
                "⠄⠄⠄⠄⣠⣤⣤⣄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⣤⣤⣤⠄\n" +
                "⠄⠄⠄⢰⣿⡿⠿⠿⣷⣄⡀⠄⣀⡤⠤⠶⢤⣤⣤⣤⣤⣤⡤⠴⠦⢤⣀⡀⠄⣠⣴⠿⠿⢿⣿⡇\n" +
                "⠄⠄⠄⢸⣿⣧⣀⣀⣀⠉⠛⢋⣩⣴⠶⠶⣶⣾⣿⣿⣿⣷⣶⡶⠶⢶⣬⡉⠛⠉⢀⣀⣀⣠⣿⣷\n" +
                "⠄⠄⠄⢸⣿⣿⠋⠉⠉⣤⣴⡟⠁⣠⣤⣤⣶⣿⣿⣿⣿⣿⣶⣦⣤⣄⡈⠻⣦⣤⡈⠉⠙⢿⣿⡏\n" +
                "⠄⠄⠄⠘⣿⡇⠄⠄⣴⡿⠋⣰⠟⠛⠉⠉⢉⣻⣿⣿⣿⣟⡋⠉⠉⠙⠻⢦⡈⠻⣷⡀⠄⠄⣿⡇\n" +
                "⠄⠄⠄⠄⢸⠄⠐⠚⠉⠄⠐⠁⣠⣶⡶⠿⠿⢿⣿⣿⣿⡿⠿⠿⢷⣶⣤⡀⠁⠄⠈⠙⠒⠄⣿\n" +
                "⠄⠄⠄⣠⠈⠄⡠⠄⣴⣆⠄⢸⠋⣁⣤⣶⣶⠿⣿⣿⣿⡿⣷⣶⣤⣌⡉⢿⠄⢠⣶⡀⠠⡀⠘⢠\n" +
                "⠄⣀⣴⡏⠄⣾⠁⣼⣿⣿⡀⠈⠄⠻⢯⡀⢀⣼⣿⣿⣿⣷⡀⠄⣼⠿⠁⠈⠄⣸⣿⣿⡀⢹⡀⢸⣷⣄\n" +
                "⠙⢿⣿⠇⢰⡏⢸⡿⠁⠙⠷⣶⠶⢶⢤⡁⢸⣿⠃⣿⡏⢿⡿⠄⡤⣴⠶⢶⡾⠟⠄⢹⣇⠘⣷⠈⢿⣿⠟\n" +
                "⣴⣾⡟⠄⢸⡇⢸⡇⢰⠰⣦⣀⠠⣈⣠⣿⡀⢻⠄⣿⡇⢸⠁⣾⣧⣀⠴⢀⣴⡆⣷⠸⣿⠄⣿⠄⠘⣿⣦⣄\n" +
                "⣻⡿⠄⠄⢸⣧⢸⡇⢿⡀⢯⡉⠳⣦⠉⢻⣧⠈⠄⣿⠄⠄⢰⣿⠉⣱⡶⢋⡽⠃⣿⢀⡏⢰⣿⠄⠄⠹⣿⠋\n" +
                "⣿⠁⠄⠰⣿⣿⡄⢣⠸⣷⡄⢹⡄⢸⡇⢸⡇⠄⠄⢻⠄⠄⠘⡇⠄⡏⠄⣿⢁⣼⡟⠸⢁⣾⣿⡧⠄⠄⢿⣧\n" +
                "⣿⣶⣦⠄⠈⣿⣿⣄⠄⢻⣷⠄⣀⡾⠃⠸⡇⠄⠄⠘⠄⠄⠄⡇⠄⠻⣄⠃⣸⣿⠁⢀⣾⣿⠋⠄⢠⣶⣾⣿\n" +
                "⠁⣾⠏⠄⠄⠿⠿⣿⣦⠄⢻⣿⠋⠄⠄⠄⠇⠄⠄⠄⠄⠄⠄⠃⠄⠄⠙⣿⡿⠁⣠⣿⠿⠿⠄⠄⠈⣿⡀⠹\n" +
                "⠄⣿⢀⣀⣀⣀⠄⠄⣿⣷⣄⡙⣷⣄⠄⠄⠲⣦⣄⣀⣀⣤⡶⠄⠄⣀⣴⡟⣡⣼⣿⠁⠄⣀⣀⣀⡀⣿⡇\n" +
                "⠄⣿⡿⠛⠉⣿⡇⠄⠉⠉⠙⠻⣿⣟⠛⠒⠦⠝⢿⣿⡿⠋⠤⠖⠛⢻⣿⡿⠋⠉⠉⠂⠄⣿⠉⠙⢿⣿⡇\n" +
                "⠄⠛⠄⠄⠄⣿⣷⡿⠟⣿⠁⠄⠈⠻⣗⠢⠤⠤⠄⣿⡀⠠⠤⠴⢺⡿⠋⠄⠄⣻⡟⠿⣷⣿⠄⠄⠄⠙⠄\n" +
                "⠄⠄⠄⠄⠄⠻⠁⠄⠄⣿⣷⡿⠷⠶⢮⣉⠒⠒⠚⠋⠛⠒⠒⢊⣥⠶⠾⠿⣷⣿⡇⠄⠈⠻\n" +
                "⠄⠄⠄⠄⠄⠄⠄⠄⠄⠻⠃⠄⠄⠄⠄⠙⠷⣦⣀⣀⣀⣤⡶⠋⠁⠄⠄⠄⠈⠿\n" +
                "⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠉⠉");
    }
}
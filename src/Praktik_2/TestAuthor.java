package Praktik_2;

class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Чак Палланик","Palanik.chak@mail.ru",'M');

        String name = author.get_name();
        String email = author.get_email();
        char gender = author.get_gender();

        System.out.println(name +" "+"("+gender + ")" + " " + "at" +" "+ email + "\n");

        author.set_email("Сhak.Palan1k@mail.ru");
        String author_info = author.toString();

        System.out.println(author_info);


    }
}

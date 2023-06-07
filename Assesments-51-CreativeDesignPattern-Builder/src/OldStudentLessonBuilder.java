public class OldStudentLessonBuilder extends LessonBuilder{
    @Override
    public void getLesson() {
        lesson = new Lesson();
        lesson.id = 1;
        lesson.name = "Artificial Intelligence -  Beginner to Advanced in 10 Minute.";
        lesson.price = 49.99;
    }

    @Override
    public void applyDiscount() {
        lesson.discountedPrice = lesson.price;
        lesson.discountApplied = false;
    }

    @Override
    public void addLessonNode() {
        lesson.lessonNote = "";

    }

    @Override
    public Lesson getResult() {
        return lesson;
    }
}

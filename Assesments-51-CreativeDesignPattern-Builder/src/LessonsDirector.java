public class LessonsDirector {
    private LessonBuilder lessonBuilder;
    public LessonsDirector(LessonBuilder lessonBuilder){
        this.lessonBuilder=lessonBuilder;

    }
    public void make(){
        lessonBuilder.getLesson();
        lessonBuilder.applyDiscount();
        lessonBuilder.addLessonNode();
    }
}

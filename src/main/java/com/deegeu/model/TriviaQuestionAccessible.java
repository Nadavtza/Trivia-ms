public interface TriviaQuestionAccessible {
    TriviaQuestion getQuestionByIndex(long index);
    TriviaQuestion getQuestionById(long id);
    TriviaQuestion getRandomQuestion();
    List<TriviaQuestion> getQuestionList(long offset);
    List<TriviaQuestion> getSpecifiedQuestionList(long... id);
    long getQuestionListSize();
}

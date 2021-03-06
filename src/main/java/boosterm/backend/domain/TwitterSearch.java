package boosterm.backend.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TwitterSearch implements Search {

    private String term;

    private String language;

    private CustomDuration timeLimit;

    public TwitterSearch(String term, String language, CustomDuration timeLimit) {
        this.term = term;
        this.language = language;
        this.timeLimit = timeLimit;
    }

    public String getTerm() {
        return term;
    }

    public String getLanguage() {
        return language;
    }

    public CustomDuration getTimeLimit() {
        return timeLimit;
    }

    public LocalDateTime sinceDate(LocalDateTime now) {
        return now.minus(timeLimit.getAmount(), timeLimit.getUnit());
    }

    public LocalDate sinceDate(LocalDate now) {
        return now.minus(timeLimit.getAmount(), timeLimit.getUnit());
    }

}

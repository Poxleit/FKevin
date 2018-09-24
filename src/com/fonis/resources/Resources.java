package com.fonis.resources;

import com.fonis.entities.ClosedQuestion;
import com.fonis.entities.OpenQuestion;
import com.fonis.entities.Participant;

public class Resources {

    // #TODO set this to the location the application is running from, dynamically
    public static String APP_LOCATION = "";

    public static final String DATA_LOCATION = APP_LOCATION + "data/";
    public static final String DATA_BACKUP_LOCATION = DATA_LOCATION + "backup/";

    // Entity names
    public enum Entities{
        PARTICIPANT("Participants", "email", "Participants.json", Participant.class),
        OPEN_QUESTION("OpenQuestions", "questionText", "Questions.json", OpenQuestion.class),
        CLOSED_QUESTION("ClosedQuestions", "questionText", "Questions.json", ClosedQuestion.class);

        private final String entityName;
        private final String identifyingAttribute;
        private final String jsonFileName;
        private final Class entityClass;

        Entities(String entityName, String identifyingAttribtue, String jsonFieName, Class entityClass){
            this.entityName = entityName;
            this.identifyingAttribute = identifyingAttribtue;
            this.jsonFileName = jsonFieName;
            this.entityClass = entityClass;
        }

        public String getEntityName(){
            return this.entityName;
        }

        public String getIdentifyingAttribute(){
            return this.identifyingAttribute;
        }

        public String getEntityJsonFileName(){
            return this.jsonFileName;
        }

        public Class getEntityClass(){
            return this.entityClass;
        }


        @Override
        public String toString() {
            return this.entityClass.getSimpleName();
        }
    }

    private static int lowQuestionPoints=1;
    private static int mediumQuestionPoints=3;
    private static int highQuestionPoints=5;

    public enum QuestionDifficulty {
        LOW (lowQuestionPoints),
        MEDIUM (mediumQuestionPoints),
        HIGH (highQuestionPoints);

        private final int points;

        QuestionDifficulty(int points){
            this.points = points;
        }

        public int getPoints(){
            return this.points;
        }
    }

    // #TODO to be removed together with Question class
    @Deprecated
    public enum EntityType{
        Question, Pariticipant
    }
}

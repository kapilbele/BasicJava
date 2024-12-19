package org.basic.practiceAdvance;

public class Marriage
{
    public void checkAge(int age) throws InvalidMarriageException {
        if (age>=21)
        {
            System.out.println("Get first job and then get married");
        }
        else
        {
         throw new InvalidMarriageException("Go And Die");
        }

    }
}
